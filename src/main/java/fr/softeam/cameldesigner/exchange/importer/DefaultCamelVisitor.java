package fr.softeam.cameldesigner.exchange.importer;

import org.eclipse.emf.cdo.CDOObject;
import camel.constraint.AttributeConstraint;
import camel.constraint.CompositeConstraint;
import camel.constraint.Constraint;
import camel.constraint.ConstraintModel;
import camel.constraint.IfThenConstraint;
import camel.constraint.LogicalConstraint;
import camel.constraint.MetricConstraint;
import camel.constraint.MetricVariableConstraint;
import camel.constraint.UnaryConstraint;
import camel.core.Action;
import camel.core.Attribute;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.MeasurableAttribute;
import camel.core.Model;
import camel.core.NamedElement;
import camel.core.QualityAttribute;
import camel.data.Data;
import camel.data.DataInstance;
import camel.data.DataInstanceModel;
import camel.data.DataModel;
import camel.data.DataSource;
import camel.data.DataSourceInstance;
import camel.data.DataTypeModel;
import camel.deployment.BuildConfiguration;
import camel.deployment.ClusterConfiguration;
import camel.deployment.Communication;
import camel.deployment.CommunicationInstance;
import camel.deployment.CommunicationPort;
import camel.deployment.CommunicationPortInstance;
import camel.deployment.Component;
import camel.deployment.ComponentInstance;
import camel.deployment.ComponentRelation;
import camel.deployment.ComponentRelationInstance;
import camel.deployment.Configuration;
import camel.deployment.Container;
import camel.deployment.ContainerInstance;
import camel.deployment.DeploymentInstanceModel;
import camel.deployment.DeploymentModel;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.EventConfiguration;
import camel.deployment.Hosting;
import camel.deployment.HostingInstance;
import camel.deployment.HostingPort;
import camel.deployment.HostingPortInstance;
import camel.deployment.LocationCoupling;
import camel.deployment.PaaS;
import camel.deployment.PaaSConfiguration;
import camel.deployment.PaaSInstance;
import camel.deployment.ProvidedCommunication;
import camel.deployment.ProvidedCommunicationInstance;
import camel.deployment.ProvidedHost;
import camel.deployment.ProvidedHostInstance;
import camel.deployment.RequiredCommunication;
import camel.deployment.RequiredCommunicationInstance;
import camel.deployment.RequiredHost;
import camel.deployment.RequiredHostInstance;
import camel.deployment.RequirementSet;
import camel.deployment.ScriptConfiguration;
import camel.deployment.ServerlessConfiguration;
import camel.deployment.SoftwareComponent;
import camel.deployment.SoftwareComponentInstance;
import camel.deployment.VM;
import camel.deployment.VMInstance;
import camel.execution.ActionInstance;
import camel.execution.ApplicationMeasurement;
import camel.execution.Cause;
import camel.execution.CommunicationMeasurement;
import camel.execution.ContainerMeasurement;
import camel.execution.DataMeasurement;
import camel.execution.ExecutionModel;
import camel.execution.HistoryInfo;
import camel.execution.HistoryRecord;
import camel.execution.Measurement;
import camel.execution.PaaSMeasurement;
import camel.execution.RuleTrigger;
import camel.execution.SLOViolation;
import camel.execution.SoftwareComponentMeasurement;
import camel.execution.VMMeasurement;
import camel.location.CloudLocation;
import camel.location.GeographicalRegion;
import camel.location.Location;
import camel.location.LocationModel;
import camel.metric.AttributeContext;
import camel.metric.CompositeMetric;
import camel.metric.CompositeMetricContext;
import camel.metric.Function;
import camel.metric.Metric;
import camel.metric.MetricContext;
import camel.metric.MetricInstance;
import camel.metric.MetricInstanceModel;
import camel.metric.MetricModel;
import camel.metric.MetricObjectBinding;
import camel.metric.MetricTemplate;
import camel.metric.MetricTypeModel;
import camel.metric.MetricVariable;
import camel.metric.ObjectContext;
import camel.metric.RawMetric;
import camel.metric.RawMetricContext;
import camel.metric.Schedule;
import camel.metric.Sensor;
import camel.metric.Window;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsConceptInstance;
import camel.mms.MmsObject;
import camel.mms.MmsProperty;
import camel.mms.MmsPropertyInstance;
import camel.organisation.CloudCredentials;
import camel.organisation.CloudProvider;
import camel.organisation.Credentials;
import camel.organisation.DataResourceFilter;
import camel.organisation.Entity;
import camel.organisation.ExternalIdentifier;
import camel.organisation.ModelResourceFilter;
import camel.organisation.Organisation;
import camel.organisation.OrganisationModel;
import camel.organisation.Permission;
import camel.organisation.PlatformCredentials;
import camel.organisation.ResourceFilter;
import camel.organisation.Role;
import camel.organisation.RoleAssignment;
import camel.organisation.ServiceResourceFilter;
import camel.organisation.SoftwareComponentResourceFilter;
import camel.organisation.User;
import camel.organisation.UserGroup;
import camel.requirement.HardRequirement;
import camel.requirement.HorizontalScaleRequirement;
import camel.requirement.ImageRequirement;
import camel.requirement.LocationRequirement;
import camel.requirement.OSRequirement;
import camel.requirement.OptimisationRequirement;
import camel.requirement.PaaSRequirement;
import camel.requirement.ProviderRequirement;
import camel.requirement.Requirement;
import camel.requirement.RequirementModel;
import camel.requirement.ResourceRequirement;
import camel.requirement.ScaleRequirement;
import camel.requirement.SecurityRequirement;
import camel.requirement.ServiceLevelObjective;
import camel.requirement.SoftRequirement;
import camel.requirement.VerticalScaleRequirement;
import camel.scalability.BinaryEventPattern;
import camel.scalability.Event;
import camel.scalability.EventInstance;
import camel.scalability.EventPattern;
import camel.scalability.FunctionalEvent;
import camel.scalability.FunctionalEventInstance;
import camel.scalability.HorizontalScalingAction;
import camel.scalability.NonFunctionalEvent;
import camel.scalability.NonFunctionalEventInstance;
import camel.scalability.ScalabilityModel;
import camel.scalability.ScalabilityRule;
import camel.scalability.ScalingAction;
import camel.scalability.SingleEvent;
import camel.scalability.Timer;
import camel.scalability.UnaryEventPattern;
import camel.scalability.VerticalScalingAction;
import camel.security.Certifiable;
import camel.security.CompositeSecurityMetric;
import camel.security.RawSecurityMetric;
import camel.security.SecurityAttribute;
import camel.security.SecurityControl;
import camel.security.SecurityDomain;
import camel.security.SecurityMetricInstance;
import camel.security.SecurityModel;
import camel.security.SecuritySLO;
import camel.unit.CompositeUnit;
import camel.unit.DimensionedUnit;
import camel.unit.Dimensionless;
import camel.unit.SingleUnit;
import camel.unit.Unit;
import camel.unit.UnitDimension;
import camel.unit.UnitModel;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.exchange.importer.constraint.AttributeConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.CamelConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.CompositeConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.ConstraintModelImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.IfThenConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.LogicalConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.MetricConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.MetricVariableConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.UnaryConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.core.ActionImporter;
import fr.softeam.cameldesigner.exchange.importer.core.AttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.core.MeasurableAttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.QualityAttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataInstanceModelImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataSourceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataSourceInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.BuildConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ClusterConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.CommunicationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.CommunicationPortImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ComponentRelationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ContainerImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.DeploymentModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.DeploymentTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.EventConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.HostingImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.HostingPortImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.LocationCouplingImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.PaaSConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.PaaSImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ProvidedCommunicationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ProvidedHostImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.RequiredCommunicationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.RequiredHostImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.RequirementSetImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ScriptConfiguationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ServerlessConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.VMImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.CommunicationInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.CommunicationPortInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.ComponentInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.ComponentRelationInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.ContainerInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.DeploymentInstanceModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.HostingInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.HostingPortInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.PaaSInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.ProvidedCommunicationInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.ProvidedHostInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.RequiredCommunicationInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.RequiredHostInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.SoftwareComponentInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.deploymentinstance.VMInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.ActionInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.ApplicationMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.CauseImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.CommunicationMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.ContainerMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.DataMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.ExecutionModelImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.HistoryInfoImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.HistoryRecordImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.MeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.PaaSMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.RuleTriggerImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.SLOViolationImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.SoftwareComponentMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.execution.VMMeasurementImporter;
import fr.softeam.cameldesigner.exchange.importer.location.CloudLocationImporter;
import fr.softeam.cameldesigner.exchange.importer.location.GeographicalRegionImporter;
import fr.softeam.cameldesigner.exchange.importer.location.LocationImporter;
import fr.softeam.cameldesigner.exchange.importer.location.LocationModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsObjectImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsPropertyImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsPropertyInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.AttributeContextImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.CompositeMetricContextImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.CompositeMetricImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.FunctionImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricContextImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricInstanceModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricObjectBindingImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricTemplateImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.MetricVariableImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.ObjectContextImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.RawMetricContextImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.RawMetricImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.ScheduleImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.SensorImporter;
import fr.softeam.cameldesigner.exchange.importer.metric.WindowImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.CloudCredentialsImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.CloudProviderImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.CredentialsImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.DataResourceFilterImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.EntityImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.ExternalIdentifierImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.ModelResourceFilterImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.OrganisationImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.OrganisationModelImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.PermissionImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.PlatformCredentialsImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.ResourceFilterImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.RoleAssignmentImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.RoleImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.ServiceResourceFilterImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.SoftwareComponentResourceFilterImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.UserGroupImporter;
import fr.softeam.cameldesigner.exchange.importer.organisation.UserImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.HardRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.HorizontalScaleRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ImageRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.LocationRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.OSRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.OptimisationRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.PaaSRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ProviderRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.RequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.RequirementModelImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ResourceRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ScaleRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.SecurityRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ServiceLevelObjectiveImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.SoftRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.VerticalScaleRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.BinaryEventPatternImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.EventImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.EventInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.EventPatternImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.FunctionalEventImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.FunctionalEventInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.HorizontalScalingActionImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.NonFunctionalEventImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.NonFunctionalEventInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.ScalabilityModelImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.ScalabilityRuleImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.ScalingActionImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.SingleEventImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.TimerImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.UnaryEventPatternImporter;
import fr.softeam.cameldesigner.exchange.importer.scalability.VerticalScalingActionImporter;
import fr.softeam.cameldesigner.exchange.importer.security.CertifiableImporter;
import fr.softeam.cameldesigner.exchange.importer.security.CompositeSecurityMetricImporter;
import fr.softeam.cameldesigner.exchange.importer.security.RawSecurityMetricImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecurityAttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecurityControlImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecurityDomainImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecurityMetricInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecurityModelImporter;
import fr.softeam.cameldesigner.exchange.importer.security.SecuritySLOImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.CompositeUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.DimensionedUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.DimensionlessImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.SingleUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitDimensionImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitModelImporter;


