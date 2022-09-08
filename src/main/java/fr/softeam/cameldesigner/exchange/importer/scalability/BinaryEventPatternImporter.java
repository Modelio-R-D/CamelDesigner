package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.BinaryEventPattern;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f50be6ac-b794-4cc0-a2e3-29ba64321b84")
public class BinaryEventPatternImporter<T extends BinaryEventPattern, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern> extends EventPatternImporter<T,V> {
    @objid ("c14fbb5a-3683-4104-8c15-ec3e254c0b13")
    public BinaryEventPatternImporter() {
    }

    @objid ("dd9dbe81-3bf5-4a1b-a738-9ec2463e9626")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitBinaryEventPattern(this);
    }

    @objid ("eae07e21-18dd-462b-a8f7-0ea33cb68c1a")
    public BinaryEventPatternImporter(T elt) {
        super(elt);
    }

    @objid ("07ad3e5e-4b80-4e3a-83ee-d9171ac2a021")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.create();
    }

    @objid ("7cd16455-6d99-4e74-854b-f00b42334480")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
