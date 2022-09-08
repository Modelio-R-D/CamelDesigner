package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ClusterConfiguration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bf2fffa3-9a4c-46a0-afbc-dfa294627756")
public class ClusterConfigurationImporter<T extends ClusterConfiguration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> extends ConfigurationImporter<T,V> {
    @objid ("88e77335-560d-42ba-9bce-5972226a8e39")
    public ClusterConfigurationImporter() {
        super();
        // TODO Auto-generated constructor stub
    }

    @objid ("d77394cb-95ae-4f6f-ba26-5c4f97587e36")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.create();
    }

    @objid ("4f3091f8-a266-46d7-86aa-991ab1f21850")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("f5939444-e66a-4c18-9064-780de1599448")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitClusterConfiguration(this);
    }

    @objid ("efde7803-3f3e-4b3c-afe6-09df39c7ffa7")
    public void setProperties(V elt) {
        super.setProperties(elt);
        setDownloadURL(elt);
    }

    @objid ("a20adf1d-023c-48fb-84a7-8f0eb7df82f9")
    private void setDownloadURL(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getDownloadURL();
        if (value != null) {
            elt.setDownloadURL(value);
        }
    }

}
