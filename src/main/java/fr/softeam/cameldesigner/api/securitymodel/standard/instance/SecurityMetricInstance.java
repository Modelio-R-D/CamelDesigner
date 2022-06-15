/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("01e3660a-30f4-4cda-b443-262d0f59f1d0")
    public static final String STEREOTYPE_NAME = "SecurityMetricInstance";

    /**
     * Tells whether a {@link SecurityMetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SecurityMetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("51074eee-5a72-49c1-abe2-2f322a6f424f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, SecurityMetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SecurityMetricInstance >> then instantiate a {@link SecurityMetricInstance} proxy.
     * 
     * @return a {@link SecurityMetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("4326c1bd-9deb-46ca-8800-b0e288668fd5")
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
    @objid ("6405daae-089d-4cce-bc9f-59489f62355c")
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
    @objid ("cb3a2e36-7bdf-4f8c-90c6-01b2dd1ce3f9")
    public static SecurityMetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SecurityMetricInstance.canInstantiate(obj))
            return new SecurityMetricInstance(obj);
        else
            throw new IllegalArgumentException("SecurityMetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8993b7fc-9e91-4728-9733-eca1c35aeb99")
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
    @objid ("985d605a-c6f9-4a29-ac54-eea5b5b0ced3")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    @objid ("408ab52e-6bb4-4bdf-8c29-edbb9bf669c5")
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

    @objid ("ffdc1d26-b6f1-4ae2-a498-7eeb165780c6")
    protected SecurityMetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("91cf5d57-7dbc-49f4-b2a7-30e61c6807c9")
    public static final class MdaTypes {
        @objid ("26f55ad5-c78f-41df-9e34-64d2a3822a82")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0f9333d1-e90d-4f85-bc71-1f8f13905103")
        private static Stereotype MDAASSOCDEP;

        @objid ("8a591256-da1d-4491-a59c-f868dd054167")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec1beab5-30b4-493b-8962-4f501dff8606")
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
