package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;

public class OptimisationRequirementPropertyPage<T extends OptimisationRequirement> extends NamedElementPropertyPage<T> {
    private static List<ModelElement> _metricContexts;

    private static List<ModelElement> _metricVariables;

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

        switch (this._currentRow) {

        case 1 :
            if (value.equals("")) {
                this._element.setMetricContext(null);
            }else {
                ModelElement metricContex = getModelElt(_metricContexts, value);
                if (MetricContext.canInstantiate(metricContex)) {
                    this._element.setMetricContext((MetricContext) CamelDesignerProxyFactory.instantiate(metricContex));
                }
            }
            break;

        case 2 :
            if (value.equals("")) {
                this._element.setMetricVariable(null);
            }else {
                ModelElement metricVariable = getModelElt(_metricVariables, value);
                if (MetricVariable.canInstantiate(metricVariable)) {
                    this._element.setMetricVariable((MetricVariable) CamelDesignerProxyFactory.instantiate(metricVariable));
                }
            }
            break;

        case 3 :
            Boolean minimise = Boolean.valueOf(value);
            this._element.setMinimise(minimise);
            break;
        }
        this._currentRow -= 3;
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

        //MetricContext
        table.addProperty("Metric Context", getCamelName(this._element.getMetricContext()), getCamelNames(this._metricContexts));

        //MetricVariable
        table.addProperty("Metric Variable", getCamelName(this._element.getMetricVariable()), getCamelNames(this._metricVariables));

        //Mimimise
        table.addProperty("Minimise", this._element.isMinimise());
    }

    public OptimisationRequirementPropertyPage(T elt) {
        super(elt);

        _metricContexts = CamelDesignerAbstractProxy.getMetricContexts();

        _metricVariables = MetricVariable.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
    }

}
