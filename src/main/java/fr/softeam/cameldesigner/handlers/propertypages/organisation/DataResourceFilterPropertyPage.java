package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("cd2bff5b-4751-4be5-9785-f5908402cc9d")
public class DataResourceFilterPropertyPage<T extends DataResourceFilter> extends ResourceFilterPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c67bc0f6-d1cb-4365-b1fb-bd4d8c9670e6")
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
    @objid ("ac957488-6a07-47b5-b136-bbda490ba69e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("3a642576-a307-492c-8485-543522119d06")
    public DataResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
