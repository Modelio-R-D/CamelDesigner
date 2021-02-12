package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class FeaturePortPropertyPage<T extends FeaturePort> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public int changeProperty(int row, String value) {
        return super.changeProperty(row, value);
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
    }

    public FeaturePortPropertyPage(T elt) {
        super(elt);
    }

}
