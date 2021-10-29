package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.DataType;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class MetricTemplatePropertyPage<T extends MetricTemplate> extends FeaturePropertyPage<T> {


    private List<ModelElement> _valueType = null;

    private List<ModelElement> _unit = null;

    private List<ModelElement> _attribute = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1){
            DataType elt = (DataType) getModelElt(this._valueType, value);
            if (ValueType.canInstantiate(elt)) {
                this._element.setValueType(ValueType.instantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            DataType elt = (DataType) getModelElt(this._unit, value);
            if (Unit.canInstantiate(elt)) {
                this._element.setUnit(Unit.instantiate(elt));
            }
        }

        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._attribute, value);
            if (MeasurableAttribute.canInstantiate(elt)) {
                this._element.setAttribute(MeasurableAttribute.safeInstantiate(elt));
            }
        }
        else if(this._currentRow == 4){
            this._element.setValueDirection(value);;

        }
        
        this._currentRow -= 4;

    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Value Type
        this._valueType = CamelDesignerAbstractProxy.getValueTypes();
        table.addProperty("Value Type", getCamelName(this._element.getValueType()), getCamelNames(this._valueType));

        //Unit
        this._unit = CamelDesignerAbstractProxy.getUnits();
        table.addProperty("Unit", getCamelName(this._element.getUnit()), getCamelNames(this._unit));

        //Attribute
        this._attribute = MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Attribute", getCamelName(this._element.getAttribute()), getCamelNames(this._attribute));
        
        //Value Direction
        table.addProperty("Attribute",getValue(this._element.getValueDirection()));

        
    
    }

    public MetricTemplatePropertyPage(T elt) {
        super(elt);
    }

}
