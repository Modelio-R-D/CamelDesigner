package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.RuleTrigger;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("83254869-325b-42cc-b25d-89abb427dfa8")
public class RuleTriggerImporter<T extends RuleTrigger, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger> extends FeatureImporter<T,V> {
    @objid ("b6654625-4950-4197-bd38-8bc91444c472")
    public RuleTriggerImporter() {
        super();
    }

    @objid ("b0c0e264-eef9-4022-b0f2-39b6f5c6211b")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.create();
    }

    @objid ("d617ca86-0dec-4ce4-9283-8290c67d7f3b")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("11d78dec-bdec-419f-b02e-058bf7a1f338")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRuleTrigger(this);
    }

}
