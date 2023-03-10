package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Parallel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class ParallelExporter <T extends Parallel> extends FeatureExporter<T>{

	public ParallelExporter(T elt) {
		super(elt);

	}
	
	@Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createParallel();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.Parallel) {
            camel.deployment.Parallel pr = (camel.deployment.Parallel) elt;
            setComponents(pr);
        }
    }


	private void setComponents(camel.deployment.Parallel pr) {
        List<camel.deployment.SoftwareComponent> components = new ArrayList<>();
        for (SoftwareComponent component : this._element.getComponents()) {
            CDOObject camelComponent = this._process.getElement(component);
            if ((camelComponent != null) &&  (camelComponent instanceof camel.deployment.SoftwareComponent))
                components.add((camel.deployment.SoftwareComponent) camelComponent);
        }
        
        pr.getComponents().addAll(components);
	}

	@Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
