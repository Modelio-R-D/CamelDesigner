package fr.softeam.cameldesigner.exchange.importer.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import camel.deployment.PaaSConfiguration;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;

@objid ("32cb9057-4659-4987-b9f2-0fea2b969f72")
public class PaaSConfigurationImporter<T extends PaaSConfiguration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration> extends ConfigurationImporter<T,V> {
    @objid ("ccc4904a-a24a-4824-9708-0a5432a96552")
    public PaaSConfigurationImporter() {
        super();
    }

    @objid ("3a00d27e-fc71-497b-aad9-92c3404d0b56")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.create();
    }

    @objid ("690e0445-9f14-4e1c-82da-cbe56b6e7c49")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("9f07ccba-88a6-4815-8cf3-d003cbf0d8bb")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitPaaSConfiguration(this);
    }

    @objid ("dd281e8d-d22a-4e9d-a8f3-da49e8cb43cc")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setApi(elt);
        setVersion(elt);
        setEndpoint(elt);
        setDownloadURL(elt);
    }

    @objid ("3ba3d98b-3b58-4c79-b909-92ff52111c11")
    private void setApi(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getApi();
        if (value != null) {
            elt.setApi(value);;
        }
    }

    @objid ("21ebc450-57c1-46b1-a352-d5d80e7ed5ca")
    private void setVersion(V elt) {
        String value = this._element.getApi();
        if (value != null) {
            elt.setVersion(value);;
        }
    }

    @objid ("f852bb6d-42a2-4e99-b143-228c985b7e45")
    private void setEndpoint(V elt) {
        String value = this._element.getEndpoint();
        if (value != null) {
            elt.setEndpoint(value);;
        }
    }

    @objid ("bb5ce1e1-427e-47db-9db0-1acd412a655b")
    private void setDownloadURL(V elt) {
        String value = this._element.getDownloadURL();
        if (value != null) {
            elt.setDownloadURL(value);;
        }
    }

}
