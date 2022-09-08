package fr.softeam.cameldesigner.exchange.importer;

import java.util.ArrayList;
import java.util.List;
import camel.core.CamelModel;
import camel.core.Feature;
import camel.core.Model;
import camel.core.NamedElement;
import camel.deployment.BuildConfiguration;
import camel.deployment.ClusterConfiguration;
import camel.deployment.Communication;
import camel.deployment.CommunicationPort;
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
import camel.deployment.RequirementSet;
import camel.deployment.ScriptConfiguration;
import camel.deployment.ServerlessConfiguration;
import camel.deployment.SoftwareComponent;
import camel.deployment.VM;
import camel.mms.MetaDataModel;
import camel.mms.MmsConcept;
import camel.mms.MmsObject;
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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.exchange.importer.core.CamelElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.CamelModelImporter;
import fr.softeam.cameldesigner.exchange.importer.core.FeatureImporter;
import fr.softeam.cameldesigner.exchange.importer.core.NamedElementImporter;
import fr.softeam.cameldesigner.exchange.importer.core.SubModelImporter;
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
import fr.softeam.cameldesigner.exchange.importer.deployment.RequiredSetImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ScriptConfiguationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.ServerlessConfigurationImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.SoftwareComponentImporter;
import fr.softeam.cameldesigner.exchange.importer.deployment.VMImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MetaDataModelImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsConceptImporter;
import fr.softeam.cameldesigner.exchange.importer.metadata.MmsObjectImporter;
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
import org.eclipse.emf.cdo.CDOObject;

@objid ("95d27772-cd96-4ee0-9c20-5c6b05231e69")
public interface IDefaultCamelVisitor extends ICamelImporterVisitor {
    @objid ("d8679bed-cac7-448a-a256-4116c2c3fca0")
    @Override
    default Object visitFeature(FeatureImporter<? extends Feature,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature> feature) {
        return visitNamedElement(feature);
    }

    @objid ("413623cd-f194-47d4-b365-88cf49900c0b")
    @Override
    default Object visitCamelElement(CamelElementImporter<? extends CDOObject,? extends CamelElement> camelElt) {
        return null;
    }

    @objid ("c4ae23ff-147f-45b2-8152-4eaace3f3df2")
    @Override
    default Object visitCamelModel(CamelModelImporter<? extends CamelModel,? extends SubModel> camelModel) {
        return visitModel(camelModel);
    }

    @objid ("87331245-7ea6-4eff-9417-7fa2cefc4a8b")
    @Override
    default Object visitMetaDataModel(MetaDataModelImporter<? extends MetaDataModel,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel> metaDataModel) {
        return visitModel(metaDataModel);
    }

    @objid ("de3712b3-db3c-45de-bf38-272cd41fed53")
    @Override
    default Object visitMmsConcept(MmsConceptImporter<? extends MmsConcept,? extends fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept> mmsConcept) {
        return visitMmsObject(mmsConcept);
    }

    @objid ("0a5d2736-c4a5-493a-9b38-e8450cfd3784")
    @Override
    default Object visitMmsObject(MmsObjectImporter<? extends MmsObject,? extends fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject> model) {
        return null;
    }

    @objid ("f5b2ba18-24d4-4e9a-a4d0-8d2bcd34be4d")
    @Override
    default Object visitModel(SubModelImporter<? extends Model,? extends SubModel> model) {
        return visitNamedElement(model);
    }

    @objid ("132652c3-4893-4c7e-b78f-d7216ea6e485")
    @Override
    default Object visitNamedElement(NamedElementImporter<? extends NamedElement,? extends fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement> namedElement) {
        return visitCamelElement(namedElement);
    }

    @objid ("0f01147e-8f03-4276-be9c-d27b5a5e347b")
    default Object visitBuildConfiguration(BuildConfigurationImporter<? extends BuildConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration> buildConfiguration) {
        return visitCamelElement(buildConfiguration);
    }

    @objid ("3257ad53-339f-42f8-838b-a8ad781c1a79")
    default Object visitClusterConfiguration(ClusterConfigurationImporter<? extends ClusterConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration> clusterConfiguration) {
        return visitCamelElement(clusterConfiguration);
    }

    @objid ("88124796-21dd-4a6f-ae48-541771d39cbe")
    default Object visitCommunication(CommunicationImporter<? extends Communication,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication> communication) {
        return visitCamelElement(communication);
    }

