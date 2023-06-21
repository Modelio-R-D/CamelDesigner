/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("48c53629-8aad-4857-ac0b-6206f6196b9e")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("fddb1128-f8f3-4d44-8ed9-ffd51a48a7f4")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("cb82cf95-757f-47e6-bf6b-95dbde4263d5")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("95bc394e-6c44-492f-8f61-bba68884f0c7")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("5e0abd4f-c05c-4b2f-bad5-9ee6b1e567df")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("ec0d5b8e-aa61-4caf-a565-d9c8cd7f12fc")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("3ff5a05a-89ff-48ab-9f98-0751d0c6d1ff")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link User proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << User >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("02acdabc-6895-48c8-b0f4-07de4f7b6aa7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << User >> then instantiate a {@link User} proxy.
     * 
     * @return a {@link User} proxy on the created {@link Class}.
     */
    @objid ("8c03d70e-6a09-4015-b105-6d1ac0c6ddae")
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
    @objid ("84fa5c95-0b52-4628-a392-fda4a8bd9210")
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
    @objid ("e7b2e69b-1c3a-41e8-a7c4-497be8adb2ef")
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
    @objid ("9e5e779d-84ec-449d-99b6-e4f083b9e6ff")
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
    @objid ("8dc37490-ced5-48f8-9423-a5ba595c5a86")
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
    @objid ("b25491d7-4cb6-405e-ac86-015ad1cf06e9")
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
    @objid ("d92a338b-6cc9-412f-b70b-a2e1fd7b2508")
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
    @objid ("7dd57a0b-8dda-418c-ae52-fc01956a4f7e")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("scalabilityModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "scalabilityModels");
        }
    }

    @objid ("69a80d55-9045-4e5c-ac85-a3426273163e")
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
    @objid ("7896c0af-90c6-4934-b754-32753eb6948c")
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
    @objid ("dd2477aa-d97e-4ee4-8202-70509ac690cd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0cbb2872-25e5-4377-8950-825008728dac")
    public String getEmail() {
        return this.elt.getTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8377bc83-681b-4277-ab2d-3f4999f34087")
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
    @objid ("69b4e2f8-8c1c-454c-b749-48658932810a")
    public String getFirstName() {
        return this.elt.getTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("70440498-f819-451b-9a47-97aff6a33135")
    public String getLastName() {
        return this.elt.getTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3c658a81-d2b6-44dc-9e8c-567bbb5d314c")
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
    @objid ("114fe421-4e0a-439a-b28c-e86c5e6e4922")
    public String getPlatformCredentialName() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac62c9db-9d5a-4df4-ac08-3932ca24063d")
    public String getPlatformCredentialPassword() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd3b6d7d-50af-4c3e-96f5-16c97bb87399")
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
    @objid ("e6d1b11d-6bda-4aa6-9739-076a7786265c")
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
    @objid ("236bb7a9-be97-4afe-84a0-f57e1e3553e4")
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
    @objid ("6e497d23-d536-4466-b929-43b25a1513f7")
    public String getWww() {
        return this.elt.getTagValue(User.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("5df78ee5-32ff-4b79-b269-d4d18a94b8d3")
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
    @objid ("8504db39-2958-4e4a-9734-d14bcf7e086c")
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
     * 
     */
    @objid ("0eabf1e0-34b6-49da-aa8a-818776596e74")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cb9e10be-42ee-4e8c-afa2-6830c83b53d7")
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
     * 
     */
    @objid ("1f2d256c-de06-46e5-ba09-3d4425fe20d8")
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
     * 
     */
    @objid ("bc7abd8e-af4e-42d7-8d06-3c8e54025301")
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
    @objid ("1be40a12-a556-4326-b662-c5b4248e6ed5")
    public void setEmail(final String value) {
        this.elt.putTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("84076d4e-1dfc-4035-bb3a-a2ae84f28238")
    public void setFirstName(final String value) {
        this.elt.putTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e0c914b6-ca31-4437-98fd-f3329307d5cc")
    public void setLastName(final String value) {
        this.elt.putTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac51392e-e5fc-4173-8449-6795be017ce5")
    public void setPlatformCredentialName(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("56038449-b3b8-42e7-98ea-129b131c6b4f")
    public void setPlatformCredentialPassword(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c42a79be-5ddf-41b7-bf69-ffff03211255")
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
    @objid ("557f4781-77f9-4514-97a7-4cb9bda95f36")
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

    @objid ("7e0bd437-f093-4adf-a07f-70de8cf1c884")
    protected User(final Class elt) {
        super(elt);
    }

    @objid ("e7a907de-dc21-4d17-9104-6dae192d680b")
    public static final class MdaTypes {
        @objid ("eaa5a275-1317-40e2-a0a5-1d8622806edf")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("46acec1e-bba5-4f45-bb68-8098beb751ca")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("6e97dcc7-34ac-4083-af5a-495abe9d3fd1")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("43d32dea-0cd9-4d6e-97a6-e5fa9e7d830d")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("e95de880-318d-4e34-9781-1fb9d7710b76")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("7052fcae-08c0-4383-aac4-bed24b1a2aee")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("033f39c2-29a1-4caa-ad8d-48bbfefd1331")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("1be840c5-5682-4ed3-ab35-3b768691e021")
        private static Stereotype MDAASSOCDEP;

        @objid ("0bdea4ea-a5ea-4985-af5b-52f315a39569")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("139afc96-9c89-4c90-997e-74f5feaa7a23")
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
