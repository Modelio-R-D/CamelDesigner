package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("4795c7cb-eab2-481f-a530-424aed355c84")
public class DataModelDiagramPropertyPage<T extends DataModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("71534023-ba4e-4d65-8dcc-8be4545bbc7b")
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
    @objid ("86849e81-200e-45f1-9067-6710ee04d047")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("07d73350-b562-4c1e-8f96-ad92b2011789")
    public DataModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
