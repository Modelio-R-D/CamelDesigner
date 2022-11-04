package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ProvidedCommunication;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("0ecf37a1-897f-4fa1-87bc-3668dba17a5b")
public class ProvidedCommunicationImporter<T extends ProvidedCommunication, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> extends CommunicationPortImporter<T,V> {
    @objid ("c5ae3de5-0e68-4222-a5c1-973e47bc0685")
    public ProvidedCommunicationImporter() {
        super();
    }

    @objid ("300e1d09-6e64-4b05-aa1e-7a502aa1782e")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.create();
    }

    @objid ("612af123-432a-4d63-95af-87b893227a28")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof SoftwareComponent)
            ((SoftwareComponent)context).addProvidedCommunications(elt);
        else
            super.attach(elt, context);
    }

    @objid ("1f1fb557-b8b8-45a3-9031-12f52e52d7af")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitProvidedCommunication(this);
    }

    @objid ("0156adae-c8f3-49e8-8d88-580cb615a881")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setPortNumber(elt);
    }

    @objid ("0721a858-efc0-46d4-9507-9a6e82e06ab8")
    private void setPortNumber(V elt) {
        Integer value = this._element.getPortNumber();
        if (value != null) {
            this._element.setPortNumber(value);;
        }
    }

}
