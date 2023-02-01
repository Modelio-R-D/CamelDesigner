package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("45df728d-c89a-4181-af81-36e24a9a72a3")
public class SingleUnitPropertyPage<T extends SingleUnit> extends DimensionedUnitPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("aa7a46d4-a5d8-40d0-8868-80b6c2b7548c")
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
    @objid ("73f2c3c8-87d5-4897-8c6b-9958d375b292")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b2af99a0-60e8-48e1-8bc0-ab2b49d84747")
    public SingleUnitPropertyPage(T elt) {
        super(elt);
    }

}
