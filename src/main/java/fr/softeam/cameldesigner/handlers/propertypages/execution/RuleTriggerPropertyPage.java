package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;

public class RuleTriggerPropertyPage<T extends RuleTrigger> extends CausePropertyPage<T> {
    
    private List<ModelElement> _scalabilityRule = null;


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
            Class elt = (Class) getModelElt(this._scalabilityRule, value);
            if (ScalabilityRule.canInstantiate(elt)) {
                this._element.setScalabilityRule(ScalabilityRule.safeInstantiate(elt));
            }
        }

        else if(this._currentRow == 2){
            this._element.setTriggeringTime(value);
        }
        
        this._currentRow -= 2;

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
        
        //Scalability Rule
        this._scalabilityRule= ScalabilityRule.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Scalability Rule", getCamelName(this._element.getScalabilityRule()), getCamelNames(this._scalabilityRule));

        //Trigerring time
        table.addProperty("Trigerring time", getValue(this._element.getTriggeringTime()));
     
    }

    public RuleTriggerPropertyPage(T elt) {
        super(elt);
    }

}
