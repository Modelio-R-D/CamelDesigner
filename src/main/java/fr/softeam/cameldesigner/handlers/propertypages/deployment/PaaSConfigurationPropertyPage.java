package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("55a2e452-681d-4c3a-b155-5fcff789ac38")
public class PaaSConfigurationPropertyPage<T extends PaaSConfiguration> extends ConfigurationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b12a6d96-903b-44ab-8556-87778f21bb0f")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setApi(value);
            break;
        
        case 2 :
            this._element.setVersion(value);
            break;
        
        case 3 :
            this._element.setEndpoint(value);
            break;
        
        case 4 :
            this._element.setDownloadURL(value);
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
    @objid ("e1bb4e5f-2e04-4f27-8ed0-7e935d056d2f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Api", getNotNull(this._element.getApi()));
        table.addProperty("Version", getNotNull(this._element.getVersion()));
        table.addProperty("Endpoint", getNotNull(this._element.getEndpoint()));
        table.addProperty("Download URL", getNotNull(this._element.getDownloadURL()));
    }

    @objid ("b2278e20-a328-47f5-bbfe-a08629ce65c6")
    public PaaSConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
