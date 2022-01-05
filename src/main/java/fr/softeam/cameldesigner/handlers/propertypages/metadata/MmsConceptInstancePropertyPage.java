package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("d7c307de-870d-465a-b28e-e4fc9e5a3cae")
public class MmsConceptInstancePropertyPage<T extends MmsConceptInstance> extends MmsObjectPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b7598125-5c6b-4d96-84a4-6adb7a95ad1c")
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
    @objid ("28106014-6112-44d4-857a-9ebe47ca6d69")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ce9c0eb6-a065-4efd-a7ee-68756f6b9b78")
    public MmsConceptInstancePropertyPage(T elt) {
        super(elt);
    }

}
