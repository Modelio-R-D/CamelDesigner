package fr.softeam.cameldesigner.exchange.importer;

import java.util.HashMap;
import java.util.Map;
import camel.constraint.impl.IfThenConstraintImpl;
import camel.constraint.impl.LogicalConstraintImpl;
import camel.constraint.impl.MetricConstraintImpl;
import camel.constraint.impl.MetricVariableConstraintImpl;
import camel.core.impl.AttributeImpl;
import camel.core.impl.CamelModelImpl;
import camel.core.impl.FeatureImpl;
import camel.core.impl.MeasurableAttributeImpl;
import camel.core.impl.QualityAttributeImpl;
import camel.deployment.impl.BuildConfigurationImpl;
import camel.deployment.impl.ClusterConfigurationImpl;
import camel.deployment.impl.CommunicationImpl;
import camel.deployment.impl.CommunicationPortImpl;
import camel.deployment.impl.ComponentRelationImpl;
import camel.deployment.impl.ConfigurationImpl;
import camel.deployment.impl.ContainerImpl;
import camel.deployment.impl.DeploymentModelImpl;
import camel.deployment.impl.DeploymentTypeModelImpl;
import camel.deployment.impl.EventConfigurationImpl;
import camel.deployment.impl.HostingImpl;
import camel.deployment.impl.HostingPortImpl;
import camel.deployment.impl.LocationCouplingImpl;
import camel.deployment.impl.PaaSConfigurationImpl;
import camel.deployment.impl.PaaSImpl;
import camel.deployment.impl.ProvidedCommunicationImpl;
import camel.deployment.impl.ProvidedHostImpl;
import camel.deployment.impl.RequiredCommunicationImpl;
import camel.deployment.impl.RequiredHostImpl;
import camel.deployment.impl.RequirementSetImpl;
import camel.deployment.impl.ScriptConfigurationImpl;
import camel.deployment.impl.ServerlessConfigurationImpl;
import camel.deployment.impl.SoftwareComponentImpl;
import camel.deployment.impl.VMImpl;
import camel.location.impl.CloudLocationImpl;
import camel.location.impl.GeographicalRegionImpl;
import camel.location.impl.LocationImpl;
import camel.location.impl.LocationModelImpl;
import camel.metric.impl.AttributeContextImpl;
import camel.metric.impl.CompositeMetricContextImpl;
import camel.metric.impl.CompositeMetricImpl;
import camel.metric.impl.FunctionImpl;
import camel.metric.impl.MetricContextImpl;
import camel.metric.impl.MetricImpl;
import camel.metric.impl.MetricInstanceImpl;
import camel.metric.impl.MetricInstanceModelImpl;
import camel.metric.impl.MetricModelImpl;
import camel.metric.impl.MetricObjectBindingImpl;
import camel.metric.impl.MetricTemplateImpl;
import camel.metric.impl.MetricTypeModelImpl;
import camel.metric.impl.MetricVariableImpl;
import camel.metric.impl.ObjectContextImpl;
import camel.metric.impl.RawMetricContextImpl;
import camel.metric.impl.RawMetricImpl;
import camel.metric.impl.ScheduleImpl;
import camel.metric.impl.SensorImpl;
import camel.metric.impl.WindowImpl;
import camel.mms.impl.MetaDataModelImpl;
import camel.mms.impl.MmsConceptImpl;
import camel.mms.impl.MmsConceptInstanceImpl;
import camel.mms.impl.MmsPropertyImpl;
import camel.mms.impl.MmsPropertyInstanceImpl;
import camel.organisation.impl.CloudCredentialsImpl;
import camel.organisation.impl.CloudProviderImpl;
import camel.organisation.impl.CredentialsImpl;
import camel.organisation.impl.DataResourceFilterImpl;
import camel.organisation.impl.EntityImpl;
import camel.organisation.impl.ExternalIdentifierImpl;
import camel.organisation.impl.ModelResourceFilterImpl;
import camel.organisation.impl.OrganisationImpl;
import camel.organisation.impl.OrganisationModelImpl;
import camel.organisation.impl.PermissionImpl;
import camel.organisation.impl.PlatformCredentialsImpl;
import camel.organisation.impl.ResourceFilterImpl;
import camel.organisation.impl.RoleAssignmentImpl;
import camel.organisation.impl.RoleImpl;
import camel.organisation.impl.ServiceResourceFilterImpl;
import camel.organisation.impl.SoftwareComponentResourceFilterImpl;
import camel.organisation.impl.UserGroupImpl;
import camel.organisation.impl.UserImpl;
import camel.requirement.impl.HorizontalScaleRequirementImpl;
import camel.requirement.impl.ImageRequirementImpl;
import camel.requirement.impl.LocationRequirementImpl;
import camel.requirement.impl.OSRequirementImpl;
import camel.requirement.impl.OptimisationRequirementImpl;
import camel.requirement.impl.PaaSRequirementImpl;
import camel.requirement.impl.ProviderRequirementImpl;
import camel.requirement.impl.RequirementModelImpl;
import camel.requirement.impl.ResourceRequirementImpl;
import camel.requirement.impl.SecurityRequirementImpl;
import camel.requirement.impl.ServiceLevelObjectiveImpl;
import camel.requirement.impl.VerticalScaleRequirementImpl;
import camel.type.impl.BooleanValueTypeImpl;
import camel.type.impl.IntValueImpl;
import camel.type.impl.RangeImpl;
import camel.type.impl.StringValueImpl;
import camel.type.impl.StringValueTypeImpl;
import camel.type.impl.TypeModelImpl;
import camel.type.impl.ValueImpl;
import camel.unit.impl.CompositeUnitImpl;
import camel.unit.impl.DimensionedUnitImpl;
import camel.unit.impl.DimensionlessImpl;
import camel.unit.impl.SingleUnitImpl;
import camel.unit.impl.UnitDimensionImpl;
import camel.unit.impl.UnitModelImpl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.exchange.importer.constraint.IfThenConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.LogicalConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.MetricConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.constraint.MetricVariableConstraintImporter;
import fr.softeam.cameldesigner.exchange.importer.core.AttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.core.MeasurableAttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.core.QualityAttributeImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.BuildConfigurationImporter;
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
import fr.softeam.cameldesigner.exchange.importer.deployment.RequirementSetImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ScriptConfiguationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ServerlessConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.VMImporter;
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
import fr.softeam.cameldesigner.exchange.importer.requirement.HorizontalScaleRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ImageRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.LocationRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.OSRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.OptimisationRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.PaaSRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ProviderRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.RequirementModelImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ResourceRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.SecurityRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.ServiceLevelObjectiveImporter;
import fr.softeam.cameldesigner.exchange.importer.requirement.VerticalScaleRequirementImporter;
import fr.softeam.cameldesigner.exchange.importer.type.BooleanValueTypeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.IntValueImporter;
import fr.softeam.cameldesigner.exchange.importer.type.RangeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.StringValueTypeImporter;
import fr.softeam.cameldesigner.exchange.importer.type.TypeModelImporter;
import fr.softeam.cameldesigner.exchange.importer.type.ValueImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.CompositeUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.DimensionedUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.DimensionlessImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.SingleUnitImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitDimensionImporter;
import fr.softeam.cameldesigner.exchange.importer.unit.UnitModelImporter;
import org.eclipse.emf.cdo.CDOObject;

