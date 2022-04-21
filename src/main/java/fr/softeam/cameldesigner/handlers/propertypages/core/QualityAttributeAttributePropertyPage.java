package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9cd76c96-7c5d-4599-b104-f05386729d12")
public class QualityAttributeAttributePropertyPage<T extends QualityAttributeAttribute> extends AttributeAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bd404c3e-2a1e-42b8-a632-dac7ae231ff8")
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
    @objid ("85947c53-dae5-41f8-93db-a3e6e64a2e68")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("ceb81dfa-ea16-4268-9a83-008a190996cd")
    public QualityAttributeAttributePropertyPage(T elt) {
        super(elt);
    }

}
