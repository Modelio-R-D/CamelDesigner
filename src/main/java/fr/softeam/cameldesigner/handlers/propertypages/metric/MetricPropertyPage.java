package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class MetricPropertyPage<T extends Metric> extends FeaturePropertyPage<T> {

    private List<ModelElement> _metricTemplate = null;

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
            Class elt = (Class) getModelElt(this._metricTemplate, value);
            if (MetricTemplate.canInstantiate(elt)) {
                this._element.setMetricTemplate(MetricTemplate.safeInstantiate(elt));
            }
        }

        this._currentRow -= 1;
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

      //Template
        this._metricTemplate = MetricTemplate.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Template", getCamelName(this._element.getMetricTemplate()), getCamelNames(this._metricTemplate));

    }

    public MetricPropertyPage(T elt) {
        super(elt);
    }

}
