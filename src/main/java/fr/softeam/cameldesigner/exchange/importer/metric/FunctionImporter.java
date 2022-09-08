package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.core.Attribute;
import camel.metric.Function;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.common.util.EList;

@objid ("24584780-5689-4321-81b8-7711c06d3127")
public class FunctionImporter<T extends Function, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function> extends FeatureImporter<T,V> {
    @objid ("756378c1-8710-4b76-9b2d-847d3bc170bb")
    public FunctionImporter() {
    }

    @objid ("5b98a5a8-21ff-4f08-ac2e-c1f3f1ef557d")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitFunction(this);
    }

    @objid ("efa64263-1f1f-4265-9d2d-c38d2feb773c")
    public FunctionImporter(T elt) {
        super(elt);
    }

    @objid ("dad50c52-01ba-4faa-8e08-a864ece63818")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.create();
    }

    @objid ("ba8c4fa4-01a9-46f7-b94f-bf7c2ab9544d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel)context).addFunctions(elt);
    }

    @objid ("7eee3bd6-4ee1-4ef5-bfd2-4c72735fc6d6")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setArguments(elt);
        setExpression(elt);
    }

    @objid ("3cf6f689-f661-46da-bb6d-acba931559f1")
    private void setExpression(V elt) {
        // TODO Auto-generated method stub
        String value = this._element.getExpression();
        if (value != null) {
            elt.setExpression(value);
        }
    }

    @objid ("aa6d0520-7fdd-4a43-9a15-cba7008e45cd")
    private void setArguments(V elt) {
        // TODO Auto-generated method stub
        EList<String> value = this._element.getArguments();
        if (value != null) {
            elt.setArguments(value);
        }
    }

}
