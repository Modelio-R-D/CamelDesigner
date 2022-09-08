package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("983240ef-12d9-40cf-8d1e-dff04fc0edfd")
public class IfThenConstraintPropertyPage<T extends IfThenConstraint> extends CompositeConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c50d127e-255d-481a-bcd2-33fc5f06d08c")
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
    @objid ("ff88adca-0568-490d-b42b-dae426aa3184")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("a2e8c4c7-8701-4f42-8b78-8b0cc91b835e")
    public IfThenConstraintPropertyPage(T elt) {
        super(elt);
    }

}
