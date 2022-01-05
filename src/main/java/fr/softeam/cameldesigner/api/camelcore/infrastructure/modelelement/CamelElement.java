/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.Collections;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
<<<<<<< HEAD
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
=======
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
<<<<<<< HEAD
=======
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << CamelElement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e19016d0-0edb-4a41-bbf9-7506c03fcd5e")
public abstract class CamelElement {
    @objid ("aa9c58a1-6a27-4908-92c1-675d37f99134")
    public static final String STEREOTYPE_NAME = "CamelElement";

    /**
     * The underlying {@link ModelElement} represented by this proxy, never null.
     */
    @objid ("c9955717-bd25-4330-81ff-29e158ac56ba")
    protected final ModelElement elt;

    @objid ("ea79a648-0c91-450a-95c7-596104855f12")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) &&
                ((NamedElement.canInstantiate(elt)) ||
                        (PropertyDependency.canInstantiate(elt)) ||
                        (Annotation.canInstantiate(elt))));
    }

    @objid ("a4e4903c-fa45-457b-abd6-85a6ac790ea3")
    public static CamelElement instantiate(final ModelElement obj) {
        return NamedElement.canInstantiate(obj) ? NamedElement.instantiate(obj) :
            PropertyDependency.canInstantiate(obj) ? PropertyDependency.instantiate((Dependency)obj) :
                Annotation.canInstantiate(obj) ? Annotation.instantiate((Dependency)obj) : null;
    }

    @objid ("3a73797c-b872-4ee9-83e6-e1fcea8ab5f8")
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
        CamelElement other = (CamelElement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}.
     * 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("c3869156-3cb5-440f-a370-f007e77b90cd")
    public ModelElement getElement() {
        return this.elt;
    }

    @objid ("b98216f4-313f-4ea3-b26c-cc4df4bec133")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("030a2c20-cdf9-4226-a2af-5a26b172d361")
<<<<<<< HEAD
    public List<CamelElement> getChilds() {
        return new ArrayList<>();
    }
=======
    public abstract List<CamelElement> getChilds();
>>>>>>> e429ba8cf675faca5e300c08c52247687d794213

    @objid ("cb36ad31-a1d7-4502-99a3-e772c2e328e4")
    protected CamelElement(final ModelElement elt) {
        this.elt = elt;
    }

    @objid ("1755d7a2-ba56-47fd-b0d2-652ed674f106")
    public static final class MdaTypes {
        @objid ("1e825a99-4239-45c8-bd3b-ab225230a82f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4f573d70-80c5-4407-9157-437cddba4f05")
        private static Stereotype MDAASSOCDEP;

        @objid ("13c57276-c7ee-4327-84ef-0f46343d7862")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd8d9aa8-8dd8-45a6-bc6b-475d83dfa1dd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "9aef4bd8-fa92-4231-9295-3eb5a619ceab");
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
