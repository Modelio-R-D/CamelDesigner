package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("e8fe7b02-aa8d-4007-a535-96a730a40740")
public class RequiredCommunicationPropertyPage<T extends CommunicationPort> extends CommunicationPortPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("21ac0e8b-71c3-4dbe-8ec0-b9b912fdc4c0")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setIsMandatory(Boolean.valueOf(value));
            break;
        
        }
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("8dfc6509-4271-483b-99a0-fbbd0d685b72")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("isMandatory", this._element.isIsMandatory());
    }

    @objid ("78d42c66-a39b-4709-86f0-6d6be3eb21b5")
    public RequiredCommunicationPropertyPage(T elt) {
        super(elt);
    }

}
