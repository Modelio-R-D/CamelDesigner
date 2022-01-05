package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f2c18a21-303a-4eb4-ab60-6a64ce6e81a1")
public abstract class ComponentRelationInstancePropertyPage<T extends ComponentRelationInstance> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("1a900566-5d34-4042-bdd4-17f8ab6d560e")
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
    @objid ("08b74c55-26c5-4c10-bfe5-9d268d649241")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("0cad3a01-49e4-482d-875a-a5cc3eb782c7")
    public ComponentRelationInstancePropertyPage(T elt) {
        super(elt);
    }

}
