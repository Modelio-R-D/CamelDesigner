package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.core.MeasurableAttribute;
import camel.metric.MetricTemplate;
import camel.type.ValueType;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("91223ee2-8b6b-4c6e-86ac-099ca1c074b8")
public class MetricTemplateImporter<T extends MetricTemplate, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate> extends FeatureImporter<T,V> {
    @objid ("334d558a-1a3b-4e1c-ac02-b501c5cfc617")
    public MetricTemplateImporter() {
    }

    @objid ("ec01c43f-f778-4908-9c20-2ad57e144adf")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricTemplate(this);
    }

    @objid ("b27a4d2c-3921-45dc-b265-abb93ade11d5")
    public MetricTemplateImporter(T elt) {
        super(elt);
    }

    @objid ("b6f0e714-baac-43de-b345-edf5e14a5428")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.create();
    }

    @objid ("dff331af-f8ec-45ba-8ff8-5530d13b1590")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
            ((MetricTypeModel)context).addTemplates(elt);
    }

    @objid ("9aa87e8f-71cb-4cbb-96e5-d652f3ec3436")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setValueType(elt);
        setValueDirection(elt);
        setUnit(elt);
        setAttribute(elt);
    }

    @objid ("36eaa60c-9b33-49f0-a8c6-81d512cc0b8b")
    private void setValueType(V elt) {
        ValueType value = this._element.getValueType();
        if (value != null) {
            CamelElement camValue = this._process.getElement(value);
            if ((camValue != null) && (camValue instanceof fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType))
                elt.setValueType((fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType)camValue);
        }
    }

    @objid ("dedea5fc-0190-47fa-8ca8-a9dc855e83b1")
    private void setValueDirection(V elt) {
        Integer value = (int) this._element.getValueDirection();
        if (value != null) {
            elt.setValueDirection(String.valueOf(value));
        }
    }

    @objid ("8fde9832-8724-41bf-a333-f10f07a20d56")
    private void setUnit(V elt) {
        Unit value =  this._element.getUnit();
        if (value != null) {
            CamelElement camValue = this._process.getElement(value);
            if ((camValue != null) && (camValue instanceof fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit))
                elt.setUnit((fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit) camValue);
        }
    }

    @objid ("45120a38-10bd-4a1f-95a4-fcebb44680dd")
    private void setAttribute(V elt) {
        MeasurableAttribute value =  this._element.getAttribute();
        if (value != null) {
            CamelElement camValue = this._process.getElement(value);
            if ((camValue != null) && (camValue instanceof MeasurableAttributeClass))
                elt.setAttribute( (MeasurableAttributeClass) camValue);
        }
    }

}
