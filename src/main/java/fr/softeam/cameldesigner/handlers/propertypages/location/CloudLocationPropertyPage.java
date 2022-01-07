package fr.softeam.cameldesigner.handlers.propertypages.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6742798b-5010-4709-a1d9-929b26d0ed83")
public class CloudLocationPropertyPage<T extends Location> extends LocationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("78374501-d2b6-40d8-94a4-a9de16db216e")
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
    @objid ("f4858ac1-63d1-4c49-821f-6c05ebec4612")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("3f21ac48-1cc7-489b-9fbc-36f7d8b8e7a2")
    public CloudLocationPropertyPage(T elt) {
        super(elt);
    }

}
