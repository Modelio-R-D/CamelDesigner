package fr.softeam.cameldesigner.handlers.propertypages.type;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("51d528b9-87e0-4ee4-8efc-cc7ab1d6ca75")
public class RangePropertyPage<T extends Range> extends ValueTypePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("1363b412-e0f8-40d6-abac-ec47a167260b")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setLowerLimit(value);
        } else if(this._currentRow == 2){
            this._element.setIsLowerLimitIncluded(Boolean.valueOf(value));
        } else if(this._currentRow == 3){
            this._element.setUpperLimit(value);
        } else if(this._currentRow == 4){
            this._element.setIsUpperLimitIncluded(Boolean.valueOf(value));
        }
        
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("1bf848e5-1962-44a6-8d81-91ab17d0fe0a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Lower Limit Value
        table.addProperty("Lower limit value", this._element.getLowerLimit());
        
        //Lower limit is included
        table.addProperty("Lower limit included", this._element.isIsLowerLimitIncluded());
        
        //Upper Limit Value
        table.addProperty("Upper limit value", this._element.getUpperLimit());
        
        //Upper limit is included
        table.addProperty("Upper limit included", this._element.isIsUpperLimitIncluded());
    }

    @objid ("9be31a1b-9f35-4ec7-94f7-91d024630735")
    public RangePropertyPage(T elt) {
        super(elt);
    }

}
