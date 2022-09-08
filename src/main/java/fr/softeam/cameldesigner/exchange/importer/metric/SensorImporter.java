package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.Sensor;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b6b977bd-c6c4-47d4-9ec5-f2dc88d56a75")
public class SensorImporter<T extends Sensor, V extends fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor> extends SoftwareComponentImporter<T,V> {
    @objid ("28b4cca7-b073-499f-a009-f14253016499")
    public SensorImporter() {
    }

    @objid ("9d375919-36d2-4db2-ae47-4a1620fc0be6")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSensor(this);
    }

    @objid ("2549574a-b674-48cc-a4c0-a242558a3a45")
    public SensorImporter(T elt) {
        super(elt);
    }

    @objid ("7de3011d-229e-41bd-aa5e-cd808a56d097")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.create();
    }

    @objid ("f3b77819-1a96-459b-8d3e-835c82758ba2")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel)context).addSensors(elt);
    }

    @objid ("26dcc170-8d0a-4c23-a884-23b6ad541bbe")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setIsPush(elt);
        setConfiguration(elt);
    }

    @objid ("9f1aec94-ba24-4ddb-860a-dcac646737f0")
    private void setIsPush(V elt) {
        // TODO Auto-generated method stub
        Boolean value = this._element.isIsPush();
        if (value != null) {
            elt.setIsPush(value);
        }
    }

    @objid ("2082bd56-463e-4458-a7aa-041f4cd035ff")
    private void setConfiguration(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getConfiguration();
        if (value != null) {
            elt.setConfiguration(value);
        }
    }

}
