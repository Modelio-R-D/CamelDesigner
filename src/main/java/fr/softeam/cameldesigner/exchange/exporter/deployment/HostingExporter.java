package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import org.eclipse.emf.cdo.CDOObject;

@objid ("87fa6c4e-6135-4201-b3ee-24b7a69d8617")
public class HostingExporter<T extends Hosting> extends ComponentRelationExporter<T> {
    @objid ("52c76cfb-6917-4ab8-b117-40ab153336cb")
    public HostingExporter(T elt) {
        super(elt);
    }

    @objid ("e44dd681-9a3f-4342-bc14-0cdc97cfeb9b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createHosting();
    }

    @objid ("d024abc6-e4d1-4584-a256-eec3c91afb5b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("69fd40fe-9d4c-4ab3-9464-1b9c88a94baf")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
