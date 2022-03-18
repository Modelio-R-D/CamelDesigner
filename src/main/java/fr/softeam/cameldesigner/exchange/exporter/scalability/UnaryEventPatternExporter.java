package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.ScalabilityFactory;
import camel.scalability.UnaryPatternOperatorType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b0c14ebe-9fa6-4c7e-9311-b0489f6f69a1")
public class UnaryEventPatternExporter<T extends UnaryEventPattern> extends EventPatternExporter<T> {
    @objid ("23463322-8d1f-4b56-a635-729c7553d230")
    public UnaryEventPatternExporter(T elt) {
        super(elt);
    }

    @objid ("d9a24956-a320-4bf9-8566-5ec197ea0273")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createUnaryEventPattern();
    }

    @objid ("6b0aca0d-a2e5-4ab4-a1d8-8a3bdeb92484")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.scalability.UnaryEventPattern) {
            camel.scalability.UnaryEventPattern uep = (camel.scalability.UnaryEventPattern) elt;
            setEvent(uep);
            setOccurrenceNum(uep);
            setOperator(uep);
        }
    }

    @objid ("b1a1e7be-88b9-4c00-9fa5-3792cd8d7d42")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("59475d68-9d10-41db-bbbb-9a37df290a2e")
    private void setOperator(camel.scalability.UnaryEventPattern uep) {
        String content = this._element.getOperator();
        if (content != null)
            uep.setOperator(UnaryPatternOperatorType.valueOf(content));
    }

    @objid ("f9bbbc3b-7349-4584-be48-cfd56ec32017")
    private void setOccurrenceNum(camel.scalability.UnaryEventPattern uep) {
        String content = this._element.getOccurrenceNum();
        if (content != null)
            uep.setOccurrenceNum(Double.valueOf(content));
    }

    @objid ("b8e03a0f-8189-4b50-9b49-090060c76bab")
    private void setEvent(camel.scalability.UnaryEventPattern uep) {
        CDOObject event = this._process.getElement(this._element.getEvent());
        if ((event != null) &&  (event instanceof camel.scalability.Event))
            uep.setEvent((camel.scalability.Event) event);
    }

}
