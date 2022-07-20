/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
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
 * Proxy class to handle a {@link Port} with << HostingPort >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf141fb2-a5e7-4adf-9870-921e4a516048")
public class HostingPort extends FeaturePort {
    @objid ("6af35579-7a5f-420f-9f54-2511fb624f25")
    public static final String STEREOTYPE_NAME = "HostingPort";

    /**
     * Tells whether a {@link HostingPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b11ac384-95e7-45e2-ad57-7b450912acd2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPort >> then instantiate a {@link HostingPort} proxy.
     * 
     * @return a {@link HostingPort} proxy on the created {@link Port}.
     */
    @objid ("87ab1f8a-2745-4cd8-9740-b5b32caffb3f")
    public static HostingPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME);
        return HostingPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link HostingPort} proxy or <i>null</i>.
     */
    @objid ("b1858a4f-a6ab-422c-89a5-4c16011851cd")
    public static HostingPort instantiate(final Port obj) {
        return HostingPort.canInstantiate(obj) ? new HostingPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link HostingPort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("64c913a0-f9bb-43ff-8388-715238f27d49")
    public static HostingPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPort.canInstantiate(obj))
        	return new HostingPort(obj);
        else
        	throw new IllegalArgumentException("HostingPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("0b8b9b6b-5dfe-4231-b844-d3c2bdb0a048")
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
        HostingPort other = (HostingPort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("14f13a45-cd98-49cb-a049-171681537006")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("a1ece9d4-6b2a-4746-8bb6-b1ef96705078")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc47b2fa-358f-4eae-98fa-43a615e781d3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("bce715cc-0ae4-4b2c-a595-b45c47a8f2ff")
    protected HostingPort(final Port elt) {
        super(elt);
    }

    @objid ("98fe20f6-f33e-4b62-b8ea-1f4b27c8cf6e")
    public static final class MdaTypes {
        @objid ("97bf4ed5-d357-45fb-919c-116603891b2b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fcc17e77-b775-4a6f-bb1b-665673805c5b")
        private static Stereotype MDAASSOCDEP;

        @objid ("9a9c8522-74c5-4b33-b64a-8090f7a52386")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("30f40c58-68fc-4da2-a487-04562f6f2307")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0672a25d-20e7-4566-b187-f3f3572d73c3");
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
