package fr.softeam.cameldesigner.exchange.importer.data;

import camel.data.DataTypeModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("6829a6c7-60a4-432d-b2ff-a33b5ce4375c")
public class DataTypeModelImporter<T extends DataTypeModel, V extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel> extends SubModelImporter<T,V> {
    @objid ("3563043e-6606-4efe-80e5-1c55027df30f")
    public DataTypeModelImporter() {
        super();
    }

    @objid ("e80b6e9e-bade-443c-8409-e5a74a9f0645")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.create();
    }

    @objid ("1971aa95-8203-490b-891e-8b006a8a45ca")
    @Override
    public void attach(V elt, CamelElement context) {
    }

    @objid ("e5844fe6-df2d-4912-8dc8-cbd804efda8a")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitDataTypeModel(this);
    }

}
