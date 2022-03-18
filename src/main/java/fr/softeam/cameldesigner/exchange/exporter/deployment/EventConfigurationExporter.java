package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import camel.deployment.HTTPMethodType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureArtifactExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b38e3294-b4ad-4100-841f-44b1b59edab6")
public class EventConfigurationExporter<T extends EventConfiguration> extends FeatureArtifactExporter<T> {
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
        if (elt instanceof camel.deployment.EventConfiguration) {
            camel.deployment.EventConfiguration ec = (camel.deployment.EventConfiguration) elt;
            setHttpMethodName(ec);
            setHttpMethodType(ec);
            setExecutionSchedule(ec);
        }
    }

    @objid ("6b20c58a-8e2b-43d4-a1d7-d43a0b530513")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.deployment.ServerlessConfiguration) && (elt instanceof camel.deployment.EventConfiguration)) {
            ((camel.deployment.ServerlessConfiguration) context).setEventConfiguration((camel.deployment.EventConfiguration) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("4cc14c26-e5a5-4539-98f0-a5cdb518fed4")
    private void setExecutionSchedule(camel.deployment.EventConfiguration ec) {
        CDOObject es =  this._process.getElement(this._element.getExecutionSchedule());
        if ((es != null) &&  (es instanceof camel.metric.Schedule))
            ec.setExecutionSchedule((camel.metric.Schedule) es);
    }

    @objid ("3d5bc664-cf90-42d7-8739-3cfd3b5eef2e")
    private void setHttpMethodType(camel.deployment.EventConfiguration ec) {
        String content = this._element.getHttpMethodType();
        if (content != null)
            ec.setHttpMethodType(HTTPMethodType.valueOf(content));
    }

    @objid ("8dd5f452-ddf8-440d-a19c-8b984ceab647")
    private void setHttpMethodName(camel.deployment.EventConfiguration ec) {
        String content = this._element.getHttpMethodName();
        if (content != null)
            ec.setHttpMethodName(content);
    }

}
