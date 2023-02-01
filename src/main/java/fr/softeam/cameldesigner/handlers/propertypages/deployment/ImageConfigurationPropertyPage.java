package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;

public class ImageConfigurationPropertyPage<T extends ImageConfiguration> extends ConfigurationPropertyPage<T> {

	public ImageConfigurationPropertyPage(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setImageId(value);
            break;

        }
        
        this._currentRow -= 1;
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
        table.addProperty("Image Id", getNotNull(this._element.getImageId()));
    }
}
