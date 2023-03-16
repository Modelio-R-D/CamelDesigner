/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

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
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << CompositeConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("bf982af0-30cc-42f7-934c-17e02bb00b58")
public abstract class CompositeConstraint extends CamelConstraint {
    @objid ("3e5b342d-c538-4afa-974b-74dd5f49b705")
    public static final String STEREOTYPE_NAME = "CompositeConstraint";

    /**
     * Tells whether a {@link CompositeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CompositeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c9e2940f-3826-4d70-bbbf-e0d3498195ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeConstraint.STEREOTYPE_NAME));
    }

    @objid ("0c7f50b9-cec7-42d1-8479-a33d22ab05e8")
    public static CompositeConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? IfThenConstraint.instantiate(obj) :
            LogicalConstraint.canInstantiate(obj) ? LogicalConstraint.instantiate(obj) : null;
    }

    @objid ("ea3cd4b2-f85f-4866-b7a7-b94db63ee454")
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
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("6bae246a-3ae1-4fd6-9719-31af0aacc263")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("a7132c34-fcf5-4d9f-ad30-185bafb0355f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("b8cfb5bc-49aa-48b2-aedb-708e0f757383")
    protected CompositeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("16d6b202-8190-4fdc-ad51-7afb89d0af01")
    public static final class MdaTypes {
        @objid ("9a6bed22-49f0-477c-a749-30cfc15127f2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03343b2a-accf-4fa9-877c-4b7e7d2e2197")
        private static Stereotype MDAASSOCDEP;

        @objid ("0bb6dc9d-fd56-450d-ae42-9099402cd6fd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2a438784-7a30-43a6-89a7-607dda4dcd15")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "95f69da8-e7d7-494b-90a7-db1618fa56fc");
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
