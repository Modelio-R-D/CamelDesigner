package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Sequence;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class SequenceExporter <T extends Sequence> extends FeatureExporter<T>{

	public SequenceExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createSequence();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.Sequence) {
            camel.deployment.Sequence sq = (camel.deployment.Sequence) elt;
            setComponents(sq);
        }
    }


	private void setComponents(camel.deployment.Sequence sq) {
        List<camel.deployment.SoftwareComponent> components = new ArrayList<>();
        for (SoftwareComponent component : this._element.getComponents()) {
            CDOObject camelComponent = this._process.getElement(component);
            if ((camelComponent != null) &&  (camelComponent instanceof camel.deployment.SoftwareComponent))
                components.add((camel.deployment.SoftwareComponent) camelComponent);
        }
        
        sq.getComponents().addAll(components);
	}

	@Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }
}
