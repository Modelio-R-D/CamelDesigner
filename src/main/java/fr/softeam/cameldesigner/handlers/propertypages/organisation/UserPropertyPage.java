package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("4812670e-caff-4138-b631-31680cc8d41b")
public class UserPropertyPage<T extends User> extends EntityPropertyPage<T> {
    @objid ("e47bac51-8620-4e6f-937d-118a69748825")
    private List<ModelElement> _platformCredentials = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f9cf83d2-7f29-4699-8362-f140c3769069")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setEmail(value);
            break;
        
        case 2 :
            this._element.setFirstName(value);
            break;
        
        case 3 :
            this._element.setLastName(value);
            break;
        
        case 4 :
            this._element.setWww(value);
            break;
        }
        
        if(this._currentRow == 5){
            ModelElement elt = getModelElt(this._platformCredentials, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PlatformCredentials.STEREOTYPE_NAME)) {
                this._element.setPlatformCredentials( (PlatformCredentials) elt);
            }
        }
        
        else if(this._currentRow == 6){
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addRequirementModels((RequirementModel) obj);
                }else {
                    this._element.removeRequirementModels((RequirementModel) obj);
                }
            }
        }
        
        else if(this._currentRow == 7){
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentModel.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addDeploymentModels((DeploymentModel) obj);
                }else {
                    this._element.removeDeploymentModels((DeploymentModel) obj);
                }
            }
        }
        else if(this._currentRow == 8){
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricModel.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addMetricModels((MetricModel) obj);
                }else {
                    this._element.removeMetricModels((MetricModel) obj);
                }
            }
        }
        
        else if(this._currentRow == 9){
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ScalabilityModel.STEREOTYPE_NAME))) {
                Object obj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addScalabilityModels((ScalabilityModel) obj);
                }else {
                    this._element.removeScalabilityModels((ScalabilityModel)obj);
                }
            }
        }
        
        this._currentRow -= 9;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("4e165582-9e5b-49c4-8a8f-cd3d73356a6e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Email
        table.addProperty("Email", getNotNull(this._element.getEmail()));
        
        //first name
        table.addProperty("First Name", getNotNull(this._element.getFirstName()));
        
        //last name
        table.addProperty("Last Name", getNotNull(this._element.getLastName()));
        
        //www
        table.addProperty("Www", getNotNull(this._element.getWww()));
        
        //Platform Credentials
        this._platformCredentials = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Platform Credentials", getCamelName(this._element.getPlatformCredentials()), getCamelNames(this._platformCredentials));
        
        //requirement models
        table.addProperty("Requirement Models", getCamelValue(this._element.getRequirementModels()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getRequirementModels()));
        
        //deployment models
        table.addProperty("Deployment Models", getCamelValue(this._element.getDeploymentModels()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getDeploymentModels()));
        
        //metric models
        table.addProperty("Metric Models", getCamelValue(this._element.getMetricModels()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getMetricModels()));
        
        //scalability models
        table.addProperty("Scalability Models", getCamelValue(this._element.getScalabilityModels()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getScalabilityModels()));
    }

    @objid ("8b973fb1-dd2d-431e-82b3-19bcff01a6e1")
    public UserPropertyPage(T elt) {
        super(elt);
    }

}
