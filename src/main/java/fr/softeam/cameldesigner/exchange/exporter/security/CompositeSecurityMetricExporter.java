package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("32caaad5-d3be-41f0-bd3b-a5a2c03ab48b")
public class CompositeSecurityMetricExporter<T extends CompositeSecurityMetric> extends FeatureExporter<T> {
    @objid ("f60df742-56f9-42e3-935e-d7b45cd160d6")
    public CompositeSecurityMetricExporter(T elt) {
        super(elt);
    }

    @objid ("bc4dfd83-e17a-4ce0-84a9-c7268a3af694")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createCompositeSecurityMetric();
    }

    @objid ("f74a0e31-425b-4989-959c-c425ce799844")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("61c57908-5ae9-4c05-bfdc-02de7c554ad5")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.security.CompositeSecurityMetric)) {
            ((camel.security.SecurityModel) context).getCompositeSecurityMetrics().add((camel.security.CompositeSecurityMetric) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
