package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.CommunicationPort;
import camel.requirement.ImageRequirement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.statik.PortOrientation;

@objid ("1e999137-4eb2-4263-b173-49bab0707b6c")
public class CommunicationPortImporter<T extends CommunicationPort, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> extends NamedElementImporter<T,V> {
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
        setPortNumber(elt);
        setLowPortNumber(elt);
        setHighPortNumber(elt);
    }

    @objid ("63b2bf6b-62a9-44ad-8a0b-97ded19e4268")
    private void setHighPortNumber(V elt) {
        // TODO Auto-generated method stub
        Integer value = this._element.getHighPortNumber();
        if (value != null) {
            elt.setHighPortNumber(String.valueOf(value));
        }
    }

    @objid ("3ab1e897-758e-4e9b-bffc-cc283b60f021")
    private void setLowPortNumber(V elt) {
        // TODO Auto-generated method stub
        Integer value = this._element.getLowPortNumber();
        if (value != null) {
            elt.setLowPortNumber(String.valueOf(value));
        }
    }

    @objid ("665b36dc-4d9a-4e3f-98a3-b0c67504f0e2")
    private void setPortNumber(V elt) {
        // TODO Auto-generated method stub
        Integer value = this._element.getPortNumber();
        if (value != null) {
            this._element.setPortNumber(value);;
        }
    }

}
