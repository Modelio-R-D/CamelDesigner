/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.04

 * This file was generated on 11/9/20 11:45 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.instance;

import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MetricInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class MetricInstance extends FeatureInstance {
    public static final String STEREOTYPE_NAME = "MetricInstance";

    /**
     * Tells whether a {@link MetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MetricInstance >> then instantiate a {@link MetricInstance} proxy.
     * 
     * @return a {@link MetricInstance} proxy on the created {@link Instance}.
     */
    public static MetricInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME);
        return MetricInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MetricInstance} proxy from a {@link Instance} stereotyped << MetricInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Instance
     * @return a {@link MetricInstance} proxy or <i>null</i>.
     */
    public static MetricInstance instantiate(final Instance obj) {
        return MetricInstance.canInstantiate(obj) ? new MetricInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricInstance} proxy from a {@link Instance} stereotyped << MetricInstance >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Instance}
     * @return a {@link MetricInstance} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MetricInstance.canInstantiate(obj))
            return new MetricInstance(obj);
        else
            throw new IllegalArgumentException("MetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        MetricInstance other = (MetricInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}.
     * 
     * @return the Instance represented by this proxy, never null.
     */
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected MetricInstance(final Instance elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "52b2d53f-cfda-455d-ae3d-dd97fed6fa84");
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
