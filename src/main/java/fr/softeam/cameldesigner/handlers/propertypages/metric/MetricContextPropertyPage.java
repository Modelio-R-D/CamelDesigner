package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class MetricContextPropertyPage<T extends MetricContext> extends FeaturePropertyPage<T> {

    private List<ModelElement> _metric = null;

    private List<ModelElement> _window = null;

    private List<ModelElement> _schedule = null;

    private List<ModelElement> _objectContext = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);


        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._metric, value);
            if (Metric.canInstantiate(elt)) {
                this._element.setMetric(Metric.instantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._window, value);
            if (Window.canInstantiate(elt)) {
                this._element.setWindow(Window.instantiate(elt));
            }
        }

        else if(this._currentRow == 3){
            Class elt = (Class) getModelElt(this._schedule, value);
            if (Schedule.canInstantiate(elt)) {
                this._element.setSchedule(Schedule.instantiate(elt));
            }
        }

        else if(this._currentRow == 4){
            Class elt = (Class) getModelElt(this._objectContext, value);
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Metric
        this._metric = CamelDesignerAbstractProxy.getMetrics();
        table.addProperty("Metric", getCamelName(this._element.getMetric()), getCamelNames(this._metric));


        //Window
        this._window = Window.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Window", getCamelName(this._element.getWindow()), getCamelNames(this._window));

        //Schedule
        this._schedule = Schedule.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Schedule", getCamelName(this._element.getSchedule()), getCamelNames(this._schedule));

        //ObjectContext
        this._objectContext = ObjectContext.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("ObjectContext", getCamelName(this._element.getObjectContext()), getCamelNames(this._objectContext));
    }

    public MetricContextPropertyPage(T elt) {
        super(elt);
    }

}
