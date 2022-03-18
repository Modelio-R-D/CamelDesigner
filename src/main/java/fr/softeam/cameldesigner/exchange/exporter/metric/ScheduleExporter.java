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

    @objid ("1ff64f01-e46c-4a4e-b507-929412564cac")
    private void setInterval(camel.metric.Schedule schedule) {
        String content = this._element.getInterval();
        if (content != null)
            schedule.setInterval(Long.valueOf(content));
    }

    @objid ("94a9a137-24cb-4f06-a973-cf4c96f66169")
    private void setRepetitions(camel.metric.Schedule schedule) {
        String content = this._element.getRepetitions();
        if (content != null)
            schedule.setRepetitions(Integer.valueOf(content));
    }

    @objid ("e80bec99-5194-479f-8b99-a9a413540070")
    private void setTimeUnit(camel.metric.Schedule schedule) {
        CDOObject timeUnit = this._process.getElement(this._element.getTimeUnit());
        if ((timeUnit != null) &&  (timeUnit instanceof camel.unit.Unit))
            schedule.setTimeUnit((camel.unit.Unit) timeUnit);
    }

    @objid ("2aa748ab-eee5-4139-ac23-356a43dd3bc4")
    private void setEnd(camel.metric.Schedule schedule) {
        String content = this._element.getEnd();
        if (content != null)
            schedule.setEnd(Date.valueOf(content));
    }

    @objid ("00a624a1-aaa7-4487-a86e-6bdc4c81928a")
    private void setStart(camel.metric.Schedule schedule) {
        String content = this._element.getStart();
        if (content != null)
            schedule.setStart(Date.valueOf(content));
    }

}
