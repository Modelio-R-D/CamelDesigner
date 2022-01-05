package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b38e3294-b4ad-4100-841f-44b1b59edab6")
public class EventConfigurationExporter<T extends EventConfiguration> extends FeatureExporter<T> {
    @objid ("95f50bb6-4a60-4dba-a9f4-37fba8472501")
    public EventConfigurationExporter(T elt) {
        super(elt);
    }

    @objid ("6328b432-b62f-4695-b690-1a6bc529cdde")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createEventConfiguration();
    }

    @objid ("2698c923-52c4-42a4-ba65-496a30b687ea")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("6b20c58a-8e2b-43d4-a1d7-d43a0b530513")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
