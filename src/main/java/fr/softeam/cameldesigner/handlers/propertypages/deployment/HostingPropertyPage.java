package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
<<<<<<< HEAD
=======
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.ComponentRelationPropertyPage;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("17a4e1de-d1f4-4848-9af4-dba41bd8eaef")
public class HostingPropertyPage<T extends Hosting> extends ComponentRelationPropertyPage<T> {
    @objid ("1acbce05-2d73-4fd0-9422-b7ad3613253c")
    public HostingPropertyPage(T elt) {
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
    @objid ("f92fdfdd-9743-4e0f-ab26-250614e5cec2")
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
    @objid ("f9223ba4-cdc6-4104-826d-dab1344ab5e3")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

}
