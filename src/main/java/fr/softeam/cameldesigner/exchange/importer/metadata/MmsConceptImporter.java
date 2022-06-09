package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;

public class MmsConceptImporter<T extends MmsConcept, V extends MetaDataModel, W extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept, Z extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> extends MmsObjectImporter<T,V,W,Z> {

    public MmsConceptImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelVisitor v) {
      return v.visitMmsConcept(this);
    }

    @Override
    public CamelElement createCamelElt(V owner) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.create();
    }

    @Override
    public void setProperties(W elt) {
        super.setProperties(elt);

    }

    @Override
    public void attach(W elt, Z context) {
        super.attach(elt, context);
    }

}
