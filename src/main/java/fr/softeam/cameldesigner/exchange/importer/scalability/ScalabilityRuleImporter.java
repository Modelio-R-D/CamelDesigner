package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.scalability.ScalabilityRule;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

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
    }

}
