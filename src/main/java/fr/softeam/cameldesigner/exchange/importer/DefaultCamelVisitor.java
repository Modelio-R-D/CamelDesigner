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
<<<<<<< HEAD
import camel.type.BooleanValueType;
import camel.type.Range;
import camel.type.RangeUnion;
import camel.type.StringValue;
=======
import camel.type.Range;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
import camel.type.ValueType;
import camel.unit.CompositeUnit;
import camel.unit.DimensionedUnit;
import camel.unit.Dimensionless;
import camel.unit.SingleUnit;
import camel.unit.Unit;
import camel.unit.UnitDimension;
import camel.unit.UnitModel;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
<<<<<<< HEAD
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType;
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
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
<<<<<<< HEAD
import fr.softeam.cameldesigner.exchange.importer.type.BooleanValueTypeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.RangeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.RangeUnionImporter;
import fr.softeam.cameldesigner.exchange.importer.type.StringValueTypeImporter;
=======
import fr.softeam.cameldesigner.exchange.importer.type.RangeImporter;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

@objid ("41b562b6-15f0-43f5-ae11-1ef1cfebcc6b")
public class DefaultCamelVisitor implements ICamelImporterVisitor {
    @objid ("d9e71c31-4bda-4876-9918-2fee7bad4e5e")
    @Override
    public Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
        return visitNamedElement(feature);
    }

    @objid ("cd4e7ce9-42f0-4c52-b2e0-398d85bc3fc4")
    @Override
    public Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelElt) {
        return null;
    }

    @objid ("57573370-59cc-4be8-b249-811e7e424542")
    @Override
    public Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel) {
        return visitModel(camelModel);
    }

    @objid ("ffeb9cc4-b1a3-41de-9912-e9ff43575c4a")
    @Override
    public Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel) {
        return visitModel(metaDataModel);
    }

    @objid ("3a500741-1742-42a4-818c-ad9e2d8c42ce")
    @Override
    public Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @objid ("faa5b3bb-9320-4fac-b410-a02fcaf3bd61")
    @Override
    public Object visitMmsProperty(MmsPropertyImporter<? extends MmsProperty,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @objid ("c23a9ebc-dbc3-4007-872f-1aec05c43733")
    @Override
    public Object visitMmsPropertyInstance(MmsPropertyInstanceImporter<? extends MmsPropertyInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @objid ("e1f69a9a-d307-45fb-9a76-e3a5ed55a2c2")
    @Override
    public Object visitMmsConceptInstance(MmsConceptInstanceImporter<? extends MmsConceptInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @objid ("c4b6d11b-3add-4f48-a023-345ac42c7310")
    @Override
    public Object visitMmsObject(MmsObjectImporter<? extends MmsObject,? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject> model) {
        return null;
    }

    @objid ("4450f584-18ba-4467-90dc-c2e3ffd1a7f0")
    @Override
    public Object visitModel(SubModelImporter<? extends Model,? extends SubModel> model) {
        return visitFeature(model);
    }

    @objid ("ea189b9c-29cf-41a0-b9ad-ba2d6ab87119")
    @Override
    public Object visitNamedElement(NamedElementImporter<? extends NamedElement,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement) {
        return visitCamelElement(namedElement);
    }

    @objid ("b30eb3a4-4be5-492b-81c7-efb0a38b1238")
    @Override
    public Object visitBuildConfiguration(BuildConfigurationImporter<? extends BuildConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration> buildConfiguration) {
        return visitFeature(buildConfiguration);
    }

    @objid ("37e0a3ab-809d-4b69-89ce-166289bdcf84")
    @Override
    public Object visitClusterConfiguration(ClusterConfigurationImporter<? extends ClusterConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> clusterConfiguration) {
        return visitConfiguration(clusterConfiguration);
    }

    @objid ("2e83584d-9bc0-452c-a8e9-30185286ae6d")
    @Override
    public Object visitCommunication(CommunicationImporter<? extends Communication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> communication) {
        return visitComponentRelation(communication);
    }

    @objid ("9a369dcc-2e1d-42ee-aedc-b86602fb6c49")
    @Override
    public Object visitComponentRelationInstance(ComponentRelationInstanceImporter<? extends ComponentRelationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.ComponentRelationInstance> componentRelationInstance) {
        return visitFeature(componentRelationInstance);
    }

    @objid ("5dd92ff5-13ab-4539-a6dc-6d585275e55b")
    @Override
    public Object visitCommunicationInstance(CommunicationInstanceImporter<? extends CommunicationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance> communicationInstance) {
        return visitComponentRelationInstance(communicationInstance);
    }

    @objid ("261edd6f-7b19-4611-a94f-f21c2eaaf8a5")
    @Override
    public Object visitCommunicationPort(CommunicationPortImporter<? extends CommunicationPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> communicationPort) {
        return visitFeature(communicationPort);
    }

    @objid ("613c5a33-c2f1-454a-be6e-6a9870d8ecec")
    @Override
    public Object visitCommunicationPortInstance(CommunicationPortInstanceImporter<? extends CommunicationPortInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> communicationPortInstance) {
        return visitFeature(communicationPortInstance);
    }

    @objid ("816895cb-3b1e-4216-b07f-aa2ad33404b0")
    @Override
    public Object visitComponentRelation(ComponentRelationImporter<? extends ComponentRelation,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation> componentRelation) {
        return visitFeature(componentRelation);
    }

    @objid ("e34ecace-0407-4c32-b150-a5203d6dd489")
    @Override
    public Object visitComponent(ComponentImporter<? extends Component,? extends CamelComponent> component) {
        return visitFeature(component);
    }

    @objid ("ca7ec4c3-0368-4e91-9474-8fe6d480cadd")
    @Override
    public Object visitComponentInstance(ComponentInstanceImporter<? extends ComponentInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ComponentInstance> componentInstance) {
        return visitFeature(componentInstance);
    }

    @objid ("69cf9cb3-4616-4ade-b088-360b7beaa7fc")
    @Override
    public Object visitConfiguration(ConfigurationImporter<? extends Configuration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration> configuration) {
        return visitFeature(configuration);
    }

    @objid ("d1e7d3dd-b135-4f6b-aa67-fd84f9b2b0af")
    @Override
    public Object visitContainer(ContainerImporter<? extends Container,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> container) {
        return visitComponent(container);
    }

    @objid ("548187d2-49aa-4bf7-991d-f104fb2d73a9")
    @Override
    public Object visitContainerInstance(ContainerInstanceImporter<? extends ContainerInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance> containerInstance) {
        return visitComponentInstance(containerInstance);
    }

    @objid ("516185ff-411d-40bd-94f7-c37934565897")
    @Override
    public Object visitDeploymentModel(DeploymentModelImporter<? extends DeploymentModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel> deploymentModel) {
        return visitModel(deploymentModel);
    }

    @objid ("75360256-7c1f-4159-a95a-6f7347b98202")
    @Override
    public Object visitDeploymentTypeModel(DeploymentTypeModelImporter<? extends DeploymentTypeModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> deploymentTypeModel) {
        return visitDeploymentModel(deploymentTypeModel);
    }

    @objid ("b849e1ee-ea8a-4a98-af3b-c686ee3f15e7")
    @Override
    public Object visitDeploymentInstanceModel(DeploymentInstanceModelImporter<? extends DeploymentInstanceModel,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel> deploymentInstanceModel) {
        return visitDeploymentModel(deploymentInstanceModel);
    }

    @objid ("0af52884-8aeb-4d03-b830-5dc0c46d911c")
    @Override
    public Object visitEventConfiguration(EventConfigurationImporter<? extends EventConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration> eventConfiguration) {
        return visitFeature(eventConfiguration);
    }

    @objid ("c5ad5aed-bc0a-40ef-ae65-09037addacb7")
    @Override
    public Object visitHosting(HostingImporter<? extends Hosting,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> hosting) {
        return visitComponentRelation(hosting);
    }

    @objid ("68991a3b-7f08-403f-9060-a1b4b995b483")
    @Override
    public Object visitHostingInstance(HostingInstanceImporter<? extends HostingInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance> hostingInstance) {
        return visitComponentRelationInstance(hostingInstance);
    }

    @objid ("b0a79483-a1ff-4899-b3fd-65e42c9cdc34")
    @Override
    public Object visitHostingPort(HostingPortImporter<? extends HostingPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> hostingPort) {
        return visitFeature(hostingPort);
    }

    @objid ("763652a9-f04b-412d-9a1a-b9837b38e524")
    @Override
    public Object visitHostingPortInstance(HostingPortInstanceImporter<? extends HostingPortInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> hostingPortInstance) {
        return visitFeature(hostingPortInstance);
    }

    @objid ("10187675-f624-4208-bda2-89764b5590af")
    @Override
    public Object visitLocationCoupling(LocationCouplingImporter<? extends LocationCoupling,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling> locationCoupling) {
        return visitComponentRelation(locationCoupling);
    }

    @objid ("8193b576-c40e-49a1-8008-5f2aef46bc00")
    @Override
    public Object visitPaaSConfiguration(PaaSConfigurationImporter<? extends PaaSConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration> paaSConfiguration) {
        return visitConfiguration(paaSConfiguration);
    }

    @objid ("7c0e9716-d6d4-4b05-ac8a-ca4c549e892a")
    @Override
    public Object visitPaaS(PaaSImporter<? extends PaaS,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS> paaS) {
        return visitComponent(paaS);
    }

    @objid ("a286a92e-99f5-40a6-96a2-3f55975910b4")
    @Override
    public Object visitPaaSInstance(PaaSInstanceImporter<? extends PaaSInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance> paaSInstance) {
        return visitComponentInstance(paaSInstance);
    }

    @objid ("d518a35f-b119-4c47-90de-3b9bef488a7a")
    @Override
    public Object visitRequirementSet(RequirementSetImporter<? extends RequirementSet,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet> requiredSet) {
        return visitFeature(requiredSet);
    }

    @objid ("59e4a3dd-378b-42a5-a9da-b22384361399")
    @Override
    public Object visitScriptConfiguration(ScriptConfiguationImporter<? extends ScriptConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration> scriptConfiguration) {
        return visitConfiguration(scriptConfiguration);
    }

    @objid ("b6ea0541-d6c3-4c84-bdde-26ff09918e77")
    @Override
    public Object visitServelessConfiguration(ServerlessConfigurationImporter<? extends ServerlessConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> serverlessConfiguration) {
        return visitConfiguration(serverlessConfiguration);
    }

    @objid ("80b74db2-8fcb-4e1e-ad20-a33c7ba2453a")
    @Override
    public Object visitSoftwareComponent(SoftwareComponentImporter<? extends SoftwareComponent,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> softwareComponent) {
        return visitComponent(softwareComponent);
    }

    @objid ("8a6e73a1-28c0-41d4-8960-0c99297892c1")
    @Override
    public Object visitSoftwareComponentInstance(SoftwareComponentInstanceImporter<? extends SoftwareComponentInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance> softwareComponentInstance) {
        return visitComponentInstance(softwareComponentInstance);
    }

    @objid ("c999f489-f9a0-45dd-9d98-23f49a28d135")
    @Override
    public Object visitVM(VMImporter<? extends VM,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> vm) {
        return visitComponent(vm);
    }

    @objid ("6e794d3e-0d2a-4158-b3c4-e0b8f8bec36d")
    @Override
    public Object visitVMInstance(VMInstanceImporter<? extends VMInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance> vmInstance) {
        return visitComponentInstance(vmInstance);
    }

    @objid ("280db287-a090-4430-8c49-75dd50f4479d")
    @Override
    public Object visitCloudCredentials(CloudCredentialsImporter<? extends CloudCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials> cloudCredentials) {
        return visitCredentials(cloudCredentials);
    }

    @objid ("22f1d171-15ca-4632-ac4e-d2b0c6d4fb4a")
    @Override
    public Object visitCloudProvider(CloudProviderImporter<? extends CloudProvider,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider> cloudProvider) {
        return visitOrganisation(cloudProvider);
    }

    @objid ("d838f9c8-0934-481f-9058-87cb378a74df")
    @Override
    public Object visitCredentials(CredentialsImporter<? extends Credentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials> credentials) {
        return visitFeature(credentials);
    }

    @objid ("9c408c21-7af4-4416-86ad-52b6b749f114")
    @Override
    public Object visitDataResourceFilter(DataResourceFilterImporter<? extends DataResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> dataResourceFilter) {
        return visitResourceFilter(dataResourceFilter);
    }

    @objid ("903ec275-f7d9-412d-a5a5-5f6992a6080c")
    @Override
    public Object visitEntity(EntityImporter<? extends Entity,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity> entity) {
        return visitFeature(entity);
    }

    @objid ("0339ea03-5002-4b8d-8c19-3d9556c64c31")
    @Override
    public Object visitExternalIdentifier(ExternalIdentifierImporter<? extends ExternalIdentifier,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier> externalIdentifier) {
        return visitFeature(externalIdentifier);
    }

    @objid ("2e46a9f9-e873-4b6d-baf7-0a259059fb9d")
    @Override
    public Object visitModelResourceFilter(ModelResourceFilterImporter<? extends ModelResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter> modelResourceFilter) {
        return visitResourceFilter(modelResourceFilter);
    }

    @objid ("43220c28-d6a5-491c-bf6b-1d7cc20e335f")
    @Override
    public Object visitOrganisation(OrganisationImporter<? extends Organisation,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> organisation) {
        return visitEntity(organisation);
    }

    @objid ("2bc16dd7-47de-4e87-b788-a696bb2c7c46")
    @Override
    public Object visitOrganisationModel(OrganisationModelImporter<? extends OrganisationModel,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> organisationModel) {
        return visitModel(organisationModel);
    }

    @objid ("99bebd22-804b-434a-aa3e-b1686a94eaa9")
    @Override
    public Object visitPermission(PermissionImporter<? extends Permission,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission> permission) {
        return visitFeature(permission);
    }

    @objid ("79ccf538-2c35-471d-81ed-369215810c93")
    @Override
    public Object visitPlatformCredentials(PlatformCredentialsImporter<? extends PlatformCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials> platformCredentials) {
        return visitCredentials(platformCredentials);
    }

    @objid ("91def79f-81a3-42e6-94a2-b0dc26bd926a")
    @Override
    public Object visitResourceFilter(ResourceFilterImporter<? extends ResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter> resourceFilter) {
        return visitFeature(resourceFilter);
    }

    @objid ("516ae2ff-46c0-46bb-8aa1-feb9e9d78bac")
    @Override
    public Object visitRoleAssignment(RoleAssignmentImporter<? extends RoleAssignment,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment> roleAssignment) {
        return visitFeature(roleAssignment);
    }

    @objid ("7f72cff7-8f5f-4283-a9ef-940a43b382a2")
    @Override
    public Object visitRole(RoleImporter<? extends Role,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role> role) {
        return visitFeature(role);
    }

    @objid ("5c8b2cc6-bbdd-421c-9d85-97b650648a3e")
    @Override
    public Object visitServiceResourceFilter(ServiceResourceFilterImporter<? extends ServiceResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter> serviceResourceFilter) {
        return visitResourceFilter(serviceResourceFilter);
    }

    @objid ("4e64d5c3-942c-4693-81ee-f138729ed0b9")
    @Override
    public Object visitSoftwareComponentResourceFilter(SoftwareComponentResourceFilterImporter<? extends SoftwareComponentResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter> softwareComponentResourceFilter) {
        return visitResourceFilter(softwareComponentResourceFilter);
    }

    @objid ("a275e6fa-68fe-4b8f-9145-839dea91e1a7")
    @Override
    public Object visitUserGroup(UserGroupImporter<? extends UserGroup,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup> userGroup) {
        return visitFeature(userGroup);
    }

    @objid ("77ce2568-60c7-4221-8ec5-974b1c37b4a2")
    @Override
    public Object visitUser(UserImporter<? extends User,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> user) {
        return visitEntity(user);
    }

    @objid ("be7a9faa-3078-45e1-b453-1dc2972b1348")
    @Override
    public Object visitCamelComponent(ComponentImporter<? extends camel.deployment.Component,? extends CamelComponent> camelComponent) {
        return visitCamelElement(camelComponent);
    }

    @objid ("4b702efe-cb61-4b22-a25c-97ab5a9d95d7")
    @Override
    public Object visitAttributeContext(AttributeContextImporter<? extends AttributeContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext> attributeContextImporter) {
        return visitFeature(attributeContextImporter);
    }

    @objid ("038ced63-95d3-42e4-9327-e343c0a39607")
    @Override
    public Object visitCompositeMetric(CompositeMetricImporter<? extends CompositeMetric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric> compositeMetricImporter) {
        return visitMetric(compositeMetricImporter);
    }

    @objid ("fca73e27-e525-4f8f-a0e6-155dec24e426")
    @Override
    public Object visitMetric(MetricImporter<? extends Metric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric> metricImporter) {
        return visitFeature(metricImporter);
    }

    @objid ("e1044a5f-9817-4636-9479-ac18b3d050de")
    @Override
    public Object visitCompositeMetricContext(CompositeMetricContextImporter<? extends CompositeMetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext> compositeMetricContextImporter) {
        return visitMetricContext(compositeMetricContextImporter);
    }

    @objid ("c3ff436e-fef3-4a5d-b460-89318504f831")
    @Override
    public Object visitMetricContext(MetricContextImporter<? extends MetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext> metricContextImporter) {
        return visitFeature(metricContextImporter);
    }

    @objid ("8f1dc136-61b2-42d4-a56c-5e00af17071e")
    @Override
    public Object visitFunction(FunctionImporter<? extends Function,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function> functionImporter) {
        return visitFeature(functionImporter);
    }

    @objid ("b7d4bf6e-6d04-4477-813e-6bf98ca9b7db")
    @Override
    public Object visitMetricInstance(MetricInstanceImporter<? extends MetricInstance,? extends fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance> metricInstanceImporter) {
        return visitFeature(metricInstanceImporter);
    }

    @objid ("1bfcb2b2-fb30-4c4f-9e45-b6f58f1a4c3b")
    @Override
    public Object visitMetricInstanceModell(MetricInstanceModelImporter<? extends MetricInstanceModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel> metricInstanceModelImporter) {
        return visitModel(metricInstanceModelImporter);
    }

    @objid ("8d0c3efe-f46c-4d80-9ff5-cc4966c9b5c9")
    @Override
    public Object visitMetricModel(MetricModelImporter<? extends MetricModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel> metricModelImporter) {
        return visitModel(metricModelImporter);
    }

    @objid ("bfc2eba9-73dd-48c1-9a2e-245cac279d49")
    @Override
    public Object visitMetricTypeModel(MetricTypeModelImporter<? extends MetricTypeModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel> metricTypeModelImporter) {
        return visitMetricModel(metricTypeModelImporter);
    }

    @objid ("4d600dda-33a9-40fa-ac12-e73d0e654937")
    @Override
    public Object visitMetricObjectBinding(MetricObjectBindingImporter<? extends MetricObjectBinding,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding> metricObjectBindingImporter) {
        return visitFeature(metricObjectBindingImporter);
    }

    @objid ("10cd4b6a-a7ef-493a-b226-b23535249df0")
    @Override
    public Object visitMetricTemplate(MetricTemplateImporter<? extends MetricTemplate,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate> metricTemplateImporter) {
        return visitFeature(metricTemplateImporter);
    }

    @objid ("eb80b99c-c219-499a-9ede-f3a81ef74d45")
    @Override
    public Object visitMetricVariable(MetricVariableImporter<? extends MetricVariable,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable> metricVariableImporter) {
        return visitMetric(metricVariableImporter);
    }

    @objid ("b968b6ed-38bc-47a9-b44a-5628d50f28b3")
    @Override
    public Object visitObjectContext(ObjectContextImporter<? extends ObjectContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext> objectContextImporter) {
        return visitFeature(objectContextImporter);
    }

    @objid ("cde6254c-c013-42af-8aad-57927fd3159b")
    @Override
    public Object visitRawMetricContext(RawMetricContextImporter<? extends RawMetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext> rawMetricContextImporter) {
        return visitMetricContext(rawMetricContextImporter);
    }

    @objid ("62b2a7e3-744f-4949-9db1-04b8d9b81b12")
    @Override
    public Object visitRawMetric(RawMetricImporter<? extends RawMetric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric> rawMetricImporter) {
        return visitMetric(rawMetricImporter);
    }

    @objid ("d08b76c8-d70e-4d1f-8076-52abf0800b5c")
    @Override
    public Object visitSchedule(ScheduleImporter<? extends Schedule,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule> scheduleImporter) {
        return visitFeature(scheduleImporter);
    }

    @objid ("b154f6e3-43a3-44be-ae2e-c40204e9d4b6")
    @Override
    public Object visitSensor(SensorImporter<? extends Sensor,? extends fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor> sensorImporter) {
        return visitSoftwareComponent(sensorImporter);
    }

    @objid ("d5feb315-1cce-417d-9aec-94c1118dcadf")
    @Override
    public Object visitWindow(WindowImporter<? extends Window,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window> windowImporter) {
        return visitFeature(windowImporter);
    }

    @objid ("db52cd04-4bbf-42db-a6ea-cdfca195ba42")
    @Override
    public Object visitConstraint(CamelConstraintImporter<? extends Constraint,? extends CamelConstraint> camelConstraintImporter) {
        return visitNamedElement(camelConstraintImporter);
    }

    @objid ("27d28be3-334a-462c-9527-6a1f5451371b")
    @Override
    public Object visitConstraintModel(ConstraintModelImporter<? extends ConstraintModel,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel> constraintModelImporter) {
        return visitModel(constraintModelImporter);
    }

    @objid ("65969f12-d1c4-429d-affa-1352d4043836")
    @Override
    public Object visitAttributeConstraint(AttributeConstraintImporter<? extends AttributeConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint> attributeConstraintImporter) {
        return visitUnaryConstraint(attributeConstraintImporter);
    }

    @objid ("f424b188-e8ea-4071-874b-975ac7c58593")
    @Override
    public Object visitUnaryConstraint(UnaryConstraintImporter<? extends UnaryConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint> unaryConstraintImporter) {
        return visitConstraint(unaryConstraintImporter);
    }

    @objid ("85845b9e-9a68-470d-bca9-f82ed6fa03ed")
    @Override
    public Object visitCompositeConstraint(CompositeConstraintImporter<? extends CompositeConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint> compositeConstraintImporter) {
        return visitConstraint(compositeConstraintImporter);
    }

    @objid ("b8bf4ba0-8fe0-424b-8679-cb4ab16ef26c")
    @Override
    public Object visitIfThenConstraint(IfThenConstraintImporter<? extends IfThenConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint> ifThenConstraintImporter) {
        return visitCompositeConstraint(ifThenConstraintImporter);
    }

    @objid ("ec466b01-568d-4e45-8f0c-6e1c27014fce")
    @Override
    public Object visitLogicalConstraint(LogicalConstraintImporter<? extends LogicalConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint> logicalConstraintImporter) {
        return visitCompositeConstraint(logicalConstraintImporter);
    }

    @objid ("9aea330e-909c-4c5f-a281-96b6d5e50475")
    @Override
    public Object visitMetricConstraint(MetricConstraintImporter<? extends MetricConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint> metricConstraintImporter) {
        return visitUnaryConstraint(metricConstraintImporter);
    }

    @objid ("2193c68e-e251-449a-b8d8-8c66e85e2de5")
    @Override
    public Object visitMetricVariableConstraint(MetricVariableConstraintImporter<? extends MetricVariableConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint> metricVariableConstraintImporter) {
        return visitUnaryConstraint(metricVariableConstraintImporter);
    }

    @objid ("5448c05b-ab9e-4fd3-bf30-f34d4c334e6a")
    @Override
    public Object visitHardRequirement(HardRequirementImporter<? extends HardRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement> hardRequirementImporter) {
        return visitRequirement(hardRequirementImporter);
    }

    @objid ("d1061d25-306a-4a6e-806c-c2869df3e851")
    @Override
    public Object visitHorizontalScaleRequirement(HorizontalScaleRequirementImporter<? extends HorizontalScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement> horizontalScaleRequirementImporter) {
        return visitScaleRequirement(horizontalScaleRequirementImporter);
    }

    @objid ("d897c447-b520-4897-9112-9bfffd47f35f")
    @Override
    public Object visitImageRequirement(ImageRequirementImporter<? extends ImageRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement> imageRequirementImporter) {
        return visitHardRequirement(imageRequirementImporter);
    }

    @objid ("bd622151-c3cc-46eb-bab7-4c4fac907357")
    @Override
    public Object visitLocationRequirement(LocationRequirementImporter<? extends LocationRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement> locationRequirementImporter) {
        return visitHardRequirement(locationRequirementImporter);
    }

    @objid ("2fe14cb9-78f5-4f16-916c-c344598ecc29")
    @Override
    public Object visitOptimisationRequirement(OptimisationRequirementImporter<? extends OptimisationRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement> optimisationRequirementImporter) {
        return visitSoftRequirement(optimisationRequirementImporter);
    }

    @objid ("38b70e90-cb76-40ab-a18c-30455c26be97")
    @Override
    public Object visitOSRequirement(OSRequirementImporter<? extends OSRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement> osRequirementImporter) {
        return visitHardRequirement(osRequirementImporter);
    }

    @objid ("8cdb06f9-ae81-4128-aede-0f317c4f4b6e")
    @Override
    public Object visitPaaSRequirement(PaaSRequirementImporter<? extends PaaSRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement> paaSRequirementImporter) {
        return visitHardRequirement(paaSRequirementImporter);
    }

    @objid ("bf8820b2-e50a-41b3-bfb1-b18aa66c81e4")
    @Override
    public Object visitProviderRequirement(ProviderRequirementImporter<? extends ProviderRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement> providerRequirementImporter) {
        return visitHardRequirement(providerRequirementImporter);
    }

    @objid ("28621b90-cc5a-48c9-a131-44c02903ee8c")
    @Override
    public Object visitRequirement(RequirementImporter<? extends Requirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement> requirementImporter) {
        return visitFeature(requirementImporter);
    }

    @objid ("f025759d-98e3-461b-8700-987fe497ae4f")
    @Override
    public Object visitRequirementModel(RequirementModelImporter<? extends RequirementModel,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel> requirementModelImporter) {
        return visitModel(requirementModelImporter);
    }

    @objid ("43ba7e54-ca3d-4431-bf75-ec6639657c98")
    @Override
    public Object visitResourceRequirement(ResourceRequirementImporter<? extends ResourceRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement> resourceRequirementImporter) {
        return visitHardRequirement(resourceRequirementImporter);
    }

    @objid ("426fc312-77c4-43b1-813a-61c8a780683e")
    @Override
    public Object visitScaleRequirement(ScaleRequirementImporter<? extends ScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement> scaleRequirementImporter) {
        return visitHardRequirement(scaleRequirementImporter);
    }

    @objid ("74f75946-7610-4756-a512-4b8d5e16ae15")
    @Override
    public Object visitSecurityRequirement(SecurityRequirementImporter<? extends SecurityRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement> securityRequirementImporter) {
        return visitHardRequirement(securityRequirementImporter);
    }

    @objid ("8825e691-d3b2-41ba-9f47-77e582794ac4")
    @Override
    public Object visitServiceLevelObjective(ServiceLevelObjectiveImporter<? extends ServiceLevelObjective,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective> serviceLevelObjectiveImporter) {
        return visitHardRequirement(serviceLevelObjectiveImporter);
    }

    @objid ("0cf4cf88-8115-4644-92e5-90b27fbf5db6")
    @Override
    public Object visitSoftRequirement(SoftRequirementImporter<? extends SoftRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement> softRequirementImporter) {
        return visitRequirement(softRequirementImporter);
    }

    @objid ("9b33f7d8-a0b4-4461-abca-7c8e9a115bef")
    @Override
    public Object visitVerticalScaleRequirement(VerticalScaleRequirementImporter<? extends VerticalScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement> verticalScaleRequirementImporter) {
        return visitScaleRequirement(verticalScaleRequirementImporter);
    }

    @objid ("7223a9e6-2e12-4a3e-91c9-e3d91ff36a72")
    @Override
    public Object visitActionInstance(ActionInstanceImporter<? extends ActionInstance,? extends fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance> actionInstanceImporter) {
        return visitFeature(actionInstanceImporter);
    }

    @objid ("5dd2347b-b436-44d7-b762-e4061f8a2752")
    @Override
    public Object visitMeasurement(MeasurementImporter<? extends Measurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement> measurementImporter) {
        return visitFeature(measurementImporter);
    }

    @objid ("696c37df-7958-49fa-832a-087a2558afd7")
    @Override
    public Object visitApplicationMeasurement(ApplicationMeasurementImporter<? extends ApplicationMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement> applicationMeasurementImporter) {
        return visitMeasurement(applicationMeasurementImporter);
    }

    @objid ("0b7e61b9-147d-4ad1-820d-d7f551eab968")
    @Override
    public Object visitCause(CauseImporter<? extends Cause,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause> causeImporter) {
        return visitFeature(causeImporter);
    }

    @objid ("1f548c62-563f-4948-aadf-2214f5b6e319")
    @Override
    public Object visitCommunicationMeasurement(CommunicationMeasurementImporter<? extends CommunicationMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement> communicationMeasurementImporter) {
        return visitMeasurement(communicationMeasurementImporter);
    }

    @objid ("ecc84336-2205-47ba-ab16-f3d0a533c7cf")
    @Override
    public Object visitContainerMeasurement(ContainerMeasurementImporter<? extends ContainerMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement> containerMeasurementImporter) {
        return visitMeasurement(containerMeasurementImporter);
    }

    @objid ("297ff8fb-3c39-42c4-abf0-c9e012700790")
    @Override
    public Object visitDataMeasurement(DataMeasurementImporter<? extends DataMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement> dataMeasurementImporter) {
        return visitMeasurement(dataMeasurementImporter);
    }

    @objid ("7292f9c5-133d-46bd-9793-774ee8aeb888")
    @Override
    public Object visitExecutionModel(ExecutionModelImporter<? extends ExecutionModel,? extends fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel> executionModelImporter) {
        return visitModel(executionModelImporter);
    }

    @objid ("23de5c9a-5416-4210-844e-430af094f820")
    @Override
    public Object visitHistoryInfo(HistoryInfoImporter<? extends HistoryInfo,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo> historyInfoImporter) {
        return visitFeature(historyInfoImporter);
    }

    @objid ("8725402c-7f75-4e25-ab77-c5bf852d41ed")
    @Override
    public Object visitHistoryRecord(HistoryRecordImporter<? extends HistoryRecord,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord> historyRecordImporter) {
        return visitFeature(historyRecordImporter);
    }

    @objid ("5c6f236a-f954-4abc-986b-2431b2a9c268")
    @Override
    public Object visitPaaSMeasurement(PaaSMeasurementImporter<? extends PaaSMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement> paaSMeasurementImporter) {
        return visitMeasurement(paaSMeasurementImporter);
    }

    @objid ("87985fbb-8e64-4e0e-b71e-7c17ef34a307")
    @Override
    public Object visitRuleTrigger(RuleTriggerImporter<? extends RuleTrigger,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger> ruleTriggerImporter) {
        return visitCause(ruleTriggerImporter);
    }

    @objid ("2a659be0-1a0c-4c9e-b58d-e5457fc51b25")
    @Override
    public Object visitSLOViolation(SLOViolationImporter<? extends SLOViolation,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation> sloViolationImporter) {
        return visitCause(sloViolationImporter);
    }

    @objid ("e15526d0-5e50-4274-b2d7-0add8157117c")
    @Override
    public Object visitSoftwareComponentMeasurement(SoftwareComponentMeasurementImporter<? extends SoftwareComponentMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement> softwareComponentMeasurementImporter) {
        return visitMeasurement(softwareComponentMeasurementImporter);
    }

    @objid ("a0f2f77d-2190-4de3-bcca-d7d5456fbe17")
    @Override
    public Object visitVMMeasurement(VMMeasurementImporter<? extends VMMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement> vmMeasurementImporter) {
        return visitMeasurement(vmMeasurementImporter);
    }

    @objid ("162159fe-6dd0-447e-a415-a44a45e0615a")
    @Override
    public Object visitCloudLocation(CloudLocationImporter<? extends CloudLocation,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation> cloudLocationImporter) {
        return visitLocation(cloudLocationImporter);
    }

    @objid ("ee0e989c-b5a8-46c5-aad1-6027dc99705e")
    @Override
    public Object visitLocation(LocationImporter<? extends Location,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location> locationImporter) {
        return visitFeature(locationImporter);
    }

    @objid ("9cc4f7b0-9d2c-44f2-b27c-99cb5efaee51")
    @Override
    public Object visitLocationModel(LocationModelImporter<? extends LocationModel,? extends fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel> locationModelImporter) {
        return visitModel(locationModelImporter);
    }

    @objid ("e105ca70-0c28-4ba0-afd7-25de335a893b")
    @Override
    public Object visitGeographicalRegion(GeographicalRegionImporter<? extends GeographicalRegion,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion> geographicalRegionImporter) {
        return visitLocation(geographicalRegionImporter);
    }

    @objid ("8e3b5a07-a235-4464-8f6c-3a05a97b1861")
    @Override
    public Object visitData(DataImporter<? extends Data,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.Data> dataImporter) {
        return visitFeature(dataImporter);
    }

    @objid ("c40b0fbc-6b2b-4413-a726-f3769e57d559")
    @Override
    public Object visitDataInstance(DataInstanceImporter<? extends DataInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance> dataInstanceImporter) {
        return visitFeature(dataInstanceImporter);
    }

    @objid ("6cfc5d26-6fa4-47b9-acf1-900dc575bc33")
    @Override
    public Object visitDataInstanceModel(DataInstanceModelImporter<? extends DataInstanceModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel> dataInstanceModelImporter) {
        return visitDataModel(dataInstanceModelImporter);
    }

    @objid ("103eb690-0462-4e44-8d26-cd5f03a27c43")
    @Override
    public Object visitDataModel(DataModelImporter<? extends DataModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel> dataModelImporter) {
        return visitModel(dataModelImporter);
    }

    @objid ("97daf7c9-1333-483b-9c04-cee38946f323")
    @Override
    public Object visitDataSource(DataSourceImporter<? extends DataSource,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource> dataSourceImporter) {
        return visitFeature(dataSourceImporter);
    }

    @objid ("2769f24d-f0be-45d3-8510-5594df3d9f6e")
    @Override
    public Object visitDataSourceInstance(DataSourceInstanceImporter<? extends DataSourceInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance> dataSourceInstanceImporter) {
        return visitFeature(dataSourceInstanceImporter);
    }

    @objid ("a0cc4be0-46da-4626-8a54-81ce041b0a10")
    @Override
    public Object visitDataTypeModel(DataTypeModelImporter<? extends DataTypeModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel> dataTypeModelImporter) {
        return visitDataModel(dataTypeModelImporter);
    }

    @objid ("1b68dc0c-c2ec-48fd-9c6f-e4a0219b13d6")
    @Override
    public Object visitBinaryEventPattern(BinaryEventPatternImporter<? extends BinaryEventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern> binaryEventPatternImporter) {
        return visitEventPattern(binaryEventPatternImporter);
    }

    @objid ("042a4d68-473a-4f20-85fb-6af1969d58d2")
    @Override
    public Object visitEvent(EventImporter<? extends Event,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event> eventImporter) {
        return visitFeature(eventImporter);
    }

    @objid ("712ce338-6866-423d-bb95-33d768c127f7")
    @Override
    public Object visitScalabilityModel(ScalabilityModelImporter<? extends ScalabilityModel,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel> scalabilityModelImporter) {
        return visitModel(scalabilityModelImporter);
    }

    @objid ("4a426d2e-b484-47f1-9c47-c329acd60af9")
    @Override
    public Object visitEventInstance(EventInstanceImporter<? extends EventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance> eventInstanceImporter) {
        return visitFeature(eventInstanceImporter);
    }

    @objid ("19e76d50-c816-47d0-9251-3f84f45a00a3")
    @Override
    public Object visitEventPattern(EventPatternImporter<? extends EventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern> eventPatternImporter) {
        return visitEvent(eventPatternImporter);
    }

    @objid ("becc9077-11ed-4561-b98b-4c826f9479d9")
    @Override
    public Object visitFunctionalEvent(FunctionalEventImporter<? extends FunctionalEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent> functionalEventImporter) {
        return visitSingleEvent(functionalEventImporter);
    }

    @objid ("63b324a8-5002-41c2-9e5c-6a24b868c37d")
    @Override
    public Object visitFunctionalEventInstance(FunctionalEventInstanceImporter<? extends FunctionalEventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance> functionalEventInstanceImporter) {
        return visitEventInstance(functionalEventInstanceImporter);
    }

    @objid ("52873c01-e393-4a7c-92dd-f6e2dba26e91")
    @Override
    public Object visitHorizontalScalingAction(HorizontalScalingActionImporter<? extends HorizontalScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction> horizontalScalingActionImporter) {
        return visitScalingAction(horizontalScalingActionImporter);
    }

    @objid ("4c8f3165-8900-4c0e-a970-0548921bb179")
    @Override
    public Object visitNonFunctionalEvent(NonFunctionalEventImporter<? extends NonFunctionalEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent> nonFunctionalEventImporter) {
        return visitSingleEvent(nonFunctionalEventImporter);
    }

    @objid ("6066c045-bc82-4090-8abb-6710f5d92075")
    @Override
    public Object visitNonFunctionalEventInstance(NonFunctionalEventInstanceImporter<? extends NonFunctionalEventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance> nonFunctionalEventInstanceImporter) {
        return visitEventInstance(nonFunctionalEventInstanceImporter);
    }

    @objid ("03d5c0bf-3039-4f41-b8f6-146a54855bdb")
    @Override
    public Object visitScalabilityRule(ScalabilityRuleImporter<? extends ScalabilityRule,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule> scalabilityRuleImporter) {
        return visitFeature(scalabilityRuleImporter);
    }

    @objid ("3a30c706-c5ea-40c9-996f-98f243a6a179")
    @Override
    public Object visitAction(ActionImporter<? extends Action,? extends fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action> actionImporter) {
        return visitFeature(actionImporter);
    }

    @objid ("0b4d245f-ca04-46cb-bb06-57950b02f03a")
    @Override
    public Object visitScalingAction(ScalingActionImporter<? extends ScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction> scalingActionImporter) {
        return visitAction(scalingActionImporter);
    }

    @objid ("c06ce308-730b-4a58-b07e-d93068ae10b7")
    @Override
    public Object visitSingleEvent(SingleEventImporter<? extends SingleEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent> singleEventImporter) {
        return visitEvent(singleEventImporter);
    }

    @objid ("b5b1c494-d760-4729-8342-54490a721a7f")
    @Override
    public Object visitTimer(TimerImporter<? extends Timer,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer> timerImporter) {
        return visitFeature(timerImporter);
    }

    @objid ("c34261ca-b340-46eb-86e7-6a67812d11d4")
    @Override
    public Object visitUnaryEventPattern(UnaryEventPatternImporter<? extends UnaryEventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern> unaryEventPatternImporter) {
        return visitEventPattern(unaryEventPatternImporter);
    }

    @objid ("eb5d7f69-22b9-4c42-b3d4-3353290a2831")
    @Override
    public Object visitVerticalScalingAction(VerticalScalingActionImporter<? extends VerticalScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction> verticalScalingActionImporter) {
        return visitScalingAction(verticalScalingActionImporter);
    }

    @objid ("126c1f8e-bf2c-4c97-838a-c3caa76fb133")
    @Override
    public Object visitCertifiable(CertifiableImporter<? extends Certifiable,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable> certifiableImporter) {
        return visitSecurityAttribute(certifiableImporter);
    }

    @objid ("b38ad6f4-3f05-4f88-83ec-09a5d1609d7c")
    @Override
    public Object visitAttribute(AttributeImporter<? extends Attribute,? extends CamelAttribute> attributeImporter) {
        return visitNamedElement(attributeImporter);
    }

    @objid ("481febcd-0aec-490d-b79a-c632eae6ca6f")
    @Override
    public Object visitQualityAttribute(QualityAttributeImporter<? extends QualityAttribute,? extends CamelAttribute> qualityAttributeImporter) {
        return visitAttribute(qualityAttributeImporter);
    }

    @objid ("af5544a9-0421-44ce-b456-d821eebbf8e6")
    @Override
    public Object visitMeasurableAttribute(MeasurableAttributeImporter<? extends MeasurableAttribute,? extends CamelAttribute> measurableAttributeImporter) {
        return visitQualityAttribute(measurableAttributeImporter);
    }

    @objid ("37c07622-9171-4762-9152-b90dba3760d3")
    @Override
    public Object visitSecurityAttribute(SecurityAttributeImporter<? extends SecurityAttribute,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute> securityAttributeImporter) {
        return visitQualityAttribute(securityAttributeImporter);
    }

    @objid ("f82f6d13-96fa-4b1b-b390-b199e89d6e64")
    @Override
    public Object visitCompositeSecurityMetric(CompositeSecurityMetricImporter<? extends CompositeSecurityMetric,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric> compositeSecurityMetricImporter) {
        return visitCompositeMetric(compositeSecurityMetricImporter);
    }

    @objid ("89770dc8-5e51-40ea-a803-b0b9337f4ffb")
    @Override
    public Object visitRawSecurityMetric(RawSecurityMetricImporter<? extends RawSecurityMetric,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric> rawSecurityMetricImporter) {
        return visitRawMetric(rawSecurityMetricImporter);
    }

    @objid ("108325b8-2059-478f-a1be-5f04cf5a29f9")
    @Override
    public Object visitSecurityControl(SecurityControlImporter<? extends SecurityControl,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl> securityControlImporter) {
        return visitFeature(securityControlImporter);
    }

    @objid ("98cbde43-abc4-4eea-8edf-606e04547a43")
    @Override
    public Object visitSecurityDomain(SecurityDomainImporter<? extends SecurityDomain,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain> securityDomainImporter) {
        return visitFeature(securityDomainImporter);
    }

    @objid ("7aeb95a9-a6d6-407b-8aac-9111713804b9")
    @Override
    public Object visitSecurityMetricInstance(SecurityMetricInstanceImporter<? extends SecurityMetricInstance,? extends fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance> securityMetricInstanceImporter) {
        return visitMetricInstance(securityMetricInstanceImporter);
    }

    @objid ("d654e915-3740-4d0c-9120-d725010dfbcb")
    @Override
    public Object visitSecurityModel(SecurityModelImporter<? extends SecurityModel,? extends fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel> securityModelImporter) {
        return visitModel(securityModelImporter);
    }

    @objid ("ffae119f-db9c-415b-94c7-5c4454a753e0")
    @Override
    public Object visitSecuritySLO(SecuritySLOImporter<? extends SecuritySLO,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO> securitySLOImporter) {
        return visitServiceLevelObjective(securitySLOImporter);
    }

    @objid ("4d4f24fb-15ae-4dd6-be6d-53b8e490bc3e")
    @Override
    public Object visitProvidedCommunication(ProvidedCommunicationImporter<? extends ProvidedCommunication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> providedCommunicationImporter) {
        return visitCommunicationPort(providedCommunicationImporter);
    }

    @objid ("87cfee0a-65eb-4fb0-9ad8-2d9bed11ed4c")
    @Override
    public Object visitProvidedCommunicationInstance(ProvidedCommunicationInstanceImporter<? extends ProvidedCommunicationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> providedCommunicationInstanceImporter) {
        return visitCommunicationPortInstance(providedCommunicationInstanceImporter);
    }

    @objid ("385ac912-feca-4005-bd98-95c35ee423a3")
    @Override
    public Object visitProvidedHost(ProvidedHostImporter<? extends ProvidedHost,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> providedHostImporter) {
        return visitHostingPort(providedHostImporter);
    }

    @objid ("1134f756-4a09-47ab-b2f6-25ba131d6499")
    @Override
    public Object visitProvidedHostInstance(ProvidedHostInstanceImporter<? extends ProvidedHostInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> providedHostInstanceImporter) {
        return visitHostingPortInstance(providedHostInstanceImporter);
    }

    @objid ("b06a1fdd-2472-4e61-975f-978886fdac09")
    @Override
    public Object visitRequiredCommunication(RequiredCommunicationImporter<? extends RequiredCommunication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> requiredCommunicationImporter) {
        return visitCommunicationPort(requiredCommunicationImporter);
    }

    @objid ("239cbc84-4742-425a-81be-ae07e6d103a6")
    @Override
    public Object visitRequiredCommunicationInstance(RequiredCommunicationInstanceImporter<? extends RequiredCommunicationInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance> requiredCommunicationInstanceImporter) {
        return visitCommunicationPortInstance(requiredCommunicationInstanceImporter);
    }

    @objid ("497ea0ae-e22c-4cab-b52b-6fabad6307e8")
    @Override
    public Object visitRequiredHost(RequiredHostImporter<? extends RequiredHost,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> requiredHostImporter) {
        return visitHostingPort(requiredHostImporter);
    }

    @objid ("0f3b4e02-0f79-4144-aa02-6938da70cba5")
    @Override
    public Object visitRequiredHostInstance(RequiredHostInstanceImporter<? extends RequiredHostInstance,? extends fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance> requiredHostInstanceImporter) {
        return visitHostingPortInstance(requiredHostInstanceImporter);
    }

    @objid ("9315975c-db78-4709-b5f4-3f06caf24aef")
    @Override
    public Object visitCompositeUnit(CompositeUnitImporter<? extends CompositeUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit> compositeUnitImporter) {
        return visitDimensionedUnit(compositeUnitImporter);
    }

    @objid ("dab660b2-a86e-41d0-8216-9264f0bc006f")
    @Override
    public Object visitDimensionedUnit(DimensionedUnitImporter<? extends DimensionedUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit> dimensionedUnitImporter) {
        return visitUnit(dimensionedUnitImporter);
    }

    @objid ("91c723ba-dd22-4ea5-a555-f5ab3944c158")
    @Override
    public Object visitDimensionless(DimensionlessImporter<? extends Dimensionless,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless> dimensionlessImporter) {
        return visitUnit(dimensionlessImporter);
    }

    @objid ("a57978c4-75e4-46ea-92da-917a3a107171")
    @Override
    public Object visitSingleUnit(SingleUnitImporter<? extends SingleUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit> singleUnitImporter) {
        return visitDimensionedUnit(singleUnitImporter);
    }

    @objid ("5e0bacec-753a-4b1d-934d-18f53f737d82")
    @Override
    public Object visitUnitDimension(UnitDimensionImporter<? extends UnitDimension,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension> unitDimensionImporter) {
        return visitFeature(unitDimensionImporter);
    }

    @objid ("e9e6f827-94f2-4260-95e9-5f9723934d82")
    @Override
    public Object visitUnit(UnitImporter<? extends Unit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit> unitImporter) {
        return visitFeature(unitImporter);
    }

    @objid ("cfdf8680-3fb5-4e3b-85ce-8ec1d58d1a0e")
    @Override
    public Object visitUnitModel(UnitModelImporter<? extends UnitModel,? extends fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel> unitModelImporter) {
        return visitModel(unitModelImporter);
    }

    @objid ("28d80d75-0115-4167-b953-279ae4e8eb59")
    @Override
    public Object visitValueType(ValueTypeImporter<? extends ValueType,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.ValueType> valueTypeImporter) {
        return visitNamedElement(valueTypeImporter);
    }

    @objid ("f6669b95-a1ec-4ccf-add7-9a0fc1e6c170")
    @Override
    public Object visitRange(RangeImporter<? extends Range,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range> rangeImporter) {
        return visitValueType(rangeImporter);
    }

    @objid ("87c6ec5b-71f4-465a-b27e-6faf482f59c4")
    @Override
    public Object visitTypeModel(TypeModelImporter<? extends camel.type.TypeModel,? extends TypeModel> typeModelImporter) {
        return visitModel(typeModelImporter);
    }

<<<<<<< HEAD
    @objid ("77cf91bc-7b2e-4b6c-a7e5-bebf1cdb1f5f")
    @Override
    public Object visitStringValueTypeImporter(StringValueTypeImporter<? extends camel.type.StringValueType,? extends StringValueType> stringValueTypeImporter) {
        return visitValueType(stringValueTypeImporter);
    }

    @objid ("6f7bb6d4-e77b-42cd-8880-cfa7161e53f8")
    @Override
    public Object visitBooleanValueTypeImporter(BooleanValueTypeImporter<? extends BooleanValueType,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType> booleanValueTypeImporter) {
        return visitValueType(booleanValueTypeImporter);
    }

    @objid ("d20288ea-4338-4749-a07d-059007702bbd")
    @Override
    public Object visitRangeUnionImporter(RangeUnionImporter<? extends RangeUnion,? extends fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion> rangeUnionImporter) {
        return visitValueType(rangeUnionImporter);
    }

=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
}
