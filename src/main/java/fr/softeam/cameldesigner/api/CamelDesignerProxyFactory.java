/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.04

 * This file was generated on 11/9/20 11:45 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api;

import camel.metric.MetricTypeModel;
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
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ActionInstance;
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
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
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;
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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnManualTask;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnCollaborationDiagram;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessDesignDiagram;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnSubProcessDiagram;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCancelEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnSignalEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.bpmn.events.BpmnTerminateEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnParallelGateway;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.bpmn.rootElements.BpmnSharedDefinitions;
import org.modelio.metamodel.bpmn.rootElements.BpmnSharedElement;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.diagrams.BehaviorDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.diagrams.GraphDiagram;
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.impact.ImpactDiagram;
import org.modelio.metamodel.impact.ImpactLink;
import org.modelio.metamodel.impact.ImpactModel;
import org.modelio.metamodel.impact.ImpactProject;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityFinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.activityModel.CentralBufferNode;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ControlNode;
import org.modelio.metamodel.uml.behavior.activityModel.DataStoreNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.uml.behavior.activityModel.FinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ValuePin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.OpaqueBehavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.uml.behavior.interactionModel.TerminateSpecification;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.DeepHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.AbstractProject;
import org.modelio.metamodel.uml.infrastructure.AbstractResource;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Document;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternElement;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.MethodologicalLink;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Resource;
import org.modelio.metamodel.uml.infrastructure.ResourceType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.UmlModelElement;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.DynamicPropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BehavioralFeature;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.ElementRealization;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
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
 * <li><< TestAtt >> on a {@link org.modelio.metamodel.uml.statik.Attribute}: instantiates a {@link TestAtt}
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
 * <li><< MetricTypeModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link MetricTypeModel}
 * <li><< MetricInstanceModel >> on a {@link org.modelio.metamodel.uml.statik.Package}: instantiates a {@link MetricInstanceModel}
 * <li><< CompositeMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CompositeMetric}
 * <li><< MetricInstance >> on a {@link org.modelio.metamodel.uml.statik.Instance}: instantiates a {@link MetricInstance}
 * <li><< MetricObjectBinding >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MetricObjectBinding}
 * <li><< MetricVariable >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MetricVariable}
 * <li><< RawMetric >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RawMetric}
 * <li><< Sensor >> on a {@link org.modelio.metamodel.uml.statik.Component}: instantiates a {@link Sensor}
 * <li><< Window >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Window}
 * <li><< Schedule >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Schedule}
 * <li><< CompositeMetricContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link CompositeMetricContext}
 * <li><< RawMetricContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link RawMetricContext}
 * <li><< AttributeContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link AttributeContext}
 * <li><< Function >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link Function}
 * <li><< MetricTemplate >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link MetricTemplate}
 * <li><< ObjectContext >> on a {@link org.modelio.metamodel.uml.statik.Class}: instantiates a {@link ObjectContext}
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
public class CamelDesignerProxyFactory {
    private static final InstantiateVisitor instantiateVisitor = new InstantiateVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CamelDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
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
     * @param e A model element.
     * @param stName A stereotype name.
     * @return the right proxy or <i>null</i>.
     */
    public static final Object instantiate(final Element e, final String stName) {
        instantiateVisitor.setStereotype(stName);
        return e.accept(instantiateVisitor);
    }

