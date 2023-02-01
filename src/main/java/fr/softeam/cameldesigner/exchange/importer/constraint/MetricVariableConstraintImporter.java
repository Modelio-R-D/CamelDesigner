package fr.softeam.cameldesigner.exchange.importer.constraint;

import camel.constraint.MetricVariableConstraint;
import camel.metric.MetricVariable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f0a735ed-daab-4903-970c-887473544ac8")
public class MetricVariableConstraintImporter<T extends MetricVariableConstraint, V extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint> extends UnaryConstraintImporter<T,V> {
    @objid ("d2d9efd1-8e44-4202-b0a4-a6d187bee72b")
    public MetricVariableConstraintImporter() {
    }

    @objid ("46ebcfd5-1610-4ae4-9631-01c0db827b88")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricVariableConstraint(this);
    }

    @objid ("f034aabe-5ea3-4947-92c2-7db3dfc4ffc4")
    public MetricVariableConstraintImporter(T elt) {
        super(elt);
    }

    @objid ("3f6667bb-a708-4bd9-838c-ca747ebf4904")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint.create();
    }

    @objid ("4e28e761-59a2-4dfc-bf97-5b8a07f80537")
    @Override
    public void attach(V elt, CamelElement context) {
        MetricVariable metricVariable = this._element.getMetricVariable();
        
        CamelElement camelElt = this._process.getElement(metricVariable);
        if (camelElt instanceof fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable)
            elt.setMetricVariable((fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable) camelElt);
    }

}
