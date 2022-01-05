package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c311595b-d940-4684-971a-dd07d8dd0fc4")
public class ScaleRequirementPropertyPage<T extends ScaleRequirement> extends RequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d7ab60ff-fb87-469c-874f-4a04d2949e30")
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
    @objid ("ff167d19-5fd0-43f3-adac-d3839470a648")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("fb55bd98-4f81-4aa0-902d-1e516c8dad60")
    public ScaleRequirementPropertyPage(T elt) {
        super(elt);
    }

}
