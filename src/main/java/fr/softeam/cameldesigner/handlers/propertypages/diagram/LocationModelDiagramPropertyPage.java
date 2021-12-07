package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a3c8f570-b09b-4e87-9017-b6cb835a73f7")
public class LocationModelDiagramPropertyPage<T extends LocationModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("0de9e188-2e51-4ec8-b276-1c9ee5fdc06b")
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
    @objid ("80a24d4e-7fe2-46ba-9505-52a6b6f061cb")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("95cd2799-9804-4097-9a2c-2dadebcbe5d2")
    public LocationModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
