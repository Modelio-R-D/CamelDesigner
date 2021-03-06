package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;

public class ScriptConfigurationPropertyPage<T extends ScriptConfiguration> extends ConfigurationPropertyPage<T> {
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        table.addProperty("Upload Command", getValue(this._element.getUploadCommandNote()));

        table.addProperty("Install Command",  getValue(this._element.getInstallCommandNote()));

        table.addProperty("Start Command",  getValue(this._element.getStartCommandNote()));

        table.addProperty("Stop Command",  getValue(this._element.getStopCommandNote()));

        table.addProperty("Download Command",  getValue(this._element.getDownloadCommandNote()));

        table.addProperty("Configure Command",  getValue(this._element.getConfigureCommandNote()));

        table.addProperty("Update Command",  getValue(this._element.getUpdateCommandNote()));

        table.addProperty("Devops Tool",  getValue(this._element.getDevopsTool()));

        table.addProperty("OS",  getValue(this._element.getOs()));

        table.addProperty("ImageId",  getValue(this._element.getImageId()));
    }

    public ScriptConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
