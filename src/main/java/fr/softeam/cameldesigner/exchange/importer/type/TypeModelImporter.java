package fr.softeam.cameldesigner.exchange.importer.type;

import camel.type.TypeModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("cce15b7e-83a1-403d-af3d-06e6648d5ffa")
public class TypeModelImporter<T extends TypeModel, V extends fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel> extends SubModelImporter<T,V> {
    @objid ("a501a9d4-2ee1-4a24-b851-fc5d1f556464")
    public TypeModelImporter() {
    }

    @objid ("4ba56155-266f-4598-ba88-40f5ef4db33a")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitTypeModel(this);
    }

    @objid ("9bfa4f66-989d-478e-a3e6-ec1fe4dba623")
    public TypeModelImporter(T elt) {
        super(elt);
    }

    @objid ("3f34b929-5f3a-477e-8c01-f722e90b0de8")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.create();
    }

    @objid ("78e86d83-bf92-4e39-80a6-8e1f8a965c77")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof CamelModel)
            ((CamelModel)context).addTypeModels(elt);
    }

}
