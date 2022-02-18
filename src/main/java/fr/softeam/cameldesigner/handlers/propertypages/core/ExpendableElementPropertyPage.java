package fr.softeam.cameldesigner.handlers.propertypages.core;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.propertiesPage.IModulePropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import fr.softeam.cameldesigner.api.CamelDesignerAbstractProxy;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;


public abstract class ExpendableElementPropertyPage<T extends ExpendableElement> extends NamedElementPropertyPage<T> {

    private List<ModelElement> _annotations = null;

    /**
     * This method handles the changes of the given property, identified by its row index, of a selected element
     * to a new value.
     * @param MObject : the selected element
     *
     * @param row : the row of the changed property
     * @param value : the new value of the property
     */
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
    @Override
    public void update(IModulePropertyTable table) {
        super.update(table);

        //Annotations
        this._annotations = CamelDesignerAbstractProxy.getMMSObject();
        table.addProperty("Annotations", getCamelValue(this._element.getAnnotations()), getAddRemove(this._annotations, this._element.getAnnotations()));
    }

    @objid ("8fa5350e-f480-4aef-a7e5-e8d6145d0e81")
    public ExpendableElementPropertyPage(T elt) {
        super(elt);
    }

}
