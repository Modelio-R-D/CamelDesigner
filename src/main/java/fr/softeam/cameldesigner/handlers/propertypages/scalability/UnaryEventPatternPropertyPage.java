package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class UnaryEventPatternPropertyPage<T extends UnaryEventPattern> extends FeaturePropertyPage<T> {
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
	    	//this._element.(value);
	    	break;
	    	
	    case 2 :
	    	this._element.setOccurrenceNum(value);;
	    	break;
	    
	    case 3 :
	    	this._element.setOperator(value);;
	    	break;
	    	
        }
        this._currentRow -= 3;
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
        
        table.addProperty("Event",getValue(this._element.get));
        table.addProperty("Occurence Num",getValue(this._element.getOccurrenceNum()));
        table.addProperty("Operator",getValue(this._element.getOperator()));

    }

    public UnaryEventPatternPropertyPage(T elt) {
        super(elt);
    }

}
