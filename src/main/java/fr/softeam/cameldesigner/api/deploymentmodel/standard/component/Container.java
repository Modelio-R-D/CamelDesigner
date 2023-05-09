/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("2cdb182d-ca00-4ff7-8d0c-c7af9931a695")
    public static final String STEREOTYPE_NAME = "Container";

    /**
     * Tells whether a {@link Container proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Container >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f53d78e-9221-4b17-9e1d-4967fd7a823f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Container >> then instantiate a {@link Container} proxy.
     * 
     * @return a {@link Container} proxy on the created {@link Component}.
     */
    @objid ("ffbc3ca4-e70a-4032-9dbd-3a0ed02d9cd8")
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
    @objid ("46857f7a-8727-46ea-b0e0-1a85dbfc297c")
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
    @objid ("1261659a-9df6-49a7-84d9-c7d755d71d16")
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
    @objid ("28a11a67-8074-4d7f-b7fa-213b8dbf3c64")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Container.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunications");
            d.putTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunications");
        }
    }

    @objid ("370e6576-84dc-48ce-a214-b7dab16c51cb")
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
    @objid ("c8461341-5c9f-4c66-9f04-65dcd470ca02")
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
    @objid ("6a35fe9d-64e2-4ac9-9440-cc8d3fd3cd67")
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
    @objid ("52bf5a4f-46d1-4309-8567-7554ec6fbe5f")
    public HostingPort getRequiredHost() {
          for (Port obj : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("c357cf3d-1058-4d36-8de4-c63fc32dd52d")
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
    @objid ("cac2e4c1-a5c3-4d66-a7e4-cc58fd9e302a")
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
    @objid ("99a2eaf5-e20e-4618-a187-b765af9292da")
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

    @objid ("a5ca6103-e888-4285-8e8c-7eb9e028d8b4")
    protected Container(final Component elt) {
        super(elt);
    }

    @objid ("25652007-93fc-4904-a84c-cba4526236e3")
    public static final class MdaTypes {
        @objid ("30351658-f08e-4671-95fd-f9e4ebf7e101")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f5bc1abe-66f8-4e16-a55b-93bd6f5f3ddb")
        private static Stereotype MDAASSOCDEP;

        @objid ("7f75740f-379b-4b91-ada4-df5393fa802e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b00c8e93-e29a-4f2e-982a-df9ecb8db78b")
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
