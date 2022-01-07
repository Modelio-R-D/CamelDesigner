/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.handlers.propertypages;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.BooleanValue;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.DoubleValue;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.FloatValue;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.IntValue;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.Limit;
import fr.softeam.cameldesigner.api.typemodel.standard.class_.StringValue;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.List;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.handlers.propertypages.core.ApplicationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.AttributeAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.AttributeClassPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.CamelModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureClassPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeatureInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.FeaturePortPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.MeasurableAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.core.QualityAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.data.DataInstanceModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.data.DataInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.data.DataPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.data.DataSourceInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.data.DataSourcePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.data.DataTypeModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.BuildConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.ClusterConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.CommunicationPortPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.CommunicationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.ContainerPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.DeploymentTypeModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.EventConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.HostingPortPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.HostingPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.LocationCouplingPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.PaaSConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.PaaSPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.RequirementSetPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.ScriptConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.ServerlessConfigurationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.SoftwareComponentPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deployment.VMPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.CommunicationInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.ContainerInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.DeploymentInstanceModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.HostingInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.PaaSInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.SoftwareComponentInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.deploymentinstance.VMInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.CamelModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.DataInstanceModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.DataModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.DeploymentInstanceModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.DeploymentModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.ExecutionModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.LocationModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.MetadataModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.MetricModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.OrganisationModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.RequirementModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.ScalabilityModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.SecurityModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.TypeModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.diagram.UnitModelDiagramPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.ApplicationMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.CausePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.CommunicationMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.ContainerMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.DataMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.ExecutionModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.HistoryInfoPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.HistoryRecordPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.PaaSMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.RuleTriggerPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.SLOViolationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.SoftwareComponentMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.execution.VMMeasurementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.location.CloudLocationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.location.GeographicalRegionPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.location.LocationModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metadata.MetaDataModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metadata.MmsConceptInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metadata.MmsConceptPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metadata.MmsPropertyInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metadata.MmsPropertyPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.AttributeContextPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.CompositeMetricContextPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.CompositeMetricPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.FunctionPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricInstanceModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricObjectBindingPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricTemplatePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricTypeModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.MetricVariablePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.ObjectContextPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.RawMetricContextPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.RawMetricPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.SchedulePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.SensorPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.metric.WindowPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.CloudCredentialsPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.CloudProviderPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.DataResourceFilterPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.EntityPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.ExternalIdentifierPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.ModelResourceFilterPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.OrganisationModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.OrganisationPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.PermissionPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.PlatformCredentialsPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.RoleAssignmentPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.RolePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.ServiceResourceFilterPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.SoftwareComponentResourceFilterPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.UserGroupPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.organisation.UserPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.HorizontalScaleRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.ImageRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.LocationRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.OSRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.OptimisationRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.PaaSRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.ProviderRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.RequirementModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.ResourceRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.SecurityRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.ServiceLevelObjectivePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.requirement.VerticalScaleRequirementPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.BinaryEventPatternPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.FunctionalEventInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.FunctionalEventPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.HorizontalScalingActionPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.NonFunctionalEventInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.NonFunctionalEventPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.ScalabilityModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.ScalabilityRulePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.TimerPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.UnaryEventPatternPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.scalability.VerticalScalingActionPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.CertifiablePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.CompositeSecurityMetricPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.RawSecurityMetricPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.SecurityAttributePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.SecurityControlPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.SecurityDomainPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.SecurityMetricInstancePropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.SecurityModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.security.SecuritySLOPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.type.TypeModelPropertyPage;
import fr.softeam.cameldesigner.handlers.propertypages.unit.UnitModelPropertyPage;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right proxy class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 * <h2>Module description:</h2>
 * <br/><i>Modelio Module for designing the Cloud Application Modelling and Execution Language (CAMEL). For more information about CAMEL see http://camel-dsl.org/</i></p>
 * <h2>Supported stereotypes:</h2>
 * <ul><li><< CamelModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link CamelModel}
 * <li><< Attribute_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link AttributeClass}
 * <li><< QualityAttribute >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link QualityAttribute}
 * <li><< MeasurableAttribute >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MeasurableAttribute}
 * <li><< Application >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Application}
 * <li><< PropertyDependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link PropertyDependency}
 * <li><< Annotation >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link Annotation}
 * <li><< Feature_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FeatureClass}
 * <li><< Feature_Port >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link FeaturePort}
 * <li><< Feature_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link FeatureInstance}
 * <li><< Attribute_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link AttributeAttribute}
 * <li><< CamelViewPoint >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link CamelViewPoint}
 * <li><< ExecutionModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ExecutionModelDiagram}
 * <li><< MetricModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link MetricModelDiagram}
 * <li><< DataModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DataModelDiagram}
 * <li><< LocationModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link LocationModelDiagram}
 * <li><< RequirementModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link RequirementModelDiagram}
 * <li><< ConstraintModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ConstraintModelDiagram}
 * <li><< MetadataModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link MetadataModelDiagram}
 * <li><< OrganisationModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link OrganisationModelDiagram}
 * <li><< ScalabilityModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ScalabilityModelDiagram}
 * <li><< DeploymentModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DeploymentModelDiagram}
 * <li><< SecurityModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link SecurityModelDiagram}
 * <li><< TypeModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link TypeModelDiagram}
 * <li><< UnitModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link UnitModelDiagram}
 * <li><< CamelModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link CamelModelDiagram}
 * <li><< DeploymentInstanceModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DeploymentInstanceModelDiagram}
 * <li><< DataInstanceModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DataInstanceModelDiagram}
 * <li><< ConstraintModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ConstraintModel}
 * <li><< DataTypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DataTypeModel}
 * <li><< DataInstanceModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DataInstanceModel}
 * <li><< Data >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Data}
 * <li><< DataSource >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DataSource}
 * <li><< DataInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link DataInstance}
 * <li><< DataSourceInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link DataSourceInstance}
 * <li><< CommunicationInstance >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link CommunicationInstance}
 * <li><< ContainerInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ContainerInstance}
 * <li><< DeploymentInstanceModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DeploymentInstanceModel}
 * <li><< HostingInstance >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link HostingInstance}
 * <li><< PaaSInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link PaaSInstance}
 * <li><< SoftwareComponentInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SoftwareComponentInstance}
 * <li><< VMInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link VMInstance}
 * <li><< BuildConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link BuildConfiguration}
 * <li><< ClusterConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link ClusterConfiguration}
 * <li><< Communication >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link Communication}
 * <li><< CommunicationPort >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link CommunicationPort}
 * <li><< Container >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link Container}
 * <li><< DeploymentModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DeploymentModel}
 * <li><< DeploymentTypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DeploymentTypeModel}
 * <li><< EventConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link EventConfiguration}
 * <li><< Hosting >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link Hosting}
 * <li><< HostingPort >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link HostingPort}
 * <li><< LocationCoupling >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link LocationCoupling}
 * <li><< PaaS >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link PaaS}
 * <li><< PaaSConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link PaaSConfiguration}
 * <li><< RequirementSet >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RequirementSet}
 * <li><< ScriptConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link ScriptConfiguration}
 * <li><< ServerlessConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link ServerlessConfiguration}
 * <li><< SoftwareComponent >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link SoftwareComponent}
 * <li><< VM >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link VM}
 * <li><< ExecutionModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ExecutionModel}
 * <li><< ActionInstance >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ActionInstance}
 * <li><< ApplicationMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ApplicationMeasurement}
 * <li><< CommunicationMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CommunicationMeasurement}
 * <li><< HistoryRecord >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HistoryRecord}
 * <li><< PaaSMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PaaSMeasurement}
 * <li><< ContainerMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ContainerMeasurement}
 * <li><< SoftwareComponentMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SoftwareComponentMeasurement}
 * <li><< VMMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link VMMeasurement}
 * <li><< HistoryInfo >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HistoryInfo}
 * <li><< SLOViolation >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SLOViolation}
 * <li><< Cause >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Cause}
 * <li><< DataMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DataMeasurement}
 * <li><< RuleTrigger >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RuleTrigger}
 * <li><< LocationModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link LocationModel}
 * <li><< CloudLocation >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link CloudLocation}
 * <li><< GeographicalRegion >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link GeographicalRegion}
 * <li><< MetaDataModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link MetaDataModel}
 * <li><< MmsConcept >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MmsConcept}
 * <li><< MmsProperty >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link MmsProperty}
 * <li><< MmsConceptInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MmsConceptInstance}
 * <li><< MmsPropertyInstance >> on a {@link org.modelio.metamodel.uml.statik.AttributeLink}: instantiates a {@link MmsPropertyInstance}
 * <li><< AttributeContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link AttributeContext}
 * <li><< CompositeMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CompositeMetric}
 * <li><< CompositeMetricContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CompositeMetricContext}
 * <li><< Function >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Function}
 * <li><< MetricInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MetricInstance}
 * <li><< MetricInstanceModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link MetricInstanceModel}
 * <li><< MetricObjectBinding >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MetricObjectBinding}
 * <li><< MetricTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MetricTemplate}
 * <li><< MetricTypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link MetricTypeModel}
 * <li><< MetricVariable >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MetricVariable}
 * <li><< ObjectContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ObjectContext}
 * <li><< RawMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RawMetric}
 * <li><< RawMetricContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RawMetricContext}
 * <li><< Schedule >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Schedule}
 * <li><< Sensor >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link Sensor}
 * <li><< Window >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Window}
 * <li><< OrganisationModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link OrganisationModel}
 * <li><< ExternalIdentifier >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ExternalIdentifier}
 * <li><< Permission >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Permission}
 * <li><< Entity >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Entity}
 * <li><< CloudProvider >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CloudProvider}
 * <li><< ModelResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ModelResourceFilter}
 * <li><< Organisation >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Organisation}
 * <li><< User >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link User}
 * <li><< Role >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Role}
 * <li><< ServiceResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ServiceResourceFilter}
 * <li><< RoleAssignment >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RoleAssignment}
 * <li><< UserGroup >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link UserGroup}
 * <li><< PlatformCredentials >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PlatformCredentials}
 * <li><< DataResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DataResourceFilter}
 * <li><< CloudCredentials >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CloudCredentials}
 * <li><< SoftwareComponentResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SoftwareComponentResourceFilter}
 * <li><< HorizontalScaleRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HorizontalScaleRequirement}
 * <li><< ImageRequirement >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link ImageRequirement}
 * <li><< LocationRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link LocationRequirement}
 * <li><< OSRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link OSRequirement}
 * <li><< OptimisationRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link OptimisationRequirement}
 * <li><< PaaSRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PaaSRequirement}
 * <li><< ProviderRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ProviderRequirement}
 * <li><< RequirementModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link RequirementModel}
 * <li><< ResourceRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ResourceRequirement}
 * <li><< SecurityRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityRequirement}
 * <li><< ServiceLevelObjective >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ServiceLevelObjective}
 * <li><< VerticalScaleRequirement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link VerticalScaleRequirement}
 * <li><< ScalabilityModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ScalabilityModel}
 * <li><< UnaryEventPattern >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link UnaryEventPattern}
 * <li><< FunctionalEvent >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FunctionalEvent}
 * <li><< BinaryEventPattern >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link BinaryEventPattern}
 * <li><< NonFunctionalEvent >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link NonFunctionalEvent}
 * <li><< ScalabilityRule >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ScalabilityRule}
 * <li><< NonFunctionalEventInstance >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link NonFunctionalEventInstance}
 * <li><< FunctionalEventInstance >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FunctionalEventInstance}
 * <li><< HorizontalScalingAction >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HorizontalScalingAction}
 * <li><< VerticalScalingAction >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link VerticalScalingAction}
 * <li><< Timer >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Timer}
 * <li><< SecurityModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link SecurityModel}
 * <li><< SecurityDomain >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityDomain}
 * <li><< SecurityControl >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityControl}
 * <li><< SecurityMetricInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SecurityMetricInstance}
 * <li><< RawSecurityMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RawSecurityMetric}
 * <li><< SecurityAttribute >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityAttribute}
 * <li><< Certifiable >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Certifiable}
 * <li><< CompositeSecurityMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CompositeSecurityMetric}
 * <li><< SecuritySLO >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecuritySLO}
 * <li><< TypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link TypeModel}
 * <li><< Limit >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Limit}
 * <li><< StringValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link StringValue}
 * <li><< BooleanValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link BooleanValue}
 * <li><< IntValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link IntValue}
 * <li><< FloatValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FloatValue}
 * <li><< List >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link List}
 * <li><< DoubleValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DoubleValue}
 * <li><< BooleanValueType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link BooleanValueType}
 * <li><< StringValueType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link StringValueType}
 * <li><< RangeUnion >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link RangeUnion}
 * <li><< Range >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link Range}
 * <li><< UnitModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link UnitModel}
 * <li><< UnitDimension >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link UnitDimension}
 * <li><< Dimensionless >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link Dimensionless}
 * <li><< SingleUnit >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link SingleUnit}
 * <li><< CompositeUnit >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link CompositeUnit}
 * </ul>
 */
