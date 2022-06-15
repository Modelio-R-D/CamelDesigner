package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.core.CamelModel;
import camel.mms.MetaDataModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;

@objid ("4e87c36c-6977-4be6-b80b-a535ed82611a")
public class MetaDataModelImporter<T extends MetaDataModel, V extends CamelModel, W extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel, Z extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> extends SubModelImporter<T,V,W,Z> {
    @objid ("05bcba2f-7748-49b6-9ecb-8e36f4008abe")
    public MetaDataModelImporter() {
    }

    @objid ("cdd56615-b13f-4971-95be-f0dc37772672")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMetaDataModel(this);
    }

    @objid ("460e98a9-3240-4611-a398-73df79eecd40")
    public MetaDataModelImporter(T elt) {
        super(elt);
    }

    @objid ("3b94e261-e393-4ac9-bbde-30102525b4b2")
    @Override
    public CamelElement createCamelElt(V owner) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.create();
    }

    @objid ("33402df9-93ae-41c0-882e-18672d5e9257")
    @Override
    public void attach(W elt, Z context) {
        context.addMetaDataModels(elt);
    }

}
