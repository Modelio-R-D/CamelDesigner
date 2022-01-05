package fr.softeam.cameldesigner.handlers.propertypages.requirement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("11812888-26dd-47c8-b2dd-b3e33dcbc5db")
public class PaaSRequirementPropertyPage<T extends PaaSRequirement> extends HardRequirementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("4e8d9e84-9c9f-419c-b258-41ea8aecb51f")
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
    @objid ("4c302139-6d70-4978-82b8-0ab38d07541b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("dcc514df-1ed7-4654-9d5f-e634b80f711e")
    public PaaSRequirementPropertyPage(T elt) {
        super(elt);
    }

}
