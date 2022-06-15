package fr.softeam.cameldesigner.exchange.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("63498b40-f2f0-4924-a856-cf2209bafd01")
public class CamelContainment {
    @objid ("e284ef3b-02da-4cdd-b3c2-b346d83d54a7")
    private static CamelContainerVisitor _containmentVisitor = new CamelContainerVisitor();

    @objid ("1609744f-bf9d-42e0-b9c1-aecaac7b6ed8")
    public static final Object getChilds(final CamelElementImporter<? extends CDOObject,? extends CDOObject,? extends CamelElement,? extends CamelElement> e) {
        return e.accept(_containmentVisitor);
    }

    @objid ("da0bb1cb-1d34-4092-9915-c67b99b5656c")
    private static class CamelContainerVisitor implements IDefaultCamelVisitor {
        @objid ("ad92355c-1062-4a06-8a79-46b067534fa2")
        @Override
        public Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CDOObject,? extends CamelElement,? extends CamelElement> camelModel) {
            return new ArrayList<CDOObject>();
        }

        @objid ("76f04c91-fb4a-489f-89bb-3c14511d5695")
        @Override
        public Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> camelModel) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitModel(camelModel));
            CamelModel cdoElt = camelModel.getElement();
            childs.addAll(cdoElt.getActions());
            //            childs.addAll(cdoElt.getApplication());
            childs.addAll(cdoElt.getConstraintModels());
            childs.addAll(cdoElt.getDataModels());
            childs.addAll(cdoElt.getDeploymentModels());
            childs.addAll(cdoElt.getExecutionModels());
            childs.addAll(cdoElt.getLocationModels());
            childs.addAll(cdoElt.getMetadataModels());
            childs.addAll(cdoElt.getMetricModels());
            childs.addAll(cdoElt.getOrganisationModels());
            childs.addAll(cdoElt.getRequirementModels());
            childs.addAll(cdoElt.getScalabilityModels());
            childs.addAll(cdoElt.getSecurityModels());
            childs.addAll(cdoElt.getTypeModels());
            childs.addAll(cdoElt.getUnitModels());
            return childs;
        }

        @objid ("b861a675-2625-4530-a7b4-81604c36284c")
        @Override
        public Object visitFeature(FeatureImporter<? extends Feature,? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitNamedElement(feature));
            Feature cdoElt = feature.getElement();
            childs.addAll(cdoElt.getAttributes());
            childs.addAll(cdoElt.getSubFeatures());
            return childs;
        }

        @objid ("d1cc11ff-9655-4589-9bca-619af86a2eb2")
        @Override
        public Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> mmsConcept) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitMmsObject(mmsConcept));
            MmsConcept cdoElt = mmsConcept.getElement();
            childs.addAll(cdoElt.getConcept());
            childs.addAll(cdoElt.getProperty());
            return childs;
        }

        @objid ("f80d57ab-c9df-4d60-b588-80029b05f48c")
        @Override
        public Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends CamelModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel,? extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> metaDataModel) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitModel(metaDataModel));
            MetaDataModel cdoElt = metaDataModel.getElement();
            childs.addAll(cdoElt.getMetadataElements());
            return childs;
        }

    }

}
