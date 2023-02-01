package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.metric.MetricInstance;
import camel.scalability.NonFunctionalEventInstance;
import camel.scalability.StatusType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("fd2b3669-d7cd-4ef8-b387-cd3631cc9213")
public class NonFunctionalEventInstanceImporter<T extends NonFunctionalEventInstance, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance> extends EventInstanceImporter<T,V> {
    @objid ("48d96d46-9754-4d45-9505-a9833751bff1")
    public NonFunctionalEventInstanceImporter() {
    }

    @objid ("cbff0e0e-b26a-4910-b488-9c8308ce0597")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitNonFunctionalEventInstance(this);
    }

    @objid ("a5ba6cab-e8c6-4542-b09f-d0d4219d4b13")
    public NonFunctionalEventInstanceImporter(T elt) {
        super(elt);
    }

    @objid ("a2bba1b1-9a7d-4d1c-8df2-f5fbb0a34b3a")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.create();
    }

    @objid ("83a595ca-5750-4f25-af33-112ed16ea1c6")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("e02887f6-351b-4636-bd7f-b92a4469d43b")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setMetricInstance(elt);
    }

    @objid ("ba8e6d46-1b86-406b-aab9-f956aae869bf")
    private void setMetricInstance(V elt) {
        MetricInstance value = this._element.getMetricInstance();
        if (value != null) {
            elt.setMetricInstance((fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance) value);
        }
    }

}
