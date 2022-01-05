package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("ee90e7f0-f41d-43a2-8c70-762e2928af59")
public class TimerExporter<T extends Timer> extends FeatureExporter<T> {
    @objid ("b9f46c4f-b343-44d4-a71c-1fe141bd8dd3")
    public TimerExporter(T elt) {
        super(elt);
    }

    @objid ("6c0fb7d2-d912-4183-b9b3-d132175ac4d8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createTimer();
    }

    @objid ("7f48ae3b-e95f-4f75-95ba-d4e04994b95e")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("ce7c11cc-a01d-4d93-8dcd-17f508d3ed7f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
