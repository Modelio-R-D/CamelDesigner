package fr.softeam.cameldesigner.constraintLang;

import java.util.Arrays;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("25db483a-f599-4fed-adb1-84f59910cdd4")
public class Interval {
    @objid ("aabb142a-1c54-435a-81f3-cb3bab121cdb")
    private boolean _inclMin = true;

    @objid ("4038483b-34ef-4909-942c-6ef8345bd812")
    private boolean _inclMax = true;

    @objid ("e7f86552-8aa8-4067-bfa8-5468b859934c")
    private double _min = 0;

    @objid ("d1c883dc-81de-41f1-8bcd-e7f7a980db2c")
    private double _max = 0;

    @objid ("226fd411-3a6b-49cd-97af-adf76cc375e3")
    private boolean _infiniteMin = false;

    @objid ("d03192f6-c328-4325-a4a0-81909858d157")
    private boolean _infiniteMax = false;

    @objid ("cf7c3136-d9f5-420b-b39f-40b3e5960fa8")
    public Interval(double min, double max, boolean inclMin, boolean inclMax) {
        this._inclMin = inclMin;
        this._inclMax = inclMax;
        this._min = min;
        this._max = max;
    }

    @objid ("1afe41f3-fecc-40f6-931d-9847964a6e15")
    public Interval() {
        this._infiniteMin = true;
        this._infiniteMax = true;
    }

    @objid ("d24df802-9102-4b3e-8514-0289280714cf")
    public boolean isMinIncluded() {
        return this._inclMin;
    }

    @objid ("8f8b95b6-907d-4981-b668-26ca1b14b925")
    public void setMinLimit(boolean inclMin, double min) {
        this._inclMin = inclMin;
        this._min = min;
    }

    @objid ("d54f7fa9-a7e6-4004-a3e6-09fc22744134")
    public void setMaxLimit(boolean inclMax, double max) {
        this._inclMax = inclMax;
        this._max = max;
    }

    @objid ("e3dc0e52-3150-4c86-bff4-f70c3bbc77bc")
    public void setMinIncluded(boolean _inclMin) {
        this._inclMin = _inclMin;
    }

    @objid ("93fed700-2e05-4351-b16c-2b5a591cedbd")
    public boolean isMaxIncluded() {
        return this._inclMax;
    }

    @objid ("9e9d516c-9229-4253-8337-616ef1461725")
    public void setMaxIncluded(boolean _inclMax) {
        this._inclMax = _inclMax;
    }

    @objid ("b45d25a1-d8ec-4761-94c0-3768778ebc43")
    public double getMin() {
        return this._min;
    }

    @objid ("dcb404cc-9500-4ee7-ac2f-187146c49d7a")
    public void setMin(double _min) {
        this._min = _min;
    }

    @objid ("6851480e-b699-43d0-877d-c87ab14359c3")
    public double getMax() {
        return _max;
    }

    @objid ("774260bc-590e-484e-8b56-9012cc113803")
    public void setMax(double _max) {
        this._max = _max;
    }

    @objid ("2ad26909-1d1d-46fa-87b5-807ca098997a")
    public Interval(String expr) {
        Operator op = null;
        
        final List<Operator> opAsList = Arrays.asList(Operator.values());
        for(Operator temp : opAsList){
            if (expr.contains(temp.toString())) {
                op = temp;
                break;
            }
        }
        
        expr.replaceFirst(op.toString(), " ");
        
        String[] exprTab = expr.split(" ");
        double value = 0.0;
        
        if (exprTab[0].contains(ConstraintSystem.THIS)) {
            value =  Double.valueOf(exprTab[1]);
        }else {
            value =  Double.valueOf(exprTab[0]);
            if (op.equals(Operator.LESS)) {
                op = Operator.BIGGER;
            } else if (op.equals(Operator.LESSTHAN)) {
                    op = Operator.BIGGERTHAN;
            } else if (op.equals(Operator.BIGGER)) {
                op = Operator.LESS;
            } else if (op.equals(Operator.BIGGERTHAN)) {
                op = Operator.LESSTHAN;
            }
        }
        
        
        switch (op) {
        
        // this == value
        case EQUALS:
            this._inclMin = true;
            this._inclMax = true;
            this._min = value;
            this._max = value;
            break;
        
            // this < value
        case LESS:
            this._inclMax = false;
            this._max = value;
            this._infiniteMin = true;
            break;
        
        
            // this <= value
        case LESSTHAN:
            this._inclMax = true;
            this._max = value;
            this._infiniteMin = true;
            break;
        
            // this > value
        case BIGGER:
            this._inclMin = false;
            this._min = value;
            this._infiniteMax = true;
            break;
        
            // this >= value
        case BIGGERTHAN:
            this._inclMin = true;
            this._min = value;
            this._infiniteMax = true;
            break;
        
        }
    }

    @objid ("ed29dc3b-e761-412e-97e1-bd27ce451192")
    public boolean isMinInfinite() {
        return this._infiniteMin;
    }

    @objid ("5ff26511-dd83-4ff4-b461-cd61c29738e8")
    public boolean isMaxInfinite() {
        return this._infiniteMax;
    }

}
