/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8f6a2c76-8f23-4d7f-8a43-ddd03ed49841")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("f4223dbf-3d9a-45ae-88e0-c38a2997e097")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("ce0596ff-331a-4205-8a30-f95d5676ae18")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("8c5d42b8-a973-4fc4-a516-17bb53614142")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("8cac66f7-b360-415d-a116-87b9fd93bc77")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("a3dd9035-955a-4a4a-b8d1-bc7a2ce92593")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("1285fbf2-e6c9-48db-8618-1972d3088bb8")
=======
    @objid ("f100b35f-9630-48f3-9832-2c8d8dbb4322")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("bcb4b3c4-2cd4-4ac6-b2df-7d07b1e70d73")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("5047f634-7394-48df-9bd3-5fd6415474b7")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("fb5a3698-7c77-4d6f-9451-58a64758d50c")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("48d09679-197c-4665-b2a6-fe58f13bff84")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("671307e7-1269-48bf-bae1-63c4f50f0057")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("bde0e373-524e-42dc-b35b-43558d1af265")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link User proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << User >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("4999f8e9-c913-4b69-9406-a7b05c266fd8")
=======
    @objid ("37b8a2e0-2671-4d19-8f27-6f69c49e08a7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << User >> then instantiate a {@link User} proxy.
     * 
     * @return a {@link User} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("1d6b8b01-d75e-466b-821c-affddfef3bcd")
=======
    @objid ("9dd7361b-7f27-4788-83a8-0edffdded772")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9ada42bb-c21d-412b-b2e4-13a43cf6c0e1")
=======
    @objid ("4645bae4-e9be-425b-a8c2-c6e80e0adb59")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a84b1deb-9edb-40ac-899e-c0dc991bff14")
=======
    @objid ("bba449b4-2f65-4df3-a485-e76cfe9403ba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("09e0a623-cac6-4245-8ff5-907956f4cc98")
=======
    @objid ("1e7cfd19-65f3-489e-b3db-262a4b250818")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("276d2500-970a-4356-a489-6c194e20e2c9")
=======
    @objid ("baafb9e0-1fa4-437b-aab5-4ffdb1cd793e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2a210242-5765-4c38-927d-ebd2eeb6e833")
=======
    @objid ("145b54e2-5b94-477c-914b-e1a3158a1765")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("56108448-439f-4e0f-8bb4-bc799297ec68")
=======
    @objid ("0053a538-d731-4cfb-830e-f124aadb033b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("204034a6-76a4-42fb-80e3-d19406d05352")
=======
    @objid ("e2bfd4af-1c68-41e0-9f6c-9034819da637")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addScalabilityModels(final ScalabilityModel obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), User.MdaTypes.MDAASSOCDEP);
            d.setName("scalabilityModels");
            d.putTagValue(User.MdaTypes.MDAASSOCDEP_ROLE, "scalabilityModels");
        }
    }

<<<<<<< HEAD
    @objid ("938b6488-9174-42a0-97fd-beaddb53198c")
=======
    @objid ("841f7109-7cc9-4a80-a49c-7ef5e2f77a0a")
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
        User other = (User) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'deploymentModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("6b156d6f-a822-4f53-89ca-91a6cd3f3929")
=======
    @objid ("9d2a2910-47e1-4fef-8858-c1a302d67404")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("061df160-250f-4c45-8fe8-b09e04211245")
=======
    @objid ("a8de02b2-656f-4009-be50-6d07c5c42892")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("9a52caff-362d-4bda-a81a-d8eb4bb1fba8")
