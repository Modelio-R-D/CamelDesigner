package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.Attribute;
import camel.core.CoreFactory;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import org.eclipse.emf.cdo.CDOObject;

@objid ("668fff4d-c8db-4b74-a22e-d38735dab8bd")
public abstract class CamelAttributeExporter<T extends CamelAttribute> extends ExpendableElementExporter<T> {
    @objid ("67d6f93b-a675-4775-ae43-9f97cfc05eac")
    public CamelAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("04e98212-bdc4-4545-b5bf-04ec39805bf6")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createAttribute();
    }

    @objid ("f943813f-de0c-4599-85bc-be133f0f5e9a")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.core.Attribute) {
            camel.core.Attribute att = (camel.core.Attribute) elt;
            setValue(att);
            setValueType(att);
            setUnit(att);
        }
    }

    @objid ("649d5d67-49f7-433c-8e63-a6f18d2fee1f")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        if (elt instanceof camel.core.Attribute){
            camel.core.Attribute att = (camel.core.Attribute) elt;
            if (context instanceof camel.deployment.ClusterConfiguration) {
                ((camel.deployment.ClusterConfiguration) context).getConfigParameters().add(att);
            } else if (context instanceof camel.deployment.ServerlessConfiguration) {
                ((camel.deployment.ServerlessConfiguration) context).getEnvironmentConfigParams().add(att);
            } else if (context instanceof camel.core.Feature) {
                ((camel.core.Feature) context).getAttributes().add(att);
            }
        }
    }

    @objid ("4578e5ba-81f0-402b-b999-95d27ede6493")
    private void setUnit(Attribute att) {
        //        CDOObject unit =  this._process.getElement(this._element.getUnit());
        //        if ((unit != null) &&  (unit instanceof camel.type.ValueType))
        //            att.setUnit((camel.unit.Unit) unit);
    }

    @objid ("4d97231f-be0c-4c74-9008-6d6b90e7668f")
    private void setValueType(Attribute att) {
        //        CDOObject valueType =  this._process.getElement(this._element.getValueType());
        //        if ((valueType != null) &&  (valueType instanceof camel.type.ValueType))
        //            att.setValueType((camel.type.ValueType) valueType);
    }

    @objid ("8f946694-022b-4a92-9001-02cf94f2a88a")
    private void setValue(Attribute att) {
        //        CDOObject value =  this._process.getElement(this._element.getValue());
        //        if ((value != null) &&  (value instanceof camel.type.Value))
        //            att.setValue((camel.type.Value) value);
    }

}
