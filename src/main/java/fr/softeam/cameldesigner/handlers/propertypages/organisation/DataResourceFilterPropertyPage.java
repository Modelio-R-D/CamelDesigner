package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;

public class DataResourceFilterPropertyPage<T extends DataResourceFilter> extends ResourceFilterPropertyPage<T> {
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
        	//this._element.set(value);
        	break;
        
        case 2 :
        	//this._element.setSaaS(value);
        	break;
        
        case 3 :
        	//this._element.setPaaS(value);
        	break;
        	
        case 4:
        	this._element.setEveryData(value);
        	break;
        }
        this._currentRow -= 4;
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
        
        table.addProperty("Data",getValue(this._element.)));
        table.addProperty("Data Instances",getValue(this._element.()));
        table.addProperty("Locations",getValue(this._element()));
    
        table.addProperty("Every Data",getValue(this._element.getEveryData()));

    }

    public DataResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
