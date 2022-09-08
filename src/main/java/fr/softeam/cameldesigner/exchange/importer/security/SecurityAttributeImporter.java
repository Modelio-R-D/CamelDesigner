package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.SecurityAttribute;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.QualityAttributeImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d6618ab4-301c-4e9e-917d-56a7790354fa")
public class SecurityAttributeImporter<T extends SecurityAttribute, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute> extends QualityAttributeImporter<T,V> {
    @objid ("308bd6db-7f65-4332-958c-43013ad4c533")
    public SecurityAttributeImporter() {
    }

    @objid ("b2294798-53b1-45c1-b8d3-74d147a97de0")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecurityAttribute(this);
    }

    @objid ("8d39b84f-de71-4eef-b2c1-8fe14d8a64de")
    public SecurityAttributeImporter(T elt) {
        super(elt);
    }

    @objid ("873448b2-81f1-4dc4-ad2a-169b97b0fb20")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("9a806278-7121-4e0f-bd5b-07312c52e4f9")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.create();
    }

}
