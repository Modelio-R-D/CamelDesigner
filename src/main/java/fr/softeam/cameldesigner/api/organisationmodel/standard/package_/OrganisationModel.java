/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("74928215-8501-4090-9d80-6ac624c5e0fe")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("f52208c7-0d48-4705-8de1-99798a81a5d7")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("7882fb7c-f79d-4301-8a74-8a583d1fb042")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("42af26f2-f9e0-4b93-a3da-2db834d7d033")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("eded23d9-3ec2-4d8c-af55-4aa9ba90a5a0")
    public static final String SECURITYLEVEL_TAGTYPE = "securityLevel";

    /**
     * Tells whether a {@link OrganisationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << OrganisationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("33b8fe7d-29ae-41db-aa47-7d462327a6e6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << OrganisationModel >> then instantiate a {@link OrganisationModel} proxy.
     * 
     * @return a {@link OrganisationModel} proxy on the created {@link Package}.
     */
    @objid ("57ef1c19-8b34-4d5e-9f17-0753f3486b18")
    public static OrganisationModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME);
        return OrganisationModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link OrganisationModel} proxy from a {@link Package} stereotyped << OrganisationModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link OrganisationModel} proxy or <i>null</i>.
     */
    @objid ("16119a2a-1d12-4815-8410-30f0b95e2287")
    public static OrganisationModel instantiate(final Package obj) {
        return OrganisationModel.canInstantiate(obj) ? new OrganisationModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OrganisationModel} proxy from a {@link Package} stereotyped << OrganisationModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link OrganisationModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c51d7de9-54a8-4013-8ffd-3d857f2b2307")
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
     */
    @objid ("5960e247-984a-487e-9a4e-9e41d042af93")
    public void addExternalIdentifiers(final ExternalIdentifier obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'permissions' role.<p>
     * Role description:
     * null
     */
    @objid ("dd478e39-e536-4990-aed5-526b39f05bfe")
    public void addPermissions(final Permission obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'resourceFilters' role.<p>
     * Role description:
     * null
     */
    @objid ("b9ef95d9-fb1a-49ab-aef9-34046ae4d0fb")
    public void addResourceFilters(final ResourceFilter obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'roles' role.<p>
     * Role description:
     * null
     */
    @objid ("e11cc02d-8a1b-4bc5-9b74-228af73a9b17")
    public void addRoles(final Role obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'rolesAssignements' role.<p>
     * Role description:
     * null
     */
    @objid ("d80b8d24-c626-4958-9592-cdb0f2905823")
    public void addRolesAssignements(final RoleAssignment obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'userGroups' role.<p>
     * Role description:
     * null
     */
    @objid ("8488b8fd-bd03-4a56-9eda-12900479f03a")
    public void addUserGroups(final UserGroup obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'users' role.<p>
     * Role description:
     * null
     */
    @objid ("dfe655cd-154a-418d-a90c-84f68d082833")
    public void addUsers(final User obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("30150173-a386-4e9d-a8ee-d70b5c166dd6")
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
     */
    @objid ("9900566f-b726-4a92-b781-27761be5691e")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("11b8c04d-6c12-42dd-a3a5-9622e6dcdaa5")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     */
    @objid ("5070f1d2-9f2a-4509-929e-6be0fad66adc")
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
     */
    @objid ("5cc5c72b-3a36-40ed-a6c9-8b25f6f321a1")
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
    @objid ("49734d5d-b4fa-4cb6-b740-82a47edb80ef")
    public String getOrganisationEmail() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85452947-45d9-4032-9eb4-64aee57e9f42")
    public String getOrganisationName() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0735d8b3-4fa8-4711-996e-08c314d2ff69")
    public String getOrganisationWebsite() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'permissions' role.<p>
     * Role description:
     * null
     */
    @objid ("c28e9f4b-2ecf-49f3-971e-8cf8a9037171")
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
     */
    @objid ("ef0c146d-2398-40de-a96d-cd64606f6005")
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
     */
    @objid ("26850b6e-126c-43ad-b149-6099b98d174b")
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
     */
    @objid ("57910d30-0089-4605-9f86-42f123b02dee")
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
    @objid ("4bac376e-7f4d-4922-b6b0-7c15979d4ed4")
    public String getSecurityLevel() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'userGroups' role.<p>
     * Role description:
     * null
     */
    @objid ("114e7612-9977-4757-bf6c-d2781c12153c")
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
     */
    @objid ("58004d13-b743-495f-b96d-8de1ca83a1e0")
    public List<User> getUsers() {
        List<User> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (User.canInstantiate(mObj))
                    results.add((User)CamelDesignerProxyFactory.instantiate(mObj, User.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("858dfe83-19a4-4f85-bf5f-fc7f5a8762de")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     */
    @objid ("349bded2-e940-4151-a5e6-4d49820af533")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'permissions' role.<p>
     * Role description:
     * null
     */
    @objid ("729a6bc6-dda2-4621-a4fc-8552f5862290")
    public boolean removePermissions(final Permission obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'resourceFilters' role.<p>
     * Role description:
     * null
     */
    @objid ("5a6b9d2f-d151-4049-9591-97969e64b10c")
    public boolean removeResourceFilters(final ResourceFilter obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'roles' role.<p>
     * Role description:
     * null
     */
    @objid ("94cf030c-4647-4b7e-941e-93adb28ffa51")
    public boolean removeRoles(final Role obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rolesAssignements' role.<p>
     * Role description:
     * null
     */
    @objid ("75ad0f84-4845-420f-a4bf-79be3d696298")
    public boolean removeRolesAssignements(final RoleAssignment obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'userGroups' role.<p>
     * Role description:
     * null
     */
    @objid ("97275e69-31ba-4590-a8c0-a6ed37d6b032")
    public boolean removeUserGroups(final UserGroup obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'users' role.<p>
     * Role description:
     * null
     */
    @objid ("dbb2cfca-39ec-45b8-ba3b-797012ab5f6f")
    public boolean removeUsers(final User obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("aa98f33b-0ae6-496b-897d-3507f5af28a3")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'organisation' role.<p>
     * Role description:
     * null
     */
    @objid ("da2e2bec-a475-4903-b25b-232816958060")
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
    @objid ("da3159d0-7341-46a0-8259-830e528aaa62")
    public void setOrganisationEmail(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4328405f-f639-46e2-80a6-6099f88c0c66")
    public void setOrganisationName(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("01f8ac62-11c6-475e-a2e3-bcaec3192985")
    public void setOrganisationWebsite(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0999084e-0230-4f5c-91a7-87005f620e50")
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

    @objid ("23888a24-d989-4d36-b5e9-38cd62543029")
    protected OrganisationModel(final Package elt) {
        super(elt);
    }

    @objid ("eb1c285b-2873-4f8e-af1e-f7afc841bfe9")
    public static final class MdaTypes {
        @objid ("a9d772bb-e257-4062-82b6-cdc8552d3175")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4d7a392d-53a6-46f1-bb0d-327dbcff3733")
        public static TagType ORGANISATIONNAME_TAGTYPE_ELT;

        @objid ("4003e550-3bc6-4f8c-ab64-65f3da87f449")
        public static TagType ORGANISATIONEMAIL_TAGTYPE_ELT;

        @objid ("f1881d08-5384-4a07-aaa3-2188bb9083b4")
        public static TagType ORGANISATIONWEBSITE_TAGTYPE_ELT;

        @objid ("f325075d-0dae-4e3c-a656-d480e7a53a1d")
        public static TagType SECURITYLEVEL_TAGTYPE_ELT;

        @objid ("514e3de0-7bf6-4a8a-ac9b-8ac2d32263eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("6d137e4b-bde2-469a-87eb-a2a31b8b36e1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26352e96-2ce4-4d3d-95cf-5c09c42f93c7")
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
