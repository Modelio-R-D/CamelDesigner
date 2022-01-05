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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
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
 * Proxy class to handle a {@link Class} with << Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("ed542b23-7ad7-4ce4-949e-a6fe0cdecfac")
public abstract class Constraint extends NamedElement {
    @objid ("834b7600-40c5-464d-a848-215cf9e290b7")
    public static final String STEREOTYPE_NAME = "Constraint";

    @objid ("14ce496f-0be4-40b6-b34b-29eed16da20f")
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
        Constraint other = (Constraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("17af7b60-e990-4704-9f80-451aa1689412")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    @objid ("32c45e1b-4846-455c-a4b6-7f3a7462554a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b22dc824-8422-41ad-a975-a8a79bb432f1")
    protected Constraint(final Class elt) {
        super(elt);
    }

    @objid ("f003bf79-2822-4d48-bd14-f5ce0e242405")
    public static final class MdaTypes {
        @objid ("d54aa892-1d69-4a1b-a474-323d7ed55a63")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f618e805-6a4c-414d-990e-79c29f8618ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("ee5cb171-cdcb-42ec-bbe7-3492bc210f46")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1defcf47-603c-4a96-879e-662eaed42964")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a5e98614-6549-45e8-aba2-bc31c1fdd87d");
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
