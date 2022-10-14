package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MmsConcept;
import camel.mms.MmsProperty;
import camel.mms.MmsPropertyType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b06cc999-936b-4cc3-a9a6-cd15cf409f1c")
public class MmsPropertyImporter<T extends MmsProperty, V extends fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty> extends MmsObjectImporter<T,V> {
    @objid ("768e33d6-eeb2-4ff7-b11a-fe972b5b2749")
    public MmsPropertyImporter() {
    }

    @objid ("cc82194a-5deb-49d6-b03c-1705a1d8f9a5")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMmsProperty(this);
    }

    @objid ("20863e2e-1bbf-4daa-867c-bda73bcc5118")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.create();
    }

    @objid ("9bbf5990-8f35-4f7b-9968-e62d6158dd4d")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setRangeUri(elt);
        setPropertyType(elt);
    }

    @objid ("6b36a532-ed48-4d49-9e38-cc6518dd4687")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept) {
            fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept owner = (fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept) context;
            owner.addProperty(elt);
        } else {
            super.attach(elt, context);
        }
    }

    @objid ("f48bf955-06d4-4a00-b2af-7ca5c6fa53be")
    public MmsPropertyImporter(T elt) {
        super(elt);
    }

    @objid ("fb418d08-79f5-4b4f-9e5b-738c7a3ebb9b")
    private void setPropertyType(V elt) {
        MmsPropertyType value = this._element.getPropertyType();
        if (value != null) {
            elt.setMmsPropertyType(value);
        }
    }

    @objid ("73059355-875c-463f-af0f-3ad6554191fc")
    private void setRangeUri(V elt) {
        String value = this._element.getRangeUri();
        if (value != null) {
            elt.setRangeUri(value);
        }
    }

    @objid ("2b325988-b5b1-4be1-8c73-2a199d2bc95e")
    private void setRange(V elt) {
        MmsConcept value = this._element.getRange();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept) {
                elt.setRange((fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept) valueElt);
        
            }
        }
    }

}
