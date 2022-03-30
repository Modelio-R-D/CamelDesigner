package fr.softeam.cameldesigner.exchange.exporter.type;

import camel.type.TypeFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType;
import org.eclipse.emf.cdo.CDOObject;

@objid ("2a420874-3e75-412c-99dc-d73ab4b71d43")
public class BooleanValueTypeExporter<T extends BooleanValueType> extends ValueTypeExporter<T> {
    @objid ("45fbc1a5-c2e1-407d-b890-aedfa0ca02d5")
    public BooleanValueTypeExporter(T elt) {
        super(elt);
    }

    @objid ("26ae35f4-bf39-4cff-b2bc-5501444af7ba")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return TypeFactory.eINSTANCE.createBooleanValueType();
    }

    @objid ("d6b3ec3f-01be-468e-8824-06598359c6e9")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
    }

    @objid ("f3ddc639-ac60-43b9-b4a0-d7ab6a8b5269")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

}
