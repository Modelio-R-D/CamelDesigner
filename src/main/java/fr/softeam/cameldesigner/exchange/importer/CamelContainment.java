package fr.softeam.cameldesigner.exchange.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import camel.constraint.IfThenConstraint;
import camel.core.Attribute;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.data.Data;
import camel.data.DataInstance;
import camel.data.DataInstanceModel;
import camel.data.DataTypeModel;
import camel.deployment.ClusterConfiguration;
import camel.deployment.Communication;
import camel.deployment.Component;
import camel.deployment.Container;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.EventConfiguration;
import camel.deployment.Hosting;
import camel.deployment.ServerlessConfiguration;
import camel.deployment.SoftwareComponent;
import camel.deployment.VM;
import camel.execution.Cause;
import camel.execution.ExecutionModel;
import camel.execution.HistoryRecord;
import camel.location.CloudLocation;
import camel.location.LocationModel;
import camel.metric.MetricInstanceModel;
import camel.metric.MetricTypeModel;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsConceptInstance;
import camel.organisation.DataResourceFilter;
import camel.organisation.Organisation;
import camel.organisation.OrganisationModel;
import camel.organisation.User;
import camel.requirement.RequirementModel;
import camel.requirement.ResourceRequirement;
import camel.scalability.ScalabilityModel;
import camel.security.SecurityModel;
import camel.type.TypeModel;
import camel.unit.UnitModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.exchange.importer.constraint.IfThenConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.core.AttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataInstanceModelImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ClusterConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.CommunicationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ContainerImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.DeploymentTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.EventConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.HostingImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ServerlessConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.VMImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.CauseImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.ExecutionModelImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.HistoryRecordImporter;
import fr.softeam.cameldesigner.exchange.importer.location.CloudLocationImporter;
import fr.softeam.cameldesigner.exchange.importer.location.LocationModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricInstanceModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.DataResourceFilterImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.OrganisationImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.OrganisationModelImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.UserImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.RequirementModelImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ResourceRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.ScalabilityModelImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecurityModelImporter;
import fr.softeam.cameldesigner.exchange.importer.type.TypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("63498b40-f2f0-4924-a856-cf2209bafd01")
public class CamelContainment {
    @objid ("e284ef3b-02da-4cdd-b3c2-b346d83d54a7")
    private static CamelContainerVisitor _containmentVisitor = new CamelContainerVisitor();

    @objid ("1609744f-bf9d-42e0-b9c1-aecaac7b6ed8")
    public static final Object getChilds(final CamelElementImporter<? extends CDOObject,? extends CamelElement> e) {
        return e.accept(_containmentVisitor);
    }

    @objid ("da0bb1cb-1d34-4092-9915-c67b99b5656c")
    private static class CamelContainerVisitor extends DefaultCamelVisitor {
        @objid ("ad92355c-1062-4a06-8a79-46b067534fa2")
        @Override
        public Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelModel) {
            return new ArrayList<CDOObject>();
        }

