package fr.softeam.cameldesigner.handlers.propertypages.metric;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.SoftwareComponentPropertyPage;

public class SensorPropertyPage<T extends Sensor> extends SoftwareComponentPropertyPage<T> {
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Configuration
        table.addProperty("Configuration", this._element.getConfiguration());

        //isPush
        table.addProperty("IsPush", Boolean.valueOf(this._element.getIsPush()));
    }

    public SensorPropertyPage(T elt) {
        super(elt);
    }

}
