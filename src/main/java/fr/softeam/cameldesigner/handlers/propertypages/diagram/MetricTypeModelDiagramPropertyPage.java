package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("12784c8a-bc28-4000-92df-b041d351fd5c")
public class MetricTypeModelDiagramPropertyPage<T extends MetricTypeModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("368c2321-db9e-42b3-9e45-c2967e5afc56")
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
    @objid ("e97a46d3-41e6-4794-bef1-34f2b13615c7")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("37cd1930-514d-4915-8d2e-f59962562806")
    public MetricTypeModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
