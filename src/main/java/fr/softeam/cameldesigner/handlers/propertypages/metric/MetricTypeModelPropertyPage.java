package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("0b20bcdf-858a-4eab-abc0-ff9c39b25dfd")
public class MetricTypeModelPropertyPage<T extends MetricTypeModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ae22b0ef-5b91-4044-97d9-0e69a1707610")
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
    @objid ("1a254b9a-2ec2-4ea3-81d7-b465eead2ef0")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("5c1dc041-4f95-4544-9de4-5d169b360f10")
    public MetricTypeModelPropertyPage(T elt) {
        super(elt);
    }

}
