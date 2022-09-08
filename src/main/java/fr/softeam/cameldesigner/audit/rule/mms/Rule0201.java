package fr.softeam.cameldesigner.audit.rule.mms;

import camel.mms.MmsPropertyType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("517f2282-12ca-453a-821f-d42ff335a6eb")
public class Rule0201<T extends MmsProperty> extends AbstractRule<T> {
    @objid ("82b045bf-cbfd-4fc2-a36d-830f01881596")
    private static final String RULEID = "R0201";

    @objid ("1026be8d-c594-4012-af03-bed6f8797645")
    @Override
    public boolean isViolated(T context) {
        String propType = context.getPropertyType();
        if  (propType == null) {
            return true;
        }
        
        try {
           return  (MmsPropertyType.getByName(propType) == null);
        }catch (@SuppressWarnings ("unused") Exception e) {
            return true;
        }
    }

    @objid ("90a87791-cdc8-4245-a35a-d4895e620b89")
    @Override
    public String getDescription(T elt) {
        return "Property Type of " + elt.getName() + " is not well defined.";
    }

    @objid ("aaf4fa19-18b2-4fd0-89cb-ccf6a593045e")
    @Override
    public String getRuleId() {
        return Rule0201.RULEID;
    }

    @objid ("b560ba9e-346c-4045-8eb4-cc783d23f572")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
