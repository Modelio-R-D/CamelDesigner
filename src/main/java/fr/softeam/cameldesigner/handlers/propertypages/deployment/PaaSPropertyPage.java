package fr.softeam.cameldesigner.handlers.propertypages.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("f85878da-158c-4a83-82f2-af113e3ca3b2")
public class PaaSPropertyPage<T extends PaaS> extends CamelComponentPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("561c3e13-2872-468f-b401-d8611b41d297")
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
    @objid ("c64b0c92-c9e3-4802-b1cf-7c29d424dc32")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("17e64961-c29d-4335-9f0c-63a7febc9c27")
    public PaaSPropertyPage(T elt) {
        super(elt);
    }

}
