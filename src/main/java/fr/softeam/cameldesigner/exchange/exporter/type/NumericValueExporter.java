package fr.softeam.cameldesigner.exchange.exporter.type;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.NumericValue;


public abstract class NumericValueExporter<T extends NumericValue> extends ValueExporter<T> {

    public NumericValueExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }


    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }


    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
