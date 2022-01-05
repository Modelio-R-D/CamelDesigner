package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.exchange.exporter.core.QualityAttributeExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("210f651e-1c5d-4dfa-9c2c-9deb6e46896b")
public class SecurityAttributeExporter<T extends SecurityAttribute> extends QualityAttributeExporter<T> {
    @objid ("8c2a9141-15c3-4505-bc31-ffde7074adca")
    public SecurityAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("1ad3660c-1289-4239-911b-0a40178175ea")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createSecurityAttribute();
    }

    @objid ("aea3d7d1-a92f-4123-abb4-bc2f511ac83b")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("0592936a-d831-4ceb-939f-4ef11012132d")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
