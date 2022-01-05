package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.ServiceLevelObjectivePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("889ca0d1-54ab-4b8a-a8a3-6b4b45d33350")
public class SecuritySLOPropertyPage<T extends SecuritySLO> extends ServiceLevelObjectivePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4af306c2-4c2d-44de-95bb-6ef7fd0a1875")
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
    @objid ("63040f55-c374-4362-bd2c-5e3cadd8348b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("3447afeb-64a2-43d8-9ad6-3b4db42bda08")
    public SecuritySLOPropertyPage(T elt) {
        super(elt);
    }

}
