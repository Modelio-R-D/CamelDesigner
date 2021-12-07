/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.0.10

 * This file was generated on 7/24/20 11:19 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
 * Proxy class to handle a {@link Class} with << CompositeConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b41e6795-2e68-4037-a5e9-f7f9fbda7070")
public abstract class CompositeConstraint extends Constraint {
    @objid ("321c6f93-e0c0-45a1-8b40-73ff8bf76b22")
    public static final String STEREOTYPE_NAME = "CompositeConstraint";

    @objid ("3c42e46c-002b-48e6-9c05-2a793db7d05f")
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
        CompositeConstraint other = (CompositeConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("94b1d071-31b4-4865-8255-188452e490fd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("3a3098db-7716-48c0-9630-2b91d624dc6a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("46d4c149-7e8f-4aa8-b009-f6605e4d68e9")
    protected CompositeConstraint(final Class elt) {
        super(elt);
    }

    @objid ("ef9542c9-97c8-4e3d-8136-63d7f62f5efd")
    public static final class MdaTypes {
        @objid ("7f182860-ce3d-4491-998c-1cc43537e74f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4357775e-0ef9-4e79-b720-8cbc13ba3264")
        private static Stereotype MDAASSOCDEP;

        @objid ("adbc1d66-aff2-4dc9-b654-73ad487568f8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("12365a69-96c6-4c30-9dc6-11014752c07d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a4bfd826-527d-460b-9742-7331226404d3");
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
