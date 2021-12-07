package fr.softeam.cameldesigner.handlers.propertypages.organisation;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("000e8d5c-99a1-4599-8cf0-18e5fd945369")
public class EntityPropertyPage<T extends Entity> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c991a95c-040f-4098-9f88-a5db06e2c0a2")
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
    @objid ("fd200e66-0c38-4744-9715-00db54531154")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("18258fd2-0760-493d-a604-05bb4a1e9064")
    public EntityPropertyPage(T elt) {
        super(elt);
    }

}
