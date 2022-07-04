package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("6a4c14d3-42f9-426f-8b3f-9f8089a890b8")
public class EventConfigurationPropertyPage<T extends EventConfiguration> extends FeaturePropertyPage<T> {
    @objid ("50319329-62eb-45f3-b4da-cc76abfbbc5e")
    private List<ModelElement> _executionSchedule = null;

    @objid ("8b377fba-1535-467f-b10b-1cdd3a70964d")
    private List<ModelElement> _scheduleExecutionConfig = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("abcad369-52c3-4065-b164-cbf053233b73")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        
        if(this._currentRow == 1){
            this._element.setHttpMethodName(value);
        }
        
        else if(this._currentRow == 2){
            this._element.setHttpMethodType(value);
        
        }
        
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._executionSchedule, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Schedule.STEREOTYPE_NAME)) {
                this._element.setExecutionSchedule((Schedule) elt);
            }
        }
        
        else if(this._currentRow == 4){
            Class elt = (Class) getModelElt(this._scheduleExecutionConfig, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME)) {
            this._element.setScheduledExecutionConfig((FeatureClass) elt);;
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
    @objid ("44c0d4f2-fb97-4e87-ba6a-b100957dcb82")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Http Methode Name
        table.addProperty("Http Methode Name", getNotNull(this._element.getHttpMethodName()));
        
        //Http Methode Type
        table.addProperty("Http Methode Type", getNotNull(this._element.getHttpMethodType()));
        
        // Execution Schedule
        this._executionSchedule = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Execution Schedule", getCamelName(this._element.getExecutionSchedule()), getCamelNames(this._executionSchedule));
        
        // Schedule Execution Config
        this._scheduleExecutionConfig = CamelElement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Schedule Execution Config", getCamelName(this._element.getScheduledExecutionConfig()), getCamelNames(this._scheduleExecutionConfig));
    }

    @objid ("cc962ee8-3d87-4598-9257-ee8dfeae492d")
    public EventConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
