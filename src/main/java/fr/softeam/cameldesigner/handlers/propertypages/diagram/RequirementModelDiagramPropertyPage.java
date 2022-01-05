package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("a5654f90-f960-4554-bfca-c752ea133c94")
public class RequirementModelDiagramPropertyPage<T extends RequirementModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("6b7fb682-9f42-48f4-a4ba-46095aa0051c")
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
    @objid ("a8504068-247e-47c9-990d-fcff3683ca39")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("08f6a0b4-ce15-4d70-956c-6c88c0b76de1")
    public RequirementModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
