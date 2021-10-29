package fr.softeam.cameldesigner.handlers.propertypages.metric;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;

public class AttributeContextPropertyPage<T extends AttributeContext> extends FeaturePropertyPage<T> {
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
        	this._element.getAttribute().setName(value);;
        	break;
        
        case 2 :
        	this._element.getObjectContext().setName(value);;
        	break;
        }
        this._currentRow -=2;

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
        
        table.addProperty("Attribute",getValue(this._element.getAttribute().getName()));
        table.addProperty("Object Context",getValue(this._element.getObjectContext().getName()));

    }

    public AttributeContextPropertyPage(T elt) {
        super(elt);
    }

}
