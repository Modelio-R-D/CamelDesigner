package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.CommunicationPort;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1e999137-4eb2-4263-b173-49bab0707b6c")
public class CommunicationPortImporter<T extends CommunicationPort, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> extends FeatureImporter<T,V> {
    @objid ("7f88d252-b84d-4209-bba7-7dc741b67ee7")
    public CommunicationPortImporter() {
        super();
    }

    @objid ("9a43276b-77c5-448e-9491-32738a1c42b1")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
    }

    @objid ("57608acf-5bb6-4c89-bd74-c69df99ed72f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunicationPort(this);
    }

    @objid ("b255ac8c-ab9f-4ea4-9489-3a23e1774841")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.CommunicationPort) {
            camel.deployment.CommunicationPort com = (camel.deployment.CommunicationPort) elt;
            setPortNumber(com);
            setLowPortNumber(com);
            setHighPortNumber(com);
        }
    }

    @objid ("63b2bf6b-62a9-44ad-8a0b-97ded19e4268")
    private void setHighPortNumber(CommunicationPort com) {
        Integer value = this._element.getHighPortNumber();
        if (value != null) {
            com.setHighPortNumber(value);
        }
    }

    @objid ("3ab1e897-758e-4e9b-bffc-cc283b60f021")
    private void setLowPortNumber(CommunicationPort com) {
        Integer value = this._element.getLowPortNumber();
        if (value != null) {
            com.setLowPortNumber(value);
        }
    }

    @objid ("665b36dc-4d9a-4e3f-98a3-b0c67504f0e2")
    private void setPortNumber(CommunicationPort com) {
        Integer value = this._element.getPortNumber();
        if (value != null) {
            com.setPortNumber(value);
        }
    }

    @objid ("7278f294-fa86-4d92-b7e2-6f3b01c3a342")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

}
