package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("80b312af-7a22-4747-a196-c319c6ca85bd")
public class OrganisationModelPropertyPage<T extends OrganisationModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c2df78f4-fb10-46ea-b555-6f08c86395b7")
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
    @objid ("b65e5839-7c71-4aa5-a3a8-9f0fa327bcdb")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ad561f86-ce12-4ca5-829b-3cf178c81e96")
    public OrganisationModelPropertyPage(T elt) {
        super(elt);
    }

}
