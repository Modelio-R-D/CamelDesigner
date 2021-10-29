package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider;

public class CloudProviderPropertyPage<T extends CloudProvider> extends OrganisationPropertyPage<T> {
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
        	this._element.setPublic(value);
        	break;
        
        case 2 :
        	this._element.setSaaS(value);
        	break;
        
        case 3 :
        	this._element.setPaaS(value);
        	break;
        	
        case 4:
        	this._element.setIaaS(value);
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
        
        table.addProperty("Public",getValue(this._element.getPublic()));
        table.addProperty("SaaS",getValue(this._element.getSaaS()));
        table.addProperty("PaaS",getValue(this._element.getPaaS()));
        table.addProperty("IaaS",getValue(this._element.getIaaS()));

    }

    public CloudProviderPropertyPage(T elt) {
        super(elt);
    }

}
