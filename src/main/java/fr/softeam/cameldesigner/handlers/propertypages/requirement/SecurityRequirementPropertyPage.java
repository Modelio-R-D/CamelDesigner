package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("2f2ccccc-5734-4779-b02d-abf1e0b40104")
public class SecurityRequirementPropertyPage<T extends SecurityRequirement> extends HardRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("be4bc280-2b63-4850-9902-1465b9204aa4")
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
    @objid ("99c5700d-8c7d-4d86-80af-f0116894e8b0")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("95dc37b1-59db-4cde-b7ba-9df1d992305e")
    public SecurityRequirementPropertyPage(T elt) {
        super(elt);
    }

}
