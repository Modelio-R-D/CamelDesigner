package fr.softeam.cameldesigner.constraintLang;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;

@objid ("2b2bc71d-3a0d-4a4e-a1e8-70251e4ad18f")
public class ConstraintSystem {
    @objid ("21bdc818-6c74-4703-9f39-2ede47862066")
    public static final String THIS = "this";

    @objid ("e07a761d-1c44-4d4e-8986-425d80e945ac")
    private static List<Constraint> _syst = new ArrayList();

    @objid ("ffe85ff6-909f-4989-918f-e963a0fe0faa")
    public static void removeConstraint(Constraint elt) {
        _syst.remove(elt);
    }

    @objid ("36b0a93b-ecff-4ee7-ae46-048632aec087")
    public static boolean addConstraint(Constraint elt) {
        _syst.add(elt);
        return checkSearchSpace(elt);
    }

    @objid ("457ef8e4-e328-40ee-837c-333c129f62ff")
    private static boolean checkSearchSpace(Constraint elt) {
        List<Constraint> toEvaluates = new ArrayList();
        
        List<UmlModelElement> constrainedElt = elt.getConstrainedElement();
        
        final String bodyRef = elt.getBody();
        String[] refEquation = formatize(bodyRef);
        
        for (Constraint syst : _syst) {
            for (UmlModelElement sysConstrElt : syst.getConstrainedElement()) {
                String body = syst.getBody();
                if ((constrainedElt.contains(sysConstrElt))
                        && (body.contains(THIS))
                        && (isRelevant(formatize(body), refEquation))) {
                    toEvaluates.add(syst);
                }
            }
        }
        
        if (toEvaluates.size() > 1) {
            SearchSpace space = new SearchSpace(new Interval(bodyRef));
            for(Constraint toEvaluate: toEvaluates) {
                if (!(space.addInterval(new Interval(toEvaluate.getBody())))){
                    return false;
                }
            }
        }
        return true;
    }

    @objid ("01c75994-f059-4b44-80fa-ae7dda28ce1a")
    private static String[] formatize(String expr) {
        for(Operator op : Arrays.asList(Operator.values())) {
            expr.replaceFirst(op.toString(), " ");
        }
        return expr.split(" ");
    }

    @objid ("8ca47008-2565-4acc-afd9-460f95f3681f")
    private static boolean isRelevant(String[] expr1, String[] expr2) {
        String var1 = "";
        String var2 = "";
        
        for(String temp : Arrays.asList(expr1)) {
            if (temp.contains(THIS)) {
                var1 = temp;
            }
        }
        
        for(String temp : Arrays.asList(expr2)) {
            if (temp.contains(THIS)) {
                var2 = temp;
            }
        }
        return var1.equals(var2);
    }

}
