package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.DoubleValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("d9e12286-a5b3-4ef7-90b9-f4cb5227c626")
public class DoubleValueExporter<T extends DoubleValue> extends ValueExporter<T> {
    @objid ("ab87272e-877d-4115-a9d0-a85569f6421a")
    public DoubleValueExporter(T elt) {
        super(elt);
    }

    @objid ("cd7cb9de-1456-4981-a974-378fe3cef6ab")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createDoubleValue();
    }

    @objid ("e3f872fc-3368-46bc-9f98-34ee87358a42")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("93f82b90-5144-4456-a206-a55d47d5cbe4")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
