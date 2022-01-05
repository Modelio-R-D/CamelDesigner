package fr.softeam.cameldesigner.exchange.exporter.deployment;

import camel.deployment.DeploymentFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8d02a0b1-1c56-4dc4-b79d-8bb2ec0dac1d")
public class RequirementSetExporter<T extends RequirementSet> extends FeatureClassExporter<T> {
    @objid ("2072bc9f-d873-451f-b629-cc46fc0e8df5")
    public RequirementSetExporter(T elt) {
        super(elt);
    }

    @objid ("8e4c3e11-4897-47e7-a7db-7e4a41f558cc")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return DeploymentFactory.eINSTANCE.createRequirementSet();
    }

    @objid ("ce9483e4-f81e-4ae8-918c-ee966163bb11")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3d212279-37a3-42d0-9baf-85430e6ab94b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
