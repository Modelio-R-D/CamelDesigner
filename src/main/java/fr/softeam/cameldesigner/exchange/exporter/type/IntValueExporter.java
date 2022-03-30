package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.IntValue;
import org.eclipse.emf.cdo.CDOObject;

@objid ("43da56da-c145-446d-bf23-9e22a4a19fd7")
public class IntValueExporter<T extends IntValue> extends ValueExporter<T> {
    @objid ("1e2c5f44-8305-48b8-a864-4af0969c0653")
    public IntValueExporter(T elt) {
        super(elt);
    }

    @objid ("73f4854d-d411-4e68-8a7a-e4fe79dd0167")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createIntValue();
    }

    @objid ("84146e70-3903-42ac-820c-2f9e0491c9c6")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("3bcabb49-7554-4aef-a465-8f5eb9173d83")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
