package fr.softeam.cameldesigner.handlers.propertypages.core;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;

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
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);

        if(this._currentRow == 1){
            this._element.setApplicationName(value);
        }else if (row == 2) {
            this._element.setApplicationVersion(value);
        }
        this._currentRow -= 2;
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
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONNAME_TAGTYPE), getValue(this._element.getApplicationName()));

        //Application Version
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONVERSION_TAGTYPE), getValue(this._element.getApplicationVersion()));
    }

    public CamelModelPropertyPage(T elt) {
        super(elt);
    }

}
