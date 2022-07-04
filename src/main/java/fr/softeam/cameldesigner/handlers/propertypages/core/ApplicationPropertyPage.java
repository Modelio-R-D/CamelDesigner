package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("7cc10a93-0ce0-431d-bb8f-ab90b3d823dc")
public class ApplicationPropertyPage<T extends Application> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0cef65ea-0201-43e6-b9ae-73293ec9e777")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        this._element.setVersion(value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("90132f0f-4151-40d0-9e1e-4e0bc184bbcc")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Version", getNotNull(this._element.getVersion()));
    }

    @objid ("9fce774e-de2b-4cab-aa57-32c4df0a3f52")
    public ApplicationPropertyPage(T elt) {
        super(elt);
    }

}
