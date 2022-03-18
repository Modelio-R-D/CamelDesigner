package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;

@objid ("2bd0133b-cd47-4d99-a488-72aadda3b0f8")
public class ServiceLevelObjectivePropertyPage<T extends ServiceLevelObjective> extends HardRequirementPropertyPage<T> {
    @objid ("a07fe0b4-d8c6-43fd-b603-874bdbc33055")
    private List<ModelElement> _violentEvent;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("49aaa158-bfb4-4600-86ed-1449d93f82f6")
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
            ModelElement elt =  getModelElt(CamelDesignerAbstractProxy.getEvents(), value);
            if ((elt!=null) &&(elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Event.STEREOTYPE_NAME))) {
                this._element.setViolationEvent( (Event) Event.safeinstantiate(elt));
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
    @objid ("6ce012c4-305c-463f-8f09-1263a3c13423")
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
        this._violentEvent = CamelDesignerAbstractProxy.getEvents();
        table.addProperty("Violation Event", getCamelName(this._element.getViolationEvent()), getCamelNames(this._violentEvent));
    }

    @objid ("dc3f0008-cc1a-44b2-8e0b-82d9dedf354c")
    public ServiceLevelObjectivePropertyPage(T elt) {
        super(elt);
    }

}
