package fr.softeam.cameldesigner.exchange.exporter.type;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.Value;


public abstract class ValueExporter<T extends Value>{

    public ValueExporter(T elt) {
    }


    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }


    public void setProperties(CDOObject elt) {
    }


    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.type.TypeModel) && (elt instanceof camel.type.Value)) {
            ((camel.type.TypeModel) context).getValues().add((camel.type.Value) elt);
        }
    }

}
