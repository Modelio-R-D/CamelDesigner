package fr.softeam.cameldesigner.handlers.propertypages.location;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c4645b49-5a42-4f63-a315-9de67ad4ef1f")
public class GeographicalRegionPropertyPage<T extends GeographicalRegion> extends LocationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("183fa2dd-a883-453c-aac5-190c1fb4eb6e")
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
    @objid ("b8cebff1-008a-461e-bbad-0f3f2d24133a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("36602fac-8a28-4e02-acb9-3af74ddb4095")
    public GeographicalRegionPropertyPage(T elt) {
        super(elt);
    }

}
