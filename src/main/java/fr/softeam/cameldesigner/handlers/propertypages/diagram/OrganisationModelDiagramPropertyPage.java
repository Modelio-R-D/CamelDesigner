package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("eaf8bd16-bc3a-4bda-9c32-d065a9e69a8c")
public class OrganisationModelDiagramPropertyPage<T extends OrganisationModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("939930df-6ce0-40b9-97fb-c660f4c2cbaa")
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
    @objid ("94d8d245-376d-446c-a50c-8b85526ff409")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("1cecd0cf-f14e-4b33-a914-3d2f83ac0cda")
    public OrganisationModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
