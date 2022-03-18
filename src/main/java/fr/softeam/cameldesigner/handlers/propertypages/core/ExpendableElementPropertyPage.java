package fr.softeam.cameldesigner.handlers.propertypages.core;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("7632f2b8-13f8-4fa0-81c5-e6f9b47b10ad")
public abstract class ExpendableElementPropertyPage<T extends ExpendableElement> extends NamedElementPropertyPage<T> {
    @objid ("e1fe94ce-c75d-4010-8f8f-e03ba047f4fd")
    private List<ModelElement> _annotations = CamelDesignerAbstractProxy.getMMSObject();

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     * 
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
    @objid ("8a188a3e-c416-4de1-ade2-d3e3a5fa3e17")
    @Override
    public void changeProperty(int row, String value) {
        super.changeProperty(row, value);
        
        if(this._currentRow == 1){
            ModelElement elt = getModelElt(this._annotations, value);
            if (elt.isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME)) {
                Object mmsObj = CamelDesignerProxyFactory.instantiate(elt);
                if (value.startsWith(this._add)) {
                    this._element.addAnnotations((MmsObject) mmsObj);
                }else {
                    this._element.removeAnnotations((MmsObject) mmsObj);
                }
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
    @objid ("c4aa1c23-5607-41d1-b510-15745bda7b40")
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);
        
        //Annotations
        table.addProperty("Annotations", getCamelValue(this._element.getAnnotations()), getAddRemove(this._annotations, this._element.getAnnotations()));
    }

    @objid ("8fa5350e-f480-4aef-a7e5-e8d6145d0e81")
    public ExpendableElementPropertyPage(T elt) {
        super(elt);
    }

}
