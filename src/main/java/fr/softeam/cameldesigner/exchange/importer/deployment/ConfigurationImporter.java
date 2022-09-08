package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.Configuration;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ef4365a9-7a0a-4b43-845b-f8622ad25cbb")
public class ConfigurationImporter<T extends Configuration, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration> extends FeatureImporter<T,V> {
    @objid ("c8c34654-e00d-4d65-ae69-967851351b7c")
    public ConfigurationImporter() {
        super();
    }

    @objid ("095c0c8c-e2ab-4d1e-a22a-3a9a71f6f682")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration.create();
    }

    @objid ("6c7f508d-1b74-4883-8d7f-345a90f77f5f")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitConfiguration(this);
    }

}
