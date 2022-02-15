package fr.softeam.cameldesigner.exchange.exporter.metric;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.exchange.exporter.core.SubModelExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("1e006f4e-876a-4185-80d6-a7cd6900c144")
public abstract class MetricModelExporter<T extends MetricModel> extends SubModelExporter<T> {
    @objid ("2cdd6006-ba8e-41bb-a0ac-23b42e7e16e9")
    public MetricModelExporter(T elt) {
        super(elt);
    }

    @objid ("26148c54-c049-4853-9609-7eeeaaefe41b")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return super.createCamelElt(context);
    }

    @objid ("313b7950-5a11-42f2-beff-3f2271c52adb")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("820b0a53-01cd-4764-911c-dfab13457a88")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.core.CamelModel) && (elt instanceof camel.metric.MetricModel)) {
            ((camel.core.CamelModel) context).getMetricModels().add((camel.metric.MetricModel) elt);
        }else {
            super.attach(elt, context);
        }
    }

}
