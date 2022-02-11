package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.exchange.exporter.deployment.SoftwareComponentExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("94167092-5573-4e93-b5f9-d7935ab1f69f")
public class SensorExporter<T extends Sensor> extends SoftwareComponentExporter<T> {
    @objid ("2b52496a-f2d7-41b7-ad65-c37d09d555eb")
    public SensorExporter(T elt) {
        super(elt);
    }

    @objid ("de576948-9729-4987-8d1b-0d94a7d13303")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createSensor();
    }

    @objid ("3ad42f9a-5001-47f1-949c-be721427a646")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("559125d2-cb81-4b31-a967-a94d6f1c9808")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.Sensor)) {
            ((camel.metric.MetricTypeModel) context).getSensors().add((camel.metric.Sensor) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
