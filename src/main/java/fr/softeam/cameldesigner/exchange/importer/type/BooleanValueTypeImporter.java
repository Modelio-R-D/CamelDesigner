package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.BooleanValueType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a14729e8-39c6-4f14-9a96-d664a1ffad84")
public class BooleanValueTypeImporter<T extends BooleanValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType> extends ValueTypeImporter<T,V> {
    @objid ("32efc330-3c3d-4fe1-91be-aef421aa0766")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.create();
    }

    @objid ("bc472dce-de07-49dc-b01a-5cc4e966049c")
    public BooleanValueTypeImporter(T elt) {
        super(elt);
    }

    @objid ("83ee9715-b1db-431e-9539-75b5b9b5250c")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitBooleanValueTypeImporter(this);
    }

    @objid ("ce138e78-0e1b-4549-b7c6-79ea323711bf")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof TypeModel)
            ((TypeModel)context).addValueTypes(elt);
    }

}
