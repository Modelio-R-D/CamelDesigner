package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.Timer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("868c339f-4851-4fb1-bc49-46771e76c245")
public class TimerImporter<T extends Timer, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer> extends FeatureImporter<T,V> {
    @objid ("f971447a-d9fd-464e-893d-43a7437adcd3")
    public TimerImporter() {
    }

    @objid ("57691f04-e3bc-41be-9541-942df97fce35")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitTimer(this);
    }

    @objid ("7c7c43de-6e3b-45dd-9fbf-fb9f75d95dbb")
    public TimerImporter(T elt) {
        super(elt);
    }

    @objid ("755ba3e3-3e05-4a1c-8185-9db80d42bdc3")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.create();
    }

    @objid ("04fe49fc-bfb2-416d-8d8d-b852bd736344")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
