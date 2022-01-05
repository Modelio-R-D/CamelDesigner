package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("7bafc03a-c9b1-49b1-b533-29738ca659e2")
public class FeatureClassPropertyPage<T extends FeatureClass> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("1292b038-f519-48d7-b211-043ab12d20a1")
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
    @objid ("4219e6d6-c6d3-4cd2-9fa8-16f1645d9d31")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("65b27811-2ef1-4560-b7e5-dce77efa1469")
    public FeatureClassPropertyPage(T elt) {
        super(elt);
    }

}
