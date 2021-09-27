/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_;

import java.util.ArrayList;
import java.util.List;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link Class} with << NonFunctionalEvent >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class NonFunctionalEvent extends SingleEvent {
    public static final String STEREOTYPE_NAME = "NonFunctionalEvent";

    public static final String ISVIOLATION_TAGTYPE = "isViolation";

    /**
     * Tells whether a {@link NonFunctionalEvent proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << NonFunctionalEvent >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << NonFunctionalEvent >> then instantiate a {@link NonFunctionalEvent} proxy.
     *
     * @return a {@link NonFunctionalEvent} proxy on the created {@link Class}.
     */
    public static NonFunctionalEvent create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, NonFunctionalEvent.STEREOTYPE_NAME);
        return NonFunctionalEvent.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     *
     * @param obj a Class
     * @return a {@link NonFunctionalEvent} proxy or <i>null</i>.
     */
    public static NonFunctionalEvent instantiate(final Class obj) {
        return NonFunctionalEvent.canInstantiate(obj) ? new NonFunctionalEvent(obj) : null;
    }

    /**
     * Tries to instantiate a {@link NonFunctionalEvent} proxy from a {@link Class} stereotyped << NonFunctionalEvent >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     *
     * @param obj a {@link Class}
     * @return a {@link NonFunctionalEvent} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static NonFunctionalEvent safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (NonFunctionalEvent.canInstantiate(obj))
            return new NonFunctionalEvent(obj);
        else
            throw new IllegalArgumentException("NonFunctionalEvent: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        NonFunctionalEvent other = (NonFunctionalEvent) obj;
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
     * Getter for string property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getIsViolation() {
        return this.elt.getTagValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'isViolation'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setIsViolation(final String value) {
        this.elt.putTagValue(NonFunctionalEvent.MdaTypes.ISVIOLATION_TAGTYPE_ELT, value);
    }

    protected NonFunctionalEvent(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType ISVIOLATION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "af2fc032-7f83-4251-9a0c-8ef45959bb71");
            ISVIOLATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7adb963c-c7f7-4e56-9770-80f01813f2b5");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


static {
        if(CamelDesignerModule.getInstance() != null) {
            init(CamelDesignerModule.getInstance().getModuleContext());
        }
    }
    }

    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

}
