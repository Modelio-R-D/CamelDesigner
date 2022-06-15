package fr.softeam.cameldesigner.exchange.importer;

import org.eclipse.emf.cdo.CDOObject;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.Model;
import camel.core.NamedElement;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;

public interface ICamelVisitor {


    Object visitFeature(Feature feature);

    Object visitCDOObject(CDOObject object);

    Object visitCamelModel(CamelModel camelModel);

    Object visitMetaDataModel(MetaDataModel metaDataModel);

    Object visitMmsConcept(MmsConcept mmsConcept);

    Object visitMmsObject(MmsObject mmsObject);

    Object visitModel(Model model);

    Object visitNamedElement(NamedElement namedElement);



}
