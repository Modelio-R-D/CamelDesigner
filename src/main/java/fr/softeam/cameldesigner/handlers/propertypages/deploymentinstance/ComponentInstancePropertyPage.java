package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureInstancePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("b2b789c7-eda0-4cca-b3c3-ca8d711cc7dc")
public abstract class ComponentInstancePropertyPage<T extends ComponentInstance> extends FeatureInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("35007b85-8090-45c2-91dc-d97243871452")
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
    @objid ("3be3da5f-9f5f-430b-889d-67ac7d948275")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("337af7f4-8197-4a43-b76e-134c80b9cb76")
    public ComponentInstancePropertyPage(T elt) {
        super(elt);
    }

}
