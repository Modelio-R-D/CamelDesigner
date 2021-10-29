package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.DeploymentModelPropertyPage;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;


public class DeploymentInstanceModelPropertyPage<T extends DeploymentInstanceModel> extends DeploymentModelPropertyPage<T> {
  
    private List<ModelElement> _type = null;

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
        

        switch (this._currentRow) {

        case 1 :
        	Class elt = (Class) getModelElt(this._type, value);
            if (DeploymentTypeModel.canInstantiate(elt)) {
                this._element.setType(DeploymentTypeModel.safeInstantiate(elt));
            }

        break;
        }
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
        
        //Type
        this._type = DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));

    }

    public DeploymentInstanceModelPropertyPage(T elt) {
        super(elt);
    }

}
