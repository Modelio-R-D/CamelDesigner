package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class BinaryEventPatternPropertyPage<T extends BinaryEventPattern> extends FeaturePropertyPage<T> {
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
	    	//this._element.setId(value);
	    	break;
	    	
	    case 2 :
	    	//this._element.getDomain().setName(value);
	    	break;
	    
	    case 3 :
	    	this._element.setLowerOccurrenceBound(value);;
	    	break;
	    	
	    case 4:
	    	this._element.setUpperOccurrenceBound(value);;
	    	break;
	    	
	    case 5 :
	    	this._element.setOperator(value);;
	    	break;
        }
        this._currentRow -= 5;
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
        
        table.addProperty("Left Event",getValue(this._element));
        table.addProperty("Right Event",getValue(this._element.get));
        table.addProperty("Lower Occurrence Bound",getValue(this._element.getLowerOccurrenceBound()));
        table.addProperty("Upper Occurence Bound",getValue(this._element.getUpperOccurrenceBound()));
        table.addProperty("Operator",getValue(this._element.getOperator()));

    }

    public BinaryEventPatternPropertyPage(T elt) {
        super(elt);
    }

}
