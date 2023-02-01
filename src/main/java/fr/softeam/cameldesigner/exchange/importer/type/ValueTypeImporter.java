package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.PrimitiveType;
import camel.type.ValueType;
import camel.unit.Unit;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;

@objid ("ce6299fe-a427-4090-af9b-d08cae38c30d")
public abstract class ValueTypeImporter<T extends ValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> extends NamedElementImporter<T,V> {
    @objid ("64f1dad0-5976-475d-a121-99216b536afd")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof TypeModel) {
            ((TypeModel) context).addValueTypes(elt);
        }
    }

    @objid ("60a00b7c-d71a-439f-a69a-b4bc2d31e3fd")
    public ValueTypeImporter(T elt) {
        super(elt);
    }

    @objid ("c2190888-b61c-4260-a930-485f1681a010")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitValueType(this);
    }

    @objid ("65af6e22-6ed8-47c1-aa1d-dffcba13b801")
    public ValueTypeImporter() {
<<<<<<< HEAD
    }

    @objid ("2a00b5ae-183f-4103-b355-812298a74c26")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
        setPrimitiveType(elt);
    }

    @objid ("a2b9b59e-84ad-43f3-8c53-8256d70b26dd")
    private void setPrimitiveType(V elt) {
        PrimitiveType value =  this._element.getPrimitiveType();
        if (value != null) {
            elt.setPrimitiveType(value.getLiteral());
        }
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    }

}
