package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.IfThenConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("9cf31735-3a8a-4ac5-819b-1b6cc11c1cc0")
public class IfThenConstraintImporter<T extends IfThenConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint> extends CompositeConstraintImporter<T,V> {
    @objid ("99f141a3-928e-46e1-9a5e-870902c1be1a")
    public IfThenConstraintImporter() {
    }

    @objid ("14b3d74e-4f9b-42e8-b8b1-4d5913ddf6b9")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitIfThenConstraint(this);
    }

    @objid ("858e3a88-6b63-4c5c-b201-93f95a23d085")
    public IfThenConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("cfe75471-2085-4b79-814b-ac9b7246eb35")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint.create();
    }

    @objid ("9d9e8e57-267c-46ff-a1e8-dd37311c1d57")
    @Override
    public void attach(V elt, CamelElement context) {
        // TODO Auto-generated method stub
    }

}
