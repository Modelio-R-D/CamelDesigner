/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("db3b77d8-cfa2-4490-bf06-f7ceedbcef1c")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("39620539-7f45-4ec9-b978-1e457fc4ad34")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("77ddbe0b-db31-445c-a383-15b95a200811")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("643fd32c-c8d7-45bc-978c-1739795d251f")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("59f4d924-8a74-4fd3-92a3-f2910bda615a")
=======
    @objid ("298eb351-9497-4fe8-b324-8661eb2224f8")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("3cd48f37-d73e-4a53-8ed1-2d6b103703e8")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("e88f01e7-2ee6-4a7c-b9c5-a9b55a68f94b")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("66a774be-3e60-4ca3-9e92-17af916434eb")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("44246b4b-2e20-4d15-9a9f-2d9016bc8f46")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String SECURITYLEVEL_TAGTYPE = "securityLevel";

    /**
     * Tells whether a {@link OrganisationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << OrganisationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("ef40624a-57ee-4b65-b3c0-5f4166cb96d2")
=======
    @objid ("dc841ccd-b564-4624-b5fb-0adb8e482514")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << OrganisationModel >> then instantiate a {@link OrganisationModel} proxy.
     * 
     * @return a {@link OrganisationModel} proxy on the created {@link Package}.
     */
<<<<<<< HEAD
    @objid ("b5550cd2-ab92-47ae-ae0e-b1bb33f74671")
