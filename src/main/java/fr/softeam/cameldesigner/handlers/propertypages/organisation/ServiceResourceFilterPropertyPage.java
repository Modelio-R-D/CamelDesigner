package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("09d51b3f-2e93-401c-a917-e722079b06c0")
public class ServiceResourceFilterPropertyPage<T extends ServiceResourceFilter> extends ResourceFilterPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c8a9100f-c6cd-47de-a869-6b59ad975fb4")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setServiceURL(value);
            break;
        
        case 2 :
            this._element.setEveryService(Boolean.valueOf(value));
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
    @objid ("a76fadd6-41d2-4e5d-b222-b3e0649a5c2e")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Service URL", getNotNull(this._element.getServiceURL()));
        table.addProperty("Every Service",this._element.isEveryService());
    }

    @objid ("c21e8635-1b43-4403-92f5-ec4312eed08f")
    public ServiceResourceFilterPropertyPage(T elt) {
        super(elt);
    }

}
