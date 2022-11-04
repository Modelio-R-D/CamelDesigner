package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.RequiredHost;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8a2ae908-8870-4d42-980a-f7c72d0912d4")
public class RequiredHostImporter<T extends RequiredHost, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> extends HostingPortImporter<T,V> {
    @objid ("c4a57f2a-bbcb-472b-9f91-66e412d3ea38")
    public RequiredHostImporter() {
        super();
    }

    @objid ("7662d7ab-f8ff-41d2-b0f1-06769d728e24")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.create();
    }

    @objid ("d545f545-8243-4b00-a921-6228cb208266")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof SoftwareComponent) {
            ((SoftwareComponent) context).setRequiredHost(elt);
        } else {
            super.attach(elt, context);
        }
    }

    @objid ("00cdcef7-1bf3-4b86-968f-1153639136f3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequiredHost(this);
    }

}
