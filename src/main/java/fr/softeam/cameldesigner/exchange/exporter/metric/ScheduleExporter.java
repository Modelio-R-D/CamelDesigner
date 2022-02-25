package fr.softeam.cameldesigner.exchange.exporter.metric;

import java.sql.Date;
import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("760d62f2-6532-4604-b332-5056473358b0")
public class ScheduleExporter<T extends Schedule> extends FeatureExporter<T> {
    @objid ("5db11e98-8dad-48c0-85f6-1e71338525e7")
    public ScheduleExporter(T elt) {
        super(elt);
    }

    @objid ("5546aefc-e9bd-4ba6-9005-e820d9bde7ce")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createSchedule();
    }

    @objid ("338c4cad-e3f2-4ba6-8105-d2fb1dd0244f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.Schedule) {
            camel.metric.Schedule schedule = (camel.metric.Schedule) elt;
            setStart(schedule);
            setEnd(schedule);
            setTimeUnit(schedule);
            setRepetitions(schedule);
            setInterval(schedule);
        }
    }

    @objid ("adb17020-3729-49cd-94a2-3d40ec2aaa72")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.Schedule)) {
            ((camel.metric.MetricTypeModel) context).getSchedules().add((camel.metric.Schedule) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("47d47370-fbb6-4851-8abb-c79b28bd1b78")
    private void setInterval(camel.metric.Schedule schedule) {
        schedule.setInterval(Long.valueOf(this._element.getInterval()));
    }

    @objid ("5876f71d-614b-496a-9244-583dc4c19558")
    private void setRepetitions(camel.metric.Schedule schedule) {
        schedule.setRepetitions(Integer.valueOf(this._element.getRepetitions()));
    }

    @objid ("69f5d7fd-3f24-4a5b-b8ca-9bff33142819")
    private void setTimeUnit(camel.metric.Schedule schedule) {
        CDOObject timeUnit = this._process.getElement(this._element.getTimeUnit());
        if ((timeUnit != null) &&  (timeUnit instanceof camel.unit.Unit))
            schedule.setTimeUnit((camel.unit.Unit) timeUnit);
    }

    @objid ("6a5eb863-bf98-4032-999e-ec926f2a42ba")
    private void setEnd(camel.metric.Schedule schedule) {
        schedule.setEnd(Date.valueOf(this._element.getEnd()));
    }

    @objid ("541e4150-3e4a-49c7-b13a-7d5399fce70a")
    private void setStart(camel.metric.Schedule schedule) {
        schedule.setStart(Date.valueOf(this._element.getStart()));
    }

}
