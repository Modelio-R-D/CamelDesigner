/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b27e6f95-9a8c-4099-b46c-bea69fef13a5")
=======
    @objid ("eae6f7a3-3ce6-4bb7-95c1-7b4ef3dacbc1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Container";

    /**
     * Tells whether a {@link Container proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Container >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("0687b89a-bc4a-42c5-9c62-9c529c45977d")
=======
    @objid ("c38e2f60-bced-4c75-9220-9f8cdc38f3b3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Container.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Container >> then instantiate a {@link Container} proxy.
     * 
     * @return a {@link Container} proxy on the created {@link Component}.
     */
<<<<<<< HEAD
    @objid ("c7ab1eaa-cba4-40da-841d-d8efa5975e07")
=======
    @objid ("5ba9629f-8e75-43b1-8d4e-ba2a677e6104")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("36a8b2a5-b00d-4662-9942-34db90366ad1")
=======
    @objid ("a115a54c-7cbb-4b63-9776-964f12487e7c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("e0ca273c-5fed-4459-aa7c-8134b9f0a9cb")
=======
    @objid ("1cc87c60-d1ca-4190-83c8-61298c14c7e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("59dc1043-d0d4-4a7e-be57-0a66010ebb55")
=======
    @objid ("125a17ce-0340-4bee-945f-b72376789a2f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addRequiredCommunications(final CommunicationPort obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Container.MdaTypes.MDAASSOCDEP);
            d.setName("requiredCommunications");
            d.putTagValue(Container.MdaTypes.MDAASSOCDEP_ROLE, "requiredCommunications");
        }
    }

<<<<<<< HEAD
    @objid ("1370c31c-f797-46f3-b4b8-19a29e699c1e")
=======
    @objid ("02b47265-a85e-491d-a603-aaa514547aed")
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
        Container other = (Container) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("7fa029e8-7a99-408f-8c7e-a0296a4db3e1")
=======
    @objid ("a9b58119-2510-40e1-9bf4-689131a10dcc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("59fcd671-5362-4b9a-8aa0-d2f8c945c2f3")
=======
    @objid ("36899168-ead7-44f4-bba1-6575aa0defbc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("9f63a0d0-df11-4b67-85cc-0f05913e627d")
=======
    @objid ("2e4e77e6-1643-45ea-949a-15fa74c5717a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public HostingPort getRequiredHost() {
          for (Port obj : ((Component) this.elt).getInternalStructure(Port.class)) {
           if (HostingPort.canInstantiate(obj))
             return (HostingPort)CamelDesignerProxyFactory.instantiate(obj, HostingPort.STEREOTYPE_NAME);
          }
          return null;
    }

<<<<<<< HEAD
    @objid ("cd410ba4-6fa0-4f47-985f-ea0780d78a05")
=======
    @objid ("9698ffe0-d784-4abd-99c3-b76cff23be2a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("37381766-01dc-4f4e-a8e3-e05013c39507")
=======
    @objid ("9e54d6ef-8cd4-41d0-bc97-fbce5f86641e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("233d6c43-ecaa-49fb-b60b-571a98bc07f9")
=======
    @objid ("d337d779-168e-4f36-a46d-c6ac84443aff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("831ff7b6-08ad-4428-9f7b-a10ed5a8e5f5")
=======
    @objid ("519f783c-a34a-4367-bcf1-edbd1efd85ac")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Container(final Component elt) {
        super(elt);
    }

    @objid ("25652007-93fc-4904-a84c-cba4526236e3")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b9cf42b0-e292-4980-938f-f082b7fc1690")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4b28506a-26a6-48e3-a25f-73c7c543a92f")
        private static Stereotype MDAASSOCDEP;

        @objid ("1ead0da6-179c-4efe-8db0-c568b1349880")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5b6e1787-1428-49a5-b1f6-4060b3c277d0")
=======
        @objid ("9aa1134c-4ee5-46c4-b1fd-d5b7bb26580a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d46fefee-8040-4833-8593-897f5021c976")
        private static Stereotype MDAASSOCDEP;

        @objid ("44f27b89-2ee8-475a-b91b-640c211415bb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0a234b90-829c-4c32-8171-df0bc03d90dc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
