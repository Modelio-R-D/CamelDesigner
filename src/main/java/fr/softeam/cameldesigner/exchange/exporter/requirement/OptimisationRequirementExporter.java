package fr.softeam.cameldesigner.exchange.exporter.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.requirement.RequirementFactory;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;

@objid ("db9bc91d-f86b-4ecc-9e0d-8be565fbc164")
public class OptimisationRequirementExporter<T extends OptimisationRequirement> extends SoftRequirementExporter<T> {
    @objid ("5053adef-4d79-4556-ae3b-2125f429f0ea")
    public OptimisationRequirementExporter(T elt) {
        super(elt);
    }

    @objid ("096d3493-5416-44fd-b13a-311a268716ea")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return RequirementFactory.eINSTANCE.createOptimisationRequirement();
    }

    @objid ("419fde25-4f21-461a-9445-ac0ee965f567")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.requirement.OptimisationRequirement) {
            camel.requirement.OptimisationRequirement or = (camel.requirement.OptimisationRequirement) elt;
            setMetricContext(or);
            setMetricVariable(or);
            setMinimise(or);
        }
    }

    @objid ("9781b357-eb56-4ba3-a42c-afad5ac9623b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("e7e0c405-7270-4605-8938-f29a2983b2f9")
    private void setMinimise(camel.requirement.OptimisationRequirement or) {
        or.setMinimise(this._element.isMinimise());
    }

    @objid ("6ce9de7f-227c-4b9a-b4c7-44a80e6f5065")
    private void setMetricVariable(camel.requirement.OptimisationRequirement or) {
        CDOObject mv = this._process.getElement(this._element.getMetricVariable());
        if ((mv != null) &&  (mv instanceof camel.metric.MetricVariable))
            or.setMetricVariable((camel.metric.MetricVariable) mv);
    }

    @objid ("df022968-4d60-40da-8e81-75ff0383ca4d")
    private void setMetricContext(camel.requirement.OptimisationRequirement or) {
        CDOObject mc = this._process.getElement(this._element.getMetricContext());
        if ((mc != null) &&  (mc instanceof camel.metric.MetricContext))
            or.setMetricContext((camel.metric.MetricContext) mc);
    }

}
