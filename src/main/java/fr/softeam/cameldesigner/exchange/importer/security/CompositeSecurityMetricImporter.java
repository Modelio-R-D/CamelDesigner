package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.CompositeSecurityMetric;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.metric.CompositeMetricImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6c479079-eee5-4411-b9ce-7821ffec9d4a")
public class CompositeSecurityMetricImporter<T extends CompositeSecurityMetric, V extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric> extends CompositeMetricImporter<T,V> {
    @objid ("cbf78bde-bffc-4215-aa19-35ec5cdfdc66")
    public CompositeSecurityMetricImporter() {
    }

    @objid ("e2413162-bcc7-4be9-a986-1ba4f817a568")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCompositeSecurityMetric(this);
    }

    @objid ("a4fcb299-33dd-4e49-8b30-e1e7c2ebea85")
    public CompositeSecurityMetricImporter(T elt) {
        super(elt);
    }

    @objid ("e723e02a-d2e5-47a3-9cb0-dbc6ffc19a66")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("04604f3e-6e11-4f9d-bb35-be52c83d693f")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.create();
    }

}
