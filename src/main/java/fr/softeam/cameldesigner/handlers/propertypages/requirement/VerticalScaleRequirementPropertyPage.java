package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f90cde97-ed5f-4369-bc23-7dd8acd93e64")
public class VerticalScaleRequirementPropertyPage<T extends VerticalScaleRequirement> extends ScaleRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("518237cf-53a9-48b0-bc38-ab29907deb98")
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
    @objid ("daeb77ee-c596-4fe4-ba9d-990ad3f43132")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("9d21b2b2-2b50-4215-99a6-a457cc7e06ac")
    public VerticalScaleRequirementPropertyPage(T elt) {
        super(elt);
    }

}
