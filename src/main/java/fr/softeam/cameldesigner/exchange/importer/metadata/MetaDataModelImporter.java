package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.core.CamelModel;
import camel.mms.MetaDataModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;

public class MetaDataModelImporter<T extends MetaDataModel, V extends CamelModel, W extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel, Z extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> extends SubModelImporter<T,V,W,Z> {

    public MetaDataModelImporter() {
    }

    public MetaDataModelImporter(T elt) {
        super(elt);
    }

    @Override
    public CamelElement createCamelElt(V owner) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.create();
    }


    @Override
    public Object accept(ICamelImporterVisitor v) {
      return v.visitMetaDataModel(this);
    }

    @Override
    public void attach(W elt, Z context) {
       context.addMetaDataModels(elt);
    }

}
