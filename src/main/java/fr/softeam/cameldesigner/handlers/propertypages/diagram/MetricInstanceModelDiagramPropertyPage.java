package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricInstanceModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("fd3fe0fd-7f05-4567-a1b3-589b9a3072ff")
public class MetricInstanceModelDiagramPropertyPage<T extends MetricInstanceModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("b7a51c27-df59-4bf4-b7d5-6c0c04156961")
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
    @objid ("16c047e1-c391-428a-b57d-b9b59ebe1a8b")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("8c990948-c92a-4d92-8dd2-520d74ec5808")
    public MetricInstanceModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
