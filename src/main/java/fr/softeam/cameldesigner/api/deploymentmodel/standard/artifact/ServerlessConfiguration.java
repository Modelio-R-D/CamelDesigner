/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
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
    @objid ("96db1410-b691-4128-ad3b-56cd8e105ca0")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("f51ca7c1-1cd2-433e-acf3-c9206aa52061")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("316daeb9-2dc5-4ad2-a977-679c45e391c4")
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("650386ce-8f0b-4722-a99e-c6ad4d31b906")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("4a57d711-4283-4ca7-91fd-4ea77cda30c0")
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
    @objid ("dd724ffa-31c0-4bcc-ade6-e4897688eec5")
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
    @objid ("d8f7f30d-0ca3-4299-bc22-c35bec33b709")
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
    @objid ("34fc7465-d63e-4f38-a6bf-2a382bca5cd4")
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("2e8b36fa-25c7-4e4a-b91d-f4fc40ae343b")
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
    @objid ("6ec0805d-f2aa-4fa0-a2bf-a4c618207a4a")
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8ff5cced-ee39-41d2-ac13-bc185cb54ab5")
    public BuildConfiguration getBuildConfiguration() {
          for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (BuildConfiguration.canInstantiate(obj))
             return (BuildConfiguration)CamelDesignerProxyFactory.instantiate(obj, BuildConfiguration.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("b19492c8-4dea-497f-97ea-6d51febb1e82")
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
    @objid ("9c62eebe-19bf-47b2-8183-2c6af8e7aecd")
    public List<AttributeAttribute> getEnvironmentConfigParams() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Attribute mObj : ((Artifact) this.elt).getOwnedAttribute()){
        	if (MeasurableAttributeAttribute.canInstantiate(mObj))
        			results.add((MeasurableAttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, MeasurableAttributeAttribute.STEREOTYPE_NAME));
        	if (QualityAttributeAttribute.canInstantiate(mObj))
        			results.add((QualityAttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, QualityAttributeAttribute.STEREOTYPE_NAME));
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
    @objid ("4a2f1ddf-19de-4f89-a83b-9b278030f9dc")
    public EventConfiguration getEventConfiguration() {
          for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (EventConfiguration.canInstantiate(obj))
             return (EventConfiguration)CamelDesignerProxyFactory.instantiate(obj, EventConfiguration.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("44bbcaa8-6cd3-4be4-b826-80a977d67df0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ba373965-1b2e-436b-8e93-4018dd0ba5ab")
    public boolean isContinuousDeployment() {
        return this.elt.isTagged(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("51ed594a-c76c-4159-adff-3fae05524e5c")
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1c00f0a8-fb6c-4855-9a17-e51ae98664df")
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("08c92b05-05a1-4ac2-a518-b111360521d0")
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
     * Setter for boolean property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3e228144-3fc0-480e-8854-034bdeb58e15")
    public void setContinuousDeployment(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'eventConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3beeee8b-57c3-40fb-9064-7f06c7baed67")
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

    @objid ("c9581474-4465-489a-a7fc-d0840c316293")
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
        @objid ("4feb8e0d-7e1f-4e35-b199-80956e434ebc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f36fa9c2-6b61-4a5f-b297-49b1a67f4c3c")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("4bc4ba39-aba6-4252-afb9-5d6e30680670")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("44565f4c-b0a2-4071-9c6f-ef63968ed209")
        private static Stereotype MDAASSOCDEP;

        @objid ("422180ea-60ea-45eb-972e-b602e9547e03")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5580e43a-e38e-4489-8d6f-968891a0becd")
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