@objid ("eb463974-7912-4ae7-938e-15d50d54f51a")
public class CamelDesignerPropertyPageFactory {
    @objid ("81881bdf-5680-47bf-8782-36d3a9a4d86b")
    private static final PropertyPageVisitor propertyVisitor = new PropertyPageVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CamelDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("421d5784-c31b-41f2-8e84-fb05df25016b")
    public static final Object instantiatePropertyPage(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
            ModuleComponent module = s.getModule();
            if (module != null && module.getName().equals(ICamelDesignerPeerModule.MODULE_NAME)) {
                return instantiatePropertyPage(e, s.getName());
            }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'CamelDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("33aeb9ea-d643-4b55-8c5b-11c7df82eec4")
    public static final Object instantiatePropertyPage(final Element e, final String stName) {
        propertyVisitor.setStereotype(stName);
        return e.accept(propertyVisitor);
    }

    @objid ("18563f46-96b0-4137-bf2c-f82a64e467d9")
    private static class PropertyPageVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("8bbd6a2f-ed17-4779-a468-d61617ab0386")
        private String stName;

        @objid ("978eac80-3ce0-45b6-ae6f-e6916b1cd570")
        @Override
        public final Object visitGeneralClass(GeneralClass obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitGeneralClass(obj);
        }

        @objid ("a0a7cb12-f71d-4fe2-9724-7a3f6a164251")
        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @objid ("7a56cec7-e0ff-4779-8e14-c957ba25d370")
        @Override
        public final Object visitComponent(Component obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.STEREOTYPE_NAME: return new ContainerPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.STEREOTYPE_NAME: return new PaaSPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.STEREOTYPE_NAME: return new SoftwareComponentPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.STEREOTYPE_NAME: return new VMPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.STEREOTYPE_NAME: return new SensorPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitComponent(obj);
        }

        @objid ("fe3e0bc8-aa07-4e4e-8304-180fad8b669d")
        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.STEREOTYPE_NAME: return new NonFunctionalEventInstancePropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.STEREOTYPE_NAME: return new FunctionalEventInstancePropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.STEREOTYPE_NAME: return new FeatureInstancePropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.STEREOTYPE_NAME: return new DataInstancePropertyPage<>(fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.STEREOTYPE_NAME: return new DataSourceInstancePropertyPage<>(fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.STEREOTYPE_NAME: return new ContainerInstancePropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.STEREOTYPE_NAME: return new PaaSInstancePropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.STEREOTYPE_NAME: return new SoftwareComponentInstancePropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.STEREOTYPE_NAME: return new VMInstancePropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.STEREOTYPE_NAME: return new MmsConceptInstancePropertyPage<>(fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.STEREOTYPE_NAME: return new MetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @objid ("11ef090f-3d77-4595-a3e9-8b76f53bcecb")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.STEREOTYPE_NAME: return new AttributeClassPropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute.STEREOTYPE_NAME: return new QualityAttributePropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.STEREOTYPE_NAME: return new MeasurableAttributePropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.Application.STEREOTYPE_NAME: return new ApplicationPropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.Application.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.STEREOTYPE_NAME: return new FeatureClassPropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.STEREOTYPE_NAME: return new DataPropertyPage<>(fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.STEREOTYPE_NAME: return new DataSourcePropertyPage<>(fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.STEREOTYPE_NAME: return new RequirementSetPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.STEREOTYPE_NAME: return new ApplicationMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.STEREOTYPE_NAME: return new CommunicationMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.STEREOTYPE_NAME: return new HistoryRecordPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.STEREOTYPE_NAME: return new PaaSMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.STEREOTYPE_NAME: return new ContainerMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.STEREOTYPE_NAME: return new SoftwareComponentMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.STEREOTYPE_NAME: return new VMMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.STEREOTYPE_NAME: return new HistoryInfoPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.STEREOTYPE_NAME: return new SLOViolationPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.STEREOTYPE_NAME: return new CausePropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.STEREOTYPE_NAME: return new DataMeasurementPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.STEREOTYPE_NAME: return new RuleTriggerPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.STEREOTYPE_NAME: return new MmsConceptPropertyPage<>(fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.STEREOTYPE_NAME: return new AttributeContextPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.STEREOTYPE_NAME: return new CompositeMetricPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.STEREOTYPE_NAME: return new CompositeMetricContextPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.STEREOTYPE_NAME: return new FunctionPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.STEREOTYPE_NAME: return new MetricObjectBindingPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.STEREOTYPE_NAME: return new MetricTemplatePropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.STEREOTYPE_NAME: return new MetricVariablePropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.STEREOTYPE_NAME: return new ObjectContextPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.STEREOTYPE_NAME: return new RawMetricPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.STEREOTYPE_NAME: return new RawMetricContextPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.STEREOTYPE_NAME: return new SchedulePropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.STEREOTYPE_NAME: return new WindowPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.STEREOTYPE_NAME: return new ExternalIdentifierPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.STEREOTYPE_NAME: return new PermissionPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.STEREOTYPE_NAME: return new EntityPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.STEREOTYPE_NAME: return new CloudProviderPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.STEREOTYPE_NAME: return new ModelResourceFilterPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.STEREOTYPE_NAME: return new OrganisationPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.STEREOTYPE_NAME: return new UserPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.STEREOTYPE_NAME: return new RolePropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.STEREOTYPE_NAME: return new ServiceResourceFilterPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.STEREOTYPE_NAME: return new RoleAssignmentPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.STEREOTYPE_NAME: return new UserGroupPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.STEREOTYPE_NAME: return new PlatformCredentialsPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.STEREOTYPE_NAME: return new DataResourceFilterPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.STEREOTYPE_NAME: return new CloudCredentialsPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.STEREOTYPE_NAME: return new SoftwareComponentResourceFilterPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.STEREOTYPE_NAME: return new HorizontalScaleRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.STEREOTYPE_NAME: return new LocationRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.STEREOTYPE_NAME: return new OSRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.STEREOTYPE_NAME: return new OptimisationRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.STEREOTYPE_NAME: return new PaaSRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.STEREOTYPE_NAME: return new ProviderRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.STEREOTYPE_NAME: return new ResourceRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.STEREOTYPE_NAME: return new SecurityRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.STEREOTYPE_NAME: return new ServiceLevelObjectivePropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.STEREOTYPE_NAME: return new VerticalScaleRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.STEREOTYPE_NAME: return new UnaryEventPatternPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.STEREOTYPE_NAME: return new FunctionalEventPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.STEREOTYPE_NAME: return new BinaryEventPatternPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.STEREOTYPE_NAME: return new NonFunctionalEventPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.STEREOTYPE_NAME: return new ScalabilityRulePropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.STEREOTYPE_NAME: return new HorizontalScalingActionPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.STEREOTYPE_NAME: return new VerticalScalingActionPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.STEREOTYPE_NAME: return new TimerPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.STEREOTYPE_NAME: return new SecurityDomainPropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.STEREOTYPE_NAME: return new SecurityControlPropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.STEREOTYPE_NAME: return new RawSecurityMetricPropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.STEREOTYPE_NAME: return new SecurityAttributePropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.STEREOTYPE_NAME: return new CertifiablePropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.STEREOTYPE_NAME: return new CompositeSecurityMetricPropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.STEREOTYPE_NAME: return new SecuritySLOPropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @objid ("c965db12-05a3-4c3d-b093-2fa8591b992f")
        @Override
        public final Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.STEREOTYPE_NAME: return new CloudLocationPropertyPage<>(fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.instantiate(obj));
            case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.STEREOTYPE_NAME: return new GeographicalRegionPropertyPage<>(fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.STEREOTYPE_NAME: return new ImageRequirementPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @objid ("734f8ee5-bfcd-4718-b55e-91d9a9d4b381")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @objid ("46562cf2-e78e-4491-9e44-a6e578576568")
        @Override
        public final Object visitArtifact(Artifact obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.STEREOTYPE_NAME: return new BuildConfigurationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.STEREOTYPE_NAME: return new ClusterConfigurationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.STEREOTYPE_NAME: return new EventConfigurationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.STEREOTYPE_NAME: return new PaaSConfigurationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.STEREOTYPE_NAME: return new ScriptConfigurationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.STEREOTYPE_NAME: return new ServerlessConfigurationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitArtifact(obj);
        }

        @objid ("eaf8aaed-076e-409d-a9bd-6f7eb4f1114a")
        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.STEREOTYPE_NAME: return new AttributeAttributePropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.STEREOTYPE_NAME: return new MmsPropertyPropertyPage<>(fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @objid ("0557d189-205c-4ebd-976d-51c66061f3d4")
        @Override
        public final Object visitAttributeLink(AttributeLink obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.STEREOTYPE_NAME: return new MmsPropertyInstancePropertyPage<>(fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttributeLink(obj);
        }

        @objid ("014a1c3b-874a-473e-95ae-7f3bc1c1905e")
        @Override
        public final Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
            //                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint.STEREOTYPE_NAME: return new CamelViewPointPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram.STEREOTYPE_NAME: return new ExecutionModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram.STEREOTYPE_NAME: return new MetricModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram.STEREOTYPE_NAME: return new DataModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram.STEREOTYPE_NAME: return new LocationModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram.STEREOTYPE_NAME: return new RequirementModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram.STEREOTYPE_NAME: return new MetadataModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram.STEREOTYPE_NAME: return new OrganisationModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram.STEREOTYPE_NAME: return new ScalabilityModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram.STEREOTYPE_NAME: return new DeploymentModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram.STEREOTYPE_NAME: return new SecurityModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram.STEREOTYPE_NAME: return new TypeModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram.STEREOTYPE_NAME: return new UnitModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram.STEREOTYPE_NAME: return new CamelModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram.STEREOTYPE_NAME: return new DeploymentInstanceModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram.instantiate(obj));
            case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram.STEREOTYPE_NAME: return new DataInstanceModelDiagramPropertyPage<>(fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @objid ("b01e0231-b36b-45a4-89a1-c1a789c41a61")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME: return new CamelModelPropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.STEREOTYPE_NAME: return new DataTypeModelPropertyPage<>(fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.STEREOTYPE_NAME: return new DataInstanceModelPropertyPage<>(fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.STEREOTYPE_NAME: return new DeploymentInstanceModelPropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.STEREOTYPE_NAME: return new DeploymentTypeModelPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.STEREOTYPE_NAME: return new ExecutionModelPropertyPage<>(fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.STEREOTYPE_NAME: return new LocationModelPropertyPage<>(fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.STEREOTYPE_NAME: return new MetaDataModelPropertyPage<>(fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.STEREOTYPE_NAME: return new MetricInstanceModelPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.STEREOTYPE_NAME: return new MetricTypeModelPropertyPage<>(fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.STEREOTYPE_NAME: return new OrganisationModelPropertyPage<>(fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.STEREOTYPE_NAME: return new RequirementModelPropertyPage<>(fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.STEREOTYPE_NAME: return new ScalabilityModelPropertyPage<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.STEREOTYPE_NAME: return new SecurityModelPropertyPage<>(fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.STEREOTYPE_NAME: return new TypeModelPropertyPage<>(fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.STEREOTYPE_NAME: return new UnitModelPropertyPage<>(fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @objid ("5d121269-97ea-4075-8b50-e5c8a7058cb0")
        @Override
        public final Object visitConnector(Connector obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.STEREOTYPE_NAME: return new CommunicationInstancePropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance.STEREOTYPE_NAME: return new HostingInstancePropertyPage<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.STEREOTYPE_NAME: return new CommunicationPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.STEREOTYPE_NAME: return new HostingPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.STEREOTYPE_NAME: return new LocationCouplingPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitConnector(obj);
        }

        @objid ("4b516131-268b-428e-a9f3-e3eeb0cb7a8a")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            //                case fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.instantiate(obj);
            //                case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.STEREOTYPE_NAME: return new SecurityMetricInstancePropertyPage<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.instantiate(obj);
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @objid ("4eed94d9-df99-4c01-97a8-c61623d04d4c")
        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.STEREOTYPE_NAME: return new FeaturePortPropertyPage<>(fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.STEREOTYPE_NAME: return new CommunicationPortPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.STEREOTYPE_NAME: return new HostingPortPropertyPage<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * 
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("65ba04d7-dcfb-43d5-8619-e88870f03f28")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

        @objid ("1dcbce9d-01c0-42b6-89e6-797da0dadd2c")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

    }

}