        @objid ("76f04c91-fb4a-489f-89bb-3c14511d5695")
        @Override
        public Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitCamelModel(camelModel));
            
            CamelModel cdoElt = camelModel.getElement();
            childs.addAll(cdoElt.getActions());
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
        public Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitFeature(feature));
            
            Feature cdoElt = feature.getElement();
            childs.addAll(cdoElt.getAttributes());
            childs.addAll(cdoElt.getSubFeatures());
            return childs;
        }

        @objid ("d1cc11ff-9655-4589-9bca-619af86a2eb2")
        @SuppressWarnings ("unchecked")
        @Override
        public Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept) {
            List<CDOObject> childs = new ArrayList<>();
            if (super.visitMmsConcept(mmsConcept) !=null)
            childs.addAll((List<? extends CDOObject>) super.visitMmsConcept(mmsConcept));
            
            MmsConcept cdoElt = mmsConcept.getElement();
            childs.addAll(cdoElt.getConcept());
            childs.addAll(cdoElt.getInstance());
            childs.addAll(cdoElt.getProperty());
            return childs;
        }

        @objid ("f80d57ab-c9df-4d60-b588-80029b05f48c")
        @SuppressWarnings ("unchecked")
        @Override
        public Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<? extends CDOObject>) super.visitMetaDataModel(metaDataModel));
            
            MetaDataModel cdoElt = metaDataModel.getElement();
            childs.addAll(cdoElt.getMetadataElements());
            return childs;
        }

        @objid ("086aaca3-634e-446d-aa8f-b4487708c18e")
        @SuppressWarnings ("unchecked")
        @Override
        public Object visitMmsConceptInstance(MmsConceptInstanceImporter<? extends MmsConceptInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance> mmsConceptInstanceImporter) {
            List<CDOObject> childs = new ArrayList<>();
            if(super.visitMmsConceptInstance(mmsConceptInstanceImporter)!=null)
            childs.addAll((List<? extends CDOObject>) super.visitMmsConceptInstance(mmsConceptInstanceImporter));
            
            MmsConceptInstance cdoElt = mmsConceptInstanceImporter.getElement();
            childs.addAll(cdoElt.getPropertyInstance());
            return childs;
        }

        @objid ("7f8027c5-6acb-4903-aa0a-c5a45d2c97b4")
        @Override
        public Object visitSoftwareComponent(SoftwareComponentImporter<? extends SoftwareComponent,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> softwareComponentImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<? extends CDOObject>) super.visitSoftwareComponent(softwareComponentImporter));
            
            SoftwareComponent cdoElt = softwareComponentImporter.getElement();
            childs.addAll(cdoElt.getRequiredCommunications());
            if (cdoElt.getRequiredHost()!= null)
                childs.add(cdoElt.getRequiredHost());
            if (cdoElt.getProvidedCommunications()!= null)
                childs.addAll(cdoElt.getProvidedCommunications());
            if (cdoElt.getProvidedHosts()!= null)
                childs.addAll(cdoElt.getProvidedHosts());
            childs.addAll(cdoElt.getConfigurations());
            return childs;
        }

        @objid ("ad44e588-63c9-43e4-9e0e-c698013dc33b")
        @Override
        public Object visitMetricInstanceModell(MetricInstanceModelImporter<? extends MetricInstanceModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel> metricInstanceModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<? extends CDOObject>) super.visitFeature(metricInstanceModelImporter));
            
            MetricInstanceModel cdoElt = metricInstanceModelImporter.getElement();
            childs.addAll(cdoElt.getMetricInstances());
            childs.addAll(cdoElt.getBindings());
            return childs;
        }

        @objid ("8677607a-0e79-44e8-aa3e-93d87e1393c5")
        @Override
        public Object visitMetricTypeModel(MetricTypeModelImporter<? extends MetricTypeModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel> metricTypeModelImporter) {
            //Initialise and call super
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<CDOObject>) super.visitMetricTypeModel(metricTypeModelImporter));
            
            //Adds MetricTypeModel childs
            MetricTypeModel cdoElt = metricTypeModelImporter.getElement();
            childs.addAll(cdoElt.getMetricContexts());
            childs.addAll(cdoElt.getAttributeContexts());
            childs.addAll(cdoElt.getObjectContexts());
            childs.addAll(cdoElt.getMetrics());
            childs.addAll(cdoElt.getWindows());
            childs.addAll(cdoElt.getSchedules());
            childs.addAll(cdoElt.getSensors());
            childs.addAll(cdoElt.getFunctions());
            childs.addAll(cdoElt.getTemplates());
            return childs;
        }

        @objid ("74c36b53-f93c-4416-9ce9-a2d2b8125f42")
        @Override
        public Object visitIfThenConstraint(IfThenConstraintImporter<? extends IfThenConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint> ifThenConstraintImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<CDOObject>) super.visitIfThenConstraint(ifThenConstraintImporter));
            
            IfThenConstraint cdoElt = ifThenConstraintImporter.getElement();
            childs.add(cdoElt.getIf());
            childs.add(cdoElt.getThen());
            childs.add(cdoElt.getElse());
            return childs;
        }

        @objid ("dd37ba10-bf5c-43de-8910-74bfbbeebf23")
        @Override
        public Object visitClusterConfiguration(ClusterConfigurationImporter<? extends ClusterConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> clusterConfigurationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<CDOObject>) super.visitClusterConfiguration(clusterConfigurationImporter));
            
            ClusterConfiguration cdoElt = clusterConfigurationImporter.getElement();
            childs.addAll(cdoElt.getConfigParameters());
            return childs;
        }

        @objid ("1f5d48e2-8b60-436d-bfed-3340268ee935")
        @Override
        public Object visitCommunication(CommunicationImporter<? extends Communication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> communicationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<CDOObject>) super.visitCommunication(communicationImporter));
            
            Communication cdoElt = communicationImporter.getElement();
<<<<<<< HEAD
            //childs.add(cdoElt.getProvidedPortConfiguration());
            //childs.add(cdoElt.getRequiredPortConfiguration());
