package fr.softeam.cameldesigner.handlers.propertypages.execution;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("dd3a565f-0002-463d-b238-e9eb4d165af4")
public class ActionInstancePropertyPage<T extends ActionInstance> extends FeaturePropertyPage<T> {
    @objid ("080b35b9-3b1b-43e7-b8e6-d17c30f024e1")
    private List<ModelElement> _action = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("1d7521e6-45de-43cd-9d77-f3fd6e1ba53e")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        switch (this._currentRow) {
        
        case 1 :
            this._element.setStartTime(value);
            break;
        
        case 2 :
            this._element.setEndTime(value);
            break;
        
        case 3 :
            this._element.setSuccessful(Boolean.valueOf(value));
            break;
        
        case 4 :
            ModelElement elt = getModelElt(this._action, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Action.STEREOTYPE_NAME)) {
                this._element.setAction((Action) elt);
            }
            break;
        }
        
        this._currentRow -= 4;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("17ec69c7-b136-4949-92d0-139bf3111f40")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        table.addProperty("Start Time",  getValue(this._element.getStartTime()));
        table.addProperty("End Time",  getValue(this._element.getEndTime()));
        table.addProperty("Successful",  this._element.isSuccessful());
        
        
        this._action = CamelDesignerAbstractProxy.getActions();
        table.addProperty("Action", getCamelName(this._element.getAction()), getCamelNames(this._action));
    }

    @objid ("7dd19d9e-b425-4131-90a5-8b052b7b0fb5")
    public ActionInstancePropertyPage(T elt) {
        super(elt);
    }

}
