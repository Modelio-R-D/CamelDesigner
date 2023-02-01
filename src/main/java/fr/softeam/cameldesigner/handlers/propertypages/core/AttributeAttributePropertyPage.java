package fr.softeam.cameldesigner.handlers.propertypages.core;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.utils.PrimitiveTypeUtils;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("810b6f62-535c-4054-98b1-14ebe81ae551")
public class AttributeAttributePropertyPage<T extends AttributeAttribute> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("3d495f5b-f65b-46cb-828d-a0dfb961237c")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setValue(value);
        }
        else if(this._currentRow == 2){
            if (value.equals(" ")) {
                this._element.getElement().setType(null);
            }else {
                if (PrimitiveTypeUtils.isPrimitiveType(value)) {
                   this._element.getElement().setType(PrimitiveTypeUtils.getDataType(value));
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
        
        else if(this._currentRow == 4){
            this._element.setMinValue(value);
        
        }
        else if(this._currentRow == 5){
            this._element.setMaxValue(value);
        }
        else if(this._currentRow == 6){
            this._element.setMinInclusive(Boolean.valueOf(value));   
        }
        else if(this._currentRow == 7){
            this._element.setMaxInclusive(Boolean.valueOf(value));  
        }
        this._currentRow -= 7;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("8d2b7d42-ea9d-415a-90c6-2c115bdbfb08")
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
        }else if (PrimitiveTypeUtils.isPrimitiveType(this._element.getElement().getType())) {
            value = PrimitiveTypeUtils.getLabel((DataType)this._element.getElement().getType());
        }
        table.addProperty("ValueType", value, getValueType());
        
        //Unit
        value = "";
        Unit unit = this._element.getUnit();
        if (unit != null) {
            value = getCamelName(unit.getElement());
        }
        table.addProperty("Unit", value, getCamelNames(CamelDesignerAbstractProxy.getUnits()));
            
        table.addProperty("Min Value", getNotNull(this._element.getMinValue()));
        table.addProperty("Max Value", getNotNull(this._element.getMaxValue()));
        table.addProperty("Min Inclusive", this._element.isMinInclusive());
        table.addProperty("Max Inclusive", this._element.isMaxInclusive());
    }

    @objid ("7845573e-61c1-45d8-b8b6-1826903ef6d0")
    public AttributeAttributePropertyPage(T elt) {
        super(elt);
    }

    @objid ("cb5cb91b-179e-42d6-bccb-24fdd475f5ef")
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
