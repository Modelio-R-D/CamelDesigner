package fr.softeam.cameldesigner.exchange.importer.organisation;

import camel.organisation.SoftwareComponentResourceFilter;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("eeb41228-c727-4b55-887a-48d3347e835a")
public class SoftwareComponentResourceFilterImporter<T extends SoftwareComponentResourceFilter, V extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter> extends ResourceFilterImporter<T,V> {
    @objid ("313cf8f0-4870-4e3f-8cbc-a6f3c6da2946")
    public SoftwareComponentResourceFilterImporter() {
    }

    @objid ("5af72042-a710-451b-beeb-11a0cafed46a")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSoftwareComponentResourceFilter(this);
    }

    @objid ("5549161c-8bee-4d41-8f7e-553df039dba0")
    public SoftwareComponentResourceFilterImporter(T elt) {
        super(elt);
    }

    @objid ("d0714b79-8f37-4c97-b050-b9fb2a00b311")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.create();
    }

    @objid ("a38c08ee-2a78-4c82-b7f1-34e04d491c46")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
