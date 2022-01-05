package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("ea78640f-6d09-4ea8-b0b6-36f7179e3fee")
public class ResourceRequirementPropertyPage<T extends ResourceRequirement> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("877f5d4d-95f5-464d-b8f2-e8310d1c76da")
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
    @objid ("aeb5cc3c-bc7f-49f1-839d-8d0a105264a8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ac5f1cdf-60d4-4a75-8abe-13392b43cdd1")
    public ResourceRequirementPropertyPage(T elt) {
        super(elt);
    }

}
