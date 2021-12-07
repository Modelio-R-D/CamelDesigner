package fr.softeam.cameldesigner.handlers.propertypages.diagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.handlers.propertypages.core.NamedElementPropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;

@objid ("aa0065fb-35e4-43ac-af64-78dee9e527f6")
public class TypeModelDiagramPropertyPage<T extends TypeModelDiagram> extends NamedElementPropertyPage<T> {
    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("45ef520a-5480-45b0-8948-c0840587296f")
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
    @objid ("f67ef808-cc97-4617-9e56-ce706eb67e35")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
    }

    @objid ("de14780f-aa52-42d1-a126-ef1bc9aaee5c")
    public TypeModelDiagramPropertyPage(T elt) {
        super(elt);
    }

}
