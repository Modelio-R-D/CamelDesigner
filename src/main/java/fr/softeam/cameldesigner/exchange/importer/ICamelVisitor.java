package fr.softeam.cameldesigner.exchange.importer;

import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.Model;
import camel.core.NamedElement;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.cdo.CDOObject;

@objid ("a8b19413-363c-45c2-b062-781347a5179f")
public interface ICamelVisitor {
    @objid ("47b2b7ac-40ff-403f-a428-5d50daef663b")
    Object visitFeature(Feature feature);

    @objid ("f62b36a3-8219-495d-b0a2-c7d5fa08ff18")
    Object visitCamelModel(CamelModel camelModel);

    @objid ("8d04ac43-9de3-4004-97ae-bbaadb48aa8b")
    Object visitMetaDataModel(MetaDataModel metaDataModel);

    @objid ("fe6417ad-2239-40c2-b19a-a787367e2b55")
    Object visitMmsConcept(MmsConcept mmsConcept);

    @objid ("78535d51-26aa-44b0-b3d9-bb6a0ebf53f0")
    Object visitMmsObject(MmsObject mmsObject);

    @objid ("43faa31c-f7cd-4f1f-8a0c-7829130cf68c")
    Object visitModel(Model model);

    @objid ("206112f4-6089-4bfc-ab1d-03f9b3f57f84")
    Object visitNamedElement(NamedElement namedElement);

    @objid ("84bb23e0-7ca5-4e7d-823b-a5e28d32efa6")
    Object visitCDOObject(CDOObject object);

}
