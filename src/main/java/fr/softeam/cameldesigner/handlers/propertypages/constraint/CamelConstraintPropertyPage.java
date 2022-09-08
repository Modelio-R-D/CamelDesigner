package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ad0966d7-b954-4586-ab06-bedacfd44b21")
public abstract class CamelConstraintPropertyPage<T extends CamelConstraint> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a2805148-9bbd-4d14-9144-bd8c0bbbec72")
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
    @objid ("903ec6a7-1c6b-46fb-b569-195d53aaa3ec")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8f52dea8-d2e3-4fa9-ab41-7de89329c33e")
    public CamelConstraintPropertyPage(T elt) {
        super(elt);
    }

}
