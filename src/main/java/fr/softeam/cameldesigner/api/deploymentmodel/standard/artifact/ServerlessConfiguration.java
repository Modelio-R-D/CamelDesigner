/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("78949eca-1241-4ed0-96cc-e68a92ffe48d")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("d05bd24f-1083-4fcb-8111-e024d4a1bcb2")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("be891f7a-8b48-4124-a31e-af13b7e4bc24")
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e7f8accd-d685-4e3e-b09d-ba890bace844")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("9dc329bd-43a6-429e-83d2-a23d18247f25")
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
    @objid ("28cad689-0ad4-4257-bf70-68a0d67ae9bf")
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
    @objid ("f6bde039-1b82-4dfd-8b2f-2e4cfb584835")
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
    @objid ("ae7b5293-afdf-4101-a2a0-579d3ea4d779")
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("58ec06a0-7e26-4832-aa0a-a79533134ef2")
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
    @objid ("3de302a4-49f3-4d38-9af7-7a9b6c19724c")
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("797eebca-1ed9-4bc6-8b1f-1d5651f96f69")
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
    @objid ("8a1bc397-a13d-488e-bf6c-fe1487b93d57")
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
    @objid ("e2384076-d13d-4455-96b8-bfe03755a6c5")
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
    @objid ("3ce4ab34-1edc-4072-a3e9-1cd04ce91942")
    public EventConfiguration getEventConfiguration() {
          for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (EventConfiguration.canInstantiate(obj))
             return (EventConfiguration)CamelDesignerProxyFactory.instantiate(obj, EventConfiguration.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("c89be51c-b37f-4c38-a1f2-2f098fa37e5b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b4c33fb4-317c-46b0-b9cd-7a88c9d843e5")
    public boolean isContinuousDeployment() {
        return this.elt.isTagged(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("936df763-26db-4c2e-9527-7b2d66e4fd35")
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("206ee4cf-813e-4d27-a504-40f58f825d08")
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a637cb7d-d1b1-4030-93e5-403d21dd863f")
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
    @objid ("6c31cf63-42d1-4671-8846-7abfa3e49c9f")
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
    @objid ("c5e0cad0-248c-40bb-8cd4-9f860b39a655")
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

    @objid ("6941206c-8520-44b1-a95a-c3fd9446e880")
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
        @objid ("5aa00b7d-2bfd-49d5-a80a-7e270279bd7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6a235c02-c10c-4a16-9d8c-9ba4ed3b0b14")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("5cd3ff8d-38ad-4abd-a7d4-3e970b7783c3")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("193c8688-1000-4f4a-97a3-47224caa00be")
        private static Stereotype MDAASSOCDEP;

        @objid ("37e1dce4-554d-4820-bb64-1681faa54273")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49b97a65-b8bb-4622-81e4-f1889ccb67ce")
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
