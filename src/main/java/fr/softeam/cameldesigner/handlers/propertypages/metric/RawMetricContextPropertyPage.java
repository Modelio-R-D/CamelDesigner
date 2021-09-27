package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Component;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;

public class RawMetricContextPropertyPage<T extends RawMetricContext> extends MetricContextPropertyPage<T> {

    private List<ModelElement> _sensor = null;

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
            Component elt = (Component) getModelElt(this._sensor, value);
            if (Sensor.canInstantiate(elt)) {
                this._element.setSensor(Sensor.instantiate(elt));
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

        //Sensor
        this._sensor = Sensor.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Sensor", getCamelName(this._element.getSensor()), getCamelNames(this._sensor));
    }

    public RawMetricContextPropertyPage(T elt) {
        super(elt);
    }

}
