/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.04

 * This file was generated on 11/9/20 11:45 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << CompositeMetric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class CompositeMetric extends Metric {
    public static final String STEREOTYPE_NAME = "CompositeMetric";

    public static final String FORMULA_TAGTYPE = "formula";

    /**
     * Tells whether a {@link CompositeMetric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CompositeMetric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CompositeMetric >> then instantiate a {@link CompositeMetric} proxy.
     * 
     * @return a {@link CompositeMetric} proxy on the created {@link Class}.
     */
    public static CompositeMetric create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CompositeMetric.STEREOTYPE_NAME);
        return CompositeMetric.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CompositeMetric} proxy from a {@link Class} stereotyped << CompositeMetric >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CompositeMetric} proxy or <i>null</i>.
     */
    public static CompositeMetric instantiate(final Class obj) {
        return CompositeMetric.canInstantiate(obj) ? new CompositeMetric(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CompositeMetric} proxy from a {@link Class} stereotyped << CompositeMetric >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CompositeMetric} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static CompositeMetric safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CompositeMetric.canInstantiate(obj))
            return new CompositeMetric(obj);
        else
            throw new IllegalArgumentException("CompositeMetric: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        CompositeMetric other = (CompositeMetric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getFormula() {
        return this.elt.getTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setFormula(final String value) {
        this.elt.putTagValue(CompositeMetric.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    protected CompositeMetric(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType FORMULA_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "680d667b-9545-40d8-9c12-84675bc68fc4");
            FORMULA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "851d14e4-ea15-4582-a92c-96160e350212");
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
