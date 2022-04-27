package fr.softeam.cameldesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.utils.PrimitiveTypeUtils;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("935a3286-88b3-4606-bb1f-6cbaa81c965e")
public class AttributeClassPropertyPage<T extends AttributeClass> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f75a8e88-8bcb-462f-9510-b68d324616b6")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setValue(value);
        }
        else if(this._currentRow == 2){
            if (value.equals(" ")) {
                this._element.setValueType(null);
            }else {
                if (PrimitiveTypeUtils.isPrimitiveType(value)) {
                    this._element.setPrimitiveType(PrimitiveTypeUtils.getDataType(value));
                }else{
                    DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getValueTypes(), value);
                    if (ValueType.canInstantiate(elt)) {
                        this._element.setValueType(ValueType.instantiate(elt));
                    }
                }
            }
        }
        else if(this._currentRow == 3){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getUnits(), value);
            if (Unit.canInstantiate(elt)) {
                this._element.setUnit(Unit.instantiate(elt));
            }
        }
        
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("45aa53bb-d8f3-443f-a808-12cff1c49a2f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Value
        table.addProperty("Value", getNotNull(this._element.getValue()));
        
        
        //ValueType
        String value = "";
        ValueType type = this._element.getValueType();
        if (type != null) {
            value = getCamelName(type.getElement());
        }else {
            DataType primitive = this._element.getPrimitiveType();
            if  ((primitive != null) &&(PrimitiveTypeUtils.isPrimitiveType(primitive))) {
                value = PrimitiveTypeUtils.getLabel(primitive);
            }
        }
        table.addProperty("ValueType", value, getValueType());
        
        //Unit
        value = "";
        Unit unit = this._element.getUnit();
        if (unit != null) {
            value = getCamelName(unit.getElement());
        }
        table.addProperty("Unit", value, getCamelNames(CamelDesignerAbstractProxy.getUnits()));
    }

    @objid ("846de64a-c560-4d83-8c06-bdfa262d8502")
    public AttributeClassPropertyPage(T elt) {
        super(elt);
    }

    @objid ("b8991e6a-1bea-44fe-b675-1c959989acba")
    private String[] getValueType() {
        List<String> result = new ArrayList<>();
        result.add(" ");
        
        //primitiveType
        result.addAll(PrimitiveTypeUtils.getPrimitiveType());
        
        List<ModelElement> valueTypes = CamelDesignerAbstractProxy.getValueTypes();
        for (ModelElement elt : valueTypes) {
            result.add(getCamelName(elt));
        }
        return result.toArray(new String[result.size()]);
    }

}
