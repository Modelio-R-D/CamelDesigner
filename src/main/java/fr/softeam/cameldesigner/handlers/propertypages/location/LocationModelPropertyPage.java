package fr.softeam.cameldesigner.handlers.propertypages.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4343ebc7-f7ea-4335-a357-b0557e943fa4")
public class LocationModelPropertyPage<T extends LocationModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("55412d7f-0143-4596-9f6a-5b1dea1ba0cf")
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
    @objid ("e179bede-e696-43ba-a4a0-a675ddcab62f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("bb4d76e8-b719-4774-82c9-a25a214827b1")
    public LocationModelPropertyPage(T elt) {
        super(elt);
    }

}
