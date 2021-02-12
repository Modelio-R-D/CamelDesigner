package fr.softeam.cameldesigner.handlers.propertypage.deploymentinstanceproperties;

import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.handlers.propertypage.coreproperties.FeatureInstancePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class ComponentInstancePropertyPage<T extends ComponentInstance> extends FeatureInstancePropertyPage<T> {
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
        // TODO Auto-generated method stub
    }

    public ComponentInstancePropertyPage(T elt) {
        super(elt);
    }

}
