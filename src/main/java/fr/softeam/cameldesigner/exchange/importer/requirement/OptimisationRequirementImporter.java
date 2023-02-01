package fr.softeam.cameldesigner.exchange.importer.requirement;

import camel.metric.MetricContext;
import camel.requirement.OptimisationRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("25114ac6-09a3-4abb-8db3-949ec85cc0c2")
public class OptimisationRequirementImporter<T extends OptimisationRequirement, V extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement> extends SoftRequirementImporter<T,V> {
    @objid ("677e8c34-1db2-43ab-aa31-b109c9aea38f")
    public OptimisationRequirementImporter() {
    }

    @objid ("febe0a40-65c3-41d5-a19b-478c0161568b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitOptimisationRequirement(this);
    }

    @objid ("dd2cfdda-2bba-431d-9930-4dd545c3a917")
    public OptimisationRequirementImporter(T elt) {
        super(elt);
    }

    @objid ("e72c1aa8-e6ee-4a7f-9dbb-193c5dae42af")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.create();
    }

    @objid ("c13d67dc-2b3f-4f05-b193-168323123056")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof RequirementModel)
            ((RequirementModel)context).addRequirements(elt);
        else
            super.attach(elt, context);
    }

    @objid ("dec86f05-b972-4eec-bf49-205bcd5c09ab")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setMetricContext(elt);
        setMetricVariable(elt);
        setMinimise(elt);
    }

    @objid ("9af1041d-0ab6-40c6-8ff4-7761a6113574")
    private void setMetricContext(V elt) {
        // TODO Auto-generated method stub
        MetricContext value = this._element.getMetricContext();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext) {
                elt.setMetricContext((fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext) valueElt);
        
            }
        }
    }

    @objid ("e0eeda7c-7c09-4066-ae94-1531480f33df")
    private void setMetricVariable(V elt) {
        // TODO Auto-generated method stub
        camel.metric.MetricVariable value = this._element.getMetricVariable();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof MetricVariable) {
                elt.setMetricVariable((MetricVariable) valueElt);
        
            }
        }
    }

    @objid ("969865d9-b883-4c81-872b-305bba4845e6")
    private void setMinimise(V elt) {
        // TODO Auto-generated method stub
        Boolean value = this._element.isMinimise();
        if (value != null) {
            elt.setMinimise(value);
        }
    }

}
