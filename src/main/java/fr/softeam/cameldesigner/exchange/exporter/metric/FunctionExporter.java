package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("66fc860e-2a2c-4ce8-ab1c-1c9f29d04986")
public class FunctionExporter<T extends Function> extends FeatureExporter<T> {
    @objid ("571ebf2e-8349-44ba-a094-9942d154ae90")
    public FunctionExporter(T elt) {
        super(elt);
    }

    @objid ("0da5e67f-fa18-4b1e-9d28-760da1aea1b4")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createFunction();
    }

    @objid ("a90b1aeb-d92a-47e8-8a3d-6e70b04ddc89")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.Function) {
            camel.metric.Function function = (camel.metric.Function) elt;
            setExpression(function);
            setArguments(function);
        }
    }

    @objid ("bd966468-f336-44da-88a4-78b5e0a52240")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.Function)) {
            ((camel.metric.MetricTypeModel) context).getFunctions().add((camel.metric.Function) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("7823b8d4-3ca3-46c5-b7ce-8dd858e2118f")
    private void setArguments(camel.metric.Function function) {
        function.getArguments().clear();
        function.getArguments().addAll(this._element.getArguments());
    }

    @objid ("0c58a9ac-1ef9-4ec1-ae8c-29f2591b83a1")
    private void setExpression(camel.metric.Function function) {
        String content = this._element.getExpression();
        if (content != null)
            function.setExpression(content);
    }

}
