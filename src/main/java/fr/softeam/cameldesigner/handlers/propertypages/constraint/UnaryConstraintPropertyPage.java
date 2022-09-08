package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import java.util.Arrays;
import camel.constraint.ComparisonOperatorType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("0115df43-cf6a-4a74-b817-9e334cfb02b0")
public abstract class UnaryConstraintPropertyPage<T extends UnaryConstraint> extends CamelConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("722b9840-7f7e-4e73-9c70-8bd88f7a2483")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setValidity(value);
        } else if(this._currentRow == 2){
            this._element.setComparisonOperator(value);
        } else if(this._currentRow == 3){
            this._element.setThreshold(value);
        }
        
        this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("ac91c661-e3e7-437a-9d6c-a5111e20cf83")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Validity
        table.addProperty("Validity", this._element.getValidity());
        
        //Operator
        String[] values = Arrays.stream(ComparisonOperatorType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Comparison Operator", this._element.getComparisonOperator(), values);
        
        //Threshold
        table.addProperty("Threshold", this._element.getThreshold());
    }

    @objid ("d8a2e160-62c0-4191-a402-c3b8343e662a")
    public UnaryConstraintPropertyPage(T elt) {
        super(elt);
    }

}
