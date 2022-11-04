package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.RequirementSet;
import camel.requirement.HorizontalScaleRequirement;
import camel.requirement.ImageRequirement;
import camel.requirement.LocationRequirement;
import camel.requirement.OSRequirement;
import camel.requirement.PaaSRequirement;
import camel.requirement.ProviderRequirement;
import camel.requirement.ResourceRequirement;
import camel.requirement.SecurityRequirement;
import camel.requirement.VerticalScaleRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8f79c839-8ac1-4479-9e73-483578667521")
public class RequirementSetImporter<T extends RequirementSet, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet> extends FeatureImporter<T,V> {
    @objid ("5aaa7a6f-6a65-499f-a208-f9111944bed8")
    public RequirementSetImporter() {
        super();
    }

    @objid ("00199613-b653-4908-9fa7-c694581236c5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.create();
    }

    @objid ("aade0e96-0d6d-4654-a0c8-242f5480a170")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addRequirementSets(elt);
    }

    @objid ("2ca44fc1-6974-4cf0-ac14-a5c8f210b3df")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequirementSet(this);
    }

    @objid ("2a7ff508-1cc7-447f-bd59-4c94b382a34d")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setResourceRequirement(elt);
        setPaaSRequirement(elt);
        setLocationRequirement(elt);
        setProviderRequirement(elt);
        setVerticalScaleRequirement(elt);
        setHorizontalScaleRequirement(elt);
        setOsRequirement(elt);
        setSecurityRequirement(elt);
        setImageRequirement(elt);
    }

    @objid ("bee16844-25d9-4885-9ff9-736b7e46e329")
    private void setImageRequirement(V elt) {
        // TODO Auto-generated method stub
        ImageRequirement value = this._element.getImageRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement) {
                elt.setImageRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement) valueElt);
        
            }
        }
    }

    @objid ("3cc97025-4156-411f-9efa-559ae05d6774")
    private void setLocationRequirement(V elt) {
        // TODO Auto-generated method stub
        LocationRequirement value = this._element.getLocationRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement) {
                elt.setLocationRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement) valueElt);
        
            }
        }
    }

    @objid ("6375932a-20cf-436e-afd1-7e82999b205c")
    private void setHorizontalScaleRequirement(V elt) {
        // TODO Auto-generated method stub
        HorizontalScaleRequirement value = this._element.getHorizontalScaleRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement) {
                elt.setHorizontalScaleRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement) valueElt);
        
            }
        }
    }

    @objid ("3102971d-dd6b-48c6-b4e4-c060f4783f90")
    private void setSecurityRequirement(V elt) {
        // TODO Auto-generated method stub
        SecurityRequirement value = this._element.getSecurityRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement) {
                elt.setSecurityRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement) valueElt);
        
            }
        }
    }

    @objid ("4bf3d880-f9bf-464a-86ad-fa72916aa0e0")
    private void setOsRequirement(V elt) {
        // TODO Auto-generated method stub
        OSRequirement value = this._element.getOsRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement) {
                elt.setOsRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement) valueElt);
        
            }
        }
    }

    @objid ("2e74e8aa-eecf-432b-963d-0717c6600dc4")
    private void setVerticalScaleRequirement(V elt) {
        // TODO Auto-generated method stub
        VerticalScaleRequirement value = this._element.getVerticalScaleRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement) {
                elt.setVerticalScaleRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement) valueElt);
        
            }
        }
    }

    @objid ("1cda3927-4c82-4e93-8897-faa1b9f87ca7")
    private void setProviderRequirement(V elt) {
        // TODO Auto-generated method stub
        ProviderRequirement value = this._element.getProviderRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement) {
                elt.setProviderRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement) valueElt);
        
            }
        }
    }

    @objid ("bccc9ef7-acf2-4896-8e23-73cd6c92535b")
    private void setPaaSRequirement(V elt) {
        // TODO Auto-generated method stub
        PaaSRequirement value = this._element.getPaasRequirement();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement) {
                elt.setPaasRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement) valueElt);
        
            }
        }
    }

    @objid ("e569ee8f-5575-477b-963c-34cdec5b63d7")
    private void setResourceRequirement(V elt) {
        // TODO Auto-generated method stub
         ResourceRequirement value = this._element.getResourceRequirement();
         if (value != null) {
             CamelElement valueElt = this._process.getElement(value);
             if (valueElt instanceof fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement) {
                 elt.setResourceRequirement((fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement) valueElt);
        
             }
         }
    }

}
