package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;

import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;


public class HistoryRecordPropertyPage<T extends HistoryRecord> extends FeatureClassPropertyPage<T> {
    
	 private List<ModelElement> _type = null;

	 private List<ModelElement> _cause = null;

	 private List<ModelElement> _fromDeploymentInstanceModel = null;

	 private List<ModelElement> _toDeploymentInstanceModel = null;

	 private List<ModelElement> _fromDataInstanceModel = null;
	 
	 private List<ModelElement> _toDataInstanceModel = null;

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
            ModelElement elt =  getModelElt(this._type, value);
            if (MmsObject.canInstantiate(elt)) {
                this._element.setType(MmsObject.safeInstantiate(elt));
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
       
        
        //Type
        this._type = MmsObject.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
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

    public HistoryRecordPropertyPage(T elt) {
        super(elt);
    }

}
