package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("3529635a-263b-48e5-8483-7ecec3f65e34")
public class RoleAssignmentPropertyPage<T extends RoleAssignment> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a29199b8-ef0d-41d2-adb8-99a860b66e1a")
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
    @objid ("32865b8b-8c8c-4a89-aaca-f90a5124f38f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d0420eae-80f4-4a67-834c-c0af18400aa8")
    public RoleAssignmentPropertyPage(T elt) {
        super(elt);
    }

}
