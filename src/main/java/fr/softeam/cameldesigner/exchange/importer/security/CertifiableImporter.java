package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.Certifiable;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b861cfe3-f072-4a91-a0ba-0d80daa02570")
public class CertifiableImporter<T extends Certifiable, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable> extends SecurityAttributeImporter<T,V> {
    @objid ("172fea1b-0248-458d-b89f-0f7416c74e5c")
    public CertifiableImporter() {
    }

    @objid ("c8e0a373-1ae3-40e3-a424-458031bad18d")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCertifiable(this);
    }

    @objid ("a10e2784-ff5a-4e9b-ba64-6eecbb70b8e7")
    public CertifiableImporter(T elt) {
        super(elt);
    }

    @objid ("2c8d5069-f1ea-44c5-bd0f-efed3f92ff41")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("e086ed74-f023-45a3-95fd-e53b085e5925")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.create();
    }

}
