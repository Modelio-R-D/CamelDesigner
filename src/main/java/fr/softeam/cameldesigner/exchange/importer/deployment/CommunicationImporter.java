package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.Communication;
import camel.deployment.ProvidedCommunication;
import camel.deployment.RequiredCommunication;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("bf909600-1629-4a6b-91f1-d7e2713c2226")
public class CommunicationImporter<T extends Communication, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> extends ComponentRelationImporter<T,V> {
    @objid ("85641af3-8740-452f-8d7b-23c2f421ac3d")
    public CommunicationImporter() {
        super();
        // TODO Auto-generated constructor stub
    }

    @objid ("dd213232-366a-49a0-bf62-87d01c812dc6")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.create();
    }

    @objid ("9eefeb83-3392-4fa9-a7c4-086cb4cbb3b5")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addCommunications(elt);
        else
            super.attach(elt, context);
    }

    @objid ("e2fe3631-b2c4-453e-95be-977f88ac7d48")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCommunication(this);
    }

    @objid ("36aeae10-c9ff-4416-b976-a695675823a8")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setProvidedCommunication(elt);
        setRequiredCommunication(elt);
    }

    @objid ("a4449a43-6981-444a-87da-77fb63b55ebe")
    private void setProvidedCommunication(V elt) {
        // TODO Auto-generated method stub
        ProvidedCommunication value = this._element.getProvidedCommunication();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) {
                elt.setProvidedCommunication((fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) valueElt);
        
            }
        }
    }

    @objid ("2af66457-a9df-4716-b622-6776a9fc5c4e")
    private void setRequiredCommunication(V elt) {
        // TODO Auto-generated method stub
        RequiredCommunication value = this._element.getRequiredCommunication();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) {
                elt.setRequiredCommunication((fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) valueElt);
        
            }
        }
    }

}
