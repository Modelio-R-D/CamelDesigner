/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("d47ab8ed-8b9c-414c-a358-e13f60f3b797")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("4616875d-3fb7-4349-bc4e-5aa544e08720")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("c84cd0e1-2b23-4979-a34a-9074c8e107bc")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("571480a1-598b-420e-9c7d-7ad03a88b981")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("40fe9f0c-3ada-4755-97d3-fe3146edff9e")
    public static final String SECURITYLEVEL_TAGTYPE = "securityLevel";

    /**
     * Tells whether a {@link OrganisationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << OrganisationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4fa9a1bc-0330-49a3-b940-2756598ba497")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << OrganisationModel >> then instantiate a {@link OrganisationModel} proxy.
     * 
     * @return a {@link OrganisationModel} proxy on the created {@link Package}.
     */
    @objid ("4b8f48cc-da91-4f89-be84-b6af88441dca")
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
    @objid ("446c72f9-c5f1-4021-b9b3-74fc599fb340")
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
    @objid ("80342b30-14a4-4937-8fae-3d76a7c51852")
    public static OrganisationModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (OrganisationModel.canInstantiate(obj))
        	return new OrganisationModel(obj);
        else
        	throw new IllegalArgumentException("OrganisationModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("381151ff-9a3c-405b-91bd-5704c9080e8b")
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
    @objid ("dad576b5-8717-4f99-a051-cd325241661a")
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
    @objid ("2c8dc7dc-c308-4754-acf3-fc8edad2f09e")
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
    @objid ("10b6d529-4741-47ef-99b9-e69c503da089")
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
    @objid ("6f38a0b7-f5c6-472a-b402-3344fedf15b8")
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
    @objid ("c2658051-48b9-4529-b959-f1d1809ed969")
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
    @objid ("04593a20-f45f-4933-baf5-d774ed7850d5")
    public void addUsers(final User obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("971cd907-0cae-4d00-a367-a94804f1dabd")
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
    @objid ("a2959908-367f-4c0a-aba5-89ceadca837a")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("30c7a93d-14cd-4962-b78f-a1f437f9938e")
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
    @objid ("66cd99b7-3013-4763-9a11-875bac3fb665")
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
    @objid ("37d9b279-414e-4d2d-92e0-35f054d2b08e")
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
    @objid ("77287b83-42ca-4a9d-ab5c-de26938c7792")
    public String getOrganisationEmail() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("285ac6e8-2d44-46af-8925-baf5f16c4fd4")
    public String getOrganisationName() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aaf94eb0-5b4f-4ffd-b1da-0ecd26c78313")
    public String getOrganisationWebsite() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("05c32806-7609-4a3a-8458-4ff8a93331ab")
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
    @objid ("d57c8188-7c50-42db-ac4b-2f95a392ba73")
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
    @objid ("c03a7e5f-608b-40b0-8383-2358f6a7dc94")
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
    @objid ("7f659320-9aab-483d-b23f-0a0483730bfb")
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
    @objid ("3045f430-a7d7-4f40-a63d-9fc12a3f59a1")
    public String getSecurityLevel() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5d071367-490c-4921-be9c-2240a8069914")
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
    @objid ("b0b208a3-1af2-4025-9892-f44511c37441")
    public List<User> getUsers() {
        List<User> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (User.canInstantiate(mObj))
        			results.add((User)CamelDesignerProxyFactory.instantiate(mObj, User.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("406b61a2-c677-4ca3-83cb-65d0f1384c6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("de5824b3-caf6-4270-b7e4-5e56188a48d0")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76037d77-a167-48b4-ad93-ac2659230a84")
    public boolean removePermissions(final Permission obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'resourceFilters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f2a4dbc1-92ea-4b3b-86d5-d21293c86407")
    public boolean removeResourceFilters(final ResourceFilter obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'roles' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dee14ee5-91cb-4132-bc87-195ed9ac0705")
    public boolean removeRoles(final Role obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rolesAssignements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e1b15031-fa73-4d5f-9d6d-b3ce47858e65")
    public boolean removeRolesAssignements(final RoleAssignment obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d2c87607-c054-40eb-890f-6961e102eedf")
    public boolean removeUserGroups(final UserGroup obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8d691ebb-cbc3-4405-944a-c26bae6d3f75")
    public boolean removeUsers(final User obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e7e2463f-66e4-4856-a023-79eb2aa0a87a")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'organisation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d874d058-8d7e-4865-ba77-333af0c704c6")
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
    @objid ("916434fa-0d9a-4365-aed0-d1d446305018")
    public void setOrganisationEmail(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3550c2bf-eaa8-4afb-b464-57a83f1d3cda")
    public void setOrganisationName(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9d70118b-22ce-4678-8a50-166b55de120e")
    public void setOrganisationWebsite(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b3e5938b-9710-4658-bc94-782c202f48bb")
    public void setSecurityLevel(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT, value);
    }

    @objid ("5f68645e-5030-43c1-bc3d-dac2435489b6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("da973206-bd25-4358-a90a-963ef026985b")
    protected OrganisationModel(final Package elt) {
        super(elt);
    }

    @objid ("eb1c285b-2873-4f8e-af1e-f7afc841bfe9")
    public static final class MdaTypes {
        @objid ("f2db5a05-df20-4085-be01-c104e917f53e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0cd9fac0-1db8-483e-a86d-5c257701e15a")
        public static TagType ORGANISATIONNAME_TAGTYPE_ELT;

        @objid ("a5892cc4-a125-4aa2-a3ac-8abdc3acc81c")
        public static TagType ORGANISATIONEMAIL_TAGTYPE_ELT;

        @objid ("7602fd0f-f5fb-40e5-a40c-2fed5851f000")
        public static TagType ORGANISATIONWEBSITE_TAGTYPE_ELT;

        @objid ("b12641e0-7686-4eaa-b02f-ad8c808f053e")
        public static TagType SECURITYLEVEL_TAGTYPE_ELT;

        @objid ("0eb6c65d-ab37-4263-aeed-4ac917f8484c")
        private static Stereotype MDAASSOCDEP;

        @objid ("e8156a1f-766a-4763-8f8b-a19c467efc53")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ffd2b15a-d7ca-4908-9ab6-89cab91cc1f5")
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
