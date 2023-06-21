package fr.softeam.cameldesigner.constraintLang;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("19e58393-b65b-44d4-b14b-a528bb3d1ae9")
public class SearchSpace {
    @objid ("ad361784-317b-4d34-a187-b4f3c8fb541a")
     Interval _currentSpace = null;

    @objid ("0311a7c1-0b51-40d6-8ef6-9fa58a9a4277")
    public SearchSpace(Interval interval) {
        this._currentSpace = interval;
    }

    @objid ("6f4deceb-54c9-42cb-bdab-b0acc7f7a940")
    public boolean addInterval(Interval interval) {
        if (this._currentSpace.isMinInfinite()) {
            if (interval.isMinInfinite()) {
                // ] -inf, max1] + ] -inf, max2]
                if (this._currentSpace.getMax() > interval.getMax()) {
                    this._currentSpace.setMax(interval.getMax());
                    this._currentSpace.setMaxIncluded(interval.isMaxIncluded());
                }
            }else if (interval.isMaxInfinite()) {
                // ] -inf, max] + [min, +inf [
                if (this._currentSpace.getMax() < interval.getMin()) {
                    this._currentSpace.setMax(interval.getMin());
                    this._currentSpace.setMaxIncluded(interval.isMinIncluded());
                }else {
                    return false;
                }
            }else {
             // ] -inf, max1] + [min, max2]
                if (this._currentSpace.getMax() < interval.getMin()) {
                    return false;
                }
        
                if (this._currentSpace.getMax() > interval.getMax()) {
                    this._currentSpace.setMax(interval.getMax());
                    this._currentSpace.setMaxIncluded(interval.isMaxIncluded());
                }
        
                if (this._currentSpace.getMax() > interval.getMin()) {
                        this._currentSpace.setMin(interval.getMin());
                        this._currentSpace.setMinIncluded(interval.isMinIncluded());
                }
            }
        
        }else if (interval.isMaxInfinite()){
        
            if (interval.isMaxInfinite()) {
                // [min1 , + inf [ + [min2 , + inf [
                if (this._currentSpace.getMin() < interval.getMin()) {
                    this._currentSpace.setMin(interval.getMin());
                    this._currentSpace.setMinIncluded(interval.isMinIncluded());
                }
            }else if (interval.isMinInfinite()) {
             // [min , + inf [ + ] -inf, max]
                if (this._currentSpace.getMin() < interval.getMax()) {
                    this._currentSpace.setMax(interval.getMax());
                    this._currentSpace.setMaxIncluded(interval.isMaxIncluded());
                }else {
                    return false;
                }
            }else {
                // [min1 , + inf [ +  [min2, max]
                if (this._currentSpace.getMin() > interval.getMax()) {
                    return false;
                  }
        
                if (this._currentSpace.getMin() < interval.getMin()) {
                    this._currentSpace.setMin(interval.getMin());
                    this._currentSpace.setMinIncluded(interval.isMinIncluded());
                }
        
                if (this._currentSpace.getMin() < interval.getMax()) {
                        this._currentSpace.setMax(interval.getMax());
                        this._currentSpace.setMaxIncluded(interval.isMaxIncluded());
                }
        
            }
        
        }else {
        
        
            if (interval.isMaxInfinite()) {
                // [min , max] + [min2 , + inf [
                if (this._currentSpace.getMax() > interval.getMin()) {
                    this._currentSpace.setMax(interval.getMin());
                    this._currentSpace.setMaxIncluded(interval.isMinIncluded());
                }else {
                    return false;
                }
            }else if (interval.isMinInfinite()) {
              // [min , max] + ] -inf, max]
                if (this._currentSpace.getMin() < interval.getMax()) {
                    this._currentSpace.setMin(interval.getMax());
                    this._currentSpace.setMinIncluded(interval.isMaxIncluded());
                }else {
                    return false;
                }
            }else {
             // [min1 , max1] +  [min2, max2]
                if (this._currentSpace.getMin() > interval.getMax()) {
                    return false;
                 }
        
                if (this._currentSpace.getMax() < interval.getMin()) {
                    return false;
                 }
        
                if (this._currentSpace.getMin() < interval.getMin()) {
                    this._currentSpace.setMin(interval.getMin());
                    this._currentSpace.setMinIncluded(interval.isMinIncluded());
                }
        
                if (this._currentSpace.getMax() > interval.getMax()) {
                        this._currentSpace.setMax(interval.getMax());
                        this._currentSpace.setMaxIncluded(interval.isMaxIncluded());
                }
        
            }
        }
        return true;
    }

}
