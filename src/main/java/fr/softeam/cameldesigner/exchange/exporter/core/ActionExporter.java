package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8da72231-c52e-419f-942f-c88d67d594c8")
public abstract class ActionExporter<T extends Action> extends FeatureExporter<T> {
    @objid ("1ad8692c-37e5-4f63-8545-9e3ce9278200")
    public ActionExporter(T elt) {
        super(elt);
    }

    @objid ("22acecb5-4e61-4d9d-b92d-e7061a28c538")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a0931d1f-fd94-44e8-95d9-193f0e9d75b0")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
