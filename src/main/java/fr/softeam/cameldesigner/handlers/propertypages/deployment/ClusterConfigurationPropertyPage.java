package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("0360c0be-7270-434a-b279-e5a5b5979870")
public class ClusterConfigurationPropertyPage<T extends ClusterConfiguration> extends ConfigurationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ff02c637-4afb-4060-b29e-0c50ecabe342")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setDownloadURL(value);
        
        }
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("2bebfe66-ff86-4e05-836d-45859d1ea465")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Download URL", getNotNull(this._element.getDownloadURL()));
    }

    @objid ("8e1b9c7e-722e-4b70-8053-151c22c6576e")
    public ClusterConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
