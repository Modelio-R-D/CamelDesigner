package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.HorizontalScalingAction;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("47feb77f-128f-4f10-a271-3a06290c0934")
public class HorizontalScalingActionImporter<T extends HorizontalScalingAction, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction> extends ScalingActionImporter<T,V> {
    @objid ("7613abf1-2240-47a8-8bcc-976cf5b2be19")
    public HorizontalScalingActionImporter() {
    }

    @objid ("b38e29bd-0c4e-4726-8655-05ec66878325")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHorizontalScalingAction(this);
    }

    @objid ("3b8e52cc-a981-4e89-ba8c-c60d3db26668")
    public HorizontalScalingActionImporter(T elt) {
        super(elt);
    }

    @objid ("a19e8637-ce8b-4cad-84e3-0283b0c4c5c8")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.create();
    }

    @objid ("628719a3-b17e-4a31-b5d1-f093906aaff1")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
