package fr.softeam.cameldesigner.exchange.exporter.core;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;


public abstract class ActionExporter<T extends Action> extends FeatureExporter<T>{

    public ActionExporter(T elt) {
        super(elt);
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
