package fr.softeam.cameldesigner.audit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.audit.rule.IRule;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1301;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1302;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1303;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1304;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1305;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1306;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1307;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1308;
import fr.softeam.cameldesigner.audit.rule.constraint.Rule1309;
import fr.softeam.cameldesigner.audit.rule.core.Rule0101;
import fr.softeam.cameldesigner.audit.rule.core.Rule0102;
import fr.softeam.cameldesigner.audit.rule.data.Rule1401;
import fr.softeam.cameldesigner.audit.rule.data.Rule1402;
import fr.softeam.cameldesigner.audit.rule.data.Rule1403;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0301;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0302;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0303;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0304;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0305;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0306;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0307;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0308;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0309;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0310;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0311;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0312;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0313;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0314;
import fr.softeam.cameldesigner.audit.rule.deployment.Rule0315;
import fr.softeam.cameldesigner.audit.rule.location.Rule0501;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0601;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0602;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0603;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0604;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0605;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0606;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0607;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0608;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0609;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0610;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0611;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0612;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0613;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0614;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0615;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0616;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0617;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0618;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0619;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0620;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0621;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0622;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0623;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0624;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0625;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0626;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0627;
import fr.softeam.cameldesigner.audit.rule.metric.Rule0628;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0201;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0202;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0203;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0204;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0205;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0206;
import fr.softeam.cameldesigner.audit.rule.mms.Rule0207;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0801;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0802;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0803;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0804;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0805;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0806;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0807;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0808;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0809;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0810;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0811;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0812;
import fr.softeam.cameldesigner.audit.rule.requirement.Rule0813;
import fr.softeam.cameldesigner.audit.rule.unit.Rule1201;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.metamodel.uml.infrastructure.Stereotype;

@objid ("872d35d3-f7e1-4905-98dc-bb4a6bbda641")
public class CheckerPlan {
    @objid ("98019566-5375-4e40-82f9-79e4a7bf7832")
     Map<String, List<IRule>> _plan = new HashMap<>();

    @objid ("b24979d2-4590-48da-b62e-1ea155d79f31")
    public CheckerPlan() {
        //Core
        new Rule0101<>().registerRule(this);
        new Rule0102<>().registerRule(this);
        
        //mms
        new Rule0201<>().registerRule(this);
        new Rule0202<>().registerRule(this);
        new Rule0203<>().registerRule(this);
        new Rule0204<>().registerRule(this);
        new Rule0205<>().registerRule(this);
        new Rule0206<>().registerRule(this);
        new Rule0207<>().registerRule(this);
        
        
        
        //Deployment
        new Rule0301<>().registerRule(this);
        new Rule0302<>().registerRule(this);
        new Rule0303<>().registerRule(this);
        new Rule0304<>().registerRule(this);
        new Rule0305<>().registerRule(this);
        new Rule0306<>().registerRule(this);
        new Rule0307<>().registerRule(this);
        new Rule0308<>().registerRule(this);
        new Rule0309<>().registerRule(this);
        new Rule0310<>().registerRule(this);
        new Rule0311<>().registerRule(this);
        new Rule0312<>().registerRule(this);
        new Rule0313<>().registerRule(this);
        new Rule0314<>().registerRule(this);
        new Rule0315<>().registerRule(this);
        
        
        //Location
        new Rule0501<>().registerRule(this);
        
        
        //Metric
        new Rule0601<>().registerRule(this);
        new Rule0602<>().registerRule(this);
        new Rule0603<>().registerRule(this);
        new Rule0604<>().registerRule(this);
        new Rule0605<>().registerRule(this);
        new Rule0606<>().registerRule(this);
        new Rule0607<>().registerRule(this);
        new Rule0608<>().registerRule(this);
        new Rule0609<>().registerRule(this);
        new Rule0610<>().registerRule(this);
        new Rule0611<>().registerRule(this);
        new Rule0612<>().registerRule(this);
        new Rule0613<>().registerRule(this);
        new Rule0614<>().registerRule(this);
        new Rule0615<>().registerRule(this);
        new Rule0616<>().registerRule(this);
        new Rule0617<>().registerRule(this);
        new Rule0618<>().registerRule(this);
        new Rule0619<>().registerRule(this);
        new Rule0620<>().registerRule(this);
        new Rule0621<>().registerRule(this);
        new Rule0622<>().registerRule(this);
        new Rule0623<>().registerRule(this);
        new Rule0624<>().registerRule(this);
        new Rule0625<>().registerRule(this);
        new Rule0626<>().registerRule(this);
        new Rule0627<>().registerRule(this);
        new Rule0628<>().registerRule(this);
        
        //Requirement
        new Rule0801<>().registerRule(this);
        new Rule0802<>().registerRule(this);
        new Rule0803<>().registerRule(this);
        new Rule0804<>().registerRule(this);
        new Rule0805<>().registerRule(this);
        new Rule0806<>().registerRule(this);
        new Rule0807<>().registerRule(this);
        new Rule0808<>().registerRule(this);
        new Rule0809<>().registerRule(this);
        new Rule0810<>().registerRule(this);
        new Rule0811<>().registerRule(this);
        new Rule0812<>().registerRule(this);
        new Rule0813<>().registerRule(this);
        
        //Unit
        new Rule1201<>().registerRule(this);
        
        //Constraint
        new Rule1301<>().registerRule(this);
        new Rule1302<>().registerRule(this);
        new Rule1303<>().registerRule(this);
        new Rule1304<>().registerRule(this);
        new Rule1305<>().registerRule(this);
        new Rule1306<>().registerRule(this);
        new Rule1307<>().registerRule(this);
        new Rule1308<>().registerRule(this);
        new Rule1309<>().registerRule(this);
        
        
        //Data
        new Rule1401<>().registerRule(this);
        new Rule1402<>().registerRule(this);
        new Rule1403<>().registerRule(this);
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
