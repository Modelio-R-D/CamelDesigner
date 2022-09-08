package fr.softeam.cameldesigner.exchange.importer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import camel.constraint.AttributeConstraint;
import camel.constraint.CompositeConstraint;
import camel.constraint.Constraint;
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
import camel.deployment.CommunicationPort;
import camel.deployment.Component;
import camel.deployment.ComponentRelation;
import camel.deployment.Configuration;
import camel.deployment.Container;
import camel.deployment.DeploymentModel;
import camel.deployment.DeploymentTypeModel;
import camel.deployment.EventConfiguration;
import camel.deployment.Hosting;
import camel.deployment.HostingPort;
import camel.deployment.LocationCoupling;
import camel.deployment.PaaS;
import camel.deployment.PaaSConfiguration;
import camel.deployment.ProvidedCommunication;
import camel.deployment.ProvidedHost;
import camel.deployment.RequiredCommunication;
import camel.deployment.RequiredHost;
import camel.deployment.RequirementSet;
import camel.deployment.ScriptConfiguration;
import camel.deployment.ServerlessConfiguration;
import camel.deployment.SoftwareComponent;
import camel.deployment.VM;
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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelAttribute;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.exchange.importer.constraint.AttributeConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.CamelConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.CompositeConstraintImporter;
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
import fr.softeam.cameldesigner.exchange.importer.core.QualityAttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataInstanceModelImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataSourceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataSourceInstanceImporter;
import fr.softeam.cameldesigner.exchange.importer.data.DataTypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.BuildConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.CamelComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ClusterConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.CommunicationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.CommunicationPortImporter;
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
import fr.softeam.cameldesigner.exchange.importer.deployment.RequiredSetImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ScriptConfiguationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ServerlessConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.VMImporter;
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
    private static class CamelContainerVisitor implements IDefaultCamelVisitor {
        @objid ("ad92355c-1062-4a06-8a79-46b067534fa2")
        @Override
        public Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelModel) {
            return new ArrayList<CDOObject>();
        }

        @objid ("76f04c91-fb4a-489f-89bb-3c14511d5695")
        @Override
        public Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitModel(camelModel));
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
            childs.addAll((Collection<? extends CDOObject>) this.visitNamedElement(feature));
            Feature cdoElt = feature.getElement();
            childs.addAll(cdoElt.getAttributes());
            childs.addAll(cdoElt.getSubFeatures());
            return childs;
        }

        @objid ("d1cc11ff-9655-4589-9bca-619af86a2eb2")
        @Override
        public Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept) {
            List<CDOObject> childs = new ArrayList<>();
            MmsConcept cdoElt = mmsConcept.getElement();
            childs.addAll(cdoElt.getConcept());
            childs.addAll(cdoElt.getInstance());
            childs.addAll(cdoElt.getProperty());
            return childs;
        }

        @objid ("f80d57ab-c9df-4d60-b588-80029b05f48c")
        @Override
        public Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel) {
            List<CDOObject> childs = new ArrayList<>();
            childs.addAll((Collection<? extends CDOObject>) this.visitModel(metaDataModel));
            MetaDataModel cdoElt = metaDataModel.getElement();
            childs.addAll(cdoElt.getMetadataElements());
            return childs;
        }

        @objid ("086aaca3-634e-446d-aa8f-b4487708c18e")
        @Override
        public Object visitMmsConceptInstance(MmsConceptInstanceImporter<? extends MmsConceptInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance> mmsConceptInstanceImporter) {
            List<CDOObject> childs = new ArrayList<>();
            MmsConceptInstance cdoElt = mmsConceptInstanceImporter.getElement();
            childs.addAll(cdoElt.getPropertyInstance());
            return childs;
        }

        @objid ("45c686c6-c9e2-4b0f-b760-0ed1c42185d5")
        @Override
        public Object visitMmsProperty(MmsPropertyImporter<? extends MmsProperty,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty> mmsPropertyImporter) {
            return new ArrayList<>();
        }

        @objid ("5e6250a1-784a-4133-8a20-d5a0b73eba33")
        @Override
        public Object visitMmsPropertyInstance(MmsPropertyInstanceImporter<? extends MmsPropertyInstance,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance> mmsPropertyInstanceImporter) {
            return new ArrayList<>();
        }

        @objid ("7f8027c5-6acb-4903-aa0a-c5a45d2c97b4")
        @Override
        public Object visitSoftwareComponent(SoftwareComponentImporter<? extends SoftwareComponent,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> softwareComponentImporter) {
            List<CDOObject> childs = new ArrayList<>();
            SoftwareComponent cdoElt = softwareComponentImporter.getElement();
            childs.addAll(cdoElt.getRequiredCommunications());
            childs.add(cdoElt.getRequiredHost());
            return childs;
        }

        @objid ("4dcf8c86-505c-4b12-896e-188f65217b58")
        @Override
        public Object visitAttributeContext(AttributeContextImporter<? extends AttributeContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext> attributeContextImporter) {
            return new ArrayList<>();
        }

        @objid ("5f623cd3-678b-4b24-af76-b4f12cdab734")
        @Override
        public Object visitCompositeMetric(CompositeMetricImporter<? extends CompositeMetric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric> compositeMetricImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("632f3097-5174-4087-8d9a-a1ffb9e8282e")
        @Override
        public Object visitMetric(MetricImporter<? extends Metric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric> metricImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("472328b4-8f2e-49fb-b0c4-e3135b53e8b5")
        @Override
        public Object visitCompositeMetricContext(CompositeMetricContextImporter<? extends CompositeMetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext> compositeMetricContextImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("e2d2cddc-bef5-4ce0-8b31-f52a3ea2bb0f")
        @Override
        public Object visitMetricContext(MetricContextImporter<? extends MetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext> metricContextImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("120f48dd-9624-4d4e-92a2-d9fe012483f0")
        @Override
        public Object visitFunction(FunctionImporter<? extends Function,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function> functionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("a48a8387-5c81-4732-8173-4290dd49680c")
        @Override
        public Object visitMetricInstance(MetricInstanceImporter<? extends MetricInstance,? extends fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance> metricInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ad44e588-63c9-43e4-9e0e-c698013dc33b")
        @Override
        public Object visitMetricInstanceModell(MetricInstanceModelImporter<? extends MetricInstanceModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel> metricInstanceModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            MetricInstanceModel cdoElt = metricInstanceModelImporter.getElement();
            childs.addAll(cdoElt.getMetricInstances());
            childs.addAll(cdoElt.getBindings());
            return childs;
        }

        @objid ("79e19726-b8d9-4396-8c34-1b6a86efd406")
        @Override
        public Object visitMetricModel(MetricModelImporter<? extends MetricModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel> metricModelImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("8677607a-0e79-44e8-aa3e-93d87e1393c5")
        @Override
        public Object visitMetricTypeModel(MetricTypeModelImporter<? extends MetricTypeModel,? extends fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel> metricTypeModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
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

        @objid ("bff4ff29-17f3-43e3-ac80-26876996ddbd")
        @Override
        public Object visitMetricObjectBinding(MetricObjectBindingImporter<? extends MetricObjectBinding,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding> metricObjectBindingImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("b08b268e-4854-4c7f-a80e-d05593f16775")
        @Override
        public Object visitMetricTemplate(MetricTemplateImporter<? extends MetricTemplate,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate> metricTemplateImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("5ab209a9-7cf2-43ef-a4d0-ce8c47b3c287")
        @Override
        public Object visitMetricVariable(MetricVariableImporter<? extends MetricVariable,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable> metricVariableImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("96529427-51d1-43c4-8645-7f1592b18f1c")
        @Override
        public Object visitObjectContext(ObjectContextImporter<? extends ObjectContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext> objectContextImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ef8cb092-e365-4992-ab4b-7228244547e9")
        @Override
        public Object visitRawMetricContext(RawMetricContextImporter<? extends RawMetricContext,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext> rawMetricContextImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("d1f3e0d1-96fe-41fe-ae9d-8c369bc84810")
        @Override
        public Object visitRawMetric(RawMetricImporter<? extends RawMetric,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric> rawMetricImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("b70a8995-72e2-41e9-a0d7-89ff5bb1243c")
        @Override
        public Object visitSchedule(ScheduleImporter<? extends Schedule,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule> scheduleImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("5178c80a-d3dc-47e3-af8a-b2a34c6aa83f")
        @Override
        public Object visitSensor(SensorImporter<? extends Sensor,? extends fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor> sensorImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("3c397e17-a2b4-4b39-80ac-42df4a730db9")
        @Override
        public Object visitWindow(WindowImporter<? extends Window,? extends fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window> windowImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("45ec9794-641b-4c2c-a79e-4ef780be627e")
        @Override
        public Object visitConstraint(CamelConstraintImporter<? extends Constraint,? extends CamelConstraint> camelConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("e247965a-3a8a-42e3-87d0-d2bdb5bdccbf")
        @Override
        public Object visitAttributeConstraint(AttributeConstraintImporter<? extends AttributeConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint> attributeConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("5066ffcb-20d5-437e-8e13-9a71a98deb6b")
        @Override
        public Object visitUnaryConstraint(UnaryConstraintImporter<? extends UnaryConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.UnaryConstraint> unaryConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("14e7c89b-a0d6-4b1f-b3dd-06715356cdb7")
        @Override
        public Object visitCompositeConstraint(CompositeConstraintImporter<? extends CompositeConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CompositeConstraint> compositeConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("74c36b53-f93c-4416-9ce9-a2d2b8125f42")
        @Override
        public Object visitIfThenConstraint(IfThenConstraintImporter<? extends IfThenConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint> ifThenConstraintImporter) {
            List<CDOObject> childs = new ArrayList<>();
            IfThenConstraint cdoElt = ifThenConstraintImporter.getElement();
            childs.add(cdoElt.getIf());
            childs.add(cdoElt.getThen());
            childs.add(cdoElt.getElse());
            return childs;
        }

        @objid ("28ff9e08-6e47-4a65-be60-7afcde69eee2")
        @Override
        public Object visitLogicalConstraint(LogicalConstraintImporter<? extends LogicalConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint> logicalConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("05664f0f-790c-40f3-a8b6-794dadc4936b")
        @Override
        public Object visitMetricConstraint(MetricConstraintImporter<? extends MetricConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint> metricConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("43714d9f-a72c-4239-89de-eb276a3c4419")
        @Override
        public Object visitMetricVariableConstraint(MetricVariableConstraintImporter<? extends MetricVariableConstraint,? extends fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint> metricVariableConstraintImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("58981946-7bf3-4dae-9b57-67c3a2fcd4c9")
        @Override
        public Object visitBuildConfiguration(BuildConfigurationImporter<? extends BuildConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration> buildConfigurationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("dd37ba10-bf5c-43de-8910-74bfbbeebf23")
        @Override
        public Object visitClusterConfiguration(ClusterConfigurationImporter<? extends ClusterConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> clusterConfigurationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            ClusterConfiguration cdoElt = clusterConfigurationImporter.getElement();
            childs.addAll(cdoElt.getConfigParameters());
            return childs;
        }

        @objid ("1f5d48e2-8b60-436d-bfed-3340268ee935")
        @Override
        public Object visitCommunication(CommunicationImporter<? extends Communication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> communicationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            Communication cdoElt = communicationImporter.getElement();
            childs.add(cdoElt.getProvidedPortConfiguration());
            childs.add(cdoElt.getRequiredPortConfiguration());
            return childs;
        }

        @objid ("91200e95-9d20-48c7-8dd0-5670bb16dc1b")
        @Override
        public Object visitCommunicationPort(CommunicationPortImporter<? extends CommunicationPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> communicationPortImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("0f2fd748-7b90-4324-a314-559ae826bcd1")
        @Override
        public Object visitComponentRelation(ComponentRelationImporter<? extends ComponentRelation,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation> componentRelationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("2666b55b-e15f-4bec-b2af-52c6567ace5f")
        @Override
        public Object visitConfiguration(ConfigurationImporter<? extends Configuration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration> configurationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("45276b2d-d379-48a5-9604-e5ddf5f3f404")
        @Override
        public Object visitContainer(ContainerImporter<? extends Container,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> containerImporter) {
            List<CDOObject> childs = new ArrayList<>();
            Container cdoElt = containerImporter.getElement();
            childs.addAll(cdoElt.getRequiredCommunications());
            childs.add(cdoElt.getRequiredHost());
            return childs;
        }

        @objid ("54bb95ef-3a78-4a9e-830c-58a33f57f965")
        @Override
        public Object visitDeploymentModel(DeploymentModelImporter<? extends DeploymentModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel> deploymentModelImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("155a41e9-0b7c-4482-aee0-883101eb47df")
        @Override
        public Object visitDeploymentTypeModel(DeploymentTypeModelImporter<? extends DeploymentTypeModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> deploymentTypeModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            DeploymentTypeModel cdoElt = deploymentTypeModelImporter.getElement();
            childs.addAll((Collection<? extends CDOObject>) this.visitModel(deploymentTypeModelImporter));
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
            EventConfiguration cdoElt = eventConfigurationImporter.getElement();
            childs.add(cdoElt.getScheduledExecutionConfig());
            return childs;
        }

        @objid ("1c4bcb3f-2884-4ddd-9c64-a24078d192d9")
        @Override
        public Object visitHosting(HostingImporter<? extends Hosting,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> hostingImporter) {
            List<CDOObject> childs = new ArrayList<>();
                        Hosting cdoElt = hostingImporter.getElement();
                        childs.add(cdoElt.getProvidedHostConfiguration());
                        childs.addAll(cdoElt.getRequiredHostsConfiguration());
            return childs;
        }

        @objid ("826e971a-0d2b-49e7-befc-14e8b12aea09")
        @Override
        public Object visitHostingPort(HostingPortImporter<? extends HostingPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> hostingPortImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("dfe92829-8d67-42a9-bbe9-53002739267c")
        @Override
        public Object visitLocationCoupling(LocationCouplingImporter<? extends LocationCoupling,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling> locationCouplingImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("fb770bbe-8358-4868-8e2a-bae31e6a6920")
        @Override
        public Object visitPaaSConfiguration(PaaSConfigurationImporter<? extends PaaSConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration> paaSConfigurationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("41d96c36-9e9a-4e61-9bee-797055e4ad2b")
        @Override
        public Object visitPaaS(PaaSImporter<? extends PaaS,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS> paaSImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("16f3633c-f667-48d0-9a78-f65e277f9453")
        @Override
        public Object visitRequiredSet(RequiredSetImporter<? extends RequirementSet,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet> requiredSetImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("4d3756c9-256b-4341-b9af-5ede4715abda")
        @Override
        public Object visitScriptConfiguration(ScriptConfiguationImporter<? extends ScriptConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration> scriptConfiguationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("24682eff-dc92-456e-990e-50019845bbc2")
        @Override
        public Object visitServelessConfiguration(ServerlessConfigurationImporter<? extends ServerlessConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> serverlessConfigurationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            ServerlessConfiguration cdoElt = serverlessConfigurationImporter.getElement();
            childs.addAll(cdoElt.getEnvironmentConfigParams());
            childs.add(cdoElt.getBuildConfiguration());
            childs.add(cdoElt.getEventConfiguration());
            return childs;
        }

        @objid ("51e3b824-0b33-431b-b152-edbbb998e4b5")
        @Override
        public Object visitVM(VMImporter<? extends VM,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> vmImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("e807c7da-6fd6-4248-ba33-cffe1c1b5b61")
        @Override
        public Object visitHardRequirement(HardRequirementImporter<? extends HardRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement> hardRequirementImporter) {
            return null;
        }

        @objid ("235fa67f-6aed-425a-8442-509f939b44d7")
        @Override
        public Object visitHorizontalScaleRequirement(HorizontalScaleRequirementImporter<? extends HorizontalScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement> horizontalScaleRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("61c0fa97-6cfc-4774-ab0e-f5b58087222c")
        @Override
        public Object visitImageRequirement(ImageRequirementImporter<? extends ImageRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement> imageRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("cd2095c2-3e4d-4703-b9e6-b02be44ed71b")
        @Override
        public Object visitLocationRequirement(LocationRequirementImporter<? extends LocationRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement> locationRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("d8e6cd17-0fb9-485c-93b9-62ec28f75f4e")
        @Override
        public Object visitOptimisationRequirement(OptimisationRequirementImporter<? extends OptimisationRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement> optimisationRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("95fc504a-9512-46c0-bd1e-b364f6da6d4a")
        @Override
        public Object visitOSRequirement(OSRequirementImporter<? extends OSRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement> osRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("769280e2-c825-40f9-ac9b-3bcb23f7f02c")
        @Override
        public Object visitPaaSRequirement(PaaSRequirementImporter<? extends PaaSRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement> paaSRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("778c5b95-1da6-4a40-8cd8-92b0af6db417")
        @Override
        public Object visitProviderRequirement(ProviderRequirementImporter<? extends ProviderRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement> providerRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("b71fef49-307e-4aaf-a06d-52ea57c9cee5")
        @Override
        public Object visitRequirement(RequirementImporter<? extends Requirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.Requirement> requirementImporter) {
            return null;
        }

        @objid ("33b18893-7426-460e-9080-cfd42ac4b3a8")
        @Override
        public Object visitRequirementModel(RequirementModelImporter<? extends RequirementModel,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel> requirementModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            RequirementModel cdoElt = requirementModelImporter.getElement();
            childs.addAll(cdoElt.getRequirements());
            return childs;
        }

        @objid ("0bc47d1c-ee02-4b85-a0bb-a4877d0ec82d")
        @Override
        public Object visitResourceRequirement(ResourceRequirementImporter<? extends ResourceRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement> resourceRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("8f502ddb-cb82-441c-84e4-50f0bef8adf2")
        @Override
        public Object visitScaleRequirement(ScaleRequirementImporter<? extends ScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.ScaleRequirement> scaleRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("a859b9bf-e3c6-4d58-b0aa-5180bb08255d")
        @Override
        public Object visitSecurityRequirement(SecurityRequirementImporter<? extends SecurityRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement> securityRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("d475943c-3ba8-411b-8f6d-0e8434e46d00")
        @Override
        public Object visitServiceLevelObjective(ServiceLevelObjectiveImporter<? extends ServiceLevelObjective,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective> serviceLevelObjectiveImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("c3c9fac2-eeae-455e-bb46-c311e1808d52")
        @Override
        public Object visitSoftRequirement(SoftRequirementImporter<? extends SoftRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement> softRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("6fcb9af6-0feb-4dc6-bc2b-69484f5b8024")
        @Override
        public Object visitVerticalScaleRequirement(VerticalScaleRequirementImporter<? extends VerticalScaleRequirement,? extends fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement> verticalScaleRequirementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("0ae0cebe-5556-422d-8e0c-5ff36d26c39b")
        @Override
        public Object visitActionInstance(ActionInstanceImporter<? extends ActionInstance,? extends fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance> actionInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ad1a0e69-b9ab-481b-bd73-0d6a8a300124")
        @Override
        public Object visitMeasurement(MeasurementImporter<? extends Measurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Measurement> measurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("5f2e40ea-8903-4435-9f24-bfdffe3c518b")
        @Override
        public Object visitApplicationMeasurement(ApplicationMeasurementImporter<? extends ApplicationMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement> applicationMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("b3f83a7f-d623-4054-bf5c-033488ef3f55")
        @Override
        public Object visitCause(CauseImporter<? extends Cause,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause> causeImporter) {
            List<CDOObject> childs = new ArrayList<>();
                        Cause cdoElt = causeImporter.getElement();
                        childs.addAll(cdoElt.getEventInstances());
            return childs;
        }

        @objid ("532caf5e-ebab-4b2f-b39c-28c6bdf4eee1")
        @Override
        public Object visitCommunicationMeasurement(CommunicationMeasurementImporter<? extends CommunicationMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement> communicationMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("8626bff1-c881-4fa6-a9e3-6048d9ebd81b")
        @Override
        public Object visitContainerMeasurement(ContainerMeasurementImporter<? extends ContainerMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement> containerMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("0e2f6935-4066-4ebb-85cc-f9276e41c967")
        @Override
        public Object visitDataMeasurement(DataMeasurementImporter<? extends DataMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement> dataMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("1d7516a5-4d1f-41ca-a464-683514475939")
        @Override
        public Object visitExecutionModel(ExecutionModelImporter<? extends ExecutionModel,? extends fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel> executionModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            ExecutionModel cdoElt = executionModelImporter.getElement();
            childs.addAll(cdoElt.getMeasurements());
            childs.addAll(cdoElt.getSloViolations());
            childs.addAll(cdoElt.getHistoryRecords());
            return childs;
        }

        @objid ("2ed5d25b-73ed-481c-9824-ae1a59998790")
        @Override
        public Object visitHistoryInfo(HistoryInfoImporter<? extends HistoryInfo,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo> historyInfoImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("bd88c197-87c2-4543-bd09-4bb1a00444fa")
        @Override
        public Object visitHistoryRecord(HistoryRecordImporter<? extends HistoryRecord,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord> historyRecordImporter) {
            List<CDOObject> childs = new ArrayList<>();
            HistoryRecord cdoElt = historyRecordImporter.getElement();
            childs.add(cdoElt.getCause());
            childs.addAll(cdoElt.getInfos());
            return childs;
        }

        @objid ("7f0b97a9-06cf-4a4d-a3be-3dd7917772a4")
        @Override
        public Object visitPaaSMeasurement(PaaSMeasurementImporter<? extends PaaSMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement> paaSMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("9e1cea00-20f8-4575-ab9f-5b930b8816d9")
        @Override
        public Object visitRuleTrigger(RuleTriggerImporter<? extends RuleTrigger,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger> ruleTriggerImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("e48c131a-b06d-4ae0-b334-d7e26856631c")
        @Override
        public Object visitSLOViolation(SLOViolationImporter<? extends SLOViolation,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation> sloViolationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("97cd7961-cfc9-4eb0-ac53-ea7a37e0a97d")
        @Override
        public Object visitSoftwareComponentMeasurement(SoftwareComponentMeasurementImporter<? extends SoftwareComponentMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement> softwareComponentMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("8c1f3f49-3ba0-48b4-bd79-5bae2eeafdf1")
        @Override
        public Object visitVMMeasurement(VMMeasurementImporter<? extends VMMeasurement,? extends fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement> vmMeasurementImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("fb2562e3-76ac-4630-98a0-d72f776dd0e4")
        @Override
        public Object visitCloudLocation(CloudLocationImporter<? extends CloudLocation,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation> cloudLocationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            CloudLocation cdoElt = cloudLocationImporter.getElement();
            childs.addAll(cdoElt.getSubLocations());
            return childs;
        }

        @objid ("029b7f32-3c91-4c8d-9824-9c33b685f637")
        @Override
        public Object visitLocation(LocationImporter<? extends Location,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.Location> locationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("118067e5-b6d8-4140-a9ba-5eaebf9ac9c5")
        @Override
        public Object visitLocationModel(LocationModelImporter<? extends LocationModel,? extends fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel> locationModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            LocationModel cdoElt = locationModelImporter.getElement();
            childs.addAll(cdoElt.getCloudLocations());
            childs.addAll(cdoElt.getRegions());
            return childs;
        }

        @objid ("748e2a37-305d-442f-a21a-0971bb8e9c55")
        @Override
        public Object visitGeographicalRegion(GeographicalRegionImporter<? extends GeographicalRegion,? extends fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion> geographicalRegionImporter) {
            List<CDOObject> childs = new ArrayList<>();
            GeographicalRegion cdoElt = geographicalRegionImporter.getElement();
            childs.addAll(cdoElt.getParentRegions());
            return childs;
        }

        @objid ("d1ea27c3-a253-4cb2-8e3d-25fb04b2bc82")
        @Override
        public Object visitData(DataImporter<? extends Data,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.Data> dataImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("bd962597-f6e2-4b57-98fb-24ee8e74cf0a")
        @Override
        public Object visitDataInstance(DataInstanceImporter<? extends DataInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance> dataInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("d4a19f91-ff80-4aac-b21c-d2a3793f30b7")
        @Override
        public Object visitDataInstanceModel(DataInstanceModelImporter<? extends DataInstanceModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel> dataInstanceModelImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("2c853c70-59a0-41bc-8c74-37b10fb1055c")
        @Override
        public Object visitDataModel(DataModelImporter<? extends DataModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataModel> dataModelImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("0a36178d-07fe-4465-b07c-30a3fc601da1")
        @Override
        public Object visitDataSource(DataSourceImporter<? extends DataSource,? extends fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource> dataSourceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("add39341-552c-48bf-a4f9-f50c664f10af")
        @Override
        public Object visitDataSourceInstance(DataSourceInstanceImporter<? extends DataSourceInstance,? extends fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance> dataSourceInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ac337190-2f94-48a1-b0fa-b185554f9dff")
        @Override
        public Object visitDataTypeModel(DataTypeModelImporter<? extends DataTypeModel,? extends fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel> dataTypeModelImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("009148c3-8ff6-4e5b-b770-e6058fc9f227")
        @Override
        public Object visitBinaryEventPattern(BinaryEventPatternImporter<? extends BinaryEventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern> binaryEventPatternImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("b792c6c4-ceca-4b39-9182-d88aeeec03ef")
        @Override
        public Object visitEvent(EventImporter<? extends Event,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Event> eventImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("772c42ab-76a0-47be-9af2-cebdb273301a")
        @Override
        public Object visitScalabilityModel(ScalabilityModelImporter<? extends ScalabilityModel,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel> scalabilityModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
            ScalabilityModel cdoElt = scalabilityModelImporter.getElement();
            childs.addAll(cdoElt.getRules());
            childs.addAll(cdoElt.getEvents());
            childs.addAll(cdoElt.getEventInstances());
            childs.addAll(cdoElt.getActions());
            childs.addAll(cdoElt.getPatterns());
            childs.addAll(cdoElt.getTimers());
            return childs;
        }

        @objid ("0d15aa53-4ca7-4d16-a2d7-2c9e13ee28db")
        @Override
        public Object visitEventInstance(EventInstanceImporter<? extends EventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance> eventInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("a197ff88-a653-41ed-bb57-396b39f463ba")
        @Override
        public Object visitEventPattern(EventPatternImporter<? extends EventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.EventPattern> eventPatternImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("3349ceb4-2cd8-4e46-a304-f000ad22ca48")
        @Override
        public Object visitFunctionalEvent(FunctionalEventImporter<? extends FunctionalEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent> functionalEventImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ad10556f-b17f-49fa-810d-399bcec295ad")
        @Override
        public Object visitFunctionalEventInstance(FunctionalEventInstanceImporter<? extends FunctionalEventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance> functionalEventInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("a98a871a-d34b-48b1-80b3-dc0aa81e55ef")
        @Override
        public Object visitHorizontalScalingAction(HorizontalScalingActionImporter<? extends HorizontalScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction> horizontalScalingActionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("b3bf0dc4-3a54-4077-8003-fadcb7cfae53")
        @Override
        public Object visitNonFunctionalEvent(NonFunctionalEventImporter<? extends NonFunctionalEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent> nonFunctionalEventImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("e635a838-4ec9-4794-8910-1d508b078afc")
        @Override
        public Object visitNonFunctionalEventInstance(NonFunctionalEventInstanceImporter<? extends NonFunctionalEventInstance,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance> nonFunctionalEventInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("64f1b76e-7ffe-4078-afed-c745d4ea893f")
        @Override
        public Object visitScalabilityRule(ScalabilityRuleImporter<? extends ScalabilityRule,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule> scalabilityRuleImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("dbf8d1ee-ad59-4dd6-8dc2-6be99e692d01")
        @Override
        public Object visitAction(ActionImporter<? extends Action,? extends fr.softeam.cameldesigner.api.camelcore.standard.namespace.Action> actionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("56777779-4840-4b0e-b44a-a03212688f0d")
        @Override
        public Object visitScalingAction(ScalingActionImporter<? extends ScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.namespace.ScalingAction> scalingActionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("13a51478-1ca7-405f-a4a9-0c1ee594199e")
        @Override
        public Object visitSingleEvent(SingleEventImporter<? extends SingleEvent,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.SingleEvent> singleEventImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("5d5a98ea-cc1a-4d2c-9d91-3f79e9694167")
        @Override
        public Object visitTimer(TimerImporter<? extends Timer,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer> timerImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("acdd9b75-ff3d-4261-b027-44f126b185b2")
        @Override
        public Object visitUnaryEventPattern(UnaryEventPatternImporter<? extends UnaryEventPattern,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern> unaryEventPatternImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("566ceb04-901d-4b11-a409-7d39615ed807")
        @Override
        public Object visitVerticalScalingAction(VerticalScalingActionImporter<? extends VerticalScalingAction,? extends fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction> verticalScalingActionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("5ce4f65b-1620-4cb2-9300-7e8fdc421d74")
        @Override
        public Object visitCertifiable(CertifiableImporter<? extends Certifiable,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable> certifiableImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("9c8a3aef-6210-4e0d-a17c-d18febafe1a2")
        @Override
        public Object visitAttribute(AttributeImporter<? extends Attribute,? extends CamelAttribute> attributeImporter) {
            List<CDOObject> childs = new ArrayList<>();
            Attribute cdoElt = attributeImporter.getElement();
            childs.add(cdoElt.getValue());
            return childs;
        }

        @objid ("40170233-103e-4cd7-9c59-7341bfd34356")
        @Override
        public Object visitQualityAttribute(QualityAttributeImporter<? extends QualityAttribute,? extends CamelAttribute> qualityAttributeImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("fc4a0c11-a42e-4bf8-be42-9d338035da56")
        @Override
        public Object visitMeasurableAttribute(MeasurableAttributeImporter<? extends MeasurableAttribute,? extends CamelAttribute> measurableAttributeImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("cbd9d210-1eb5-4005-ac62-39965db6a558")
        @Override
        public Object visitSecurityAttribute(SecurityAttributeImporter<? extends SecurityAttribute,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute> securityAttributeImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("1fda6711-b6c7-4769-a391-e81a95ad2066")
        @Override
        public Object visitCompositeSecurityMetric(CompositeSecurityMetricImporter<? extends CompositeSecurityMetric,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric> compositeSecurityMetricImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("c14ec19c-91f4-49f6-83cb-1581f4f6cb09")
        @Override
        public Object visitRawSecurityMetric(RawSecurityMetricImporter<? extends RawSecurityMetric,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric> rawSecurityMetricImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("6f5d394f-73a6-4abf-99b8-7c9650d1ae21")
        @Override
        public Object visitSecurityControl(SecurityControlImporter<? extends SecurityControl,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl> securityControlImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("452e9576-b9c8-4e1a-b692-71222c1a3be9")
        @Override
        public Object visitSecurityDomain(SecurityDomainImporter<? extends SecurityDomain,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain> securityDomainImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("72937f96-a0bc-493a-b97c-b35b4d858ff9")
        @Override
        public Object visitSecurityMetricInstance(SecurityMetricInstanceImporter<? extends SecurityMetricInstance,? extends fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance> securityMetricInstanceImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("94ccbf6e-2809-48fe-8455-159a7b9e229d")
        @Override
        public Object visitSecurityModel(SecurityModelImporter<? extends SecurityModel,? extends fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel> securityModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
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

        @objid ("9311cf2e-b562-4b55-9b4a-35071dc66ab0")
        @Override
        public Object visitSecuritySLO(SecuritySLOImporter<? extends SecuritySLO,? extends fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO> securitySLOImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("53533c80-2d48-4cbf-97e2-f558fd6a5e8a")
        @Override
        public Object visitCloudCredentials(CloudCredentialsImporter<? extends CloudCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials> cloudCredentialsImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("50965f30-c241-428f-92d5-c087d19592a7")
        @Override
        public Object visitCloudProvider(CloudProviderImporter<? extends CloudProvider,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider> cloudProviderImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("d66d5ec9-be3a-49d1-834b-a943083fedfa")
        @Override
        public Object visitCredentials(CredentialsImporter<? extends Credentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials> credentialsImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("340f1764-211d-465b-9a44-568813ed6d22")
        @Override
        public Object visitDataResourceFilter(DataResourceFilterImporter<? extends DataResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> dataResourceFilterImporter) {
            List<CDOObject> childs = new ArrayList<>();
            DataResourceFilter cdoElt = dataResourceFilterImporter.getElement();
            childs.addAll(cdoElt.getData());
            childs.addAll(cdoElt.getDataInstances());
            childs.addAll(cdoElt.getLocations());
            return childs;
        }

        @objid ("cf76d4e4-a888-4929-a817-d64959528528")
        @Override
        public Object visitEntity(EntityImporter<? extends Entity,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity> entityImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("d02ae4a2-541d-489e-9864-d905db038e5e")
        @Override
        public Object visitExternalIdentifier(ExternalIdentifierImporter<? extends ExternalIdentifier,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier> externalIdentifierImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("219086bb-cf33-4c42-a6ae-6871f2fbfc28")
        @Override
        public Object visitModelResourceFilter(ModelResourceFilterImporter<? extends ModelResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter> modelResourceFilterImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("140ea594-e836-43b1-b502-a21b84b9e025")
        @Override
        public Object visitOrganisation(OrganisationImporter<? extends Organisation,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> organisationImporter) {
            List<CDOObject> childs = new ArrayList<>();
            Organisation cdoElt = organisationImporter.getElement();
            childs.addAll(cdoElt.getCloudCredentials());
            return childs;
        }

        @objid ("150761f4-10bc-495c-9466-8c4d08d920e5")
        @Override
        public Object visitOrganisationModel(OrganisationModelImporter<? extends OrganisationModel,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> organisationModelImporter) {
            List<CDOObject> childs = new ArrayList<>();
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

        @objid ("6f7a7865-ddd8-44f5-818d-90649119fb37")
        @Override
        public Object visitPermission(PermissionImporter<? extends Permission,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission> permissionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ea55f3a1-eb51-4d54-bc9d-c936d0ed0716")
        @Override
        public Object visitPlatformCredentials(PlatformCredentialsImporter<? extends PlatformCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials> platformCredentialsImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("7123db3f-cf6a-4cb3-a0da-68efc6df6f7e")
        @Override
        public Object visitResourceFilter(ResourceFilterImporter<? extends ResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter> resourceFilterImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("440904a1-30ae-445e-b58c-df7862bf40d5")
        @Override
        public Object visitRoleAssignment(RoleAssignmentImporter<? extends RoleAssignment,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment> roleAssignmentImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("074a0ff1-596e-4055-a54b-108ae217a048")
        @Override
        public Object visitRole(RoleImporter<? extends Role,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role> roleImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("95cabeec-c3bf-41a8-8558-932ba800bf1f")
        @Override
        public Object visitServiceResourceFilter(ServiceResourceFilterImporter<? extends ServiceResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter> serviceResourceFilterImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("ca89a225-ab97-45cc-85ba-bc1adcccbf9e")
        @Override
        public Object visitSoftwareComponentResourceFilter(SoftwareComponentResourceFilterImporter<? extends SoftwareComponentResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter> softwareComponentResourceFilterImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("1e72d36a-60d8-4923-9a94-a221e4e24627")
        @Override
        public Object visitUserGroup(UserGroupImporter<? extends UserGroup,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup> userGroupImporter) {
            return null;
        }

        @objid ("c9f3ff0a-e879-47ba-ad9d-50f09765ea5e")
        @Override
        public Object visitUser(UserImporter<? extends User,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> userImporter) {
            List<CDOObject> childs = new ArrayList<>();
            User cdoElt = userImporter.getElement();
            childs.addAll(cdoElt.getExternalIdentifiers());
            childs.add(cdoElt.getPlatformCredentials());
            childs.addAll(cdoElt.getRequirementModels());
            childs.addAll(cdoElt.getDeploymentModels());
            childs.addAll(cdoElt.getMetricModels());
            childs.addAll(cdoElt.getScalabilityModels());
            return childs;
        }

        @objid ("fa4a2f28-5c85-48b9-80a0-86af1150e19e")
        @Override
        public Object visitProvidedCommunication(ProvidedCommunicationImporter<? extends ProvidedCommunication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> providedCommunicationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("2ba230c6-c601-41e1-a6dd-6fd8a9b82ace")
        @Override
        public Object visitProvidedHost(ProvidedHostImporter<? extends ProvidedHost,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> providedHostImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("c6826b05-b0b7-4d4a-b931-77afbb7e5979")
        @Override
        public Object visitRequiredCommunication(RequiredCommunicationImporter<? extends RequiredCommunication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> requiredCommunicationImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("4a3220c5-a6d9-4975-804d-f395eecb8178")
        @Override
        public Object visitRequiredHost(RequiredHostImporter<? extends RequiredHost,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> requiredHostImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("993bb7cb-bcbf-4ba8-9c71-44bd577b77de")
        @Override
        public Object visitCompositeUnit(CompositeUnitImporter<? extends CompositeUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit> compositeUnitImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("505db101-f9da-40d3-b45c-6f7c810c3756")
        @Override
        public Object visitDimensionedUnit(DimensionedUnitImporter<? extends DimensionedUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.DimensionedUnit> dimensionedUnitImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("3902056e-57c5-457c-b2fd-cc5f8aeabd63")
        @Override
        public Object visitDimensionless(DimensionlessImporter<? extends Dimensionless,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless> dimensionlessImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("03bd2d78-fb5d-4f3e-bb5b-77e00c6ed342")
        @Override
        public Object visitSingleUnit(SingleUnitImporter<? extends SingleUnit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit> singleUnitImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("41729d1f-0277-494d-96d8-ac9e17696150")
        @Override
        public Object visitUnitDimension(UnitDimensionImporter<? extends UnitDimension,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension> unitDimensionImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("dbea1b17-3900-4fbc-8695-fc9d1aec47f5")
        @Override
        public Object visitUnit(UnitImporter<? extends Unit,? extends fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Unit> unitImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("1d02f214-abe2-4cec-a295-258edc9183fa")
        @Override
        public Object visitUnitModel(UnitModelImporter<? extends UnitModel,? extends fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel> unitModelImporter) {
            // TODO Auto-generated method stub
            return null;
        }

        @objid ("a0370165-b929-488d-a646-94e1a35b4b75")
        @Override
        public Object visitCamelComponent(CamelComponentImporter<? extends Component,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent> camelComponentImporter) {
            List<CDOObject> childs = new ArrayList<>();
            Component cdoElt = camelComponentImporter.getElement();
            childs.addAll(cdoElt.getProvidedCommunications());
            childs.addAll(cdoElt.getProvidedHosts());
            childs.addAll(cdoElt.getConfigurations());
            return childs;
        }

    }

}
