package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("0367f234-bd02-481f-974f-775bf1baef2d")
public class SecurityModelDiagramPropertyPage<T extends SecurityModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("ae276315-092b-4883-bd9e-6106ebdd4337")
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
    @objid ("199bad8c-81c7-492f-a34c-89a2b7498d54")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("dc9b1237-a1ef-4641-9af9-03c87d7d592b")
    public SecurityModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
