/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
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
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Port} with << HostingPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("c7cd871c-65fe-47ef-94b0-65618ab304b4")
public class HostingPortInstance extends FeaturePort {
    @objid ("fd08bc56-0a29-4521-81f4-f01613a049dc")
    public static final String STEREOTYPE_NAME = "HostingPortInstance";

    /**
     * Tells whether a {@link HostingPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f265534-0f5a-4fd4-b4ba-7ed7c970001f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPortInstance >> then instantiate a {@link HostingPortInstance} proxy.
     * 
     * @return a {@link HostingPortInstance} proxy on the created {@link Port}.
     */
    @objid ("19e9aba8-5a57-48ff-af93-f33f63f4a146")
    public static HostingPortInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME);
        return HostingPortInstance.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPortInstance} proxy from a {@link Port} stereotyped << HostingPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link HostingPortInstance} proxy or <i>null</i>.
     */
    @objid ("3025f44b-44c4-4225-b8bd-26a873ac48dc")
    public static HostingPortInstance instantiate(final Port obj) {
        return HostingPortInstance.canInstantiate(obj) ? new HostingPortInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPortInstance} proxy from a {@link Port} stereotyped << HostingPortInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link HostingPortInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ddf4b21c-316b-49f4-9aa0-530cd82b4df6")
    public static HostingPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPortInstance.canInstantiate(obj))
        	return new HostingPortInstance(obj);
        else
        	throw new IllegalArgumentException("HostingPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("09096030-e73f-4111-9062-e80c3837e484")
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
        HostingPortInstance other = (HostingPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("dc48652c-85cc-4010-96fc-4694c0084a39")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    /**
     * Get the value to the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("32fab209-d5e3-4cc6-aeef-de3901c298b9")
    public HostingPort getType() {
        return (HostingPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), HostingPort.STEREOTYPE_NAME);
    }

    @objid ("afebe04c-22ec-4229-96a3-361334ffd954")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'type' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c2d64aaf-226b-4a87-9b31-5fca0a76a524")
    public void setType(final HostingPort obj) {
        ((Port) this.elt).setRepresentedFeature((obj != null) ? obj.getElement() : null);
    }

    @objid ("a12c45e3-b24e-4c23-8821-230ce8bd6525")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("e9e6e39b-7c08-4789-8914-dcf1c84894e8")
    protected HostingPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("ed3d08ae-14c6-4868-b319-18cc92db0872")
    public static final class MdaTypes {
        @objid ("0d39ea3d-328e-4f36-81de-0a7cd8919b5f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("04616bfe-445d-41c7-a398-12e248c05233")
        private static Stereotype MDAASSOCDEP;

        @objid ("189c2885-52d2-413e-ad9c-f42ab57ab825")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("c8d4e024-0d53-4e48-bb04-6a1328489808")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b2bcf5bc-48d4-42cc-bc87-0ca2f2ca2812");
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
