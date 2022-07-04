package fr.softeam.cameldesigner.handlers.propertypages.scalability;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("074b7547-84e6-48a9-80a5-426d0ea4c94e")
public class FunctionalEventPropertyPage<T extends FunctionalEvent> extends FeaturePropertyPage<T> {
    @objid ("8341c6a4-0cd1-4932-bde7-e40103690923")
    private List<ModelElement> _functionalType = null;

    @objid ("80b04765-58e6-4b1c-8943-1239ef95f8c2")
    private List<ModelElement> _component = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("6a5f82dd-3164-4352-852c-bdc3046aad44")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = (ModelElement) getModelElt(this._functionalType, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME)) {
                this._element.setFunctionalType( (CamelAttribute) elt);
            }
        }
        
        else if(this._currentRow == 2){
            ModelElement elt = getModelElt(this._component, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelComponent.STEREOTYPE_NAME)) {
            this._element.setComponent((CamelComponent) elt);;
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
    @objid ("adda9319-1891-4ccd-b86d-fcf96a01f671")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Functional Type
        this._functionalType = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Functional Type", getCamelName(this._element.getFunctionalType()), getCamelNames(this._functionalType));
        
        //Component
        this._component = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Component", getCamelName(this._element.getComponent()), getCamelNames(this._component));
    }

    @objid ("c5782770-e12c-4a3c-afba-c9ab0c6d1792")
    public FunctionalEventPropertyPage(T elt) {
        super(elt);
    }

}
