package fr.softeam.cameldesigner.exchange.exporter.type;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.exchange.exporter.core.CamelElementExporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a6c511f1-683a-4ff6-a932-850be9a74f97")
public abstract class ValueTypeExporter<T extends ValueType> extends CamelElementExporter<T> {
    @objid ("3c3aceb6-3a9d-452a-b8c5-df052fcd7c27")
    public ValueTypeExporter(T elt) {
        super(elt);
        // TODO Auto-generated constructor stub
    }

    @objid ("2daf8b69-85bc-40de-bf1a-6a3630f5e2c5")
    public CDOObject createCamelElt(CDOObject context) {
        return null;
    }

    @objid ("fe9109ea-2adc-41c6-ac4b-b870cc6d1b18")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.type.ValueType) {
            camel.type.ValueType vt = (camel.type.ValueType) elt;
            setName(vt);
            setDescription(vt);
            setPrimitiveType(vt);
        }
    }

    @objid ("9b48e85a-17f0-4962-871c-6f34b3017c0e")
    public void attach(CDOObject elt, CDOObject context) {
        if ((context instanceof camel.type.TypeModel) && (elt instanceof camel.type.ValueType)) {
            ((camel.type.TypeModel) context).getValueTypes().add((camel.type.ValueType) elt);
        }
    }

    @objid ("d6f06b73-5cab-4b32-9cf3-a81b00abc1aa")
    private void setPrimitiveType(camel.type.ValueType vt) {
        //vt.setPrimitiveType(this._element.getPrimitiveType());
    }

    @objid ("657e0361-6850-4244-8ddc-4eee33d30ffb")
    private void setName(camel.type.ValueType vt) {
        vt.setName(this._element.getName());
    }

    @objid ("d6487d04-ff4d-442d-8a23-ea2313731fca")
    private void setDescription(camel.type.ValueType vt) {
        String content = this._element.getDescription();
        if ((content != null) && (!(content.equals("")))){
            vt.setDescription(content);
        }
    }

}
