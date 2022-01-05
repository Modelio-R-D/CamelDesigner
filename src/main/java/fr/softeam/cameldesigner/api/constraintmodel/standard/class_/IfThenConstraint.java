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
 * Proxy class to handle a {@link Class} with << IfThenConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d0a8f919-e01f-4ba4-be31-9ef03339f1ee")
public class IfThenConstraint extends CompositeConstraint {
    @objid ("6a373091-89f2-4d52-8c04-1cff21973b84")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("7e505972-34ed-48ff-8e6a-1be209347ac9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Class}.
     */
    @objid ("547c6c22-41b5-448d-a9b7-fc5c3e637621")
    public static IfThenConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME);
        return IfThenConstraint.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link IfThenConstraint} proxy from a {@link Class} stereotyped << IfThenConstraint >>checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link IfThenConstraint} proxy or <i>null</i>.
     */
    @objid ("1181ba20-3eec-40ac-9bd4-3560333bcd05")
    public static IfThenConstraint instantiate(final Class obj) {
        return IfThenConstraint.canInstantiate(obj) ? new IfThenConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IfThenConstraint} proxy from a {@link Class} stereotyped << IfThenConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link IfThenConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e7a47093-b41b-4c23-8c9e-d8d8f68a9bf0")
    public static IfThenConstraint safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
            return new IfThenConstraint(obj);
        else
            throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("730adda0-4bd1-4b93-a580-d828588d2396")
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
        IfThenConstraint other = (IfThenConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("db36e718-07ea-4c72-8a7a-732fd98be18f")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("90b19563-3bde-42ab-8ae3-d8346bbbd504")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("2d29ff7f-d6c7-4f33-af8d-a46ae56ccea9")
    protected IfThenConstraint(final Class elt) {
        super(elt);
    }

    @objid ("a3d77716-a2d0-4c6d-9be4-0532e6eb7551")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("dd69dd26-0435-4809-b17c-38ef68420b62")
    public static final class MdaTypes {
        @objid ("c5ad11f9-49a9-431d-8807-7fe0dfb1acd8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9887f7ec-3a9e-45ec-97fd-291ab35ea1bf")
        private static Stereotype MDAASSOCDEP;

        @objid ("e64a0c36-3101-49e4-bb50-35be2e391ab6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("06afd25d-128e-4813-8fe3-167c46137f03")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "546741e3-12bd-4bd8-b061-e514ad49b371");
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
