/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.03

 * This file was generated on 3/29/21 4:01 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link ModelElement} with << CamelAttribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("95142f12-2b2c-454b-909a-53110f0aaecc")
public abstract class CamelAttribute extends NamedElement {
    @objid ("b51f3241-e5df-4f47-a9b3-d64b7a1372df")
    public static final String STEREOTYPE_NAME = "CamelAttribute";

    @objid ("89935271-b7f1-47a0-9c06-f5b4e7cfe136")
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
        CamelAttribute other = (CamelAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("cd4aa82c-8cab-43a3-8ec3-54a1a4d591b8")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("6f343603-e2fa-4e01-a2dc-8c21f418c816")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d639a139-0830-40f9-b4b0-d42610a45157")
    protected CamelAttribute(final ModelElement elt) {
        super(elt);
    }

    @objid ("b2b5f006-86dd-4eba-8d2f-bb3d0fc4f4f7")
    public static final class MdaTypes {
        @objid ("f71d95e3-ceb2-4f01-a27e-d7d16069c08c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1f32f612-bf43-4d71-916d-12d24971d740")
        private static Stereotype MDAASSOCDEP;

        @objid ("c40d97c2-6d07-40ed-aea2-938744fbc0e7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5efddeb-c8ba-445e-864b-2b7115550a70")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "342512a5-ad9b-48b8-a454-5fd44237b8f2");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


        static {
            if(CamelDesignerModule.getInstance() != null) {
                init(CamelDesignerModule.getInstance().getModuleContext());
            }
        }
    }

    public abstract String getValue();

    public abstract void setValue(String value);
}
