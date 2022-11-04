package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ServerlessConfiguration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("7786395d-0312-4b68-8bc9-4b96e908377e")
public class ServerlessConfigurationImporter<T extends ServerlessConfiguration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> extends ConfigurationImporter<T,V> {
    @objid ("986c8210-3fe8-48c5-82d4-2700c70d5b9e")
    public ServerlessConfigurationImporter() {
        super();
    }

    @objid ("174e212a-5a47-4f0b-9c9a-2392501010f6")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.create();
    }

    @objid ("90129434-badf-4ef9-825a-5f0cae4a92d5")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitServelessConfiguration(this);
    }

    @objid ("8aaca2a1-4101-43e9-9781-d4e012044761")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setBinaryCodeURL(elt);
        setContinuousDeployment(elt);
    }

    @objid ("a6f899a0-d63a-42ef-a9af-9ba113f14b13")
    private void setBinaryCodeURL(V elt) {
        String value = this._element.getBinaryCodeURL();
        if (value != null) {
            elt.setBinaryCodeURL(value);
        }
    }

    @objid ("960aa9d4-b5cc-4008-926f-440a2cfe828e")
    private void setContinuousDeployment(V elt) {
        Boolean value = this._element.isContinuousDeployment();
        if (value != null) {
            elt.setContinuousDeployment(value);
        }
    }

}
