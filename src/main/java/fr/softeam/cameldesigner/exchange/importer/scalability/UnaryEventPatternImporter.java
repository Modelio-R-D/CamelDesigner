package fr.softeam.cameldesigner.exchange.importer.scalability;

<<<<<<< HEAD
import camel.scalability.BinaryPatternOperatorType;
import camel.scalability.Event;
import camel.scalability.UnaryEventPattern;
import camel.scalability.UnaryPatternOperatorType;
=======
import camel.scalability.UnaryEventPattern;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("0051aedc-9fe9-4c69-a81e-4bcd0e9aef4e")
public class UnaryEventPatternImporter<T extends UnaryEventPattern, V extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern> extends EventPatternImporter<T,V> {
    @objid ("1184492c-1630-4d76-afb4-90d415c4951b")
    public UnaryEventPatternImporter() {
    }

    @objid ("678f9aba-b0a2-40de-a2df-e36d048d8066")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitUnaryEventPattern(this);
    }

    @objid ("2c529715-9048-4a33-9337-649eeec27d46")
    public UnaryEventPatternImporter(T elt) {
        super(elt);
    }

    @objid ("b012ac85-15ba-4274-a029-b4888f47df96")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.create();
    }

    @objid ("b76b51a8-7772-4e1d-8aef-cf8f59fdaf42")
    @Override
    public void attach(V elt, CamelElement context) {
        super.attach(elt, context);
    }

    @objid ("94de7676-3b1b-4576-9e74-89752f6573df")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setEvent(elt);
        setOccurrenceNum(elt);
        setOperator(elt);
    }

    @objid ("a4bbc5ab-8561-4a0b-850c-c7d9c96731be")
    private void setEvent(V elt) {
        Event value = this._element.getEvent();
        if (value != null) {
            elt.setEvent( (fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event) value);
        }
    }

    @objid ("207db9fb-51b7-41d5-a662-8c0cca37bc50")
    private void setOccurrenceNum(V elt) {
        Double value = this._element.getOccurrenceNum();
        if (value != null) {
            elt.setOccurrenceNum(String.valueOf(value));
        }
    }

    @objid ("b66e20dd-8aa3-42b7-932b-936684ac5992")
    private void setOperator(V elt) {
        UnaryPatternOperatorType value = this._element.getOperator();
        if (value != null) {
            elt.setOperator(value.getLiteral());
        }
    }

}
