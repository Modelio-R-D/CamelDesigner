package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f02a9744-ce0d-49a1-a07b-c22b2adf548b")
public class WindowExporter<T extends Window> extends FeatureExporter<T> {
    @objid ("058aab8c-7fd3-4a40-8bc8-1bddc58f986c")
    public WindowExporter(T elt) {
        super(elt);
    }

    @objid ("de446a82-cdf1-4247-9a37-bd45a40fe2fe")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return MetricFactory.eINSTANCE.createWindow();
    }

    @objid ("f964131a-b976-48d9-a332-3cac7700587a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("a2d09feb-f998-4808-96c9-ebe3a0a6c951")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
