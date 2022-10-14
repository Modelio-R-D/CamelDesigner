package fr.softeam.cameldesigner.audit.rule.deployment;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;

@objid ("4d7c0d3d-bb4c-4080-9c20-2a59e7fca19f")
public class Rule0306<T extends Hosting> extends AbstractRule<T> {
    @objid ("1653c16d-dad8-4bfb-82b9-a4a200f08d97")
    private static final String RULEID = "R0306";

    @objid ("025593be-1584-48dc-8006-53b67bb64acb")
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
        
           if (HostingPort.canInstantiate(owner)) {
               orientation.remove(((Port) owner).getDirection());
           }else {
               return true;
           }
        
        }
        return (!(orientation.isEmpty()));
    }

    @objid ("0d63f569-efa5-4704-a767-0cf42c8b77a4")
    @Override
    public String getDescription(T elt) {
        return elt.getName() + " Hosting must be created between a providedHostn and a requiredHost";
    }

    @objid ("43e0acee-002e-4a9c-8703-19ab4b5493b5")
    @Override
    public String getRuleId() {
        return Rule0306.RULEID;
    }

    @objid ("13469376-f8d0-4f02-9496-733dde774d36")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
