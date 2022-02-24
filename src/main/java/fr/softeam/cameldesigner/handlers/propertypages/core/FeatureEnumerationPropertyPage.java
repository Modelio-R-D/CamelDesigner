package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("09ed4340-c04b-4a96-bce3-f5aaa82d33ba")
public class FeatureEnumerationPropertyPage<T extends FeatureEnumeration> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a2427f7d-90f6-4d0e-a7e9-5f6a0a8a7023")
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
    @objid ("c76762a8-ccff-4dec-87c9-38bc6dc8145e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("79f24cdd-1cc3-466d-9404-455dce67780c")
    public FeatureEnumerationPropertyPage(T elt) {
        super(elt);
    }

}
