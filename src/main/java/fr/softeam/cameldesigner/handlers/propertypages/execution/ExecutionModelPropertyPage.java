package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("4dc6f448-f99a-45fc-820a-13c3b8e1f512")
public class ExecutionModelPropertyPage<T extends ExecutionModel> extends SubModelPropertyPage<T> {
    @objid ("868fdba8-26f5-4897-b1f3-d98178abfe4d")
    private List<ModelElement> _costUnit = null;

    @objid ("39277100-146f-4c74-90c1-c8c288ae175f")
    private List<ModelElement> _deploymentTypeModel = null;

    @objid ("7a70c3aa-adad-4851-83f1-c30ace3c51d0")
    private List<ModelElement> _requirementModel = null;

    @objid ("cabfe7cd-07c9-4eb9-8fd2-8a8afb077d08")
    private List<ModelElement> _dataTypeModel = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("67acb1dc-af84-4af8-b228-c23ad186e3d3")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setStartTime(value);
            break;
        
        case 2 :
            this._element.setEndTime(value);
            break;
        
        case 3 :
            this._element.setTotalCost(value);
            break;
            
        }
        
        if(this._currentRow == 4){
            ModelElement elt = getModelElt(this._costUnit, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Unit.STEREOTYPE_NAME)) {
                this._element.setCostUnit((Unit) elt);
            }
        }
        if(this._currentRow == 5){
            ModelElement elt = getModelElt(this._deploymentTypeModel, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DeploymentTypeModel.STEREOTYPE_NAME)) {
                this._element.setDeploymentTypeModel((DeploymentTypeModel) elt);
            }
        }
        
        
        else if(this._currentRow == 6){
            Class elt = (Class) getModelElt(this._requirementModel, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequirementModel.STEREOTYPE_NAME)) {
                this._element.setRequirementModel((RequirementModel) elt);
            }
        }
        
        else if(this._currentRow == 7){
            Class elt = (Class) getModelElt(this._dataTypeModel, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME)) {
                this._element.setDataTypeModel((DataTypeModel) elt);
            }
        }
        this._currentRow -= 7;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("4fb12fbf-31f0-4d78-9a52-1ffedc4ee30c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Start Time", getNotNull(this._element.getStartTime()));
        table.addProperty("End Time", getNotNull(this._element.getEndTime()));
        table.addProperty("Total Cost", getNotNull(this._element.getTotalCost()));
        
        //Cost Unit
        this._costUnit = CamelDesignerAbstractProxy.getUnits();
        table.addProperty("Cost Unit", getCamelName(this._element.getCostUnit()), getCamelNames(this._costUnit));
        
        //Deployment Type Model
        this._deploymentTypeModel = DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Deployment Type Model", getCamelName(this._element.getDeploymentTypeModel()), getCamelNames(this._deploymentTypeModel));
           
        //Requirement Model
        this._requirementModel = RequirementModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Requirement Model", getCamelName(this._element.getRequirementModel()), getCamelNames(this._requirementModel));
           
        //Data Type Model
        this._deploymentTypeModel = DataTypeModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Data Type Model", getCamelName(this._element.getDataTypeModel()), getCamelNames(this._dataTypeModel));
    }

    @objid ("6f1a6f31-f5e0-47f3-af30-a1ed4f96e792")
    public ExecutionModelPropertyPage(T elt) {
        super(elt);
    }

}
