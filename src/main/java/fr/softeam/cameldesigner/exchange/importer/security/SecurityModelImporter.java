package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.SecurityModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f03e4ebe-3d37-4b36-9d7d-b92cd23d234d")
public class SecurityModelImporter<T extends SecurityModel, V extends fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel> extends SubModelImporter<T,V> {
    @objid ("4f0311ac-2953-45aa-bf2d-f8992ec069a0")
    public SecurityModelImporter() {
    }

    @objid ("2532c228-5c2b-446f-b830-4a10274642d5")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecurityModel(this);
    }

    @objid ("84ff54a8-2c08-4ed8-9836-19edc998d09f")
    public SecurityModelImporter(T elt) {
        super(elt);
    }

    @objid ("eff1c6a8-f4db-4a53-805d-953bddc5955c")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.create();
    }

    @objid ("cb53df7e-d463-429c-a906-876223d83a2d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addSecurityModels(elt);
    }

}
