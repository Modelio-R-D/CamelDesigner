/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.connector;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.Configuration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Connector} with << Hosting >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("48ee1919-d6f2-4da9-bbe0-d4d5b45b6d43")
public class Hosting extends ComponentRelation {
    @objid ("e95a07d3-486d-425c-8ccf-e5cbcec65294")
    public static final String STEREOTYPE_NAME = "Hosting";

    /**
     * Tells whether a {@link Hosting proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Hosting >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("217ee474-0976-4f1a-a727-2c13855470f7")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Hosting >> then instantiate a {@link Hosting} proxy.
     * 
     * @return a {@link Hosting} proxy on the created {@link Connector}.
     */
    @objid ("4bf1aad7-5942-491a-a5fe-d64a21a46d8e")
    public static Hosting create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME);
        return Hosting.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link Hosting} proxy from a {@link Connector} stereotyped << Hosting >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link Hosting} proxy or <i>null</i>.
     */
    @objid ("b5895e30-5ea9-4eeb-b9d5-d801a8d3d166")
    public static Hosting instantiate(final Connector obj) {
        return Hosting.canInstantiate(obj) ? new Hosting(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Hosting} proxy from a {@link Connector} stereotyped << Hosting >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link Hosting} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("626731f1-7f43-4cd3-a362-e0fd0bbc4aa5")
    public static Hosting safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Hosting.canInstantiate(obj))
        	return new Hosting(obj);
        else
        	throw new IllegalArgumentException("Hosting: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requiredHostsConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("10285cd7-00fd-4088-bd25-12c2292ced29")
    public void addRequiredHostsConfiguration(final Configuration obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Hosting.MdaTypes.MDAASSOCDEP);
            d.setName("requiredHostsConfiguration");
            d.putTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE, "requiredHostsConfiguration");
        }
    }

    @objid ("6c5ab567-bae6-4da7-abed-27f723bf320d")
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
        Hosting other = (Hosting) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
    @objid ("56ceeb49-1f32-4713-9ebf-62ba3226dbe5")
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'providedHostConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("74ca0822-f55e-41b3-a351-e29d322c043a")
    public Configuration getProvidedHostConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "providedHostConfiguration")){
                  if (ClusterConfiguration.canInstantiate(d.getDependsOn()))
                     return (ClusterConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ClusterConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSConfiguration.canInstantiate(d.getDependsOn()))
                     return (PaaSConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ScriptConfiguration.canInstantiate(d.getDependsOn()))
                     return (ScriptConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScriptConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServerlessConfiguration.canInstantiate(d.getDependsOn()))
                     return (ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServerlessConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ImageConfiguration.canInstantiate(d.getDependsOn()))
                     return (ImageConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ContainerConfiguration.canInstantiate(d.getDependsOn()))
                     return (ContainerConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'requiredHostsConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("391093c4-9c18-4b64-b6b1-667b07165066")
    public List<Configuration> getRequiredHostsConfiguration() {
        List<Configuration> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostsConfiguration")){
              if (ClusterConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ClusterConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ClusterConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (PaaSConfiguration.canInstantiate(d.getDependsOn()))
                results.add((PaaSConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ScriptConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ScriptConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScriptConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ServerlessConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServerlessConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ImageConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ImageConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ContainerConfiguration.canInstantiate(d.getDependsOn()))
                results.add((ContainerConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerConfiguration.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2200af67-6788-40c5-8c7a-df260689c78b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requiredHostsConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b53be601-f934-4890-9778-8039405b2288")
    public boolean removeRequiredHostsConfiguration(final Configuration obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "requiredHostsConfiguration")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'providedHostConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("156ce61e-602a-414c-a80f-cef45066dae1")
    public void setProvidedHostConfiguration(final Configuration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Hosting.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE), "providedHostConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Hosting.MdaTypes.MDAASSOCDEP);
              dep.setName("providedHostConfiguration");      dep.putTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE, "providedHostConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("fbdcd9f9-3090-49bf-8eaa-c6093e196a95")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    /**
     * Get the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("90564198-4a93-42f4-b3cb-b7c24143ba8c")
    public HostingPort getProvidedHost() {
        for (LinkEnd end : getElement().getLinkEnd()) {
            Instance portSource = end.getSource();
            if ((portSource instanceof Port)
                && (portSource.isStereotyped(HostingPort.MdaTypes.STEREOTYPE_ELT)
                        &&  (((Port) portSource)).getDirection().equals(PortOrientation.OUT))){
                    return (HostingPort) CamelDesignerProxyFactory.instantiate(portSource, HostingPort.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    /**
     * Get the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("bb8b26d5-21c7-4be7-a6e2-ac0031ab3f71")
    public HostingPort getRequiredHosts() {
        for (LinkEnd end : getElement().getLinkEnd()) {
            Instance portSource = end.getTarget();
            if ((portSource instanceof Port)
                && (portSource.isStereotyped(HostingPort.MdaTypes.STEREOTYPE_ELT)
                        &&  (((Port) portSource)).getDirection().equals(PortOrientation.IN))){
                    return (HostingPort) CamelDesignerProxyFactory.instantiate(portSource, HostingPort.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    /**
     * Set the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("98c92b2e-c2ee-4714-bbb0-a5e8e74bb07b")
    public void setProvidedHost(final HostingPort obj) {
        for (LinkEnd end : getElement().getLinkEnd()) {
            if (end.getSource() != null) {
                end.setSource(obj.getElement());
            }
        }
    }

    /**
     * Set the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("c002f452-d90d-437f-96d5-d33061188dc1")
    public void setRequiredHosts(final HostingPort obj) {
        for (LinkEnd end : getElement().getLinkEnd()) {
            if (end.getTarget() != null) {
                end.setTarget(obj.getElement());
            }
        }
    }

    @objid ("70d9d9d3-972f-40b7-8ce9-765a6774b6ea")
    protected Hosting(final Connector elt) {
        super(elt);
    }

    @objid ("71058a75-05c8-4604-b534-ff2d31f52287")
    public static final class MdaTypes {
        @objid ("219d8143-b5b6-4c12-bbf1-b4ee3db5ad8d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9afab322-9a7b-4b14-b2ec-34303a51f73b")
        private static Stereotype MDAASSOCDEP;

        @objid ("7caa1386-44de-40fd-ad80-8e38de1122ad")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("06a9a61f-e397-4320-ba72-81c3145ec0f9")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d727bc20-8640-446b-8252-f7e3783e8efe");
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
