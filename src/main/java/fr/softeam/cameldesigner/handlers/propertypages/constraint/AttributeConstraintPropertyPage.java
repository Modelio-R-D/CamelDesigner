package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("75446099-2cd3-4cea-8e5e-c3a7c0fdb899")
public abstract class AttributeConstraintPropertyPage<T extends AttributeConstraint> extends CamelConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("aabc7026-e093-4c0b-8a1d-8983c8f2b6be")
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
    @objid ("a6886587-d5ca-4831-9754-ab8767b80a9f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("37dad897-4654-48f7-af70-373cdb675d31")
    public AttributeConstraintPropertyPage(T elt) {
        super(elt);
    }

}
