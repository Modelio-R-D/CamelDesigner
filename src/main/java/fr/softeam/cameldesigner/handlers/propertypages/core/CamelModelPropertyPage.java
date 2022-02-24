package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.utils.CamelDesignerResourcesManager;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6ee8965d-b749-42c1-bcc9-5b016e786200")
public class CamelModelPropertyPage<T extends CamelModel> extends ExpendableElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("2951965d-70a9-43d6-aded-848e42cbd9eb")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setApplicationName(value);
        }else if (this._currentRow == 2) {
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
    @objid ("43fc0f9d-24ea-4f6b-9357-991641830f78")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Application Name
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONNAME_TAGTYPE), getValue(this._element.getApplicationName()));
        
        //Application Version
        table.addProperty(CamelDesignerResourcesManager.getPropertyName(CamelModel.APPLICATIONVERSION_TAGTYPE), getValue(this._element.getApplicationVersion()));
    }

    @objid ("5539f5f3-bfb0-472f-9b11-98387323b990")
    public CamelModelPropertyPage(T elt) {
        super(elt);
    }

}
