package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4a0c17ac-03b9-405a-ae83-6619be1bb327")
public class MmsConceptPropertyPage<T extends MmsConcept> extends MmsObjectPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b3879bf8-9557-4e2e-9727-ef3fb7d5bcd2")
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
    @objid ("81f3dcc3-97ac-4f8c-ae7a-16208ee6cce5")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("46f4bb70-e5f0-4c71-b998-3cfcd96bf5d0")
    public MmsConceptPropertyPage(T elt) {
        super(elt);
    }

}
