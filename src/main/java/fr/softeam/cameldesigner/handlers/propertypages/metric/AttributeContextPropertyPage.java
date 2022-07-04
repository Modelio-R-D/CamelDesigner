package fr.softeam.cameldesigner.handlers.propertypages.metric;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePropertyPage;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Class;

@objid ("55fad0e7-3cfb-416a-8659-fcc6be5baf3e")
public class AttributeContextPropertyPage<T extends AttributeContext> extends FeaturePropertyPage<T> {
    @objid ("dd2e8a9e-13ea-4a91-b5c2-67b4721352ea")
    private List<ModelElement> _attribute = null;

    @objid ("42ce4ec7-0be4-4a34-b782-ac7a186c7a17")
    private List<ModelElement> _objectContext = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("faac953e-060c-4aae-9bda-5c0b26475643")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 4){
            ModelElement elt = getModelElt(this._attribute, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelAttribute.STEREOTYPE_NAME)) {
                this._element.setAttribute(((CamelAttribute) elt));
            }
        }
        
        
        else if(this._currentRow == 5){
            Class elt = (Class) getModelElt(this._objectContext, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ObjectContext.STEREOTYPE_NAME)) {
                this._element.setObjectContext((ObjectContext) elt);
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
    @objid ("80daed45-dee1-4a3e-886c-c093650179c2")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
              //Attribute
        this._attribute = CamelElement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Attribute", getCamelName(this._element.getAttribute()), getCamelNames(this._attribute));
        
        //Object Context
        this._objectContext = CamelElement.MdaTypes.STEREOTYPE_ELT.getExtendedElement();
        table.addProperty("Object Context", getCamelName(this._element.getObjectContext()), getCamelNames(this._objectContext));
    }

    @objid ("d13524d2-ea6f-4074-b194-8124dcaee45a")
    public AttributeContextPropertyPage(T elt) {
        super(elt);
    }

}
