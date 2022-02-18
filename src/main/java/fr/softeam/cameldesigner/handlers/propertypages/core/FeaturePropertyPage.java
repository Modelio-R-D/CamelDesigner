package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;

@objid ("aebd7a8d-0e48-4406-aeee-bc15bdd48d2e")
public abstract class FeaturePropertyPage<T extends Feature> extends ExpendableElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("fcd5215a-63f0-4e74-802d-4fd3c34d7e78")
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
    @objid ("ec522ec1-2278-4026-98d5-49ec09b9bbf5")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("23d10a64-679e-4147-8348-059bc57eb4c9")
    public FeaturePropertyPage(T elt) {
        super(elt);
    }

}
