package fr.softeam.cameldesigner.handlers.propertypages.data;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("97d639ca-7285-44c2-a618-19ceca33c951")
public class DataSourceInstancePropertyPage<T extends DataSourceInstance> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c9654a32-2128-47cb-b901-8f2fc95c4105")
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
    @objid ("69585033-0e7a-4073-8574-f6cfffdb4852")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("0a20bc09-6556-435b-a909-99ff68a38f71")
    public DataSourceInstancePropertyPage(T elt) {
        super(elt);
    }

}
