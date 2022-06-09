package fr.softeam.cameldesigner.exchange.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.emf.cdo.CDOObject;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;


public class CamelContainment{

    private static CamelContainerVisitor _containmentVisitor = new CamelContainerVisitor();

    public final static Object getChilds(final CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> e){
        return e.accept(_containmentVisitor);
    }

    private static class CamelContainerVisitor implements IDefaultCamelVisitor{

        @Override
        public Object visitCamelElement(CamelElementImporter<? extends CDOObject, ? extends CDOObject, ? extends CamelElement, ? extends CamelElement> camelModel) {
            return new ArrayList<CDOObject>();
        }

        @Override
        public Object visitCamelModel(CamelModelImporter<? extends CamelModel, ? extends Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> camelModel){
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


        @Override
        public Object visitFeature(FeatureImporter<? extends Feature, ? extends Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature, ? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitNamedElement(feature));
            Feature cdoElt = feature.getElement();
            childs.addAll(cdoElt.getAttributes());
            childs.addAll(cdoElt.getSubFeatures());
            return childs;
        }

        @Override
        public Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept, ? extends MetaDataModel,  ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> mmsConcept) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitMmsObject(mmsConcept));
            MmsConcept cdoElt = mmsConcept.getElement();
            childs.addAll(cdoElt.getConcept());
            childs.addAll(cdoElt.getProperty());
            return childs;
        }

        @Override
        public Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel, ? extends CamelModel, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel, ? extends fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel> metaDataModel){
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitModel(metaDataModel));
            MetaDataModel cdoElt = metaDataModel.getElement();
            childs.addAll(cdoElt.getMetadataElements());
            return childs;
        }

    }
}
