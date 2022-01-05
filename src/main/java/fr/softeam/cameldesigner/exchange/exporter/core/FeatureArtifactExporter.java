package fr.softeam.cameldesigner.exchange.exporter.core;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ae8481a2-ae11-4428-a190-2e3d0116bd81")
public class FeatureArtifactExporter<T extends FeatureArtifact> extends FeatureExporter<T> {
    @objid ("ba0b505a-0577-414b-9391-a278797d04cc")
    public FeatureArtifactExporter(T elt) {
        super(elt);
    }

    @objid ("aa1f116f-0b58-4d12-a32b-c6816e8a2194")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("59991195-de39-4276-beba-ab1c5561c9ed")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

}
