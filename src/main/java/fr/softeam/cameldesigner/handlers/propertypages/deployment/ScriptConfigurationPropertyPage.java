package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("075c3b23-5d7f-4de9-b7fa-9bf79f38e99e")
public class ScriptConfigurationPropertyPage<T extends ScriptConfiguration> extends ConfigurationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4854375e-c8a4-4268-b2f6-97ab5f4b0c99")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setUploadCommandNote(value);
            break;
        
        case 2 :
            this._element.setInstallCommandNote(value);
            break;
        
        case 3 :
            this._element.setStartCommandNote(value);
            break;
        
        case 4 :
            this._element.setStopCommandNote(value);
            break;
        
        case 5 :
            this._element.setDownloadCommandNote(value);
            break;
        
        case 6 :
            this._element.setConfigureCommandNote(value);
            break;
        
        case 7 :
            this._element.setUpdateCommandNote(value);
            break;
        
        case 8 :
            this._element.setDevopsTool(value);
            break;
        
        case 9 :
            this._element.setOs(value);
            break;
        
        case 10 :
            this._element.setImageId(value);
            break;
        }
        
        this._currentRow -= 10;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("b4471278-398e-4f20-af08-4b43cfc49f37")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Upload Command", getNotNull(this._element.getUploadCommandNote()));
        
        table.addProperty("Install Command",  getNotNull(this._element.getInstallCommandNote()));
        
        table.addProperty("Start Command",  getNotNull(this._element.getStartCommandNote()));
        
        table.addProperty("Stop Command",  getNotNull(this._element.getStopCommandNote()));
        
        table.addProperty("Download Command",  getNotNull(this._element.getDownloadCommandNote()));
        
        table.addProperty("Configure Command",  getNotNull(this._element.getConfigureCommandNote()));
        
        table.addProperty("Update Command",  getNotNull(this._element.getUpdateCommandNote()));
        
        table.addProperty("Devops Tool",  getNotNull(this._element.getDevopsTool()));
        
        table.addProperty("OS",  getNotNull(this._element.getOs()));
        
        table.addProperty("ImageId",  getNotNull(this._element.getImageId()));
    }

    @objid ("0d24f7cf-c568-4ca9-88d1-d308b0dee95c")
    public ScriptConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
