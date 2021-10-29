package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Instance;

import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;

public class ServiceLevelObjectivePropertyPage<T extends ServiceLevelObjective> extends HardRequirementPropertyPage<T> {
    
    private List<ModelElement> _violentEvent;

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
            for( Constraint constraint: this._element.getElement().getConstraintDefinition()) {
                constraint.setName(value);
            }
            break;
         
        case 2 :
        	ModelElement elt = getModelElt(this._violentEvent, value);
            if (Event.canInstantiate(elt)) {
                this._element.setViolationEvent((Event) Event.safeinstantiate(elt));
            }
            break;
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

        //Constraint
        String constraintName = "";
        for( Constraint constraint: this._element.getElement().getConstraintDefinition()) {
            constraintName = constraint.getName();
        }

        table.addProperty("Constraint", constraintName);
        
        
        // Violation Event
        this._violentEvent = Event.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Violation Event", getCamelName(this._element.getViolationEvent()), getCamelNames(this._violentEvent));

    }

    public ServiceLevelObjectivePropertyPage(T elt) {
        super(elt);
    }

}
