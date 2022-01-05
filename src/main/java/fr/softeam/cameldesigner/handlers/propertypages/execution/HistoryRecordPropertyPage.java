package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Package;

@objid ("335a516f-d903-4651-836f-b7200eb87b94")
public class HistoryRecordPropertyPage<T extends HistoryRecord> extends FeatureClassPropertyPage<T> {
    @objid ("567963ba-ebad-469d-aa98-11f4df823b5e")
    private List<ModelElement> _type = null;

    @objid ("2dbaa01e-ea89-4f3b-8a95-7e74fd1a600b")
    private List<ModelElement> _cause = null;

    @objid ("b3ca6ea2-c5ae-48a7-a2f7-e822632f7270")
    private List<ModelElement> _fromDeploymentInstanceModel = null;

    @objid ("46473e9a-7c45-44d0-92b9-0f0764a5e29b")
    private List<ModelElement> _toDeploymentInstanceModel = null;

    @objid ("68844a21-9702-42d7-bfa7-f3d45f1d241a")
    private List<ModelElement> _fromDataInstanceModel = null;

    @objid ("84bb874e-c2e3-4483-b980-463ab8d8d5d2")
    private List<ModelElement> _toDataInstanceModel = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d24b12ee-4c02-4d0e-a24a-421ab9bff0a5")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
                this._element.setType(MmsObject.instantiate(elt));
            }
        }
        
        else if(this._currentRow == 2){
            this._element.setStartTime(value);
        }
        
        
        else if(this._currentRow == 3){
            this._element.setEndTime(value);
        
        }
        
        else if(this._currentRow == 4){
            ModelElement elt = getModelElt(this._fromDeploymentInstanceModel, value);
            if (DeploymentInstanceModel.canInstantiate(elt)) {
                this._element.setFromDeploymentInstanceModel(DeploymentInstanceModel.safeInstantiate((Package) elt));
            }
        }
        
        
        else if(this._currentRow == 5){
            ModelElement elt = getModelElt(this._toDeploymentInstanceModel, value);
            if (DeploymentInstanceModel.canInstantiate(elt)) {
                this._element.setToDeploymentInstanceModel(DeploymentInstanceModel.safeInstantiate((Package) elt));
            }
        }
        
        else if(this._currentRow == 6){
            ModelElement elt = getModelElt(this._fromDataInstanceModel, value);
            if (DataInstanceModel.canInstantiate(elt)) {
                this._element.setFromDataInstanceModel(DataInstanceModel.safeInstantiate((Package) elt));
            }
        }
        
        else if(this._currentRow == 7){
            ModelElement elt =  getModelElt(this._toDataInstanceModel, value);
            if (DataInstanceModel.canInstantiate(elt)) {
                this._element.setToDataInstanceModel(DataInstanceModel.safeInstantiate((Package) elt));
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
    @objid ("e6672282-9a44-4ad9-9b81-f953d2ae3a0d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        
        //Type
        this._type = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
        
        
        //Cause
        this._type = Cause.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Cause", getCamelName(this._element.getCause()), getCamelNames(this._cause));
        
        
        table.addProperty("Start Time", getValue(this._element.getStartTime()));
        table.addProperty("End Time", getValue(this._element.getEndTime()));
        
        //From Deployment Instance Model
        this._fromDeploymentInstanceModel = DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("From Deployment Instance Model", getCamelName(this._element.getFromDeploymentInstanceModel()), getCamelNames(this._fromDeploymentInstanceModel));
        
        //To Deployment Instance Model
        this._toDeploymentInstanceModel = DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("To Deployment Instance Model", getCamelName(this._element.getToDeploymentInstanceModel()), getCamelNames(this._toDeploymentInstanceModel));
        
        
        //From Data Instance Model
        this._fromDataInstanceModel = DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("From Deployment Instance Model", getCamelName(this._element.getFromDataInstanceModel()), getCamelNames(this._fromDataInstanceModel));
        
        //To Data Instance Model
        this._toDataInstanceModel = DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("To Deployment Instance Model", getCamelName(this._element.getToDataInstanceModel()), getCamelNames(this._toDataInstanceModel));
    }

    @objid ("5f566f1c-d39d-440f-b944-1815f6b99e12")
    public HistoryRecordPropertyPage(T elt) {
        super(elt);
    }

}
