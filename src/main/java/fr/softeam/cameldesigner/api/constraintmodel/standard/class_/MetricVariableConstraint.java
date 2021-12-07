/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MetricVariableConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("88a16bb9-e6be-4c66-8c4a-998c9dc4ab7e")
public class MetricVariableConstraint extends UnaryConstraint {
    @objid ("432958cf-df02-480f-8b2e-d3cf737cc791")
    public static final String STEREOTYPE_NAME = "MetricVariableConstraint";

    /**
     * Tells whether a {@link MetricVariableConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricVariableConstraint >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("5b787fe1-3bcf-46fc-9c14-0e16e5cc7a5c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricVariableConstraint >> then instantiate a {@link MetricVariableConstraint} proxy.
     * 
     * @return a {@link MetricVariableConstraint} proxy on the created {@link Class}.
     */
    @objid ("ce07678e-2fa6-421f-8700-15beeb75084a")
    public static MetricVariableConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricVariableConstraint.STEREOTYPE_NAME);
        return MetricVariableConstraint.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MetricVariableConstraint} proxy from a {@link Class} stereotyped << MetricVariableConstraint >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link MetricVariableConstraint} proxy or <i>null</i>.
     */
    @objid ("c7917d42-4a21-4b8d-bda8-bb868a93ca38")
    public static MetricVariableConstraint instantiate(final Class obj) {
        return MetricVariableConstraint.canInstantiate(obj) ? new MetricVariableConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricVariableConstraint} proxy from a {@link Class} stereotyped << MetricVariableConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link MetricVariableConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("35ef91ef-c82b-4bd5-9995-0fa188194b7e")
    public static MetricVariableConstraint safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricVariableConstraint.canInstantiate(obj))
            return new MetricVariableConstraint(obj);
        else
            throw new IllegalArgumentException("MetricVariableConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("399eb24f-1cf3-4b23-b8f4-b2db7baea0a2")
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
        MetricVariableConstraint other = (MetricVariableConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b8bed242-5aee-4495-a73f-05313afac98a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("b8cb7e15-65d5-45c7-b8ae-882e27d55df7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d6fd6d4c-c556-4318-a5d8-7d65d0dfa536")
    protected MetricVariableConstraint(final Class elt) {
        super(elt);
    }

    @objid ("79432987-aa34-4ff7-891e-4e84a140162f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("66c63652-00b1-4eb9-bd2c-4a86a3cf7386")
    public static final class MdaTypes {
        @objid ("0816d951-7876-4084-8fdf-f1703f7ac6a3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16752f14-adb9-42b4-a28d-bf90931085ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ebea5d8-6e78-48c6-b9ea-6b9fc9ed995b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5bbcb053-acfe-4498-a6aa-a8148647003a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "15357a97-c8da-4fc0-8af2-a0a9675fd28b");
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
