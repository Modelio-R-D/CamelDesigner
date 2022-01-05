package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("7f7d386f-2ac9-4156-9bda-4da3903c4e83")
public class MetadataModelDiagramPropertyPage<T extends MetadataModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("201baab4-d90e-494d-bc74-968792179fe0")
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
    @objid ("58cff83b-fbec-4f71-a7c7-bc7db6631646")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("50779568-6386-4b87-b708-6718222fc488")
    public MetadataModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
