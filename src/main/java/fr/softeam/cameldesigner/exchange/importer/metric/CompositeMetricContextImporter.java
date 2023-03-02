package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.CompositeMetricContext;
import camel.metric.GroupingType;
import camel.metric.MetricContext;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("63f9c47d-37a4-4af5-a104-5632429cfab3")
public class CompositeMetricContextImporter<T extends CompositeMetricContext, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext> extends MetricContextImporter<T,V> {
    @objid ("a552be19-1739-480c-a55b-0ca0e6e608ce")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitCompositeMetricContext(this);
    }

    @objid ("23aaeb17-022d-4d56-b57d-394f2881ae37")
    public CompositeMetricContextImporter(T elt) {
        super(elt);
    }

    @objid ("dbe8868b-fa20-4329-b902-7057c293fd68")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.create();
    }

    @objid ("c9625df1-8fd9-4b00-af4e-41e36b70e272")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("be0708bb-6778-41b7-af0d-815955119671")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setGroupingType(elt);
        setComposingMetricContexts(elt);
    }

    @objid ("b7918c1c-fcdd-4ba1-b720-93b766b9a502")
    private void setGroupingType(V elt) {
        GroupingType value = this._element.getGroupingType();
        if (value != null) {
            elt.setGroupingType(value.getName());
        }
    }

    @objid ("c7e3b604-301f-4ff0-b10d-4bae063aae6f")
    private void setComposingMetricContexts(V elt) {
        EList<MetricContext> value = this._element.getComposingMetricContexts();
        if (value != null) {
            for (MetricContext v: value)
                if (v != null) {
                    CamelElement valueElt = this._process.getElement(v);
                    if (valueElt instanceof fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext) {
                        elt.addComposingMetricContexts((fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext) valueElt);
                    }
                }
        }
    }

    @objid ("69abc27d-34fc-481a-925b-77cae633473b")
    public CompositeMetricContextImporter() {
    }

}
