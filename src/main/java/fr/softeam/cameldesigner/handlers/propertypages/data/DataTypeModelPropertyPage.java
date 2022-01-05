package fr.softeam.cameldesigner.handlers.propertypages.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f301ad91-af13-4f8d-8d2c-d4249fa7ac84")
public class DataTypeModelPropertyPage<T extends DataTypeModel> extends DataModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("cd87146b-4530-488a-bf82-f0e4677c3235")
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
    @objid ("406c02f5-13e1-4571-a312-9a6c4a96c721")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("4982315a-392e-4cbc-9018-261b23a2ee28")
    public DataTypeModelPropertyPage(T elt) {
        super(elt);
    }

}
