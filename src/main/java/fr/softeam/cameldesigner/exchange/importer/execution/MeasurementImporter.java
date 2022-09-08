package fr.softeam.cameldesigner.exchange.importer.execution;

import camel.execution.Measurement;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("5b2db48a-df38-4434-a0bb-d0cf4ff6b201")
public abstract class MeasurementImporter<T extends Measurement, V extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement> extends FeatureImporter<T,V> {
    @objid ("0f888a6c-4be7-4e41-a470-04305639d833")
    public MeasurementImporter() {
        super();
    }

    @objid ("edc404e9-736b-47e8-b844-1c61b9005eed")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement.create();
    }

    @objid ("f21cc64f-a155-4835-900e-2a439e363bd5")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("7e3f97a4-1668-49fd-b455-f738fef7a333")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMeasurement(this);
    }

}
