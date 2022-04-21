/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("47455acb-c2cc-48b9-ad2f-5b5ca9848c37")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("e3f6f640-22d8-4b46-9101-da78bc23b7e7")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("f8f54ff6-a017-46d7-953a-75cefa1851d3")
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aded42ba-36aa-4476-b9a9-111399eb3374")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("5984be25-b00e-40f7-b2bd-c44c115dc7f6")
    public static ServerlessConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME);
        return ServerlessConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ServerlessConfiguration} proxy from a {@link Artifact} stereotyped << ServerlessConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Artifact
     * @return a {@link ServerlessConfiguration} proxy or <i>null</i>.
     */
    @objid ("0eb4cd34-6eec-49ef-b1b6-121d97d7f8e6")
    public static ServerlessConfiguration instantiate(final Artifact obj) {
        return ServerlessConfiguration.canInstantiate(obj) ? new ServerlessConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ServerlessConfiguration} proxy from a {@link Artifact} stereotyped << ServerlessConfiguration >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Artifact}
     * @return a {@link ServerlessConfiguration} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("8d4a26e6-5292-412f-9f47-0c7425ed0804")
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
     */
    @objid ("9895aca8-67a4-4c39-b87b-90cae2c34d32")
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    @objid ("bc58cf56-7702-4574-be1c-60f48e975f03")
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
    @objid ("24cd373a-3873-4907-b68f-e651203e359d")
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'buildConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("553547e8-4313-4af2-a2bd-1f2c1075103a")
    public BuildConfiguration getBuildConfiguration() {
        for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
         if (BuildConfiguration.canInstantiate(obj))
           return (BuildConfiguration)CamelDesignerProxyFactory.instantiate(obj, BuildConfiguration.STEREOTYPE_NAME);
        }
        return null;
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("65a7f350-a96a-48c8-8206-0fab15dbe032")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Get the values of the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     */
    @objid ("13785b2b-d84c-4af7-92f9-6f304874d096")
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
     */
    @objid ("54f9a30f-2c65-48b0-8627-f72ef1bc96ff")
    public EventConfiguration getEventConfiguration() {
        for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
         if (EventConfiguration.canInstantiate(obj))
           return (EventConfiguration)CamelDesignerProxyFactory.instantiate(obj, EventConfiguration.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("41decfe9-46c2-4b1a-9a3a-d648557179d6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("36f0d3b9-3554-419e-943b-550c2a34d4c2")
    public boolean isContinuousDeployment() {
        return this.elt.isTagged(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     */
    @objid ("1183da09-dead-4463-beb9-b9b7f9134fb9")
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e7b03f63-cd70-4097-abf5-2d82c1bc4813")
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("54f4a85e-f4fd-4c70-a019-6d64b417ec92")
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
    @objid ("1eef6ce0-ca0c-4988-836e-df36587be982")
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
     */
    @objid ("e72149dc-b6c3-4471-ace5-224f31c3cd39")
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

    @objid ("7e6a4739-027b-4aec-bb37-1296124d7745")
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
        @objid ("67ef8b61-1258-49a3-a2b2-3e6aa875d69b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("57861758-97d7-4fe8-bb04-ff426022c825")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("2bf33ed1-412a-4abb-b992-7ee6d4fd6048")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("f39ae6a2-9543-44a3-a550-7ad2bc2aa7f3")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ba8f86b-fdb8-405a-b1b2-7ed5fbe7dbd5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("116ba4c4-d0c4-43e8-b228-fe3b91e9bcba")
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
