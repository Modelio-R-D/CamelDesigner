package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ab244714-3c3a-4e03-8dda-a8eb441d03b0")
public class FeatureInstancePropertyPage<T extends FeatureInstance> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("59d0fa9c-1bbc-40a7-bfbd-5b55719974a6")
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
    @objid ("eb48dc32-5214-47a8-96ad-cdb99eb069ed")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b2a65b46-f5c9-4558-b460-348a44a5d2d1")
    public FeatureInstancePropertyPage(T elt) {
        super(elt);
    }

}
