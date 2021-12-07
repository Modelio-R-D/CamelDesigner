package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("84e9bfb1-d135-4424-a491-addcdabffcdf")
public class ContainerPropertyPage<T extends Container> extends CamelComponentPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("d309c4b9-c98e-4e96-99fe-d55b3dd3d0e4")
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
    @objid ("85735758-fc98-4a1f-aff6-3148a52d78b1")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("728b8cc8-2497-4ce2-abfa-85f609f9c9aa")
    public ContainerPropertyPage(T elt) {
        super(elt);
    }

}
