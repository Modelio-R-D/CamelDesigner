package fr.softeam.cameldesigner.handlers.propertypages.security;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class SecurityDomainPropertyPage<T extends SecurityDomain> extends FeaturePropertyPage<T> {
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
	    	this._element.setId(value);
	    	break;
	    
	    case 2 :
	    	//this._element.(value);
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
        
        table.addProperty("Id",getValue(this._element.getId()));
        table.addProperty("Sub Domains",getValue(this._element.get()));

    }

    public SecurityDomainPropertyPage(T elt) {
        super(elt);
    }

}
