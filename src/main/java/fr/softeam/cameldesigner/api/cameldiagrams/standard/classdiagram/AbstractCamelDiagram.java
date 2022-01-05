/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.01

 * This file was generated on 2/12/21 4:24 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;

/**
 * Proxy class to handle a {@link ClassDiagram} with << AbstractCamelDiagram >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ed12f37e-1d2f-41e8-bb81-5164e8022f6c")
public abstract class AbstractCamelDiagram extends NamedElement {
    @objid ("9c352e03-1836-4117-9cb4-cde808ea94da")
    public static final String STEREOTYPE_NAME = "AbstractCamelDiagram";

//    /**
//     * The underlying {@link ClassDiagram} represented by this proxy, never null.
//     */
//    protected final ClassDiagram elt;
    @objid ("44231d1d-60c6-4993-acef-ee030cf98016")
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
        AbstractCamelDiagram other = (AbstractCamelDiagram) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ClassDiagram}.
     * 
     * @return the ClassDiagram represented by this proxy, never null.
     */
    @objid ("9e7a5d07-8f4d-45fc-bebd-696772dd08d7")
    public ClassDiagram getElement() {
        return (ClassDiagram) this.elt;
    }

    @objid ("15c4e566-ef15-44cf-9810-7726b2a95136")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3e36bdd7-1835-4b62-a8cd-1ddd094c1a0f")
    protected AbstractCamelDiagram(final ClassDiagram elt) {
        super(elt);
    }

    @objid ("b6237089-6b85-4539-a59e-d014bf0fd526")
    public static final class MdaTypes {
        @objid ("fd95c6fc-44de-4d4b-9457-2e5797fdaf51")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c6ef3aaf-9783-485a-ad50-1bfdfca8e13d")
        private static Stereotype MDAASSOCDEP;

        @objid ("3f707406-a2a2-4753-b284-249021820079")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5a37137-f163-4808-979a-58836e2c2889")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c147d6d3-8bd0-4b94-a9d6-164a947fa0b4");
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
