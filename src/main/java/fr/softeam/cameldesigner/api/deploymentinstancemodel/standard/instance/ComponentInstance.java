/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("169788a5-cf7b-46a0-8b61-223a6e209271")
    public static final String STEREOTYPE_NAME = "ComponentInstance";

    @objid ("895392c9-e4b2-4b85-a651-83129c5769fd")
    public static final String DESTROYEDON_TAGTYPE = "destroyedOn";

    @objid ("7f9cfe2b-2162-414c-b0cc-9bd4866f9897")
    public static final String INSTANTIATEDON_TAGTYPE = "instantiatedOn";

    /**
     * Tells whether a {@link ComponentInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << ComponentInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("43b3aa54-9fbe-4ae9-a307-79bb19be30c3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ComponentInstance.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0c83b9be-37c7-42e4-98f7-693e1101732e")
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
    @objid ("d1d45445-5171-4859-8054-3f8c93a01415")
    public void addProvidedHostInstances(final HostingPort obj) {
        if (obj!=null)
          ((Instance) this.elt).getPart().add(obj.getElement());
    }

    @objid ("f220567a-3b01-4b66-857d-14bc5835fe87")
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
    @objid ("bfa4c679-ab92-4ada-a12d-290c4cf8eb2a")
    public String getDestroyedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("39006ae3-1e5a-46a2-93b7-0b12e1b2a88f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("75077645-49e5-4fa1-9c3e-2fe56483bb68")
    public String getInstantiatedOn() {
        return this.elt.getTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'providedCommunicationInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("add5a57b-3748-4f08-8e17-da6904646453")
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
    @objid ("c647b35e-bd85-4cae-aa90-c39be07e96df")
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
    @objid ("65cf1616-9991-4e38-85bd-271b6296d8be")
    public CamelComponent getType() {
        return (CamelComponent)CamelDesignerProxyFactory.instantiate(((Instance) this.elt).getBase(), CamelComponent.STEREOTYPE_NAME);
    }

    @objid ("1ab10d60-0b44-4ae1-8c19-0d99f1560340")
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
    @objid ("c938e0fe-6188-48d8-9c13-ce2447e68972")
    public boolean removeProvidedCommunicationInstances(final CommunicationPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'providedHostInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c6d5d42b-a3ff-469d-b4c5-909d2478af3d")
    public boolean removeProvidedHostInstances(final HostingPort obj) {
        return (obj!=null)? ((Instance) this.elt).getPart().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'destroyedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2df235bd-c1e2-4ab3-8cda-d80d5fb8af59")
    public void setDestroyedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.DESTROYEDON_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'instantiatedOn'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5a7c713f-8793-443d-af2f-2dd12c9f67df")
    public void setInstantiatedOn(final String value) {
        this.elt.putTagValue(ComponentInstance.MdaTypes.INSTANTIATEDON_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fa60c09d-51d8-4f95-92f2-c9aa3d9089c6")
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

    @objid ("4454cf11-1f64-4ff4-b465-d7db7e9650a1")
    protected ComponentInstance(final Instance elt) {
        super(elt);
    }

    @objid ("410e6123-df3d-46bd-81d2-a929ad0d6a01")
    public static final class MdaTypes {
        @objid ("b710f995-28cb-4680-9981-c8b6d6db10b3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("dcc83ab1-038f-4220-ad3f-374562245fa2")
        public static TagType INSTANTIATEDON_TAGTYPE_ELT;

        @objid ("44975e0e-1102-4db8-ab17-3f86dcdd99b1")
        public static TagType DESTROYEDON_TAGTYPE_ELT;

        @objid ("ced3b221-0597-4c4d-a464-1c42d6e1cf3e")
        private static Stereotype MDAASSOCDEP;

        @objid ("05ddc777-bee9-4908-a25a-58d78c69160c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("41783e1b-a01a-4abc-9297-87d0556181d9")
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
