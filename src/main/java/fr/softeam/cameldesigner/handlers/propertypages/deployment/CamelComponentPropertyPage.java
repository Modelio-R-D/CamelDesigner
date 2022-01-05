package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("b2d7522a-282b-4c34-93ce-a939a53019f5")
public class CamelComponentPropertyPage<T extends CamelComponent> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("71b35c55-26c9-460a-b32c-31136ce7fa47")
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
    @objid ("faf97f6c-2ff5-4479-b64f-f8615749bd21")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("de7bd2fc-2d89-4a27-bac3-3e2f8336300b")
    public CamelComponentPropertyPage(T elt) {
        super(elt);
    }

}
