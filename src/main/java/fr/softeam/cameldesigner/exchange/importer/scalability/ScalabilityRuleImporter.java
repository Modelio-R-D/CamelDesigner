package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.core.Action;
import camel.metric.MetricInstance;
import camel.requirement.RequirementModel;
import camel.scalability.Event;
import camel.scalability.ScalabilityRule;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("26a31e94-9fed-4b9b-92fe-b27342bc0fbf")
public class ScalabilityRuleImporter<T extends ScalabilityRule, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule> extends FeatureImporter<T,V> {
    @objid ("82e4ace6-ba23-4a8f-bd02-131429fd93f6")
    public ScalabilityRuleImporter() {
    }

    @objid ("7d93871c-bc52-4d26-a6b2-9558de3e797f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitScalabilityRule(this);
    }

    @objid ("ceab9caf-328e-4fc3-b0c2-a1d63e9c19dd")
    public ScalabilityRuleImporter(T elt) {
        super(elt);
    }

    @objid ("3cdf83e4-8b2a-4404-85f6-06c2815d9a14")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.create();
    }

    @objid ("dab59434-e770-402b-9747-5cbebc52995b")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof ScalabilityModel)
            ((ScalabilityModel)context).addRules(elt);
    }

    @objid ("5a0806f7-1cc5-4f35-ad1b-686a0d32a0e2")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setEvent(elt);
        setActions(elt);
    }

    @objid ("91a50c59-0dd2-49a9-98a3-0366f8f751e3")
    private void setEvent(V elt) {
        Event value = this._element.getEvent();
        if (value != null) {
            elt.setEvent((fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event) value);
        }
    }

    @objid ("f307be9a-fe69-47b7-95fe-4493a669f623")
    private void setActions(V elt) {
        EList<Action> value = this._element.getActions();
        if (value != null) {
            for(Action obj : value) {
            CamelElement valueElt = this._process.getElement(obj);
            if (valueElt instanceof Action) {
                elt.addActions( (fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action) ( valueElt));
                }
            }
         }
    }

}
