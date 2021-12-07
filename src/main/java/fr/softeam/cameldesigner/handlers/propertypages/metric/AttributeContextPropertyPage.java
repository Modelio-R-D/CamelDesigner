package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("55fad0e7-3cfb-416a-8659-fcc6be5baf3e")
public class AttributeContextPropertyPage<T extends AttributeContext> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("faac953e-060c-4aae-9bda-5c0b26475643")
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
    @objid ("80daed45-dee1-4a3e-886c-c093650179c2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("d13524d2-ea6f-4074-b194-8124dcaee45a")
    public AttributeContextPropertyPage(T elt) {
        super(elt);
    }

}
