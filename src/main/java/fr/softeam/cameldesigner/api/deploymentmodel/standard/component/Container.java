/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << Container >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("15fbf220-8ef8-4f00-8ef6-eabbcf7cf108")
public class Container extends CamelComponent {
    @objid ("eae6f7a3-3ce6-4bb7-95c1-7b4ef3dacbc1")
    public static final String STEREOTYPE_NAME = "Container";

    /**
     * Tells whether a {@link Container proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Container >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c38e2f60-bced-4c75-9220-9f8cdc38f3b3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Container >> then instantiate a {@link Container} proxy.
     * 
     * @return a {@link Container} proxy on the created {@link Component}.
     */
    @objid ("5ba9629f-8e75-43b1-8d4e-ba2a677e6104")
    public static Container create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME);
        return Container.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link Container} proxy from a {@link Component} stereotyped << Container >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link Container} proxy or <i>null</i>.
     */
    @objid ("a115a54c-7cbb-4b63-9776-964f12487e7c")
    public static Container instantiate(final Component obj) {
        return Container.canInstantiate(obj) ? new Container(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Container} proxy from a {@link Component} stereotyped << Container >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link Container} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("1cc87c60-d1ca-4190-83c8-61298c14c7e7")
    public static Container safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (Container.canInstantiate(obj))
        	return new Container(obj);
        else
        	throw new IllegalArgumentException("Container: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'requiredCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("125a17ce-0340-4bee-945f-b72376789a2f")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Container.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunications");
            d.putTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunications");
        }
    }

    @objid ("02b47265-a85e-491d-a603-aaa514547aed")
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
        Container other = (Container) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("a9b58119-2510-40e1-9bf4-689131a10dcc")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    /**
     * Get the values of the 'requiredCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("36899168-ead7-44f4-bba1-6575aa0defbc")
    public List<CommunicationPort> getRequiredCommunications() {
        List<CommunicationPort> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Container.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE), "requiredCommunications")){
              if (CommunicationPort.canInstantiate(d.getDependsOn()))
                results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'requiredHost' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("2e4e77e6-1643-45ea-949a-15fa74c5717a")
    public HostingPort getRequiredHost() {
          for (Port obj : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("9698ffe0-d784-4abd-99c3-b76cff23be2a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'requiredCommunications' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9e54d6ef-8cd4-41d0-bc97-fbce5f86641e")
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Container.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE), "requiredCommunications")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'requiredHost' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d337d779-168e-4f36-a46d-c6ac84443aff")
    public void setRequiredHost(final HostingPort obj) {
        // Remove existing HostingPorts
        for (Port e : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the HostingPort
        if (obj != null) {
            ((Component) this.elt).getInternalStructure().add(obj.getElement());
        }
    }

    @objid ("73ed1638-86ab-4a39-be32-23064cf5cd7c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.add(getRequiredHost());
        result.addAll(getRequiredCommunications());
        return result;
    }

    @objid ("519f783c-a34a-4367-bcf1-edbd1efd85ac")
    protected Container(final Component elt) {
        super(elt);
    }

    @objid ("25652007-93fc-4904-a84c-cba4526236e3")
    public static final class MdaTypes {
        @objid ("9aa1134c-4ee5-46c4-b1fd-d5b7bb26580a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d46fefee-8040-4833-8593-897f5021c976")
        private static Stereotype MDAASSOCDEP;

        @objid ("44f27b89-2ee8-475a-b91b-640c211415bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a234b90-829c-4c32-8171-df0bc03d90dc")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ad6f0ae5-0d16-43f4-b514-9a46eea51950");
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
