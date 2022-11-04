/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("877eea29-21a6-4cca-9fe3-2ba9fc6b461f")
    public static final String STEREOTYPE_NAME = "CompositeConstraint";

    /**
     * Tells whether a {@link CompositeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CompositeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7ecf58cf-6c6e-460e-895f-b9fdce2318f4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeConstraint.STEREOTYPE_NAME));
    }

    @objid ("0c7f50b9-cec7-42d1-8479-a33d22ab05e8")
    public static CompositeConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? IfThenConstraint.instantiate(obj) :
            LogicalConstraint.canInstantiate(obj) ? LogicalConstraint.instantiate(obj) : null;
    }

    @objid ("5d02d730-5bbd-49a9-9c6c-797c55496d48")
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
    @objid ("12120731-cf08-4b0d-8efb-7337c47f5653")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("f04d2bae-9d1c-4152-9f01-210ac33986a6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("f6aeec38-6545-44b7-9204-21441092a980")
    protected CompositeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("16d6b202-8190-4fdc-ad51-7afb89d0af01")
    public static final class MdaTypes {
        @objid ("0d6597fc-8be5-4598-9121-657afc826902")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3b8065b-565b-4ce8-b88c-f086dda54bc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("06f5e30d-74d4-4806-a2da-36e44717e9c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d215a6e7-2c5b-496c-89d7-d8d61b1f6d84")
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
