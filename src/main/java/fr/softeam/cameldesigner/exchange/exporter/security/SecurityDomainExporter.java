package fr.softeam.cameldesigner.exchange.exporter.security;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.security.SecurityFactory;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

@objid ("289bcbc8-80e2-401d-bae4-3453f85f91cb")
public class SecurityDomainExporter<T extends SecurityDomain> extends FeatureExporter<T> {
    @objid ("b8625bcb-ef20-42b1-8ab9-44eb2f71f8f5")
    public SecurityDomainExporter(T elt) {
        super(elt);
    }

    @objid ("b2804152-a080-470a-9070-22758b0a649e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecurityDomain();
    }

    @objid ("4feb11e4-4dea-4aaf-9889-f75210068f4f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.security.SecurityDomain) {
            setId((camel.security.SecurityDomain) elt);
        }

    }

    private void setId(camel.security.SecurityDomain elt) {
        String content = this._element.getId();
        if (content != null) {
            elt.setId(content);
        }
    }

    @objid ("ddf7df75-85be-44ba-af9c-53c2172fc211")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.security.SecurityModel) && (elt instanceof camel.security.SecurityDomain)) {
            ((camel.security.SecurityModel) context).getSecurityDomains().add((camel.security.SecurityDomain) elt);
        }else if ((context instanceof camel.security.SecurityDomain) && (elt instanceof camel.security.SecurityDomain)) {
                ((camel.security.SecurityDomain) context).getSubDomains().add((camel.security.SecurityDomain) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
