/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.port;

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
 * Proxy class to handle a {@link Port} with << HostingPort >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf141fb2-a5e7-4adf-9870-921e4a516048")
public class HostingPort extends FeaturePort {
    @objid ("e11f74c4-6722-4fd8-8683-9b52f8a88915")
    public static final String STEREOTYPE_NAME = "HostingPort";

    /**
     * Tells whether a {@link HostingPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad3e188a-7869-4726-bd9b-8dcfdd925c8a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPort >> then instantiate a {@link HostingPort} proxy.
     * 
     * @return a {@link HostingPort} proxy on the created {@link Port}.
     */
    @objid ("b3e36937-93b8-420b-8719-071c278a0ad5")
    public static HostingPort create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Port");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME);
        return HostingPort.instantiate((Port)e);
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Port
     * @return a {@link HostingPort} proxy or <i>null</i>.
     */
    @objid ("040de50f-3045-4bac-84a3-e538f9dbc872")
    public static HostingPort instantiate(final Port obj) {
        return HostingPort.canInstantiate(obj) ? new HostingPort(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HostingPort} proxy from a {@link Port} stereotyped << HostingPort >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Port}
     * @return a {@link HostingPort} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("411fd264-0a5a-419a-9855-4f790f256849")
    public static HostingPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPort.canInstantiate(obj))
            return new HostingPort(obj);
        else
            throw new IllegalArgumentException("HostingPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b35db673-f17f-4baf-9366-49ae26c3762d")
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
     * 
     * @return the Port represented by this proxy, never null.
     */
    @objid ("206f5d62-f580-4b94-b192-eaea8c370adc")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("165a4a06-afc7-41cd-ac4e-5b8a23572d85")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("aed9cf32-4c9c-4e9d-8d85-6a211a5c708b")
    protected HostingPort(final Port elt) {
        super(elt);
    }

    @objid ("98fe20f6-f33e-4b62-b8ea-1f4b27c8cf6e")
    public static final class MdaTypes {
        @objid ("dceeeda6-f2b5-4ae1-b987-572adac3a294")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3d77512-4a74-4b26-86c4-93509da0f385")
        private static Stereotype MDAASSOCDEP;

        @objid ("aaa96e74-76f9-4d4a-a105-ab35a8b055dd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d603ae88-b340-4108-b117-d0512d6614eb")
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
