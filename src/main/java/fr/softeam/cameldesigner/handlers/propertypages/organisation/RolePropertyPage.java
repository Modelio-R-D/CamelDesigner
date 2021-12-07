package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("00181da2-ce1a-4ada-8ad8-fc73a39b913d")
public class RolePropertyPage<T extends Role> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("a66b0f4e-07fe-4e75-92da-954cc9d1cae0")
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
    @objid ("d821a331-81d8-4aae-999f-a93ca44edc8c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("291c7081-41cd-45cf-abc9-c44a5d41b5b9")
    public RolePropertyPage(T elt) {
        super(elt);
    }

}
