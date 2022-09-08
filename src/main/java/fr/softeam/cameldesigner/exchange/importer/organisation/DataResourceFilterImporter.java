package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.DataResourceFilter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1b4287c3-f83c-446c-86e9-1126720bfe5e")
public class DataResourceFilterImporter<T extends DataResourceFilter, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> extends ResourceFilterImporter<T,V> {
    @objid ("e00111db-649b-4470-8f93-8527a4b8dbfb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataResourceFilter(this);
    }

    @objid ("f0e3ea30-0d56-44df-9c40-dfe2f5060c2f")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.create();
    }

    @objid ("e82e6a83-bacf-4834-bf8c-82af89b3aab0")
    public DataResourceFilterImporter() {
    }

    @objid ("320d7bb7-eebd-4cdc-b33c-a7cd818f732b")
    public DataResourceFilterImporter(T elt) {
        super(elt);
    }

    @objid ("fde8a1bf-c958-4785-8bb9-aa4ca10182f9")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
