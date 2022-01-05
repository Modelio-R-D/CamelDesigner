package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("5f7468fc-ffd9-4799-bce1-470dbc628517")
public class CamelModelDiagramPropertyPage<T extends CamelModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("bd84bc2c-523a-46c0-96cc-a5fed7aaaddb")
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
    @objid ("3ea5fa43-104e-4da9-a804-84e6446008a8")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("01659711-ca16-4900-958a-f02880099be4")
    public CamelModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
