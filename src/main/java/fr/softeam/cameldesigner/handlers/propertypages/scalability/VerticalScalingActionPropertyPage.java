package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("be7f52ee-abc4-48fa-b9d2-4ac09dab81ab")
public class VerticalScalingActionPropertyPage<T extends VerticalScalingAction> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("1c3659c8-9bfb-4aad-b04b-abff05d7f9b5")
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
    @objid ("075a04c9-9d63-4835-9037-654ef67afb2a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("926a7409-be5b-48f2-a45f-4e3e16b621db")
    public VerticalScalingActionPropertyPage(T elt) {
        super(elt);
    }

}
