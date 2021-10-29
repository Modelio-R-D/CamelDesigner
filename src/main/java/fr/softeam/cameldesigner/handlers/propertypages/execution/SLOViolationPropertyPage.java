package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement;

public class SLOViolationPropertyPage<T extends SLOViolation> extends CausePropertyPage<T> {
    
    private List<ModelElement> _slo = null;

    private List<ModelElement> _measurement= null;

    private List<ModelElement> _assessmentTime = null;

 
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
            Class elt = (Class) getModelElt(this._slo, value);
            if (ServiceLevelObjective.canInstantiate(elt)) {
                this._element.setSlo(ServiceLevelObjective.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            Class elt = (Class) getModelElt(this._measurement, value);
            if (Measurement.canInstantiate(elt)) {
                this._element.setMeasurement((Measurement)Measurement.safeInstantiate(elt));
            }
        }


        else if(this._currentRow == 3){
        	this._element.setAssessmentTime(value);
           
        }
        
        this._currentRow -= 3;

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
        
        //SLO
        this._slo = ServiceLevelObjective.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("SLO", getCamelName(this._element.getSlo()), getCamelNames(this._slo));
        
        //Measurement
        this._measurement = ServiceLevelObjective.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Measurement", getCamelName(this._element.getMeasurement()), getCamelNames(this._measurement));
        
        //Assessment Time
        table.addProperty("Value", getValue(this._element.getAssessmentTime()));

    }

    public SLOViolationPropertyPage(T elt) {
        super(elt);
    }

}
