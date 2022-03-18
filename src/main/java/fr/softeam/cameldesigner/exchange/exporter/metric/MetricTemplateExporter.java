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

    @objid ("0c30a7a3-1747-4193-b9dc-122be0e75ad8")
    private void setAttribute(camel.metric.MetricTemplate template) {
        CDOObject att = this._process.getElement(this._element.getAttribute());
        if ((att != null) &&  (att instanceof camel.core.MeasurableAttribute))
            template.setAttribute((camel.core.MeasurableAttribute) att);
    }

    @objid ("811e9c1f-494a-4b59-9e57-7bf985408d0c")
    private void setUnit(camel.metric.MetricTemplate template) {
        CDOObject unit = this._process.getElement(this._element.getUnit());
        if ((unit != null) &&  (unit instanceof camel.unit.Unit))
            template.setUnit((camel.unit.Unit) unit);
    }

    @objid ("2c806d3b-495d-4e39-87a0-ac0c1d0f80b7")
    private void setValueDirection(camel.metric.MetricTemplate template) {
        template.setValueDirection(Short.valueOf(this._element.getValueDirection()));
    }

    @objid ("7e1a6062-13c1-4bd5-b9c5-cc5ca9012109")
    private void setValueType(camel.metric.MetricTemplate template) {
        CDOObject vt = this._process.getElement(this._element.getValueType());
        if ((vt != null) &&  (vt instanceof camel.type.ValueType))
            template.setValueType((camel.type.ValueType) vt);
    }

}
