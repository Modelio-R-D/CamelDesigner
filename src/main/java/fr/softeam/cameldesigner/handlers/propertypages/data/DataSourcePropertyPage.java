package fr.softeam.cameldesigner.handlers.propertypages.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("700dd8c3-d6ca-4a60-be5f-f69a70afa43c")
public class DataSourcePropertyPage<T extends DataSource> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("65b79813-236b-40b1-b1e3-e3662d8595eb")
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
    @objid ("642e261b-a2eb-4c25-a07a-e8156ebe8959")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8c85fc1f-9687-49ee-8c0f-510c7d484938")
    public DataSourcePropertyPage(T elt) {
        super(elt);
    }

}
