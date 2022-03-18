package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("15944fc8-4af0-44dc-af63-647c6842cac8")
public class MeasurementPropertyPage<T extends Measurement> extends FeatureClassPropertyPage<T> {
    @objid ("93d6b2aa-e2ee-481a-9471-7f78c0e08926")
    private List<ModelElement> _eventInstance = null;

    @objid ("110a02e4-a4f5-488d-bfbe-335ee081a3f8")
    private List<ModelElement> _metricInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a3715c1b-ebd0-47c1-8349-b071e4a25a85")
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
            Instance elt = (Instance) getModelElt(CamelDesignerAbstractProxy.getEventInstances(), value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, EventInstance.STEREOTYPE_NAME)) {
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
    @objid ("238d5db5-5355-4a75-9d39-bf4f1f72162a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Value", getNotNull(this._element.getValue()));
        table.addProperty("Measurement Time", getNotNull(this._element.getMeasurementTime()));
        
        // Event Instance
        this._eventInstance = CamelDesignerAbstractProxy.getEventInstances();
        table.addProperty("Event Instance", getCamelName(this._element.getEventInstance()), getCamelNames(this._eventInstance));
        
        // Metric Instance
        this._metricInstance = MetricInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Metric Instance", getCamelName(this._element.getMetricInstance()), getCamelNames(this._metricInstance));
    }

    @objid ("c026a929-67a6-4ebd-8fd6-594ff7eb56cf")
    public MeasurementPropertyPage(T elt) {
        super(elt);
    }

}
