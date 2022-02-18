package fr.softeam.cameldesigner.exchange.exporter.scalability;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;

public abstract class EventPatternExporter<T extends EventPattern> extends FeatureClassExporter<T> {

    public EventPatternExporter(T elt) {
        super(elt);
    }

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
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
