package fr.softeam.cameldesigner.exchange.importer.deployment;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.api.modelio.model.IUmlModel;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import camel.deployment.Hosting;
import camel.deployment.ProvidedHost;
import camel.deployment.RequiredHost;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

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
        setProvidedRequiredHost(elt);
    }

    @objid ("afa18471-ea5a-4fc8-a77d-e45af326cd01")
    private void setProvidedRequiredHost(V elt) {
        ProvidedHost source = this._element.getProvidedHost();
        RequiredHost target = this._element.getRequiredHosts().get(0);

        if ((source != null) && (target != null)) {

            CamelElement sourceElt = this._process.getElement(source);
            CamelElement targetElt = this._process.getElement(target);

            if ((sourceElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort)
                     && (targetElt instanceof fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort)){

                fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort sourcePort = (fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort) sourceElt;
                fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort targetPort = (fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort) targetElt;

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
