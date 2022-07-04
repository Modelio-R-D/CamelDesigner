package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("2332a350-02b1-439f-9cc7-0576907ac6e0")
public class HorizontalScalingActionPropertyPage<T extends HorizontalScalingAction> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("c7e1198b-347d-4158-a913-43938394d784")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        this._element.setCount(value);
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("18a84f20-bd8a-40fe-bfa1-40d7ce7502b7")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Count", this._element.getCount());
    }

    @objid ("aaca7da5-dd94-449b-afa1-b89c53da6222")
    public HorizontalScalingActionPropertyPage(T elt) {
        super(elt);
    }

}
