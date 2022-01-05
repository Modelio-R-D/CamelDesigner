package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("08e0b08c-a6c4-4af7-a5b8-d933d69544d2")
public class SoftwareComponentResourceFilterPropertyPage<T extends SoftwareComponentResourceFilter> extends ResourceFilterPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("3017bd52-3e43-48c2-9d58-0b16d23f78df")
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
    @objid ("7f5fadeb-7ce4-45d4-bc48-205225ee3ca8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b5a5f7e0-6c59-4815-81b9-6271180888fe")
    public SoftwareComponentResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
