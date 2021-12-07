package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("c2528cfb-b181-4f21-b251-0beb7e261b29")
public class ExecutionModelDiagramPropertyPage<T extends ExecutionModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("771aa8ab-0d4e-44a1-a5d5-7a405a6852b9")
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
    @objid ("28ea9f21-5479-41f1-a239-956b7fe855b1")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("04704bf3-8edd-46da-9ed6-5fe868c5f4fd")
    public ExecutionModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
