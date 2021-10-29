package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import java.util.List;

import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;

public class ProviderRequirementPropertyPage<T extends ProviderRequirement> extends HardRequirementPropertyPage<T> {

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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Cloud Type
        table.addProperty("<"
        		+ "Cloud Type", this._element.getCloudType());
   
        //Provider Names
        String providerNames = "";
        for(  String providerName: this._element.getProviderNames()) {
        	providerNames =	providerName ;
        }

        table.addProperty("Provider Names", providerNames);
        
    }

    public ProviderRequirementPropertyPage(T elt) {
        super(elt);
    }

}
