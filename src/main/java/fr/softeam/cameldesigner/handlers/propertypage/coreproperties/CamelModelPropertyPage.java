package fr.softeam.cameldesigner.handlers.propertypage.coreproperties;

import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

public class CamelModelPropertyPage<T extends CamelModel> extends NamedElementPropertyPage<T> {
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
        
        if(currentRow == 1){
            this.element.setApplicationName(value);
        }else if (currentRow == 2) {
            this.element.setApplicationVersion(value);
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
        
        //Application Name
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONNAME_TAGTYPE), getValue(this.element.getApplicationName()));
        
        //Application Version
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONVERSION_TAGTYPE), getValue(this.element.getApplicationVersion()));
    }

    public CamelModelPropertyPage(T elt) {
        super(elt);
    }

}
