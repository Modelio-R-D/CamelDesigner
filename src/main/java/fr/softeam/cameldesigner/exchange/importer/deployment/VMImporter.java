package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.VM;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("4c2b911d-7884-4d70-bf7e-0a7d73790134")
public class VMImporter<T extends VM, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> extends ComponentImporter<T,V> {
    @objid ("0cba22f3-532b-4bfb-92c6-518fb809f69a")
    public VMImporter() {
        super();
    }

    @objid ("c5ce8e65-d4bc-41fd-82b4-275c391838c1")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.create();
    }

    @objid ("fd288013-3d33-4c8c-a38e-9008f9a4641d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof DeploymentTypeModel)
            ((DeploymentTypeModel)context).addVms(elt);
        else
            super.attach(elt, context);
    }

    @objid ("6cb095bb-d533-4fed-ae73-c991e22b07f3")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitVM(this);
    }

}
