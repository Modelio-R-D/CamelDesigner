package fr.softeam.cameldesigner.exchange.importer.scalability;

import camel.deployment.HTTPMethodType;
import camel.scalability.BinaryEventPattern;
import camel.scalability.BinaryPatternOperatorType;
import camel.scalability.Event;
import camel.scalability.Timer;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("f50be6ac-b794-4cc0-a2e3-29ba64321b84")
public class BinaryEventPatternImporter<T extends BinaryEventPattern, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern> extends EventPatternImporter<T,V> {
    @objid ("c14fbb5a-3683-4104-8c15-ec3e254c0b13")
    public BinaryEventPatternImporter() {
    }

    @objid ("dd9dbe81-3bf5-4a1b-a738-9ec2463e9626")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitBinaryEventPattern(this);
    }

    @objid ("eae07e21-18dd-462b-a8f7-0ea33cb68c1a")
    public BinaryEventPatternImporter(T elt) {
        super(elt);
    }

    @objid ("07ad3e5e-4b80-4e3a-83ee-d9171ac2a021")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.create();
    }

    @objid ("7cd16455-6d99-4e74-854b-f00b42334480")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("411214ff-5e91-49a4-83e6-565f99eec001")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setLeftEvent(elt);
        setRightEvent(elt);
        setLowerOccurrenceBound(elt);
        setUpperOccurrenceBound(elt);
        setOperator(elt);
    }

    @objid ("ae0359b1-3c61-44af-8d1c-b7d77c1af7af")
    private void setLeftEvent(V elt) {
        Event value = this._element.getLeftEvent();
        if (value != null) {
            elt.setLeftEvent( (fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event) value);
        }
    }

    @objid ("b28dad67-18c8-42ff-b118-24f8a924d7f0")
    private void setRightEvent(V elt) {
        Event value = this._element.getRightEvent();
        if (value != null) {
            elt.setRightEvent( (fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event) value);
        }
    }

    @objid ("d85d4ef5-5582-4fae-af0d-46467cec87e2")
    private void setLowerOccurrenceBound(V elt) {
        Double value = this._element.getLowerOccurrenceBound();
        if (value != null) {
            elt.setLowerOccurrenceBound(String.valueOf(value));
        }
    }

    @objid ("59506cc7-f19e-4ddf-acb4-fb925b9d7fd2")
    private void setUpperOccurrenceBound(V elt) {
        Double value = this._element.getUpperOccurrenceBound();
        if (value != null) {
            elt.setUpperOccurrenceBound(String.valueOf(value));
        }
    }

    @objid ("17caf0db-88a7-4b81-8abc-37e94b204202")
    private void setOperator(V elt) {
        BinaryPatternOperatorType value = this._element.getOperator();
        if (value != null) {
            elt.setOperator(value.getLiteral());
        }
    }

}
