package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c7083804-b12f-4b81-81f5-c9e51f04766c")
public class OSRequirementPropertyPage<T extends OSRequirement> extends HardRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("fa74e048-7e9b-47a9-a242-37f938d23c59")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
            
        case 1 :
            this._element.setOs(value);
            break;
        
        case 2 :
            this._element.setIs64os(Boolean.valueOf(value));
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
    @objid ("9e223254-d7ee-41c8-9165-13c650d87991")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("OS", getNotNull(this._element.getOs()));
        table.addProperty("Is 64 OS", getNotNull(String.valueOf(this._element.isIs64os())));
    }

    @objid ("923135bf-1f42-44ae-9efc-a3b2bd26cf0e")
    public OSRequirementPropertyPage(T elt) {
        super(elt);
    }

}