public class DefaultCamelVisitor implements ICamelImporterVisitor {

    @Override
    public Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
        return visitNamedElement(feature);
    }


    @Override
    public Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelElt) {
        return null;
    }


    @Override
    public Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel) {
        return visitModel(camelModel);
    }

    @Override
    public Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel) {
        return visitModel(metaDataModel);
    }


    @Override
    public Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @Override
    public Object visitMmsProperty(MmsPropertyImporter<? extends MmsProperty, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @Override
    public Object visitMmsPropertyInstance(MmsPropertyInstanceImporter<? extends MmsPropertyInstance, ? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @Override
    public Object visitMmsConceptInstance(MmsConceptInstanceImporter<? extends MmsConceptInstance ,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @Override
    public Object visitMmsObject(MmsObjectImporter<? extends MmsObject,? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject> model) {
        return null;
    }

    @Override
    public Object visitModel(SubModelImporter<? extends Model,? extends SubModel> model) {
        return visitFeature(model);
    }


    @Override
    public Object visitNamedElement(NamedElementImporter<? extends NamedElement,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement) {
        return visitCamelElement(namedElement);
    }


    @Override
    public Object visitBuildConfiguration(BuildConfigurationImporter<? extends BuildConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration> buildConfiguration) {
        return visitFeature(buildConfiguration);
    }

    @Override
    public Object visitClusterConfiguration(ClusterConfigurationImporter<? extends ClusterConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> clusterConfiguration) {
        return visitConfiguration(clusterConfiguration);
    }


    @Override
    public Object visitCommunication(CommunicationImporter<? extends Communication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> communication) {
        return visitComponentRelation(communication);
    }

    @Override
    public Object visitComponentRelationInstance(ComponentRelationInstanceImporter<? extends ComponentRelationInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance> componentRelationInstance) {
        return visitFeature(componentRelationInstance);
    }


    @Override
    public Object visitCommunicationInstance(CommunicationInstanceImporter<? extends CommunicationInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance> communicationInstance) {
        return visitComponentRelationInstance(communicationInstance);
    }


    @Override
    public Object visitCommunicationPort(CommunicationPortImporter<? extends CommunicationPort, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> communicationPort) {
        return visitFeature(communicationPort);
    }

    @Override
    public Object visitCommunicationPortInstance(CommunicationPortInstanceImporter<? extends CommunicationPortInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> communicationPortInstance) {
        return visitFeature(communicationPortInstance);
    }


    @Override
    public Object visitComponentRelation(ComponentRelationImporter<? extends ComponentRelation, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation> componentRelation) {
        return visitFeature(componentRelation);
    }

    @Override
    public Object visitComponent(ComponentImporter<? extends Component, ? extends CamelComponent> component) {
        return visitFeature(component);
    }

    @Override
    public Object visitComponentInstance(ComponentInstanceImporter<? extends ComponentInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance> componentInstance) {
        return visitFeature(componentInstance);
    }


    @Override
    public Object visitConfiguration(ConfigurationImporter<? extends Configuration, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration> configuration) {
        return visitFeature(configuration);
    }


    @Override
    public Object visitContainer(ContainerImporter<? extends Container, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> container) {
        return visitComponent(container);
    }

    @Override
    public Object visitContainerInstance(ContainerInstanceImporter<? extends ContainerInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance> containerInstance) {
        return visitComponentInstance(containerInstance);
    }


    @Override
    public Object visitDeploymentModel(DeploymentModelImporter<? extends DeploymentModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel> deploymentModel) {
        return visitModel(deploymentModel);
    }

    @Override
    public Object visitDeploymentTypeModel(DeploymentTypeModelImporter<? extends DeploymentTypeModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> deploymentTypeModel) {
        return visitDeploymentModel(deploymentTypeModel);
    }

    @Override
    public Object visitDeploymentInstanceModel(DeploymentInstanceModelImporter<? extends DeploymentInstanceModel,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel> deploymentInstanceModel) {
        return visitDeploymentModel(deploymentInstanceModel);
    }


    @Override
    public Object visitEventConfiguration(EventConfigurationImporter<? extends EventConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration> eventConfiguration) {
        return visitFeature(eventConfiguration);
    }


    @Override
    public Object visitHosting(HostingImporter<? extends Hosting,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> hosting) {
        return visitComponentRelation(hosting);
    }

    @Override
    public Object visitHostingInstance(HostingInstanceImporter<? extends HostingInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance> hostingInstance) {
        return visitComponentRelationInstance(hostingInstance);
    }

    @Override
    public Object visitHostingPort(HostingPortImporter<? extends HostingPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> hostingPort) {
        return visitFeature(hostingPort);
    }

    @Override
    public Object visitHostingPortInstance(HostingPortInstanceImporter<? extends HostingPortInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> hostingPortInstance) {
        return visitFeature(hostingPortInstance);
    }

    @Override
    public Object visitLocationCoupling(LocationCouplingImporter<? extends LocationCoupling,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling> locationCoupling) {
        return visitComponentRelation(locationCoupling);
    }

    @Override
    public Object visitPaaSConfiguration(PaaSConfigurationImporter<? extends PaaSConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration> paaSConfiguration) {
        return visitConfiguration(paaSConfiguration);
    }

    @Override
    public Object visitPaaS(PaaSImporter<? extends PaaS,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS> paaS) {
        return visitComponent(paaS);
    }

    @Override
    public Object visitPaaSInstance(PaaSInstanceImporter<? extends PaaSInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance> paaSInstance) {
        return visitComponentInstance(paaSInstance);
    }

    @Override
    public Object visitRequirementSet(RequirementSetImporter<? extends RequirementSet,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet> requiredSet) {
        return visitFeature(requiredSet);
    }

    @Override
    public Object visitScriptConfiguration(ScriptConfiguationImporter<? extends ScriptConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration> scriptConfiguration) {
        return visitConfiguration(scriptConfiguration);
    }

    @Override
    public Object visitServelessConfiguration(ServerlessConfigurationImporter<? extends ServerlessConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> serverlessConfiguration) {
        return visitConfiguration(serverlessConfiguration);
    }

    @Override
    public Object visitSoftwareComponent(SoftwareComponentImporter<? extends SoftwareComponent,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> softwareComponent) {
        return visitComponent(softwareComponent);
    }

    @Override
    public Object visitSoftwareComponentInstance(SoftwareComponentInstanceImporter<? extends SoftwareComponentInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance> softwareComponentInstance) {
        return visitComponentInstance(softwareComponentInstance);
    }

    @Override
    public Object visitVM(VMImporter<? extends VM,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> vm) {
        return visitComponent(vm);
    }

    @Override
    public Object visitVMInstance(VMInstanceImporter<? extends VMInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance> vmInstance) {
        return visitComponentInstance(vmInstance);
    }

    @Override
    public Object visitCloudCredentials(CloudCredentialsImporter<? extends CloudCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials> cloudCredentials) {
        return visitCredentials(cloudCredentials);
    }


    @Override
    public Object visitCloudProvider(CloudProviderImporter<? extends CloudProvider,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider> cloudProvider) {
        return visitOrganisation(cloudProvider);
    }

    @Override
    public Object visitCredentials(CredentialsImporter<? extends Credentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials> credentials) {
        return visitFeature(credentials);
    }

    @Override
    public Object visitDataResourceFilter(DataResourceFilterImporter<? extends DataResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> dataResourceFilter) {
        return visitResourceFilter(dataResourceFilter);
    }


    @Override
    public Object visitEntity(EntityImporter<? extends Entity,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity> entity) {
        return visitFeature(entity);
    }

    @Override
    public Object visitExternalIdentifier(ExternalIdentifierImporter<? extends ExternalIdentifier,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier> externalIdentifier) {
        return visitFeature(externalIdentifier);
    }

    @Override
    public Object visitModelResourceFilter(ModelResourceFilterImporter<? extends ModelResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter> modelResourceFilter) {
        return visitResourceFilter(modelResourceFilter);
    }

    @Override
    public Object visitOrganisation(OrganisationImporter<? extends Organisation,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> organisation) {
        return visitEntity(organisation);
    }


    @Override
    public Object visitOrganisationModel(OrganisationModelImporter<? extends OrganisationModel,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> organisationModel) {
        return visitModel(organisationModel);
    }


    @Override
    public Object visitPermission(PermissionImporter<? extends Permission,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission> permission) {
        return visitFeature(permission);
    }

    @Override
    public Object visitPlatformCredentials(PlatformCredentialsImporter<? extends PlatformCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials> platformCredentials) {
        return visitCredentials(platformCredentials);
    }

    @Override
    public Object visitResourceFilter(ResourceFilterImporter<? extends ResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter> resourceFilter) {
        return visitFeature(resourceFilter);
    }

    @Override
    public Object visitRoleAssignment(RoleAssignmentImporter<? extends RoleAssignment,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment> roleAssignment) {
        return visitFeature(roleAssignment);
    }

    @Override
    public Object visitRole(RoleImporter<? extends Role,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role> role) {
        return visitFeature(role);
    }

    @Override
    public Object visitServiceResourceFilter(ServiceResourceFilterImporter<? extends ServiceResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter> serviceResourceFilter) {
        return visitResourceFilter(serviceResourceFilter);
    }

    @Override
    public Object visitSoftwareComponentResourceFilter(SoftwareComponentResourceFilterImporter<? extends SoftwareComponentResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter> softwareComponentResourceFilter) {
        return visitResourceFilter(softwareComponentResourceFilter);
    }


    @Override
    public Object visitUserGroup(UserGroupImporter<? extends UserGroup,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup> userGroup) {
        return visitFeature(userGroup);
    }

    @Override
    public Object visitUser(UserImporter<? extends User,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> user) {
        return visitEntity(user);
    }

    @Override
    public Object visitCamelComponent(ComponentImporter<? extends camel.deployment.Component,? extends CamelComponent> camelComponent) {
        return visitCamelElement(camelComponent);
    }


    @Override
    public Object visitAttributeContext(AttributeContextImporter<? extends AttributeContext, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext> attributeContextImporter) {
        return visitFeature(attributeContextImporter);
    }


    @Override
    public Object visitCompositeMetric(CompositeMetricImporter<? extends CompositeMetric, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric> compositeMetricImporter) {
        return visitMetric(compositeMetricImporter);
    }


    @Override
    public Object visitMetric(MetricImporter<? extends Metric, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric> metricImporter) {
        return visitFeature(metricImporter);
    }


    @Override
    public Object visitCompositeMetricContext(CompositeMetricContextImporter<? extends CompositeMetricContext, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext> compositeMetricContextImporter) {
        return visitMetricContext(compositeMetricContextImporter);
    }


    @Override
    public Object visitMetricContext(MetricContextImporter<? extends MetricContext, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext> metricContextImporter) {
        return visitFeature(metricContextImporter);
    }


    @Override
    public Object visitFunction(FunctionImporter<? extends Function, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function> functionImporter) {
        return visitFeature(functionImporter);
    }


    @Override
    public Object visitMetricInstance(MetricInstanceImporter<? extends MetricInstance, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance> metricInstanceImporter) {
        return visitFeature(metricInstanceImporter);
    }


    @Override
    public Object visitMetricInstanceModell(MetricInstanceModelImporter<? extends MetricInstanceModel, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel> metricInstanceModelImporter) {
        return visitModel(metricInstanceModelImporter);
    }


    @Override
    public Object visitMetricModel(MetricModelImporter<? extends MetricModel, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel> metricModelImporter) {
        return visitModel(metricModelImporter);
    }


    @Override
    public Object visitMetricTypeModel(MetricTypeModelImporter<? extends MetricTypeModel, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel> metricTypeModelImporter) {
        return visitMetricModel(metricTypeModelImporter);
    }


    @Override
    public Object visitMetricObjectBinding(MetricObjectBindingImporter<? extends MetricObjectBinding, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding> metricObjectBindingImporter) {
        return visitFeature(metricObjectBindingImporter);
    }


    @Override
    public Object visitMetricTemplate(MetricTemplateImporter<? extends MetricTemplate, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate> metricTemplateImporter) {
        return visitFeature(metricTemplateImporter);
    }


    @Override
    public Object visitMetricVariable(MetricVariableImporter<? extends MetricVariable, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable> metricVariableImporter) {
        return visitMetric(metricVariableImporter);
    }


    @Override
    public Object visitObjectContext(ObjectContextImporter<? extends ObjectContext, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext> objectContextImporter) {
        return visitFeature(objectContextImporter);
    }


    @Override
    public Object visitRawMetricContext(RawMetricContextImporter<? extends RawMetricContext, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext> rawMetricContextImporter) {
       return visitMetricContext(rawMetricContextImporter);
    }


    @Override
    public Object visitRawMetric(RawMetricImporter<? extends RawMetric, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric> rawMetricImporter) {
        return visitMetric(rawMetricImporter);
    }


    @Override
    public Object visitSchedule(ScheduleImporter<? extends Schedule, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule> scheduleImporter) {
        return visitFeature(scheduleImporter);
    }


    @Override
    public Object visitSensor(SensorImporter<? extends Sensor, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor> sensorImporter) {
        return visitSoftwareComponent(sensorImporter);
    }


    @Override
    public Object visitWindow(WindowImporter<? extends Window, ? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window> windowImporter) {
        return visitFeature(windowImporter);
    }


    @Override
    public Object visitConstraint(CamelConstraintImporter<? extends Constraint, ? extends CamelConstraint> camelConstraintImporter) {
        return visitNamedElement(camelConstraintImporter);
    }

    @Override
    public Object visitConstraintModel(ConstraintModelImporter<? extends ConstraintModel, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel> constraintModelImporter) {
        return visitModel(constraintModelImporter);
    }


    @Override
    public Object visitAttributeConstraint(AttributeConstraintImporter<? extends AttributeConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint> attributeConstraintImporter) {
        return visitUnaryConstraint(attributeConstraintImporter);
    }


    @Override
    public Object visitUnaryConstraint(UnaryConstraintImporter<? extends UnaryConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint> unaryConstraintImporter) {
        return visitConstraint(unaryConstraintImporter);
    }


    @Override
    public Object visitCompositeConstraint(CompositeConstraintImporter<? extends CompositeConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint> compositeConstraintImporter) {
        return visitConstraint(compositeConstraintImporter);
    }


    @Override
    public Object visitIfThenConstraint(IfThenConstraintImporter<? extends IfThenConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint> ifThenConstraintImporter) {
        return visitCompositeConstraint(ifThenConstraintImporter);
    }


    @Override
    public Object visitLogicalConstraint(LogicalConstraintImporter<? extends LogicalConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint> logicalConstraintImporter) {
        return visitCompositeConstraint(logicalConstraintImporter);
    }


    @Override
    public Object visitMetricConstraint(MetricConstraintImporter<? extends MetricConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint> metricConstraintImporter) {
        return visitUnaryConstraint(metricConstraintImporter);
    }


    @Override
    public Object visitMetricVariableConstraint(MetricVariableConstraintImporter<? extends MetricVariableConstraint, ? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint> metricVariableConstraintImporter) {
        return visitUnaryConstraint(metricVariableConstraintImporter);
    }


    @Override
    public Object visitHardRequirement(HardRequirementImporter<? extends HardRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement> hardRequirementImporter) {
        return visitRequirement(hardRequirementImporter);
    }


    @Override
    public Object visitHorizontalScaleRequirement(
            HorizontalScaleRequirementImporter<? extends HorizontalScaleRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement> horizontalScaleRequirementImporter) {
        return visitScaleRequirement(horizontalScaleRequirementImporter);
    }


    @Override
    public Object visitImageRequirement(ImageRequirementImporter<? extends ImageRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement> imageRequirementImporter) {
        return visitHardRequirement(imageRequirementImporter);
    }


    @Override
    public Object visitLocationRequirement(LocationRequirementImporter<? extends LocationRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement> locationRequirementImporter) {
        return visitHardRequirement(locationRequirementImporter);
    }


    @Override
    public Object visitOptimisationRequirement(OptimisationRequirementImporter<? extends OptimisationRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement> optimisationRequirementImporter) {
        return visitSoftRequirement(optimisationRequirementImporter);
    }


    @Override
    public Object visitOSRequirement(OSRequirementImporter<? extends OSRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement> osRequirementImporter) {
        return visitHardRequirement(osRequirementImporter);
    }


    @Override
    public Object visitPaaSRequirement(PaaSRequirementImporter<? extends PaaSRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement> paaSRequirementImporter) {
        return visitHardRequirement(paaSRequirementImporter);
    }


    @Override
    public Object visitProviderRequirement(ProviderRequirementImporter<? extends ProviderRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement> providerRequirementImporter) {
        return visitHardRequirement(providerRequirementImporter);
    }


    @Override
    public Object visitRequirement(RequirementImporter<? extends Requirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement> requirementImporter) {
        return visitFeature(requirementImporter);
    }


    @Override
    public Object visitRequirementModel(RequirementModelImporter<? extends RequirementModel, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel> requirementModelImporter) {
        return visitModel(requirementModelImporter);
    }


    @Override
    public Object visitResourceRequirement(ResourceRequirementImporter<? extends ResourceRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement> resourceRequirementImporter) {
        return visitHardRequirement(resourceRequirementImporter);
    }


    @Override
    public Object visitScaleRequirement(ScaleRequirementImporter<? extends ScaleRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement> scaleRequirementImporter) {
        return visitHardRequirement(scaleRequirementImporter);
    }


    @Override
    public Object visitSecurityRequirement(SecurityRequirementImporter<? extends SecurityRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement> securityRequirementImporter) {
        return visitHardRequirement(securityRequirementImporter);
    }


    @Override
    public Object visitServiceLevelObjective(ServiceLevelObjectiveImporter<? extends ServiceLevelObjective, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective> serviceLevelObjectiveImporter) {
        return visitHardRequirement(serviceLevelObjectiveImporter);
    }


    @Override
    public Object visitSoftRequirement(SoftRequirementImporter<? extends SoftRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement> softRequirementImporter) {
        return visitRequirement(softRequirementImporter);
    }


    @Override
    public Object visitVerticalScaleRequirement(VerticalScaleRequirementImporter<? extends VerticalScaleRequirement, ? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement> verticalScaleRequirementImporter) {
        return visitScaleRequirement(verticalScaleRequirementImporter);
    }


    @Override
    public Object visitActionInstance(ActionInstanceImporter<? extends ActionInstance, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance> actionInstanceImporter) {
        return visitFeature(actionInstanceImporter);
    }


    @Override
    public Object visitMeasurement(MeasurementImporter<? extends Measurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement> measurementImporter) {
        return visitFeature(measurementImporter);
    }


    @Override
    public Object visitApplicationMeasurement(ApplicationMeasurementImporter<? extends ApplicationMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement> applicationMeasurementImporter) {
       return visitMeasurement(applicationMeasurementImporter);
    }


    @Override
    public Object visitCause(CauseImporter<? extends Cause, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause> causeImporter) {
        return visitFeature(causeImporter);
    }


    @Override
    public Object visitCommunicationMeasurement(CommunicationMeasurementImporter<? extends CommunicationMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement> communicationMeasurementImporter) {
        return visitMeasurement(communicationMeasurementImporter);
    }


    @Override
    public Object visitContainerMeasurement(ContainerMeasurementImporter<? extends ContainerMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement> containerMeasurementImporter) {
        return visitMeasurement(containerMeasurementImporter);
    }


    @Override
    public Object visitDataMeasurement(DataMeasurementImporter<? extends DataMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement> dataMeasurementImporter) {
        return visitMeasurement(dataMeasurementImporter);
    }


    @Override
    public Object visitExecutionModel(ExecutionModelImporter<? extends ExecutionModel, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel> executionModelImporter) {
       return visitModel(executionModelImporter);
    }


    @Override
    public Object visitHistoryInfo(HistoryInfoImporter<? extends HistoryInfo, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo> historyInfoImporter) {
        return visitFeature(historyInfoImporter);
    }


    @Override
    public Object visitHistoryRecord(HistoryRecordImporter<? extends HistoryRecord, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord> historyRecordImporter) {
        return visitFeature(historyRecordImporter);
    }


    @Override
    public Object visitPaaSMeasurement(PaaSMeasurementImporter<? extends PaaSMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement> paaSMeasurementImporter) {
        return visitMeasurement(paaSMeasurementImporter);
    }


    @Override
    public Object visitRuleTrigger(RuleTriggerImporter<? extends RuleTrigger, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger> ruleTriggerImporter) {
        return visitCause(ruleTriggerImporter);
    }


    @Override
    public Object visitSLOViolation(SLOViolationImporter<? extends SLOViolation, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation> sloViolationImporter) {
        return visitCause(sloViolationImporter);
    }


    @Override
    public Object visitSoftwareComponentMeasurement(
            SoftwareComponentMeasurementImporter<? extends SoftwareComponentMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement> softwareComponentMeasurementImporter) {
        return visitMeasurement(softwareComponentMeasurementImporter);
    }


    @Override
    public Object visitVMMeasurement(VMMeasurementImporter<? extends VMMeasurement, ? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement> vmMeasurementImporter) {
        return visitMeasurement(vmMeasurementImporter);
    }


    @Override
    public Object visitCloudLocation(CloudLocationImporter<? extends CloudLocation, ? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation> cloudLocationImporter) {
        return visitLocation(cloudLocationImporter);
    }


    @Override
    public Object visitLocation(LocationImporter<? extends Location, ? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location> locationImporter) {
        return visitFeature(locationImporter);
    }


    @Override
    public Object visitLocationModel(LocationModelImporter<? extends LocationModel, ? extends fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel> locationModelImporter) {
        return visitModel(locationModelImporter);
    }


    @Override
    public Object visitGeographicalRegion(GeographicalRegionImporter<? extends GeographicalRegion, ? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion> geographicalRegionImporter) {
        return visitLocation(geographicalRegionImporter);
    }


    @Override
    public Object visitData(DataImporter<? extends Data, ? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.Data> dataImporter) {
        return visitFeature(dataImporter);
    }


    @Override
    public Object visitDataInstance(DataInstanceImporter<? extends DataInstance, ? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance> dataInstanceImporter) {
        return visitFeature(dataInstanceImporter);
    }


    @Override
    public Object visitDataInstanceModel(DataInstanceModelImporter<? extends DataInstanceModel, ? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel> dataInstanceModelImporter) {
        return visitDataModel(dataInstanceModelImporter);
    }


    @Override
    public Object visitDataModel(DataModelImporter<? extends DataModel, ? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel> dataModelImporter) {
        return visitModel(dataModelImporter);
    }


    @Override
    public Object visitDataSource(DataSourceImporter<? extends DataSource, ? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource> dataSourceImporter) {
        return visitFeature(dataSourceImporter);
    }


    @Override
    public Object visitDataSourceInstance(DataSourceInstanceImporter<? extends DataSourceInstance, ? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance> dataSourceInstanceImporter) {
        return visitFeature(dataSourceInstanceImporter);
    }


    @Override
    public Object visitDataTypeModel(DataTypeModelImporter<? extends DataTypeModel, ? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel> dataTypeModelImporter) {
        return visitDataModel(dataTypeModelImporter);
    }


    @Override
    public Object visitBinaryEventPattern(BinaryEventPatternImporter<? extends BinaryEventPattern, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern> binaryEventPatternImporter) {
        return visitEventPattern(binaryEventPatternImporter);
    }


    @Override
    public Object visitEvent(EventImporter<? extends Event, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event> eventImporter) {
        return visitFeature(eventImporter);
    }


    @Override
    public Object visitScalabilityModel(ScalabilityModelImporter<? extends ScalabilityModel, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel> scalabilityModelImporter) {
        return visitModel(scalabilityModelImporter);
    }


    @Override
    public Object visitEventInstance(EventInstanceImporter<? extends EventInstance, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance> eventInstanceImporter) {
        return visitFeature(eventInstanceImporter);
    }


    @Override
    public Object visitEventPattern(EventPatternImporter<? extends EventPattern, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern> eventPatternImporter) {
        return visitEvent(eventPatternImporter);
    }


    @Override
    public Object visitFunctionalEvent(FunctionalEventImporter<? extends FunctionalEvent, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent> functionalEventImporter) {
        return visitSingleEvent(functionalEventImporter);
    }


    @Override
    public Object visitFunctionalEventInstance(FunctionalEventInstanceImporter<? extends FunctionalEventInstance, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance> functionalEventInstanceImporter) {
        return visitEventInstance(functionalEventInstanceImporter);
    }


    @Override
    public Object visitHorizontalScalingAction(HorizontalScalingActionImporter<? extends HorizontalScalingAction, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction> horizontalScalingActionImporter) {
        return visitScalingAction(horizontalScalingActionImporter);
    }


    @Override
    public Object visitNonFunctionalEvent(NonFunctionalEventImporter<? extends NonFunctionalEvent, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent> nonFunctionalEventImporter) {
        return visitSingleEvent(nonFunctionalEventImporter);
    }


    @Override
    public Object visitNonFunctionalEventInstance(
            NonFunctionalEventInstanceImporter<? extends NonFunctionalEventInstance, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance> nonFunctionalEventInstanceImporter) {
        return visitEventInstance(nonFunctionalEventInstanceImporter);
    }


    @Override
    public Object visitScalabilityRule(ScalabilityRuleImporter<? extends ScalabilityRule, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule> scalabilityRuleImporter) {
        return visitFeature(scalabilityRuleImporter);
    }


    @Override
    public Object visitAction(ActionImporter<? extends Action, ? extends fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action> actionImporter) {
        return visitFeature(actionImporter);
    }


    @Override
    public Object visitScalingAction(ScalingActionImporter<? extends ScalingAction, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction> scalingActionImporter) {
        return visitAction(scalingActionImporter);
    }


    @Override
    public Object visitSingleEvent(SingleEventImporter<? extends SingleEvent, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent> singleEventImporter) {
        return visitEvent(singleEventImporter);
    }


    @Override
    public Object visitTimer(TimerImporter<? extends Timer, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer> timerImporter) {
        return visitFeature(timerImporter);
    }


    @Override
    public Object visitUnaryEventPattern(UnaryEventPatternImporter<? extends UnaryEventPattern, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern> unaryEventPatternImporter) {
        return visitEventPattern(unaryEventPatternImporter);
    }


    @Override
    public Object visitVerticalScalingAction(VerticalScalingActionImporter<? extends VerticalScalingAction, ? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction> verticalScalingActionImporter) {
        return visitScalingAction(verticalScalingActionImporter);
    }


    @Override
    public Object visitCertifiable(CertifiableImporter<? extends Certifiable, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable> certifiableImporter) {
        return visitSecurityAttribute(certifiableImporter);
    }


    @Override
    public Object visitAttribute(AttributeImporter<? extends Attribute, ? extends CamelAttribute> attributeImporter) {
        return visitNamedElement(attributeImporter);
    }


    @Override
    public Object visitQualityAttribute(QualityAttributeImporter<? extends QualityAttribute, ? extends CamelAttribute> qualityAttributeImporter) {
        return visitAttribute(qualityAttributeImporter);
    }


    @Override
    public Object visitMeasurableAttribute(MeasurableAttributeImporter<? extends MeasurableAttribute, ? extends CamelAttribute> measurableAttributeImporter) {
        return visitQualityAttribute(measurableAttributeImporter);
    }


    @Override
    public Object visitSecurityAttribute(SecurityAttributeImporter<? extends SecurityAttribute, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute> securityAttributeImporter) {
        return visitQualityAttribute(securityAttributeImporter);
    }


    @Override
    public Object visitCompositeSecurityMetric(CompositeSecurityMetricImporter<? extends CompositeSecurityMetric, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric> compositeSecurityMetricImporter) {
        return visitCompositeMetric(compositeSecurityMetricImporter);
    }


    @Override
    public Object visitRawSecurityMetric(RawSecurityMetricImporter<? extends RawSecurityMetric, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric> rawSecurityMetricImporter) {
        return visitRawMetric(rawSecurityMetricImporter);
    }


    @Override
    public Object visitSecurityControl(SecurityControlImporter<? extends SecurityControl, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl> securityControlImporter) {
        return visitFeature(securityControlImporter);
    }


    @Override
    public Object visitSecurityDomain(SecurityDomainImporter<? extends SecurityDomain, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain> securityDomainImporter) {
        return visitFeature(securityDomainImporter);
    }


    @Override
    public Object visitSecurityMetricInstance(SecurityMetricInstanceImporter<? extends SecurityMetricInstance, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance> securityMetricInstanceImporter) {
        return visitMetricInstance(securityMetricInstanceImporter);
    }


    @Override
    public Object visitSecurityModel(SecurityModelImporter<? extends SecurityModel, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel> securityModelImporter) {
        return visitModel(securityModelImporter);
    }


    @Override
    public Object visitSecuritySLO(SecuritySLOImporter<? extends SecuritySLO, ? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO> securitySLOImporter) {
        return visitServiceLevelObjective(securitySLOImporter);
    }


    @Override
    public Object visitProvidedCommunication(ProvidedCommunicationImporter<? extends ProvidedCommunication, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> providedCommunicationImporter) {
        return visitCommunicationPort(providedCommunicationImporter);
    }

    @Override
    public Object visitProvidedCommunicationInstance(ProvidedCommunicationInstanceImporter<? extends ProvidedCommunicationInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> providedCommunicationInstanceImporter) {
        return visitCommunicationPortInstance(providedCommunicationInstanceImporter);
    }


    @Override
    public Object visitProvidedHost(ProvidedHostImporter<? extends ProvidedHost, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> providedHostImporter) {
        return visitHostingPort(providedHostImporter);
    }

    @Override
    public Object visitProvidedHostInstance(ProvidedHostInstanceImporter<? extends ProvidedHostInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> providedHostInstanceImporter) {
        return visitHostingPortInstance(providedHostInstanceImporter);
    }


    @Override
    public Object visitRequiredCommunication(RequiredCommunicationImporter<? extends RequiredCommunication, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> requiredCommunicationImporter) {
        return visitCommunicationPort(requiredCommunicationImporter);
    }

    @Override
    public Object visitRequiredCommunicationInstance(RequiredCommunicationInstanceImporter<? extends RequiredCommunicationInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> requiredCommunicationInstanceImporter) {
        return visitCommunicationPortInstance(requiredCommunicationInstanceImporter);
    }

    @Override
    public Object visitRequiredHost(RequiredHostImporter<? extends RequiredHost, ? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> requiredHostImporter) {
       return visitHostingPort(requiredHostImporter);
    }

    @Override
    public Object visitRequiredHostInstance(RequiredHostInstanceImporter<? extends RequiredHostInstance, ? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> requiredHostInstanceImporter) {
       return visitHostingPortInstance(requiredHostInstanceImporter);
    }

    @Override
    public Object visitCompositeUnit(CompositeUnitImporter<? extends CompositeUnit, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit> compositeUnitImporter) {
       return visitDimensionedUnit(compositeUnitImporter);
    }


    @Override
    public Object visitDimensionedUnit(DimensionedUnitImporter<? extends DimensionedUnit, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit> dimensionedUnitImporter) {
        return visitUnit(dimensionedUnitImporter);
    }


    @Override
    public Object visitDimensionless(DimensionlessImporter<? extends Dimensionless, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless> dimensionlessImporter) {
        return visitUnit(dimensionlessImporter);
    }


    @Override
    public Object visitSingleUnit(SingleUnitImporter<? extends SingleUnit, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit> singleUnitImporter) {
        return visitDimensionedUnit(singleUnitImporter);
    }


    @Override
    public Object visitUnitDimension(UnitDimensionImporter<? extends UnitDimension, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension> unitDimensionImporter) {
        return visitFeature(unitDimensionImporter);
    }


    @Override
    public Object visitUnit(UnitImporter<? extends Unit, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit> unitImporter) {
        return visitFeature(unitImporter);
    }


    @Override
    public Object visitUnitModel(UnitModelImporter<? extends UnitModel, ? extends fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel> unitModelImporter) {
        return visitModel(unitModelImporter);
    }

}
