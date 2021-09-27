package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.DataType;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;

public class MetricVariablePropertyPage<T extends MetricVariable> extends MetricPropertyPage<T> {

    private List<ModelElement> _component = null;

    private List<ModelElement> _componentMetrics = null;

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
            this._element.setCurrentConfiguration(Boolean.valueOf(value));
        }

        else if(this._currentRow == 2){
            Component elt = (Component) getModelElt(this._component, value);
            if (CamelComponent.canInstantiate(elt)) {
                this._element.setComponent(CamelComponent.instantiate(elt));
            }
        }

        else if(this._currentRow == 3){
            this._element.setOnNodeCandidates(Boolean.valueOf(value));
        }

        else if(this._currentRow == 4){
            this._element.setFormula(value);
        }

        else if(this._currentRow == 5){
            DataType elt = (DataType) getModelElt(this._componentMetrics, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME)) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addComponentMetrics((Metric) mmsObj);
                }else {
                    this._element.removeComponentMetrics((Metric) mmsObj);
                }
            }
        }


        this._currentRow -= 5;
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

        //Current Configuration
        table.addProperty("Current Configuration", this._element.isCurrentConfiguration());

      //Component
        this._component = CamelDesignerAbstractProxy.getComponents();
        table.addProperty("Component", getCamelName(this._element.getComponent()), getCamelNames(this._component));

        //On Node Candidates
        table.addProperty("On Node Candidates", this._element.isOnNodeCandidates());


        //Formula
        table.addProperty("Formula", this._element.getFormula());

        //ComponentMetric Context
        this._componentMetrics = CamelDesignerAbstractProxy.getMetrics();
        table.addProperty("Component Metric", getCamelValue(this._element.getComponentMetrics()), getAddRemove(this._componentMetrics, this._element.getComponentMetrics()));


    }

    public MetricVariablePropertyPage(T elt) {
        super(elt);
    }

}
