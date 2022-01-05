package fr.softeam.cameldesigner.handlers.propertypages.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("40ddda4f-2a3b-42ce-89b2-c8edc95dcaad")
public class FunctionPropertyPage<T extends Function> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8d323eed-cf53-42ba-8abf-dd5221999943")
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
    @objid ("ce97e73c-c69e-4be0-9bb1-fe3c4155779f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("379aebb8-0fa5-4022-85b7-18bd29150752")
    public FunctionPropertyPage(T elt) {
        super(elt);
    }

}
