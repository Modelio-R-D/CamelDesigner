package fr.softeam.cameldesigner.exchange.exporter.deployment;

import org.eclipse.emf.cdo.CDOObject;

import camel.deployment.DeploymentFactory;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Conditional;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class ConditionalExporter <T extends Conditional> extends FeatureExporter<T>{

	public ConditionalExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createConditional();
    }
	
	@Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.Conditional) {
            camel.deployment.Conditional cd = (camel.deployment.Conditional) elt;
            setFirstComponent(cd);
            setConstraint(cd);
            setSecondComponent(cd);
        }
    }

	private void setSecondComponent(camel.deployment.Conditional cd) {
        CDOObject ob = this._process.getElement(this._element.getSecondComponent());
        if ((ob != null) &&  (ob instanceof camel.deployment.SoftwareComponent))
        	cd.setSecondComponent((camel.deployment.SoftwareComponent) ob);		
	}

	private void setConstraint(camel.deployment.Conditional cd) {
        CDOObject ob = this._process.getElement(this._element.getConstraint());
        if ((ob != null) &&  (ob instanceof camel.constraint.Constraint))
        	cd.setConstraint((camel.constraint.Constraint) ob);			
	}

	private void setFirstComponent(camel.deployment.Conditional cd) {
        CDOObject ob = this._process.getElement(this._element.getFirstComponent());
        if ((ob != null) &&  (ob instanceof camel.deployment.SoftwareComponent))
        	cd.setFirstComponent((camel.deployment.SoftwareComponent) ob);			
	}





}
