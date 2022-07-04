package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.DeploymentModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("17b7995a-c56c-443d-8c73-08e8b18aa3fb")
public class DeploymentInstanceModelPropertyPage<T extends DeploymentInstanceModel> extends DeploymentModelPropertyPage<T> {
    @objid ("14cf5ed3-4e3b-4626-aab3-bb0100d9bfa2")
    private List<ModelElement> _type = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b018a0bf-936e-4aff-ab91-7a1e90c13933")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME)) {
                this._element.setType((DeploymentTypeModel) elt);
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
    @objid ("ad922f0d-4e1a-4655-b607-3cf0b43b924c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._type = DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

    @objid ("6f75b84c-da51-45f4-a21b-e51dbf5e7191")
    public DeploymentInstanceModelPropertyPage(T elt) {
        super(elt);
    }

}
