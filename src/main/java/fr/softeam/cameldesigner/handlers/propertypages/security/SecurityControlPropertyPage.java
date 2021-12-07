package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("364ce501-c977-41c5-80d8-1f752c19173e")
public class SecurityControlPropertyPage<T extends SecurityControl> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("77ceafd2-8128-47bf-a2d8-d3779831c336")
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
    @objid ("79cefe01-08ff-467f-a20a-2f642806635c")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("a911193a-2a02-4116-9a59-fef08f812cda")
    public SecurityControlPropertyPage(T elt) {
        super(elt);
    }

}
