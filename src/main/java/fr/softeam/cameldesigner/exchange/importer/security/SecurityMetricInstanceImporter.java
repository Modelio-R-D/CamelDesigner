package fr.softeam.cameldesigner.exchange.importer.security;

import camel.security.SecurityMetricInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricInstanceImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c29f5129-8ebb-42f9-9410-62e389d446ec")
public class SecurityMetricInstanceImporter<T extends SecurityMetricInstance, V extends fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance> extends MetricInstanceImporter<T,V> {
    @objid ("2837fd15-323b-4e8b-87cc-92a665ba84b6")
    public SecurityMetricInstanceImporter() {
    }

    @objid ("3d24d473-8d67-43ab-8722-0b845ab8ea2c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSecurityMetricInstance(this);
    }

    @objid ("b7caf547-50a5-477a-bca1-2775cbc114c2")
    public SecurityMetricInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("ccee2988-da3c-4334-b286-dbe828cfe4e9")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("ee600290-1d7e-4e83-a4bc-aa13f616c8db")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.create();
    }

}
