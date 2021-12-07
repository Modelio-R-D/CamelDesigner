package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("039449b2-fc5c-46dc-ad44-84986957f219")
public class QualityAttributePropertyPage<T extends QualityAttribute> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("284848c5-2edd-46bf-a4a9-c29894e4d134")
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
    @objid ("79113556-a08a-4bf0-9ef7-87ae5793fe21")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("2db55384-53b4-4c9b-adf1-be9db455c981")
    public QualityAttributePropertyPage(T elt) {
        super(elt);
    }

}
