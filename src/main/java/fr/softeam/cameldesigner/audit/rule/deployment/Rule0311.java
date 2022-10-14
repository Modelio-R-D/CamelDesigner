package fr.softeam.cameldesigner.audit.rule.deployment;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;

@objid ("6881c177-cd5e-493b-809e-7e9c114ac333")
public class Rule0311<T extends CommunicationInstance> extends AbstractRule<T> {
    @objid ("1cb30a8a-86e7-40d6-b26b-dabc9c59af5e")
    private static final String RULEID = "R0311";

    @objid ("518aaa06-6e9a-44d8-b812-a053ae0b14b7")
    @Override
    public boolean isViolated(T context) {
        Connector connector = context.getElement();
        
        List<PortOrientation> orientation = new ArrayList<>();
        orientation.add(PortOrientation.IN);
        orientation.add(PortOrientation.OUT);
        
        for (LinkEnd end : connector.getLinkEnd()) {
           Instance owner = end.getSource();
           if (owner == null) {
               owner = end.getOppositeOwner().getSource();
           }
        
           if (CommunicationPortInstance.canInstantiate(owner)) {
               orientation.remove(((Port) owner).getDirection());
           }else {
               return true;
           }
        
        }
        return (!(orientation.isEmpty()));
    }

    @objid ("6e7d9218-6e82-4dbc-9d88-2335f9a2f3a0")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " CommunicationInstance must be created between a providedCommunicationInstance and a requiredCommunicationInstance";
    }

    @objid ("a336a7d0-2037-4a17-83d7-bd634ce46d8d")
    @Override
    public String getRuleId() {
        return Rule0311.RULEID;
    }

    @objid ("3ac48545-464a-4bc8-8972-3e145d4139c3")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
