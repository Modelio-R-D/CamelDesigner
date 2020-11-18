/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << RequiredCommunicationInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class RequiredCommunicationInstance extends CommunicationPortInstance {
    public static final String STEREOTYPE_NAME = "RequiredCommunicationInstance";

    /**
     * Tells whether a {@link RequiredCommunicationInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RequiredCommunicationInstance >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RequiredCommunicationInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RequiredCommunicationInstance >> then instantiate a {@link RequiredCommunicationInstance} proxy.
     * 
     * @return a {@link RequiredCommunicationInstance} proxy on the created {@link Class}.
     */
    public static RequiredCommunicationInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RequiredCommunicationInstance.STEREOTYPE_NAME);
        return RequiredCommunicationInstance.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RequiredCommunicationInstance} proxy from a {@link Class} stereotyped << RequiredCommunicationInstance >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link RequiredCommunicationInstance} proxy or <i>null</i>.
     */
    public static RequiredCommunicationInstance instantiate(final Class obj) {
        return RequiredCommunicationInstance.canInstantiate(obj) ? new RequiredCommunicationInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RequiredCommunicationInstance} proxy from a {@link Class} stereotyped << RequiredCommunicationInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link RequiredCommunicationInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static RequiredCommunicationInstance safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RequiredCommunicationInstance.canInstantiate(obj))
            return new RequiredCommunicationInstance(obj);
        else
            throw new IllegalArgumentException("RequiredCommunicationInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        RequiredCommunicationInstance other = (RequiredCommunicationInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected RequiredCommunicationInstance(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "bde6c867-5ef3-4867-9d79-fbe800d12ebf");
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
