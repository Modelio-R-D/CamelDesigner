package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("935a3286-88b3-4606-bb1f-6cbaa81c965e")
public class AttributeClassPropertyPage<T extends AttributeClass> extends CamelAttributePropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f75a8e88-8bcb-462f-9510-b68d324616b6")
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
    @objid ("45aa53bb-d8f3-443f-a808-12cff1c49a2f")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("846de64a-c560-4d83-8c06-bdfa262d8502")
    public AttributeClassPropertyPage(T elt) {
        super(elt);
    }

}
