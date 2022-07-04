package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("cbc1abbb-dbd3-40ff-b96b-cccf08a83d86")
public class DeploymentTypeModelPropertyPage<T extends DeploymentTypeModel> extends DeploymentModelPropertyPage<T> {
    @objid ("1c6c07ee-7e6c-4d2b-ada5-a2000d811585")
    private List<ModelElement> _globalRequirementSet = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ee00d49a-7cca-453e-97c2-c56d80d5cf9a")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            ModelElement elt = getModelElt(this._globalRequirementSet, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementSet.STEREOTYPE_NAME)) {
                this._element.setGlobalRequirementSet((RequirementSet) elt);
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
    @objid ("f1dd369a-fb09-4c18-9be1-e227ec3bc340")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //GlobalRequirementSet
        this._globalRequirementSet = RequirementSet.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Global Requirement Set", getCamelName(this._element.getGlobalRequirementSet()), getCamelNames(this._globalRequirementSet));
    }

    @objid ("35de5bc6-e07d-4312-846f-713794645dfc")
    public DeploymentTypeModelPropertyPage(T elt) {
        super(elt);
    }

}
