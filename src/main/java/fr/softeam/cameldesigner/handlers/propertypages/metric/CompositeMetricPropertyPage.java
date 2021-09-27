package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.DataType;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;

public class CompositeMetricPropertyPage<T extends CompositeMetric> extends MetricPropertyPage<T> {

    private List<ModelElement> _componentsMetrics = null;

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
            this._element.setFormula(value);
        }

        else if(this._currentRow == 2){
            DataType elt = (DataType) getModelElt(this._componentsMetrics, value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComponentMetrics((Metric) mmsObj);
                }else {
                    this._element.removeComponentMetrics((Metric) mmsObj);
                }
            }
        }


        this._currentRow -= 2;
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

        //Formula
        table.addProperty("Formula", this._element.getFormula());

        //Component Metric
        this._componentsMetrics = CamelDesignerAbstractProxy.getMetrics();
        table.addProperty("Component Metric", getCamelValue(this._element.getComponentMetrics()), getAddRemove(this._componentsMetrics, this._element.getComponentMetrics()));
    }

    public CompositeMetricPropertyPage(T elt) {
        super(elt);
    }

}
