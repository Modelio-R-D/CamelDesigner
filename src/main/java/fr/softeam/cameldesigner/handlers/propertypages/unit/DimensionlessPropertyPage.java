package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("308fc032-3ede-4f1f-acb5-445a9f4ab7a4")
public class DimensionlessPropertyPage<T extends Dimensionless> extends UnitPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("435b035c-2eca-4635-a7a1-12babe652a50")
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
    @objid ("e0547769-17eb-40f6-83ec-32bbff125455")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("29d86bb5-1527-443c-b7ac-140e538a7711")
    public DimensionlessPropertyPage(T elt) {
        super(elt);
    }

}
