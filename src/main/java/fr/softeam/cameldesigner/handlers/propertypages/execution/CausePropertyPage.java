package fr.softeam.cameldesigner.handlers.propertypages.execution;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f002a613-1dee-4c57-853b-783f2ea22391")
public class CausePropertyPage<T extends Cause> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("9d4064b6-7f39-4c36-becc-d0241b2316db")
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
    @objid ("f0f6e5fa-98c0-4b1f-973f-5a5fc044509d")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("418d6f0a-dbab-4dd0-b935-e0788cc10a6c")
    public CausePropertyPage(T elt) {
        super(elt);
    }

}
