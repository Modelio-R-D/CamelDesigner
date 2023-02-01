/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("033657a4-b00e-4168-8171-457693aeb448")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("0f675f82-3cff-443b-9dbc-729e89df236d")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("b92ee066-dac8-45a0-bcac-1982667b029b")
=======
    @objid ("96db1410-b691-4128-ad3b-56cd8e105ca0")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("f51ca7c1-1cd2-433e-acf3-c9206aa52061")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("316daeb9-2dc5-4ad2-a977-679c45e391c4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("d6a18d86-5ba2-467d-a475-0545f00122d8")
=======
    @objid ("650386ce-8f0b-4722-a99e-c6ad4d31b906")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
<<<<<<< HEAD
    @objid ("61dae0fc-eda1-4702-ab08-e9a82dca8bb0")
=======
    @objid ("4a57d711-4283-4ca7-91fd-4ea77cda30c0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ee3deaed-50c2-445b-bb0f-48be6ea94662")
=======
    @objid ("dd724ffa-31c0-4bcc-ade6-e4897688eec5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("abef1a49-1355-4407-ba5b-e2f7d3122a0d")
=======
    @objid ("d8f7f30d-0ca3-4299-bc22-c35bec33b709")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2e5695d8-999d-4c53-a744-5b540acb3d45")
=======
    @objid ("34fc7465-d63e-4f38-a6bf-2a382bca5cd4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj!=null)
          ((Artifact) this.elt).getOwnedAttribute().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("707e39be-b2ea-4964-9b79-4da55fb6520d")
=======
    @objid ("2e8b36fa-25c7-4e4a-b91d-f4fc40ae343b")
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
        ServerlessConfiguration other = (ServerlessConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c02070df-cc38-4367-aa84-8792d1776585")
=======
    @objid ("6ec0805d-f2aa-4fa0-a2bf-a4c618207a4a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value to the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("167a51fe-b2f0-426c-b519-96a441063dd4")
=======
    @objid ("8ff5cced-ee39-41d2-ac13-bc185cb54ab5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8cb7ca8f-375d-47b5-a3a7-f724798a0dd0")
=======
    @objid ("b19492c8-4dea-497f-97ea-6d51febb1e82")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e0ca8bb1-675d-45bc-9a03-22288fea6d28")
=======
    @objid ("9c62eebe-19bf-47b2-8183-2c6af8e7aecd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b309b1d6-e7f4-49d5-96fd-8a16c6d7bf85")
=======
    @objid ("4a2f1ddf-19de-4f89-a83b-9b278030f9dc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public EventConfiguration getEventConfiguration() {
          for (Artifact obj : ((Artifact) this.elt).getOwnedElement(Artifact.class)) {
           if (EventConfiguration.canInstantiate(obj))
             return (EventConfiguration)CamelDesignerProxyFactory.instantiate(obj, EventConfiguration.STEREOTYPE_NAME);
          }
          return null;
    }

<<<<<<< HEAD
    @objid ("0d70bbc1-c404-436a-b2bb-a83a18a2248a")
=======
    @objid ("44bbcaa8-6cd3-4be4-b826-80a977d67df0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("08efb600-065a-4fe1-bd99-feb8db3bacfd")
=======
    @objid ("ba373965-1b2e-436b-8e93-4018dd0ba5ab")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isContinuousDeployment() {
        return this.elt.isTagged(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d79b96d0-b78c-4adf-9994-6ba28a0797d7")
=======
    @objid ("51ed594a-c76c-4159-adff-3fae05524e5c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        return (obj!=null)? ((Artifact) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("71ec1d6d-8b4b-408a-9481-3423fba7f048")
=======
    @objid ("1c00f0a8-fb6c-4855-9a17-e51ae98664df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("80a52f25-5c25-4911-9c17-7cab4812f557")
=======
    @objid ("08c92b05-05a1-4ac2-a518-b111360521d0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6da243b8-a7b8-407a-b645-e4dbf8cc2de6")
=======
    @objid ("3e228144-3fc0-480e-8854-034bdeb58e15")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1eab681a-dc53-4b25-97db-27ee3c087650")
=======
    @objid ("3beeee8b-57c3-40fb-9064-7f06c7baed67")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("0757375c-71a9-4290-9e34-f952425a15be")
=======
    @objid ("c9581474-4465-489a-a7fc-d0840c316293")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("79cfaf39-25f0-470b-ac02-652f097ee595")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e609fa8e-f464-4666-bd99-9a93608d048d")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("69d45e7d-1601-4bdb-8e65-70499d3aaacf")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("045c3493-40d9-4d15-98a4-afa021b6d236")
        private static Stereotype MDAASSOCDEP;

        @objid ("423ee200-7b93-406d-b4bc-441480ca8734")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b135d5a3-70af-431e-9450-8ad12de9a9b7")
=======
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
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
