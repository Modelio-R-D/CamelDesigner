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

    @objid ("32e888e5-a27e-46eb-9680-a6cdbaa283b8")
    private void setTimeSize(camel.metric.Window window) {
        window.setTimeSize(Long.valueOf(this._element.getTimeSize()));
    }

    @objid ("7478fd21-2742-418c-8078-64b769337f0c")
    private void setMeasurementSize(camel.metric.Window window) {
        window.setMeasurementSize(Long.valueOf(this._element.getMeasurementSize()));
    }

    @objid ("2d287bcc-5376-4600-8085-c0b3745f470d")
    private void setSizeType(camel.metric.Window window) {
        window.setSizeType(WindowSizeType.valueOf(this._element.getSizeType()));
    }

    @objid ("dd6353fe-f8e8-49ac-8df4-a956ba32f680")
    private void setWindowType(camel.metric.Window window) {
        window.setWindowType(WindowType.valueOf(this._element.getWindowType()));
    }

    @objid ("8bc73d1f-e698-44df-b9dd-840bdf697803")
    private void setTimeUnit(camel.metric.Window window) {
        CDOObject timeUnit = this._process.getElement(this._element.getTimeUnit());
        if ((timeUnit != null) &&  (timeUnit instanceof camel.unit.Unit))
            window.setTimeUnit((camel.unit.Unit) timeUnit);
    }

}
