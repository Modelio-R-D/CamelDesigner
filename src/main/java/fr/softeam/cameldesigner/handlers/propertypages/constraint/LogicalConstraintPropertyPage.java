package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import java.util.Arrays;
import camel.constraint.LogicalOperatorType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ae4874ee-ae98-4d28-824c-914466794970")
public class LogicalConstraintPropertyPage<T extends LogicalConstraint> extends CompositeConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("cda63ad4-4ff8-45b5-a236-b53c83684f88")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setLogicalOperator(value);
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("fb2fce9a-0345-438b-9a9d-b154e6a00a78")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Operator
        String[] values = Arrays.stream(LogicalOperatorType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Logical Operator", this._element.getLogicalOperator(), values);
    }

    @objid ("5e0bcb55-7cfa-4f01-8f4d-c8c11f7f38b1")
    public LogicalConstraintPropertyPage(T elt) {
        super(elt);
    }

}
