package fr.softeam.cameldesigner.exchange.importer;

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
import org.eclipse.emf.cdo.CDOObject;

@objid ("a8b19413-363c-45c2-b062-781347a5179f")
public interface ICamelVisitor {
    @objid ("47b2b7ac-40ff-403f-a428-5d50daef663b")
    Object visitFeature(Feature feature);

    @objid ("f62b36a3-8219-495d-b0a2-c7d5fa08ff18")
    Object visitCamelModel(CamelModel camelModel);

// METADA
    @objid ("8d04ac43-9de3-4004-97ae-bbaadb48aa8b")
    Object visitMetaDataModel(MetaDataModel metaDataModel);

    @objid ("fe6417ad-2239-40c2-b19a-a787367e2b55")
    Object visitMmsConcept(MmsConcept mmsConcept);

    @objid ("78535d51-26aa-44b0-b3d9-bb6a0ebf53f0")
    Object visitMmsObject(MmsObject mmsObject);

    @objid ("43faa31c-f7cd-4f1f-8a0c-7829130cf68c")
    Object visitModel(Model model);

    @objid ("206112f4-6089-4bfc-ab1d-03f9b3f57f84")
    Object visitNamedElement(NamedElement namedElement);

    @objid ("84bb23e0-7ca5-4e7d-823b-a5e28d32efa6")
    Object visitCDOObject(CDOObject object);

// DEPLOYMENT
    @objid ("d772d420-30ab-4feb-8567-fc9b92028802")
    Object visitBuildConfiguration(BuildConfiguration buildconfiguration);

    @objid ("d5a7294a-458f-4e1e-b8b8-26628154e7b2")
    Object visitClusterConfiguration(ClusterConfiguration clusterconfiguration);

    @objid ("56deafdb-4ff7-4e72-b3a2-0f7d2ac42133")
    Object visitCommunication(Communication communication);

    @objid ("6f8ee056-fbd8-4ef9-890f-5dfe8b1d15fb")
    Object visitCommunicationPort(CommunicationPort communicationPort);

    @objid ("8af4dfed-2419-4d78-b5df-f3b18cf530a5")
    Object visitComponentRelation(ComponentRelation componentRelation);

    @objid ("98abb93c-3b2c-4e54-b8ca-3c1ebe5d9f08")
    Object visitConfiguration(Configuration configuration);

    @objid ("f8bc9101-65cc-4fe2-9c63-f56eaabe39b5")
    Object visitContainer(Container container);

    @objid ("86d97e60-71b9-4fec-9348-2dba9718cf87")
    Object visitDeploymentModel(DeploymentModel deploymentModel);

    @objid ("84fad5d9-580e-4a5b-9e6f-f695ae34e4d4")
    Object visitDeploymentTypeModel(DeploymentTypeModel deploymentTypeModel);

    @objid ("e9c3a78e-d871-49a8-8c00-e5f8a42e27ad")
    Object visitEventConfiguration(EventConfiguration eventConfiguration);

    @objid ("219041cb-27d6-4399-bf9b-fa3b588208b3")
    Object visitHosting(Hosting hosting);

    @objid ("60394b84-30c2-4aad-bfa6-689820414af7")
    Object visitHostingPort(HostingPort hostingPort);

    @objid ("1c359770-e620-4d78-8c86-d70555f042a8")
    Object visitLocationCoupling(LocationCoupling locationCoupling);

    @objid ("d66dd5b5-c8bc-4a50-8163-d84ede7cb32b")
    Object visitPaaSConfiguration(PaaSConfiguration paaSConfiguration);

    @objid ("11476b2d-bfc7-4d64-971d-4f7f8f9aa399")
    Object visitPaaS(PaaS paaS);

    @objid ("7d9867f0-ed73-43bb-a7fd-ee0431591158")
    Object visitRequiredSet(RequirementSet requiredSet);

    @objid ("0d7c11e3-2675-4e27-a3a0-15e261c5ed5f")
    Object visitScriptConfiguration(ScriptConfiguration scriptConfiguration);

    @objid ("f89bb525-8604-4a4a-9913-b3053f86b58a")
    Object visitSoftwareComponent(SoftwareComponent softwareComponent);

    @objid ("53a5d859-dee2-474f-8e65-6deb35e7b6af")
    Object visitVM(VM vm);

// ORGANISATION
    @objid ("a7ef7f78-deaf-4646-946e-b6b53af3cb3f")
    Object visitCloudCredentials(CloudCredentials cloudCredentials);

    @objid ("b9db4964-711e-42b8-bcda-0adfef7f134d")
    Object visitCloudProvider(CloudProvider cloudProvider);

    @objid ("597509d1-b9ad-405e-b6ec-e735e1b2be90")
    Object visitCrendetials(Credentials credentials);

    @objid ("f588df64-4da7-46fd-a5f9-02344e5b6c4a")
    Object visitDataResourceFilter(DataResourceFilter dataResourceFilter);

    @objid ("9614834d-d3b3-4e9f-9d43-c8e93c38b0be")
    Object visitEntity(Entity entity);

    @objid ("cd2286f8-694d-4c62-850e-0bfec654f29d")
    Object visitExternalIdentifier(ExternalIdentifier externalIdentifier);

    @objid ("4c3a3bff-093c-4d55-9539-4d73a92625bb")
    Object visitModelResourceFilter(ModelResourceFilter modelResourceFilter);

    @objid ("bb2fa037-01ce-43fa-b6c1-abc092c0a7d5")
    Object visitOrganisation(Organisation organisation);

    @objid ("9cd30c98-e1ae-49c8-9cff-4f7d67f8772c")
    Object visitOrganisationModel(OrganisationModel organisationModel);

    @objid ("c6a39a2c-1894-4c30-999a-097ad3f71e15")
    Object visitPermission(Permission permission);

    @objid ("9739eea8-1717-4453-b99b-2569c9776b55")
    Object visitPlatformCredentials(PlatformCredentials platformCredentials);

    @objid ("48e38888-7e1d-4d34-8390-b624b5f101bc")
    Object visitResourceFilter(ResourceFilter resourceFilter);

    @objid ("02ac7f6f-3775-4ea3-8043-3ba136bef4e8")
    Object visitRoleAssignment(RoleAssignment roleAssignement);

    @objid ("0a114e28-e0a1-4bb3-b5e0-5765b90bc2d8")
    Object visitRole(Role role);

    @objid ("8df884b1-1ae4-4f83-a3e2-21a6b8ee067c")
    Object visitServiceResourceFilter(ServiceResourceFilter serviceResourceFilter);

    @objid ("3cbffcd5-8390-404e-b4c0-459aa8326308")
    Object visitSoftwareComponentResourceFilter(SoftwareComponentResourceFilter softwareComponentResourceFilter);

    @objid ("546296c1-0781-46e0-86ce-d61ff8ce16c7")
    Object visitUserGroup(UserGroup userGroup);

    @objid ("ebd261ab-46ef-4aaa-8199-87618dc3ced3")
    Object visitUser(User user);


//  Object visit();
}
