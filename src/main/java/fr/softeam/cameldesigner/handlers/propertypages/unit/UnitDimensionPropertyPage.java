package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("dd171dd4-22b7-4b6c-a2af-93b7766c14a7")
public class UnitDimensionPropertyPage<T extends UnitDimension> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8297e324-1558-4009-9daa-62e4f7b14300")
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
    @objid ("a1e2c83e-323f-48c8-912e-ca814e898fdd")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b9d29023-8113-44ac-9ee1-dcb957a30c72")
    public UnitDimensionPropertyPage(T elt) {
        super(elt);
    }

}
