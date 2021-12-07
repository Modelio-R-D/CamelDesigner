package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("51b3ddf4-b88f-4f02-b681-9acaec513993")
public abstract class ConfigurationPropertyPage<T extends Configuration> extends FeaturePropertyPage<T> {
    @objid ("9c90d95b-169e-4ee6-b597-acde75e51f14")
    public ConfigurationPropertyPage(T elt) {
        super(elt);
    }

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("061d8135-bb0a-4da4-975d-8fe627688f59")
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
    @objid ("dbfff9ce-2c2c-4034-9805-01ecbce100da")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
