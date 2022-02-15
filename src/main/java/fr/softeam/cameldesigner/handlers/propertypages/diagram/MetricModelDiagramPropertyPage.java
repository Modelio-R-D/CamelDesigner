package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("2b5e19b1-53b3-42b1-8095-506400731ddc")
public class MetricModelDiagramPropertyPage<T extends MetricTypeModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("6411c6ab-2294-418d-9954-9be4a4a5673d")
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
    @objid ("80fc9c6e-3114-449a-9b0c-1a2afc86fcfb")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8f1845d9-a81a-4ec4-8cce-37667fd4e538")
    public MetricModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
