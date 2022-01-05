package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("1d3118c1-93c0-4305-bc7c-a7e9a3284de1")
public class PermissionPropertyPage<T extends Permission> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4632a433-d3c8-4e8b-bbd4-ee538098728e")
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
    @objid ("c8cf6744-e5b6-4025-a308-437e015efe82")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("1ec36d55-58b1-487c-992a-ee9b11a63ab9")
    public PermissionPropertyPage(T elt) {
        super(elt);
    }

}
