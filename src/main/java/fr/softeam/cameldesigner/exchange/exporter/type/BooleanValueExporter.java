package fr.softeam.cameldesigner.exchange.exporter.type;

import org.eclipse.emf.cdo.CDOObject;
import camel.type.TypeFactory;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.BooleanValue;


public class BooleanValueExporter<T extends BooleanValue> extends ValueExporter<T> {

    public BooleanValueExporter(T elt) {
        super(elt);
    }

    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createBooleanValue();
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
