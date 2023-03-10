package fr.softeam.cameldesigner.exchange.exporter.metric;

import org.eclipse.emf.cdo.CDOObject;


import camel.metric.MetricFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.WindowProcessing;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;

public class WindowProcessingExporter <T extends WindowProcessing> extends FeatureExporter<T>{

	public WindowProcessingExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createWindowProcessing();
    }

    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.WindowProcessing) {
            camel.metric.WindowProcessing wp = (camel.metric.WindowProcessing) elt;
            setProcessingType(wp);

        }
    }

	private void setProcessingType(camel.metric.WindowProcessing wp) {

		
	}
}
