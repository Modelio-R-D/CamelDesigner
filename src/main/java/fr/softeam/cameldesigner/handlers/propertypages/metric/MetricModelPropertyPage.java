package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("fb8c188d-186b-4d6b-af56-05fdd5053d0b")
public class MetricModelPropertyPage<T extends MetricModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("54251bb9-6126-4ec1-b02c-41ac01c6df67")
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
    @objid ("cdb3e036-f9e4-42b8-a901-9e6c145289b2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("5bf0e031-3e48-4510-b22a-ae6b23c413a2")
    public MetricModelPropertyPage(T elt) {
        super(elt);
    }

}
