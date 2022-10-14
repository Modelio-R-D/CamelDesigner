package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.Communication;
import camel.deployment.ProvidedCommunication;
import camel.deployment.RequiredCommunication;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.statik.ConnectorEnd;

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
        setProvidedRequiredCommunication(elt);
    }

    @objid ("a4449a43-6981-444a-87da-77fb63b55ebe")
    private void setProvidedRequiredCommunication(V elt) {
        ProvidedCommunication source = this._element.getProvidedCommunication();
        RequiredCommunication target = this._element.getRequiredCommunication();
        
        if ((source != null) && (target != null)) {
        
            CamelElement sourceElt = this._process.getElement(source);
            CamelElement targetElt = this._process.getElement(target);
        
            if ((sourceElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort)
                     && (targetElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort)){
        
        
                fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort sourcePort = (fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) sourceElt;
                fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort targetPort = (fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort) targetElt;
        
        
                IUmlModel model = CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel();
                ConnectorEnd sourceEnd = (ConnectorEnd) model.createElement("Standard.ConnectorEnd");
                ConnectorEnd targetEnd = (ConnectorEnd) model.createElement("Standard.ConnectorEnd");
        
        
                sourceEnd.setSource(sourcePort.getElement());
                sourceEnd.setTarget(targetPort.getElement());
                sourceEnd.setOppositeOwner(targetEnd);
                sourceEnd.setOpposite(targetEnd);
                sourceEnd.setLink(elt.getElement());
        
                targetEnd.setLink(elt.getElement());
                targetEnd.setOppositeOwner(sourceEnd);
                targetEnd.setOpposite(sourceEnd);
            }
        }
    }

}
