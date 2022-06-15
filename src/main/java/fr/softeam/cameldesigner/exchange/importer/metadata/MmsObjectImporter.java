package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MetaDataModel;
import camel.mms.MmsObject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;

@objid ("9d7ecbbd-376f-4a71-b826-0da2cd623e1d")
public abstract class MmsObjectImporter<T extends MmsObject, V extends MetaDataModel, W extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject, Z extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> extends CamelElementImporter<T,V,W,Z> {
    @objid ("32c25f85-bc20-401f-815f-a2f9f1f723d1")
    public MmsObjectImporter() {
    }

    @objid ("140c96f9-c433-40bc-999a-bf1146366e65")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMmsObject(this);
    }

    @objid ("74286bf3-f767-4b23-9725-f7c02459320c")
    @Override
    public abstract CamelElement createCamelElt(V owner);

    @objid ("f977872f-84b1-4329-8358-d58336fe03fd")
    @Override
    public void setProperties(W elt) {
        elt.setId(this._element.getId());
        elt.setUri(this._element.getUri());
        elt.setName(this._element.getName());
        elt.setDescription(this._element.getDescription());
    }

    @objid ("da1b14e1-929b-4098-8d82-a5dd8568a00d")
    @Override
    public void attach(W elt, Z context) {
        if (elt instanceof MmsConcept) {
            context.getConcept().add((MmsConcept)elt);
        }else if (elt instanceof MmsConceptInstance) {
            context.getConceptInstance().add((MmsConceptInstance)elt);
        }
    }

    @objid ("d2b35d4b-9f8d-4ece-a1c3-76d9495a30be")
    public MmsObjectImporter(T elt) {
        super(elt);
    }

}