/**
 * Factory that instantiates the right importer class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 */
@objid ("7b18247b-a2c1-4fda-8356-d4b90b2cb9f7")
public class ImporterFactory {
    @objid ("c3ea94fe-bede-493a-997a-3217ea1176ee")
    private static Map<Class<?>, Class<?>> _factory = new HashMap<>();

    @objid ("c8dc8e2d-b3e2-4418-9f8f-ec583df230cd")
    public static CamelElementImporter getImporter(CDOObject elt) throws Exception {
        if (!_factory.containsKey(elt.getClass())) {
            throw new IllegalArgumentException("Missing Element Factory for Type " + elt.getClass());
        }
        
        Object obj =  _factory.get(elt.getClass()).newInstance();
        if (obj instanceof CamelElementImporter) {
            CamelElementImporter importer = (CamelElementImporter) obj;
            importer.setElement(elt);
            return importer;
        }
        return null;
    }


static {

        //CORE
        _factory.put(CamelModelImpl.class, CamelModelImporter.class);
        _factory.put(FeatureImpl.class, FeatureImporter.class);
        _factory.put(AttributeImpl.class, AttributeImporter.class);
        _factory.put(QualityAttributeImpl.class, QualityAttributeImporter.class);
        _factory.put(MeasurableAttributeImpl.class, MeasurableAttributeImporter.class);

        // CONSTRAINT
        _factory.put(IfThenConstraintImpl.class, IfThenConstraintImporter.class);
        _factory.put(LogicalConstraintImpl.class, LogicalConstraintImporter.class);
        _factory.put(MetricConstraintImpl.class, MetricConstraintImporter.class);
        _factory.put(MetricVariableConstraintImpl.class, MetricVariableConstraintImporter.class);

        // EXECUTION

        // METADATA

        _factory.put(MetaDataModelImpl.class, MetaDataModelImporter.class);
        _factory.put(MmsConceptImpl.class, MmsConceptImporter.class);
        _factory.put(MmsConceptInstanceImpl.class, MmsConceptInstanceImporter.class);
        _factory.put(MmsPropertyInstanceImpl.class, MmsPropertyInstanceImporter.class);
        _factory.put(MmsPropertyImpl.class, MmsPropertyImporter.class);

        // DEPLOYMENT
        _factory.put(BuildConfigurationImpl.class, BuildConfigurationImporter.class);
        _factory.put(ClusterConfigurationImpl.class, ClusterConfigurationImporter.class);
        _factory.put(CommunicationImpl.class, CommunicationImporter.class);
        _factory.put(CommunicationPortImpl.class, CommunicationPortImporter.class);
        _factory.put(ComponentRelationImpl.class, ComponentRelationImporter.class);
        _factory.put(ConfigurationImpl.class, ConfigurationImporter.class);
        _factory.put(ContainerImpl.class, ContainerImporter.class);
        _factory.put(DeploymentModelImpl.class, DeploymentModelImporter.class);
        _factory.put(DeploymentTypeModelImpl.class, DeploymentTypeModelImporter.class);
        _factory.put(EventConfigurationImpl.class, EventConfigurationImporter.class);
        _factory.put(HostingImpl.class, HostingImporter.class);
        _factory.put(HostingPortImpl.class, HostingPortImporter.class);
        _factory.put(LocationCouplingImpl.class, LocationCouplingImporter.class);
        _factory.put(PaaSConfigurationImpl.class, PaaSConfigurationImporter.class);
        _factory.put(PaaSImpl.class, PaaSImporter.class);
        _factory.put(ProvidedCommunicationImpl.class, ProvidedCommunicationImporter.class);
        _factory.put(ProvidedHostImpl.class, ProvidedHostImporter.class);
        _factory.put(RequiredCommunicationImpl.class, RequiredCommunicationImporter.class);
        _factory.put(RequiredHostImpl.class, RequiredHostImporter.class);
        _factory.put(RequirementSetImpl.class, RequirementSetImporter.class);
        _factory.put(ScriptConfigurationImpl.class, ScriptConfiguationImporter.class);
        _factory.put(ServerlessConfigurationImpl.class, ServerlessConfigurationImporter.class);
        _factory.put(SoftwareComponentImpl.class, SoftwareComponentImporter.class);
        _factory.put(VMImpl.class, VMImporter.class);

        // REQUIREMENT
        _factory.put(RequirementModelImpl.class, RequirementModelImporter.class);
        _factory.put(ServiceLevelObjectiveImpl.class, ServiceLevelObjectiveImporter.class);
        _factory.put(ProviderRequirementImpl.class, ProviderRequirementImporter.class);
        _factory.put(OSRequirementImpl.class, OSRequirementImporter.class);
        _factory.put(SecurityRequirementImpl.class, SecurityRequirementImporter.class);
        _factory.put(LocationRequirementImpl.class, LocationRequirementImporter.class);
        _factory.put(ImageRequirementImpl.class, ImageRequirementImporter.class);
        _factory.put(HorizontalScaleRequirementImpl.class, HorizontalScaleRequirementImporter.class);
        _factory.put(VerticalScaleRequirementImpl.class, VerticalScaleRequirementImporter.class);
        _factory.put(OptimisationRequirementImpl.class, OptimisationRequirementImporter.class);
        _factory.put(ResourceRequirementImpl.class, ResourceRequirementImporter.class);
        _factory.put(PaaSRequirementImpl.class, PaaSRequirementImporter.class);



        // ORGANISATION
        _factory.put(CloudCredentialsImpl.class, CloudCredentialsImporter.class);
        _factory.put(CloudProviderImpl.class, CloudProviderImporter.class);
        _factory.put(CredentialsImpl.class, CredentialsImporter.class);
        _factory.put(DataResourceFilterImpl.class, DataResourceFilterImporter.class);
        _factory.put(EntityImpl.class, EntityImporter.class);
        _factory.put(ExternalIdentifierImpl.class, ExternalIdentifierImporter.class);
        _factory.put(ModelResourceFilterImpl.class, ModelResourceFilterImporter.class);
        _factory.put(OrganisationImpl.class, OrganisationImporter.class);
        _factory.put(OrganisationModelImpl.class, OrganisationModelImporter.class);
        _factory.put(PermissionImpl.class, PermissionImporter.class);
        _factory.put(PlatformCredentialsImpl.class, PlatformCredentialsImporter.class);
        _factory.put(ResourceFilterImpl.class, ResourceFilterImporter.class);
        _factory.put(RoleAssignmentImpl.class, RoleAssignmentImporter.class);
        _factory.put(RoleImpl.class, RoleImporter.class);
        _factory.put(ServiceResourceFilterImpl.class, ServiceResourceFilterImporter.class);
        _factory.put(SoftwareComponentResourceFilterImpl.class, SoftwareComponentResourceFilterImporter.class);
        _factory.put(UserGroupImpl.class, UserGroupImporter.class);
        _factory.put(UserImpl.class, UserImporter.class);



        // METRIC
        _factory.put(AttributeContextImpl.class, AttributeContextImporter.class);
        _factory.put(CompositeMetricContextImpl.class, CompositeMetricContextImporter.class);
        _factory.put(CompositeMetricImpl.class, CompositeMetricImporter.class);
        _factory.put(FunctionImpl.class, FunctionImporter.class);
        _factory.put(MetricContextImpl.class, MetricContextImporter.class);
        _factory.put(MetricImpl.class, MetricImporter.class);
        _factory.put(MetricInstanceImpl.class, MetricInstanceImporter.class);
        _factory.put(MetricInstanceModelImpl.class, MetricInstanceModelImporter.class);
        _factory.put(MetricModelImpl.class, MetricModelImporter.class);
        _factory.put(MetricObjectBindingImpl.class, MetricObjectBindingImporter.class);
        _factory.put(MetricTemplateImpl.class, MetricTemplateImporter.class);
        _factory.put(MetricTypeModelImpl.class, MetricTypeModelImporter.class);
        _factory.put(MetricVariableImpl.class, MetricVariableImporter.class);
        _factory.put(ObjectContextImpl.class, ObjectContextImporter.class);
        _factory.put(RawMetricImpl.class, RawMetricImporter.class);
        _factory.put(RawMetricContextImpl.class, RawMetricContextImporter.class);
        _factory.put(ScheduleImpl.class, ScheduleImporter.class);
        _factory.put(SensorImpl.class, SensorImporter.class);
        _factory.put(WindowImpl.class, WindowImporter.class);

        // LOCATION

        _factory.put(LocationModelImpl.class, LocationModelImporter.class);
        _factory.put(LocationImpl.class, LocationImporter.class);
        _factory.put(CloudLocationImpl.class, CloudLocationImporter.class);
        _factory.put(GeographicalRegionImpl.class, GeographicalRegionImporter.class);




        // SCALABILITY
        // SECURITY


        // TYPE
        _factory.put(TypeModelImpl.class, TypeModelImporter.class);
        _factory.put(RangeImpl.class, RangeImporter.class);
        _factory.put(StringValueTypeImpl.class, StringValueTypeImporter.class);
        _factory.put(BooleanValueTypeImpl.class, BooleanValueTypeImporter.class);

        //UNIT
        _factory.put(CompositeUnitImpl.class, CompositeUnitImporter.class);
        _factory.put(DimensionedUnitImpl.class, DimensionedUnitImporter.class);
        _factory.put(DimensionlessImpl.class, DimensionlessImporter.class);
        _factory.put(SingleUnitImpl.class, SingleUnitImporter.class);
        _factory.put(UnitDimensionImpl.class, UnitDimensionImporter.class);
        _factory.put(UnitModelImpl.class, UnitModelImporter.class);

    }
}
