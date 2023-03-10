package fr.softeam.cameldesigner.exchange.exporter.core;

import camel.core.Attribute;
import camel.core.CoreFactory;
import camel.type.BooleanValue;
import camel.type.DoubleValue;
import camel.type.FloatValue;
import camel.type.IntValue;
import camel.type.StringValue;
import camel.type.TypeFactory;
import camel.type.Value;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType;
import fr.softeam.cameldesigner.utils.PrimitiveTypeUtils;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.ecore.EDataType;
import org.modelio.metamodel.uml.statik.DataType;

@objid ("6063c182-30b1-4068-9c62-e00f2180ae02")
public class AttributeAttributeExporter<T extends AttributeAttribute> extends CamelAttributeExporter<T> {
    @objid ("4a22c919-1cb5-4998-9bab-5f1bb3a8a535")
    public AttributeAttributeExporter(T elt) {
        super(elt);
    }

    @objid ("b7329c1d-7742-40fe-b752-59153825e2e8")
    @Override
    public CDOObject createCamelElt(CDOObject context) {
        return CoreFactory.eINSTANCE.createAttribute();
    }

    @objid ("a5b4c764-853c-4163-a540-b1fcd076fd57")
    @Override
    public void setProperties(CDOObject elt) {
        super.setProperties(elt);
        if (elt instanceof camel.core.Attribute) {
            camel.core.Attribute att = (camel.core.Attribute) elt;
            setValue(att);
            setValueType(att);
            setUnit(att);
            setMinValue(att);
            setMaxValue(att);
            setMinInclusive(att);
            setMaxInclusive(att);
        }
    }

    @objid ("61c04870-2287-4cc0-8c89-54b355412670")
    private void setUnit(Attribute att) {
        CDOObject unit =  this._process.getElement(this._element.getUnit());
        if ((unit != null) &&  (unit instanceof camel.type.ValueType))
            att.setUnit((camel.unit.Unit) unit);
    }

    @objid ("ccbb9905-eb24-4e19-a9a2-167192fd5f30")
    private void setValueType(Attribute att) {
        CDOObject valueType =  this._process.getElement(this._element.getValueType());
        if ((valueType != null) &&  (valueType instanceof camel.type.ValueType))
            att.setValueType((camel.type.ValueType) valueType);
    }

    @objid ("decca1ba-9a71-4a58-bb90-1a7eb87b9b5e")
    private void setValue(Attribute att) {
        String content = this._element.getValue();
        ValueType type = this._element.getValueType();
        
        if (content != null) {
        
            //get Type Name
            String typeName = null;
            if (type != null) {
                typeName = type.getName();
            }else {
                typeName = PrimitiveTypeUtils.getLabel((DataType)this._element.getElement().getType());
            }
        
        
            if (typeName != null) {
        
                if ( (typeName.equals("StringValueType")) || (typeName.equals("StringType"))) {
                    StringValue value = TypeFactory.eINSTANCE.createStringValue();
                    value.setValue(content);
                    att.setValue(value);
                }else if ((typeName.equals("BooleanValueType")) ||(typeName.equals("BooleanType"))) {
                    BooleanValue value = TypeFactory.eINSTANCE.createBooleanValue();
                    value.setValue(Boolean.valueOf(content));
                    att.setValue(value);
                }else if (typeName.equals("IntType")) {
                    IntValue value = TypeFactory.eINSTANCE.createIntValue();
                    value.setValue(Integer.valueOf(content));
                    att.setValue(value);
                }else if (typeName.equals("FloatType")) {
                    FloatValue value = TypeFactory.eINSTANCE.createFloatValue();
                    value.setValue(Float.valueOf(content));
                    att.setValue(value);
                }else if (typeName.equals("DoubleType")) {
                    DoubleValue value = TypeFactory.eINSTANCE.createDoubleValue();
                    value.setValue(Double.valueOf(content));
                    att.setValue(value);
                    //            }else if (type.getName().equals("List")) {
                    //                StringValue value = TypeFactory.eINSTANCE.createLi;
                    //                att.setValue(value);
                    //            }else if (type.getName().equals("Range")) {
                    //                StringValue value = TypeFactory.eINSTANCE.createStringValue();
                    //                att.setValue(value);
                    //            }else if (type.getName().equals("RangeUnion")) {
                    //                StringValue value = TypeFactory.eINSTANCE.createStringValue();
                    //                att.setValue(value);
                }
            }
        }
    }

    @objid ("7798bbc4-b55d-419d-b625-e7624e94fcae")
    @Override
    public void attach(CDOObject elt, CDOObject context) {
        super.attach(elt, context);
    }

    @objid ("9859b445-4467-4077-9e99-a83cd202c04e")
    private void setMaxInclusive(Attribute att) {
        Boolean content = this._element.isMaxInclusive();
        if (content != null)
            att.setMaxInclusive(content);
    }

    @objid ("8c11d614-a551-424f-a8ec-e3540e57824c")
    private void setMinInclusive(Attribute att) {
        Boolean content = this._element.isMinInclusive();
        if (content != null)
            att.setMinInclusive(content);
    }

    @objid ("f76f1e8f-58c4-4a40-88fd-8be8fd63a008")
    private void setMaxValue(Attribute att) {
        /*
         *    CDOObject content = this._process.getElement(this._element.getMaxValue());
         *     if (content != null) {
              att.setMaxValue((Value)content);
          }
         */
    }

    @objid ("54b11c03-89f1-4488-abae-4856195193c4")
    private void setMinValue(Attribute att) {
        // TODO Auto-generated method stub
    }

}
