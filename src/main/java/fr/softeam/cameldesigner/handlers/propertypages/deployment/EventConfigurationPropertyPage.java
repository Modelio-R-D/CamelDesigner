package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("6a4c14d3-42f9-426f-8b3f-9f8089a890b8")
public class EventConfigurationPropertyPage<T extends EventConfiguration> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("abcad369-52c3-4065-b164-cbf053233b73")
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
    @objid ("44c0d4f2-fb97-4e87-ba6a-b100957dcb82")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("cc962ee8-3d87-4598-9257-ee8dfeae492d")
    public EventConfigurationPropertyPage(T elt) {
        super(elt);
    }

}
