package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.RawSecurityMetric;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.metric.RawMetricImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d6ac824c-d802-4991-bb82-b223f2e46a85")
public class RawSecurityMetricImporter<T extends RawSecurityMetric, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric> extends RawMetricImporter<T,V> {
    @objid ("281f6f02-d26f-4eb6-bdd3-6e19e14cef00")
    public RawSecurityMetricImporter() {
    }

    @objid ("f6eba84e-a9cb-4fbf-a65c-76cdb7c55e76")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRawSecurityMetric(this);
    }

    @objid ("33f98aef-5155-4e7e-945d-bf5aa6ca273b")
    public RawSecurityMetricImporter(T elt) {
        super(elt);
    }

    @objid ("e2af5c21-a517-471a-bb6f-b78eb5c4fc99")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("7b830fe6-e9e4-4cb3-af1e-ab9f2e63e3a3")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.create();
    }

}
