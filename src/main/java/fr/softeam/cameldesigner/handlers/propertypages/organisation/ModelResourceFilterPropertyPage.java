package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;

public class ModelResourceFilterPropertyPage<T extends ModelResourceFilter> extends ResourceFilterPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {

        case 1 :
        	this._element.setInformationResourcePath(value);
        	break;
        
        case 2 :
        	this._element.setEveryInformationResource(value);
        	break;
        
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     *
     * @param table : the property table to fulfill
     */
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Information Resource Path",getValue(this._element.getInformationResourcePath()));
        table.addProperty("Every Information Resource",getValue(this._element.getEveryInformationResource()));
    }

    public ModelResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
