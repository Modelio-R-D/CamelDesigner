/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Port} with << CommunicationPortInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("69c260bf-5f8b-43c5-99e2-3e3608ba3eb2")
public class CommunicationPortInstance extends FeaturePort {
    @objid ("12e8185b-f1f1-4493-ba7b-2bb9eccda0f2")
    public static final String STEREOTYPE_NAME = "CommunicationPortInstance";

    /**
     * Tells whether a {@link CommunicationPortInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << CommunicationPortInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f2461ede-2d9b-4b75-b06c-b29ee3717feb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << CommunicationPortInstance >> then instantiate a {@link CommunicationPortInstance} proxy.
     * 
     * @return a {@link CommunicationPortInstance} proxy on the created {@link Port}.
     */
    @objid ("162662e6-4e92-4c4e-a711-4b9dfa3c0012")
    public static CommunicationPortInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CommunicationPortInstance.STEREOTYPE_NAME);
        return CommunicationPortInstance.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link CommunicationPortInstance} proxy from a {@link Port} stereotyped << CommunicationPortInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Port
     * @return a {@link CommunicationPortInstance} proxy or <i>null</i>.
     */
    @objid ("91d392a0-4426-4eb3-97b1-19042cbc4833")
    public static CommunicationPortInstance instantiate(final Port obj) {
        return CommunicationPortInstance.canInstantiate(obj) ? new CommunicationPortInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CommunicationPortInstance} proxy from a {@link Port} stereotyped << CommunicationPortInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Port}
     * @return a {@link CommunicationPortInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e0e007f-6535-4c83-a538-dc9e482f0718")
    public static CommunicationPortInstance safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (CommunicationPortInstance.canInstantiate(obj))
            return new CommunicationPortInstance(obj);
        else
            throw new IllegalArgumentException("CommunicationPortInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e47c3406-b058-469d-971b-99ab860fe5ae")
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
        CommunicationPortInstance other = (CommunicationPortInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Port}.
     * 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("0451d977-301e-406e-bb56-4cc7e9db99d9")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("a4f050c6-1bca-41c8-aaec-c4d2686a141e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("27e02d12-af76-452f-95de-600adeaf51ab")
    protected CommunicationPortInstance(final Port elt) {
        super(elt);
    }

    @objid ("504cf2f2-0359-4c14-b98c-237508d0590f")
    public static final class MdaTypes {
        @objid ("a1a0b8a7-1b30-4a56-8d57-12f2d96c635e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("00e25898-80db-49be-afde-5c43f3ac9600")
        private static Stereotype MDAASSOCDEP;

        @objid ("5533de42-ffc5-4fe6-badf-10f515ce99f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9d1799ea-6966-42ca-9a8c-0f06db9cd27e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "42bf761a-193d-48f8-b686-2c4b96a56384");
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
