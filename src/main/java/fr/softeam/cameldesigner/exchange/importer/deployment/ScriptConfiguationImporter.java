package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ScriptConfiguration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4e6223f5-7a07-4578-96d0-376f84f4037d")
public class ScriptConfiguationImporter<T extends ScriptConfiguration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration> extends ConfigurationImporter<T,V> {
    @objid ("2e0aa8ee-a4b9-44f0-9618-90610942a905")
    public ScriptConfiguationImporter() {
        super();
    }

    @objid ("e87736bf-5ad7-40c3-a62e-5df9e33166c4")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.create();
    }

    @objid ("7bb7fd70-b44a-4ece-814b-08d6155589dd")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitScriptConfiguration(this);
    }

    @objid ("3c3d8693-db3a-4260-bfe5-9482d3ccee5a")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setUpdateCommandNote(elt);
        setInstallCommandNote(elt);
        setStartCommandNote(elt);
        setStopCommandNote(elt);
        setDownloadCommandNote(elt);
        setConfigureCommandNote(elt);
        setUpdateCommandNote(elt);
        setUploadCommandNote(elt);
        setDevopsTool(elt);
        setOs(elt);
        setImageId(elt);
    }

    @objid ("a7b3871a-80d3-4fd2-9835-53b64a47a302")
    private void setUpdateCommandNote(V elt) {
        String value = this._element.getUpdateCommand();
        if (value != null) {
            elt.setUpdateCommandNote(value);
        }
    }

    @objid ("0babcce4-82ef-48b5-a6ce-84409fe7b884")
    private void setInstallCommandNote(V elt) {
        String value = this._element.getInstallCommand();
        if (value != null) {
            elt.setInstallCommandNote(value);
        }
    }

    @objid ("45c3e949-c0e3-4f84-93e7-d6bfe0b8997e")
    private void setStartCommandNote(V elt) {
        String value = this._element.getStartCommand();
        if (value != null) {
            elt.setStartCommandNote(value);
        }
    }

    @objid ("51b8f225-454d-4b67-be10-7f70fea89856")
    private void setStopCommandNote(V elt) {
        String value = this._element.getStopCommand();
        if (value != null) {
            elt.setStopCommandNote(value);
        }
    }

    @objid ("d9e5c73b-3c52-441c-9242-e31bbda38f5c")
    private void setDownloadCommandNote(V elt) {
        String value = this._element.getDownloadCommand();
        if (value != null) {
            elt.setDownloadCommandNote(value);
        }
    }

    @objid ("aa1ce7db-baa2-43e4-81b6-ef5bcf31bed5")
    private void setConfigureCommandNote(V elt) {
        String value = this._element.getConfigureCommand();
        if (value != null) {
            elt.setConfigureCommandNote(value);
        }
    }

    @objid ("ce72ec73-db36-412c-bdb2-36c9a68949b7")
    private void setUploadCommandNote(V elt) {
        String value = this._element.getUploadCommand();
        if (value != null) {
            elt.setUploadCommandNote(value);
        }
    }

    @objid ("09ddede5-78fd-47aa-9bee-eff582e6d29e")
    private void setDevopsTool(V elt) {
        String value = this._element.getDevopsTool();
        if (value != null) {
            elt.setDevopsTool(value);
        }
    }

    @objid ("24820758-890b-45ba-9410-757cda7b749b")
    private void setOs(V elt) {
        String value = this._element.getOs();
        if (value != null) {
            elt.setOs(value);
        }
    }

    @objid ("ae658727-82ef-4cc5-9729-3966aae913cc")
    private void setImageId(V elt) {
        String value = this._element.getImageId();
        if (value != null) {
            elt.setImageId(value);
        }
    }

}
