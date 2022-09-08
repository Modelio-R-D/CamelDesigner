package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f600a6fb-6966-4d39-a58a-552fe2f1980d")
public abstract class CompositeConstraintPropertyPage<T extends CompositeConstraint> extends CamelConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a6630c90-fd6b-4dfe-840b-80195e177b3c")
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
    @objid ("c4ffd2c9-a927-48b1-8319-18a7b90924f7")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8600b0d1-a042-419b-aa83-f254c7170dc6")
    public CompositeConstraintPropertyPage(T elt) {
        super(elt);
    }

}
