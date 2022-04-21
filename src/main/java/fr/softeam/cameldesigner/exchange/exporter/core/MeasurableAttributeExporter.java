package fr.softeam.cameldesigner.exchange.exporter.core;

import java.util.ArrayList;
import java.util.List;
import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1e3affd3-a822-46b9-9f98-e4c113b6f02f")
public class MeasurableAttributeExporter<T extends MeasurableAttributeClass> extends CamelAttributeExporter<T> {
    @objid ("f26414ea-1ff1-419c-b922-2d0bdbfea187")
    public MeasurableAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("8736aeb2-04c6-49ed-9136-12e6ac7c0365")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createMeasurableAttribute();
    }

    @objid ("21db2a8e-4f9c-4d4f-beb1-22a7d496312d")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.core.MeasurableAttribute) {
            camel.core.MeasurableAttribute att = (camel.core.MeasurableAttribute) elt;
            setSensors(att);
        }
    }

    @objid ("897542ab-12e3-4882-adc4-07fff3a54156")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("b28529e3-472f-4298-ad67-ab3d83e7f7eb")
    private void setSensors(camel.core.MeasurableAttribute att) {
        List<camel.metric.Sensor> sensors = new ArrayList<>();
        for (Sensor sensor : this._element.getSensors()) {
            CDOObject camelSensor = this._process.getElement(sensor);
            if ((camelSensor != null) &&  (camelSensor instanceof camel.metric.Sensor))
                sensors.add((camel.metric.Sensor)sensors);
        }
        
        att.getSensors().addAll(sensors);
    }

}
