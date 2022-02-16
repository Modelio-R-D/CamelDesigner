/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ServerlessConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("db495a2b-edb1-4bc6-b8dc-73585d54cb3e")
public class ServerlessConfiguration extends Configuration {
    @objid ("468209f4-35db-48a9-a181-5e912d3f65de")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("698252b3-7515-4445-947a-6a17ab6d2c64")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("7f4ce8f2-742f-45af-83c6-59bd6e53612d")
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0cc5a95a-e3e5-441c-96c4-a6fb388d37ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("0c57b65a-ac0d-402a-a01a-4ad2443904e5")
    public static ServerlessConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME);
        return ServerlessConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ServerlessConfiguration} proxy from a {@link Artifact} stereotyped << ServerlessConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link ServerlessConfiguration} proxy or <i>null</i>.
     */
    @objid ("0b36f463-1648-4351-a775-d98a354f0368")
    public static ServerlessConfiguration instantiate(final Artifact obj) {
        return ServerlessConfiguration.canInstantiate(obj) ? new ServerlessConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServerlessConfiguration} proxy from a {@link Artifact} stereotyped << ServerlessConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link ServerlessConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8be33d38-e212-4853-8799-70ab412b31d7")
    public static ServerlessConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ServerlessConfiguration.canInstantiate(obj))
        	return new ServerlessConfiguration(obj);
        else
        	throw new IllegalArgumentException("ServerlessConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2b65683e-1f6a-4c5b-9f1f-7c0d26377b7b")
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("c30e26b6-4e5c-4be9-a306-4472fe678f76")
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
        ServerlessConfiguration other = (ServerlessConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("73191632-1416-466f-8b5c-19f6d9eebf66")
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f99e0fdf-0fb2-43ad-b92f-255768d176d5")
    public BuildConfiguration getBuildConfiguration() {
          for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (BuildConfiguration.canInstantiate(obj))
             return (BuildConfiguration)CamelDesignerProxyFactory.instantiate(obj, BuildConfiguration.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Getter for string property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a0fc3996-85ae-4b73-9d82-729b2e718730")
    public String getContinuousDeployment() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("c294fcdb-68b5-41fa-bf6a-87d8af0c3dc5")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Get the values of the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("165cb9f4-5d9f-49bf-a295-c42f99243321")
    public List<AttributeAttribute> getEnvironmentConfigParams() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Attribute mObj : ((Artifact) this.elt).getOwnedAttribute()){
        	if (AttributeAttribute.canInstantiate(mObj))
        			results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, AttributeAttribute.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'eventConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5c85649e-ebfc-4694-95e8-5045d17997bc")
    public EventConfiguration getEventConfiguration() {
          for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (EventConfiguration.canInstantiate(obj))
             return (EventConfiguration)CamelDesignerProxyFactory.instantiate(obj, EventConfiguration.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("104953b7-23b4-4acf-8653-4ad0753e293c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("df13269c-2950-4388-849e-77f0f710349f")
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7d9be2b3-edf4-4c55-8d1f-b3f706b832de")
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c3165e93-6b62-4bc9-b507-0e1f8d021ba0")
    public void setBuildConfiguration(final BuildConfiguration obj) {
        // Remove existing BuildConfigurations
        for (Artifact e : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (BuildConfiguration.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the BuildConfiguration
        if (obj != null) {
            ((Artifact) this.elt).getOwnedElement().add(obj.getElement());
        }
    }

    /**
     * Setter for string property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("dde69804-8e70-49af-9ec8-9917544fe9fe")
    public void setContinuousDeployment(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'eventConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("13b3ca53-7c0b-4f1e-9e13-e1526c3d684e")
    public void setEventConfiguration(final EventConfiguration obj) {
        // Remove existing EventConfigurations
        for (Artifact e : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (EventConfiguration.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the EventConfiguration
        if (obj != null) {
            ((Artifact) this.elt).getOwnedElement().add(obj.getElement());
        }
    }

    @objid ("f25fc44b-526b-4b7e-ae9d-625552e64c4d")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("ea44bf05-c2f1-4585-86d3-578ce728c684")
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
        @objid ("d05c350d-5f68-4f4c-802e-72f511b3796c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f9edf89-a0e1-4f7f-96e4-926191ced7f1")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("549927ad-28ce-4283-9f3e-ab39113ade36")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("1d5e63c6-cc60-42fe-b9b3-ad4dee10f863")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ac7f1d2-29ae-43ea-8a2c-a24bb49d2da4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6b0c0504-a722-44fe-8d42-68def20e10f1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9f4ca31f-e397-4c28-b2d2-031f838cfe99");
            BINARYCODEURL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a9a8e449-cba1-4eb1-86c5-d6776d809a5f");
            CONTINUOUSDEPLOYMENT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b19002d3-1aa5-4739-b9db-e55a4a2126db");
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
