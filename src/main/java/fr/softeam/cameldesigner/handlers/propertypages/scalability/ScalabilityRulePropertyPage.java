package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c2372bfa-6db4-4f41-a970-21a4b74757f3")
public class ScalabilityRulePropertyPage<T extends ScalabilityRule> extends FeaturePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5993e6d0-322b-402c-93d9-dcef79eb92c7")
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
    @objid ("f5d97688-ed1d-4bb2-bb85-8c9d677cbdad")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("77a02be7-0c53-449c-900c-388867d694f0")
    public ScalabilityRulePropertyPage(T elt) {
        super(elt);
    }

}
