/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("6fbbdb7f-68e2-4def-941a-04a19097a8a9")
    public static final String STEREOTYPE_NAME = "Container";

    /**
     * Tells whether a {@link Container proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Container >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9541edea-a783-4a16-8c19-cc4ad0f432fc")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Container >> then instantiate a {@link Container} proxy.
     * 
     * @return a {@link Container} proxy on the created {@link Component}.
     */
    @objid ("7e82d37f-5f6a-4e29-80c9-dbd2e917a549")
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
    @objid ("a8eba0a1-6328-419d-9dcf-b6f3e0d4ff81")
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
    @objid ("9420b748-4192-4e4b-896a-e7a28abfbcf0")
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
    @objid ("069522ca-06f7-46ab-9e57-b686b88113e5")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Container.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunications");
            d.putTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunications");
        }
    }

    @objid ("32c71ba1-bbf4-4e30-9aa8-df954e3ea78b")
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
    @objid ("cddc1163-0bea-4e2c-b54d-537731bd4831")
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
    @objid ("6bab4c58-667f-49c0-8a7f-a8114e32c251")
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
    @objid ("7f937026-49f6-4620-9fe4-816d647b0b62")
    public HostingPort getRequiredHost() {
          for (Port obj : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("1e9a5652-a3e5-4531-b8b7-aa2d1c75eabe")
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
    @objid ("631b981e-6008-4843-adf7-c1155c9f9881")
    public boolean removeRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Container.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE), "")) 
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
    @objid ("6999d0ca-ec65-4133-9c9f-c5f74792f51b")
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
        return result;
    }

    @objid ("7e504a63-e75d-49f1-9cba-41357fe88c21")
    protected Container(final Component elt) {
        super(elt);
    }

    @objid ("25652007-93fc-4904-a84c-cba4526236e3")
    public static final class MdaTypes {
        @objid ("51344534-7ff7-4b3d-930e-f80287f2a2b9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b73894d3-624e-45b7-8ce4-66d734f99f8b")
        private static Stereotype MDAASSOCDEP;

        @objid ("66902d1e-31ea-41d3-aabb-e35d9d508cdb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1bf3b4e1-895d-4fa2-b9b9-da1632f0e09e")
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
