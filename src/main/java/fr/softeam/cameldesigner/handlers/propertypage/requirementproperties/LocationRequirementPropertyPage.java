package fr.softeam.cameldesigner.handlers.propertypage.requirementproperties;

import java.util.List;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

public class LocationRequirementPropertyPage<T extends LocationRequirement> extends HardRequirementPropertyPage<T> {
    private List<ModelElement> _locations = null;

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
            this.element.setAllRequired(Boolean.valueOf(value));
        }
        return currentRow - 1;
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
        
        //AllRequired
        table.addProperty("AllRequired", this.element.isAllRequired());
    }

    public LocationRequirementPropertyPage(T elt) {
        super(elt);
    }

}
