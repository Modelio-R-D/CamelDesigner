package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4ac41a1d-a8df-4255-bb08-2927501d208a")
public class MetricObjectBindingPropertyPage<T extends MetricObjectBinding> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c088da19-52f0-44d8-a93e-aadd97a5a346")
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
    @objid ("d4c84ebd-d4de-41cc-9a08-f32b4d1bebc4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("e809ff60-1829-4af8-b303-0df19ca65718")
    public MetricObjectBindingPropertyPage(T elt) {
        super(elt);
    }

}
