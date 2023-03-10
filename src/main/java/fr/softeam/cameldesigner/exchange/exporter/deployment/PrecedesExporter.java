package fr.softeam.cameldesigner.exchange.exporter.deployment;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.cdo.CDOObject;

import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Precedes;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class PrecedesExporter <T extends Precedes> extends FeatureExporter<T>{


    public PrecedesExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createPrecedes();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.Precedes) {
            camel.deployment.Precedes pr = (camel.deployment.Precedes) elt;
            setComponent(pr);
            setPrecededComponent(pr);
        }
    }

    private void setPrecededComponent(camel.deployment.Precedes pr) {
        List<camel.deployment.SoftwareComponent> components = new ArrayList<>();
        for (SoftwareComponentInstance component : this._element.getPrecededComponents()) {
            CDOObject camelComponent = this._process.getElement(component);
            if ((camelComponent != null) &&  (camelComponent instanceof camel.deployment.SoftwareComponentInstance))
                components.add((camel.deployment.SoftwareComponent) camelComponent);
        }
        
        pr.getPrecededComponents().addAll(components);
	}

	private void setComponent(camel.deployment.Precedes pr) {
        CDOObject ob = this._process.getElement((this._element.getComponent()));
        if ((ob != null) &&  (ob instanceof camel.deployment.Component))
            pr.setComponent((camel.deployment.SoftwareComponent) ob);
	}

	@Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }
}
