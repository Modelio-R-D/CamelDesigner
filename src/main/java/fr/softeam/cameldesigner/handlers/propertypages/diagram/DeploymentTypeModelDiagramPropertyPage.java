package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("d10087a5-8a11-47bb-b10c-0481f8393dd6")
public class DeploymentTypeModelDiagramPropertyPage<T extends DeploymentTypeModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8e839866-1de9-4782-b985-3f98907244b1")
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
    @objid ("f3449f98-078b-496b-bd49-942818e0571a")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("f27da898-2aa3-4c91-a1d4-ba2ff3c88c1e")
    public DeploymentTypeModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
