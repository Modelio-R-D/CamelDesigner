/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("a43af79d-563d-49b9-bbbc-328a72e39daa")
    public static final String STEREOTYPE_NAME = "Feature_Port";

    /**
     * Tells whether a {@link FeaturePort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << Feature_Port >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("49bf0db9-0cb6-4301-9e8a-a942cbc991db")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeaturePort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << Feature_Port >> then instantiate a {@link FeaturePort} proxy.
     * 
     * @return a {@link FeaturePort} proxy on the created {@link Port}.
     */
    @objid ("523f7396-4d30-48bb-8ca0-ffb55dcb25ad")
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
    @objid ("ebc45d1c-e77e-425d-a988-ed1fe29419b0")
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
    @objid ("71914dbe-e592-4c8d-8ebd-c87e31f8415c")
    public static FeaturePort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (FeaturePort.canInstantiate(obj))
        	return new FeaturePort(obj);
        else
        	throw new IllegalArgumentException("FeaturePort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a9219c7d-1710-4c3e-9975-2262893dfaf8")
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
    @objid ("cd5bb02c-431d-4caa-b9d1-95d375caa72c")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("08824e12-9d13-432e-b5d8-99299bbb8ef2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f67b1ade-08ce-4b9c-9a87-5b809640368d")
    protected FeaturePort(final Port elt) {
        super(elt);
    }

    @objid ("a8d9e562-ebce-4b04-a8f8-b81512ba3fd4")
    public static final class MdaTypes {
        @objid ("9fb97439-f03c-4339-8a85-1f4c4770dd43")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("420d7843-30de-4b1e-a99d-4ab3db63025e")
        private static Stereotype MDAASSOCDEP;

        @objid ("c3a63cbd-7d82-43f8-904c-1ca0735a939d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("112071ea-b387-4150-b5be-49f8d5ab69e7")
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
