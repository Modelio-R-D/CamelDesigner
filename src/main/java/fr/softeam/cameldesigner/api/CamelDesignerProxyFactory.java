/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.NameSpace;
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
 * <ul><li><< Annotation >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link Annotation}
 * <li><< Application >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Application}
 * <li><< Attribute_Attribute >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link AttributeAttribute}
 * <li><< Attribute_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link AttributeClass}
 * <li><< CamelModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link CamelModel}
 * <li><< Feature_Artifact >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link FeatureArtifact}
 * <li><< Feature_Class >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FeatureClass}
 * <li><< Feature_Connector >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link FeatureConnector}
 * <li><< Feature_DataType >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link FeatureDataType}
 * <li><< Feature_Enumeration >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link FeatureEnumeration}
 * <li><< Feature_Instance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link FeatureInstance}
 * <li><< Feature_Port >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link FeaturePort}
 * <li><< MeasurableAttribute >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MeasurableAttribute}
 * <li><< PropertyDependency >> on a {@link org.modelio.metamodel.uml.infrastructure.Dependency}: instantiates a {@link PropertyDependency}
 * <li><< QualityAttribute >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link QualityAttribute}
 * <li><< CamelModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link CamelModelDiagram}
 * <li><< CamelViewPoint >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link CamelViewPoint}
 * <li><< ConstraintModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ConstraintModelDiagram}
 * <li><< DataInstanceModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DataInstanceModelDiagram}
 * <li><< DataTypeModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DataTypeModelDiagram}
 * <li><< DeploymentInstanceModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DeploymentInstanceModelDiagram}
 * <li><< DeploymentTypeModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link DeploymentTypeModelDiagram}
 * <li><< ExecutionModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ExecutionModelDiagram}
 * <li><< LocationModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link LocationModelDiagram}
 * <li><< MetadataModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link MetadataModelDiagram}
 * <li><< MetricInstanceModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link MetricInstanceModelDiagram}
 * <li><< MetricTypeModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link MetricTypeModelDiagram}
 * <li><< OrganisationModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link OrganisationModelDiagram}
 * <li><< RequirementModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link RequirementModelDiagram}
 * <li><< ScalabilityModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link ScalabilityModelDiagram}
 * <li><< SecurityModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link SecurityModelDiagram}
 * <li><< TypeModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link TypeModelDiagram}
 * <li><< UnitModelDiagram >> on a {@link org.modelio.metamodel.diagrams.ClassDiagram}: instantiates a {@link UnitModelDiagram}
 * <li><< ConstraintModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ConstraintModel}
 * <li><< MetricConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link MetricConstraint}
 * <li><< AttributeConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link AttributeConstraint}
 * <li><< IfThenConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link IfThenConstraint}
 * <li><< MetricVariableConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link MetricVariableConstraint}
 * <li><< LogicalConstraint >> on a {@link org.modelio.metamodel.uml.infrastructure.Constraint}: instantiates a {@link LogicalConstraint}
 * <li><< DataTypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DataTypeModel}
 * <li><< DataInstanceModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DataInstanceModel}
 * <li><< Data >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Data}
 * <li><< DataSource >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DataSource}
 * <li><< DataInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link DataInstance}
 * <li><< DataSourceInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link DataSourceInstance}
 * <li><< DataInstance_BindableInstance >> on a {@link org.modelio.metamodel.uml.statik.BindableInstance}: instantiates a {@link DataInstanceBindableInstance}
 * <li><< CommunicationInstance >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link CommunicationInstance}
 * <li><< CommunicationPortInstance >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link CommunicationPortInstance}
 * <li><< ContainerInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ContainerInstance}
 * <li><< DeploymentInstanceModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link DeploymentInstanceModel}
 * <li><< HostingInstance >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link HostingInstance}
 * <li><< HostingPortInstance >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link HostingPortInstance}
 * <li><< PaaSInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link PaaSInstance}
 * <li><< SoftwareComponentInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SoftwareComponentInstance}
 * <li><< VMInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link VMInstance}
 * <li><< BuildConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link BuildConfiguration}
 * <li><< ClusterConfiguration >> on a {@link org.modelio.metamodel.uml.statik.Artifact}: instantiates a {@link ClusterConfiguration}
 * <li><< Communication >> on a {@link org.modelio.metamodel.uml.statik.Connector}: instantiates a {@link Communication}
 * <li><< CommunicationPort >> on a {@link org.modelio.metamodel.uml.statik.Port}: instantiates a {@link CommunicationPort}
 * <li><< Container >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link Container}
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
 * <li><< ActionInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link ActionInstance}
 * <li><< ApplicationMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ApplicationMeasurement}
 * <li><< Cause >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Cause}
 * <li><< CommunicationMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CommunicationMeasurement}
 * <li><< ContainerMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ContainerMeasurement}
 * <li><< DataMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DataMeasurement}
 * <li><< ExecutionModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ExecutionModel}
 * <li><< HistoryInfo >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HistoryInfo}
 * <li><< HistoryRecord >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HistoryRecord}
 * <li><< PaaSMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PaaSMeasurement}
 * <li><< RuleTrigger >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RuleTrigger}
 * <li><< SLOViolation >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SLOViolation}
 * <li><< SoftwareComponentMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SoftwareComponentMeasurement}
 * <li><< VMMeasurement >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link VMMeasurement}
 * <li><< LocationModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link LocationModel}
 * <li><< CloudLocation >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link CloudLocation}
 * <li><< GeographicalRegion >> on a {@link org.modelio.metamodel.uml.statik.Enumeration}: instantiates a {@link GeographicalRegion}
 * <li><< MetaDataModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link MetaDataModel}
 * <li><< MmsConcept >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MmsConcept}
 * <li><< MmsConceptInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MmsConceptInstance}
 * <li><< MmsProperty >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link MmsProperty}
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
 * <li><< CloudCredentials >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CloudCredentials}
 * <li><< CloudProvider >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CloudProvider}
 * <li><< DataResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link DataResourceFilter}
 * <li><< Entity >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Entity}
 * <li><< ExternalIdentifier >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ExternalIdentifier}
 * <li><< ModelResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ModelResourceFilter}
 * <li><< Organisation >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Organisation}
 * <li><< OrganisationModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link OrganisationModel}
 * <li><< Permission >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Permission}
 * <li><< PlatformCredentials >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link PlatformCredentials}
 * <li><< Role >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Role}
 * <li><< RoleAssignment >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RoleAssignment}
 * <li><< ServiceResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ServiceResourceFilter}
 * <li><< SoftwareComponentResourceFilter >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SoftwareComponentResourceFilter}
 * <li><< User >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link User}
 * <li><< UserGroup >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link UserGroup}
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
 * <li><< BinaryEventPattern >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link BinaryEventPattern}
 * <li><< FunctionalEvent >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FunctionalEvent}
 * <li><< FunctionalEventInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link FunctionalEventInstance}
 * <li><< HorizontalScalingAction >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link HorizontalScalingAction}
 * <li><< NonFunctionalEvent >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link NonFunctionalEvent}
 * <li><< NonFunctionalEventInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link NonFunctionalEventInstance}
 * <li><< ScalabilityModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link ScalabilityModel}
 * <li><< ScalabilityRule >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ScalabilityRule}
 * <li><< Timer >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Timer}
 * <li><< UnaryEventPattern >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link UnaryEventPattern}
 * <li><< VerticalScalingAction >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link VerticalScalingAction}
 * <li><< Certifiable >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Certifiable}
 * <li><< CompositeSecurityMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CompositeSecurityMetric}
 * <li><< RawSecurityMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RawSecurityMetric}
 * <li><< SecurityAttribute >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityAttribute}
 * <li><< SecurityControl >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityControl}
 * <li><< SecurityDomain >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecurityDomain}
 * <li><< SecurityMetricInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link SecurityMetricInstance}
 * <li><< SecurityModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link SecurityModel}
 * <li><< SecuritySLO >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link SecuritySLO}
 * <li><< TypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link TypeModel}
 * <li><< Limit >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Limit}
 * <li><< StringValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link StringValue}
 * <li><< BooleanValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link BooleanValue}
 * <li><< IntValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link IntValue}
 * <li><< FloatValue >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link FloatValue}
 * <li><< CamelList >> on a {@link org.modelio.metamodel.uml.statik.DataType}: instantiates a {@link CamelList}
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
@objid ("3cb54811-d4bb-4bff-8dcf-3e2758d67f4d")
public class CamelDesignerProxyFactory {
    @objid ("62733645-20fd-4389-8d29-d3c07e560809")
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CamelDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("6761f9c2-6ab8-4357-820f-0a18bf22c0c0")
    public static final Object instantiate(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
              ModuleComponent module = s.getModule();
              if (module != null && module.getName().equals(ICamelDesignerPeerModule.MODULE_NAME)) {
                  return instantiate(e, s.getName());
              }
        }
        return null;
    }

    /**
     * Instantiates the right proxy class the given element with a stereotype name.
     * The stereotype must be one of the 'CamelDesigner' module stereotypes.
     * In the other case the method will return <i>null</i>.
     * 
     * 
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    @objid ("0edf67aa-bf81-4c1c-a8b9-ebe5037e02b4")
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    @objid ("e1bdd889-d20b-4fb5-a6bd-fe8aa5adf303")
    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("c9a0246a-d6cd-40f7-9301-23c952c3e190")
        private String stName;

        @objid ("c48ec140-aa72-4004-9fe2-f1c5dc75fc95")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("3e61f4fd-ccd4-479f-b30f-0e42b05aa845")
        @Override
        public final Object visitGeneralClass(GeneralClass obj) {
            switch (this.stName) {
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitGeneralClass(obj);
        }

        @objid ("364dc8b7-f65e-4b0e-9061-deeeb3866248")
        @Override
        public final Object visitAbstractDiagram(AbstractDiagram obj) {
            switch (this.stName) {
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitAbstractDiagram(obj);
        }

        @objid ("df6c2fab-e103-43c5-ba34-0ff07d0cf282")
        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation.instantiate(obj);
            	case fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @objid ("a322eb7d-1751-4030-9998-4a79adbf2bd7")
        @Override
        public final Object visitComponent(Component obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitComponent(obj);
        }

        @objid ("491e97e5-e27f-4402-8fc5-563486151e0c")
        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @objid ("58edf704-200a-491f-ae76-eb0be35cb2f0")
        @Override
        public final Object visitBindableInstance(BindableInstance obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitBindableInstance(obj);
        }

        @objid ("4f5b0ff9-abf2-4323-b1fe-e05f3e5e6746")
        @Override
        public final Object visitClassifier(Classifier obj) {
            switch (this.stName) {
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClassifier(obj);
        }

        @objid ("8101a975-2b59-448e-95c7-1893e18a73de")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.class_.Application.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.Application.instantiate(obj);
            	case fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.instantiate(obj);
            	case fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.instantiate(obj);
            	case fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.instantiate(obj);
            	case fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute.instantiate(obj);
            	case fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.instantiate(obj);
            	case fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.class_.Limit.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.class_.Limit.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.class_.StringValue.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.class_.StringValue.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.class_.BooleanValue.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.class_.BooleanValue.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.class_.IntValue.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.class_.IntValue.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.class_.FloatValue.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.class_.FloatValue.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.class_.DoubleValue.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.class_.DoubleValue.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @objid ("131a38ab-fe4e-4d02-8457-2b78e1ccf37f")
        @Override
        public final Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration.instantiate(obj);
            	case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.instantiate(obj);
            	case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @objid ("507b5703-01b0-4e5e-bd68-0477f7f6f8e7")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            	default:
            		break;
            }
            
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @objid ("544eb59c-e4c4-4e0e-a7c8-03fbd7f43ac5")
        @Override
        public final Object visitArtifact(Artifact obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitArtifact(obj);
        }

        @objid ("97c876db-5aa1-42d4-a462-453327ee12f2")
        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @objid ("b5ccd431-fe4a-411c-b817-844d22b474a9")
        @Override
        public final Object visitAttributeLink(AttributeLink obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitAttributeLink(obj);
        }

        @objid ("20c9aee1-336f-4dd7-a612-4763982f6221")
        @Override
        public final Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataTypeModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataTypeModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricInstanceModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricInstanceModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram.instantiate(obj);
            	case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @objid ("22ac81d7-0e27-4387-846b-c8fe6fb0bd72")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.instantiate(obj);
            	case fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @objid ("f210790e-31ff-4439-9363-bac596aac50c")
        @Override
        public final Object visitConnector(Connector obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.connector.FeatureConnector.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.connector.FeatureConnector.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitConnector(obj);
        }

        @objid ("bdb050a9-7672-4495-b0d6-617901f1a462")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.datatype.CamelList.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.datatype.CamelList.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.instantiate(obj);
            	case fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.instantiate(obj);
            	case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.instantiate(obj);
            	case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.instantiate(obj);
            	case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.instantiate(obj);
            	case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @objid ("ad73e673-0886-4d22-8b58-a98ff230143e")
        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.instantiate(obj);
            	case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        @objid ("ef884d8e-cf42-4d05-b1f1-e9bc4a43c2c0")
        @Override
        public final Object visitConstraint(Constraint obj) {
            switch (this.stName) {
            	case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint.instantiate(obj);
            	case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint.instantiate(obj);
            	case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint.instantiate(obj);
            	case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint.instantiate(obj);
            	case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint.instantiate(obj);
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitConstraint(obj);
        }

        @objid ("618dc151-8431-4c6f-b18f-ee4706a31756")
        @Override
        public final Object visitNameSpace(NameSpace obj) {
            switch (this.stName) {
            	default:
            		break;
            }
            
            return IDefaultModelVisitor.super.visitNameSpace(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @objid ("e925d781-8989-4ac4-92b4-7669084afec8")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

    }

}
