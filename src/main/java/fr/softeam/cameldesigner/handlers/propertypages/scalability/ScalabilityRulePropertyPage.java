package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("c2372bfa-6db4-4f41-a970-21a4b74757f3")
public class ScalabilityRulePropertyPage<T extends ScalabilityRule> extends FeaturePropertyPage<T> {
    @objid ("d3ca2229-c184-4212-a669-71fd305df6b3")
    private List<ModelElement> _event = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("5993e6d0-322b-402c-93d9-dcef79eb92c7")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._event, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Event.STEREOTYPE_NAME)) {
                this._element.setEvent((Event) elt);
            }
        }
        
        
        else if(this._currentRow == 2) {
            Class elt = (Class) getModelElt(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), value);
            if ((elt != null) && (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Action.STEREOTYPE_NAME))) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addActions((Action) mmsObj);
                }else {
                    this._element.removeActions((Action) mmsObj);
                }
            }
        }
        this._currentRow -= 2;
    }

    /**
     * This method handles the construction of the property table of a selected element
     * @param MObject : the selected element
     * 
     * @param table : the property table to fulfill
     */
    @objid ("f5d97688-ed1d-4bb2-bb85-8c9d677cbdad")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Event
        this._event = CamelDesignerAbstractProxy.getEvents();
        table.addProperty("Event", getCamelName(this._element.getEvent()), getCamelNames(this._event));
        
              //Actions
        table.addProperty("Actions", getCamelValue(this._element.getActions()), getAddRemove(Action.MdaTypes.STEREOTYPE_ELT.getExtendedElement(), this._element.getActions()));
    }

    @objid ("77a02be7-0c53-449c-900c-388867d694f0")
    public ScalabilityRulePropertyPage(T elt) {
        super(elt);
    }

}
