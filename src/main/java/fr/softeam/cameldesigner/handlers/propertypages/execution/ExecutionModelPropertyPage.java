package fr.softeam.cameldesigner.handlers.propertypages.execution;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4dc6f448-f99a-45fc-820a-13c3b8e1f512")
public class ExecutionModelPropertyPage<T extends ExecutionModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("67acb1dc-af84-4af8-b228-c23ad186e3d3")
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
    @objid ("4fb12fbf-31f0-4d78-9a52-1ffedc4ee30c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("6f1a6f31-f5e0-47f3-af30-a1ed4f96e792")
    public ExecutionModelPropertyPage(T elt) {
        super(elt);
    }

}
