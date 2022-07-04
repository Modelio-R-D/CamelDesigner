package fr.softeam.cameldesigner.exchange.importer;

import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.Model;
import camel.core.NamedElement;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsConceptInstance;
import camel.mms.MmsObject;
import camel.mms.MmsProperty;
import camel.mms.MmsPropertyInstance;
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
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsObjectImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsPropertyImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsPropertyInstanceImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("40dfef3a-d77a-41ba-9c83-39058a242b09")
public interface ICamelImporterVisitor {
    @objid ("6e9ef6c3-3630-4d6a-aae8-7bcf35a1f63d")
    Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature);

    @objid ("61ac27e7-298d-4e74-aec8-bfade56f0124")
    Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelElt);

    @objid ("0f5c93cf-a438-452b-b6c7-cb9dae88213c")
    Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel);

    @objid ("59147e43-ac65-47c2-9df8-6d8805845b36")
    Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel);

    @objid ("b75bc1a4-1898-403e-a81e-96d631631865")
    Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept);

    @objid ("f46ebae5-307e-430b-9155-49ae56a79256")
    Object visitMmsObject(MmsObjectImporter<? extends MmsObject,? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject> model);

    @objid ("2269adb3-46e6-49db-9caf-a9af09b65e0b")
    Object visitModel(SubModelImporter<? extends Model,? extends SubModel> model);

    @objid ("574d70c1-bbda-487a-9786-0f722d3a62c6")
    Object visitNamedElement(NamedElementImporter<? extends NamedElement,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement);

    @objid ("a7aeb6ca-c5fe-4900-b8c6-c5b73e1fdf6e")
    Object visitMmsConceptInstance(MmsConceptInstanceImporter<? extends MmsConceptInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance> mmsConceptInstanceImporter);

    @objid ("3d147d2c-c0c4-4012-9e98-086b6c115dc5")
    Object visitMmsProperty(MmsPropertyImporter<? extends MmsProperty,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty> mmsPropertyImporter);

    @objid ("3e014f73-5949-416d-9248-922972dd0dba")
    Object visitMmsPropertyInstance(MmsPropertyInstanceImporter<? extends MmsPropertyInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance> mmsPropertyInstanceImporter);

}
