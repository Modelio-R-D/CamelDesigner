/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << User >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("27994015-90c9-40c1-8a60-3c9bc12fff11")
public class User extends Entity {
    @objid ("ff89287a-8052-4ede-b0c5-a34aa3b3ac14")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("8f8b9115-beaa-4a40-8662-c1055ba279d2")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("472a7d24-2f6a-41ea-a2f7-0901307165c7")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("3d71b47c-4dc7-4df6-b5cf-963f7e77718c")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("b8445973-7d9a-4d7a-be77-1391e4d5b6c6")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("7331dd7a-bd1c-476a-add8-0f29dc197ccc")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("0229cf6f-8b86-42e7-be02-af9f561f7619")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link User proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << User >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a7823e65-6e42-498f-b323-e3f53b4f732f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << User >> then instantiate a {@link User} proxy.
     * 
     * @return a {@link User} proxy on the created {@link Class}.
     */
    @objid ("f9e03225-30d5-48c3-8a53-9285687292b5")
    public static User create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME);
        return User.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link User} proxy from a {@link Class} stereotyped << User >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link User} proxy or <i>null</i>.
     */
    @objid ("2e902d5d-7eb9-45d6-8ff3-f16c49ec4e53")
    public static User instantiate(final Class obj) {
        return User.canInstantiate(obj) ? new User(obj) : null;
    }

    /**
     * Tries to instantiate a {@link User} proxy from a {@link Class} stereotyped << User >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link User} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("747857ba-d8a3-4416-befc-e1897f31840d")
    public static User safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (User.canInstantiate(obj))
            return new User(obj);
        else
            throw new IllegalArgumentException("User: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("d5795ca7-0d41-44a0-997b-f9781ddda62f")
    public void addDeploymentModels(final DeploymentModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("deploymentModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "deploymentModels");
        }
    }

    /**
     * Add a value to the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     */
    @objid ("e29fd260-fff0-4887-af4a-cb1a750cd106")
    public void addExternalIdentifiers(final ExternalIdentifier obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("4da49e6f-0bf8-4698-9653-7a61fedca24c")
    public void addMetricModels(final MetricModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("metricModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "metricModels");
        }
    }

    /**
     * Add a value to the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("8fb7a240-ce15-4486-9c98-74f8d03c8bab")
    public void addRequirementModels(final RequirementModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("requirementModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "requirementModels");
        }
    }

    /**
     * Add a value to the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("9e1b79bf-6406-48e3-b009-edbc001945ec")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("scalabilityModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "scalabilityModels");
        }
    }

    @objid ("26fd33b0-d70f-4a06-bbf9-cc454569a946")
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
        User other = (User) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("5bef36b6-f95f-424b-bb0b-f2166712e7bf")
    public List<DeploymentModel> getDeploymentModels() {
        List<DeploymentModel> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "deploymentModels")){
              if (DeploymentInstanceModel.canInstantiate(d.getDependsOn()))
                results.add((DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName()));
              if (DeploymentTypeModel.canInstantiate(d.getDependsOn()))
                results.add((DeploymentTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("046cc5c1-b127-4368-a77b-d0762510c739")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("85a60b93-9d47-48e1-baf8-685a55f5483d")
    public String getEmail() {
        return this.elt.getTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     */
    @objid ("8831d865-9500-447e-89dd-74f77fe876b6")
    public List<ExternalIdentifier> getExternalIdentifiers() {
        List<ExternalIdentifier> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
            if (ExternalIdentifier.canInstantiate(mObj))
                    results.add((ExternalIdentifier)CamelDesignerProxyFactory.instantiate(mObj, ExternalIdentifier.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f65f8308-0a47-4bd8-b682-460be706aeef")
    public String getFirstName() {
        return this.elt.getTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9ca34c03-3b65-4193-8c91-776de3a378b4")
    public String getLastName() {
        return this.elt.getTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("29328246-ebbb-48c1-a9ad-49d15e7b1963")
    public List<MetricModel> getMetricModels() {
        List<MetricModel> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "metricModels")){
              if (MetricInstanceModel.canInstantiate(d.getDependsOn()))
                results.add((MetricInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstanceModel.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MetricTypeModel.canInstantiate(d.getDependsOn()))
                results.add((MetricTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTypeModel.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("707e848c-99bb-4571-975d-e00d724454b0")
    public String getPlatformCredentialName() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("279001f1-f0c0-4496-aa54-a248953ed432")
    public String getPlatformCredentialPassword() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'platformCredentials' role.<p>
     * Role description:
     * null
     */
    @objid ("001ea52c-69e7-45ce-b95c-02958d4056dc")
    public PlatformCredentials getPlatformCredentials() {
        for (Class obj : ((Class) this.elt).getOwnedElement(Class.class)) {
         if (PlatformCredentials.canInstantiate(obj))
           return (PlatformCredentials)CamelDesignerProxyFactory.instantiate(obj, PlatformCredentials.STEREOTYPE_NAME);
        }
        return null;
    }

    /**
     * Get the values of the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("e41aea5c-e374-4f5e-b1a2-4551ae9f185a")
    public List<RequirementModel> getRequirementModels() {
        List<RequirementModel> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "requirementModels")){
              if (RequirementModel.canInstantiate(d.getDependsOn()))
                results.add((RequirementModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementModel.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("5cc3aeb8-d081-4caa-825a-9614bf24ac12")
    public List<ScalabilityModel> getScalabilityModels() {
        List<ScalabilityModel> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "scalabilityModels")){
              if (ScalabilityModel.canInstantiate(d.getDependsOn()))
                results.add((ScalabilityModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScalabilityModel.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dbec7ece-0b01-4ed8-84cd-c602f05c90c2")
    public String getWww() {
        return this.elt.getTagValue(User.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("09b4ce8e-9aee-4b6d-8de4-c428113f2057")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     */
    @objid ("14922580-940e-4933-82f5-678182f1f9a9")
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "deploymentModels")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     */
    @objid ("cd0b75f7-322c-4d99-b4a6-a29715feed57")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     */
    @objid ("589a79ee-a00d-49c8-b821-882ba9a6503a")
    public boolean removeMetricModels(final MetricModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "metricModels")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'requirementModels' role.<p>
     * Role description:
     * null
     */
    @objid ("44800230-93d7-4266-bc4b-81b2059f2c49")
    public boolean removeRequirementModels(final RequirementModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "requirementModels")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'scalabilityModels' role.<p>
     * Role description:
     * null
     */
    @objid ("01d964a6-b319-497e-8c2c-3b5047d33106")
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "scalabilityModels")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d30fc886-f59d-4a6c-8c9c-379475e0ecec")
    public void setEmail(final String value) {
        this.elt.putTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("30838809-0231-45b1-b37c-804042b74f5c")
    public void setFirstName(final String value) {
        this.elt.putTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f693e56d-769f-48e1-9fc4-28e4345fd13c")
    public void setLastName(final String value) {
        this.elt.putTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fec347b8-e800-4dc3-87d6-93b3362fa207")
    public void setPlatformCredentialName(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dcb54400-2657-46f6-82ff-5cd0280d265b")
    public void setPlatformCredentialPassword(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'platformCredentials' role.<p>
     * Role description:
     * null
     */
    @objid ("a7a27fcf-27f0-4386-a80c-bb6318443088")
    public void setPlatformCredentials(final PlatformCredentials obj) {
        // Remove existing PlatformCredentialss
        for (Class e : ((Class) this.elt).getOwnedElement(Class.class)) {
           if (PlatformCredentials.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the PlatformCredentials
        if (obj != null) {
            ((Class) this.elt).getOwnedElement().add(obj.getElement());
        }
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5453fe6-71d0-4ee3-9719-be4bd7f6e6e0")
    public void setWww(final String value) {
        this.elt.putTagValue(User.MdaTypes.WWW_TAGTYPE_ELT, value);
    }

    @objid ("f32e0630-82d6-4891-b495-1bf67285fa4b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.add(getPlatformCredentials());
        return result;
    }

    @objid ("36860e8e-eb60-40a3-9979-2a3e2f0bbad7")
    protected User(final Class elt) {
        super(elt);
    }

    @objid ("e7a907de-dc21-4d17-9104-6dae192d680b")
    public static final class MdaTypes {
        @objid ("8bf83038-3f5a-4fb3-b5a4-00c55d7ac9d9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4b47b5d-b878-47fc-970f-35b8d5022e26")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("f50f6d64-5b86-4b56-bac7-0e1aa91c7b6b")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("7aa00b5f-5479-4647-8ba6-9c8cc0163870")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("e2b64565-7c15-4998-bdf0-d014f9eb3a6e")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("4bb9ded2-3018-4b67-ba80-7d687db7daae")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("44e9b5c2-77c6-4f14-a3d2-d6ff0c6a453e")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("38d06f83-34a4-4b6c-b2e5-58f1555939fa")
        private static Stereotype MDAASSOCDEP;

        @objid ("30100326-5c32-4bd6-b61c-0b0128003b7a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("45e47791-4ffa-46a4-8b08-947809f2ac91")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a36b6005-fc91-4d36-bf4a-4b39194d892b");
            EMAIL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "23c8cc8c-ec83-45ef-aa8c-3089186d0437");
            FIRSTNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a293b940-1081-4a06-8e26-c2a71f692b11");
            LASTNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5e360b5-9a54-4f3a-982f-305bc0bb0ffa");
            WWW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ab04f702-4373-4755-964c-4af996f0b47a");
            PLATFORMCREDENTIALNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02fe1cbf-75ac-419d-b683-7e0076fde173");
            PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fde2e502-b458-4bd0-a9f4-2617c9bada0a");
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
