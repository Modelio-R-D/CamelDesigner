package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;

import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;

public class MeasurementPropertyPage<T extends Measurement> extends FeatureClassPropertyPage<T> {
    
    private List<ModelElement> _eventInstance = null;

    private List<ModelElement> _metricInstance = null;

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
        	this._element.setValue(value);
        }

        else if(this._currentRow == 2){
        	this._element.setMeasurementTime(value);

        }
        
        else if(this._currentRow == 3){
        	Instance elt = (Instance) getModelElt(this._eventInstance, value);
            if (EventInstance.canInstantiate(elt)) {
                this._element.setEventInstance((EventInstance) EventInstance.instantiate(elt));
            }
        }


        else if(this._currentRow == 4){
            Instance elt = (Instance) getModelElt(this._metricInstance, value);
            if (MetricInstance.canInstantiate(elt)) {
                this._element.setMetricInstance(MetricInstance.safeInstantiate(elt));
            }
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
        
        table.addProperty("Value", getValue(this._element.getValue()));
        table.addProperty("Measurement Time", getValue(this._element.getMeasurementTime()));
        
        // Event Instance
        this._eventInstance = EventInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Event Instance", getCamelName(this._element.getEventInstance()), getCamelNames(this._eventInstance));

        // Metric Instance
        this._metricInstance = MetricInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Metric Instance", getCamelName(this._element.getMetricInstance()), getCamelNames(this._metricInstance));


    }

    public MeasurementPropertyPage(T elt) {
        super(elt);
    }

}
