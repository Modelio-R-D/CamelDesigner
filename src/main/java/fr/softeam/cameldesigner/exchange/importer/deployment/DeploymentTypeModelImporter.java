package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.DeploymentTypeModel;
import camel.deployment.RequirementSet;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8e8f482f-c03f-4554-81df-09a2d5390037")
public class DeploymentTypeModelImporter<T extends DeploymentTypeModel, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> extends DeploymentModelImporter<T,V> {
    @objid ("391423da-caa5-48cc-8725-35f23eff3899")
    public DeploymentTypeModelImporter() {
        super();
    }

    @objid ("209014f2-9985-4627-bfa9-83b3308287db")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.create();
    }

    @objid ("e555c0fc-d15c-4b42-b5ca-a29b760244db")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDeploymentTypeModel(this);
    }

    @objid ("37bee6a2-8e78-4a9f-9e4b-13b934948eee")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setGlobalRequirementSet(elt);
    }

    @objid ("3ec97307-e2e6-42ef-ae05-e535359c72cc")
    private void setGlobalRequirementSet(V elt) {
        RequirementSet value = this._element.getGlobalRequirementSet();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet) {
                elt.setGlobalRequirementSet((fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet) valueElt);
            }
               }
    }

}
