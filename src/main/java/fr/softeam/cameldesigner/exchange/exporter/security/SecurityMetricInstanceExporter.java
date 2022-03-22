package fr.softeam.cameldesigner.exchange.exporter.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.security.SecurityFactory;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricInstanceExporter;

@objid ("b9d7596f-0998-4d14-80ac-6df1deb5a9a8")
public class SecurityMetricInstanceExporter<T extends SecurityMetricInstance> extends MetricInstanceExporter<T> {
    @objid ("67a79504-ecd1-4bc8-85d9-97324360bbee")
    public SecurityMetricInstanceExporter(T elt) {
        super(elt);
    }

    @objid ("431bf679-cff4-41c5-9c4c-9df1d6eb03d3")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecurityMetricInstance();
    }

    @objid ("923f6aa7-f42c-4509-9446-28f2d9dff8c1")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3d07c6a7-d9bd-4a7e-90c9-78b9a4aa0362")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.security.SecurityMetricInstance)) {
            ((camel.security.SecurityModel) context).getSecurityMetricInstances().add((camel.security.SecurityMetricInstance) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
