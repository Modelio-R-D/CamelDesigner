package fr.softeam.cameldesigner.audit.rule;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.audit.CheckerPlan;

@objid ("268d41ca-a931-4a0e-ac4d-1ce7ceb9c080")
public interface IRule<T extends CamelElement> {
    @objid ("87d21be1-a300-4fe3-bd62-92634b8b8df7")
    boolean isViolated(T context);

    @objid ("8ff282bc-9c8a-4444-bf99-044832313078")
    String getRuleId();

    @objid ("edfe8990-b7a5-453d-8cf7-1d0582b842c1")
    String getDescription(T elt);

    @objid ("2430e450-32b3-4d8d-b01f-c19df8beeb07")
    void registerRule(CheckerPlan plan);

}
