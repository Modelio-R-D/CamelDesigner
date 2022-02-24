/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("800ab2e6-b337-4331-8f05-35688c0afdee")
    public static final String STEREOTYPE_NAME = "Container";

    /**
     * Tells whether a {@link Container proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Container >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2898c4d2-9c3f-4d17-9de1-67cdacba298d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Container >> then instantiate a {@link Container} proxy.
     * 
     * @return a {@link Container} proxy on the created {@link Component}.
     */
    @objid ("03d88c67-b85d-40a1-a44e-fc5d572a7d47")
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
    @objid ("3afd5c8d-6020-4c1a-a736-8a5a84d4f7bc")
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
    @objid ("b8b9ff56-1b36-4f2d-84a0-bc3451c5007e")
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
    @objid ("e4cda1e3-faf1-4bfd-8a38-bf8517e43925")
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Container.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunications");
            d.putTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunications");
        }
    }

    @objid ("50482b7c-1c68-4cb5-be46-d71f36c9a21a")
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
    @objid ("7ed2b123-6618-4d6e-8b3a-c0f98722a666")
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
    @objid ("4b01a602-1d9d-4c7b-a52f-173d1db7e223")
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
    @objid ("b1da9fcc-9bd3-4db6-b6e8-91ddb313a771")
    public HostingPort getRequiredHost() {
          for (Port obj : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("4f8b7238-8dbb-4db0-8e5b-dcbd712b21fd")
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
    @objid ("0ed59428-2e55-4e55-8c82-0f65d1842e36")
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
    @objid ("14ae1eb6-badc-44eb-92c5-94fc16ecb641")
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

    @objid ("5b6bd1a9-d801-4020-863f-d1ec7dae29ec")
    protected Container(final Component elt) {
        super(elt);
    }

    @objid ("25652007-93fc-4904-a84c-cba4526236e3")
    public static final class MdaTypes {
        @objid ("15893ca0-5605-43ec-9c9a-614508b36acd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64a728c0-23f3-4391-b146-89cf77f48f26")
        private static Stereotype MDAASSOCDEP;

        @objid ("a1378b6f-64dc-4d32-8556-7808529c453f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1898ce5-8b0f-4484-bd8a-aa206e4b0f4e")
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
