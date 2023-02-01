package fr.softeam.cameldesigner.exchange.importer;

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
import camel.type.BooleanValueType;
import camel.type.Range;
import camel.type.RangeUnion;
import camel.type.StringValue;
import camel.type.StringValueType;
import camel.type.TypeModel;
import camel.type.ValueType;
import camel.unit.CompositeUnit;
import camel.unit.DimensionedUnit;
import camel.unit.Dimensionless;
import camel.unit.SingleUnit;
import camel.unit.Unit;
import camel.unit.UnitDimension;
import camel.unit.UnitModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import fr.softeam.cameldesigner.exchange.importer.type.BooleanValueTypeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.RangeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.RangeUnionImporter;
import fr.softeam.cameldesigner.exchange.importer.type.StringValueTypeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.TypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.type.ValueTypeImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.CompositeUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.DimensionedUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.DimensionlessImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.SingleUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitDimensionImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitModelImporter;
import org.eclipse.emf.cdo.CDOObject;

@objid ("40dfef3a-d77a-41ba-9c83-39058a242b09")
public interface ICamelImporterVisitor {
    @objid ("6e9ef6c3-3630-4d6a-aae8-7bcf35a1f63d")
    Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> featureImporter);

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

    @objid ("68be9c65-bdf0-4b0c-9a5e-eac1447bd575")
    Object visitSoftwareComponent(SoftwareComponentImporter<? extends SoftwareComponent,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> softwareComponentImporter);

    @objid ("74c7f6f1-0d61-4f81-b6a9-8e7962588036")
    Object visitAttributeContext(AttributeContextImporter<? extends AttributeContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext> attributeContextImporter);

    @objid ("7a5d15ce-5b32-40c1-b79e-40148837b9f2")
    Object visitCompositeMetric(CompositeMetricImporter<? extends CompositeMetric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric> compositeMetricImporter);

    @objid ("08c25c7f-14cd-42fc-9a2a-9c333ae604bb")
    Object visitMetric(MetricImporter<? extends Metric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric> metricImporter);

    @objid ("55311f21-c9f1-45a7-8692-5c64a634a058")
    Object visitCompositeMetricContext(CompositeMetricContextImporter<? extends CompositeMetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext> compositeMetricContextImporter);

    @objid ("7621926b-17f6-4e03-bd04-702a03982f96")
    Object visitMetricContext(MetricContextImporter<? extends MetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext> metricContextImporter);

    @objid ("f1337d9a-fc9a-4f65-9efa-e79e9b486c34")
    Object visitFunction(FunctionImporter<? extends Function,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function> functionImporter);

    @objid ("4deb7705-7352-474e-93dc-b4694034957e")
    Object visitMetricInstance(MetricInstanceImporter<? extends MetricInstance,? extends fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance> metricInstanceImporter);

    @objid ("2e255466-41a9-4863-aec1-2f676830ef88")
    Object visitMetricInstanceModell(MetricInstanceModelImporter<? extends MetricInstanceModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel> metricInstanceModelImporter);

    @objid ("5de190dd-7845-4515-b944-8d51538d9afb")
    Object visitMetricModel(MetricModelImporter<? extends MetricModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel> metricModelImporter);

    @objid ("88128961-4bdb-4faf-8f59-01a9ed45cf79")
    Object visitMetricTypeModel(MetricTypeModelImporter<? extends MetricTypeModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel> metricTypeModelImporter);

    @objid ("51117921-ae4a-4cc1-a2ed-caf8111efc02")
    Object visitMetricObjectBinding(MetricObjectBindingImporter<? extends MetricObjectBinding,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding> metricObjectBindingImporter);

    @objid ("83ff95b4-26c7-4ecc-a60f-3642ae9f13f9")
    Object visitMetricTemplate(MetricTemplateImporter<? extends MetricTemplate,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate> metricTemplateImporter);

    @objid ("c4c8dce7-bb43-45ac-a617-0a25e3f18486")
    Object visitMetricVariable(MetricVariableImporter<? extends MetricVariable,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable> metricVariableImporter);

    @objid ("a9f3cf20-b3c5-4ff1-8f07-a55d55f0dc36")
    Object visitObjectContext(ObjectContextImporter<? extends ObjectContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext> objectContextImporter);

    @objid ("b4c261dc-0c56-487e-8342-d75802dc1b28")
    Object visitRawMetricContext(RawMetricContextImporter<? extends RawMetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext> rawMetricContextImporter);

    @objid ("0127d5fa-9c61-423b-8a2c-c97644c49ee8")
    Object visitRawMetric(RawMetricImporter<? extends RawMetric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric> rawMetricImporter);

    @objid ("d44b227f-982c-4419-b543-ee60cd76b35e")
    Object visitSchedule(ScheduleImporter<? extends Schedule,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule> scheduleImporter);

    @objid ("60cefea6-5aa5-4eba-a948-a9f16ad997d7")
    Object visitSensor(SensorImporter<? extends Sensor,? extends fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor> sensorImporter);

    @objid ("4be2ddc1-27d9-45c2-9ed5-bf13e906f0c9")
    Object visitWindow(WindowImporter<? extends Window,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window> windowImporter);

    @objid ("bab6942d-12bd-4a12-9606-d0cf532c9b50")
    Object visitConstraint(CamelConstraintImporter<? extends Constraint,? extends CamelConstraint> camelConstraintImporter);

    @objid ("50ec42c4-4544-4443-94d4-76a4f0cd7ecd")
    Object visitAttributeConstraint(AttributeConstraintImporter<? extends AttributeConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint> attributeConstraintImporter);

    @objid ("a95dd18d-a2cb-4608-a659-c3e08b979494")
    Object visitUnaryConstraint(UnaryConstraintImporter<? extends UnaryConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint> unaryConstraintImporter);

    @objid ("f852bc7f-4800-4423-8c97-085901a076b2")
    Object visitCompositeConstraint(CompositeConstraintImporter<? extends CompositeConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint> compositeConstraintImporter);

    @objid ("f5901430-7be8-4d21-b3cb-e672a9c0741c")
    Object visitIfThenConstraint(IfThenConstraintImporter<? extends IfThenConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint> ifThenConstraintImporter);

    @objid ("255a54c9-1a43-484a-939e-31b00f940d3c")
    Object visitLogicalConstraint(LogicalConstraintImporter<? extends LogicalConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint> logicalConstraintImporter);

    @objid ("44edb4c7-bd69-45eb-a680-85b2340c288c")
    Object visitMetricConstraint(MetricConstraintImporter<? extends MetricConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint> metricConstraintImporter);

    @objid ("196e7e6f-b846-4c3f-a958-2e9f276fe30f")
    Object visitMetricVariableConstraint(MetricVariableConstraintImporter<? extends MetricVariableConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint> metricVariableConstraintImporter);

    @objid ("6e1b451e-aecb-4494-b056-2a31036c166a")
    Object visitBuildConfiguration(BuildConfigurationImporter<? extends BuildConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration> buildConfigurationImporter);

    @objid ("faa7dd80-51a9-461c-830e-99f8081719a3")
    Object visitClusterConfiguration(ClusterConfigurationImporter<? extends ClusterConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> clusterConfigurationImporter);

    @objid ("94f38a59-c76a-44ed-82c4-201d44c241d2")
    Object visitCommunication(CommunicationImporter<? extends Communication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> communicationImporter);

    @objid ("b76887a7-9e27-400c-9a57-e52eb8f3c07a")
    Object visitCommunicationPort(CommunicationPortImporter<? extends CommunicationPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> communicationPortImporter);

    @objid ("b9cc38d4-60cf-48c2-afeb-d22c67a1d218")
    Object visitComponentRelation(ComponentRelationImporter<? extends ComponentRelation,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation> componentRelationImporter);

    @objid ("49c0e459-0a67-4ab7-afe1-38f9cb5d9628")
    Object visitConfiguration(ConfigurationImporter<? extends Configuration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration> configurationImporter);

    @objid ("f723dc4d-dde8-40fd-8408-549b7a713375")
    Object visitContainer(ContainerImporter<? extends Container,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> containerImporter);

    @objid ("a51eaf14-e0d5-4577-bdf9-d7f0020b86c8")
    Object visitDeploymentModel(DeploymentModelImporter<? extends DeploymentModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel> deploymentModelImporter);

    @objid ("96d953c0-2518-49ae-a5fc-91192eb46d3d")
    Object visitDeploymentTypeModel(DeploymentTypeModelImporter<? extends DeploymentTypeModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> deploymentTypeModelImporter);

    @objid ("89c2119b-0032-472d-806b-ed76c01d6754")
    Object visitEventConfiguration(EventConfigurationImporter<? extends EventConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration> eventConfigurationImporter);

    @objid ("4939197a-f88e-481c-af2c-15b0323c5e10")
    Object visitHosting(HostingImporter<? extends Hosting,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> hostingImporter);

    @objid ("0fbecab3-b2fd-4bd2-9981-da63533b6ad7")
    Object visitHostingPort(HostingPortImporter<? extends HostingPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> hostingPortImporter);

    @objid ("4b283577-eb60-4e7b-9257-ff4a0c80a0fd")
    Object visitLocationCoupling(LocationCouplingImporter<? extends LocationCoupling,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling> locationCouplingImporter);

    @objid ("f5f9089a-8027-4dd8-8003-e81d56787a75")
    Object visitPaaSConfiguration(PaaSConfigurationImporter<? extends PaaSConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration> paaSConfigurationImporter);

    @objid ("9a8825ae-4d10-4b24-9a33-b8e677d18b87")
    Object visitPaaS(PaaSImporter<? extends PaaS,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS> paaSImporter);

    @objid ("4aab6751-6e87-4d25-b67b-2f7d62273f3f")
    Object visitRequirementSet(RequirementSetImporter<? extends RequirementSet,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet> requiredSetImporter);

    @objid ("bd305f9b-5b70-4323-ba1e-bf404c770b9b")
    Object visitScriptConfiguration(ScriptConfiguationImporter<? extends ScriptConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration> scriptConfiguationImporter);

    @objid ("0ad63cd3-0594-46f0-b61d-e95b45fe540d")
    Object visitServelessConfiguration(ServerlessConfigurationImporter<? extends ServerlessConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> serverlessConfigurationImporter);

    @objid ("19ec64a4-29b3-4ef9-a801-c2a186a71536")
    Object visitVM(VMImporter<? extends VM,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> vmImporter);

    @objid ("307f4a27-3680-4500-8116-3c6e8afc2142")
    Object visitHardRequirement(HardRequirementImporter<? extends HardRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement> hardRequirementImporter);

    @objid ("cd317cf3-9930-499b-bcbc-c62960d8573f")
    Object visitHorizontalScaleRequirement(HorizontalScaleRequirementImporter<? extends HorizontalScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement> horizontalScaleRequirementImporter);

    @objid ("552bfc44-c3e6-4578-9907-d9fdb6e6f54b")
    Object visitImageRequirement(ImageRequirementImporter<? extends ImageRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement> imageRequirementImporter);

    @objid ("f2fec66c-cbd6-46a9-9993-ec1083c7a3e3")
    Object visitLocationRequirement(LocationRequirementImporter<? extends LocationRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement> locationRequirementImporter);

    @objid ("e2a1e19b-bdec-4e18-bbcb-02e05c56daf4")
    Object visitOptimisationRequirement(OptimisationRequirementImporter<? extends OptimisationRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement> optimisationRequirementImporter);

    @objid ("796171c1-43eb-41d7-9e24-14742ecbd7b0")
    Object visitOSRequirement(OSRequirementImporter<? extends OSRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement> osRequirementImporter);

    @objid ("9a83af68-9181-4096-88b6-bbc41718abde")
    Object visitPaaSRequirement(PaaSRequirementImporter<? extends PaaSRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement> paaSRequirementImporter);

    @objid ("60d581cf-ad27-42ef-a6ca-723b44514b16")
    Object visitProviderRequirement(ProviderRequirementImporter<? extends ProviderRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement> providerRequirementImporter);

    @objid ("cb9e58cb-d14d-4cfc-9674-8d363d17cef3")
    Object visitRequirement(RequirementImporter<? extends Requirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement> requirementImporter);

    @objid ("27267dd1-ba6d-4ab7-91cc-8a0484cdabbb")
    Object visitRequirementModel(RequirementModelImporter<? extends RequirementModel,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel> requirementModelImporter);

    @objid ("8e3e25e0-aef0-4937-a80a-b7450675b5d2")
    Object visitResourceRequirement(ResourceRequirementImporter<? extends ResourceRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement> resourceRequirementImporter);

    @objid ("c73f96db-83fa-4548-83dd-b2600e2d85dc")
    Object visitScaleRequirement(ScaleRequirementImporter<? extends ScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement> scaleRequirementImporter);

    @objid ("af506e92-3467-4164-901a-cc24d20c9e29")
    Object visitSecurityRequirement(SecurityRequirementImporter<? extends SecurityRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement> securityRequirementImporter);

    @objid ("4bc1f6f8-0b89-4717-ab47-098dd531f5ef")
    Object visitServiceLevelObjective(ServiceLevelObjectiveImporter<? extends ServiceLevelObjective,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective> serviceLevelObjectiveImporter);

    @objid ("9f7e4374-9adc-4f3f-9a9b-daedb789d012")
    Object visitSoftRequirement(SoftRequirementImporter<? extends SoftRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement> softRequirementImporter);

    @objid ("de20681c-b6f8-49e7-8acc-9c4ca8098561")
    Object visitVerticalScaleRequirement(VerticalScaleRequirementImporter<? extends VerticalScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement> verticalScaleRequirementImporter);

    @objid ("237b9591-1b8f-4d75-bcb5-98a75ffab2b8")
    Object visitActionInstance(ActionInstanceImporter<? extends ActionInstance,? extends fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance> actionInstanceImporter);

    @objid ("a3d4c05e-a864-42fd-8022-a80741939504")
    Object visitMeasurement(MeasurementImporter<? extends Measurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement> measurementImporter);

    @objid ("363a65a4-6aef-4940-9540-58a42eab24fe")
    Object visitApplicationMeasurement(ApplicationMeasurementImporter<? extends ApplicationMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement> applicationMeasurementImporter);

    @objid ("670b379b-2315-4db6-98aa-080cbc00e3f2")
    Object visitCause(CauseImporter<? extends Cause,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause> causeImporter);

    @objid ("e3dc25eb-1869-405b-8f32-a232481fdbdc")
    Object visitCommunicationMeasurement(CommunicationMeasurementImporter<? extends CommunicationMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement> communicationMeasurementImporter);

    @objid ("e20593af-c077-4627-acc4-7d5329a20335")
    Object visitContainerMeasurement(ContainerMeasurementImporter<? extends ContainerMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement> containerMeasurementImporter);

    @objid ("9dd4d664-650b-4e08-bd54-38e08ff65c81")
    Object visitDataMeasurement(DataMeasurementImporter<? extends DataMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement> dataMeasurementImporter);

    @objid ("0c59ff2e-e1d4-4e49-ae89-d1b6b9ed560c")
    Object visitExecutionModel(ExecutionModelImporter<? extends ExecutionModel,? extends fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel> executionModelImporter);

    @objid ("634622fc-b19c-4982-9851-4c8bad511f36")
    Object visitHistoryInfo(HistoryInfoImporter<? extends HistoryInfo,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo> historyInfoImporter);

    @objid ("02f8a9e2-4bd9-4d64-8d12-0ef49167351e")
    Object visitHistoryRecord(HistoryRecordImporter<? extends HistoryRecord,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord> historyRecordImporter);

    @objid ("808ce867-98d5-42e0-a84a-3e3ac4c5a2e4")
    Object visitPaaSMeasurement(PaaSMeasurementImporter<? extends PaaSMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement> paaSMeasurementImporter);

    @objid ("04157efb-8dd1-4cf4-aa8e-f7e0f9eef219")
    Object visitRuleTrigger(RuleTriggerImporter<? extends RuleTrigger,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger> ruleTriggerImporter);

    @objid ("759d945c-da39-42d8-be30-8e9adf8d8b19")
    Object visitSLOViolation(SLOViolationImporter<? extends SLOViolation,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation> sloViolationImporter);

    @objid ("ae80a53a-2f85-4bfc-9267-f20186fa5247")
    Object visitSoftwareComponentMeasurement(SoftwareComponentMeasurementImporter<? extends SoftwareComponentMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement> softwareComponentMeasurementImporter);

    @objid ("c7684a0e-cc19-48bd-b053-525420a4f96f")
    Object visitVMMeasurement(VMMeasurementImporter<? extends VMMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement> vmMeasurementImporter);

    @objid ("101764ae-4b87-44ee-ad73-6cd4e6f23379")
    Object visitCloudLocation(CloudLocationImporter<? extends CloudLocation,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation> cloudLocationImporter);

    @objid ("6a5c8594-6939-4ecc-9c6e-695273dd8f42")
    Object visitLocation(LocationImporter<? extends Location,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location> locationImporter);

    @objid ("b46f1078-1e13-4bf9-b83d-bb3fcf469651")
    Object visitLocationModel(LocationModelImporter<? extends LocationModel,? extends fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel> locationModelImporter);

    @objid ("a7f25a3d-ff39-4f28-9f57-a164779bc35d")
    Object visitGeographicalRegion(GeographicalRegionImporter<? extends GeographicalRegion,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion> geographicalRegionImporter);

    @objid ("cf3748e2-0d29-46fa-941c-fbc5579dff35")
    Object visitData(DataImporter<? extends Data,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.Data> dataImporter);

    @objid ("3c96a9c7-3233-44bc-abf4-0bcc36694348")
    Object visitDataInstance(DataInstanceImporter<? extends DataInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance> dataInstanceImporter);

    @objid ("c698b7e5-c4e7-4150-bf6a-04916e4260d0")
    Object visitDataInstanceModel(DataInstanceModelImporter<? extends DataInstanceModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel> dataInstanceModelImporter);

    @objid ("44cb083d-7165-4b9c-9ea0-eb1746ea25a7")
    Object visitDataModel(DataModelImporter<? extends DataModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel> dataModelImporter);

    @objid ("05a4f3d6-1ed0-4807-99a9-7738abca5505")
    Object visitDataSource(DataSourceImporter<? extends DataSource,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource> dataSourceImporter);

    @objid ("54f405bb-e552-4b70-9fce-c70783fdee87")
    Object visitDataSourceInstance(DataSourceInstanceImporter<? extends DataSourceInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance> dataSourceInstanceImporter);

    @objid ("aa3d79bf-ae28-4fc0-a542-83ea119328bb")
    Object visitDataTypeModel(DataTypeModelImporter<? extends DataTypeModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel> dataTypeModelImporter);

    @objid ("d1118a8b-d39e-4886-87d6-d3f8e5f3cb1b")
    Object visitBinaryEventPattern(BinaryEventPatternImporter<? extends BinaryEventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern> binaryEventPatternImporter);

    @objid ("e955a8aa-f33a-4dfa-858c-230e2b8991cb")
    Object visitEvent(EventImporter<? extends Event,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event> eventImporter);

    @objid ("2a218abb-ccca-445b-812a-11933c04276b")
    Object visitScalabilityModel(ScalabilityModelImporter<? extends ScalabilityModel,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel> scalabilityModelImporter);

    @objid ("06884c4f-dda9-4447-a876-a04c2e6d1620")
    Object visitEventInstance(EventInstanceImporter<? extends EventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance> eventInstanceImporter);

    @objid ("a01f8f6c-5ca9-4de6-94b2-e547087d57c8")
    Object visitEventPattern(EventPatternImporter<? extends EventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern> eventPatternImporter);

    @objid ("b0ce761d-38f9-4fd3-9d3d-8745b4416c07")
    Object visitFunctionalEvent(FunctionalEventImporter<? extends FunctionalEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent> functionalEventImporter);

    @objid ("365acde0-f200-4f0a-a7af-dffced73fdb9")
    Object visitFunctionalEventInstance(FunctionalEventInstanceImporter<? extends FunctionalEventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance> functionalEventInstanceImporter);

    @objid ("9dbb4c34-24b8-4637-afdb-1d8a7771719c")
    Object visitHorizontalScalingAction(HorizontalScalingActionImporter<? extends HorizontalScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction> horizontalScalingActionImporter);

    @objid ("2be8b154-9c8f-41b8-984d-fc36a1508a6a")
    Object visitNonFunctionalEvent(NonFunctionalEventImporter<? extends NonFunctionalEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent> nonFunctionalEventImporter);

    @objid ("8fa208ab-4581-40d1-8028-2ef4d3081e90")
    Object visitNonFunctionalEventInstance(NonFunctionalEventInstanceImporter<? extends NonFunctionalEventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance> nonFunctionalEventInstanceImporter);

    @objid ("5613dbf4-d388-42e0-a22a-cc8dbe4b834d")
    Object visitScalabilityRule(ScalabilityRuleImporter<? extends ScalabilityRule,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule> scalabilityRuleImporter);

    @objid ("7c18c551-373d-4d66-8c11-ada56d077f00")
    Object visitAction(ActionImporter<? extends Action,? extends fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action> actionImporter);

    @objid ("00862899-3d81-495d-b63e-8f7feb8c6685")
    Object visitScalingAction(ScalingActionImporter<? extends ScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction> scalingActionImporter);

    @objid ("1b513a45-70fa-4bbc-b090-06bd851a08f1")
    Object visitSingleEvent(SingleEventImporter<? extends SingleEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent> singleEventImporter);

    @objid ("a2662aff-30d0-405e-80a0-cc23b2e22e70")
    Object visitTimer(TimerImporter<? extends Timer,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer> timerImporter);

    @objid ("b74750f1-7464-48a9-b98d-a2289e2ddc79")
    Object visitUnaryEventPattern(UnaryEventPatternImporter<? extends UnaryEventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern> unaryEventPatternImporter);

    @objid ("e56a5789-75bf-4736-b986-bb937ca91712")
    Object visitVerticalScalingAction(VerticalScalingActionImporter<? extends VerticalScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction> verticalScalingActionImporter);

    @objid ("908a22d7-5de2-4b92-84e5-58d011f908f8")
    Object visitCertifiable(CertifiableImporter<? extends Certifiable,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable> certifiableImporter);

    @objid ("f86f2cce-05ab-400f-bbc7-644c6f0cc524")
    Object visitAttribute(AttributeImporter<? extends Attribute,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> attributeImporter);

    @objid ("229cbd34-1231-4bfa-bd58-68decc8b3f4b")
    Object visitQualityAttribute(QualityAttributeImporter<? extends QualityAttribute,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> qualityAttributeImporter);

    @objid ("105b9bf1-b263-4f9f-9abb-d55f4137fc24")
    Object visitMeasurableAttribute(MeasurableAttributeImporter<? extends MeasurableAttribute,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute> measurableAttributeImporter);

    @objid ("3088c9a5-a973-4a5a-84fe-b64340b0f2ab")
    Object visitSecurityAttribute(SecurityAttributeImporter<? extends SecurityAttribute,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute> securityAttributeImporter);

    @objid ("4d289eaf-9315-4477-a61e-f73655a2d263")
    Object visitCompositeSecurityMetric(CompositeSecurityMetricImporter<? extends CompositeSecurityMetric,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric> compositeSecurityMetricImporter);

    @objid ("eca79b92-bbbb-4f6c-93c3-eb2c319c33c9")
    Object visitRawSecurityMetric(RawSecurityMetricImporter<? extends RawSecurityMetric,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric> rawSecurityMetricImporter);

    @objid ("a418a098-5204-4640-9e2a-92e01e4adaff")
    Object visitSecurityControl(SecurityControlImporter<? extends SecurityControl,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl> securityControlImporter);

    @objid ("8e99e8f4-74d5-4c7f-8004-ccf727a29cd3")
    Object visitSecurityDomain(SecurityDomainImporter<? extends SecurityDomain,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain> securityDomainImporter);

    @objid ("e9db6391-65c6-4327-8479-ec30563f1182")
    Object visitSecurityMetricInstance(SecurityMetricInstanceImporter<? extends SecurityMetricInstance,? extends fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance> securityMetricInstanceImporter);

    @objid ("97eaa70d-81f4-4c1a-aaba-17fc968cbe21")
    Object visitSecurityModel(SecurityModelImporter<? extends SecurityModel,? extends fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel> securityModelImporter);

    @objid ("5e9619c7-22e0-461d-b5da-8204b13f3bf3")
    Object visitSecuritySLO(SecuritySLOImporter<? extends SecuritySLO,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO> securitySLOImporter);

    @objid ("ab431e3f-21ff-4ea6-913e-12afd32eef51")
    Object visitCloudCredentials(CloudCredentialsImporter<? extends CloudCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials> cloudCredentialsImporter);

    @objid ("2270e577-49b3-4685-8c18-71fdc0004950")
    Object visitCloudProvider(CloudProviderImporter<? extends CloudProvider,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider> cloudProviderImporter);

    @objid ("87043e86-3485-4dd4-98df-1755c9849b5b")
    Object visitCredentials(CredentialsImporter<? extends Credentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials> credentialsImporter);

    @objid ("856a1630-5ad4-4413-a498-8642db8d66d3")
    Object visitDataResourceFilter(DataResourceFilterImporter<? extends DataResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> dataResourceFilterImporter);

    @objid ("c87d55fe-3c27-47a4-8f89-4b657f81e10d")
    Object visitEntity(EntityImporter<? extends Entity,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity> entityImporter);

    @objid ("5c8ca6e5-fedb-43cd-af89-f12c5fc4ea51")
    Object visitExternalIdentifier(ExternalIdentifierImporter<? extends ExternalIdentifier,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier> externalIdentifierImporter);

    @objid ("bd016e4a-f4ec-47d4-a657-b46523b6fbe7")
    Object visitModelResourceFilter(ModelResourceFilterImporter<? extends ModelResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter> modelResourceFilterImporter);

    @objid ("0317b08d-5047-402a-a0a7-19967b14193c")
    Object visitOrganisation(OrganisationImporter<? extends Organisation,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> organisationImporter);

    @objid ("30f1fc09-b98e-4918-a4a4-d5b027edf20f")
    Object visitOrganisationModel(OrganisationModelImporter<? extends OrganisationModel,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> organisationModelImporter);

    @objid ("0d1e5e7a-4101-42ca-92e5-bd39305335a7")
    Object visitPermission(PermissionImporter<? extends Permission,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission> permissionImporter);

    @objid ("505937b1-8b8b-4505-9218-9716cc224fb2")
    Object visitPlatformCredentials(PlatformCredentialsImporter<? extends PlatformCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials> platformCredentialsImporter);

    @objid ("5390ee30-892f-45b9-92ae-40efbcf32872")
    Object visitResourceFilter(ResourceFilterImporter<? extends ResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter> resourceFilterImporter);

    @objid ("f827062d-7de2-46e9-a905-3724265abfa8")
    Object visitRoleAssignment(RoleAssignmentImporter<? extends RoleAssignment,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment> roleAssignmentImporter);

    @objid ("ae4bff91-bf91-4605-8ab4-9191ff46682d")
    Object visitRole(RoleImporter<? extends Role,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role> roleImporter);

    @objid ("67b2b0ec-9a90-45d1-9676-4e79f291b39b")
    Object visitServiceResourceFilter(ServiceResourceFilterImporter<? extends ServiceResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter> serviceResourceFilterImporter);

    @objid ("91de1157-03cb-4d0c-8aea-68f289ee9f01")
    Object visitSoftwareComponentResourceFilter(SoftwareComponentResourceFilterImporter<? extends SoftwareComponentResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter> softwareComponentResourceFilterImporter);

    @objid ("6e395c8f-692a-4de0-847b-35de7e95a603")
    Object visitUserGroup(UserGroupImporter<? extends UserGroup,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup> userGroupImporter);

    @objid ("d2d95217-eb2b-4fb7-be81-154d9a14edb1")
    Object visitUser(UserImporter<? extends User,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> userImporter);

    @objid ("76874346-25a9-423b-8821-69b808a678ee")
    Object visitProvidedCommunication(ProvidedCommunicationImporter<? extends ProvidedCommunication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> providedCommunicationImporter);

    @objid ("39be1ded-b2c5-49a9-aa95-0eace0169ebc")
    Object visitProvidedHost(ProvidedHostImporter<? extends ProvidedHost,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> providedHostImporter);

    @objid ("96a2cddd-1d6b-4a9a-92a1-22f57ee1b162")
    Object visitRequiredCommunication(RequiredCommunicationImporter<? extends RequiredCommunication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> requiredCommunicationImporter);

    @objid ("06b1c7e3-e734-4e7c-9ad3-3c9ace0bb6dc")
    Object visitRequiredHost(RequiredHostImporter<? extends RequiredHost,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> requiredHostImporter);

    @objid ("48250e47-2032-494d-b70c-cca9e1ef5961")
    Object visitCompositeUnit(CompositeUnitImporter<? extends CompositeUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit> compositeUnitImporter);

    @objid ("6c304c87-158b-49a8-af5a-158e13e5dad6")
    Object visitDimensionedUnit(DimensionedUnitImporter<? extends DimensionedUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit> dimensionedUnitImporter);

    @objid ("17562be7-4f78-4649-b73a-1ce386ccc254")
    Object visitDimensionless(DimensionlessImporter<? extends Dimensionless,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless> dimensionlessImporter);

    @objid ("cbe194f5-d2d1-46b3-8338-7973d6dad792")
    Object visitSingleUnit(SingleUnitImporter<? extends SingleUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit> singleUnitImporter);

    @objid ("0a501264-ce23-47c7-84d4-a895a2a1a243")
    Object visitUnitDimension(UnitDimensionImporter<? extends UnitDimension,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension> unitDimensionImporter);

    @objid ("38595df9-25c8-43f5-9ef8-adebd52cd684")
    Object visitUnit(UnitImporter<? extends Unit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit> unitImporter);

    @objid ("747190cc-a9cb-4bd6-b028-9f4596abcfee")
    Object visitUnitModel(UnitModelImporter<? extends UnitModel,? extends fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel> unitModelImporter);

    @objid ("c2198aa2-5cd9-400b-a4d4-2c30d86ec2e3")
    Object visitCamelComponent(ComponentImporter<? extends Component,? extends CamelComponent> camelComponent);

    @objid ("25efb877-3de4-4d31-bf9c-7a1557fcdf21")
    Object visitDeploymentInstanceModel(DeploymentInstanceModelImporter<? extends DeploymentInstanceModel,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel> deploymentInstanceModelImporter);

    @objid ("29c6c09a-e6ba-41a6-a7d4-349d06ec4ebd")
    Object visitComponent(ComponentImporter<? extends Component,? extends CamelComponent> component);

    @objid ("2e4d7331-1114-48b7-9a65-22a169e08f7e")
    Object visitComponentInstance(ComponentInstanceImporter<? extends ComponentInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance> componentInstance);

    @objid ("4f773a24-938c-49ed-8640-b35b1458f883")
    Object visitSoftwareComponentInstance(SoftwareComponentInstanceImporter<? extends SoftwareComponentInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance> softwareComponentInstance);

    @objid ("aab48cc5-d75b-4f4b-a107-0ae1c30d4474")
    Object visitVMInstance(VMInstanceImporter<? extends VMInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance> vmInstance);

    @objid ("dcf6abce-d754-4ac3-a754-6c9b3c79a8e6")
    Object visitComponentRelationInstance(ComponentRelationInstanceImporter<? extends ComponentRelationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance> componentRelationInstance);

    @objid ("feb5933f-411a-4515-9113-edc1da12d9ae")
    Object visitCommunicationInstance(CommunicationInstanceImporter<? extends CommunicationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance> communicationInstance);

    @objid ("51f864d9-138d-4075-8f26-62eb88ff4332")
    Object visitCommunicationPortInstance(CommunicationPortInstanceImporter<? extends CommunicationPortInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> communicationPortInstance);

    @objid ("d5c02e8c-6d57-41ce-bdd2-a91912154164")
    Object visitProvidedCommunicationInstance(ProvidedCommunicationInstanceImporter<? extends ProvidedCommunicationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> providedCommunicationInstanceImporter);

    @objid ("5f69fb72-ced9-4189-a437-25ff78c151da")
    Object visitRequiredCommunicationInstance(RequiredCommunicationInstanceImporter<? extends RequiredCommunicationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> requiredCommunicationInstanceImporter);

    @objid ("cf80b798-9cda-4f44-9b1d-e12cbc58f523")
    Object visitHostingInstance(HostingInstanceImporter<? extends HostingInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance> hostingInstance);

    @objid ("4340479f-ceea-4586-8af1-16e3ed7b9f14")
    Object visitHostingPortInstance(HostingPortInstanceImporter<? extends HostingPortInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> hostingPortInstance);

    @objid ("cce65274-cd78-4532-b5ed-4c06ebe31d79")
    Object visitProvidedHostInstance(ProvidedHostInstanceImporter<? extends ProvidedHostInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> providedHostInstanceImporter);

    @objid ("0fd1378a-a149-46c1-b68f-3d81bb64d99e")
    Object visitRequiredHostInstance(RequiredHostInstanceImporter<? extends RequiredHostInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> requiredHostInstanceImporter);

    @objid ("557ba0d6-441d-4633-a404-8f85f5372be4")
    Object visitContainerInstance(ContainerInstanceImporter<? extends ContainerInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance> containerInstance);

    @objid ("ff026f3a-9d73-47c1-8b5b-b769f7b93984")
    Object visitPaaSInstance(PaaSInstanceImporter<? extends PaaSInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance> paaSInstance);

    @objid ("0adac4a5-2f3b-43ad-904c-0a102730ff29")
    Object visitConstraintModel(ConstraintModelImporter<? extends ConstraintModel,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel> constraintModelImporter);

    @objid ("17371f58-7f57-44f7-bf0b-d1fb3268bc67")
    Object visitRange(RangeImporter<? extends Range,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range> rangeImporter);

    @objid ("5092a16b-0084-49eb-8cb6-1129a0d7e6d3")
    Object visitValueType(ValueTypeImporter<? extends ValueType,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> valueTypeImporter);

    @objid ("e95b3728-4ec2-4791-96f1-a58fd4fbec39")
    Object visitTypeModel(TypeModelImporter<? extends TypeModel,? extends fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel> typeModelImporter);

    @objid ("bd4db05a-83c9-47ad-9ab5-a6beee69a3f1")
    Object visitStringValueTypeImporter(StringValueTypeImporter<? extends StringValueType,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType> stringValueTypeImporter);

    @objid ("262f20b6-6a75-4844-9a4b-8fb9f7c69692")
    Object visitBooleanValueTypeImporter(BooleanValueTypeImporter<? extends BooleanValueType,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType> booleanValueTypeImporter);

    @objid ("43d8e255-effe-4bcd-a127-954c67e5b896")
    Object visitRangeUnionImporter(RangeUnionImporter<? extends RangeUnion,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion> rangeUnionImporter);

}
