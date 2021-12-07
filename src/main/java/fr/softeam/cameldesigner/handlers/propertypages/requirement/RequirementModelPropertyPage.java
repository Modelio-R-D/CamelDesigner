package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.SubModelPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("dc473c8b-58cf-480f-8547-c84bbaa7ccbf")
public class RequirementModelPropertyPage<T extends RequirementModel> extends SubModelPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ab10ac28-514f-420f-a901-469a1fce7900")
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
    @objid ("bbc73dc1-66fe-4f61-8c63-39bf4293f38c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b1a52c38-a6a8-4e00-ba1a-4ba06c22cd18")
    public RequirementModelPropertyPage(T elt) {
        super(elt);
    }

}
