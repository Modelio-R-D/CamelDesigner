package fr.softeam.cameldesigner.audit.rule;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.audit.CheckerPlan;

@objid ("68b8d37e-41d5-44af-ab32-dc87961a257a")
public abstract class AbstractRule<T extends CamelElement> implements IRule<T> {
    @objid ("20156c3e-5961-4aee-a279-6c176761ad15")
    @Override
    public abstract String getRuleId();

    @objid ("bb28b93c-b7be-4d1d-81d7-9b05bcc91598")
    @Override
    public abstract boolean isViolated(T context);

    @objid ("65e2f889-3d36-450e-8982-4e11a867605e")
    @Override
    public abstract String getDescription(T elt);

    @objid ("7a052c55-f42f-4586-9c18-e44b85892e61")
    @Override
    public abstract void registerRule(CheckerPlan plan);

}
