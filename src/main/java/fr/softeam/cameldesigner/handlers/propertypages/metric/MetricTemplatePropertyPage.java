package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("824d1f73-086b-40df-9459-30a3fb6d61a2")
public class MetricTemplatePropertyPage<T extends MetricTemplate> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f17c9231-581d-412e-b401-cd88afe0fabb")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getValueTypes(), value);
            if (ValueType.canInstantiate(elt)) {
                this._element.setValueType(ValueType.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            DataType elt = (DataType) getModelElt(CamelDesignerAbstractProxy.getUnits(), value);
            if (Unit.canInstantiate(elt)) {
                this._element.setUnit(Unit.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (MeasurableAttribute.canInstantiate(elt)) {
                this._element.setAttribute(MeasurableAttribute.safeInstantiate(elt));
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
    @objid ("5a232b9b-6861-4059-a923-857f19e7b3f3")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Value Type
        table.addProperty("Value Type", getCamelName(this._element.getValueType()), getCamelNames(CamelDesignerAbstractProxy.getValueTypes()));
        
        //Unit
        table.addProperty("Unit", getCamelName(this._element.getUnit()), getCamelNames(CamelDesignerAbstractProxy.getUnits()));
        
        //Attribute
        table.addProperty("Attribute", getCamelName(this._element.getAttribute()), getCamelNames(MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("bc48d3fa-ff5c-443f-9f72-489e1f90c599")
    public MetricTemplatePropertyPage(T elt) {
        super(elt);
    }

}
