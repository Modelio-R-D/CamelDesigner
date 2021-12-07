package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("57168fe4-822a-4e0e-b19c-cb57904177e4")
public class RawMetricPropertyPage<T extends RawMetric> extends MetricPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("28853ce1-ba1c-421b-ab17-5b8b903942dc")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("ad169529-fdef-4c0f-8777-6f9eaf96176d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("58984a90-c5e6-4c6f-8d28-348d8f023591")
    public RawMetricPropertyPage(T elt) {
        super(elt);
    }

}
