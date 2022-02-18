package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;

@objid ("53f0d1f2-8f76-43b0-b222-759fd70e5b7a")
public class MmsPropertyInstancePropertyPage<T extends MmsPropertyInstance> extends MmsObjectPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("32fb5469-aaf1-4173-9bd2-1f592f048f0e")
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
    @objid ("f4da08a4-956a-45a1-9016-49cf77c3729c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("a7f7392d-dcd1-4391-b8a2-a5fe2f453e0b")
    public MmsPropertyInstancePropertyPage(T elt) {
        super(elt);
    }

}
