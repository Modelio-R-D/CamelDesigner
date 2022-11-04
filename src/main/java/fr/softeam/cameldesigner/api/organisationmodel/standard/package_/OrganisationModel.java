/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("298eb351-9497-4fe8-b324-8661eb2224f8")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("3cd48f37-d73e-4a53-8ed1-2d6b103703e8")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("e88f01e7-2ee6-4a7c-b9c5-a9b55a68f94b")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("66a774be-3e60-4ca3-9e92-17af916434eb")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("44246b4b-2e20-4d15-9a9f-2d9016bc8f46")
    public static final String SECURITYLEVEL_TAGTYPE = "securityLevel";

    /**
     * Tells whether a {@link OrganisationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << OrganisationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dc841ccd-b564-4624-b5fb-0adb8e482514")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << OrganisationModel >> then instantiate a {@link OrganisationModel} proxy.
     * 
     * @return a {@link OrganisationModel} proxy on the created {@link Package}.
     */
    @objid ("8a9e090e-cf94-429e-82e6-2e0a3d0c024e")
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
    @objid ("fc520063-9c73-4249-b053-ed18cc4036df")
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
    @objid ("2cf20a85-49dd-448b-9363-9e9ea827e398")
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
    @objid ("917f3882-a0a7-4cf4-9c42-9651dc7af0cf")
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
    @objid ("239f53f0-b9a9-4d70-bcca-eae96c7e2838")
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
    @objid ("b89ca5b9-f522-41c6-b4db-2243589dc6a7")
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
    @objid ("c8668af8-d929-4516-ac2d-cc8900f6ae50")
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
    @objid ("abede2c8-c6a1-4e18-953e-4f471eabb2dc")
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
    @objid ("ee8c283a-f77c-4fe7-b259-32a3f3c33817")
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
    @objid ("5fdf7c47-1340-4856-bb08-7bb3e015aed9")
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
    @objid ("c2de5471-5d87-480d-82a2-a9b407d01263")
    public void addUsers(final User obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("1a524519-1b5f-419d-93af-4b83ad85cd78")
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
    @objid ("6d3b82e7-d28a-4f32-8eb3-612970018528")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4c41b835-c9b1-4dd7-8511-a73f22a5b916")
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
    @objid ("627e10d3-2598-4084-841e-8bc80e23f25b")
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
    @objid ("6380ed30-a7ba-44f4-bb87-5bce335d937a")
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
    @objid ("69fd7595-63dd-427c-aba5-a9cb3700ce7c")
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
    @objid ("f8bf5beb-7aec-429f-aae8-2b5e0ba8096e")
    public String getOrganisationEmail() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a746648-1f54-4124-a0a9-af9817497e57")
    public String getOrganisationName() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a691376-566f-453f-aea6-80287633cf85")
    public String getOrganisationWebsite() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("96e68fe8-d76d-4454-8ab1-d77ad0365252")
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
    @objid ("701e69d9-fb46-4df7-b5cf-d55ed58b22dd")
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
    @objid ("375dbd2f-2fae-4f50-9271-a09a903ce1b6")
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
    @objid ("42c2cf76-4747-4410-8388-acdcc53e6a2f")
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
    @objid ("61b316d0-837f-4e5f-8cb0-735e6ed5fb8f")
    public String getSecurityLevel() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ce15c9e7-4fff-43ca-9647-2c86bba6b404")
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
    @objid ("92360611-d684-4715-998b-a1c62224157f")
    public List<User> getUsers() {
        List<User> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (User.canInstantiate(mObj))
        			results.add((User)CamelDesignerProxyFactory.instantiate(mObj, User.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("c81328f0-e4a6-4119-95d8-79b451ca203f")
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
    @objid ("fe28b191-e3c3-4343-a3de-c8450c602a3a")
    public boolean removeDiagrams(final OrganisationModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("49986907-1c6e-403e-bef5-987b82757cc3")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5fd9457c-6525-49bb-acf3-41a8dc284999")
    public boolean removePermissions(final Permission obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'resourceFilters' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d147892e-0869-4c73-ae89-f13eb4099fda")
    public boolean removeResourceFilters(final ResourceFilter obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'roles' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f49be594-0b31-4f83-8bad-201a5bb3cd88")
    public boolean removeRoles(final Role obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rolesAssignements' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8d8c00b6-f30b-485a-bacc-0b0f88373789")
    public boolean removeRolesAssignements(final RoleAssignment obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("03206951-8c10-4d22-8d23-024710721bf3")
    public boolean removeUserGroups(final UserGroup obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'users' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1e26af88-25a9-422f-8325-25ef2a18db70")
    public boolean removeUsers(final User obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56e2ba84-1be4-41bd-aa22-ed7266a28010")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'organisation' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dd5791b2-8577-47ed-b5e2-29a31e57f577")
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
    @objid ("32c03e40-c2bc-4e7e-8cfb-edf33ba80c34")
    public void setOrganisationEmail(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e006c95d-71df-41fe-8daa-3682feeac0e7")
    public void setOrganisationName(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ab891c7a-3bc1-4971-849c-dcfc1a0a0460")
    public void setOrganisationWebsite(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dac6705c-6376-402b-920b-3b76843921dc")
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

    @objid ("b6e2dde7-233c-4444-bc6d-022c4c3e9c13")
    protected OrganisationModel(final Package elt) {
        super(elt);
    }

    @objid ("eb1c285b-2873-4f8e-af1e-f7afc841bfe9")
    public static final class MdaTypes {
        @objid ("a046a27c-a22b-4a20-877f-960a874b73c1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4de97a4-88fe-4dc7-9092-2cc5931971a1")
        public static TagType ORGANISATIONNAME_TAGTYPE_ELT;

        @objid ("6a57e92d-2b2c-4689-b2e8-c8cc02cd0513")
        public static TagType ORGANISATIONEMAIL_TAGTYPE_ELT;

        @objid ("680f0c58-3ae3-4d5c-b0c6-87419d62386f")
        public static TagType ORGANISATIONWEBSITE_TAGTYPE_ELT;

        @objid ("8c8482d2-422f-4748-82c5-2879969d7ae1")
        public static TagType SECURITYLEVEL_TAGTYPE_ELT;

        @objid ("379e06a0-f133-42bc-a9fd-17ab8de452c4")
        private static Stereotype MDAASSOCDEP;

        @objid ("8f808be5-12e8-431b-9abc-7a083e8ec9c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4778cb91-77ac-4166-ba92-d4cfbd7832f9")
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
