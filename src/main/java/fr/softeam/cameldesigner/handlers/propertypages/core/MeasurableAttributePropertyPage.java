package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4f2ca813-b436-41af-b19a-cfd35dd2b554")
public class MeasurableAttributePropertyPage<T extends MeasurableAttribute> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("75df268e-e898-4773-a99f-5d8c3ac37f11")
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
    @objid ("c9480a7b-f45d-49b9-803a-0a1d8d210870")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("7b9a8d07-12f0-42ac-b448-ad4f9200100b")
    public MeasurableAttributePropertyPage(T elt) {
        super(elt);
    }

}
