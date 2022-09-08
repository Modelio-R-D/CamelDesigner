package fr.softeam.cameldesigner.exchange.importer.deployment;

import camel.deployment.ComponentRelation;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("fd950e39-1837-44e4-936c-05407411f057")
public class ComponentRelationImporter<T extends ComponentRelation, V extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation> extends FeatureImporter<T,V> {
    @objid ("5fdd47a0-efec-466f-a4c1-86748f1b651c")
    public ComponentRelationImporter() {
        super();
    }

    @objid ("10d42925-9988-4733-839a-79f20c8b2be5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation.create();
    }

    @objid ("74d9b3ba-55fa-4582-a9e4-c29893735f77")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitComponentRelation(this);
    }

}
