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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.CommunicationRequirement;
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
 * Proxy class to handle a {@link Connector} with << Communication >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f5a1e8b4-c495-4efa-a525-7238dae641c0")
public class Communication extends ComponentRelation {
<<<<<<< HEAD
    @objid ("2d3054f0-5bca-46fb-b1a4-4aa314756261")
=======
    @objid ("963ae982-5624-4079-863b-796c1cfe572f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Communication";

    /**
     * Tells whether a {@link Communication proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Communication >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("bc013879-2b27-4338-a1d3-b150d341722c")
=======
    @objid ("2da09d2b-dc44-45d6-ab6d-47f4df167ebb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Communication >> then instantiate a {@link Communication} proxy.
     * 
     * @return a {@link Communication} proxy on the created {@link Connector}.
     */
<<<<<<< HEAD
    @objid ("5c1d902a-078a-4334-89f7-66098ca95ed6")
=======
    @objid ("ced6d1ee-0a23-47c4-9de4-c2d284ad6e39")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Communication create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Connector");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME);
        return Communication.instantiate((Connector)e);
    }

    /**
     * Tries to instantiate a {@link Communication} proxy from a {@link Connector} stereotyped << Communication >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Connector
     * @return a {@link Communication} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("b2470e9b-68c8-42db-bc57-32350ced438d")
=======
    @objid ("2479f700-fbff-45e4-bf14-2bfe73018480")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Communication instantiate(final Connector obj) {
        return Communication.canInstantiate(obj) ? new Communication(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Communication} proxy from a {@link Connector} stereotyped << Communication >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Connector}
     * @return a {@link Communication} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("5b62059e-6892-453a-aeaf-124d43ff67b9")
=======
    @objid ("e42a9f8b-3b06-4478-8334-5c0b66acd8bc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Communication safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Communication.canInstantiate(obj))
        	return new Communication(obj);
        else
        	throw new IllegalArgumentException("Communication: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("642f60bb-44fd-43c9-a492-63c5342c1579")
=======
    @objid ("5f50d769-103f-43c1-9999-437107088438")
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
        Communication other = (Communication) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Connector}. 
     * @return the Connector represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("c5612acc-7106-4a50-9470-6f0b2137fa3c")
=======
    @objid ("3f3e758a-b043-411c-a188-187aaa31ab10")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Connector getElement() {
        return (Connector)super.getElement();
    }

    /**
     * Get the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ba5a2836-19bb-4fa1-92b0-cf8ecdb7b97c")
=======
    @objid ("62f31e60-7434-42ff-8a66-711ce0f1c92e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Configuration getProvidedPortConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "providedPortConfiguration")){
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
     * Get the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("509d7f1a-b2f2-4449-8ff0-b4eddb524cfe")
=======
    @objid ("3d1b4be3-56d0-4a9c-88cb-60369d8ce414")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public Configuration getRequiredPortConfiguration() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "requiredPortConfiguration")){
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

<<<<<<< HEAD
    /**
     * Get the value of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8f787932-1529-4de7-8d84-3b9120443993")
    public CommunicationRequirement getRequirement() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "requirement")){
                  if (CommunicationRequirement.canInstantiate(d.getDependsOn()))
                     return (CommunicationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("c87e89ce-796a-441a-a76d-b5d9b10482a8")
=======
    @objid ("01531c5d-9779-4d88-aded-d10a91d0edf4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7ba50577-d10f-4ff9-a63d-f38c636a62a9")
=======
    @objid ("196e13f2-4aea-489e-8d9b-f3ae2ec09106")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setProvidedPortConfiguration(final Configuration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "providedPortConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Communication.MdaTypes.MDAASSOCDEP);
              dep.setName("providedPortConfiguration");      dep.putTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE, "providedPortConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f32b3946-4c76-47ca-888d-27bd2a6f3adc")
=======
    @objid ("e7e0b7c2-57d4-4cfd-a5a4-0ec5f75e5659")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setRequiredPortConfiguration(final Configuration obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "requiredPortConfiguration")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Communication.MdaTypes.MDAASSOCDEP);
              dep.setName("requiredPortConfiguration");      dep.putTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE, "requiredPortConfiguration");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'requirement' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("12e0f97a-e6ff-49c3-aba7-2901b5639468")
    public void setRequirement(final CommunicationRequirement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Communication.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE), "requirement")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Communication.MdaTypes.MDAASSOCDEP);
              dep.setName("requirement");      dep.putTagValue(Communication.MdaTypes.MDAASSOCDEP_ROLE, "requirement");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("852ff246-9250-4bd5-8d5f-3fdcfaa4c53e")
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
    @objid ("7cdb8fcd-26be-42a1-a36a-dd237bea3385")
    public CommunicationPort getProvidedCommunication() {
        for (LinkEnd end : getElement().getLinkEnd()) {
            Instance portSource = end.getSource();
            if ((portSource instanceof Port)
                && (portSource.isStereotyped(CommunicationPort.MdaTypes.STEREOTYPE_ELT)
                        &&  (((Port)portSource)).getDirection().equals(PortOrientation.OUT))){
                    return (CommunicationPort) CamelDesignerProxyFactory.instantiate(portSource, CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    /**
     * Get the value of the 'requiredPortConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("c94ae147-9be9-4d6b-8eab-51fb9afda599")
    public CommunicationPort getRequiredCommunication() {
        for (LinkEnd end : getElement().getLinkEnd()) {
            Instance portSource = end.getTarget();
            if ((portSource instanceof Port)
                && (portSource.isStereotyped(CommunicationPort.MdaTypes.STEREOTYPE_ELT)
                        &&  (((Port)portSource)).getDirection().equals(PortOrientation.IN))){
                    return (CommunicationPort) CamelDesignerProxyFactory.instantiate(portSource, CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName());
            }
        }
        return null;
    }

    /**
     * Set the value of the 'providedPortConfiguration' role.<p>
     * Role description:
     * null
     */
    @objid ("230154a6-6b6c-4495-b354-b1f65ed6687e")
    public void setProvidedCommunication(final CommunicationPort obj) {
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
    @objid ("12a3ce2d-e7e8-4a6b-b3cf-9b8c37b75697")
    public void setRequiredCommunication(final CommunicationPort obj) {
        for (LinkEnd end : getElement().getLinkEnd()) {
            if (end.getTarget() != null) {
                end.setTarget(obj.getElement());
            }
        }
    }

<<<<<<< HEAD
    @objid ("cd12dd52-1860-4e5e-b29f-944dcad0b60a")
=======
    @objid ("ea41fdeb-9127-4e23-aa4c-7afce8bb4407")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Communication(final Connector elt) {
        super(elt);
    }

    @objid ("32a673a4-c270-4514-b3a4-c875b717ae42")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b4ba3435-634a-4df1-a3d0-bc2420af6489")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6c64a5f2-9362-4215-82ea-b4b13a2f4d79")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ab3dfd3-c2fd-4087-b98a-89e256589e50")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd7eda0c-2cff-4c43-9c0e-f562d039d2a4")
=======
        @objid ("75526560-248e-4983-906d-49978e356d6b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a43e7634-1fa1-4493-8982-35f5771812a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef9ef321-da8a-46a3-b8e2-0c3e9781db05")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2af02515-303d-4913-9b0a-39e9d5a6882d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "141875d2-e648-4750-9fff-84c1b21e9b54");
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
