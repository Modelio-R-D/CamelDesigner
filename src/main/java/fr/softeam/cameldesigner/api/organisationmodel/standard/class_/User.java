/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("d651039c-a70d-450d-85ae-91e573be1f16")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("830b14db-69c2-456b-91b6-785ef7a25392")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("d82e4484-6e2f-48af-bd5a-e5fa3ed307c4")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("bcd7a588-7a19-4809-93e0-986bcc274ceb")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("06f25de1-929b-4cec-b8aa-3901c1e9702f")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("8fca14ba-8120-49b6-b5f5-c5e87927fb5d")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("b05ff01d-90b8-456a-b26c-b6a8a69fe412")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link User proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << User >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8baf2d92-dc55-4747-8219-77bce9ea66ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << User >> then instantiate a {@link User} proxy.
     * 
     * @return a {@link User} proxy on the created {@link Class}.
     */
    @objid ("8c4fd12f-a998-4fba-978a-af3ce5db8ee1")
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
    @objid ("71f70601-cfe8-4176-bcb9-31d49f8e8362")
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
    @objid ("70824c9e-d047-4157-bea2-a7f0f5d13c1d")
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
    @objid ("d4c362c3-a467-4e7e-9db2-9bc3b576dc5e")
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
    @objid ("0a237824-bd25-42ae-90b8-6071b85a220a")
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
    @objid ("db4461c5-5a28-4991-a866-5f302b5e290f")
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
    @objid ("71bb09c7-1db2-4850-81b6-4d9daa1a5065")
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
    @objid ("93811329-09b4-464f-b056-e37cf410621f")
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("scalabilityModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "scalabilityModels");
        }
    }

    @objid ("1403161c-ba54-43ff-8a3c-8bd7163e52df")
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
    @objid ("c472dd69-2951-4fe4-9c5e-9c6c0044099b")
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
    @objid ("8f44d057-8ac2-4a99-99c7-a8473f60dbff")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("51c9e5ae-ccc7-48fd-985a-e61e29e1a29c")
    public String getEmail() {
        return this.elt.getTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0081b28b-4bc0-406a-9a4e-bec9587452a8")
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
    @objid ("1d23beaa-4db4-4889-b1d1-dae2b73929b6")
    public String getFirstName() {
        return this.elt.getTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ec3ad86d-a359-447b-8293-553c4948baa1")
    public String getLastName() {
        return this.elt.getTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e15b9a62-d8d8-4b83-a588-149e25247ca3")
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
    @objid ("18ade53a-46d8-4565-a197-2f04e9fb6bcb")
    public String getPlatformCredentialName() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd625d59-11ca-48a5-81e6-8a0ad85c8533")
    public String getPlatformCredentialPassword() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("05d0dd32-94a5-4919-a44f-acd457aaae92")
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
    @objid ("56a18f91-1b0e-45fa-a306-3b65e8331296")
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
    @objid ("b286c51e-19a0-4662-84a0-a5490ff31538")
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
    @objid ("806937f0-6076-4eed-a691-674142ab6698")
    public String getWww() {
        return this.elt.getTagValue(User.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("d5139d0f-4980-4d05-8dbc-e95ff3f1e59b")
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
    @objid ("38e4b2ac-06b9-4eea-9fc5-4c5224772773")
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
    @objid ("c0d1aeaa-1ad2-4cb2-9ee4-bcb41d850a1e")
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("18cab000-bba1-4ef6-9680-94355af0ccf5")
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
    @objid ("24ee5eb6-1116-4db0-a248-647d0e5d5425")
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
    @objid ("459cdc69-4fd3-4109-97e6-d2d8b75fcd65")
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
    @objid ("74835bdb-506d-43ad-be65-1e5e44be7742")
    public void setEmail(final String value) {
        this.elt.putTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("79b6a607-0f18-4ba4-847e-d253a6b355b1")
    public void setFirstName(final String value) {
        this.elt.putTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f75a1fe3-0832-45f6-87ad-3a9b9ccf7071")
    public void setLastName(final String value) {
        this.elt.putTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de471fa0-503e-4d12-b478-b846a57550bb")
    public void setPlatformCredentialName(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c1e2f850-1803-43f6-860a-13aaa6902724")
    public void setPlatformCredentialPassword(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bb834d80-6b2c-43f8-84c9-9e95a5ced9a8")
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
    @objid ("0960156e-cc67-4f85-aaf3-ae530b3afc61")
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

    @objid ("17b67ca7-6a4c-41c4-bbd4-b8d3353513a9")
    protected User(final Class elt) {
        super(elt);
    }

    @objid ("e7a907de-dc21-4d17-9104-6dae192d680b")
    public static final class MdaTypes {
        @objid ("6cf1370e-874d-4486-9778-32aeaa53b0c9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("28d667e4-3fd3-4e7f-8ab9-82011997b0bc")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("b9fa56e1-56ce-4f00-a3bb-b555c8ed91fe")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("d12fe0ed-8ca8-444f-b789-9203ddc57bbc")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("9a54f8f9-1fae-4c1c-83ee-a2e5ad0e7c82")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("f7994376-48c0-4642-9759-4518f4a303bc")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("be0d6ecf-9e5b-406e-b9ec-85dfec3d742f")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("d510ba6d-63ed-4954-8eb2-a61fd059aa5a")
        private static Stereotype MDAASSOCDEP;

        @objid ("5861798b-646d-4bd5-9223-ef13bde0e44b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1db34000-85a1-4bb0-acc7-56db1dcd523b")
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
