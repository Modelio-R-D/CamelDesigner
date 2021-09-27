package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;

public class CompositeMetricContextPropertyPage<T extends CompositeMetricContext> extends MetricContextPropertyPage<T> {

    private List<ModelElement> _metricsContext = null;

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
            this._element.setGroupingType(value);
        }

        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._metricsContext, value);
            if ((elt!=null) &&(elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComposingMetricContexts((MetricContext) mmsObj);
                }else {
                    this._element.removeComposingMetricContexts((MetricContext) mmsObj);
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

        this._metricsContext = CamelDesignerAbstractProxy.getMetricContexts();

        //Grouping Type
        table.addProperty("Grouping Type", this._element.getGroupingType());

        //Composing Metric Context
        table.addProperty("Composing Metric Context", getCamelValue(this._element.getComposingMetricContexts()), getAddRemove(this._metricsContext, this._element.getComposingMetricContexts()));
    }

    public CompositeMetricContextPropertyPage(T elt) {
        super(elt);
    }

}
