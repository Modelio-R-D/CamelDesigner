package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.SecurityControl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("03cc409e-48aa-47d1-885c-9dc66402c1b8")
public class SecurityControlImporter<T extends SecurityControl, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl> extends FeatureImporter<T,V> {
    @objid ("fe3b70cf-7274-49bc-bc91-2a36a19c75d2")
    public SecurityControlImporter() {
    }

    @objid ("493f9c11-e80e-466b-92cd-1fe75863ab8c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecurityControl(this);
    }

    @objid ("850c3d20-2ac4-4c48-9f24-fd57604b0bea")
    public SecurityControlImporter(T elt) {
        super(elt);
    }

    @objid ("4abfa525-8a38-4748-909a-08625ee416a2")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("31c48117-93f1-40bd-8895-d1742c234c68")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.create();
    }

}
