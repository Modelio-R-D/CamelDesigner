/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("c87a1841-2f97-4db5-b301-6cdcc4dbcb84")
    public static final String STEREOTYPE_NAME = "HostingPort";

    /**
     * Tells whether a {@link HostingPort proxy} can be instantiated from a {@link MObject} checking it is a {@link Port} stereotyped << HostingPort >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4808123f-89b4-49a6-bc49-a99b088f68f1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Port) && ((Port) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HostingPort.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Port} stereotyped << HostingPort >> then instantiate a {@link HostingPort} proxy.
     * 
     * @return a {@link HostingPort} proxy on the created {@link Port}.
     */
    @objid ("1fb76133-5e21-4e2a-8774-257e8cf240be")
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
    @objid ("d73ccce8-27f9-44ef-b725-b49e8d69650e")
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
    @objid ("012cba12-9871-4aaa-8145-378bae65df37")
    public static HostingPort safeInstantiate(final Port obj) throws IllegalArgumentException {
        if (HostingPort.canInstantiate(obj))
        	return new HostingPort(obj);
        else
        	throw new IllegalArgumentException("HostingPort: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("75861b6f-6500-40c7-81c7-3b3161f248e7")
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
    @objid ("63565bf7-a188-4be6-967e-0a2dfafc41d4")
    @Override
    public Port getElement() {
        return (Port)super.getElement();
    }

    @objid ("b1d0222c-239c-4aa3-b7a9-88a6053f62b0")
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

    @objid ("aa3caae2-26ca-4f08-bb20-dcae45f774df")
    protected HostingPort(final Port elt) {
        super(elt);
    }

    @objid ("98fe20f6-f33e-4b62-b8ea-1f4b27c8cf6e")
    public static final class MdaTypes {
        @objid ("a477e64a-125d-481e-9e53-3cbd0615cb3e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b3e4bd3f-6e01-4816-8911-9b33bef955d2")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4546363-5279-47a2-b001-69facc9b4f3f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d130f76f-29cb-41ed-9bbb-2e6b1d4a93b6")
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
