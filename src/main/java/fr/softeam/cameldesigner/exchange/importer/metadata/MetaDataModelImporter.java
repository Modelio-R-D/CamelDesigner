package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.core.CamelModel;
import camel.mms.MetaDataModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;

public class MetaDataModelImporter<T extends MetaDataModel, V extends CamelModel, W extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel, Z extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> extends SubModelImporter<T,V,W,Z> {

    public MetaDataModelImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelVisitor v) {
      return v.visitMetaDataModel(this);
    }

}
