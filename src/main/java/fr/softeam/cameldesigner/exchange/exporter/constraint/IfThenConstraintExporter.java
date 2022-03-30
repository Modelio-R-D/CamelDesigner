package fr.softeam.cameldesigner.exchange.exporter.constraint;

import camel.constraint.ConstraintFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bfcf6b80-c112-44f5-b7ac-eea97a6e1cc0")
public class IfThenConstraintExporter<T extends IfThenConstraint> extends CompositeConstraintExporter<T> {
    @objid ("4c86f3cf-9632-464b-ac01-a1a45e53dfcd")
    public IfThenConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("110bb65f-9974-41d7-8cac-deed3e349b0f")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ConstraintFactory.eINSTANCE.createIfThenConstraint();
    }

    @objid ("afc7d885-8d45-4fe3-9648-1bd5e7fc8337")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("cc59095e-f5a9-4f3c-b0f7-8ec09e2aba28")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
