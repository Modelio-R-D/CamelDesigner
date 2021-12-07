/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ServerlessConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("db495a2b-edb1-4bc6-b8dc-73585d54cb3e")
public class ServerlessConfiguration extends Configuration {
    @objid ("e35fe037-6e08-455d-9c2f-a4be85d588c3")
    public static final String STEREOTYPE_NAME = "ServerlessConfiguration";

    @objid ("d97e730b-248a-492b-9301-ceb9b8ab21a5")
    public static final String BINARYCODEURL_TAGTYPE = "binaryCodeURL";

    @objid ("4ae94566-ec9b-4cdc-91e9-451c75d12ef8")
    public static final String CONTINUOUSDEPLOYMENT_TAGTYPE = "continuousDeployment";

    /**
     * Tells whether a {@link ServerlessConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ServerlessConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dfb7281a-38db-4df5-b930-8969d30b83f1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ServerlessConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ServerlessConfiguration >> then instantiate a {@link ServerlessConfiguration} proxy.
     * 
     * @return a {@link ServerlessConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("3c252495-9cd6-4191-8de7-cb90c922a65e")
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
    @objid ("f47b2f83-a87c-4e44-b35c-a57adc006a78")
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
    @objid ("e0165d75-7805-4431-9b51-7be716f562c5")
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
    @objid ("aa3bb534-bea7-424f-be0c-1c15634ea057")
    public void addEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), ServerlessConfiguration.MdaTypes.MDAASSOCDEP);
            d.setName("environmentConfigParams");
            d.putTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "environmentConfigParams");
        }
    }

    @objid ("056cf649-0e3c-4894-8239-8c4d90b88a16")
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
    @objid ("66ca9c28-9886-4481-91ff-670d873f1e7f")
    public String getBinaryCodeURL() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("2a316c8d-421b-44c5-b338-359a4b425b01")
    public BuildConfiguration getBuildConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "buildConfiguration")
                  && BuildConfiguration.canInstantiate(d.getDependsOn())) {
                     return (BuildConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BuildConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("da4dbf6c-61e7-4382-9e3e-a53e85bb3d5f")
    public String getContinuousDeployment() {
        return this.elt.getTagValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Artifact}.
     * 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("192c4fdd-c565-4078-aaa2-ad98357f2efe")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Get the values of the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     */
    @objid ("3e8258b9-250d-4467-9815-d29336b4d851")
    public List<AttributeAttribute> getEnvironmentConfigParams() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "environmentConfigParams")
              && AttributeAttribute.canInstantiate(d.getDependsOn()))
                results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'eventConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("026dc5e5-0d8c-4bfa-bf7c-de1f49536d3a")
    public EventConfiguration getEventConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "eventConfiguration")
                  && EventConfiguration.canInstantiate(d.getDependsOn())) {
                     return (EventConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), EventConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f7720aa1-6a81-45b1-b2c4-e09b871dc09f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'environmentConfigParams' role.<p>
     * Role description:
     * null
     */
    @objid ("9f004de6-198b-4735-b0d0-966dfd0df660")
    public boolean removeEnvironmentConfigParams(final AttributeAttribute obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Setter for string property 'binaryCodeURL'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e8d8ff1-1315-47f5-8759-25ca6061ece9")
    public void setBinaryCodeURL(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.BINARYCODEURL_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'buildConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("c3138565-c9e6-47df-b673-5a2e107d69c1")
    public void setBuildConfiguration(final BuildConfiguration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "buildConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServerlessConfiguration.MdaTypes.MDAASSOCDEP);
              dep.setName("buildConfiguration");      dep.putTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "buildConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'continuousDeployment'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c9f61535-cdad-4797-9e6a-08a297f7058a")
    public void setContinuousDeployment(final String value) {
        this.elt.putTagValue(ServerlessConfiguration.MdaTypes.CONTINUOUSDEPLOYMENT_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'eventConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("846c0ca2-00b5-4544-bbab-c7257b64f059")
    public void setEventConfiguration(final EventConfiguration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ServerlessConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "eventConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ServerlessConfiguration.MdaTypes.MDAASSOCDEP);
              dep.setName("eventConfiguration");      dep.putTagValue(ServerlessConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "eventConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("0018eae5-3fc9-4612-a475-2cd23bf2bd6f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("10b59f3e-1ddb-4a1e-b778-d4575618ede1")
    protected ServerlessConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("96beea79-8c81-4296-8902-a428d2abe0d8")
    public static final class MdaTypes {
        @objid ("6d4d9b93-4641-4daf-a81c-96221e9d48a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("32a54b8f-7eb9-4c4e-a476-8b284d3ca99c")
        public static TagType BINARYCODEURL_TAGTYPE_ELT;

        @objid ("adee5908-cd67-4c40-a197-39d224b46c23")
        public static TagType CONTINUOUSDEPLOYMENT_TAGTYPE_ELT;

        @objid ("7c96c563-c1fd-4958-9133-57ff7a73a650")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7d3d6ae-5edc-4c82-b01b-93f51d161652")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fff31483-9ee0-4866-8dfe-88c333611494")
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
