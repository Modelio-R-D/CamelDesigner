/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/15/22 11:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
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
 * Proxy class to handle a {@link Port} with << Feature_Port >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("df72df64-fde5-4c17-ad49-37e1bb0285a0")
public class FeaturePort extends FeatureInstance {
    @objid ("dfa0bbe4-08dd-40e0-becf-352c2c3ac6fc")
    public static final String STEREOTYPE_NAME = "Feature_Port";

    /**
     * Tells whether a {@link FeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << Feature_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f6381fd-6eef-4d69-9c90-0a3b55644bba")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << Feature_Port >> then instantiate a {@link FeaturePort} proxy.
     * 
     * @return a {@link FeaturePort} proxy on the created {@link Port}.
     */
    @objid ("ba8ad3e7-12cd-420e-82b2-c845c0e276b5")
    public static FeaturePort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME);
        return FeaturePort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Port
     * @return a {@link FeaturePort} proxy or <i>null</i>.
     */
    @objid ("d8ccbac4-391d-4255-bfa4-6c80e6a283d1")
    public static FeaturePort instantiate(final Port obj) {
        return FeaturePort.canInstantiate(obj) ? new FeaturePort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Port}
     * @return a {@link FeaturePort} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4a034e23-e4b1-4b97-9f40-54b716b09489")
    public static FeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FeaturePort.canInstantiate(obj))
        	return new FeaturePort(obj);
        else
        	throw new IllegalArgumentException("FeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4b3422a1-b60e-422b-a667-611424fd9473")
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
        FeaturePort other = (FeaturePort) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}. 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("81936531-7ebf-4778-b9c6-b245c4612edf")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("f9588a68-0371-4834-b7be-3cc7409117af")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b6553132-b6d6-4165-ae8a-efdbc370bd02")
    protected FeaturePort(final Port elt) {
        super(elt);
    }

    @objid ("a8d9e562-ebce-4b04-a8f8-b81512ba3fd4")
    public static final class MdaTypes {
        @objid ("855b39ed-4701-43d9-8a1d-e00c709f2ca5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a8ca8dc4-c9e5-4fb9-a1e2-a7c39d5eaa22")
        private static Stereotype MDAASSOCDEP;

        @objid ("5cbf5bbd-656a-4be9-86b5-b65d7cd0ca2a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9cf8bd32-ba80-4e1b-ab89-b68408d56cb8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "18d0504c-73e0-4c7c-8341-53038298af2c");
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
