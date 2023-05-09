package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("66274418-d774-481e-a2d6-f211f158bd2c")
public class ImageConfigurationPropertyPage<T extends ImageConfiguration> extends ConfigurationPropertyPage<T> {
    @objid ("19627ef4-6d0f-49b4-8cf1-19b5f3b83a9a")
    public ImageConfigurationPropertyPage(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("6c16961c-5aee-4294-9dee-647fa049ba6c")
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
    @objid ("7737bded-5f89-4758-b475-c7d94ed3ebf2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        table.addProperty("Image Id", getNotNull(this._element.getImageId()));
    }

}
