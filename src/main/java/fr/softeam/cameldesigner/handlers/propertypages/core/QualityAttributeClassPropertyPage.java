package fr.softeam.cameldesigner.handlers.propertypages.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttributeClass;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("324d0a53-6898-48e9-91d1-0d400a4a1538")
public class QualityAttributeClassPropertyPage<T extends QualityAttributeClass> extends AttributeClassPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("90a485a7-87bb-4aa7-8a38-1692acebe1a6")
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
    @objid ("eac4af9d-03f6-43f6-b56a-d44b93769da2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("80204aec-f7d6-4db0-bf19-681b9f593772")
    public QualityAttributeClassPropertyPage(T elt) {
        super(elt);
    }

}
