package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("75cbcb89-e859-4905-8b84-26e716e2ba32")
public class MetricModelDiagramPropertyPage<T extends MetricTypeModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bfa6d51d-a32c-4c21-9330-9e3b3cfaab2b")
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
    @objid ("cc6adff3-6269-4a7a-bfda-2b40b12af7fa")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("e4871879-df0b-4951-8121-a2a3edfcfc9c")
    public MetricModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
