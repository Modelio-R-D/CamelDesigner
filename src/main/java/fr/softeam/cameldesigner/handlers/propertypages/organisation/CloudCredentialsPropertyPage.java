package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("68f32081-19a0-46c5-b520-c62f4d0c07af")
public class CloudCredentialsPropertyPage<T extends CloudCredentials> extends CredentialsPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("7ea13182-13bb-452a-907d-33daa10bcdde")
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
            this._element.setPublicSSHKey(value);
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
    @objid ("85045a5b-5633-42dc-aa04-6f6febab4c4f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Cloud Provider Name", getNotNull(this._element.getCloudProviderName()));
        table.addProperty("Security Group", getNotNull(this._element.getSecurityGroup()));
        table.addProperty("Public SSH Key", getNotNull(this._element.getPublicSSHKey()));
        table.addProperty("Private SSH Key", getNotNull(this._element.getPrivateSSHKey()));
        table.addProperty("Username", getNotNull(this._element.getUsername()));
        table.addProperty("Password", getNotNull(this._element.getPassword()));
    }

    @objid ("3e1d4a9b-ca9b-472a-bd5a-6b84433d5c8a")
    public CloudCredentialsPropertyPage(T elt) {
        super(elt);
    }

}
