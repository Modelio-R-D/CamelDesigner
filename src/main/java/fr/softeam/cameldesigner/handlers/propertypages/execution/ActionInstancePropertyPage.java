package fr.softeam.cameldesigner.handlers.propertypages.execution;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ActionInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class ActionInstancePropertyPage<T extends ActionInstance> extends FeaturePropertyPage<T> {
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
            this._element.setStartTime(value);
            break;
         
        case 2 :
            this._element.setEndTime(value);
            break;
            
        case 3 :
            this._element.setSuccessful(value);
            break;
         
        case 4 :
            //this._element.SET;
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Start Time",  getValue(this._element.getStartTime()));
        table.addProperty("End Time",  getValue(this._element.getEndTime()));
        table.addProperty("Successful",  getValue(this._element.getSuccessful()));


        table.addProperty("Action",  getValue(this._element.get));

    }

    public ActionInstancePropertyPage(T elt) {
        super(elt);
    }

}
