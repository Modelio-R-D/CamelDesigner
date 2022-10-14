package fr.softeam.cameldesigner.audit.rule.deployment;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;

@objid ("3d1c4aab-eca7-41ab-ac6f-9dfe56081f1c")
public class Rule0302<T extends Communication> extends AbstractRule<T> {
    @objid ("58646d1e-30ae-43a6-9b1a-5e6780458f24")
    private static final String RULEID = "R0302";

    @objid ("a425f098-bdc7-4cd0-8361-c55e457a2756")
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
        
           if (CommunicationPort.canInstantiate(owner)) {
               orientation.remove(((Port) owner).getDirection());
           }else {
               return true;
           }
        
        }
        return (!(orientation.isEmpty()));
    }

    @objid ("a4c19f10-9ca6-4f2f-ba7f-9e18736930e0")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " Communication must be created between a providedCommunication and a requiredCommunication";
    }

    @objid ("aee3def3-419e-4b23-8283-dc260c9b8bc3")
    @Override
    public String getRuleId() {
        return Rule0302.RULEID;
    }

    @objid ("175fbc04-e699-49a0-b3ca-189dfa99ee80")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