    private static class InstantiateVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        private String stName;

        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @Override
        public Object visitComponent(Component obj) {
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

        @Override
        public Object visitInstance(Instance obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @Override
        public Object visitDependency(Dependency obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency.instantiate(obj);
                case fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation.instantiate(obj);
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @Override
        public Object visitPort(Port obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitPort(obj);
        }

        @Override
        public Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.instantiate(obj);
                case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.instantiate(obj);
                case fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @Override
        public Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
                default:
                    break;
            }
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @Override
        public Object visitAttributeLink(AttributeLink obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAttributeLink(obj);
        }

        @Override
        public Object visitClassDiagram(ClassDiagram obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelViewPoint.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram.instantiate(obj);
                case fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitClassDiagram(obj);
        }

        @Override
        public Object visitPackage(Package obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.instantiate(obj);
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

        @Override
        public Object visitClass(Class obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.instantiate(obj);
                case fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute.instantiate(obj);
                case fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute.instantiate(obj);
                case fr.softeam.cameldesigner.api.camelcore.standard.class_.Application.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.Application.instantiate(obj);
                case fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.instantiate(obj);
                case fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.instantiate(obj);
                case fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.instantiate(obj);
                case fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ActionInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ActionInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.instantiate(obj);
                case fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.instantiate(obj);
                case fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.instantiate(obj);
                case fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.instantiate(obj);
                case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.instantiate(obj);
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
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEventInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEventInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEventInstance.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEventInstance.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.instantiate(obj);
                case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.instantiate(obj);
                case fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.instantiate(obj);
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

        @Override
        public Object visitConnector(Connector obj) {
            switch (this.stName) {
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

        @Override
        public Object visitDataType(DataType obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.instantiate(obj);
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

        @Override
        public Object visitAttribute(Attribute obj) {
            switch (this.stName) {
                case fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.instantiate(obj);
                case fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.STEREOTYPE_NAME: return fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.instantiate(obj);
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @Override
        public Object visitArtifact(Artifact obj) {
            switch (this.stName) {
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

        @Override
        public Object visitGeneralClass(GeneralClass obj) {
            switch (this.stName) {
                default:
                    break;
            }
            return IDefaultModelVisitor.super.visitGeneralClass(obj);
        }

        /**
         * Get the visitor to delegate to when a {@link IInfrastructureVisitor} is needed.
         * <p>If null is returned the caller will return null.
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         * 
         * @return the {@link IInfrastructureVisitor} visitor or <i>null</i>.
         */
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

        @Override
        public Object visitAbstractDiagram(AbstractDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAbstractProject(AbstractProject obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAbstractResource(AbstractResource obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDiagramSet(DiagramSet obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDocument(Document obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDynamicPropertyDefinition(DynamicPropertyDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitElement(Element obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExternElement(ExternElement obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExternProcessor(ExternProcessor obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitGraphDiagram(GraphDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitImpactDiagram(ImpactDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitImpactLink(ImpactLink obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitImpactModel(ImpactModel obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitImpactProject(ImpactProject obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitLocalPropertyTable(LocalPropertyTable obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMatrixDefinition(MatrixDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMetaclassReference(MetaclassReference obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMethodologicalLink(MethodologicalLink obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitModuleComponent(ModuleComponent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitModuleParameter(ModuleParameter obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNote(Note obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNoteType(NoteType obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitProfile(Profile obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPropertyDefinition(PropertyDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPropertyTable(PropertyTable obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPropertyType(PropertyType obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitQueryDefinition(QueryDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitResource(Resource obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitResourceType(ResourceType obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStereotype(Stereotype obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTagParameter(TagParameter obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTagType(TagType obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTaggedValue(TaggedValue obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTypedPropertyTable(TypedPropertyTable obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAbstractPseudoState(AbstractPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAbstraction(Abstraction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAcceptSignalAction(AcceptSignalAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivity(Activity obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityAction(ActivityAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityDiagram(ActivityDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityEdge(ActivityEdge obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityFinalNode(ActivityFinalNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityGroup(ActivityGroup obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityNode(ActivityNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityParameterNode(ActivityParameterNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActivityPartition(ActivityPartition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitActor(Actor obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAssociation(Association obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitAssociationEnd(AssociationEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBehavior(Behavior obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBehaviorDiagram(BehaviorDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBehaviorParameter(BehaviorParameter obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBehavioralFeature(BehavioralFeature obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBindableInstance(BindableInstance obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBinding(Binding obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnActivity(BpmnActivity obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnArtifact(BpmnArtifact obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnAssociation(BpmnAssociation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnBaseElement(BpmnBaseElement obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnCallActivity(BpmnCallActivity obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnCollaboration(BpmnCollaboration obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnCollaborationDiagram(BpmnCollaborationDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnDataInput(BpmnDataInput obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnDataObject(BpmnDataObject obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnDataOutput(BpmnDataOutput obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnDataState(BpmnDataState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnDataStore(BpmnDataStore obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnEndEvent(BpmnEndEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnEndPoint(BpmnEndPoint obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnEvent(BpmnEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnFlowElement(BpmnFlowElement obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnFlowNode(BpmnFlowNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnGateway(BpmnGateway obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnGroup(BpmnGroup obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnInterface(BpmnInterface obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnLane(BpmnLane obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnLaneSet(BpmnLaneSet obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnManualTask(BpmnManualTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnMessage(BpmnMessage obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnOperation(BpmnOperation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnParticipant(BpmnParticipant obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnProcess(BpmnProcess obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnProcessDesignDiagram(BpmnProcessDesignDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnResource(BpmnResource obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnResourceRole(BpmnResourceRole obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnScriptTask(BpmnScriptTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSendTask(BpmnSendTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnServiceTask(BpmnServiceTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSharedDefinitions(BpmnSharedDefinitions obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSharedElement(BpmnSharedElement obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnStartEvent(BpmnStartEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSubProcess(BpmnSubProcess obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnTask(BpmnTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnTransaction(BpmnTransaction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitBpmnUserTask(BpmnUserTask obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCallAction(CallAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCallBehaviorAction(CallBehaviorAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCallOperationAction(CallOperationAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCentralBufferNode(CentralBufferNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitChoicePseudoState(ChoicePseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitClassAssociation(ClassAssociation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitClassifier(Classifier obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitClause(Clause obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCollaboration(Collaboration obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCollaborationUse(CollaborationUse obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCombinedFragment(CombinedFragment obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCommunicationChannel(CommunicationChannel obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCommunicationDiagram(CommunicationDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCommunicationInteraction(CommunicationInteraction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCommunicationMessage(CommunicationMessage obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCommunicationNode(CommunicationNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitComponentRealization(ComponentRealization obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitConditionalNode(ConditionalNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitConnectionPointReference(ConnectionPointReference obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitConnectorEnd(ConnectorEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitConstraint(Constraint obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitControlFlow(ControlFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitControlNode(ControlNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDataFlow(DataFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDataStoreNode(DataStoreNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDecisionMergeNode(DecisionMergeNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDeploymentDiagram(DeploymentDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitDurationConstraint(DurationConstraint obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitElementImport(ElementImport obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitElementRealization(ElementRealization obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitEnumerationLiteral(EnumerationLiteral obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitEvent(Event obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExceptionHandler(ExceptionHandler obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExecutionSpecification(ExecutionSpecification obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExpansionNode(ExpansionNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExpansionRegion(ExpansionRegion obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitExtensionPoint(ExtensionPoint obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitFeature(Feature obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitFinalNode(FinalNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitFinalState(FinalState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitFlowFinalNode(FlowFinalNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitForkJoinNode(ForkJoinNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitForkPseudoState(ForkPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitGate(Gate obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitGeneralOrdering(GeneralOrdering obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitGeneralization(Generalization obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInformationFlow(InformationFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInformationItem(InformationItem obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInitialNode(InitialNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInitialPseudoState(InitialPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInputPin(InputPin obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInstanceNode(InstanceNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInteraction(Interaction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInteractionFragment(InteractionFragment obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInteractionOperand(InteractionOperand obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInteractionUse(InteractionUse obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInterface(Interface obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInterfaceRealization(InterfaceRealization obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInternalTransition(InternalTransition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitJoinPseudoState(JoinPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitJunctionPseudoState(JunctionPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitLifeline(Lifeline obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitLink(Link obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitLinkEnd(LinkEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitLoopNode(LoopNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitManifestation(Manifestation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMessage(Message obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMessageEnd(MessageEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitMessageFlow(MessageFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitModelTree(ModelTree obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNameSpace(NameSpace obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNaryAssociation(NaryAssociation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNaryConnector(NaryConnector obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNaryLink(NaryLink obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNaryLinkEnd(NaryLinkEnd obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitNode(Node obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitObjectDiagram(ObjectDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitObjectFlow(ObjectFlow obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitObjectNode(ObjectNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitOpaqueAction(OpaqueAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitOpaqueBehavior(OpaqueBehavior obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitOperation(Operation obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitOutputPin(OutputPin obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPackageImport(PackageImport obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPackageMerge(PackageMerge obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitParameter(Parameter obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPartDecomposition(PartDecomposition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitPin(Pin obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitProject(Project obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitProvidedInterface(ProvidedInterface obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitRaisedException(RaisedException obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitRegion(Region obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitRequiredInterface(RequiredInterface obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitSendSignalAction(SendSignalAction obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitSequenceDiagram(SequenceDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitSignal(Signal obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitState(State obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStateInvariant(StateInvariant obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStateMachine(StateMachine obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStateMachineDiagram(StateMachineDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStateVertex(StateVertex obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStaticDiagram(StaticDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStructuralFeature(StructuralFeature obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitStructuredActivityNode(StructuredActivityNode obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitSubstitution(Substitution obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTemplateBinding(TemplateBinding obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTemplateParameter(TemplateParameter obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTerminatePseudoState(TerminatePseudoState obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTerminateSpecification(TerminateSpecification obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitTransition(Transition obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitUmlModelElement(UmlModelElement obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitUsage(Usage obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitUseCase(UseCase obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitUseCaseDependency(UseCaseDependency obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitUseCaseDiagram(UseCaseDiagram obj) {
            // TODO Auto-generated return
            return null;
        }

        @Override
        public Object visitValuePin(ValuePin obj) {
            // TODO Auto-generated return
            return null;
        }

    }

}
