/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << OrganisationModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("810daecb-641e-4da1-a7ce-19926a94c42e")
public class OrganisationModel extends SubModel {
    @objid ("dc9010dc-4647-4109-9f91-f66eed2c1ddf")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("3591192f-b8ce-42d7-9493-d302db4b8692")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("0991b12d-c377-457a-b19f-b80bcf5195e5")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("317b6e7a-a997-448b-97b0-8107b9eb0732")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("4a072687-58d5-4e02-88df-5349b51f0116")
    public static final String SECURITYLEVEL_TAGTYPE = "securityLevel";

    /**
     * Tells whether a {@link OrganisationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << OrganisationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f86eb664-cb18-443b-89dd-6a38c12d9b3a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << OrganisationModel >> then instantiate a {@link OrganisationModel} proxy.
     * 
     * @return a {@link OrganisationModel} proxy on the created {@link Package}.
     */
    @objid ("0065a231-c5f6-4bc7-a35d-8bbbc8f4487c")
    public static OrganisationModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME);
        return OrganisationModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link OrganisationModel} proxy from a {@link Package} stereotyped << OrganisationModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link OrganisationModel} proxy or <i>null</i>.
     */
    @objid ("b12305a7-e5d4-441d-9db3-e979abd260cd")
    public static OrganisationModel instantiate(final Package obj) {
        return OrganisationModel.canInstantiate(obj) ? new OrganisationModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OrganisationModel} proxy from a {@link Package} stereotyped << OrganisationModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link OrganisationModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("40e09d07-7361-4329-824a-40203532879d")
    public static OrganisationModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (OrganisationModel.canInstantiate(obj))
        	return new OrganisationModel(obj);
        else
        	throw new IllegalArgumentException("OrganisationModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56611850-638c-4e2f-899e-4b4b15f12ef7")
    public void addDiagrams(final OrganisationModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("73a3863c-020a-47e6-bb36-36a408d59272")
    public void addExternalIdentifiers(final ExternalIdentifier obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7d613bcf-75d9-4dd6-a7ee-2e285c122a03")
    public void addPermissions(final Permission obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'resourceFilters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aca20987-9bdd-44d3-880c-9e90fcdff643")
    public void addResourceFilters(final ResourceFilter obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'roles' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ba41163-33a8-430e-8d38-7e610875ea58")
    public void addRoles(final Role obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'rolesAssignements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a706d59e-0786-4a9b-82e0-ac4bf222de44")
    public void addRolesAssignements(final RoleAssignment obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eb2d8af2-0b6b-4c32-81a6-fd4491ce50f3")
    public void addUserGroups(final UserGroup obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d9a8e943-7732-472a-9df1-4a6c516cc4c9")
    public void addUsers(final User obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("bb5531d6-0a47-41b9-97ed-4e88480024f5")
    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OrganisationModel other = (OrganisationModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2603f1ad-be6e-4420-b994-38b91c6a0758")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("06712ae2-8fee-473f-882b-b5758b148de8")
    public List<OrganisationModelDiagram> getDiagrams() {
        List<OrganisationModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (OrganisationModelDiagram.canInstantiate(mObj))
        			results.add((OrganisationModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, OrganisationModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("084abaec-5d67-4b70-8f5a-937fd412321f")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2102e9a8-c9dd-468e-864d-280aebe2edba")
    public List<ExternalIdentifier> getExternalIdentifiers() {
        List<ExternalIdentifier> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (ExternalIdentifier.canInstantiate(mObj))
        			results.add((ExternalIdentifier)CamelDesignerProxyFactory.instantiate(mObj, ExternalIdentifier.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'organisation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c39e8160-3b0c-4419-9d11-078a17cb0e03")
    public Organisation getOrganisation() {
          for (Class obj : ((Package) this.elt).getOwnedElement(Class.class)) {
           if (Organisation.canInstantiate(obj))
             return (Organisation)CamelDesignerProxyFactory.instantiate(obj, Organisation.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Getter for string property 'organisationEmail'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("59b49c8a-1de6-44c2-8e08-3b7869522b7e")
    public String getOrganisationEmail() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("706c12ee-2dad-425a-87d3-e83c15a340b5")
    public String getOrganisationName() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("178a56cd-651b-4e3f-b634-ac0421f09295")
    public String getOrganisationWebsite() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("74bb2287-61f1-492f-adef-41c4eb0f6599")
    public List<Permission> getPermissions() {
        List<Permission> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Permission.canInstantiate(mObj))
        			results.add((Permission)CamelDesignerProxyFactory.instantiate(mObj, Permission.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'resourceFilters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e6774e9-b4b8-4989-aaf0-7c3af22475fb")
    public List<ResourceFilter> getResourceFilters() {
        List<ResourceFilter> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (DataResourceFilter.canInstantiate(mObj))
        			results.add((DataResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, DataResourceFilter.STEREOTYPE_NAME));
        	if (ModelResourceFilter.canInstantiate(mObj))
        			results.add((ModelResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, ModelResourceFilter.STEREOTYPE_NAME));
        	if (ServiceResourceFilter.canInstantiate(mObj))
        			results.add((ServiceResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, ServiceResourceFilter.STEREOTYPE_NAME));
        	if (SoftwareComponentResourceFilter.canInstantiate(mObj))
        			results.add((SoftwareComponentResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'roles' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0ae85c9f-0314-4dcf-92c4-3b1844c8fb76")
    public List<Role> getRoles() {
        List<Role> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Role.canInstantiate(mObj))
        			results.add((Role)CamelDesignerProxyFactory.instantiate(mObj, Role.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'rolesAssignements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1cd24145-44dc-4f5b-8b9b-b3faeae16e2f")
    public List<RoleAssignment> getRolesAssignements() {
        List<RoleAssignment> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (RoleAssignment.canInstantiate(mObj))
        			results.add((RoleAssignment)CamelDesignerProxyFactory.instantiate(mObj, RoleAssignment.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d682d5ca-37df-4d54-b103-e1d89fd9e63b")
    public String getSecurityLevel() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47cef9cb-ce7d-46db-a29b-86afa28a0611")
    public List<UserGroup> getUserGroups() {
        List<UserGroup> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (UserGroup.canInstantiate(mObj))
        			results.add((UserGroup)CamelDesignerProxyFactory.instantiate(mObj, UserGroup.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e69547d6-be2d-4e88-94c4-e02c8a61319a")
    public List<User> getUsers() {
        List<User> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (User.canInstantiate(mObj))
        			results.add((User)CamelDesignerProxyFactory.instantiate(mObj, User.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("5bc8b712-ace7-4169-9477-bd6c1403609b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c72f8dc5-8295-4852-a3aa-62b893e70f4c")
    public boolean removeDiagrams(final OrganisationModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("153b5d64-bf09-41ca-aebc-9f9970563e0d")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ad2ee17-604f-4236-8486-29ae65cfb060")
    public boolean removePermissions(final Permission obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'resourceFilters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a1fc1388-defd-4304-b429-7f42159a5bc6")
    public boolean removeResourceFilters(final ResourceFilter obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'roles' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0c6ce9b4-60bc-4571-9668-b1845d0f7248")
    public boolean removeRoles(final Role obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rolesAssignements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e331a5e8-724e-4358-834b-5b9a63d743b2")
    public boolean removeRolesAssignements(final RoleAssignment obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("41222ecd-1a1c-475d-b8ae-9353d2e5bccd")
    public boolean removeUserGroups(final UserGroup obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("35263e83-c18e-448f-832f-fa123ef69896")
    public boolean removeUsers(final User obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3d4518aa-154b-4a27-a251-8370bdcd0b50")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'organisation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b0e10a48-380f-4d66-a2f9-e88f0f319217")
    public void setOrganisation(final Organisation obj) {
        // Remove existing Organisations
        for (Class e : ((Package) this.elt).getOwnedElement(Class.class)) {
           if (Organisation.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the Organisation
        if (obj != null) {
            ((Package) this.elt).getOwnedElement().add(obj.getElement());
        }
    }

    /**
     * Setter for string property 'organisationEmail'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fa7c94a4-0f4f-4da9-a9eb-454404796c58")
    public void setOrganisationEmail(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a7b7b5ee-f132-4b0c-bf6d-f1012f04f6f9")
    public void setOrganisationName(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c8f7e34f-7ccb-422f-b102-0059c672f3f6")
    public void setOrganisationWebsite(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3fcee831-048a-4cbc-a54d-f62fa608ec84")
    public void setSecurityLevel(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT, value);
    }

    @objid ("5f68645e-5030-43c1-bc3d-dac2435489b6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getUsers());
        result.addAll(getExternalIdentifiers());
        result.addAll(getUserGroups());
        result.addAll(getRoles());
        result.addAll(getRolesAssignements());
        result.addAll(getPermissions());
        result.addAll(getResourceFilters());
        result.add(getOrganisation());
        return result;
    }

    @objid ("cdf2194a-5ab3-47a1-9350-eb5bead19265")
    protected OrganisationModel(final Package elt) {
        super(elt);
    }

    @objid ("eb1c285b-2873-4f8e-af1e-f7afc841bfe9")
    public static final class MdaTypes {
        @objid ("532d4f3c-ffc9-4cfb-b594-acd5d787cb20")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0e3c0906-f82d-4d72-bbb6-2f703d5e16fe")
        public static TagType ORGANISATIONNAME_TAGTYPE_ELT;

        @objid ("e3ee3297-febd-4099-b5ac-e88410bd23c3")
        public static TagType ORGANISATIONEMAIL_TAGTYPE_ELT;

        @objid ("27ab2eb4-5d4b-43ca-a9f2-6734f00c286e")
        public static TagType ORGANISATIONWEBSITE_TAGTYPE_ELT;

        @objid ("96b55409-f517-4292-a8ae-80a5e0440600")
        public static TagType SECURITYLEVEL_TAGTYPE_ELT;

        @objid ("9b96f8f9-1ac4-42d1-b360-63abf63bf8bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("34772f8d-88a8-412b-807d-582169901d82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("981375d4-fdb8-40e7-95ff-2c80c2e43602")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e44c4759-0924-40bc-95d9-3cf51944eccf");
            ORGANISATIONNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8f457b3-49af-40e8-8af6-d2a7c8a961ae");
            ORGANISATIONEMAIL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9449c6de-b56a-409f-ad60-bb01d80d128e");
            ORGANISATIONWEBSITE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cd62f8b6-56da-4e63-b459-3bace5101527");
            SECURITYLEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "faa375ab-b4ac-4c59-95c5-592a98011b70");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(CamelDesignerModule.getInstance() != null) {
			init(CamelDesignerModule.getInstance().getModuleContext());
		}
	}
    }

}
