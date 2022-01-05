package fr.softeam.cameldesigner.handlers.propertypages.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("5ed5046b-b9df-4ad6-947b-648400d43f6f")
public class CertifiablePropertyPage<T extends Certifiable> extends SecurityAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("954bb939-51e3-46df-990d-a75a3af2c18d")
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
    @objid ("d21dd385-bdaa-48d3-b6d2-172f2cbab0e2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("1c082888-5840-4c61-8ba6-00382c7ae977")
    public CertifiablePropertyPage(T elt) {
        super(elt);
    }

}
