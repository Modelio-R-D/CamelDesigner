package fr.softeam.cameldesigner.exchange.importer;

import org.eclipse.emf.cdo.CDOObject;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.Model;
import camel.core.NamedElement;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsObjectImporter;

public interface ICamelVisitor {


    Object visitFeature(FeatureImporter<? extends Feature, ? extends Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature);

    Object visitCamelElement(CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> camelElt);

    Object visitCamelModel(CamelModelImporter<? extends CamelModel, ? extends Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> camelModel);

    Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel, ? extends CamelModel, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel, ? extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> metaDataModel);

    Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept, ? extends MetaDataModel, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> mmsConcept);

    Object visitMmsObject(MmsObjectImporter<? extends MmsObject, ? extends MetaDataModel, ? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> model);

    Object visitModel(SubModelImporter<? extends Model, ? extends Feature, ? extends CamelElement, ? extends CamelElement> model);

    Object visitNamedElement(NamedElementImporter<? extends NamedElement, ? extends Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement);



}
