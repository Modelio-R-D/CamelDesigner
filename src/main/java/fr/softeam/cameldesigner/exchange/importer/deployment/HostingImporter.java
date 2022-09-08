package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.Hosting;
import camel.deployment.ProvidedHost;
import camel.deployment.RequiredHost;
import camel.deployment.SoftwareComponent;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("a5c688fd-bca0-4912-840f-27cd30663e90")
public class HostingImporter<T extends Hosting, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> extends ComponentRelationImporter<T,V> {
    @objid ("e3cd84b2-d16e-4817-a2bd-fba8990c5f93")
    public HostingImporter() {
        super();
        // TODO Auto-generated constructor stub
    }

    @objid ("2a28ff46-cfe0-4e02-b213-58dfff2f71fd")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.create();
    }

    @objid ("375849a7-2d0f-4fcc-8ea3-d4f5ae662194")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addHostings(elt);
        else
            super.attach(elt, context);
    }

    @objid ("74f309b1-b5cc-476a-8c5b-1cf23ffe7629")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitHosting(this);
    }

    @objid ("1378edb5-16ec-476f-b57b-dbfd86d58100")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setProvidedHost(elt);
        setRequiredHosts(elt);
    }

    @objid ("8765c4e6-f9e6-43f0-a9ca-b1a0a3e7f0d7")
    private void setProvidedHost(V elt) {
        // TODO Auto-generated method stub
        ProvidedHost value = this._element.getProvidedHost();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof HostingPort) {
                elt.setProvidedHost((HostingPort) valueElt);
        
            }
        }
    }

    @objid ("28a60ce3-74b5-4233-bbd8-c397e8577e0b")
    private void setRequiredHosts(V elt) {
        // TODO Auto-generated method stub
        EList<RequiredHost> value = this._element.getRequiredHosts();      
        if (value != null) {
            for(RequiredHost obj : value) {
                CamelElement valueElt = this._process.getElement(obj);
                if (valueElt instanceof HostingPort) {
                    elt.setRequiredHosts((HostingPort) valueElt);
                }
            }
            }
    }

}
