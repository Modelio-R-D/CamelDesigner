package fr.softeam.cameldesigner.exchange.exporter.metric;

import camel.metric.MetricFactory;
import camel.metric.WindowSizeType;
import camel.metric.WindowType;
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
        if (elt instanceof camel.metric.Window) {
            camel.metric.Window window = (camel.metric.Window) elt;
            setMeasurementSize(window);
            setSizeType(window);
            setWindowType(window);
            setTimeUnit(window);
            setTimeSize(window);
        }
    }

    @objid ("a2d09feb-f998-4808-96c9-ebe3a0a6c951")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.metric.MetricTypeModel) && (elt instanceof camel.metric.Window)) {
            ((camel.metric.MetricTypeModel) context).getWindows().add((camel.metric.Window) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("22aa7ac3-8f22-4482-bd8e-c431ce718abb")
    private void setTimeSize(camel.metric.Window window) {
        String content = this._element.getTimeSize();
        if (content != null)
            window.setTimeSize(Long.valueOf(content));
    }

    @objid ("151321ab-3221-404e-b868-a96cb7602f08")
    private void setMeasurementSize(camel.metric.Window window) {
        String content = this._element.getMeasurementSize();
        if (content != null)
            window.setMeasurementSize(Long.valueOf(content));
    }

    @objid ("39c66303-cd90-4950-9186-08de5fd28058")
    private void setSizeType(camel.metric.Window window) {
        String content = this._element.getSizeType();
        if (content != null)
            window.setSizeType(WindowSizeType.valueOf(content));
    }

    @objid ("97501a4a-2b57-4e9b-923c-74a6697e3ffc")
    private void setWindowType(camel.metric.Window window) {
        String content = this._element.getWindowType();
        if (content != null)
            window.setWindowType(WindowType.valueOf(content));
    }

    @objid ("59a6acf6-87bc-420c-8ba2-b9b1315e5fa8")
    private void setTimeUnit(camel.metric.Window window) {
        CDOObject timeUnit = this._process.getElement(this._element.getTimeUnit());
        if ((timeUnit != null) &&  (timeUnit instanceof camel.unit.Unit))
            window.setTimeUnit((camel.unit.Unit) timeUnit);
    }

}
