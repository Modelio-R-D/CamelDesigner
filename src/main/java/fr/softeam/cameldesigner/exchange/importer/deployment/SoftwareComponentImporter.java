package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.SoftwareComponent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1f54af6e-e4b6-40f7-9e3d-f18ac70811eb")
public class SoftwareComponentImporter<T extends SoftwareComponent, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> extends ComponentImporter<T,V> {
    @objid ("6eaceb6b-0a75-4ef0-84d8-1e6bd3fdfa49")
    public SoftwareComponentImporter() {
        super();
    }

    @objid ("d6cedca8-1b3f-41cc-82a9-8cdf0965a853")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.create();
    }

    @objid ("730b6129-112a-477a-adef-7d8592219a91")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addSoftwareComponents(elt);
    }

    @objid ("4b54df96-8c89-4708-8ebc-d6d9bb416342")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSoftwareComponent(this);
    }

    @objid ("2ee18e14-0d56-4ef6-abe0-a795760587ea")
    public SoftwareComponentImporter(T elt) {
        super(elt);
    }

    @objid ("737a5f84-9faf-4ef8-8769-99057b882649")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setRequirementSet(elt);
        setLongLived(elt);
        setCoInstanceHosting(elt);
    }

    @objid ("0f29c5d2-cf7b-43eb-9d90-69eee8e91d6f")
    private void setCoInstanceHosting(V elt) {
        Boolean value = this._element.isCoInstanceHosting();
        if (value != null) {
            elt.setCoInstanceHosting(value);
        }
    }

    @objid ("415b86e2-ce11-4be5-a85c-68f4224c7b7e")
    private void setLongLived(V elt) {
        Boolean value = this._element.isLongLived();
         if (value != null) {
             elt.setLongLived(value);
         }
    }

    @objid ("be2a1ea4-e6b4-4041-8928-c775184e5bdf")
    private void setRequirementSet(V elt) {
        camel.deployment.RequirementSet value = this._element.getRequirementSet();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet) {
                elt.setRequirementSet((fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet) valueElt);
        
            }
        }
    }

}
