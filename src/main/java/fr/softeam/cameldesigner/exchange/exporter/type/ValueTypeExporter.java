package fr.softeam.cameldesigner.exchange.exporter.type;

import org.eclipse.emf.cdo.CDOObject;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;


public abstract class ValueTypeExporter<T extends ValueType>{

    public ValueTypeExporter(T elt) {

    }


    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }


    public void setProperties(CDOObject elt) {

    }


    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.type.TypeModel) && (elt instanceof camel.type.ValueType)) {
            ((camel.type.TypeModel) context).getValueTypes().add((camel.type.ValueType) elt);
        }
    }

}
