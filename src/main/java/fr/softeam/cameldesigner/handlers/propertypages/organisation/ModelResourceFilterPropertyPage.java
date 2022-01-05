package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a7790291-94c7-4d19-aa8c-42af0604d5b4")
public class ModelResourceFilterPropertyPage<T extends ModelResourceFilter> extends ResourceFilterPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("6c7f1b69-0a35-47d8-a084-4478ffe4d726")
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
    @objid ("ee1156cb-a56c-4a3d-84c4-c68b973a33aa")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("03cb100c-f750-43e1-8b48-2f5bf1b51e75")
    public ModelResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
