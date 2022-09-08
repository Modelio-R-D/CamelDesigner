package fr.softeam.cameldesigner.exchange.importer;

import java.util.HashMap;
import java.util.Map;
import camel.core.impl.CamelModelImpl;
import camel.core.impl.FeatureImpl;
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
import camel.requirement.impl.HardRequirementImpl;
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
import camel.requirement.impl.SoftRequirementImpl;
import camel.requirement.impl.VerticalScaleRequirementImpl;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
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
import fr.softeam.cameldesigner.exchange.importer.deployment.RequiredSetImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ScriptConfiguationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ServerlessConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.VMImporter;
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
import org.eclipse.emf.cdo.CDOObject;

/**
 * Factory that instantiates the right importer class for a model element stereotyped by a 'CamelDesigner' module stereotype.
 */
@objid ("7b18247b-a2c1-4fda-8356-d4b90b2cb9f7")
public class ImporterFactory {
    @objid ("c3ea94fe-bede-493a-997a-3217ea1176ee")
    private static Map<Class<?>, CamelElementImporter<? extends CDOObject,? extends CamelElement>> _factory = new HashMap<>();

    @objid ("c8dc8e2d-b3e2-4418-9f8f-ec583df230cd")
    public static CamelElementImporter getImporter(CDOObject elt) throws Exception {
        if (!_factory.containsKey(elt.getClass())) {
            throw new IllegalArgumentException("Missing Element Factory for Type " + elt.getClass());
        }
        
        CamelElementImporter importer =  _factory.get(elt.getClass());
        importer.setElement(elt);
        return importer;
    }


static {

        // METADATA
        _factory.put(CamelModelImpl.class, new CamelModelImporter<>());
        _factory.put(FeatureImpl.class, new FeatureImporter<>());
        _factory.put(MetaDataModelImpl.class, new MetaDataModelImporter<>());
        _factory.put(MmsConceptImpl.class, new MmsConceptImporter<>());
        _factory.put(MmsConceptInstanceImpl.class, new MmsConceptInstanceImporter<>());
        _factory.put(MmsPropertyInstanceImpl.class, new MmsPropertyInstanceImporter<>());
        _factory.put(MmsPropertyImpl.class, new MmsPropertyImporter<>());

        // DEPLOYMENT
        _factory.put(BuildConfigurationImpl.class, new BuildConfigurationImporter<>());
        _factory.put(ClusterConfigurationImpl.class, new ClusterConfigurationImporter<>());
        _factory.put(CommunicationImpl.class, new CommunicationImporter<>());
        _factory.put(CommunicationPortImpl.class, new CommunicationPortImporter<>());
        _factory.put(ComponentRelationImpl.class, new ComponentRelationImporter<>());
        _factory.put(ConfigurationImpl.class, new ConfigurationImporter<>());
        _factory.put(ContainerImpl.class, new ContainerImporter<>());
        _factory.put(DeploymentModelImpl.class, new DeploymentModelImporter<>());
        _factory.put(DeploymentTypeModelImpl.class, new DeploymentTypeModelImporter<>());
        _factory.put(EventConfigurationImpl.class, new EventConfigurationImporter<>());
        _factory.put(HostingImpl.class, new HostingImporter<>());
        _factory.put(HostingPortImpl.class, new HostingPortImporter<>());
        _factory.put(LocationCouplingImpl.class, new LocationCouplingImporter<>());
        _factory.put(PaaSConfigurationImpl.class, new PaaSConfigurationImporter<>());
        _factory.put(PaaSImpl.class, new PaaSImporter<>());
        _factory.put(ProvidedCommunicationImpl.class, new ProvidedCommunicationImporter<>());
        _factory.put(ProvidedHostImpl.class, new ProvidedHostImporter<>());
        _factory.put(RequiredCommunicationImpl.class, new RequiredCommunicationImporter<>());
        _factory.put(RequiredHostImpl.class, new RequiredHostImporter<>());
        _factory.put(RequirementSetImpl.class, new RequiredSetImporter<>());
        _factory.put(ScriptConfigurationImpl.class, new ScriptConfiguationImporter<>());
        _factory.put(ServerlessConfigurationImpl.class, new ServerlessConfigurationImporter<>());
        _factory.put(SoftwareComponentImpl.class, new SoftwareComponentImporter<>());
        _factory.put(VMImpl.class, new VMImporter<>());

        // REQUIREMENT
        _factory.put(RequirementModelImpl.class, new RequirementModelImporter<>());
        _factory.put(ServiceLevelObjectiveImpl.class, new ServiceLevelObjectiveImporter<>());
        _factory.put(ProviderRequirementImpl.class, new ProviderRequirementImporter<>() );
        _factory.put(OSRequirementImpl.class, new OSRequirementImporter<>());
        _factory.put(SecurityRequirementImpl.class, new SecurityRequirementImporter<>());
        _factory.put(LocationRequirementImpl.class, new LocationRequirementImporter<>());
        _factory.put(ImageRequirementImpl.class, new ImageRequirementImporter<>());
        _factory.put(HorizontalScaleRequirementImpl.class, new HorizontalScaleRequirementImporter<>());
         _factory.put(VerticalScaleRequirementImpl.class, new VerticalScaleRequirementImporter<>() );
        _factory.put(OptimisationRequirementImpl.class, new OptimisationRequirementImporter<>());
        _factory.put(ResourceRequirementImpl.class, new ResourceRequirementImporter<>());
        _factory.put(PaaSRequirementImpl.class, new PaaSRequirementImporter<>());


        
        // ORGANISATION
        _factory.put(CloudCredentialsImpl.class, new CloudCredentialsImporter<>());
        _factory.put(CloudProviderImpl.class, new CloudProviderImporter<>());
        _factory.put(CredentialsImpl.class, new CredentialsImporter<>() );
        _factory.put(DataResourceFilterImpl.class, new DataResourceFilterImporter<>());
        _factory.put(EntityImpl.class, new EntityImporter<>());
        _factory.put(ExternalIdentifierImpl.class, new ExternalIdentifierImporter<>());
        _factory.put(ModelResourceFilterImpl.class, new ModelResourceFilterImporter<>());
        _factory.put(OrganisationImpl.class, new OrganisationImporter<>());
        _factory.put(OrganisationModelImpl.class, new OrganisationModelImporter<>());
        _factory.put(PermissionImpl.class, new PermissionImporter<>());
        _factory.put(PlatformCredentialsImpl.class, new PlatformCredentialsImporter<>());
        _factory.put(ResourceFilterImpl.class, new ResourceFilterImporter<>());
        _factory.put(RoleAssignmentImpl.class, new RoleAssignmentImporter<>() );
        _factory.put(RoleImpl.class, new RoleImporter<>());
        _factory.put(ServiceResourceFilterImpl.class, new ServiceResourceFilterImporter<>());
        _factory.put(SoftwareComponentResourceFilterImpl.class, new SoftwareComponentResourceFilterImporter<>());
        _factory.put(UserGroupImpl.class, new UserGroupImporter<>());
        _factory.put(UserImpl.class, new UserImporter<>() );



        // METRIC
        _factory.put(AttributeContextImpl.class, new AttributeContextImporter<>());
        _factory.put(CompositeMetricContextImpl.class, new CompositeMetricContextImporter<>() );
        _factory.put(CompositeMetricImpl.class, new CompositeMetricImporter<>());
        _factory.put(FunctionImpl.class, new FunctionImporter<>());
        _factory.put(MetricContextImpl.class, new MetricContextImporter<>());
        _factory.put(MetricImpl.class, new MetricImporter<>());
        _factory.put(MetricInstanceImpl.class, new MetricInstanceImporter<>());
        _factory.put(MetricInstanceModelImpl.class, new MetricInstanceModelImporter<>());
        _factory.put(MetricModelImpl.class, new MetricModelImporter<>());
        _factory.put(MetricObjectBindingImpl.class, new MetricObjectBindingImporter<>());
        _factory.put(MetricTemplateImpl.class, new MetricTemplateImporter<>());
        _factory.put(MetricTypeModelImpl.class, new MetricTypeModelImporter<>());
        _factory.put(MetricVariableImpl.class, new MetricVariableImporter<>());
        _factory.put(ObjectContextImpl.class, new ObjectContextImporter<>());
        _factory.put(RawMetricImpl.class, new RawMetricImporter<>());
        _factory.put(RawMetricContextImpl.class, new RawMetricContextImporter<>());
        _factory.put(ScheduleImpl.class, new ScheduleImporter<>());
        _factory.put(SensorImpl.class, new SensorImporter<>() );
        _factory.put(WindowImpl.class, new WindowImporter<>() );

        // LOCATION
        
        
        // EXECUTION
        //           _factory.put(.class, new );
        
        // SCALABILITY
        // SECURITY
        // TYPE



}
}
