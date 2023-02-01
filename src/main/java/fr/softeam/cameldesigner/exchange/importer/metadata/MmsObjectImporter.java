package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MmsObject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("9d7ecbbd-376f-4a71-b826-0da2cd623e1d")
public abstract class MmsObjectImporter<T extends MmsObject, V extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject> extends CamelElementImporter<T,V> {
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
    public abstract CamelElement createCamelElt(CDOObject owner);

    @objid ("f977872f-84b1-4329-8358-d58336fe03fd")
    @Override
    public void setProperties(V elt) {
        setName(elt);
        setDescription(elt);
        setURI(elt);
        setId(elt);
        setImplemented(elt);
    }

    @objid ("da1b14e1-929b-4098-8d82-a5dd8568a00d")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof MetaDataModel) {
            if (elt instanceof MmsConcept) {
                ((MetaDataModel) context).addConcept((MmsConcept) elt);
        
            }else if (elt instanceof MmsConceptInstance) {
                ((MetaDataModel) context).addConceptInstance((MmsConceptInstance)elt);
            }
        
        }
    }

    @objid ("d2b35d4b-9f8d-4ece-a1c3-76d9495a30be")
    public MmsObjectImporter(T elt) {
        super(elt);
    }

    @objid ("85dda070-79e1-49e9-a886-b6eb1e86dce6")
    private void setName(V elt) {
        String value = this._element.getName();
        if (value != null) {
            elt.setName(value);
        }
    }

    @objid ("485d63a8-f9c4-459b-b240-6c17081f67d1")
    private void setId(V elt) {
        String value = this._element.getId();
        if (value != null) {
            elt.setId(value);
        }
    }

    @objid ("5478dd10-6753-4e9f-9967-220eb5e516d8")
    private void setURI(V elt) {
        String value = this._element.getUri();
        if (value != null) {
            elt.setUri(value);
        }
    }

    @objid ("a5e2c051-0ca8-4a7c-b89a-4aa09cb85f22")
    private void setDescription(V elt) {
        String value = this._element.getDescription();
        if (value != null) {
            elt.setDescription(value);
            
        }
    }

    @objid ("c06d51cf-0a02-4adf-a271-81b5f0da4c2c")
    private void setImplemented(V elt) {
        String value = ""; // this._element.;
        if (value != null) {
            elt.setImplemented(Boolean.valueOf(value));
            
        }
    }

}
