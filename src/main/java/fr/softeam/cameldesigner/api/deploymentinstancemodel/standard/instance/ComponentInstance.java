/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << ComponentInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5558f77d-42a8-4e10-8393-56d67ba21511")
public abstract class ComponentInstance extends FeatureInstance {
<<<<<<< HEAD
    @objid ("1867e331-e5be-4eca-a5b1-c9a75fe37c0b")
    public static final String STEREOTYPE_NAME = "ComponentInstance";

    @objid ("1d8282bd-eaa0-4d63-a047-750665f734de")
    public static final String DESTROYEDON_TAGTYPE = "destroyedOn";

    @objid ("663bda5f-10f0-4234-af38-48c2c0cbcf04")
=======
    @objid ("7d0673e6-8f12-46a3-b8d2-5e64e2c67897")
    public static final String STEREOTYPE_NAME = "ComponentInstance";

    @objid ("d5730a2d-236e-4a48-9429-36d55aa36282")
    public static final String DESTROYEDON_TAGTYPE = "destroyedOn";

    @objid ("f9baf307-85fc-42f2-8358-26369ace7dc7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String INSTANTIATEDON_TAGTYPE = "instantiatedOn";

    /**
     * Tells whether a {@link ComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("dedff13c-06ed-48b2-a0bf-caed8f31df12")
=======
    @objid ("4c489efd-ddd3-43c9-ac26-629c69c62cb4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("d17c2a88-bdc1-4f95-981b-7ffa1e1c6fed")
=======
    @objid ("02ab8ced-90e0-4596-afa2-40baba93179f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addProvidedCommunicationInstances(final CommunicationPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    /**
     * Add a value to the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("9b3dfc9f-0025-4516-ae79-996b8c6f1143")
=======
    @objid ("75e82d96-335b-46f9-bf1e-525564ffb38d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addProvidedHostInstances(final HostingPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("e12ec5ec-d59a-4336-a5c8-f7b840e4189b")
=======
    @objid ("8e4a9b5e-5a06-4dc2-8b6f-fa1773513279")
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
        ComponentInstance other = (ComponentInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("d3c4a4ed-1615-4c3b-8f9d-d39764f8628e")
=======
    @objid ("0e210312-8d3a-401b-a44f-231ea4ea6896")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getDestroyedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("f810d62a-32b8-4713-b934-359292f1450d")
=======
    @objid ("a321a57b-0f57-4b35-931c-84f5320fc85e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("216f6705-465b-4337-afe7-98b348662fb6")
=======
    @objid ("af6db518-8e98-40eb-8554-e08d9f66eb6a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getInstantiatedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("348bd54b-8f1e-4982-ac91-1a9b206e2025")
=======
    @objid ("54df217a-e158-48f4-b177-c3324040317c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CommunicationPort> getProvidedCommunicationInstances() {
        List<CommunicationPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Instance) this.elt).getPart()){
        	if (CommunicationPort.canInstantiate(mObj))
        			results.add((CommunicationPort)CamelDesignerProxyFactory.instantiate(mObj, CommunicationPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("c5010f25-af11-4654-b8ee-0ee77df97700")
=======
    @objid ("a083b039-1f44-4276-aaaa-eedfc3d76ae3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<HostingPort> getProvidedHostInstances() {
        List<HostingPort> results = new ArrayList<>();
        for (BindableInstance mObj : ((Instance) this.elt).getPart()){
        	if (HostingPort.canInstantiate(mObj))
        			results.add((HostingPort)CamelDesignerProxyFactory.instantiate(mObj, HostingPort.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f8efc89f-f83d-4e50-aa63-e8fe0eec6440")
=======
    @objid ("fa38dce9-728d-4a37-9558-eb1bdf6f9dc1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public CamelComponent getType() {
        return (CamelComponent)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), CamelComponent.STEREOTYPE_NAME);
    }

<<<<<<< HEAD
    @objid ("2fd5b87e-9d73-48e1-988f-4ab558b3d075")
=======
    @objid ("91f40713-82c1-450c-84a8-ddc5dde30e5e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("964bdb23-c836-449e-a479-be4f8eb4824f")
=======
    @objid ("1511afe9-25c1-4a5a-80b1-63e788c32c60")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeProvidedCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("ff8d197f-972b-498f-9089-9d2163f9792c")
=======
    @objid ("5df41e8f-7e4e-47c7-9150-f3e918f98955")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeProvidedHostInstances(final HostingPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("71e04a81-45ed-4021-b39c-7f0eb364d781")
=======
    @objid ("41f6b3f1-517d-495b-92cc-e9f20ee057f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setDestroyedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a34bb30e-ddaa-436e-9e2b-7d12b18d8004")
=======
    @objid ("59701e10-a1c5-4bb2-a978-107b31892e7c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setInstantiatedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("5bba2f76-c419-4b46-a063-028d79c936cc")
=======
    @objid ("6b43fbcf-d49e-406c-8cb9-072e649cb10f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setType(final CamelComponent obj) {
        ((Instance) this.elt).setBase((obj != null) ? obj.getElement() : null);
    }

    @objid ("4ae0f2fc-72eb-49d0-8352-501e9a554c43")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("ee212aae-1d62-429a-9a9b-07a51ae2ca40")
=======
    @objid ("7a9c998e-ceb2-426d-a2c0-2196ef89b13e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("410e6123-df3d-46bd-81d2-a929ad0d6a01")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("1e5b92f8-8a72-4d70-a666-c0b3e36670e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d86edbd6-3e1e-49d9-82c1-d18eb6788809")
        public static TagType INSTANTIATEDON_TAGTYPE_ELT;

        @objid ("86b09c64-07b3-49ce-8c0a-5c424baf801f")
        public static TagType DESTROYEDON_TAGTYPE_ELT;

        @objid ("3ff8f766-1b36-4922-ba70-68bfcc5e9b8d")
        private static Stereotype MDAASSOCDEP;

        @objid ("de0030de-98a5-4775-b65a-1c593f56c19c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a59c41fc-0b82-43ec-83bf-ba439630b2f7")
=======
        @objid ("f164556e-f629-423d-8d71-14ead1e45ded")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("500cb6e9-4577-4124-ba4e-eb869ff1594e")
        public static TagType INSTANTIATEDON_TAGTYPE_ELT;

        @objid ("0dca1b10-9a26-4008-8b39-fd2904229ebc")
        public static TagType DESTROYEDON_TAGTYPE_ELT;

        @objid ("1ff95b40-4b29-4e32-8731-5def0c768824")
        private static Stereotype MDAASSOCDEP;

        @objid ("a3b9021d-5772-4ee4-9825-4aaa0d7858be")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3e6a7bfc-01ce-4a2e-930c-2cc446dbf1ff")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "aba476b3-2629-42d6-9138-1bf866332333");
            INSTANTIATEDON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e6ac56dd-6986-41e3-944d-c5fad2bd2b84");
            DESTROYEDON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fb31df1a-95e1-40e6-aea3-f1c4fc314882");
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
