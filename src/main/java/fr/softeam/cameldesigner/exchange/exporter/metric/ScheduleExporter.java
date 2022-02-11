package fr.softeam.cameldesigner.exchange.exporter.metric;

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

}
