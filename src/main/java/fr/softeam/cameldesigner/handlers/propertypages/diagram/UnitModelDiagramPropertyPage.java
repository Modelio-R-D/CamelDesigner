package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("9d6081d5-8a1d-4274-98c2-dec8859e832e")
public class UnitModelDiagramPropertyPage<T extends UnitModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("74ba2e78-3ff9-49c6-8f97-b56f6c6004d8")
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
    @objid ("19926005-a3fe-4c1b-83d9-8e0d613f4162")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("e7800ee5-76f4-4b72-8c5d-61c8224ade9f")
    public UnitModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
