package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MmsProperty;
import camel.mms.MmsPropertyInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7eee1f81-1aab-4b48-ae8c-17407cecd1d7")
public class MmsPropertyInstanceImporter<T extends MmsPropertyInstance, V extends fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance> extends MmsObjectImporter<T,V> {
    @objid ("1b88556e-8312-4eca-ab7c-44f1706c0e5d")
    public MmsPropertyInstanceImporter() {
    }

    @objid ("af51d2a7-136d-4604-b3ae-48e559229ef7")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMmsPropertyInstance(this);
    }

    @objid ("6084dc42-588d-4cb0-881b-04835b98a5a2")
    @Override
    public V createCamelElt(CDOObject owner) {
        return (V) V.create();
    }

    @objid ("35b4efa3-51d0-4066-93a3-13d43ebd7141")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setPropertyValue(elt);
        setIsA(elt);
    }

    @objid ("d91899b4-4308-4c08-9b01-f5740338416a")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("0592655c-b168-4191-af4f-f4612713cf83")
    public MmsPropertyInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("28846b5c-ccca-4691-a694-4fd705627a66")
    private void setPropertyValue(V elt) {
        String value = this._element.getPropertyValue();
        if (value != null) {
            elt.setPropertyValue(value);
        }
    }

    @objid ("a4416bc9-bacc-43eb-82a5-1eb44d1ec719")
    private void setIsA(V elt) {
        MmsProperty value = this._element.getIsA();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty) {
                elt.setIsA((fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty) valueElt);
        
            }
        }
    }

}
