package fr.softeam.cameldesigner.exchange.importer.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import camel.core.NamedElement;
import camel.mms.MmsObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("1841f351-6417-46a7-aa5e-a351bae5ee5c")
public abstract class NamedElementImporter<T extends NamedElement, V extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement> extends CamelElementImporter<T,V> {
    @objid ("0bc330fe-2803-44c9-972d-9415258cddd7")
    public NamedElementImporter() {
    }

    @objid ("66377a61-9115-4ce6-a58c-75ffb416b7ea")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitNamedElement(this);
    }

    @objid ("63917946-0a1e-43c2-b762-845b284b915a")
    @Override
    public void setProperties(V elt) {
        setName(elt);
        setDescription(elt);
        setAnnotations(elt);
    }

    @objid ("bbd61cfc-d9ba-40e5-a08b-8e99cf29dbdb")
    public NamedElementImporter(T elt) {
        super(elt);
    }

    @objid ("d8dd550c-d1f5-4535-934a-fc30ef216352")
    private void setDescription(V elt) {
        String descrip = this._element.getDescription();
        if (descrip != null) {
            elt.setDescription(descrip);
        }
    }

    @objid ("9f165a77-3d4b-4b2f-b059-851e8adf7833")
    private void setName(V elt) {
        String name = this._element.getName();
        if (name != null) {
            elt.setName(name);
        }
    }

    @objid ("a7ccca6d-d449-4f8b-be7c-ef829a33121a")
    private void setAnnotations(V elt) {
        // TODO Auto-generated method stub
        EList<MmsObject> value = this._element.getAnnotations();
        if (value != null) {
            for (MmsObject obj: value) {
            CamelElement valueElt = this._process.getElement(obj);
            if (valueElt instanceof fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject) {
                elt.addAnnotations((fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject) valueElt);

            }
            }
        }
    }

}
