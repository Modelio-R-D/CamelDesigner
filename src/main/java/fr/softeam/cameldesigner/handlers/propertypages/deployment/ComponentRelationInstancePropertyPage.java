package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("aa9064b1-0e83-43d0-9444-cfdd12cadd49")
public abstract class ComponentRelationInstancePropertyPage<T extends ComponentRelationInstance> extends FeaturePropertyPage<T> {
    @objid ("02499b98-d3e0-4c4c-9c65-c53ee94b35f7")
    public ComponentRelationInstancePropertyPage(T elt) {
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
    @objid ("50be487c-f367-457a-a9a9-251e7996a436")
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
    @objid ("fca0f71d-4ac0-42f6-a99a-d592a20e78b3")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
