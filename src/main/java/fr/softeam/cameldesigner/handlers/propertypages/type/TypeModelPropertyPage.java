package fr.softeam.cameldesigner.handlers.propertypages.type;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("b543f44d-f65a-4908-a287-a4f664b43bcf")
public class TypeModelPropertyPage<T extends TypeModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("32c97b53-f6b0-476e-b32a-7c9826e4a09c")
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
    @objid ("d8353422-9b93-473b-88ef-41e3daead88f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("c7c93852-01b2-4223-b569-6f813e6410f6")
    public TypeModelPropertyPage(T elt) {
        super(elt);
    }

}
