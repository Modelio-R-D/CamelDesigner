package fr.softeam.cameldesigner.exchange.exporter.security;

import camel.security.SecurityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2dd2cb10-1303-4083-95bc-a8f612622515")
public class CertifiableExporter<T extends Certifiable> extends SecurityAttributeExporter<T> {
    @objid ("bd1a9246-b959-4f0d-9bf8-18fae98d1371")
    public CertifiableExporter(T elt) {
        super(elt);
    }

    @objid ("07446514-1546-4d75-bdfd-ddd9d14f5d0a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return SecurityFactory.eINSTANCE.createCertifiable();
    }

    @objid ("280961c2-bae6-4f1b-9649-007d3a0314f8")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("32b973e0-75eb-45ef-902a-74cd9f70e7c3")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
