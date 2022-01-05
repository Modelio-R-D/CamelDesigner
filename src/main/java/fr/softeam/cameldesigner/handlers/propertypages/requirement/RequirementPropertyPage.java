package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ef58284b-ef08-4a0d-af88-a06df64a2574")
public abstract class RequirementPropertyPage<T extends Requirement> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("2feca759-ec3d-47f1-8835-b9fba3ec8800")
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
    @objid ("4cf649fd-5c93-49fc-9beb-9e639e8d799a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("941a580d-e687-4fb5-a122-ccf6f5c94663")
    public RequirementPropertyPage(T elt) {
        super(elt);
    }

}
