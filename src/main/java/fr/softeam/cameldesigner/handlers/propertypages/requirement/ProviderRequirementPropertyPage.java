package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.Arrays;
import camel.requirement.CloudType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

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
           this._element.setProviderNames(Arrays.asList(value.split(this._eltSeparator)));
        }
        else if(this._currentRow == 2){
            this._element.setCloudType(value);
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
        
        //Provider Names
        table.addProperty("Provider Names", String.join(this._eltSeparator, this._element.getProviderNames()));
        
        //Cloud Type
        String[] values = Arrays.stream(CloudType.values()) // create stream of enum values
                .map(e -> e.toString())  // convert enum stream to String stream
                .toArray(String[]::new);
        table.addProperty("Cloud Type", this._element.getCloudType());
    }

    @objid ("597d7a59-7bf4-45f6-a629-650371103b6a")
    public ProviderRequirementPropertyPage(T elt) {
        super(elt);
    }

}
