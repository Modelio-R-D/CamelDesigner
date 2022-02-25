package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("27c06495-3a4d-4829-b90d-0d4a7d6160db")
public class MetricTemplateExporter<T extends MetricTemplate> extends FeatureExporter<T> {
    @objid ("e10d1017-89ff-4634-8d36-11371c105739")
    public MetricTemplateExporter(T elt) {
        super(elt);
    }

    @objid ("6880a81c-52bb-4630-a109-fd850692d04a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createMetricTemplate();
    }

    @objid ("b25df162-52b7-465c-9ff8-f434d26bfdbb")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.MetricTemplate) {
            camel.metric.MetricTemplate template = (camel.metric.MetricTemplate) elt;
            setValueType(template);
            setValueDirection(template);
            setUnit(template);
            setAttribute(template);
        }
    }

    @objid ("24386cca-7605-47d7-be3a-1ba5c96d1fed")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.MetricTemplate)) {
            ((camel.metric.MetricTypeModel) context).getTemplates().add((camel.metric.MetricTemplate) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("7eeddc1e-ab97-43ba-983d-7a0d293f0565")
    private void setAttribute(camel.metric.MetricTemplate template) {
        CDOObject att = this._process.getElement(this._element.getAttribute());
        if ((att != null) &&  (att instanceof camel.core.MeasurableAttribute))
            template.setAttribute((camel.core.MeasurableAttribute) att);
    }

    @objid ("c6704f09-8270-46ca-827a-67414ff6bbc9")
    private void setUnit(camel.metric.MetricTemplate template) {
        CDOObject unit = this._process.getElement(this._element.getUnit());
        if ((unit != null) &&  (unit instanceof camel.unit.Unit))
            template.setUnit((camel.unit.Unit) unit);
    }

    @objid ("3559bcf3-5cbf-4368-ad77-8948981492ad")
    private void setValueDirection(camel.metric.MetricTemplate template) {
        template.setValueDirection(Short.valueOf(this._element.getValueDirection()));
    }

    @objid ("3175529c-1f3b-472d-89f5-c885a4a19c90")
    private void setValueType(camel.metric.MetricTemplate template) {
        CDOObject vt = this._process.getElement(this._element.getValueType());
        if ((vt != null) &&  (vt instanceof camel.type.ValueType))
            template.setValueType((camel.type.ValueType) vt);
    }

}
