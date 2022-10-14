package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.Metric;
import camel.metric.MetricContext;
import camel.metric.ObjectContext;
import camel.metric.Window;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("e6ebff4e-c5e8-4fbe-9f70-2c7fed87ce81")
public class MetricContextImporter<T extends MetricContext, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext> extends FeatureImporter<T,V> {
    @objid ("39ecf983-7951-40a6-81b0-283847fb8ae6")
    public MetricContextImporter() {
    }

    @objid ("401d5902-2ec9-42ad-a94e-e94e360057bf")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetricContext(this);
    }

    @objid ("0dfadf47-8322-4196-bccd-2a154d264f38")
    public MetricContextImporter(T elt) {
        super(elt);
    }

    @objid ("bd39c9ed-ac25-43f3-89ca-34da1f6f5f9c")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext.create();
    }

    @objid ("9bbc6ea0-5641-4b61-b2eb-fe402d93a129")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel) context).addMetricContexts(elt);
    }

    @objid ("5ee5a595-5807-4e93-a616-e99dc72f1d84")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setMetric(elt);
        setWindow(elt);
        setSchedule(elt);
        setObjectContext(elt);
    }

    @objid ("9e1ba0fc-843a-460e-8104-9f814f59f9ab")
    private void setMetric(V elt) {
        // TODO Auto-generated method stub
        Metric value = this._element.getMetric();
        if (value != null) {
            elt.setMetric((fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric) value);
        }
    }

    @objid ("29740fc3-ebd4-4bfe-870d-cf7108512de8")
    private void setWindow(V elt) {
        // TODO Auto-generated method stub
        Window value = this._element.getWindow();
        if (value != null) {
            elt.setWindow((fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window) value);
        }
    }

    @objid ("fa6067a7-2109-4349-95e9-18785e576630")
    private void setSchedule(V elt) {
        // TODO Auto-generated method stub
        camel.metric.Schedule value = this._element.getSchedule();
        if (value != null) {
            elt.setSchedule((Schedule) value);
        }
    }

    @objid ("25a9ef41-4c89-468c-a7f5-244e044d06a7")
    private void setObjectContext(V elt) {
        // TODO Auto-generated method stub
        ObjectContext value = this._element.getObjectContext();
        if (value != null) {
            elt.setObjectContext((fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext) value);
        }
    }

}
