package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6d7e7e4e-8500-46d9-b765-5a3ea69adf69")
public class OrganisationPropertyPage<T extends Organisation> extends EntityPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("230b4816-6d4f-4789-bbef-5129a9875c98")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setWww(value);
            break;
        
        case 2 :
            this._element.setPostalAddress(value);
            break;
        
        case 3 :
            this._element.setEmail(value);
            break;
        }
         
         this._currentRow -= 3;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("3a11447d-93b8-4571-b64c-3ad9a2e1e53b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Www", getNotNull(this._element.getWww()));
        table.addProperty("Postal Address", getNotNull(this._element.getPostalAddress()));
        table.addProperty("Email", getNotNull(this._element.getEmail()));
    }

    @objid ("bf833348-d328-48e7-b9a4-15726f928d6a")
    public OrganisationPropertyPage(T elt) {
        super(elt);
    }

}
