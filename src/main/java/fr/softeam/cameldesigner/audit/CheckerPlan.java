package fr.softeam.cameldesigner.audit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.audit.rule.IRule;
import fr.softeam.cameldesigner.audit.rule.core.Rule0101;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0301;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0201;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("872d35d3-f7e1-4905-98dc-bb4a6bbda641")
public class CheckerPlan {
    @objid ("98019566-5375-4e40-82f9-79e4a7bf7832")
     Map<String, List<IRule>> _plan = new HashMap<>();

    @objid ("b24979d2-4590-48da-b62e-1ea155d79f31")
    public CheckerPlan() {
        new Rule0101<>().registerRule(this);
        new Rule0201<>().registerRule(this);
        new Rule0301<>().registerRule(this);
    }

    @objid ("1436be35-7866-4bd2-9f0c-1923493700b7")
    public void registerRule(String sterName, IRule rule) {
        List<IRule> applicableRules = null;
        if (this._plan.containsKey(sterName)) {
            applicableRules = this._plan.get(sterName);
        }else {
            applicableRules = new ArrayList<>();
        }
        
        applicableRules.add(rule);
        this._plan.put(sterName, applicableRules);
    }

    @objid ("f47d2452-2e5e-428e-b470-5a200b158024")
    public List<IRule> check(CamelElement elt) {
        List<IRule> violation = new ArrayList<>();
        
        for(Stereotype ster : elt.getElement().getExtension()) {
            if (ster.getModule().getName().equals(CamelDesignerModule.getInstance().getName())){
                Stereotype current = ster;
                while (current != null) {
                    List<IRule> applicableRules = this._plan.get(current.getName());
                    if (applicableRules != null) {
                        for(IRule applicableRule : applicableRules) {
                            if (applicableRule.isViolated(elt)) {
                                violation.add(applicableRule);
                            }
                        }
                    }
                    current = current.getParent();
                }
            }
        }
        return violation;
    }

}
