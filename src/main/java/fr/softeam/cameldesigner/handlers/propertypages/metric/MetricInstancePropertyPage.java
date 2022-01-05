package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureInstancePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("5e3b1e18-9b01-4d32-81cb-8b728aebd248")
public class MetricInstancePropertyPage<T extends MetricInstance> extends FeatureInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("06938158-21da-4f9a-89f5-a1f8faaa25af")
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
    @objid ("6955a07d-d325-479a-9a2b-7f5058de3c1d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("81b52169-d819-44c1-8768-bb8c1cadd05d")
    public MetricInstancePropertyPage(T elt) {
        super(elt);
    }

}
