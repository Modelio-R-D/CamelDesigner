package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a26253b3-b19c-4bf2-86a8-11ebfb97f32a")
public class ResourceFilterPropertyPage<T extends ResourceFilter> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d07c4473-823d-4531-8063-5901efd03470")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            
           this._element.setResourcePattern(value);
                 
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("8967ef41-e5ef-47f3-a405-c6d130133d02")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Resource Pattern", getNotNull(this._element.getResourcePattern()));
    }

    @objid ("903dc9d5-69c9-43d7-8ba0-24060c40f0f3")
    public ResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
