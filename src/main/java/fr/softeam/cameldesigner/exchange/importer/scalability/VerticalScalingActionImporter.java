package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.VerticalScalingAction;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("0829e057-2b2f-420e-8f1b-2942314325f3")
public class VerticalScalingActionImporter<T extends VerticalScalingAction, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction> extends ScalingActionImporter<T,V> {
    @objid ("143136f6-a3f0-44a4-ab85-de659cb9ca73")
    public VerticalScalingActionImporter() {
    }

    @objid ("348330e0-019a-408c-b34a-cd93b0d220f3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitVerticalScalingAction(this);
    }

    @objid ("d746345e-d5a1-46a7-b59c-36391b04e6a2")
    public VerticalScalingActionImporter(T elt) {
        super(elt);
    }

    @objid ("5c7ed729-4dab-4b6f-9657-541dc1ad5097")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.create();
    }

    @objid ("6b5462d1-afac-4716-9e73-7d70994fa59f")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
