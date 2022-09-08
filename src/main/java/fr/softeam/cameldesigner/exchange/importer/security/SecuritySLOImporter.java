package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.SecuritySLO;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.requirement.ServiceLevelObjectiveImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d83e35a1-265c-4a38-8302-bc7e62edfca0")
public class SecuritySLOImporter<T extends SecuritySLO, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO> extends ServiceLevelObjectiveImporter<T,V> {
    @objid ("b6057d74-1d30-41da-b486-5e655ef1159f")
    public SecuritySLOImporter() {
    }

    @objid ("9adf4c63-e396-4c86-b848-c15de7017487")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecuritySLO(this);
    }

    @objid ("91159dcc-1ce7-41f2-ade3-1f3b73893f7e")
    public SecuritySLOImporter(T elt) {
        super(elt);
    }

    @objid ("bbc1d44d-e4dc-4b61-a614-658ec314d30c")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("41ae391d-9338-45cc-8244-e0dcc31993db")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.create();
    }

}
