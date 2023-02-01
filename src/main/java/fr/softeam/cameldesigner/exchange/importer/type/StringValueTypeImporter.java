package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.StringValueType;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
<<<<<<< HEAD
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("fdeaabed-bf72-4370-8726-1ba78e6ef5cc")
public class StringValueTypeImporter<T extends StringValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType> extends ValueTypeImporter<T,V> {
    @objid ("0609ee80-af0a-472e-9548-e19e2f1afc2b")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.create();
    }

    @objid ("cad275b9-f45b-4a56-9c7f-1771f05444b1")
    public StringValueTypeImporter(T elt) {
        super(elt);
    }

    @objid ("a21344c2-925c-476f-b942-d8bb878e1d12")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitStringValueTypeImporter(this);
    }

    @objid ("daa9d3d7-0d2e-48ba-9b20-d9e4df80b474")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof TypeModel)
            ((TypeModel)context).addValueTypes(elt);
=======
import org.eclipse.emf.cdo.CDOObject;

@objid ("fdeaabed-bf72-4370-8726-1ba78e6ef5cc")
public class StringValueTypeImporter<T extends StringValueType, V extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> extends ValueTypeImporter<T,V> {
    @objid ("0609ee80-af0a-472e-9548-e19e2f1afc2b")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        // TODO Auto-generated method stub
        return null;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    }

}