    @objid ("5cea5ae0-01da-452f-ac36-489f2d5f415e")
    default Object visitCommunicationPort(CommunicationPortImporter<? extends CommunicationPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort> communicationPort) {
        return visitCamelElement(communicationPort);
    }

    @objid ("1e92e900-839b-461b-8419-2a71be792b63")
    default Object visitComponentRelation(ComponentRelationImporter<? extends ComponentRelation,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.ComponentRelation> componentRelation) {
        return visitCamelElement(componentRelation);
    }

    @objid ("f8a10354-e4f8-4cf2-82b1-588b3b6fd840")
    default Object visitConfiguration(ConfigurationImporter<? extends Configuration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration> configuration) {
        return visitCamelElement(configuration);
    }

    @objid ("75d5e858-3034-4bfc-a346-6a52a9136fb3")
    default Object visitContainer(ContainerImporter<? extends Container,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container> container) {
        return visitCamelElement(container);
    }

    @objid ("8eda5b81-c101-43be-ae6c-927788075af8")
    default Object visitDeploymentModel(DeploymentModelImporter<? extends DeploymentModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel> deploymentModel) {
        return visitCamelElement(deploymentModel);
    }

    @objid ("25fd6ae8-49e5-45b5-a47c-a1055e8baddd")
    default Object visitDeploymentTypeModel(DeploymentTypeModelImporter<? extends DeploymentTypeModel,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel> deploymentTypeModel) {
        return visitCamelElement(deploymentTypeModel);
    }

    @objid ("54071317-4964-4f18-b8b7-46d5b382c605")
    default Object visitEventConfiguration(EventConfigurationImporter<? extends EventConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration> eventConfiguration) {
        return visitCamelElement(eventConfiguration);
    }

    @objid ("c9ff54ce-dea8-43fa-af7b-2a9acde345a4")
    default Object visitHosting(HostingImporter<? extends Hosting,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting> hosting) {
        return visitCamelElement(hosting);
    }

    @objid ("a534a553-02ac-4348-927e-bf97f7ea8e48")
    default Object visitHostingPort(HostingPortImporter<? extends HostingPort,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort> hostingPort) {
        return visitCamelElement(hostingPort);
    }

    @objid ("33c61d2f-42a4-46c2-8b1f-64296bc64293")
    default Object visitLocationCoupling(LocationCouplingImporter<? extends LocationCoupling,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling> locationCoupling) {
        return visitCamelElement(locationCoupling);
    }

    @objid ("f37dc69a-c835-4533-b5ce-1c8ff49d4e82")
    default Object visitPaaSConfiguration(PaaSConfigurationImporter<? extends PaaSConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration> paaSConfiguration) {
        return visitCamelElement(paaSConfiguration);
    }

    @objid ("f907aba2-0c14-496a-9044-151417f16ac1")
    default Object visitPaaS(PaaSImporter<? extends PaaS,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS> paaS) {
        return visitCamelElement(paaS);
    }

    @objid ("56730380-d4f9-4769-ac0f-0c18d432d074")
    default Object visitRequiredSet(RequiredSetImporter<? extends RequirementSet,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet> requiredSet) {
        return visitCamelElement(requiredSet);
    }

    @objid ("3967de87-1b7f-4c64-bdc1-b0a0750d6469")
    default Object visitScriptConfiguration(ScriptConfiguationImporter<? extends ScriptConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration> scriptConfiguration) {
        return visitCamelElement(scriptConfiguration);
    }

    @objid ("18b193b1-48c1-44bf-8588-c9e63f71ad98")
    default Object visitServelessConfiguration(ServerlessConfigurationImporter<? extends ServerlessConfiguration,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration> serverlessConfiguration) {
        return visitCamelElement(serverlessConfiguration);
    }

    @objid ("b1395825-c4c2-494b-952b-29604e72389b")
    default Object visitSoftwareComponent(SoftwareComponentImporter<? extends SoftwareComponent,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent> softwareComponent) {
        return visitCamelElement(softwareComponent);
    }

    @objid ("61ad82e3-06d2-4f32-814a-56f1c4bfd5e5")
    default Object visitVM(VMImporter<? extends VM,? extends fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM> vm) {
        return visitCamelElement(vm);
    }

//ORGANISATION
    @objid ("b2d80c9b-ccda-4ad0-b46c-99f92d49c46f")
    default Object visitCloudCredentials(CloudCredentialsImporter<? extends CloudCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials> cloudCredentials) {
        return visitCamelElement(cloudCredentials);
    }

