package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.metricmodel.standard.attribute.WindowCriterion;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.handlers.propertypages.core.ExpendableElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("101af79e-9597-47d9-b6a2-11f6ceb5bdb3")
public class WindowCriterionPropertyPage<T extends WindowCriterion> extends ExpendableElementPropertyPage<T> {
    @objid ("0aa1a9d1-7c09-4c6b-94ed-9706f2b5448c")
    public WindowCriterionPropertyPage(T elt) {
        super(elt);
        this._element.setAscending(false);
    }

    @objid ("e207c198-fe80-4346-b7bb-eca846e866cf")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(CamelDesignerAbstractProxy.getMetrics(), value);
            if (Metric.canInstantiate(elt)) {
                this._element.setMetric(Metric.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            this._element.setType(value);
        }
        
        else if(this._currentRow == 3){
            this._element.setCustom(value);
        }
        
        else if(this._currentRow == 4){
            this._element.setAscending(Boolean.valueOf(value));
        
        }
        this._currentRow -= 4;
    }

    @objid ("56ee9da5-5776-45d0-af44-5f8c4024ca4e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Metric
        table.addProperty("Metric", getCamelName(this._element.getMetric()), getCamelNames(CamelDesignerAbstractProxy.getMetrics()));
        table.addProperty("Type", getNotNull(this._element.getType()));
        table.addProperty("Custom", getNotNull(this._element.getCustom()));
        table.addProperty("Ascending",this._element.isAscending());
    }

}
