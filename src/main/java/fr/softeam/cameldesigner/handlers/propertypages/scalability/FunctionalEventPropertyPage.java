package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("074b7547-84e6-48a9-80a5-426d0ea4c94e")
public class FunctionalEventPropertyPage<T extends FunctionalEvent> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("6a5f82dd-3164-4352-852c-bdc3046aad44")
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
    @objid ("adda9319-1891-4ccd-b86d-fcf96a01f671")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("c5782770-e12c-4a3c-afba-c9ab0c6d1792")
    public FunctionalEventPropertyPage(T elt) {
        super(elt);
    }

}
