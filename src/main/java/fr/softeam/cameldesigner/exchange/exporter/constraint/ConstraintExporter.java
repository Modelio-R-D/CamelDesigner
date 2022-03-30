package fr.softeam.cameldesigner.exchange.exporter.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.exchange.exporter.core.ExpendableElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("44e78fd3-bef1-4e93-a138-f63c2edbc1e7")
public abstract class ConstraintExporter<T extends CamelConstraint> extends ExpendableElementExporter<T> {
    @objid ("bc7f210a-0930-4bf6-aab8-461c4514d4fb")
    public ConstraintExporter(T elt) {
        super(elt);
    }

    @objid ("b6311091-d68c-4b86-9392-3aeb47008ed0")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("eb3a3a4a-e3b9-4139-8efa-65b482988723")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("5b27b170-a730-4454-8aa5-8857dd06ac08")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.constraint.ConstraintModel) && (elt instanceof camel.constraint.Constraint)) {
            ((camel.constraint.ConstraintModel) context).getConstraints().add((camel.constraint.Constraint) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
