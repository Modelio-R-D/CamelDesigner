package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.ServiceResourceFilter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7a5c1f0f-2f67-4f8c-8a9b-741c29f5088f")
public class ServiceResourceFilterImporter<T extends ServiceResourceFilter, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter> extends ResourceFilterImporter<T,V> {
    @objid ("05077c05-0add-4d4b-997d-1a95ee56fcf3")
    public ServiceResourceFilterImporter() {
    }

    @objid ("dc4b0d2b-c153-41c2-bdc1-6e1b0fd6cb0b")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitServiceResourceFilter(this);
    }

    @objid ("8028d276-ebe1-4ec7-a1a5-f2569e9d48e2")
    public ServiceResourceFilterImporter(T elt) {
        super(elt);
    }

    @objid ("c99ad3aa-178b-4156-8335-ba8bf2b8e0a2")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.create();
    }

    @objid ("23d459d9-a7d8-4055-a149-001a9b9da2b6")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
