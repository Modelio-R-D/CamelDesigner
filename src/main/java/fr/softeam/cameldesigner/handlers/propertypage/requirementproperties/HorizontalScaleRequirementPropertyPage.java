package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class HorizontalScaleRequirementPropertyPage<T extends HorizontalScaleRequirement> extends ScaleRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @Override
    public int changeProperty(int row, String value) {
        int currentRow = super.changeProperty(row, value);
        
        switch (currentRow) {
        
        case 1 :
            this.element.setMinInstances(value);
        
        case 2 :
            this.element.setMaxInstances(value);
        }
        return currentRow - 2;
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
        
              //MinInstances
        table.addProperty("MinInstances", this.element.getMinInstances());
        
        
              //MaxInstances
        table.addProperty("MaxInstances", this.element.getMaxInstances());
    }

    public HorizontalScaleRequirementPropertyPage(T elt) {
        super(elt);
    }

}
