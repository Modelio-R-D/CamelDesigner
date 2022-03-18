package fr.softeam.cameldesigner.exchange.exporter.scalability;

import camel.scalability.BinaryPatternOperatorType;
import camel.scalability.ScalabilityFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import org.eclipse.emf.cdo.CDOObject;

@objid ("16b2612a-8c49-4989-9ec6-1a9acdca1c29")
public class BinaryEventPatternExporter<T extends BinaryEventPattern> extends EventPatternExporter<T> {
    @objid ("4fc67aac-0377-4242-b0ec-51457cd81a22")
    public BinaryEventPatternExporter(T elt) {
        super(elt);
    }

    @objid ("0de74e2a-ad7d-45d6-9e08-d8e5af7d450a")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return ScalabilityFactory.eINSTANCE.createBinaryEventPattern();
    }

    @objid ("9a0fe7dd-a881-45ca-98d8-52c2831d203f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.scalability.BinaryEventPattern) {
            camel.scalability.BinaryEventPattern bep = (camel.scalability.BinaryEventPattern) elt;
            setLeftEvent(bep);
            setRightEvent(bep);
            setLowerOccurrenceBound(bep);
            setUpperOccurrenceBound(bep);
            setOperator(bep);
        }
    }

    @objid ("0eaa29d1-3b95-4142-9326-2f60e0e0eea6")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("bdb60f4d-dff9-4c89-be7f-d74ef6fd17e5")
    private void setOperator(camel.scalability.BinaryEventPattern bep) {
        String content = this._element.getOperator();
        if (content != null)
            bep.setOperator(BinaryPatternOperatorType.valueOf(content));
    }

    @objid ("f066e3db-930c-4988-928a-b56f08896a6b")
    private void setLowerOccurrenceBound(camel.scalability.BinaryEventPattern bep) {
        String content = this._element.getLowerOccurrenceBound();
        if (content != null)
            bep.setLowerOccurrenceBound(Double.valueOf(content));
    }

    @objid ("17f887ef-087f-4828-9425-e461a3f37972")
    private void setUpperOccurrenceBound(camel.scalability.BinaryEventPattern bep) {
        String content = this._element.getUpperOccurrenceBound();
        if (content != null)
            bep.setUpperOccurrenceBound(Double.valueOf(content));
    }

    @objid ("345e0a97-b712-413f-a2fe-b8a86bf237cc")
    private void setLeftEvent(camel.scalability.BinaryEventPattern bep) {
        CDOObject event = this._process.getElement(this._element.getLeftEvent());
        if ((event != null) &&  (event instanceof camel.scalability.Event))
            bep.setLeftEvent((camel.scalability.Event) event);
    }

    @objid ("1519d752-5848-4d62-bd63-0d938f0594e3")
    private void setRightEvent(camel.scalability.BinaryEventPattern bep) {
        CDOObject event = this._process.getElement(this._element.getRightEvent());
        if ((event != null) &&  (event instanceof camel.scalability.Event))
            bep.setRightEvent((camel.scalability.Event) event);
    }

}
