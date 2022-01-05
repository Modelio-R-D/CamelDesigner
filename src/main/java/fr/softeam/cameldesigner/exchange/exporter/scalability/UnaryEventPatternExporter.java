package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b0c14ebe-9fa6-4c7e-9311-b0489f6f69a1")
public class UnaryEventPatternExporter<T extends UnaryEventPattern> extends FeatureExporter<T> {
    @objid ("23463322-8d1f-4b56-a635-729c7553d230")
    public UnaryEventPatternExporter(T elt) {
        super(elt);
    }

    @objid ("d9a24956-a320-4bf9-8566-5ec197ea0273")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createUnaryEventPattern();
    }

    @objid ("6b0aca0d-a2e5-4ab4-a1d8-8a3bdeb92484")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("b1a1e7be-88b9-4c00-9fa5-3792cd8d7d42")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
