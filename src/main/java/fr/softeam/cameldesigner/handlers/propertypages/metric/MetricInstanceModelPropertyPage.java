package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6d55ece7-b9c8-47ab-9f9b-c767bc8cc891")
public class MetricInstanceModelPropertyPage<T extends MetricInstanceModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c808eff3-94b1-4b26-87a7-07404c0b8ca4")
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
    @objid ("c8b7ddb2-aeb6-4a67-b516-6a28f3401f0d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("90c1bbf6-9deb-4fb5-b0dd-cdc695ca3068")
    public MetricInstanceModelPropertyPage(T elt) {
        super(elt);
    }

}
