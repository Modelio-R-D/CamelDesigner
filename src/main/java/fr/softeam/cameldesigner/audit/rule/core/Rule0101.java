package fr.softeam.cameldesigner.audit.rule.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.audit.CheckerPlan;
import fr.softeam.cameldesigner.audit.rule.AbstractRule;

@objid ("1f06115e-689c-4bb0-a4a2-dc57abfb72a3")
public class Rule0101<T extends CamelAttribute> extends AbstractRule<T> {
    @objid ("5a168a5a-033b-46b2-b559-e3b12e5e9059")
    private static final String RULEID = "R0101";

    @objid ("859ca8ca-63e5-4477-bcbc-3ae73d6049df")
    @Override
    public boolean isViolated(T context) {
        //     "if (self.valueType <> null)\r\n" +
        //     "                        then if (self.valueType.oclIsTypeOf(camel::type::Range))\r\n" +
        //     "                            then if (v.oclIsTypeOf(camel::type::BooleanValue) or v.oclIsTypeOf(camel::type::StringValue))\r\n" +
        //     "                                then false\r\n" +
        //     "                                else if (v.oclIsTypeOf(camel::type::IntValue))\r\n" +
        //     "                                    then\r\n" +
        //     "                                        self.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::IntValue).value.oclAsType(ecore::EDouble))\r\n" +
        //     "                                    else if (v.oclIsTypeOf(camel::type::FloatValue))\r\n" +
        //     "                                        then\r\n" +
        //     "                                            self.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::FloatValue).value.oclAsType(ecore::EDouble))\r\n" +
        //     "                                        else\r\n" +
        //     "                                            self.valueType.oclAsType(camel::type::Range).includesValue(v.oclAsType(camel::type::DoubleValue).value)\r\n" +
        //     "                                        endif\r\n" +
        //     "                                    endif\r\n" +
        //     "                                endif\r\n" +
        //     "                            else if (self.valueType.oclIsTypeOf(camel::type::RangeUnion))\r\n" +
        //     "                                then if (v.oclIsTypeOf(camel::type::BooleanValue) or v.oclIsTypeOf(camel::type::StringValue))\r\n" +
        //     "                                    then false\r\n" +
        //     "                                    else if (v.oclIsTypeOf(camel::type::IntValue))\r\n" +
        //     "                                        then\r\n" +
        //     "                                            self.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::IntValue).value.oclAsType(ecore::EDouble))\r\n" +
        //     "                                        else if (v.oclIsTypeOf(camel::type::FloatValue))\r\n" +
        //     "                                            then\r\n" +
        //     "                                                self.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::FloatValue).value.oclAsType(ecore::EDouble))\r\n" +
        //     "                                            else\r\n" +
        //     "                                                self.valueType.oclAsType(camel::type::RangeUnion).includesValue(v.oclAsType(camel::type::DoubleValue).value)\r\n" +
        //     "                                            endif\r\n" +
        //     "                                        endif\r\n" +
        //     "                                    endif\r\n" +
        //     "                                else if (self.valueType.oclIsTypeOf(camel::type::List))\r\n" +
        //     "                                    then (self.valueType.oclAsType(camel::type::List).checkValueType(v) and\r\n" +
        //     "                                        self.valueType.oclAsType(camel::type::List).includesValue(v))\r\n" +
        //     "                                    else if (self.valueType.oclIsTypeOf(camel::type::StringValueType))\r\n" +
        //     "                                         then v.oclIsTypeOf(camel::type::StringValue)\r\n" +
        //     "                                         else if (self.valueType.oclIsTypeOf(camel::type::BooleanValueType))\r\n" +
        //     "                                                then v.oclIsTypeOf(camel::type::BooleanValue)\r\n" +
        //     "                                                else false\r\n" +
        //     "                                                endif\r\n" +
        //     "                                            endif\r\n" +
        //     "                                        endif\r\n" +
        //     "                                    endif\r\n" +
        //     "                            endif\r\n" +
        //     "                        else if (diff and self.value <> null)\r\n" +
        //     "                            then self.value.valueEquals(v)\r\n" +
        //     "                            else false\r\n" +
        //     "                            endif\r\n" +
        //     "                        endif";
        return false;
    }

    @objid ("c5d6fb6e-37e3-49e7-9212-0db7a61a074d")
    @Override
    public String getDescription(T elt) {
        return "Type and value are not compatible";
    }

    @objid ("bb80bdb0-67b8-4e0e-b90e-9e0f693e7177")
    @Override
    public String getRuleId() {
        return Rule0101.RULEID;
    }

    @objid ("f07f63c8-b88f-49a1-9b25-a7b30f71a0d5")
    @Override
    public void registerRule(CheckerPlan plan) {
        plan.registerRule(T.STEREOTYPE_NAME, this);
    }

}
