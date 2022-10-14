package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.deployment.ProvidedHost;
import camel.deployment.RequiredHost;
import camel.metric.MetricModel;
import camel.organisation.SecurityLevel;
import camel.organisation.User;
import camel.requirement.RequirementModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("6be0a4fe-4098-448a-882c-e358bbbefcdb")
public class UserImporter<T extends User, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> extends EntityImporter<T,V> {
    @objid ("8e7a9b4c-2e82-4431-ac86-3e6f7d304f38")
    public UserImporter() {
    }

    @objid ("9d3321c9-a205-45bd-a96d-aa267eb25511")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUser(this);
    }

    @objid ("63bba0dd-3ae2-4831-afa4-f8fe5562808e")
    public UserImporter(T elt) {
        super(elt);
    }

    @objid ("4b756714-b836-4a40-a32f-9c5f8735bc62")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.create();
    }

    @objid ("b9f2794a-832c-4d76-a291-6bfc4482429b")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof OrganisationModel)
            ((OrganisationModel)context).addUsers(elt);
        else 
            super.attach(elt, context);
    }

    @objid ("889d4d5a-bb9d-4da1-8b7c-4a5382bf581d")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setEmail(elt);
        setFirstName(elt);
        setLastName(elt);
        setWww(elt);
        setRequirementModels(elt);
        setDeploymentModels(elt);
        setMetricModels(elt);
        setScalabilityModels(elt);
    }

    @objid ("07084604-f33d-4001-b992-a8ed2cb986bc")
    private void setEmail(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getEmail();
        if (value != null) {
            elt.setEmail(value);        
            }
    }

    @objid ("4e4744f3-0c88-4f6d-bc65-9d9ecfab10a6")
    private void setFirstName(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getFirstName();
        if (value != null) {
            elt.setFirstName(value);      
            }
    }

    @objid ("38c43c38-6330-4f4a-9ec6-6f7945569188")
    private void setLastName(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getLastName();
        if (value != null) {
            elt.setLastName(value);        
            }
    }

    @objid ("6d75da13-30e8-4332-9825-6bf680a58627")
    private void setWww(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getWww();
        if (value != null) {
            elt.setWww(value);        
            }
    }

    @objid ("04919e28-46bb-4643-a276-f4dd2d70d4fc")
    private void setRequirementModels(V elt) {
        // TODO Auto-generated method stub
        EList<RequirementModel> value = this._element.getRequirementModels();
        if (value != null) {
            for(RequirementModel obj : value) {
            CamelElement valueElt = this._process.getElement(obj);
            if (valueElt instanceof RequirementModel) {
                elt.addRequirementModels( (fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel) valueElt);
                }
            }
         }
    }

    @objid ("3bd3bb61-51d2-406d-a2f0-330bd43dd44d")
    private void setDeploymentModels(V elt) {
        // TODO Auto-generated method stub
        EList<camel.deployment.DeploymentModel> value = this._element.getDeploymentModels();
        if (value != null) {
            for(camel.deployment.DeploymentModel obj : value) {
            CamelElement valueElt = this._process.getElement(obj);
            if (valueElt instanceof DeploymentModel) {
                elt.addDeploymentModels( (DeploymentModel) valueElt);
        
            }
            }
         }
    }

    @objid ("025c572b-bb5e-4913-a784-d11e5194e7a8")
    private void setMetricModels(V elt) {
        // TODO Auto-generated method stub
        EList<MetricModel> value = this._element.getMetricModels();
        if (value != null) {
            for(MetricModel obj : value) {
            CamelElement valueElt = this._process.getElement( obj);
            if (valueElt instanceof MetricModel) {
                elt.addMetricModels( (fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel) valueElt);
        
            }
        }
        }
    }

    @objid ("1fb3b1a4-fad1-4cd3-af9f-542c3e836293")
    private void setScalabilityModels(V elt) {
        // TODO Auto-generated method stub
        EList<camel.scalability.ScalabilityModel> value = this._element.getScalabilityModels();
        if (value != null) {
            for(camel.scalability.ScalabilityModel obj : value) {
            CamelElement valueElt = this._process.getElement((CDOObject) obj);
            if (valueElt instanceof ScalabilityModel) {
                elt.addScalabilityModels(  (ScalabilityModel) valueElt);
        
            }
        }
        }
    }

}
