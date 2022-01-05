package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("635d0e4c-e941-4e4b-be21-18b3b5985f89")
public class ScalabilityModelDiagramPropertyPage<T extends ScalabilityModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8a3c7a17-95f3-4ba7-b0c3-929b1d188e46")
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
    @objid ("17d473d0-61e5-4d8a-92c9-c5617ec7ab10")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("b1a21f5a-3fb7-4481-80f3-a45556a19799")
    public ScalabilityModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