    @objid ("907d8cfe-f118-4e5d-9374-bd80b4b630ff")
    default Object visitCloudProvider(CloudProviderImporter<? extends CloudProvider,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider> cloudProvider) {
        return visitCamelElement(cloudProvider);
    }

    @objid ("def6b337-21a4-4e3a-8754-7194ad2ca9d0")
    default Object visitCredentials(CredentialsImporter<? extends Credentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Credentials> credentials) {
        return visitCamelElement(credentials);
    }

    @objid ("2c78755e-b383-4976-9f33-c7eb80efd094")
    default Object visitDataResourceFilter(DataResourceFilterImporter<? extends DataResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter> dataResourceFilter) {
        return visitCamelElement(dataResourceFilter);
    }

    @objid ("99bd1574-23b1-460b-a609-0819f4517639")
    default Object visitEntity(EntityImporter<? extends Entity,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity> entity) {
        return visitCamelElement(entity);
    }

    @objid ("bee8f609-086a-4340-8d70-5ca2a7e7ec0e")
    default Object visitExternalIdentifier(ExternalIdentifierImporter<? extends ExternalIdentifier,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier> externalIdentifier) {
        return visitCamelElement(externalIdentifier);
    }

    @objid ("a8748b8c-6196-4b51-bc7e-e4905e6a7542")
    default Object visitModelResourceFilter(ModelResourceFilterImporter<? extends ModelResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter> modelResourceFilter) {
        return visitCamelElement(modelResourceFilter);
    }

    @objid ("4c4be9e8-1e89-42e9-acb7-0fc58aea1906")
    default Object visitOrganisation(OrganisationImporter<? extends Organisation,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation> organisation) {
        return visitCamelElement(organisation);
    }

    @objid ("2e42428e-9edb-4fa9-953b-3e14ae7d5c16")
    default Object visitOrganisationModel(OrganisationModelImporter<? extends OrganisationModel,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel> organisationModel) {
        return visitCamelElement(organisationModel);
    }

    @objid ("c1d1ad4c-ec1a-4555-ad85-3ee796a956fc")
    default Object visitPermission(PermissionImporter<? extends Permission,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission> permission) {
        return visitCamelElement(permission);
    }

    @objid ("f5c08e57-910e-486d-8e6a-4fd0984f7a55")
    default Object visitPlatformCredentials(PlatformCredentialsImporter<? extends PlatformCredentials,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials> platformCredentials) {
        return visitCamelElement(platformCredentials);
    }

    @objid ("e1184071-6904-4c37-9a71-c0d22d7a7f2f")
    default Object visitResourceFilter(ResourceFilterImporter<? extends ResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter> resourceFilter) {
        return visitCamelElement(resourceFilter);
    }

    @objid ("93bbfb83-7c17-415f-9f84-9cf2ff6763ce")
    default Object visitRoleAssignment(RoleAssignmentImporter<? extends RoleAssignment,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment> roleAssignment) {
        return visitCamelElement(roleAssignment);
    }

    @objid ("712d91ed-1be9-4dd8-b28d-4fba06846ef1")
    default Object visitRole(RoleImporter<? extends Role,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role> role) {
        return visitCamelElement(role);
    }

    @objid ("887ea456-3e77-4512-b6b0-e6539787cee1")
    default Object visitServiceResourceFilter(ServiceResourceFilterImporter<? extends ServiceResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter> serviceResourceFilter) {
        return visitCamelElement(serviceResourceFilter);
    }

    @objid ("1d64ffb9-7efc-4543-b543-459a7833eba6")
    default Object visitSoftwareComponentResourceFilter(SoftwareComponentResourceFilterImporter<? extends SoftwareComponentResourceFilter,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter> softwareComponentResourceFilter) {
        return visitCamelElement(softwareComponentResourceFilter);
    }

    @objid ("d34c65b6-ebe3-403b-922f-d54ae1009247")
    default Object visitUserGroup(UserGroupImporter<? extends UserGroup,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup> userGroup) {
        return visitCamelElement(userGroup);
    }

    @objid ("c89eb05d-4fe3-451a-980c-48b6036f5641")
    default Object visitUser(UserImporter<? extends User,? extends fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User> user) {
        return visitCamelElement(user);
    }

    @objid ("f04657d6-70f1-4198-8ebe-1ea23b9c6f9a")
    @Override
    default Object visitCamelComponent(CamelComponentImporter<? extends camel.deployment.Component,? extends CamelComponent> camelComponent) {
        return visitCamelElement(camelComponent);
    }

}
