package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import org.eclipse.emf.cdo.CDOObject;

@objid ("49a08231-b2fc-4b0e-bc78-b86ec655d416")
public class ProvidedHostExporter<T extends HostingPort> extends HostingPortExporter<T> {
    @objid ("050f19ec-acab-425c-a379-f268456a31bc")
    public ProvidedHostExporter(T elt) {
        super(elt);
    }

    @objid ("83e68ac2-ab7a-43fd-9388-d185fd0e9f24")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createProvidedHost();
    }

    @objid ("55f1d3c2-dfcc-47a9-81f8-06d3278a4f46")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("c97c1e7e-c0a4-4672-bc9e-b7a214eb6764")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
