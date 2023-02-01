package fr.softeam.cameldesigner.exchange.importer.core;

import camel.core.Attribute;
import camel.type.BooleanValue;
import camel.type.DoubleValue;
import camel.type.FloatValue;
import camel.type.IntValue;
import camel.type.StringValue;
import camel.type.Value;
import camel.type.ValueType;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.classifier.FeatureClassifier;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("804d7722-af37-42b3-ace8-7102790c372c")
public class AttributeImporter<T extends Attribute, V extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> extends NamedElementImporter<T,V> {
    @objid ("85d96de8-1760-4a0a-8422-6da18b72ee0d")
    public AttributeImporter() {
    }

    @objid ("e689fbe7-49aa-4837-9dbc-6260e4394667")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitAttribute(this);
    }

    @objid ("665b14ab-5a4c-4175-aeb0-35fa05bfd588")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        ModelElement value = this._process.getElement(owner).getElement();
        
        if ( value instanceof org.modelio.metamodel.uml.statik.Package)
            return fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.create();
        if ( value instanceof org.modelio.metamodel.uml.statik.Class)
            return fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.create();
        else
            return null;
    }

    @objid ("8c4f7bea-5e16-4322-a673-3d0db11f72cd")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setValueType(elt);
        setUnit(elt);
        setValue(elt);
    }

    @objid ("17db46cd-3cb3-4a60-8e59-469a497c8cea")
    @Override
    public void attach(V elt, CamelElement context) {
        if ((context instanceof FeatureClassifier) &&( elt instanceof AttributeAttribute))
         ((FeatureClassifier) context).addAttributes((AttributeAttribute) elt);
    }

    @objid ("b8229cdb-32b8-4dd8-9bb3-3d64a073a537")
    public AttributeImporter(T elt) {
        super(elt);
    }

    @objid ("db3190ad-fde9-4298-8ae7-f84e26c05f62")
    private void setValue(V elt) {
        Value value = this._element.getValue();
        if (value != null) {
            if (value instanceof IntValue) {
                elt.setValue(String.valueOf(((IntValue)value).getValue()));
            }
            else if (value instanceof BooleanValue) {
                elt.setValue(String.valueOf(((BooleanValue)value).isValue()));
            }
            else if (value instanceof FloatValue) {
                elt.setValue(String.valueOf(((FloatValue)value).getValue()));
            }
            else if (value instanceof DoubleValue) {
                elt.setValue(String.valueOf(((DoubleValue)value).getValue()));
            }
            else if (value instanceof StringValue) {
                elt.setValue(((StringValue)value).getValue());
            }
        }
    }

    @objid ("e0399787-49a9-476a-814f-ef33f0d2c469")
    private void setUnit(V elt) {
        Unit value = this._element.getUnit();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit) {
                elt.setUnit( (fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit) valueElt);
        
            }
        }
    }

    @objid ("a8758e25-a083-4159-b98b-ef6f85ca08be")
    private void setValueType(V elt) {
        // TODO Auto-generated method stub
        ValueType value = this._element.getValueType();
        if (value != null) {
            CamelElement valueElt = this._process.getElement(value);
            if (valueElt instanceof fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType)
                elt.setValueType((fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType) valueElt);
        
            }
    }

}
