package fr.softeam.cameldesigner.exchange.exporter.type;

import org.eclipse.emf.cdo.CDOObject;
import camel.type.TypeFactory;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.FloatValue;


public class FloatValueExporter<T extends FloatValue> extends ValueExporter<T> {

    public FloatValueExporter(T elt) {
        super(elt);
    }


    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createFloatValue();
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
