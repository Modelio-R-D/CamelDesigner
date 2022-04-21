package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.handlers.propertypages.core.QualityAttributeClassPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("62396e2e-2ba7-4d7b-9a63-1385fa6d0401")
public class SecurityAttributePropertyPage<T extends SecurityAttribute> extends QualityAttributeClassPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("78985f25-1e5e-4186-a101-b7cbb70432fd")
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
    @objid ("74647681-fe4b-4569-9ae7-e195e3990141")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ca9adcb8-6a8d-4626-9c0d-72c9cda42143")
    public SecurityAttributePropertyPage(T elt) {
        super(elt);
    }

}
