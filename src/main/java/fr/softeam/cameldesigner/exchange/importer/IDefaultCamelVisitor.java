package fr.softeam.cameldesigner.exchange.importer;

import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.Model;
import camel.core.NamedElement;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsObjectImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("95d27772-cd96-4ee0-9c20-5c6b05231e69")
public interface IDefaultCamelVisitor extends ICamelImporterVisitor {
    @objid ("d8679bed-cac7-448a-a256-4116c2c3fca0")
    @Override
    default Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
        return visitNamedElement(feature);
    }

    @objid ("413623cd-f194-47d4-b365-88cf49900c0b")
    @Override
    default Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelElt) {
        return null;
    }

    @objid ("c4ae23ff-147f-45b2-8152-4eaace3f3df2")
    @Override
    default Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel) {
        return visitModel(camelModel);
    }

    @objid ("87331245-7ea6-4eff-9417-7fa2cefc4a8b")
    @Override
    default Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel) {
        return visitModel(metaDataModel);
    }

    @objid ("de3712b3-db3c-45de-bf38-272cd41fed53")
    @Override
    default Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @objid ("0a5d2736-c4a5-493a-9b38-e8450cfd3784")
    @Override
    default Object visitMmsObject(MmsObjectImporter<? extends MmsObject,? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject> model) {
        return null;
    }

    @objid ("f5b2ba18-24d4-4e9a-a4d0-8d2bcd34be4d")
    @Override
    default Object visitModel(SubModelImporter<? extends Model,? extends SubModel> model) {
        return visitNamedElement(model);
    }

    @objid ("132652c3-4893-4c7e-b78f-d7216ea6e485")
    @Override
    default Object visitNamedElement(NamedElementImporter<? extends NamedElement,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement) {
        return visitCamelElement(namedElement);
    }

}
