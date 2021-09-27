package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;

public class SoftwareComponentPropertyPage<T extends SoftwareComponent> extends CamelComponentPropertyPage<T> {

    private List<ModelElement> _requirementSet = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1){
            Class elt = (Class) getModelElt(this._requirementSet, value);
            if (RequirementSet.canInstantiate(elt)) {
                this._element.setRequirementSet(RequirementSet.safeInstantiate(elt));
            }
        }

        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Requirement Set
        this._requirementSet = RequirementSet.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Requirement", getCamelName(this._element.getRequirementSet()), getCamelNames(this._requirementSet));

    }

    public SoftwareComponentPropertyPage(T elt) {
        super(elt);
    }

}
