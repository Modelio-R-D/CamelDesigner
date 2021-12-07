package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("9b9e8414-3daa-4344-ac39-4bcbcb22c147")
public class ProviderRequirementPropertyPage<T extends ProviderRequirement> extends HardRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("63c6787d-98ae-4b65-8616-818362851c11")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            this._element.setCloudType(value);
        }
        
        if(this._currentRow == 2){
           
        }
        
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("7adce826-e6bc-44c7-b537-34d6b88bf06a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Cloud Type
        table.addProperty("<"
                + "Cloud Type", this._element.getCloudType());
           
        //Provider Names
        String providerNames = "";
        for(  String providerName: this._element.getProviderNames()) {
            providerNames =    providerName ;
        }
        
        table.addProperty("Provider Names", providerNames);
    }

    @objid ("597d7a59-7bf4-45f6-a629-650371103b6a")
    public ProviderRequirementPropertyPage(T elt) {
        super(elt);
    }

}
