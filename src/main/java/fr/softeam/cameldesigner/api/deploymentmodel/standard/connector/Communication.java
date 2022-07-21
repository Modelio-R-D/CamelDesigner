/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
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
    @objid ("e033907c-4efc-43b3-9eb2-0b7133873ddc")
    public static final String STEREOTYPE_NAME = "Communication";

    /**
     * Tells whether a {@link Communication proxy} can be instantiated from a {@link MObject} checking it is a {@link Connector} stereotyped << Communication >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fb1f0593-d684-468c-9992-808d8b8f0496")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Connector) && ((Connector) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Communication.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Connector} stereotyped << Communication >> then instantiate a {@link Communication} proxy.
     * 
     * @return a {@link Communication} proxy on the created {@link Connector}.
     */
    @objid ("ca4c0b18-f36a-4d3b-bdd5-a1b7629cd5c7")
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
    @objid ("0cf35fda-b6ed-40e4-8348-9aa1376c9907")
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
    @objid ("a7c9f314-34c0-4ef4-a6e8-a0c601732fa5")
    public static Communication safeInstantiate(final Connector obj) throws IllegalArgumentException {
        if (Communication.canInstantiate(obj))
        	return new Communication(obj);
        else
        	throw new IllegalArgumentException("Communication: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4b5c6aa9-4694-4333-a015-466e7ef092b2")
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
    @objid ("1ad37ead-2acc-4a5a-8b57-7f85414150d7")
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
    @objid ("5d2e51cc-effc-4aef-b6b8-552a37097a4a")
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
    @objid ("23b57864-26e4-4c19-b88f-35fb2c31c18d")
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
              }
        }
        return null;
    }

    @objid ("e32e960b-10b2-41d5-aa57-fb283b7bb011")
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
    @objid ("7d883557-8500-404b-b99b-9ba97d4fbf11")
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
    @objid ("1aed6290-3217-4104-bd01-15212159902b")
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

    @objid ("88716b4d-c850-47e3-85eb-751e52a64e84")
    protected Communication(final Connector elt) {
        super(elt);
    }

    @objid ("32a673a4-c270-4514-b3a4-c875b717ae42")
    public static final class MdaTypes {
        @objid ("672f7925-299c-4b77-b4be-1441bb3be498")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("48524cfa-b92a-479a-ab4c-aed83b068d67")
        private static Stereotype MDAASSOCDEP;

        @objid ("f5058ac5-491e-41a2-9ef7-529e4f781e15")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("49662d98-00c0-4055-a2c8-0663327113ad")
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
