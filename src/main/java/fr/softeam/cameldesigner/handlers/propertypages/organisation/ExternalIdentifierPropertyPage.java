package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("8b8e4f54-cf98-467d-bb0d-5ea9806bd162")
public class ExternalIdentifierPropertyPage<T extends ExternalIdentifier> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("eec9fda8-7351-4241-8240-a59e9c44d657")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
        
            this._element.setIdentifier(value);
               }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("4fe5930c-2c60-4ab0-99a8-9ad83ed66163")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Identifier", getNotNull(this._element.getIdentifier()));
    }

    @objid ("259d501a-0083-4670-8a9c-de8a435e6cff")
    public ExternalIdentifierPropertyPage(T elt) {
        super(elt);
    }

}
