package fr.softeam.cameldesigner.handlers.propertypages.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("dddeaf79-ee7a-4839-a81a-0d3ff3eb1bdb")
public abstract class DataModelPropertyPage<T extends DataModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("df35177c-4317-4f8d-976e-be6e7e1a8e80")
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
    @objid ("405d6a10-70d6-4f92-92e5-ee5acd22f90c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("c3c47860-f524-42f5-9bd5-eb99fa2b3d10")
    public DataModelPropertyPage(T elt) {
        super(elt);
    }

}
