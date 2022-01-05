package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ed90d4e1-4a65-4145-8320-f0e7341a02e5")
public class MetricVariableExporter<T extends MetricVariable> extends MetricExporter<T> {
    @objid ("397b3951-d942-448d-b1f2-52869877a671")
    public MetricVariableExporter(T elt) {
        super(elt);
    }

    @objid ("4b8a5f42-0b1b-44d0-afa6-4e807bcfaad2")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricVariable();
    }

    @objid ("6e89d0e3-074a-4ffc-81a3-7e7a9d9e244a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("2d945b9f-271c-4955-815e-e4a44110501b")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
