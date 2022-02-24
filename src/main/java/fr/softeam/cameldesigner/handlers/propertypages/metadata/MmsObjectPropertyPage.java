package fr.softeam.cameldesigner.handlers.propertypages.metadata;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("36423306-f950-4d13-ae37-2dc7c8cd2e25")
public abstract class MmsObjectPropertyPage<T extends MmsObject> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("22227c8a-4dc5-4961-a3bc-abbc53ae60f3")
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
    @objid ("398c4a93-4893-45ba-a0e3-23cd1a295bc0")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("5e3fbbd0-7dbe-4941-9a5b-c1981cee43d3")
    public MmsObjectPropertyPage(T elt) {
        super(elt);
    }

}
