package fr.softeam.cameldesigner.exchange.exporter.type;

import org.eclipse.emf.cdo.CDOObject;
import camel.type.TypeFactory;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.Limit;


public class LimitExporter<T extends Limit> {

    public LimitExporter(T elt) {

    }


    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createLimit();
    }


    public void setProperties(CDOObject elt) {

    }


    public void attach(CDOObject elt, CDOObject context) {

    }

}
