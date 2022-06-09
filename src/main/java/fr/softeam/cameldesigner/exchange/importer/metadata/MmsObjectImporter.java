package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MetaDataModel;
import camel.mms.MmsObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.exchange.importer.ICamelVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;

public abstract class MmsObjectImporter<T extends MmsObject, V extends MetaDataModel, W extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject, Z extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> extends CamelElementImporter<T,V,W,Z> {

    public MmsObjectImporter(T elt) {
        super(elt);
    }

    @Override
    public Object accept(ICamelVisitor v) {
        return v.visitMmsObject(this);
    }

    @Override
    abstract public CamelElement createCamelElt(V owner);

    @Override
    public void setProperties(W elt) {
        elt.setId(this._element.getId());
        elt.setUri(this._element.getUri());
        elt.setName(this._element.getName());
        elt.setDescription(this._element.getDescription());

    }

    @Override
    public void attach(W elt, Z context) {
       if (elt instanceof MmsConcept) {
           context.getConcept().add((MmsConcept)elt);
       }else if (elt instanceof MmsConceptInstance) {
           context.getConceptInstance().add((MmsConceptInstance)elt);
       }
    }

}