=======
            childs.add(cdoElt.getProvidedPortConfiguration());
            childs.add(cdoElt.getRequiredPortConfiguration());
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
            return childs;
        }

        @objid ("45276b2d-d379-48a5-9604-e5ddf5f3f404")
        @Override
        public Object visitContainer(ContainerImporter<? extends Container,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> containerImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<CDOObject>) super.visitContainer(containerImporter));
            
            Container cdoElt = containerImporter.getElement();
            childs.addAll(cdoElt.getRequiredCommunications());
            childs.add(cdoElt.getRequiredHost());
            return childs;
        }

        @objid ("155a41e9-0b7c-4482-aee0-883101eb47df")
        @Override
        public Object visitDeploymentTypeModel(DeploymentTypeModelImporter<? extends DeploymentTypeModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> deploymentTypeModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitDeploymentTypeModel(deploymentTypeModelImporter));
            
            DeploymentTypeModel cdoElt = deploymentTypeModelImporter.getElement();
            childs.addAll(cdoElt.getSoftwareComponents());
            childs.addAll(cdoElt.getVms());
            childs.addAll(cdoElt.getPaases());
            childs.addAll(cdoElt.getCommunications());
            childs.addAll(cdoElt.getHostings());
            childs.addAll(cdoElt.getRequirementSets());
            childs.addAll(cdoElt.getLocationCouplings());
            childs.addAll(cdoElt.getContainers());
            return childs;
        }

        @objid ("c0ab5372-925b-4463-b083-af7e60d55e86")
        @Override
        public Object visitEventConfiguration(EventConfigurationImporter<? extends EventConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration> eventConfigurationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitEventConfiguration(eventConfigurationImporter));
            
            EventConfiguration cdoElt = eventConfigurationImporter.getElement();
            childs.add(cdoElt.getScheduledExecutionConfig());
            return childs;
        }

        @objid ("1c4bcb3f-2884-4ddd-9c64-a24078d192d9")
        @Override
        public Object visitHosting(HostingImporter<? extends Hosting,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> hostingImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitHosting(hostingImporter));
            
            Hosting cdoElt = hostingImporter.getElement();
            childs.add(cdoElt.getProvidedHostConfiguration());
            childs.addAll(cdoElt.getRequiredHostsConfiguration());
            return childs;
        }

        @objid ("24682eff-dc92-456e-990e-50019845bbc2")
        @Override
        public Object visitServelessConfiguration(ServerlessConfigurationImporter<? extends ServerlessConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> serverlessConfigurationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitServelessConfiguration(serverlessConfigurationImporter));
            
            ServerlessConfiguration cdoElt = serverlessConfigurationImporter.getElement();
            childs.addAll(cdoElt.getEnvironmentConfigParams());
            childs.add(cdoElt.getBuildConfiguration());
            childs.add(cdoElt.getEventConfiguration());
            return childs;
        }

        @objid ("51e3b824-0b33-431b-b152-edbbb998e4b5")
        @Override
        public Object visitVM(VMImporter<? extends VM,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> vmImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitVM(vmImporter));
            
            VM cdoElt = vmImporter.getElement();
            childs.addAll(cdoElt.getProvidedCommunications());
            childs.addAll(cdoElt.getProvidedHosts());
            childs.addAll(cdoElt.getConfigurations());
            return childs;
        }

        @objid ("33b18893-7426-460e-9080-cfd42ac4b3a8")
        @Override
        public Object visitRequirementModel(RequirementModelImporter<? extends RequirementModel,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel> requirementModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitRequirementModel(requirementModelImporter));
            
            RequirementModel cdoElt = requirementModelImporter.getElement();
            childs.addAll(cdoElt.getRequirements());
            return childs;
        }

        @objid ("0bc47d1c-ee02-4b85-a0bb-a4877d0ec82d")
        @Override
        public Object visitResourceRequirement(ResourceRequirementImporter<? extends ResourceRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement> resourceRequirementImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitResourceRequirement(resourceRequirementImporter));
            
            ResourceRequirement cdoElt = resourceRequirementImporter.getElement();
            childs.addAll(cdoElt.getSubFeatures());
            childs.addAll(cdoElt.getAttributes());
            return childs;
        }

        @objid ("b3f83a7f-d623-4054-bf5c-033488ef3f55")
        @Override
        public Object visitCause(CauseImporter<? extends Cause,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause> causeImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitCause(causeImporter));
            
            Cause cdoElt = causeImporter.getElement();
            childs.addAll(cdoElt.getEventInstances());
            return childs;
        }

        @objid ("1d7516a5-4d1f-41ca-a464-683514475939")
        @Override
        public Object visitExecutionModel(ExecutionModelImporter<? extends ExecutionModel,? extends fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel> executionModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitExecutionModel(executionModelImporter));
            
            ExecutionModel cdoElt = executionModelImporter.getElement();
            childs.addAll(cdoElt.getMeasurements());
            childs.addAll(cdoElt.getSloViolations());
            childs.addAll(cdoElt.getHistoryRecords());
            return childs;
        }

        @objid ("bd88c197-87c2-4543-bd09-4bb1a00444fa")
        @Override
        public Object visitHistoryRecord(HistoryRecordImporter<? extends HistoryRecord,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord> historyRecordImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitHistoryRecord(historyRecordImporter));
            
            HistoryRecord cdoElt = historyRecordImporter.getElement();
            childs.add(cdoElt.getCause());
            childs.addAll(cdoElt.getInfos());
            return childs;
        }

        @objid ("fb2562e3-76ac-4630-98a0-d72f776dd0e4")
        @Override
        public Object visitCloudLocation(CloudLocationImporter<? extends CloudLocation,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation> cloudLocationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitCloudLocation(cloudLocationImporter));
            
            CloudLocation cdoElt = cloudLocationImporter.getElement();
            childs.addAll(cdoElt.getSubLocations());
            return childs;
        }

        @objid ("118067e5-b6d8-4140-a9ba-5eaebf9ac9c5")
        @Override
        public Object visitLocationModel(LocationModelImporter<? extends LocationModel,? extends fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel> locationModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitLocationModel(locationModelImporter));
            
            LocationModel cdoElt = locationModelImporter.getElement();
            childs.addAll(cdoElt.getCloudLocations());
            childs.addAll(cdoElt.getRegions());
            return childs;
        }

        @objid ("d1ea27c3-a253-4cb2-8e3d-25fb04b2bc82")
        @Override
        public Object visitData(DataImporter<? extends Data,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.Data> dataImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitData(dataImporter));
            
            Data cdoElt = dataImporter.getElement();
            childs.addAll(cdoElt.getIncludesData());
            return childs;
        }

        @objid ("bd962597-f6e2-4b57-98fb-24ee8e74cf0a")
        @Override
        public Object visitDataInstance(DataInstanceImporter<? extends DataInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance> dataInstanceImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitDataInstance(dataInstanceImporter));
            
            DataInstance cdoElt = dataInstanceImporter.getElement();
            childs.addAll(cdoElt.getIncludesDataInstance());
            return childs;
        }

        @objid ("d4a19f91-ff80-4aac-b21c-d2a3793f30b7")
        @Override
        public Object visitDataInstanceModel(DataInstanceModelImporter<? extends DataInstanceModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel> dataInstanceModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitDataInstanceModel(dataInstanceModelImporter));
            
            DataInstanceModel cdoElt = dataInstanceModelImporter.getElement();
            childs.addAll(cdoElt.getDataInstances());
            childs.addAll(cdoElt.getDataSourceInstances());
            return childs;
        }

        @objid ("ac337190-2f94-48a1-b0fa-b185554f9dff")
        @Override
        public Object visitDataTypeModel(DataTypeModelImporter<? extends DataTypeModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel> dataTypeModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitDataTypeModel(dataTypeModelImporter));
            
            DataTypeModel cdoElt = dataTypeModelImporter.getElement();
            childs.addAll(cdoElt.getData());
            childs.addAll(cdoElt.getDataSources());
            return childs;
        }

        @objid ("772c42ab-76a0-47be-9af2-cebdb273301a")
        @Override
        public Object visitScalabilityModel(ScalabilityModelImporter<? extends ScalabilityModel,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel> scalabilityModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitScalabilityModel(scalabilityModelImporter));
            
            ScalabilityModel cdoElt = scalabilityModelImporter.getElement();
            childs.addAll(cdoElt.getRules());
            childs.addAll(cdoElt.getEvents());
            childs.addAll(cdoElt.getEventInstances());
            childs.addAll(cdoElt.getActions());
            childs.addAll(cdoElt.getPatterns());
            childs.addAll(cdoElt.getTimers());
            return childs;
        }

        @objid ("9c8a3aef-6210-4e0d-a17c-d18febafe1a2")
        @Override
        public Object visitAttribute(AttributeImporter<? extends Attribute,? extends CamelAttribute> attributeImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitAttribute(attributeImporter));
            
            Attribute cdoElt = attributeImporter.getElement();
            //childs.add(cdoElt.getValue());
            return childs;
        }

        @objid ("94ccbf6e-2809-48fe-8455-159a7b9e229d")
        @Override
        public Object visitSecurityModel(SecurityModelImporter<? extends SecurityModel,? extends fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel> securityModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitSecurityModel(securityModelImporter));
            
            SecurityModel cdoElt = securityModelImporter.getElement();
            childs.addAll(cdoElt.getSecurityControls());
            childs.addAll(cdoElt.getSecurityRequirements());
            childs.addAll(cdoElt.getSecurityAttributes());
            childs.addAll(cdoElt.getRawSecurityMetrics());
            childs.addAll(cdoElt.getCompositeSecurityMetrics());
            childs.addAll(cdoElt.getSecurityMetricInstances());
            childs.addAll(cdoElt.getSecurityDomains());
            childs.addAll(cdoElt.getSecuritySLOs());
            return childs;
        }

        @objid ("340f1764-211d-465b-9a44-568813ed6d22")
        @Override
        public Object visitDataResourceFilter(DataResourceFilterImporter<? extends DataResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> dataResourceFilterImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitDataResourceFilter(dataResourceFilterImporter));
            
            DataResourceFilter cdoElt = dataResourceFilterImporter.getElement();
            childs.addAll(cdoElt.getData());
            childs.addAll(cdoElt.getDataInstances());
            childs.addAll(cdoElt.getLocations());
            return childs;
        }

        @objid ("140ea594-e836-43b1-b502-a21b84b9e025")
        @Override
        public Object visitOrganisation(OrganisationImporter<? extends Organisation,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> organisationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitOrganisation(organisationImporter));
            
            Organisation cdoElt = organisationImporter.getElement();
            childs.addAll(cdoElt.getCloudCredentials());
            return childs;
        }

        @objid ("150761f4-10bc-495c-9466-8c4d08d920e5")
        @Override
        public Object visitOrganisationModel(OrganisationModelImporter<? extends OrganisationModel,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> organisationModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitOrganisationModel(organisationModelImporter));
            
            OrganisationModel cdoElt = organisationModelImporter.getElement();
            childs.add(cdoElt.getOrganisation());
            childs.addAll(cdoElt.getExternalIdentifiers());
            childs.addAll(cdoElt.getUsers());
            childs.addAll(cdoElt.getUserGroups());
            childs.addAll(cdoElt.getRoles());
            childs.addAll(cdoElt.getRoleAssigments());
            childs.addAll(cdoElt.getPermissions());
            childs.addAll(cdoElt.getResourceFilters());
            return childs;
        }

        @objid ("c9f3ff0a-e879-47ba-ad9d-50f09765ea5e")
        @Override
        public Object visitUser(UserImporter<? extends User,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> userImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitUser(userImporter));
            
            User cdoElt = userImporter.getElement();
            childs.addAll(cdoElt.getExternalIdentifiers());
            childs.add(cdoElt.getPlatformCredentials());
            childs.addAll(cdoElt.getRequirementModels());
            childs.addAll(cdoElt.getDeploymentModels());
            childs.addAll(cdoElt.getMetricModels());
            childs.addAll(cdoElt.getScalabilityModels());
            return childs;
        }

        @objid ("1d02f214-abe2-4cec-a295-258edc9183fa")
        @Override
        public Object visitUnitModel(UnitModelImporter<? extends UnitModel,? extends fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel> unitModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitUnitModel(unitModelImporter));
            
            UnitModel cdoElt = unitModelImporter.getElement();
            childs.addAll(cdoElt.getUnits());
            childs.addAll(cdoElt.getDimensions());
            return childs;
        }

        @objid ("a0370165-b929-488d-a646-94e1a35b4b75")
        @Override
        public Object visitCamelComponent(ComponentImporter<? extends Component,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent> camelComponentImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) super.visitCamelComponent(camelComponentImporter));
            
            Component cdoElt = camelComponentImporter.getElement();
            childs.addAll(cdoElt.getProvidedCommunications());
            childs.addAll(cdoElt.getProvidedHosts());
            childs.addAll(cdoElt.getConfigurations());
            return childs;
        }

        @objid ("c9fe852f-914c-468c-bffe-f264606cbb44")
        @Override
        public Object visitTypeModel(TypeModelImporter<? extends TypeModel,? extends fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel> typeModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((List<? extends CDOObject>) super.visitModel(typeModelImporter));
            
            TypeModel cdoElt = typeModelImporter.getElement();
            childs.addAll(cdoElt.getValueTypes());
            return childs;
        }

    }

}
