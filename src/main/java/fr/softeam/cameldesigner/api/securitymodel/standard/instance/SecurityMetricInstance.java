/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.securitymodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
    @objid ("2ae375d3-7ae6-41ae-a0c9-fd2a9c88b046")
    public static final String STEREOTYPE_NAME = "SecurityMetricInstance";

    /**
     * Tells whether a {@link SecurityMetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SecurityMetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("04461a81-18ec-4600-a6b4-edcb3bf1a8d4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SecurityMetricInstance >> then instantiate a {@link SecurityMetricInstance} proxy.
     * 
     * @return a {@link SecurityMetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("63f6a873-6922-4297-a2af-c2f214c37d7e")
    public static SecurityMetricInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME);
        return SecurityMetricInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link SecurityMetricInstance} proxy or <i>null</i>.
     */
    @objid ("5f1dc098-7a19-40e6-9bfe-53dc5af47d89")
    public static SecurityMetricInstance instantiate(final Instance obj) {
        return SecurityMetricInstance.canInstantiate(obj) ? new SecurityMetricInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SecurityMetricInstance} proxy from a {@link Instance} stereotyped << SecurityMetricInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link SecurityMetricInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d23e4b48-5eb0-49b4-8840-2f1d7d2667aa")
    public static SecurityMetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SecurityMetricInstance.canInstantiate(obj))
            return new SecurityMetricInstance(obj);
        else
            throw new IllegalArgumentException("SecurityMetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("88d3e8a4-2066-47b5-b59f-8e614f8e9eef")
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
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("6159767f-261b-466c-b5e8-62cc80f07a9f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("dee94e46-c4bf-4f95-a0b9-b801d1f8f33f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("cafd16de-6ae1-43ab-a475-2fb4ff86fd65")
    protected SecurityMetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("91cf5d57-7dbc-49f4-b2a7-30e61c6807c9")
    public static final class MdaTypes {
        @objid ("f60a5a6c-df88-42f5-8454-7ff289cd4697")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5a8ad20f-fbf0-4362-bbe6-a23295fa39c2")
        private static Stereotype MDAASSOCDEP;

        @objid ("65122c95-5b6b-4531-80c4-356c54a7c2a5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6539f7e2-0fd8-424f-a7af-e3b1cfeaddc5")
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
