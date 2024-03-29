package fr.softeam.cameldesigner.exchange.importer.metadata;

import camel.mms.MmsConcept;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.ICamelImporterVisitor;
import org.eclipse.emf.cdo.CDOObject;

@objid ("8e6da850-4801-4580-80f0-ea03bdaa333d")
public class MmsConceptImporter<T extends MmsConcept, V extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> extends MmsObjectImporter<T,V> {
    @objid ("9adba51a-3733-4c74-8921-3e053fb47c21")
    public MmsConceptImporter() {
    }

    @objid ("7207c3ca-56dd-4762-946e-dd0f2c09bda4")
    @Override
    public Object accept(ICamelImporterVisitor v) {
        return v.visitMmsConcept(this);
    }

    @objid ("3721bac6-93aa-408d-aca7-e82f195b17f5")
    @Override
    public CamelElement createCamelElt(CDOObject owner) {
        return fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.create();
    }

    @objid ("ba317b91-0a65-411e-a9ca-cbb389c4c465")
    @Override
    public void setProperties(V elt) {
        super.setProperties(elt);
    }

    @objid ("7d92a38d-8828-4e76-a077-00dda90be5b8")
    @Override
    public void attach(V elt, CamelElement context) {
        if (context instanceof fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept) {
            fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept owner = (fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept) context;
            owner.addConcept(elt);
        } 
        else if (context instanceof fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel) {
            fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel owner = (fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel) context;
            owner.addConcept(elt);
        }
        else{
            super.attach(elt, context);
        }
    }

    @objid ("c6cb1e37-8b72-4f9c-b6f3-3d291ae521f3")
    public MmsConceptImporter(T elt) {
        super(elt);
    }

}
