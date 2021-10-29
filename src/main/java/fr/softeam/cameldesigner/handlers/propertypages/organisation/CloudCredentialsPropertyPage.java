package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;

public class CloudCredentialsPropertyPage<T extends CloudCredentials> extends CredentialsPropertyPage<T> {
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
        	this._element.setCloudProviderName(value);
        	break;
        
        case 2 :
        	this._element.setSecurityGroup(value);
        	break;
        
        case 3 :
        	this._element.setPublicSSHKey(value);
        	break;
        
        case 4 :
        	this._element.setPrivateSSHKey(value);
        	break;
        
        case 5 :
        	this._element.setUsername(value);
        	break;
        
        case 6 :
        	this._element.setPassword(value);
        	break;
        }
        this._currentRow -= 6;

    
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
        
        table.addProperty("Cloud Provider Name",getValue(this._element.getCloudProviderName()));
        table.addProperty("Security Group",getValue(this._element.getSecurityGroup()));
        table.addProperty("Public SSH Key",getValue(this._element.getPublicSSHKey()));
        table.addProperty("Private SSH Key",getValue(this._element.getPrivateSSHKey()));
        table.addProperty("Username",getValue(this._element.getUsername()));
        table.addProperty("Password",getValue(this._element.getPassword()));

    }

    public CloudCredentialsPropertyPage(T elt) {
        super(elt);
    }

}
