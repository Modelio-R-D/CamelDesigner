package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ae7712c9-2db1-497a-ad30-e26c687271d4")
public class CommunicationPortExporter<T extends CommunicationPort> extends NamedElementExporter<T> {
    @objid ("7a2570f7-b173-4f9b-8d7f-cb70fcfce716")
    public CommunicationPortExporter(T elt) {
        super(elt);
    }

    @objid ("349a0746-efb9-4cc0-8b6e-39cba1829e6e")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createCommunication();
    }

    @objid ("5b1cdc74-e02f-4c57-a87c-315fd0ae5f44")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.deployment.CommunicationPort) {
            camel.deployment.CommunicationPort cp = (camel.deployment.CommunicationPort) elt;
            setLowPortNumber(cp);
            setHighPortNumber(cp);
            setPortNumber(cp);
        }
    }

    @objid ("c67a2da9-a3ed-443e-b6ce-18cb1f94aba7")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("4f9bc289-cad7-4832-af61-320473f00899")
    private void setHighPortNumber(camel.deployment.CommunicationPort cp) {
        String content = this._element.getHighPortNumber();
        if (content != null) {
            cp.setHighPortNumber(Integer.valueOf(this._element.getHighPortNumber()));
        }
    }

    @objid ("205ab60e-0fb8-4e26-b2c2-0315c9ad759a")
    private void setLowPortNumber(camel.deployment.CommunicationPort cp) {
        String content = this._element.getLowPortNumber();
        if (content != null) {
            cp.setLowPortNumber(Integer.valueOf(content));
        }
    }

    @objid ("50d71aed-41da-4516-82aa-9473e2399c94")
    private void setPortNumber(camel.deployment.CommunicationPort cp) {
        String content = this._element.getName();
        if (content != null) {
            cp.setPortNumber(Integer.valueOf(content));
        }
    }

}
