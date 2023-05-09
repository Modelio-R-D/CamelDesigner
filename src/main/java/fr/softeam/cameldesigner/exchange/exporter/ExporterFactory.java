package fr.softeam.cameldesigner.exchange.exporter;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.exchange.exporter.constraint.AttributeConstraintExporter;
import fr.softeam.cameldesigner.exchange.exporter.constraint.IfThenConstraintExporter;
import fr.softeam.cameldesigner.exchange.exporter.constraint.LogicalConstraintExporter;
import fr.softeam.cameldesigner.exchange.exporter.constraint.MetricConstraintExporter;
import fr.softeam.cameldesigner.exchange.exporter.constraint.MetricVariableConstraintExporter;
import fr.softeam.cameldesigner.exchange.exporter.core.AttributeAttributeExporter;
import fr.softeam.cameldesigner.exchange.exporter.core.AttributeClassExporter;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureClassExporter;
import fr.softeam.cameldesigner.exchange.exporter.core.FeatureInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.core.FeaturePortExporter;
import fr.softeam.cameldesigner.exchange.exporter.core.MeasurableAttributeClassExporter;
import fr.softeam.cameldesigner.exchange.exporter.data.DataExporter;
import fr.softeam.cameldesigner.exchange.exporter.data.DataInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.data.DataInstanceModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.data.DataSourceExporter;
import fr.softeam.cameldesigner.exchange.exporter.data.DataSourceInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.data.DataTypeModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.BuildConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ClusterConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.CommunicationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ContainerConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ContainerExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.DeploymentTypeModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.EventConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.HostingExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ImageConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.LocationCouplingExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.PaaSConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.PaaSExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ProvidedCommunicationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ProvidedHostExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.RequiredCommunicationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.RequiredHostExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.RequirementSetExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ScriptConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.ServerlessConfigurationExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.SoftwareComponentExporter;
import fr.softeam.cameldesigner.exchange.exporter.deployment.VMExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.CommunicationInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.ContainerInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.DeploymentInstanceModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.HostingInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.PaaSInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.SoftwareComponentInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.deploymentinstance.VMInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.ApplicationMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.CauseExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.CommunicationMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.ContainerMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.DataMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.ExecutionModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.HistoryInfoExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.HistoryRecordExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.PaaSMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.RuleTriggerExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.SLOViolationExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.SoftwareComponentMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.execution.VMMeasurementExporter;
import fr.softeam.cameldesigner.exchange.exporter.location.CloudLocationExporter;
import fr.softeam.cameldesigner.exchange.exporter.location.GeographicalRegionExporter;
import fr.softeam.cameldesigner.exchange.exporter.location.LocationModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.metadata.MetaDataModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.metadata.MmsConceptExporter;
import fr.softeam.cameldesigner.exchange.exporter.metadata.MmsConceptInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.metadata.MmsPropertyExporter;
import fr.softeam.cameldesigner.exchange.exporter.metadata.MmsPropertyInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.AttributeContextExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.CompositeMetricContextExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.CompositeMetricExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.FunctionExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricInstanceModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricObjectBindingExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricTemplateExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricTypeModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.MetricVariableExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.ObjectContextExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.RawMetricContextExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.RawMetricExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.ScheduleExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.SensorExporter;
import fr.softeam.cameldesigner.exchange.exporter.metric.WindowExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.CloudCredentialsExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.CloudProviderExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.DataResourceFilterExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.EntityExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.ExternalIdentifierExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.ModelResourceFilterExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.OrganisationExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.OrganisationModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.PermissionExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.PlatformCredentialsExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.RoleAssignmentExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.RoleExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.ServiceResourceFilterExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.SoftwareComponentResourceFilterExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.UserExporter;
import fr.softeam.cameldesigner.exchange.exporter.organisation.UserGroupExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.HorizontalScaleRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.ImageRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.LocationRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.OSRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.OptimisationRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.PaaSRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.ProviderRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.RequirementModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.ResourceRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.SecurityRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.ServiceLevelObjectiveExporter;
import fr.softeam.cameldesigner.exchange.exporter.requirement.VerticalScaleRequirementExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.BinaryEventPatternExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.FunctionalEventExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.FunctionalEventInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.HorizontalScalingActionExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.NonFunctionalEventExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.NonFunctionalEventInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.ScalabilityModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.ScalabilityRuleExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.TimerExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.UnaryEventPatternExporter;
import fr.softeam.cameldesigner.exchange.exporter.scalability.VerticalScalingActionExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.CertifiableExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.CompositeSecurityMetricExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.RawSecurityMetricExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.SecurityAttributeExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.SecurityControlExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.SecurityDomainExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.SecurityMetricInstanceExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.SecurityModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.security.SecuritySLOExporter;
import fr.softeam.cameldesigner.exchange.exporter.type.BooleanValueTypeExporter;
import fr.softeam.cameldesigner.exchange.exporter.type.RangeExporter;
import fr.softeam.cameldesigner.exchange.exporter.type.RangeUnionExporter;
import fr.softeam.cameldesigner.exchange.exporter.type.TypeModelExporter;
import fr.softeam.cameldesigner.exchange.exporter.unit.CompositeUnitExporter;
import fr.softeam.cameldesigner.exchange.exporter.unit.DimensionlessExporter;
import fr.softeam.cameldesigner.exchange.exporter.unit.SingleUnitExporter;
import fr.softeam.cameldesigner.exchange.exporter.unit.UnitDimensionExporter;
import fr.softeam.cameldesigner.exchange.exporter.unit.UnitModelExporter;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.metamodel.visitors.IDefaultInfrastructureVisitor;
import org.modelio.metamodel.visitors.IDefaultModelVisitor;
import org.modelio.metamodel.visitors.IInfrastructureVisitor;

