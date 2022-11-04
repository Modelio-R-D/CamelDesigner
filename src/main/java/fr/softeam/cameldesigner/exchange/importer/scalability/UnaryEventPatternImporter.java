package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.UnaryEventPattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("0051aedc-9fe9-4c69-a81e-4bcd0e9aef4e")
public class UnaryEventPatternImporter<T extends UnaryEventPattern, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern> extends EventPatternImporter<T,V> {
    @objid ("1184492c-1630-4d76-afb4-90d415c4951b")
    public UnaryEventPatternImporter() {
    }

    @objid ("678f9aba-b0a2-40de-a2df-e36d048d8066")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnaryEventPattern(this);
    }

    @objid ("2c529715-9048-4a33-9337-649eeec27d46")
    public UnaryEventPatternImporter(T elt) {
        super(elt);
    }

    @objid ("b012ac85-15ba-4274-a029-b4888f47df96")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return null;
    }

    @objid ("b76b51a8-7772-4e1d-8aef-cf8f59fdaf42")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
