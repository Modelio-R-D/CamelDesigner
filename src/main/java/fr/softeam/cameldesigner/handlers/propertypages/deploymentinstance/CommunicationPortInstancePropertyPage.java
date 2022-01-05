package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePortPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("71f101cc-ef02-462d-a577-9abd6baedd3d")
public abstract class CommunicationPortInstancePropertyPage<T extends CommunicationPortInstance> extends FeaturePortPropertyPage<T> {
    @objid ("c51ede4b-d19d-48d5-9144-f9fa0ae4721f")
    public CommunicationPortInstancePropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("19bf788c-2bb0-4b5e-a409-cb39bb2dfc27")
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
    @objid ("f8cd32b1-805e-4319-9ea1-8223fd06667e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
