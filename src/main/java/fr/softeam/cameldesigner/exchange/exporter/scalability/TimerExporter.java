package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import camel.scalability.TimerType;
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
        if (elt instanceof camel.scalability.Timer) {
            camel.scalability.Timer timer = (camel.scalability.Timer) elt;
            setType(timer);
            setTimeValue(timer);
            setMaxOccurrenceNum(timer);
            setUnit(timer);
        }
    }

    @objid ("ce7c11cc-a01d-4d93-8dcd-17f508d3ed7f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.scalability.ScalabilityModel) && (elt instanceof camel.scalability.Timer)) {
            ((camel.scalability.ScalabilityModel) context).getTimers().add((camel.scalability.Timer) elt);
        }else {
            super.attach(elt, context);
        }
    }

    @objid ("599888e7-b19d-4247-a825-1cc0eebdfeb3")
    private void setUnit(camel.scalability.Timer timer) {
        CDOObject unit = this._process.getElement(this._element.getUnit());
        if ((unit != null) &&  (unit instanceof camel.unit.Unit))
            timer.setUnit((camel.unit.Unit) unit);
    }

    @objid ("e32fa147-49eb-497e-b6be-5ab8f5e9ed5c")
    private void setMaxOccurrenceNum(camel.scalability.Timer timer) {
        String content = this._element.getMaxOccurrenceNum();
        if (content != null)
            timer.setMaxOccurrenceNum(Integer.valueOf(content));
    }

    @objid ("a25dcfaa-fe90-45e9-8903-e2dc309191dd")
    private void setType(camel.scalability.Timer timer) {
        String content = this._element.getType();
        if (content != null)
            timer.setType(TimerType.valueOf(content));
    }

    @objid ("bd03fd08-1e1b-433e-84a4-5ec249f26fe8")
    private void setTimeValue(camel.scalability.Timer timer) {
        String content = this._element.getTimeValue();
        if (content != null)
            timer.setTimeValue(Integer.valueOf(content));
    }

}
