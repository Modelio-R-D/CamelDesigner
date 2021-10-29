package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;

public class DeploymentTypeModelPropertyPage<T extends DeploymentTypeModel> extends DeploymentModelPropertyPage<T> {
		
    private List<ModelElement> _globalRequirementSet = null;

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
        
        switch(this._currentRow){
        	
        case 1:
        	 Class elt = (Class) getModelElt(this._globalRequirementSet, value);
             if (RequirementSet.canInstantiate(elt)) {
                 this._element.setGlobalRequirementSet(RequirementSet.safeInstantiate(elt));
             }
        break;
        
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
        
        //Global Requirement Set
        this._globalRequirementSet = RequirementSet.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Global Requirement Set", getCamelName(this._element.getGlobalRequirementSet()), getCamelNames(this._globalRequirementSet));

    }

    public DeploymentTypeModelPropertyPage(T elt) {
        super(elt);
    }

}
