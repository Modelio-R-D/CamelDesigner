package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("054fccb6-5a99-476a-8a80-14d1c2a44dde")
public abstract class HardRequirementPropertyPage<T extends HardRequirement> extends RequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("669568d2-7dbc-4830-8988-d4988ee0a0e1")
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
    @objid ("baf46a72-6649-44bb-b0cb-de40abe71fb4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("c9f27818-f5eb-4d71-b82e-456c91ee8ba1")
    public HardRequirementPropertyPage(T elt) {
        super(elt);
    }

}
