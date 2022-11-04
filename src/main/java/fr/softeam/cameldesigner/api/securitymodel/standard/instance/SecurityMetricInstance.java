/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SecurityMetricInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("db549854-9aae-4283-9b11-2038f1326191")
public class SecurityMetricInstance extends MetricInstance {
    @objid ("f1824748-7e9b-4321-8634-8f0ed61710ee")
    public static final String STEREOTYPE_NAME = "SecurityMetricInstance";

    /**
     * Tells whether a {@link SecurityMetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SecurityMetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("29354b00-2a4c-4605-a311-5ef0a70e3d35")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SecurityMetricInstance >> then instantiate a {@link SecurityMetricInstance} proxy.
     * 
     * @return a {@link SecurityMetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("b77139a2-3520-486a-9012-2cd9471dea9e")
    public static SecurityMetricInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME);
        return SecurityMetricInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SecurityMetricInstance} proxy or <i>null</i>.
     */
    @objid ("40cc1a47-16b7-4240-85b3-fc4a8288ace8")
    public static SecurityMetricInstance instantiate(final Instance obj) {
        return SecurityMetricInstance.canInstantiate(obj) ? new SecurityMetricInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SecurityMetricInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("80c65d9b-1eb6-4f81-ba31-489523f8e9e1")
    public static SecurityMetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SecurityMetricInstance.canInstantiate(obj))
        	return new SecurityMetricInstance(obj);
        else
        	throw new IllegalArgumentException("SecurityMetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a0c03f53-e9c8-4922-8bc9-2d490a3a7c01")
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
        SecurityMetricInstance other = (SecurityMetricInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("c6d142e4-0942-4462-bb0f-5931e5324dab")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("00f7b252-0622-467b-b031-b61c33e7e32f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("289e8f41-bb29-4030-a35d-cfd36d96fdd7")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("62945a17-15e1-47d5-9fc9-9aeb14f20993")
    protected SecurityMetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("91cf5d57-7dbc-49f4-b2a7-30e61c6807c9")
    public static final class MdaTypes {
        @objid ("00a469d9-fc63-4e4c-b79c-236c2d5732d8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1406e903-2d14-4ca4-8461-28b7dbc12c9a")
        private static Stereotype MDAASSOCDEP;

        @objid ("82681baa-31de-405b-a095-fb8382ed78e3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("13d26e99-e5c5-4cb8-97d3-5fa8f2e58f45")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4cb7cfa4-64dc-42a4-9178-af3560cfcf40");
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
