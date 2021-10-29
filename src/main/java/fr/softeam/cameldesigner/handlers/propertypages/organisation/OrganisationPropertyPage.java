package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;

public class OrganisationPropertyPage<T extends Organisation> extends EntityPropertyPage<T> {
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
		    	this._element.setWww(value);
		    	break;
		    
		    case 2 :
		    	this._element.setPostalAddress(value);
		    	break;
		    
		    case 3 :
		    	this._element.setEmail(value);
		    	break;
		    	
		   
    }
    this._currentRow -= 3;
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
        
        table.addProperty("WWW",getValue(this._element.getWww()));
        table.addProperty("Postal Address",getValue(this._element.getPostalAddress()));
        table.addProperty("Email",getValue(this._element.getEmail()));

        // Cloud Credentials

    }

    public OrganisationPropertyPage(T elt) {
        super(elt);
    }

}
