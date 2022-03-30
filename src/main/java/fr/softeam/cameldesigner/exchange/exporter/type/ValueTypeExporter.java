package fr.softeam.cameldesigner.exchange.exporter.type;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a6c511f1-683a-4ff6-a932-850be9a74f97")
public abstract class ValueTypeExporter<T extends ValueType> {
    @objid ("3c3aceb6-3a9d-452a-b8c5-df052fcd7c27")
    public ValueTypeExporter(T elt) {
    }

    @objid ("2daf8b69-85bc-40de-bf1a-6a3630f5e2c5")
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }

    @objid ("fe9109ea-2adc-41c6-ac4b-b870cc6d1b18")
    public void setProperties(CDOObject elt) {
    }

    @objid ("9b48e85a-17f0-4962-871c-6f34b3017c0e")
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.type.TypeModel) && (elt instanceof camel.type.ValueType)) {
            ((camel.type.TypeModel) context).getValueTypes().add((camel.type.ValueType) elt);
        }
    }

}
