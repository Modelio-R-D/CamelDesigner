package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("dfcbdc38-8e8f-44cc-b4e7-9d9ec41198b4")
public abstract class ComponentRelationPropertyPage<T extends ComponentRelation> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("285534d7-d8b3-4c73-a9fd-fe48ea170ae8")
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
    @objid ("eba81b35-b9cc-4962-a006-4e83871dfee8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("4a3d65f4-d4f4-457d-a126-6cad2144400d")
    public ComponentRelationPropertyPage(T elt) {
        super(elt);
    }

}
