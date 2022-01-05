package fr.softeam.cameldesigner.handlers.propertypages.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("da58af22-2d4b-4c5a-b0a3-37bc3ff2f96b")
public class LocationPropertyPage<T extends Location> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("dd6af44d-c82b-45dc-9696-33622d71c00f")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if (this._currentRow == 1)
            this._element.setId(value);
        
        this._currentRow -= 1 ;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("6c100c32-ba55-4f2e-9b2e-fff6b99529b8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Id",  getValue(this._element.getId()));
    }

    @objid ("e0111422-68ff-458c-a5bf-7e240a491b76")
    public LocationPropertyPage(T elt) {
        super(elt);
    }

}