/**
 * Factory that instantiates the right exporter class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 */
@objid ("bc80a2e1-e550-46f5-bd4e-e6ce9dc98653")
public class ExporterFactory {
    @objid ("387eb64d-d2cf-42fe-bfe4-9e66280f5910")
    private static final ExporterVisitor propertyVisitor = new ExporterVisitor();

    /**
     * Instantiates the right proxy class the given element.
     * <br/>The model element must be stereotyped by a 'CamelDesigner' module stereotype.
     * <br/>In the other case the method will return <i>null</i>.
     * 
     * @param e A model element
     * @return the right proxy or <i>null</i>.
     */
    @objid ("c87ef8ff-a149-4ab0-ad6d-ebabc8dce493")
    public static final Object instantiateExporter(final ModelElement e) {
        for (Stereotype s : e.getExtension()) {
            ModuleComponent module = s.getModule();
            if (module != null && module.getName().equals(ICamelDesignerPeerModule.MODULE_NAME)) {
                return instantiateExporter(e, s.getName());
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
    @objid ("ecc3d8aa-e1ca-4f97-b162-851a49ea8d56")
    public static final Object instantiateExporter(final Element e, final String stName) {
        propertyVisitor.setStereotype(stName);
        return e.accept(propertyVisitor);
    }

    @objid ("ad5c79ed-aec7-45fc-aa5f-f870c74ffdd8")
    private static class ExporterVisitor implements IDefaultModelVisitor, IDefaultInfrastructureVisitor {
        @objid ("6f93914a-48f0-467e-8ae8-eac6ed970595")
        private String stName;

        @objid ("d59d2013-eb72-4a05-868c-550681749fa9")
        @Override
        public final Object visitGeneralClass(GeneralClass obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitGeneralClass(obj);
        }

        @objid ("719b8eec-1eed-4d67-b44d-958e79024892")
        @Override
        public final Object visitDependency(Dependency obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitDependency(obj);
        }

        @objid ("afe266de-2e45-4098-a17f-63469f88b2cf")
        @Override
        public final Object visitComponent(Component obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.STEREOTYPE_NAME: return new ContainerExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.STEREOTYPE_NAME: return new PaaSExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.STEREOTYPE_NAME: return new SoftwareComponentExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.STEREOTYPE_NAME: return new VMExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.STEREOTYPE_NAME: return new SensorExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitComponent(obj);
        }

        @objid ("0b42ea70-cd5e-44ce-803b-6a793103c03f")
        @Override
        public final Object visitInstance(Instance obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.STEREOTYPE_NAME: return new NonFunctionalEventInstanceExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.STEREOTYPE_NAME: return new FunctionalEventInstanceExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.STEREOTYPE_NAME: return new FeatureInstanceExporter<>(fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.STEREOTYPE_NAME: return new DataInstanceExporter<>(fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.STEREOTYPE_NAME: return new DataSourceInstanceExporter<>(fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.STEREOTYPE_NAME: return new ContainerInstanceExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.STEREOTYPE_NAME: return new PaaSInstanceExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.STEREOTYPE_NAME: return new SoftwareComponentInstanceExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.STEREOTYPE_NAME: return new VMInstanceExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.STEREOTYPE_NAME: return new MmsConceptInstanceExporter<>(fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.STEREOTYPE_NAME: return new MetricInstanceExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.STEREOTYPE_NAME: return new SecurityMetricInstanceExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitInstance(obj);
        }

        @objid ("20f4bf78-bd19-47ce-82b7-ef6798dc8214")
        @Override
        public final Object visitClass(Class obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.STEREOTYPE_NAME: return new AttributeClassExporter<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.STEREOTYPE_NAME: return new FeatureClassExporter<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass.instantiate(obj));
            case fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass.STEREOTYPE_NAME: return new MeasurableAttributeClassExporter<>(fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.STEREOTYPE_NAME: return new DataExporter<>(fr.softeam.cameldesigner.api.datamodel.standard.class_.Data.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.STEREOTYPE_NAME: return new DataSourceExporter<>(fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.STEREOTYPE_NAME: return new RequirementSetExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.STEREOTYPE_NAME: return new ApplicationMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.STEREOTYPE_NAME: return new CommunicationMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.STEREOTYPE_NAME: return new HistoryRecordExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.STEREOTYPE_NAME: return new PaaSMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.STEREOTYPE_NAME: return new ContainerMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.STEREOTYPE_NAME: return new SoftwareComponentMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.STEREOTYPE_NAME: return new VMMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.STEREOTYPE_NAME: return new HistoryInfoExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.STEREOTYPE_NAME: return new SLOViolationExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.STEREOTYPE_NAME: return new CauseExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.STEREOTYPE_NAME: return new DataMeasurementExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.STEREOTYPE_NAME: return new RuleTriggerExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.STEREOTYPE_NAME: return new MmsConceptExporter<>(fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.STEREOTYPE_NAME: return new AttributeContextExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.STEREOTYPE_NAME: return new CompositeMetricExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.STEREOTYPE_NAME: return new CompositeMetricContextExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.STEREOTYPE_NAME: return new FunctionExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.STEREOTYPE_NAME: return new MetricObjectBindingExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.STEREOTYPE_NAME: return new MetricTemplateExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.STEREOTYPE_NAME: return new MetricVariableExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.STEREOTYPE_NAME: return new ObjectContextExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.STEREOTYPE_NAME: return new RawMetricExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.STEREOTYPE_NAME: return new RawMetricContextExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.STEREOTYPE_NAME: return new ScheduleExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.STEREOTYPE_NAME: return new WindowExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.STEREOTYPE_NAME: return new ExternalIdentifierExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.STEREOTYPE_NAME: return new PermissionExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.STEREOTYPE_NAME: return new EntityExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.STEREOTYPE_NAME: return new CloudProviderExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.STEREOTYPE_NAME: return new ModelResourceFilterExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.STEREOTYPE_NAME: return new OrganisationExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.STEREOTYPE_NAME: return new UserExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.STEREOTYPE_NAME: return new RoleExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.STEREOTYPE_NAME: return new ServiceResourceFilterExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.STEREOTYPE_NAME: return new RoleAssignmentExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.STEREOTYPE_NAME: return new UserGroupExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.STEREOTYPE_NAME: return new PlatformCredentialsExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.STEREOTYPE_NAME: return new DataResourceFilterExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.STEREOTYPE_NAME: return new CloudCredentialsExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.STEREOTYPE_NAME: return new SoftwareComponentResourceFilterExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.STEREOTYPE_NAME: return new HorizontalScaleRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.STEREOTYPE_NAME: return new LocationRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.STEREOTYPE_NAME: return new OSRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.STEREOTYPE_NAME: return new OptimisationRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.STEREOTYPE_NAME: return new PaaSRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.STEREOTYPE_NAME: return new ProviderRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.STEREOTYPE_NAME: return new ResourceRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.STEREOTYPE_NAME: return new SecurityRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.STEREOTYPE_NAME: return new ServiceLevelObjectiveExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.STEREOTYPE_NAME: return new VerticalScaleRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.STEREOTYPE_NAME: return new UnaryEventPatternExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.STEREOTYPE_NAME: return new FunctionalEventExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.STEREOTYPE_NAME: return new BinaryEventPatternExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.STEREOTYPE_NAME: return new NonFunctionalEventExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.STEREOTYPE_NAME: return new ScalabilityRuleExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.STEREOTYPE_NAME: return new HorizontalScalingActionExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.STEREOTYPE_NAME: return new VerticalScalingActionExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.STEREOTYPE_NAME: return new TimerExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.STEREOTYPE_NAME: return new SecurityDomainExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.STEREOTYPE_NAME: return new SecurityControlExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.STEREOTYPE_NAME: return new RawSecurityMetricExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.STEREOTYPE_NAME: return new SecurityAttributeExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.STEREOTYPE_NAME: return new CertifiableExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.STEREOTYPE_NAME: return new CompositeSecurityMetricExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.STEREOTYPE_NAME: return new SecuritySLOExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitClass(obj);
        }

        @objid ("97c2bfd1-b36f-4d7c-9c3e-b74b5f708930")
        @Override
        public final Object visitEnumeration(Enumeration obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.STEREOTYPE_NAME: return new CloudLocationExporter<>(fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation.instantiate(obj));
            case fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.STEREOTYPE_NAME: return new GeographicalRegionExporter<>(fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.STEREOTYPE_NAME: return new ImageRequirementExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitEnumeration(obj);
        }

        @objid ("f2d8ff86-4592-4afd-9673-f5f7d8443a6e")
        @Override
        public final Object visitModelElement(ModelElement obj) {
            switch (this.stName) {
            default:
                break;
            }
            return IDefaultInfrastructureVisitor.super.visitModelElement(obj);
        }

        @objid ("678d10d0-c33e-497c-b2f9-7cefbed45f69")
        @Override
        public final Object visitArtifact(Artifact obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.STEREOTYPE_NAME: return new BuildConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.STEREOTYPE_NAME: return new ClusterConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.STEREOTYPE_NAME: return new EventConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.STEREOTYPE_NAME: return new PaaSConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.STEREOTYPE_NAME: return new ScriptConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.STEREOTYPE_NAME: return new ServerlessConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration.STEREOTYPE_NAME: return new ContainerConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration.STEREOTYPE_NAME: return new ImageConfigurationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitArtifact(obj);
        }

        @objid ("3cd19f6a-b0c2-407c-84b5-f877838cd619")
        @Override
        public final Object visitAttribute(Attribute obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.STEREOTYPE_NAME: return new AttributeAttributeExporter<>(fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.STEREOTYPE_NAME: return new MmsPropertyExporter<>(fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttribute(obj);
        }

        @objid ("eefaf158-6417-4f14-99c9-719af1e60cc2")
        @Override
        public final Object visitAttributeLink(AttributeLink obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.STEREOTYPE_NAME: return new MmsPropertyInstanceExporter<>(fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitAttributeLink(obj);
        }

        @objid ("087c6741-e23e-491a-a18c-ba01f1e210a3")
        @Override
        public final Object visitPackage(Package obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.STEREOTYPE_NAME: return new DataTypeModelExporter<>(fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.STEREOTYPE_NAME: return new DataInstanceModelExporter<>(fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.STEREOTYPE_NAME: return new DeploymentInstanceModelExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.STEREOTYPE_NAME: return new DeploymentTypeModelExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel.instantiate(obj));
            //case fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.STEREOTYPE_NAME: return new ConstraintModelExporter<>(fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.STEREOTYPE_NAME: return new ExecutionModelExporter<>(fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.STEREOTYPE_NAME: return new LocationModelExporter<>(fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.STEREOTYPE_NAME: return new MetaDataModelExporter<>(fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.STEREOTYPE_NAME: return new MetricInstanceModelExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.STEREOTYPE_NAME: return new MetricTypeModelExporter<>(fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.STEREOTYPE_NAME: return new OrganisationModelExporter<>(fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.STEREOTYPE_NAME: return new RequirementModelExporter<>(fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.STEREOTYPE_NAME: return new ScalabilityModelExporter<>(fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.STEREOTYPE_NAME: return new SecurityModelExporter<>(fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.STEREOTYPE_NAME: return new TypeModelExporter<>(fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel.instantiate(obj));
            case fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.STEREOTYPE_NAME: return new UnitModelExporter<>(fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitPackage(obj);
        }

        @objid ("8aabfe9a-5146-4d55-83e1-f3f6fa1acd1f")
        @Override
        public final Object visitConnector(Connector obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.STEREOTYPE_NAME: return new CommunicationInstanceExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance.STEREOTYPE_NAME: return new HostingInstanceExporter<>(fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.STEREOTYPE_NAME: return new CommunicationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.STEREOTYPE_NAME: return new HostingExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.STEREOTYPE_NAME: return new LocationCouplingExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitConnector(obj);
        }

        @objid ("e444322f-c938-421f-887f-4dbf73bea317")
        @Override
        public final Object visitDataType(DataType obj) {
            switch (this.stName) {
                       //               case fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.STEREOTYPE_NAME: return new SecurityMetricInstanceExporter<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.instantiate(obj);
                             //case fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.STEREOTYPE_NAME: return new StringValueTypeExporter<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType.instantiate(obj));
                            //type
                            case fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.STEREOTYPE_NAME: return new BooleanValueTypeExporter<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType.instantiate(obj));
                            case fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.STEREOTYPE_NAME: return new RangeUnionExporter<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion.instantiate(obj));
                            case fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.STEREOTYPE_NAME: return new RangeExporter<>(fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range.instantiate(obj));
                            //unit
                            case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.STEREOTYPE_NAME: return new UnitDimensionExporter<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension.instantiate(obj));
                            case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.STEREOTYPE_NAME: return new DimensionlessExporter<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless.instantiate(obj));
                            case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.STEREOTYPE_NAME: return new SingleUnitExporter<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit.instantiate(obj));
                            case fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.STEREOTYPE_NAME: return new CompositeUnitExporter<>(fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitDataType(obj);
        }

        @objid ("3beefa64-9da4-42f9-bc19-559750677df6")
        @Override
        public final Object visitPort(Port obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.STEREOTYPE_NAME: return new FeaturePortExporter<>(fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.STEREOTYPE_NAME:
                if (obj.getDirection().getValue()==PortOrientation.IN_VALUE)
                    return new RequiredCommunicationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.instantiate(obj));
                else
                    return new ProvidedCommunicationExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort.instantiate(obj));
            case fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.STEREOTYPE_NAME:
                if (obj.getDirection().getValue()==PortOrientation.IN_VALUE)
                    return new RequiredHostExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.instantiate(obj));
                else
                    return new ProvidedHostExporter<>(fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort.instantiate(obj));
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
        @objid ("811fd899-8f65-4257-b11f-cffff1d5ef23")
        @Override
        public IInfrastructureVisitor getInfrastructureVisitor() {
            return this;
        }

        @objid ("01f3699a-1ac5-46c7-9665-632a0405ccca")
        public final void setStereotype(final String stName) {
            this.stName = stName;
        }

        @objid ("7a2fa996-a064-4b22-9ad1-bcbb3f279d88")
        @Override
        public final Object visitConstraint(Constraint obj) {
            switch (this.stName) {
            case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint.STEREOTYPE_NAME: return new MetricConstraintExporter<>(fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint.instantiate(obj));
            //case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint.STEREOTYPE_NAME: return new AttributeConstraintExporter<>(fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint.instantiate(obj));
            case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint.STEREOTYPE_NAME: return new IfThenConstraintExporter<>(fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint.instantiate(obj));
            case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint.STEREOTYPE_NAME: return new MetricVariableConstraintExporter<>(fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint.instantiate(obj));
            case fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint.STEREOTYPE_NAME: return new LogicalConstraintExporter<>(fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint.instantiate(obj));
            default:
                break;
            }
            return IDefaultModelVisitor.super.visitConstraint(obj);
        }

    }

}
