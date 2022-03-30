package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.StringValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("b8867604-8a85-4262-9561-787dfd04047d")
public class StringValueTypeExporter<T extends StringValue> extends ValueExporter<T> {
    @objid ("3935e6c4-24da-4919-a15c-324aec4eaaf8")
    public StringValueTypeExporter(T elt) {
        super(elt);
    }

    @objid ("7cffc034-c291-4c2d-bbfb-7006abdd61b9")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createStringValue();
    }

    @objid ("8889df95-009a-4f62-a6be-1823d588793f")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("d06b0a43-4a49-4c7f-99e4-7584682b1273")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
