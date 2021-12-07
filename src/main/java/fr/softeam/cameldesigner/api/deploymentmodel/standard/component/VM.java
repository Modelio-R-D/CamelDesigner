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
 * Proxy class to handle a {@link Component} with << VM >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7ab7afe3-013e-4c06-af79-866889291e60")
public class VM extends CamelComponent {
    @objid ("071d9603-9469-43f9-8e4e-c1852aff11a0")
    public static final String STEREOTYPE_NAME = "VM";

    /**
     * Tells whether a {@link VM proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << VM >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("794d2c64-311c-4cab-9e98-218e63da40ff")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << VM >> then instantiate a {@link VM} proxy.
     * 
     * @return a {@link VM} proxy on the created {@link Component}.
     */
    @objid ("1dbeddce-e73a-4196-8946-88fc3a3cf621")
    public static VM create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, VM.STEREOTYPE_NAME);
        return VM.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link VM} proxy from a {@link Component} stereotyped << VM >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Component
     * @return a {@link VM} proxy or <i>null</i>.
     */
    @objid ("d76f0fd6-661a-48a0-b646-09557fdcabc0")
    public static VM instantiate(final Component obj) {
        return VM.canInstantiate(obj) ? new VM(obj) : null;
    }

    /**
     * Tries to instantiate a {@link VM} proxy from a {@link Component} stereotyped << VM >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Component}
     * @return a {@link VM} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a71ff95c-e07d-45e3-8da8-3c23936e127a")
    public static VM safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (VM.canInstantiate(obj))
            return new VM(obj);
        else
            throw new IllegalArgumentException("VM: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("c2214957-bda3-4f0c-9b56-81e1206462df")
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
        VM other = (VM) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Component}.
     * 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("32e2e617-64fb-4af9-8642-1c43a7dc4a98")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("d33ab7c4-9670-48bb-9b82-c05b436e2af7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("157df50c-8c2a-4d3c-b649-29ba31ab55e3")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("1dac8320-9200-4cd5-94af-e1d2e161e986")
    protected VM(final Component elt) {
        super(elt);
    }

    @objid ("b498c9c3-0245-4fb1-97a6-fbac3113e3fd")
    public static final class MdaTypes {
        @objid ("99c9f208-58b3-45cd-a955-4c0d4e828bd4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("36bff706-fb09-4d18-a5a5-d3280c778fa5")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd364680-9372-4603-9c27-dbec49410f5a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7e088903-8402-4039-a009-941e9d32d29e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8bd1ea8d-6714-4a3b-9da9-c914064d8440");
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
