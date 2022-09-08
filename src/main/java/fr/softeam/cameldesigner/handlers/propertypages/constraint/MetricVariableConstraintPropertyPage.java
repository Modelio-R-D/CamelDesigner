package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("d5715b5e-4d73-45e8-a709-e5d305871d99")
public class MetricVariableConstraintPropertyPage<T extends MetricVariableConstraint> extends UnaryConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ddf3999e-a5b1-4f45-bd20-87c6ad3b0957")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("1510ea7d-fb60-4b64-9392-bf35364d7019")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d8ed1f9c-284e-48be-8b00-2872612fe621")
    public MetricVariableConstraintPropertyPage(T elt) {
        super(elt);
    }

}
