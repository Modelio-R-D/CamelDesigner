package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("97afe988-3db2-4443-ada7-987f5f60cb36")
public class DeploymentInstanceModelDiagramPropertyPage<T extends DeploymentInstanceModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("362ea3a6-654b-42eb-a0d1-cc578135b10c")
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
    @objid ("b12a19dd-d1e8-482b-a01f-0a34b450c2a1")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("397d4f3b-2530-4b8d-8ac9-acfa279803b0")
    public DeploymentInstanceModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
