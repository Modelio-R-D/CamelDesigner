/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << PaaS >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("de5fbae9-da70-4f9b-a638-28a7fd9062a1")
public class PaaS extends CamelComponent {
    @objid ("0304c2d9-7d6c-40a5-bcc1-f2e2ac39f48a")
    public static final String STEREOTYPE_NAME = "PaaS";

    /**
     * Tells whether a {@link PaaS proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << PaaS >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("297b9e15-d975-4fe8-b196-7eb65fc6907e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << PaaS >> then instantiate a {@link PaaS} proxy.
     * 
     * @return a {@link PaaS} proxy on the created {@link Component}.
     */
    @objid ("de49ea3d-2f9a-4f77-83d3-e68d7f9fd586")
    public static PaaS create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME);
        return PaaS.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link PaaS} proxy from a {@link Component} stereotyped << PaaS >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Component
     * @return a {@link PaaS} proxy or <i>null</i>.
     */
    @objid ("8717b7b7-97b7-4550-8163-488aba344486")
    public static PaaS instantiate(final Component obj) {
        return PaaS.canInstantiate(obj) ? new PaaS(obj) : null;
    }

    /**
     * Tries to instantiate a {@link PaaS} proxy from a {@link Component} stereotyped << PaaS >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Component}
     * @return a {@link PaaS} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("96edd9b5-5263-40e1-b2ee-2ad9edca5c77")
    public static PaaS safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (PaaS.canInstantiate(obj))
            return new PaaS(obj);
        else
            throw new IllegalArgumentException("PaaS: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d96a24dc-7e2c-41b8-aa8f-526cb0274e4c")
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
        PaaS other = (PaaS) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}.
     * 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("e1daaa5a-5bce-4063-a8b0-3557471e207e")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("f78786a8-a575-4e2e-8470-27531cf800fd")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("e3288273-4061-47f2-92d9-1c7c0a6bf163")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("50489b8f-9646-4de8-9eaa-79b36c45f519")
    protected PaaS(final Component elt) {
        super(elt);
    }

    @objid ("ebb4dcf9-28ac-415f-b6ab-19e64a2fd1da")
    public static final class MdaTypes {
        @objid ("e49f2145-2327-467c-adaf-01248a77115e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("66d7dbf4-1dcd-4e90-9adb-c8e9d893fb36")
        private static Stereotype MDAASSOCDEP;

        @objid ("1f1d827c-e1df-4d4c-bc77-262b1ca751e8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3d9e581c-fb1d-4002-8d2c-59d003c1ec27")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d0c33c39-75b6-489b-be58-97166b99012b");
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
