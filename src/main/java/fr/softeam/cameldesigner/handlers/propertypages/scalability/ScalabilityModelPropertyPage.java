package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("59c4b35e-ce3f-4496-961f-9a2e41b82806")
public class ScalabilityModelPropertyPage<T extends ScalabilityModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("885bfb21-b24e-4075-a72b-da086016da44")
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
    @objid ("b8f4e4ca-d90f-4690-95fa-8d4870456bc2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8296c32e-64ae-446a-8bb6-b47b551fed4a")
    public ScalabilityModelPropertyPage(T elt) {
        super(elt);
    }

}
