package fr.softeam.cameldesigner.handlers.propertypages.constraint;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("97fef7cb-64fe-4c15-9ec8-0c6a62f7e039")
public class MetricConstraintPropertyPage<T extends MetricConstraint> extends UnaryConstraintPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b25dc1aa-f058-4309-95d5-6dc9c069eea1")
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
    @objid ("d66138ac-ae03-4403-a044-134c958cb651")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("04b0c6de-6706-42e8-9008-a24b7e3f7924")
    public MetricConstraintPropertyPage(T elt) {
        super(elt);
    }

}
