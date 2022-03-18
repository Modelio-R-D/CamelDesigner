package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9d24f451-be99-4c1c-9a3c-6f9bfe22b8f6")
public class HorizontalScaleRequirementPropertyPage<T extends HorizontalScaleRequirement> extends ScaleRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b2c29453-e412-4ff5-9d83-6d9eb4df937d")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setMinInstances(value);
            break;
        
        case 2 :
            this._element.setMaxInstances(value);
            break;
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("476dfc0b-2447-4871-b434-5655239d5deb")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //MinInstances
        table.addProperty("MinInstances", getNotNull(this._element.getMinInstances()));
        
        //MaxInstances
        table.addProperty("MaxInstances", getNotNull(this._element.getMaxInstances()));
    }

    @objid ("c6649dce-893d-4827-8345-f11c92c40aa4")
    public HorizontalScaleRequirementPropertyPage(T elt) {
        super(elt);
    }

}
