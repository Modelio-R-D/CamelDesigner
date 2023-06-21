/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("0cb0904e-db82-4474-ac7b-aa13e864d80d")
    public static final String STEREOTYPE_NAME = "HostingPortInstance";

    /**
     * Tells whether a {@link HostingPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("558011c4-1c1b-4a41-8b29-4e309908c87b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPortInstance >> then instantiate a {@link HostingPortInstance} proxy.
     * 
     * @return a {@link HostingPortInstance} proxy on the created {@link Port}.
     */
    @objid ("563c837d-415d-46c2-9f15-34f463473a5b")
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
    @objid ("c464e0b1-d68d-465a-82c0-a0e801e38343")
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
    @objid ("0e73ef28-c869-4775-9a2a-5ef0869b74e3")
    public static HostingPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPortInstance.canInstantiate(obj))
        	return new HostingPortInstance(obj);
        else
        	throw new IllegalArgumentException("HostingPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e1e678ce-b378-436f-af93-537d0bec90dc")
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
    @objid ("c963c3b0-b162-4cb2-a7b3-17f0d9b67963")
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
    @objid ("8202a26f-9cdb-4b28-bd4b-9b17cd4bf928")
    public HostingPort getType() {
        return (HostingPort)CamelDesignerProxyFactory.instantiate(((Port) this.elt).getRepresentedFeature(), HostingPort.STEREOTYPE_NAME);
    }

    @objid ("6732c672-d6b1-47a9-bdfd-bf7b3bba9172")
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
    @objid ("6e0a7b64-422d-430c-8602-a7a3819e4b51")
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

    @objid ("2d4f3566-9961-4c7c-bdef-879b45497494")
    protected HostingPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("ed3d08ae-14c6-4868-b319-18cc92db0872")
    public static final class MdaTypes {
        @objid ("ae77da4f-45d7-4d27-9f50-d13e102ffafd")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fe5043ad-1409-42a9-b64d-c0eee90ed9da")
        private static Stereotype MDAASSOCDEP;

        @objid ("d7bb6444-f40d-4fd3-8bef-afae1a96ca24")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37d0fd6b-fc71-42a3-917f-bac779d058fc")
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
