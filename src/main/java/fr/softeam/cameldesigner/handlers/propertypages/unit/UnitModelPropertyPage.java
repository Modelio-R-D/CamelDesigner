package fr.softeam.cameldesigner.handlers.propertypages.unit;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("436bc503-e62c-4f49-ab45-220c60bf0c79")
public class UnitModelPropertyPage<T extends UnitModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d8a6447e-4743-4b75-9de9-865084a8ae99")
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
    @objid ("21b5aeb9-51ba-4019-8794-5a3bef08f658")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("53f156e2-3c0e-4d83-a3fa-29ce5fc57275")
    public UnitModelPropertyPage(T elt) {
        super(elt);
    }

}
