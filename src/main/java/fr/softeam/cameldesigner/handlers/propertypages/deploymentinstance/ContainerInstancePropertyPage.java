package fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ea8833fb-246b-4a6a-8392-18b7587d5b31")
public class ContainerInstancePropertyPage<T extends ContainerInstance> extends ComponentInstancePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("74eaa95b-0af0-48c6-969d-a0a337cb17e3")
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
    @objid ("0f6896fd-0bdd-4d9d-969f-02c871152e40")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ad8b3ce2-ee5a-416f-97a4-81729ca5497c")
    public ContainerInstancePropertyPage(T elt) {
        super(elt);
    }

}
