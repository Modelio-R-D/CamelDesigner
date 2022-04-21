/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("aa529901-c58d-404f-b8f6-e23e2aedb280")
    public static final String STEREOTYPE_NAME = "PaaS";

    /**
     * Tells whether a {@link PaaS proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << PaaS >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f5518a96-8f3d-47e7-b339-f73d48edd93c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, PaaS.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << PaaS >> then instantiate a {@link PaaS} proxy.
     * 
     * @return a {@link PaaS} proxy on the created {@link Component}.
     */
    @objid ("9e3e90b2-bf75-4fb1-ae50-0b6c06c36c0c")
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
    @objid ("617063ba-8eca-4809-8987-2b0e7de65ed6")
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
    @objid ("c3295508-b5b8-415e-ae9e-d1212ad23396")
    public static PaaS safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (PaaS.canInstantiate(obj))
            return new PaaS(obj);
        else
            throw new IllegalArgumentException("PaaS: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c0834f2d-d1c7-4652-ab39-b4aaec533af9")
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
    @objid ("25e08457-f698-44b5-bab1-1a3f87e36a91")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("4be05cbd-009f-4d04-b53c-72251b8cf50b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("03d17871-a8e1-4349-b0c5-dc57ec7631d3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c80d11dc-e483-4a08-8076-906ec2edb54f")
    protected PaaS(final Component elt) {
        super(elt);
    }

    @objid ("ebb4dcf9-28ac-415f-b6ab-19e64a2fd1da")
    public static final class MdaTypes {
        @objid ("b7dbe9fa-7a44-42f3-b813-fbecd0d0f555")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3f006148-063a-4b7f-a75d-4bf2a7e046de")
        private static Stereotype MDAASSOCDEP;

        @objid ("e9d70e56-5ac5-48ce-b1db-75617a2318d1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4a01420-8290-47f6-8624-9b6e053edeb3")
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
