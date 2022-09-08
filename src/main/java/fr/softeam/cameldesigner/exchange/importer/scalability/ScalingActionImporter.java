package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.ScalingAction;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.ActionImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bc8ac234-1974-4693-9fed-f792941291a5")
public abstract class ScalingActionImporter<T extends ScalingAction, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction> extends ActionImporter<T,V> {
    @objid ("d60d82f8-c8e6-4fce-876b-e822a834d7ed")
    public ScalingActionImporter() {
    }

    @objid ("531652b6-ff89-4f50-88e3-879809fc67d3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitScalingAction(this);
    }

    @objid ("58df4caf-0d90-4549-aab4-f78a482f8fce")
    public ScalingActionImporter(T elt) {
        super(elt);
    }

    @objid ("4236cf07-fba7-4a3e-8368-add637911e39")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

    @objid ("e5b4878f-b625-4f46-b324-2f3224d11c17")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
