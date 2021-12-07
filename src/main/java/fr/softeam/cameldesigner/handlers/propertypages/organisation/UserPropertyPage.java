package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4812670e-caff-4138-b631-31680cc8d41b")
public class UserPropertyPage<T extends User> extends EntityPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f9cf83d2-7f29-4699-8362-f140c3769069")
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
    @objid ("4e165582-9e5b-49c4-8a8f-cd3d73356a6e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8b973fb1-dd2d-431e-82b3-19bcff01a6e1")
    public UserPropertyPage(T elt) {
        super(elt);
    }

}
