package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("b914cf16-7565-49cb-988e-550ae980592d")
public class ServerlessConfigurationPropertyPage<T extends ServerlessConfiguration> extends ConfigurationPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c24147b7-0763-4565-8ec3-5a56b1c0ca00")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setBinaryCodeURL(value);
            break;
        
        case 2 :
            this._element.setContinuousDeployment(Boolean.valueOf(value));
            break;
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("751bad37-782b-4ad2-aa71-52f81df8bd3f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Binary Code URL", getNotNull(this._element.getBinaryCodeURL()));
        table.addProperty("Continuous Deployment", getNotNull(String.valueOf(this._element.isContinuousDeployment())));
    }

    @objid ("2e54ebef-e902-408b-82ed-895f068435e2")
    public ServerlessConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
