package fr.softeam.cameldesigner.exchange.exporter.scalability;

import java.util.ArrayList;
import java.util.List;
import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("dbdcb34f-a1bd-4383-8858-00e5f5d72040")
public class ScalabilityRuleExporter<T extends ScalabilityRule> extends FeatureExporter<T> {
    @objid ("8ada81f7-419b-499a-8b35-e9ef139cdcb9")
    public ScalabilityRuleExporter(T elt) {
        super(elt);
    }

    @objid ("af85e021-f238-4063-9c54-6e00ea959ba2")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createScalabilityRule();
    }

    @objid ("2a74968c-7afe-4fda-9e8f-cb93b0c4f388")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.scalability.ScalabilityRule) {
            camel.scalability.ScalabilityRule rule = (camel.scalability.ScalabilityRule) elt;
            setEvent(rule);
            setAction(rule);
        }
    }

    @objid ("5668f866-dd7b-4574-9e83-cf62c99a4788")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.scalability.ScalabilityModel) && (elt instanceof camel.scalability.ScalabilityRule)) {
            ((camel.scalability.ScalabilityModel) context).getRules().add((camel.scalability.ScalabilityRule) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("9e77795d-7d4c-415b-a6f7-dbc6b96d55ef")
    private void setAction(camel.scalability.ScalabilityRule rule) {
        List<camel.core.Action> actions = new ArrayList<>();
        for (Action action : this._element.getActions()) {
            CDOObject camelAction = this._process.getElement(action);
            if ((camelAction != null) &&  (camelAction instanceof camel.core.Action))
                actions.add((camel.core.Action) camelAction);
        }
        
        rule.getActions().addAll(actions);
    }

    @objid ("adf6df6b-5db0-44e5-9458-e6826d423feb")
    private void setEvent(camel.scalability.ScalabilityRule rule) {
        CDOObject event = this._process.getElement(this._element.getEvent());
        if ((event != null) &&  (event instanceof camel.scalability.Event))
            rule.setEvent((camel.scalability.Event) event);
    }

}
