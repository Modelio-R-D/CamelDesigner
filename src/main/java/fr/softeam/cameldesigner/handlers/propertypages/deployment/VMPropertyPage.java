package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("5ffc0aaf-52e4-47aa-ab99-1e9b92e0f447")
public class VMPropertyPage<T extends VM> extends CamelComponentPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("144c3af5-84ff-4bbc-8286-ba73503b81ed")
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
    @objid ("ef1ac23d-c964-4cad-b91d-3fa25b63a3c4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("92c99d16-f405-42e5-b7d8-37952269f6d3")
    public VMPropertyPage(T elt) {
        super(elt);
    }

}
