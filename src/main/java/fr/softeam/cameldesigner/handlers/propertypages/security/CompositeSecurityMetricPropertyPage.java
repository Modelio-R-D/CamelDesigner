package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("29046394-6a2c-45e1-9a15-f67ca5b5d94a")
public class CompositeSecurityMetricPropertyPage<T extends CompositeSecurityMetric> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4e567e2d-36c8-4252-bc63-52e2b411bf49")
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
    @objid ("30210114-16fb-4cad-b6ce-840dc791b9da")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("775ab325-cb2b-4163-b6b2-24639eb6febc")
    public CompositeSecurityMetricPropertyPage(T elt) {
        super(elt);
    }

}
