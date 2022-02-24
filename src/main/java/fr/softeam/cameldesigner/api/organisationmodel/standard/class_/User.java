/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
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
    @objid ("21ed139b-bf2e-4a12-9579-e155bde2cda8")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("41525a82-885d-4791-a8a3-200cc61e9322")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("26af1695-c537-4c94-ace5-5a2d728021d7")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("7f5fcdc6-e6a1-4bbe-898a-517b085eeb5d")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("25f642ec-7d83-48bb-8f69-1aa011cf224b")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("08459270-9ab5-46ec-8ef3-02a2b89c9040")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("1e9685b1-2140-4477-b351-8647528b4feb")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link User proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << User >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3a1a6ff0-4781-4c3a-980f-633612288447")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << User >> then instantiate a {@link User} proxy.
     * 
     * @return a {@link User} proxy on the created {@link Class}.
     */
    @objid ("9c01fe3b-c906-45f5-9215-467b670b654a")
    public static User create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME);
        return User.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link User} proxy from a {@link Class} stereotyped << User >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link User} proxy or <i>null</i>.
     */
    @objid ("4b6fc489-3342-4397-83a3-7cdfd149e124")
    public static User instantiate(final Class obj) {
        return User.canInstantiate(obj) ? new User(obj) : null;
    }

    /**
     * Tries to instantiate a {@link User} proxy from a {@link Class} stereotyped << User >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link User} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("5ac6fbed-6ad4-4c28-b4db-8f78491368ba")
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
     * 
     */
    @objid ("e4e24084-3998-433d-8489-797083045d6d")
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
     * 
     */
    @objid ("dd646301-d894-47e5-ba85-c175c34d4d9b")
    public void addExternalIdentifiers(final ExternalIdentifier obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("99a8664f-534e-49f8-9279-3b8ee6144980")
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
     * 
     */
    @objid ("8b3f6aa9-162f-446a-a531-ed1570f44c35")
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
     * 
     */
    @objid ("6010bc13-a539-4ecf-9cd9-0c7b8c7eadf1")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("scalabilityModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "scalabilityModels");
        }
    }

    @objid ("8791778b-a812-4f6a-8dab-38708d515468")
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
     * 
     */
    @objid ("0fbaf5df-7033-4f28-ab3b-f86ed78b4045")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e170112e-2505-4f61-bd2a-f02c61ccb663")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f59dd328-af48-4c98-ad5a-4ca69130502d")
    public String getEmail() {
        return this.elt.getTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2c0cec29-f949-42ae-b006-92bbaf3d7f43")
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
    @objid ("eb1e7e62-8b56-4da5-9ec3-2938a0aa4d29")
    public String getFirstName() {
        return this.elt.getTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dfe38339-b6eb-4bea-bc5c-77629e3e858b")
    public String getLastName() {
        return this.elt.getTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("92e53d6c-3271-473f-b0de-551c5dd4b1f7")
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
    @objid ("e23ad037-cead-4b9b-8c47-2cc017a9aca1")
    public String getPlatformCredentialName() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("99751c45-8a30-4280-8bc3-9877ddbfee97")
    public String getPlatformCredentialPassword() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("979d0445-454b-4702-bb07-b86b8196f870")
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
     * 
     */
    @objid ("949e5f9f-b12c-4ca2-b383-7457fa34479e")
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
     * 
     */
    @objid ("eb03378d-dd9e-4cfc-be90-ca85be169ba6")
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
    @objid ("c0243327-0a35-41f0-80f3-0d5037fccdda")
    public String getWww() {
        return this.elt.getTagValue(User.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("55501af6-3fc7-49f1-8cd7-e8b384555b5a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'deploymentModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65959078-76e8-49b0-bfd4-1a5acd131d0c")
    public boolean removeDeploymentModels(final DeploymentModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
     * 
     */
    @objid ("d7d341bf-7063-4aa7-a01d-1e26ec346f24")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("65b519cd-6e53-4931-8b5b-3fec34aac020")
    public boolean removeMetricModels(final MetricModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
     * 
     */
    @objid ("7085f778-660a-4f97-adea-023d1a8c6dad")
    public boolean removeRequirementModels(final RequirementModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
     * 
     */
    @objid ("a23cd192-84d7-4660-89d2-4f1d047bb21a")
    public boolean removeScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(User.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(User.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("5fddf6c9-13c9-4f70-b67b-35ae410e9f66")
    public void setEmail(final String value) {
        this.elt.putTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f5e46640-26d7-4f9e-ac9e-0acfa4a3fed7")
    public void setFirstName(final String value) {
        this.elt.putTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("800bd995-1adf-474c-8772-3d12cbbd22ca")
    public void setLastName(final String value) {
        this.elt.putTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("055ab908-bc20-428c-9bd0-974654748ee0")
    public void setPlatformCredentialName(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac437353-1d03-4ebd-b820-14127147f052")
    public void setPlatformCredentialPassword(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("76b62649-2b83-4168-8ac6-09a013bb1149")
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
    @objid ("542751cf-1344-4b05-9b85-e8e0fb3625e3")
    public void setWww(final String value) {
        this.elt.putTagValue(User.MdaTypes.WWW_TAGTYPE_ELT, value);
    }

    @objid ("f32e0630-82d6-4891-b495-1bf67285fa4b")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("70975817-5dd9-4e70-80bc-a3ed69618e90")
    protected User(final Class elt) {
        super(elt);
    }

    @objid ("e7a907de-dc21-4d17-9104-6dae192d680b")
    public static final class MdaTypes {
        @objid ("62456e3c-9ecc-495d-b43d-fb9ff56ced14")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("265c306c-7141-4dd1-ad95-e7da03d4a70a")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("d9a40fab-9a0d-4a84-bd18-7847a34f5f3b")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("efe76a66-44ff-4516-8fd0-459188a5d82e")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("0ef69332-105e-4ac2-87fa-5ac6889cf5c9")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("4bebc0ea-dabe-4760-b30a-f60b62a7cc68")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("aab968ba-7066-4c5c-ab72-d56d835ac27c")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("e6a75c28-e7b3-4fba-add0-bd36889d9470")
        private static Stereotype MDAASSOCDEP;

        @objid ("6338bd16-6e80-4d36-a874-c967d0b9474a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fce4b9dc-ebf1-40ab-97ee-a34101a3b525")
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
