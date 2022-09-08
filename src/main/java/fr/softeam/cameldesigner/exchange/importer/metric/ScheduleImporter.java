package fr.softeam.cameldesigner.exchange.importer.metric;

import java.util.Date;
import camel.execution.ExecutionModel;
import camel.metric.Schedule;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("c39e3404-e429-45f5-923d-131faf61d538")
public class ScheduleImporter<T extends Schedule, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule> extends FeatureImporter<T,V> {
    @objid ("6366cbdf-f9c8-495b-a9a9-055463bd8c56")
    public ScheduleImporter() {
    }

    @objid ("5b9fa830-6894-492a-b585-17bba94a3c92")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitSchedule(this);
    }

    @objid ("dc04bc71-4bde-46b9-b450-e8c6f951b82c")
    public ScheduleImporter(T elt) {
        super(elt);
    }

    @objid ("06ba3c71-ccfc-41e7-bf4b-528730dcb2ad")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.create();
    }

    @objid ("6568a2eb-80e7-4346-b207-fcde351663c1")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel)context).addSchedules(elt);
    }

    @objid ("24730ab8-6cc3-4f19-8154-808ea40fabe8")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setStart(elt);
        setEnd(elt);
        setTimeUnit(elt);
        setRepetitions(elt);
        setInterval(elt);
    }

    @objid ("84ab7eef-3eb2-4f11-9511-5c47c36a8c29")
    private void setStart(V elt) {
        // TODO Auto-generated method stub
        Date value = this._element.getStart();
        if (value != null) {
            elt.setStart(value.toString());
        }
    }

    @objid ("f25ea2a0-d3c0-4ff7-bd23-c6509f47b96c")
    private void setEnd(V elt) {
        // TODO Auto-generated method stub
        Date value = this._element.getEnd();
        if (value != null) {
            elt.setEnd(value.toString());
        }
    }

    @objid ("14176b85-21c6-4bac-8661-7ee73acd84f9")
    private void setTimeUnit(V elt) {
        // TODO Auto-generated method stub
        Unit value = this._element.getTimeUnit();
        if (value != null) {
            elt.setTimeUnit((fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit) value);
        }
    }

    @objid ("d7580afc-59e3-45b0-b989-6741e90a2454")
    private void setRepetitions(V elt) {
        // TODO Auto-generated method stub
        Integer value = this._element.getRepetitions();
        if (value != null) {
            elt.setRepetitions(String.valueOf(value));
        }
    }

    @objid ("ead64f91-bd32-4d67-aab8-4787ca6ef42e")
    private void setInterval(V elt) {
        // TODO Auto-generated method stub
        Long value = this._element.getInterval();
        if (value != null) {
            elt.setInterval(String.valueOf(value));
        }
    }

}
