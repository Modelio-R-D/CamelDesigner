package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.FeaturePackage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("d32df3f4-bef9-487e-bd95-a5da94c8d85b")
public class FeaturePackagePropertyPage<T extends FeaturePackage> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c2d2e6aa-a5d8-4fce-b871-9da86a646ba2")
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
    @objid ("04b2305a-b787-46ce-9fff-c274019787ac")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ee1c377a-f29b-4965-8b9d-983ca96046ab")
    public FeaturePackagePropertyPage(T elt) {
        super(elt);
    }

}
