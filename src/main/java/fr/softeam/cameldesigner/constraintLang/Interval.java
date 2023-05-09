package fr.softeam.cameldesigner.constraintLang;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("25db483a-f599-4fed-adb1-84f59910cdd4")
public class Interval {
    @objid ("aabb142a-1c54-435a-81f3-cb3bab121cdb")
    private boolean _inclMin = true;

    @objid ("4038483b-34ef-4909-942c-6ef8345bd812")
    private boolean _inclMax = true;

    @objid ("e7f86552-8aa8-4067-bfa8-5468b859934c")
    private double _min;

    @objid ("d1c883dc-81de-41f1-8bcd-e7f7a980db2c")
    private double _max;

    @objid ("cf7c3136-d9f5-420b-b39f-40b3e5960fa8")
    public Interval(double min, double max, boolean inclMin, boolean inclMax) {
        this._inclMin = inclMin;
        this._inclMax = inclMax;
        this._min = min;
        this._max = max;
    }

    @objid ("1afe41f3-fecc-40f6-931d-9847964a6e15")
    public Interval() {
    }

    @objid ("d24df802-9102-4b3e-8514-0289280714cf")
    public boolean isMinInclude() {
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
    public void set_inclMax(boolean _inclMax) {
        this._inclMax = _inclMax;
    }

    @objid ("b45d25a1-d8ec-4761-94c0-3768778ebc43")
    public double get_min() {
        return _min;
    }

    @objid ("dcb404cc-9500-4ee7-ac2f-187146c49d7a")
    public void set_min(double _min) {
        this._min = _min;
    }

    @objid ("6851480e-b699-43d0-877d-c87ab14359c3")
    public double get_max() {
        return _max;
    }

    @objid ("774260bc-590e-484e-8b56-9012cc113803")
    public void set_max(double _max) {
        this._max = _max;
    }

}