=======
    @objid ("72def3fb-5e49-41a8-afa6-885240210a9b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEmail() {
        return this.elt.getTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'externalIdentifiers' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d94410f4-2cf9-44f2-9f80-3e1fe7394063")
=======
    @objid ("49c69687-ef86-4ee3-a449-da5605771986")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a37f470b-715a-448c-9961-6781584b284f")
=======
    @objid ("3a82b76e-c8c7-4be6-aad0-458b5fb5b602")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getFirstName() {
        return this.elt.getTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c9d9980a-37c6-4f6b-944e-4e14de8f1f00")
=======
    @objid ("5ec722a8-95dd-43a9-8eab-2b04295d31dd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getLastName() {
        return this.elt.getTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("75525fe6-6461-4efb-a9f3-5d6dd32ffe12")
=======
    @objid ("cd7ae670-47fc-4b36-81ed-860afafb6ba1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bbac5344-e5b4-491f-b41d-61e0f4e670f4")
=======
    @objid ("2dcad7cc-f1f8-48e6-8450-7495809f9fdc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPlatformCredentialName() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("2912f66c-9686-43d8-8436-3ba000f50415")
=======
    @objid ("2e464b0a-244b-42c0-9dde-202e5397b8d5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPlatformCredentialPassword() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9391086b-6de2-42ee-b6b6-5e4eb8473d94")
=======
    @objid ("93d43001-09bb-4b1a-b3ea-c13565e5d61c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("5f3ec51e-3848-4e4d-b643-ba337e708458")
=======
    @objid ("cf957f3d-9ef3-4286-ba35-40fe8770384a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("588a9e3e-4235-4452-8b83-c1435eaba9b9")
=======
    @objid ("935918c0-f87b-4303-b68c-b2a9f06e53b9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2880e690-1cd0-40fb-99c6-3912663f4567")
=======
    @objid ("1cb0c769-62ff-4c68-b7c9-e615f712ab99")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getWww() {
        return this.elt.getTagValue(User.MdaTypes.WWW_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("04696f93-110a-44c6-bdb8-43a74be6724e")
=======
    @objid ("4f8f1c5b-6b32-4363-827c-e699a9dbf0ed")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7ca5e939-e2ea-4aec-87b1-452936dff433")
=======
    @objid ("fd84ddfa-b2a0-486e-8633-0fb398936dcb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4abb3848-cfea-4c72-b1fb-efb7411edd62")
=======
    @objid ("5a670a76-c77a-48e9-9184-64288facec40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeExternalIdentifiers(final ExternalIdentifier obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricModels' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("de2ba316-7ecb-4c30-9d93-7be269cb12e2")
=======
    @objid ("c38d6433-7421-4ff4-8bc4-2a9bc59ef68a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("640c6d73-0f74-4469-a887-0383232c2013")
=======
    @objid ("d3fc9788-826a-4241-89d3-6a4a65a0cd25")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1d8ef1c3-b182-43ac-a8c2-2a56d831319a")
=======
    @objid ("38882bd0-2566-495b-963d-95c5810c2751")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1616bfcc-bdb3-4376-a063-0d7924adedb6")
=======
    @objid ("1031ea11-ad4a-4f76-ac9e-ec5e1623ded3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEmail(final String value) {
        this.elt.putTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e4bb510c-dcee-4677-b5b1-36a4656539c9")
=======
    @objid ("6854dd2e-7849-4da5-855e-424e4fa0f99b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setFirstName(final String value) {
        this.elt.putTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e7ae7d0e-4fca-4dea-8dda-ee5274122168")
=======
    @objid ("159cfc9b-637a-46d9-880a-4d361e8d562c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setLastName(final String value) {
        this.elt.putTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("7b3bdb7e-0f82-4930-b988-7d7db8052fde")
=======
    @objid ("a1fb4c25-bfc3-4bed-a9e4-177d987f7117")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPlatformCredentialName(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("b4016b6a-682c-46d2-88bc-346bea18b39a")
=======
    @objid ("23483b5d-9253-4a76-bbc5-663aeea86119")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPlatformCredentialPassword(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'platformCredentials' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("a099edef-db1b-4814-9f6a-0d62f5d8c538")
=======
    @objid ("1bedbc91-26fd-4003-a76a-b0d8b1c3e57d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b276d887-6c05-4918-9d4c-ffefc20da96c")
=======
    @objid ("5139fdd3-343a-4b3d-bcba-97f4b5723df9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("1a805e8a-fcc8-4390-b3dd-a9b273529929")
=======
    @objid ("ab4e53b6-44b5-427d-a34f-9098866228b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected User(final Class elt) {
        super(elt);
    }

    @objid ("e7a907de-dc21-4d17-9104-6dae192d680b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("f605d2d4-1cf7-47fc-b40e-3a91d36ff724")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("aec5c52e-e5c7-4ce3-8cbf-937a86bef3c2")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("58366788-989f-47cf-8c46-f974b489e75e")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("03f02ea5-227a-44d8-9b54-fdbe95ee4e13")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("79edc18b-f7ba-49fc-8a35-38a8c6fa1691")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("c3e83d43-b216-46ab-879d-f7d0a254e5d6")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("2386b83a-cbdc-465d-b7df-bbdfc6b9f8cd")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("1e9efc32-3d65-4e36-bd29-4942cdc5fbc7")
        private static Stereotype MDAASSOCDEP;

        @objid ("a62533ba-36be-4ae0-8f18-5ade59645a68")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("99b64ee8-7461-4ecc-b51c-fb26db1aa49f")
=======
        @objid ("b1310465-d49e-4941-bdff-85c6957e083d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5c5d7ae4-542c-45ba-94ba-e975dcd6307d")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("5518e652-bbc0-4905-8d7f-cb72794583a4")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("6b99c22e-bc46-490a-85dc-a500b2c95369")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("2ccc4c98-74f0-4f75-9cca-3e8f0a39c33a")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("2c818b37-c0a6-4502-9ef6-62cf629406e3")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("01158f19-693c-4806-b802-2d8522651a04")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("8b400f55-a833-4f8e-8e5b-788620fb04bb")
        private static Stereotype MDAASSOCDEP;

        @objid ("e64fb32d-6c7b-468b-9518-1828b0394677")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c3e6da5e-0182-404b-8c21-d5fd0ba3f787")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
