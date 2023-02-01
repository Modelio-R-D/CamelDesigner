package fr.softeam.cameldesigner.exchange.importer.deploymentinstance;

import camel.deployment.CommunicationPortInstance;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("444c0be5-ee00-461e-9b61-aac327b9e952")
public class CommunicationPortInstanceImporter<T extends CommunicationPortInstance, V extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> extends FeatureImporter<T,V> {
    @objid ("040fee63-3341-4b44-b0cc-c19812462884")
    public CommunicationPortInstanceImporter() {
        super();
    }

    @objid ("ebe9f445-0feb-46c9-b594-2f95993d60c8")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
    }

    @objid ("ae0d9068-c3bb-49ad-bdfe-f55f19374335")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunicationPortInstance(this);
    }

    @objid ("dcb6aaf3-78e1-479d-9250-90951c44c8e7")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("82f4c721-00e9-4647-b0ab-feb51f8d4af0")
    @Override
    public void attach(V elt, CamelElement context) {
    }

}
