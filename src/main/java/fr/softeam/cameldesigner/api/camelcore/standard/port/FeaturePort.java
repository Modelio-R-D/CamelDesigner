/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("d8012abe-efbd-4a32-bac6-613a1d28fb45")
    public static final String STEREOTYPE_NAME = "Feature_Port";

    /**
     * Tells whether a {@link FeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << Feature_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fe838264-c88b-461f-b903-05cd99e95225")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << Feature_Port >> then instantiate a {@link FeaturePort} proxy.
     * 
     * @return a {@link FeaturePort} proxy on the created {@link Port}.
     */
    @objid ("d5015507-cb0c-4578-bba9-6715953c2a9f")
    public static FeaturePort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME);
        return FeaturePort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Port
     * @return a {@link FeaturePort} proxy or <i>null</i>.
     */
    @objid ("2b21b9d0-fc24-4006-ad5d-c2575b3d5aca")
    public static FeaturePort instantiate(final Port obj) {
        return FeaturePort.canInstantiate(obj) ? new FeaturePort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeaturePort} proxy from a {@link Port} stereotyped << Feature_Port >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Port}
     * @return a {@link FeaturePort} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2f97ef1a-7e16-4dc8-a817-c28b368e08dc")
    public static FeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FeaturePort.canInstantiate(obj))
            return new FeaturePort(obj);
        else
            throw new IllegalArgumentException("FeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("484a3b4e-b0a0-47fe-8e85-18dff75c6476")
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
     * 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("ebbdac35-6b64-414e-9da0-ae35e72fa146")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("8bca301f-a5b7-42c9-b17f-2be4c3a9fff6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("4a829903-5492-4277-b8df-704f016496eb")
    protected FeaturePort(final Port elt) {
        super(elt);
    }

    @objid ("a8d9e562-ebce-4b04-a8f8-b81512ba3fd4")
    public static final class MdaTypes {
        @objid ("cd959e2c-409a-4626-b8ef-3d86a805342a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06ec7b1b-2585-46f5-98ab-ee979c5eab9d")
        private static Stereotype MDAASSOCDEP;

        @objid ("b00b4004-6e24-4d0b-b5eb-3563a79122f4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("935e368b-b5b4-417d-9d2d-b80b24c6f440")
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
