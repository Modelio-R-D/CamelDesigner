package fr.softeam.cameldesigner.exchange.exporter.metric;

import org.eclipse.emf.cdo.CDOObject;

import camel.metric.CriterionType;
import camel.metric.MetricFactory;
import fr.softeam.cameldesigner.api.metricmodel.standard.attribute.WindowCriterion;
import fr.softeam.cameldesigner.exchange.exporter.core.NamedElementExporter;

public class WindowCriterionExporter <T extends WindowCriterion> extends NamedElementExporter<T> {



    public WindowCriterionExporter(T elt) {
		super(elt);
		// TODO Auto-generated constructor stub
	}

	@Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createWindowCriterion();
    }
    
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.WindowProcessing) && (elt instanceof camel.metric.WindowCriterion)) {
            ((camel.metric.WindowProcessing) context).getGroupingCriteria().add((camel.metric.WindowCriterion) elt);
            ((camel.metric.WindowProcessing) context).getRankingCriteria().add((camel.metric.WindowCriterion) elt);
        }else {
            super.attach(elt, context);
        }
    }
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.metric.WindowCriterion) {
            camel.metric.WindowCriterion wc = (camel.metric.WindowCriterion) elt;
            setMetric(wc);
            setType(wc);
            setCustom(wc);
            setAscending(wc);
        }
    }

	private void setAscending(camel.metric.WindowCriterion wc) {
        Boolean content = this._element.isAscending();
        if (content != null)
        	wc.setAscending(content);
	}

	private void setCustom(camel.metric.WindowCriterion wc) {
        String content = this._element.getCustom();
        if (content != null)
        	wc.setCustom(content);		
	}

	private void setType(camel.metric.WindowCriterion wc) {
        String type = this._element.getType();
        if (type != null)
        	wc.setType(CriterionType.get(type));

	}
	
    private void setMetric(camel.metric.WindowCriterion wc) {
        CDOObject metric = this._process.getElement(this._element.getMetric());
        if ((metric != null) &&  (metric instanceof camel.metric.Metric))
            wc.setMetric((camel.metric.Metric) metric);
    }
}
