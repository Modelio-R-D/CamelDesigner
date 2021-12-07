package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a29d050c-69d4-4489-92ef-28a3fe2e87a6")
public class EventInstancePropertyPage<T extends EventInstance> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a872d78c-b20d-42ca-9fab-b30bc46fd753")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("40c236ea-09cc-41aa-9c49-9de9de639fa9")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("425dfb31-4f6d-4444-a316-6b63bf89a3a4")
    public EventInstancePropertyPage(T elt) {
        super(elt);
    }

}
