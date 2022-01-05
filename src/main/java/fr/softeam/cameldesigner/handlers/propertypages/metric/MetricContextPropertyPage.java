package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.statik.Class;

@objid ("b5a36342-be5b-4a41-b2a1-2c323f13b3ea")
public class MetricContextPropertyPage<T extends MetricContext> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c1d7fff7-7403-4103-b525-7e2c29c3f849")
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
            Class elt = (Class) getModelElt(Window.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (Window.canInstantiate(elt)) {
                this._element.setWindow(Window.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(Schedule.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (Schedule.canInstantiate(elt)) {
                this._element.setSchedule(Schedule.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 4){
            Class elt = (Class) getModelElt(ObjectContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if (ObjectContext.canInstantiate(elt)) {
                this._element.setObjectContext(ObjectContext.instantiate(elt));
            }
        }
        
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("d3b5dfeb-5ea9-461e-b0ed-b5688c038007")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Metric
        table.addProperty("Metric", getCamelName(this._element.getMetric()), getCamelNames(CamelDesignerAbstractProxy.getMetrics()));
        
        
        //Window
        table.addProperty("Window", getCamelName(this._element.getWindow()), getCamelNames(Window.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //Schedule
        table.addProperty("Schedule", getCamelName(this._element.getSchedule()), getCamelNames(Schedule.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
        
        //ObjectContext
        table.addProperty("ObjectContext", getCamelName(this._element.getObjectContext()), getCamelNames(ObjectContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement()));
    }

    @objid ("87a58030-7659-4752-8c6f-1ef91a958b89")
    public MetricContextPropertyPage(T elt) {
        super(elt);
    }

}
