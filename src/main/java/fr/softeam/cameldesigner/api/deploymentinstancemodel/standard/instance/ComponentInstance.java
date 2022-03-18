/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("cd17b796-1a11-4027-a0bb-4fb27bc2ecf9")
    public static final String STEREOTYPE_NAME = "ComponentInstance";

    @objid ("47ceca35-97f0-4f04-83fa-079b54aedcfe")
    public static final String DESTROYEDON_TAGTYPE = "destroyedOn";

    @objid ("07369543-58af-428c-8a8d-54dc6450ed28")
    public static final String INSTANTIATEDON_TAGTYPE = "instantiatedOn";

    /**
     * Tells whether a {@link ComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("852643fd-7f0f-4444-ae04-d1443f29eb94")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("af096117-5710-4a8c-bb64-296ed8598049")
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
    @objid ("b7f7c426-6636-4e1d-ad27-05b27a2d8299")
    public void addProvidedHostInstances(final HostingPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("c9036fcf-4bd4-4d68-9475-03162ac545f8")
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
    @objid ("fd263acd-f06c-4bb2-ab01-ce6729a77d59")
    public String getDestroyedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("7f9914b5-4ebe-4b67-9ded-c1127e623a2d")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("234addee-2470-47fd-a91e-56868a4effe7")
    public String getInstantiatedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("22f65c74-ddb4-4c52-b09b-e8e6248ead61")
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
    @objid ("a2f008a9-6bf7-41ea-b76d-8b58beb369a5")
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
    @objid ("7b183d8e-be5a-4a63-aa4a-434cd16ca8e6")
    public CamelComponent getType() {
        return (CamelComponent)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), CamelComponent.STEREOTYPE_NAME);
    }

    @objid ("8fe89026-a838-4764-bea0-31696719218c")
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
    @objid ("67ed8589-268f-4dae-9b3e-2e052afdc8d1")
    public boolean removeProvidedCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f63291ef-121c-4dd3-a24c-7dbc77e2ed4f")
    public boolean removeProvidedHostInstances(final HostingPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9a1215f2-5ce2-4d9d-b924-2c9cf4fac961")
    public void setDestroyedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c5b59a48-5244-4019-8bda-287e9536a148")
    public void setInstantiatedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("6d7d7618-c757-4b18-93b3-ce2f2923f5d5")
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

    @objid ("a211dbfa-1bba-4f12-b9f7-09b2ad6471f4")
    protected ComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("410e6123-df3d-46bd-81d2-a929ad0d6a01")
    public static final class MdaTypes {
        @objid ("68c72e6b-ffb9-4f4f-9545-be5ec1fd3a71")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("551bc023-0534-49c4-aa64-09147a95c9b9")
        public static TagType INSTANTIATEDON_TAGTYPE_ELT;

        @objid ("273e4050-8270-4c0b-a689-ff60e2d84d49")
        public static TagType DESTROYEDON_TAGTYPE_ELT;

        @objid ("1ffd16e6-79ee-4f5b-ba30-ae022815b0a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb1c40a0-e171-48a8-8baa-bc7718057019")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4dc50ba8-4482-4dac-a8f8-050403d701cf")
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
