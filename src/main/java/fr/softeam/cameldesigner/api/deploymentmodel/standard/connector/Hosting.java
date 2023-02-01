/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9973817c-db8c-449a-ad31-2b632af3bd92")
=======
    @objid ("8fde6612-1580-4389-a909-aac1f0a47c98")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Hosting";

    /**
     * Tells whether a {@link Hosting proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Hosting >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("48c23c60-753b-445b-816f-01dc1952ec9e")
=======
    @objid ("7194d6c6-9074-4d62-aee0-0aa12f5628f2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Hosting.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Hosting >> then instantiate a {@link Hosting} proxy.
     * 
     * @return a {@link Hosting} proxy on the created {@link Connector}.
     */
<<<<<<< HEAD
    @objid ("d0cca297-5552-4b86-9358-c56553900540")
=======
    @objid ("93a12f4b-04c7-47a0-a71d-887da7ab1d2b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6f666a30-4487-4530-a7ef-2cdc061161c7")
=======
    @objid ("33029b78-8447-4d71-89f6-ef024944cbf1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a4abde32-8d56-4f05-a797-8724d3588f20")
=======
    @objid ("1196171a-be9a-40a5-bf4d-b5fb242dd1c1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("dd31c709-dcf0-418c-8d2e-f0f524817b3f")
=======
    @objid ("38c717af-e37e-4968-8a83-c9826eda654b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRequiredHostsConfiguration(final Configuration obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Hosting.MdaTypes.MDAASSOCDEP);
            d.setName("requiredHostsConfiguration");
            d.putTagValue(Hosting.MdaTypes.MDAASSOCDEP_ROLE, "requiredHostsConfiguration");
        }
    }

<<<<<<< HEAD
    @objid ("0627ec47-7f0f-429d-9264-9c3adb8cb563")
=======
    @objid ("f52174e2-825d-4021-a2d7-a091e1ff93c3")
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
        Hosting other = (Hosting) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("70c1ce18-3a7f-4015-8009-e4db9d746920")
=======
    @objid ("5e5b57ae-188c-4b40-a374-ff114dd83918")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3b2736a6-4e70-4d51-bd57-4a709c9ca0b8")
=======
    @objid ("0ffd04c5-b743-4ea0-8068-19a54a1c66e5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9b02abb9-305a-48b7-a39c-27dbd419bf08")
=======
    @objid ("dcfbfc1a-bd50-404b-b3e1-c1e5b5901bf6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("c182b09a-274e-4e10-97f7-8fc0f3cd0417")
=======
    @objid ("9d79aa87-4cf1-4119-975e-10a46780a23e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2b51b576-fb34-4154-a223-33f244bba73e")
=======
    @objid ("f466c385-a1bc-4c6b-a442-002d704707fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("bd0f25ed-4d3f-4b1b-8042-e50415727e7e")
=======
    @objid ("11905b37-d644-4321-b8bc-f31532508391")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("5fee428a-7ab8-4793-a77d-e235708c8391")
=======
    @objid ("895c02a3-862f-4878-8278-e9ed107deaf6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Hosting(final Connector elt) {
        super(elt);
    }

    @objid ("71058a75-05c8-4604-b534-ff2d31f52287")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("34e1f08f-9930-44c1-b7b3-d28ef5f41f8e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a4a456d5-086a-4442-89a4-56b85ff7399b")
        private static Stereotype MDAASSOCDEP;

        @objid ("5512ee0c-d335-4a67-b861-6c0674290d07")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ccf11b34-3e86-45d7-95e6-138cd44c217b")
=======
        @objid ("a3dca502-28a1-4bba-9141-2259edb00963")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f3194eba-bd46-4eeb-8be0-f93355e97f5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9632ff04-55fe-42ad-b4ee-46cc4bf82aca")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d3b01e0b-bfbd-4401-a959-551722b698af")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