=======
    @objid ("8a9e090e-cf94-429e-82e6-2e0a3d0c024e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("350c47ce-f815-4cf2-9470-45d71889dfa1")
=======
    @objid ("fc520063-9c73-4249-b053-ed18cc4036df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("708be9f8-dd5c-4df6-a7bc-a5b13ad256df")
=======
    @objid ("2cf20a85-49dd-448b-9363-9e9ea827e398")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f9a6d7ab-e1b1-4029-8e01-bb85f9cff338")
=======
    @objid ("917f3882-a0a7-4cf4-9c42-9651dc7af0cf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("50da41cc-fbbb-4c88-bf42-3343af4305d9")
=======
    @objid ("239f53f0-b9a9-4d70-bcca-eae96c7e2838")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5d157cb8-dd11-4ec1-9118-5a3c70f74fd8")
=======
    @objid ("b89ca5b9-f522-41c6-b4db-2243589dc6a7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("234507d7-86de-4e94-9cd6-7fc39665400f")
=======
    @objid ("c8668af8-d929-4516-ac2d-cc8900f6ae50")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ec5a30ff-ffc0-4eb8-ae61-53d7b0d30a92")
=======
    @objid ("abede2c8-c6a1-4e18-953e-4f471eabb2dc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("15c8a1dd-713a-4a7f-a645-eaab7275b72b")
=======
    @objid ("ee8c283a-f77c-4fe7-b259-32a3f3c33817")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b9dbea99-7059-467d-a497-9955be9da073")
=======
    @objid ("5fdf7c47-1340-4856-bb08-7bb3e015aed9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1eb73c4d-317b-431b-9820-2055035c2db1")
=======
    @objid ("c2de5471-5d87-480d-82a2-a9b407d01263")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addUsers(final User obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("715ab3e2-3b3a-4493-b496-50ee7b1d9d2a")
=======
    @objid ("1a524519-1b5f-419d-93af-4b83ad85cd78")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fc2fdf69-678e-4beb-9f8a-a085f39e5a3f")
=======
    @objid ("6d3b82e7-d28a-4f32-8eb3-612970018528")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("750926c5-9ba7-4b19-85d0-bbd4d51e30e8")
=======
    @objid ("4c41b835-c9b1-4dd7-8511-a73f22a5b916")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("09cec333-2b1a-40af-b2d5-1ae55fb8aa72")
=======
    @objid ("627e10d3-2598-4084-841e-8bc80e23f25b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5f87b19b-e103-4266-89b9-e72d9e0412e2")
=======
    @objid ("6380ed30-a7ba-44f4-bb87-5bce335d937a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c7931ea6-36e1-4750-aa23-3f96939e7018")
=======
    @objid ("69fd7595-63dd-427c-aba5-a9cb3700ce7c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b9657231-d898-4e9f-8d1b-3e8822a93bd5")
=======
    @objid ("f8bf5beb-7aec-429f-aae8-2b5e0ba8096e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOrganisationEmail() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("af8cd825-f0dc-4980-895e-66da8cb0505a")
=======
    @objid ("8a746648-1f54-4124-a0a9-af9817497e57")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOrganisationName() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c16bfd4e-ead4-431a-8d05-f2690ab3df70")
=======
    @objid ("8a691376-566f-453f-aea6-80287633cf85")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getOrganisationWebsite() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f411f1b3-cd0c-4475-99f5-9971f7fc4ec8")
=======
    @objid ("96e68fe8-d76d-4454-8ab1-d77ad0365252")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("021bde0b-bf9c-46b9-bb8c-165ed63511c4")
=======
    @objid ("701e69d9-fb46-4df7-b5cf-d55ed58b22dd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("916c1039-7cf2-4c42-a398-5e39a5c14e09")
=======
    @objid ("375dbd2f-2fae-4f50-9271-a09a903ce1b6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("af7be60a-a68c-47ff-814e-3d6d42d57218")
=======
    @objid ("42c2cf76-4747-4410-8388-acdcc53e6a2f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0cc3d6a8-b4c2-4b8c-b66f-8dfde29088fd")
=======
    @objid ("61b316d0-837f-4e5f-8cb0-735e6ed5fb8f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getSecurityLevel() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5ef47352-2fca-46a5-91ce-fe9292b3e1c7")
=======
    @objid ("ce15c9e7-4fff-43ca-9647-2c86bba6b404")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a6963d46-b3b9-4e21-a5db-23df99cd210c")
=======
    @objid ("92360611-d684-4715-998b-a1c62224157f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<User> getUsers() {
        List<User> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (User.canInstantiate(mObj))
        			results.add((User)CamelDesignerProxyFactory.instantiate(mObj, User.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("6d78ce34-295b-426a-ba4c-6498cd17ef36")
=======
    @objid ("c81328f0-e4a6-4119-95d8-79b451ca203f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("50b3be06-9855-4663-b636-76836df4952d")
=======
    @objid ("fe28b191-e3c3-4343-a3de-c8450c602a3a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeDiagrams(final OrganisationModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("01c4a25b-cb0a-4bcb-97c4-8d3fa08b1e53")
=======
    @objid ("49986907-1c6e-403e-bef5-987b82757cc3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'permissions' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("070ebf9c-3361-4bf9-95a7-59d04a3acc38")
=======
    @objid ("5fd9457c-6525-49bb-acf3-41a8dc284999")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removePermissions(final Permission obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'resourceFilters' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("db5251fb-1c6f-404b-a0f5-74379e4caebf")
=======
    @objid ("d147892e-0869-4c73-ae89-f13eb4099fda")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeResourceFilters(final ResourceFilter obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'roles' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5658d0be-3678-49f1-9bd6-5a3329c582b0")
=======
    @objid ("f49be594-0b31-4f83-8bad-201a5bb3cd88")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRoles(final Role obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'rolesAssignements' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fcf1a69a-26b5-4fc4-baa2-d2eaf932e699")
=======
    @objid ("8d8c00b6-f30b-485a-bacc-0b0f88373789")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeRolesAssignements(final RoleAssignment obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'userGroups' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("df90dbee-8e82-4e13-a008-3fb37583288c")
=======
    @objid ("03206951-8c10-4d22-8d23-024710721bf3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeUserGroups(final UserGroup obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'users' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("8d36e333-3e21-441f-a627-86afdac60a85")
=======
    @objid ("1e26af88-25a9-422f-8325-25ef2a18db70")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeUsers(final User obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("46a05559-ad9d-442c-9fe4-857db4514ac8")
=======
    @objid ("56e2ba84-1be4-41bd-aa22-ed7266a28010")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Set the value of the 'organisation' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a2202293-19d0-4294-951c-57553aec66ce")
=======
    @objid ("dd5791b2-8577-47ed-b5e2-29a31e57f577")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("90649f9c-0184-491c-93fb-6d334544e16a")
=======
    @objid ("32c03e40-c2bc-4e7e-8cfb-edf33ba80c34")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOrganisationEmail(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("025655cb-98ac-41d9-80e3-9618f2651874")
=======
    @objid ("e006c95d-71df-41fe-8daa-3682feeac0e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOrganisationName(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("7b37d97e-a7c8-4da1-9333-29504d9621fc")
=======
    @objid ("ab891c7a-3bc1-4971-849c-dcfc1a0a0460")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setOrganisationWebsite(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b94dbda0-6312-485b-a371-b2dc78e90be9")
=======
    @objid ("dac6705c-6376-402b-920b-3b76843921dc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("9ec2f419-b7d2-46a6-9294-36a639c96b25")
=======
    @objid ("b6e2dde7-233c-4444-bc6d-022c4c3e9c13")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected OrganisationModel(final Package elt) {
        super(elt);
    }

    @objid ("eb1c285b-2873-4f8e-af1e-f7afc841bfe9")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("07ea61ce-ddff-4f48-a43f-a23bfb294a14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3bb99a5c-c901-4eba-932e-043d524a15e7")
        public static TagType ORGANISATIONNAME_TAGTYPE_ELT;

        @objid ("34eb7c08-1803-4db8-accb-ce1433c85827")
        public static TagType ORGANISATIONEMAIL_TAGTYPE_ELT;

        @objid ("68df5c51-38c1-477c-8daa-43f825c84013")
        public static TagType ORGANISATIONWEBSITE_TAGTYPE_ELT;

        @objid ("b34a1b59-26de-4e8c-b082-ca3c388ddbe7")
        public static TagType SECURITYLEVEL_TAGTYPE_ELT;

        @objid ("2d760f8b-d0a0-4f0f-bf4f-717a7d4af95c")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd173ac1-ba4a-4e0e-9387-92af8a822605")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1663dda-d714-4992-98c8-53dfb146c8bc")
=======
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
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
