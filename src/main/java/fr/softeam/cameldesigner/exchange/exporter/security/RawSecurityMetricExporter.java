package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("40783aa2-fcc0-43eb-a85b-9b4e0f576ef7")
public class RawSecurityMetricExporter<T extends RawSecurityMetric> extends FeatureExporter<T> {
    @objid ("091495b6-5747-4887-86b1-eee2cdff5e98")
    public RawSecurityMetricExporter(T elt) {
        super(elt);
    }

    @objid ("5106a6b3-b970-42d5-82d1-d0ae2a574533")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createRawSecurityMetric();
    }

    @objid ("2bc3d564-b3c6-4579-8343-3e107e44ae91")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.security.RawSecurityMetric) {
            setDomain((camel.security.RawSecurityMetric) elt);
        }
    }

    @objid ("585923cd-fb07-44a4-8387-3e2b26af111a")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.security.RawSecurityMetric)) {
            ((camel.security.SecurityModel) context).getRawSecurityMetrics().add((camel.security.RawSecurityMetric) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("5d82d964-e534-4c38-971c-6cbf4b4b60bd")
    private void setDomain(camel.security.RawSecurityMetric sc) {
        CDOObject domain = this._process.getElement(this._element.getDomain());
        if ((domain != null) &&  (domain instanceof camel.security.SecurityDomain))
            sc.setDomain((camel.security.SecurityDomain) domain);
    }

}
