package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class FunctionalEventInstancePropertyPage<T extends FunctionalEventInstance> extends FeaturePropertyPage<T> {
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
        
        if (this._currentRow==1) {
	    	//this._element.SE(value);;

        }
        this._currentRow -= 1;

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
        
        table.addProperty("Component Instance",getValue(this._element.));

    }

    public FunctionalEventInstancePropertyPage(T elt) {
        super(elt);
    }

}
