package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.SoftwareComponentPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("117924fa-32af-474c-9dc5-0a2b181e9a98")
public class SensorPropertyPage<T extends Sensor> extends SoftwareComponentPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0aa65b3e-ca12-4ed0-a120-d35117d8b7ee")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setConfiguration(value);
          }
        
        else if(this._currentRow == 2){
            this._element.setIsPush(Boolean.valueOf(value));
          }
        
          this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("fd0b942b-cb3a-43aa-a2db-d309e30a7b96")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Configuration
        table.addProperty("Configuration", getNotNull(this._element.getConfiguration()));
        
        //isPush
        table.addProperty("IsPush", this._element.isIsPush());
    }

    @objid ("5ed5357d-1cf2-4c8c-9ba9-696303c9a424")
    public SensorPropertyPage(T elt) {
        super(elt);
    }

}
