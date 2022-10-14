package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.MetricConstraint;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b7ae8605-f0b2-487a-8d59-906f746ce180")
public class MetricConstraintImporter<T extends MetricConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint> extends UnaryConstraintImporter<T,V> {
    @objid ("3b90750e-83c7-4ca8-9c29-daff7f7e3cfa")
    public MetricConstraintImporter() {
    }

    @objid ("d8e3c121-ca84-4d84-8a06-6538846a5d11")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricConstraint(this);
    }

    @objid ("d335ed84-583e-4fe6-854d-3162fb6bd3e0")
    public MetricConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("87227170-8c63-4c95-90cb-6588ae0949e1")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint.create();
    }

    @objid ("66493fbf-0f14-4383-902b-667a952d956d")
    @Override
    public void attach(V elt, CamelElement context) {
        // TODO Auto-generated method stub
    }

}
