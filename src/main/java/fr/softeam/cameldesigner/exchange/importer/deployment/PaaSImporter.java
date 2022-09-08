package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.PaaS;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("9fe4fd87-f3ec-43ea-90d6-48e5def5ea68")
public class PaaSImporter<T extends PaaS, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS> extends CamelComponentImporter<T,V> {
    @objid ("d0ecc2b5-88b3-4280-a1b4-8dbcc9d87371")
    public PaaSImporter() {
        super();
    }

    @objid ("89cf2bfe-4491-43ef-8b6c-a663f9751299")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.create();
    }

    @objid ("799129e6-6f75-4915-8df0-ca0f33e03447")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addPaases(elt);
        else
            super.attach(elt, context);
    }

    @objid ("2188e190-abcb-42f6-bc3c-820a35f009ad")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPaaS(this);
    }

}
