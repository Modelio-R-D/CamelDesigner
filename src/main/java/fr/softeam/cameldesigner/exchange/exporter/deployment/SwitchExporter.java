package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

import camel.deployment.DeploymentFactory;
import camel.metric.MetricContext;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Switch;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class SwitchExporter <T extends Switch> extends FeatureExporter <T>{

	public SwitchExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createSequence();
    }

	@Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.Switch) {
            camel.deployment.Switch sw = (camel.deployment.Switch) elt;
            setComponents(sw);
            setMetricContext(sw);
            setValues(sw);
        }
    }


	private void setValues(camel.deployment.Switch sw) {
        List<String> values = this._element.getValues();
        if (values != null) {
            sw.getValues().addAll(values);
        }
	}

	private void setMetricContext(camel.deployment.Switch sw) {
        CDOObject ob = this._process.getElement((this._element.getMetricContext()));
        if ((ob != null) &&  (ob instanceof camel.metric.MetricContext))
            sw.setMetricContext((MetricContext) ob);		
	}

	private void setComponents(camel.deployment.Switch sw) {
        List<camel.deployment.SoftwareComponent> components = new ArrayList<>();
        for (SoftwareComponent component : this._element.getComponents()) {
            CDOObject camelComponent = this._process.getElement(component);
            if ((camelComponent != null) &&  (camelComponent instanceof camel.deployment.SoftwareComponent))
                components.add((camel.deployment.SoftwareComponent) camelComponent);
        }
        
        sw.getComponents().addAll(components);
	}


}
