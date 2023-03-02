package fr.softeam.cameldesigner.exchange.exporter.deployment;

import org.eclipse.emf.cdo.CDOObject;

import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class PrecedesExporter <T extends Feature> extends FeatureExporter<T> {

	public PrecedesExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }
}
