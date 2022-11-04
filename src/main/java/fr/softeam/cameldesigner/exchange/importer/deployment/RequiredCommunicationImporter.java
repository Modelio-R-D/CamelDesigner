package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.RequiredCommunication;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1fd17f2f-c4f5-4ed4-89dc-7aeff282a5d5")
public class RequiredCommunicationImporter<T extends RequiredCommunication, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> extends CommunicationPortImporter<T,V> {
    @objid ("e9a50006-4983-4902-8d26-a7e6cf053e95")
    public RequiredCommunicationImporter() {
        super();
    }

    @objid ("20afa495-0112-42fb-abf9-48dcb418d82d")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
    }

    @objid ("87e04fa9-aadf-4e2e-b4c3-7c85b1894a0f")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof SoftwareComponent)
            ((SoftwareComponent)context).addRequiredCommunications(elt);
        else if (context instanceof Container)
            ((Container)context).addRequiredCommunications(elt);
    }

    @objid ("7526840e-4132-4de7-aae1-d767985076b9")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitRequiredCommunication(this);
    }

    @objid ("f4e0438a-8011-4aae-bf2c-ae4ae19fd595")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setIsMandatory(elt);
        setPortNumber(elt);
    }

    @objid ("d51ff8cb-e908-427c-bff9-96cb58c9b534")
    private void setIsMandatory(V elt) {
        Boolean value = ( this._element).isIsMandatory();
        if (value != null) {
            elt.setIsMandatory(value);
        }
    }

    @objid ("3a4ba6b9-b5d3-467e-adec-2e9047ff3bd2")
    private void setPortNumber(V elt) {
        Integer value = this._element.getPortNumber();
        if (value != null) {
            this._element.setPortNumber(value);
        }
    }

}
