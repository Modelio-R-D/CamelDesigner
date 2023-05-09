package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ControlFlowRelation;

@objid ("a549e391-852c-42cf-ba44-85837d5b913b")
public class ControlFlowRelationPropertyPage<T extends ControlFlowRelation> extends ComponentRelationPropertyPage<T> {
    @objid ("f5406dbb-7f19-48eb-a4e4-7837bd01ca99")
    public ControlFlowRelationPropertyPage(T elt) {
        super(elt);
    }

}
