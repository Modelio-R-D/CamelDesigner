package fr.softeam.cameldesigner.handlers.propertypages.data;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("3abc2091-666e-4700-b0ef-ed4ac5a8b3f3")
public class DataInstanceModelPropertyPage<T extends DataInstanceModel> extends DataModelPropertyPage<T> {
    @objid ("b1470a46-73d5-480c-af28-c9b164ba27df")
    private List<ModelElement> _type = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("f7b25edf-d021-41c0-ac58-8cca34527a8b")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._type, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, DataTypeModel.STEREOTYPE_NAME)) {
                this._element.setType((DataTypeModel) elt);
            }
        }
        
        this._currentRow -= 1;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("24650c09-f872-4cad-ae75-6535c25988b2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        this._type = CamelDesignerAbstractProxy.getEvents();
        table.addProperty("Type", getCamelName(this._element.getType()), getCamelNames(this._type));
    }

    @objid ("c04f1786-9e66-4d78-a41d-d0eced4ebf21")
    public DataInstanceModelPropertyPage(T elt) {
        super(elt);
    }

}
