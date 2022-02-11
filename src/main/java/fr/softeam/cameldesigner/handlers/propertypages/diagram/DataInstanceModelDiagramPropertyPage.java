package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a039d1bd-8310-4dc8-bfb1-6486381d7023")
public class DataInstanceModelDiagramPropertyPage<T extends DataInstanceModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * *
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("cc4faaa7-aa0f-4278-aa0e-7f24da4177fb")
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
    @objid ("85994e2b-01fe-4f01-8789-48974b74a947")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("9d435a9a-5488-4361-aa00-950b67ebd913")
    public DataInstanceModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
