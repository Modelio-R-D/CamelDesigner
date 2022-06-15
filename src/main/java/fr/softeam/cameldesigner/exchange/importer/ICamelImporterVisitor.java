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
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsObjectImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("40dfef3a-d77a-41ba-9c83-39058a242b09")
public interface ICamelImporterVisitor {
    @objid ("6e9ef6c3-3630-4d6a-aae8-7bcf35a1f63d")
    Object visitFeature(FeatureImporter<? extends Feature,? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature);

    @objid ("61ac27e7-298d-4e74-aec8-bfade56f0124")
    Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CDOObject,? extends CamelElement,? extends CamelElement> camelElt);

    @objid ("0f5c93cf-a438-452b-b6c7-cb9dae88213c")
    Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> camelModel);

    @objid ("59147e43-ac65-47c2-9df8-6d8805845b36")
    Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends CamelModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel,? extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> metaDataModel);

    @objid ("b75bc1a4-1898-403e-a81e-96d631631865")
    Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> mmsConcept);

    @objid ("f46ebae5-307e-430b-9155-49ae56a79256")
    Object visitMmsObject(MmsObjectImporter<? extends MmsObject,? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> model);

    @objid ("2269adb3-46e6-49db-9caf-a9af09b65e0b")
    Object visitModel(SubModelImporter<? extends Model,? extends Feature,? extends CamelElement,? extends CamelElement> model);

    @objid ("574d70c1-bbda-487a-9786-0f722d3a62c6")
    Object visitNamedElement(NamedElementImporter<? extends NamedElement,? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement);

}
