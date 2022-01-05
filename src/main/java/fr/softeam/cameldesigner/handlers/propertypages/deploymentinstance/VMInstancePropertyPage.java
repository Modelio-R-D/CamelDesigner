package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a7810819-6ed5-4074-8300-5e5d0843623d")
public class VMInstancePropertyPage<T extends VMInstance> extends ComponentInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8ecd391d-d2b3-4d3f-a5d4-cbfb98a27a08")
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
    @objid ("4b2a7396-c8d0-4af6-91a1-9f73276574f4")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("4398030a-7a4d-4308-be89-d103d8c3526e")
    public VMInstancePropertyPage(T elt) {
        super(elt);
    }

}
