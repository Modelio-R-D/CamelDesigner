package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.SecurityDomain;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("04750d10-a930-4741-9dcf-4befcd735532")
public class SecurityDomainImporter<T extends SecurityDomain, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain> extends FeatureImporter<T,V> {
    @objid ("2355058c-77ea-4448-a693-af8953f19552")
    public SecurityDomainImporter() {
    }

    @objid ("865e0022-62a4-4407-a32e-22a5769a3aa3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecurityDomain(this);
    }

    @objid ("21c29c55-e179-403b-943e-23d5d0235ea8")
    public SecurityDomainImporter(T elt) {
        super(elt);
    }

    @objid ("c170d365-a909-4fbf-9373-56249cbfd61e")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("51b0e8c8-cd76-43f4-89dc-8ffeb2330260")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.create();
    }

}
