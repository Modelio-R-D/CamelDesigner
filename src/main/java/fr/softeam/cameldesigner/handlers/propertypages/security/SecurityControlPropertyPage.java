package fr.softeam.cameldesigner.handlers.propertypages.security;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class SecurityControlPropertyPage<T extends SecurityControl> extends FeaturePropertyPage<T> {
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
	    	this._element.getDomain().setName(value);
	    	break;
	    
	    case 3 :
	    	this._element.getSubDomain().setName(value);
	    	break;
	    	
	    case 4:
	    	this._element.setSpecification(value);
	    	break;
	    	
	    case 5 :
	    	//this._element.(value);
	    	break;
	    
	    case 6 :
	    	//this._element.(value);
	    	break;
	    	
	    case 7:
	    	//this._element.(value);
	    	break;
        }
        this._currentRow -= 7;
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
        table.addProperty("Domain",getValue(this._element.getDomain().getName()));
        
        table.addProperty("Sub Domain",getValue(this._element.getSubDomain().getName()));
        table.addProperty("Specification",getValue(this._element.getSpecification()));
        table.addProperty("Security Properties",getValue(this._element.));
        table.addProperty("Raw Security Metrics",getValue(this._element.));
        table.addProperty("Composite Security Metrics",getValue(this._element.));

    }

    public SecurityControlPropertyPage(T elt) {
        super(elt);
    }

}
