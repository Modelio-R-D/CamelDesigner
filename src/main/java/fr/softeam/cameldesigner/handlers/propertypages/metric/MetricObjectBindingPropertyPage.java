package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("4ac41a1d-a8df-4255-bb08-2927501d208a")
public class MetricObjectBindingPropertyPage<T extends MetricObjectBinding> extends FeaturePropertyPage<T> {
    @objid ("dcf6d2a1-d6f2-4e00-bb90-5e63951821eb")
    private List<ModelElement> _executionModel = null;

    @objid ("92053952-fd7d-471a-bca1-934b4ed7f30a")
    private List<ModelElement> _componentInstance = null;

    @objid ("44ff79ab-0670-456d-8f3d-5a58e615a5a4")
    private List<ModelElement> _communicationInstance = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c088da19-52f0-44d8-a93e-aadd97a5a346")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._executionModel, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ExecutionModel.STEREOTYPE_NAME)) {
                this._element.setExecutionModel((ExecutionModel) elt);
            }
        }
        
        
        else if(this._currentRow == 2) {
             ModelElement elt = getModelElt(this._componentInstance, value);
             if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentInstance.STEREOTYPE_NAME)) {
                 this._element.setComponentInstance((ComponentInstance) elt);
             }
        
        
        }
        else if(this._currentRow == 3) {
            ModelElement elt = getModelElt(this._communicationInstance, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationInstance.STEREOTYPE_NAME)) {
                this._element.setCommunicationInstance((CommunicationInstance) elt);
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
    @objid ("d4c84ebd-d4de-41cc-9a08-f32b4d1bebc4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Execution Model
        this._executionModel = ExecutionModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Execution Model", getCamelName(this._element.getExecutionModel()), getCamelNames(this._executionModel));
        
        //Component Instance
        this._componentInstance = ComponentInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Component Instance", getCamelName(this._element.getComponentInstance()), getCamelNames(this._componentInstance));
          
              //Communication Instance
        this._communicationInstance = CommunicationInstance.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Communication Instance", getCamelName(this._element.getCommunicationInstance()), getCamelNames(this._communicationInstance));
    }

    @objid ("e809ff60-1829-4af8-b303-0df19ca65718")
    public MetricObjectBindingPropertyPage(T elt) {
        super(elt);
    }

}
