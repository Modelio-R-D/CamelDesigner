package fr.softeam.cameldesigner.exchange.importer.metric;

import camel.metric.Window;
import camel.metric.WindowType;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1f065620-1d19-4f0b-8c7e-6d28f3f350c2")
public class WindowImporter<T extends Window, V extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window> extends FeatureImporter<T,V> {
    @objid ("b81a2a04-f16c-412c-a10e-8c30ed41a7c8")
    public WindowImporter() {
    }

    @objid ("04cef81e-f1c2-41a8-9b43-56c8c1b67010")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitWindow(this);
    }

    @objid ("0ee73934-ea08-4da0-be3d-678b3f343103")
    public WindowImporter(T elt) {
        super(elt);
    }

    @objid ("4eb2291e-4857-4d50-afce-c956536549a3")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.create();
    }

    @objid ("85d84627-0c53-4a68-bc9b-467e15cdcd60")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetricTypeModel)
        ((MetricTypeModel)context).addWindows(elt);
    }

    @objid ("ec26b40f-9ee5-4277-9494-ad6a367d20ac")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setTimeUnit(elt);
        setWindowType(elt);
        setMeasurementSize(elt);
        setTimeSize(elt);
    }

    @objid ("24bc2033-51df-40ee-99a9-e9c00d5b4ddd")
    private void setTimeUnit(V elt) {
        // TODO Auto-generated method stub
        Unit value = this._element.getTimeUnit();
        if (value != null) {
            elt.setTimeUnit((fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit) value);
        }
    }

    @objid ("88fc7018-1b18-4e15-80ac-9109be975740")
    private void setWindowType(V elt) {
        // TODO Auto-generated method stub
        WindowType value = this._element.getWindowType();
        if (value != null) {
            elt.setWindowType(value.getName());
        }
    }

    @objid ("9ce4ffb3-8ebf-4b0c-b5da-be845e3bba83")
    private void setMeasurementSize(V elt) {
        // TODO Auto-generated method stub
        Long value = this._element.getMeasurementSize();
        if (value != null) {
            elt.setMeasurementSize(String.valueOf(value));
        }
    }

    @objid ("ee7211c8-a7fd-4a1f-8f3e-3e2a4866d41b")
    private void setTimeSize(V elt) {
        // TODO Auto-generated method stub
        Long value = this._element.getTimeSize();
        if (value != null) {
            elt.setTimeSize(String.valueOf(value));
        }
    }

}
