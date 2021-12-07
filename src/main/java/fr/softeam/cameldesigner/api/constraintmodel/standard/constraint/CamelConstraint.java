/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

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
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << CamelConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fee51019-906e-4485-9a50-f01a00d74979")
public abstract class CamelConstraint extends NamedElement {
    @objid ("b68a1a93-c3a8-4359-9d16-5fafc541bade")
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    @objid ("e3f495df-1eec-4b69-bc4f-60d065c82041")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && (
               (UnaryConstraint.canInstantiate(elt))
               || (CompositeConstraint.canInstantiate(elt))));
    }

    @objid ("ef8959b5-9ea2-40f7-9175-ba14fdf708fc")
    public static CamelConstraint instantiate(final Constraint obj) {
        return UnaryConstraint.canInstantiate(obj) ? UnaryConstraint.instantiate(obj) :
            CompositeConstraint.canInstantiate(obj) ? CompositeConstraint.instantiate(obj) : null;
    }

    @objid ("ba69c7bf-a78e-421d-b069-2018b78a3d73")
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
        CamelConstraint other = (CamelConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}.
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("3a347e73-0e73-4a57-952d-427be57390a7")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("1685423a-ee3e-4c0d-9f6b-b00d491ee44f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c69f3e2d-b9f8-4044-8aea-849ee51704f7")
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
        @objid ("50f29066-ac4c-4801-a6e5-bdd4562054b6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ada4c9fe-b580-4484-9603-03ab658c5bd5")
        private static Stereotype MDAASSOCDEP;

        @objid ("de408752-d0f1-44f4-9bb7-14a3aa7bb47e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6a3ef63b-0a68-4d04-81cf-6187d6822b46")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4afa0df7-c748-4db8-b9a7-a082a8419c00");
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
