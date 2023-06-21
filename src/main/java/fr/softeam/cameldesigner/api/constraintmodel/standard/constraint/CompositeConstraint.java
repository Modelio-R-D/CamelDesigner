/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("ba415998-8035-4a52-b480-0a0ef7488790")
    public static final String STEREOTYPE_NAME = "CompositeConstraint";

    /**
     * Tells whether a {@link CompositeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CompositeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c0418967-f1ff-4010-be4f-052a3dffda82")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeConstraint.STEREOTYPE_NAME));
    }

    @objid ("0c7f50b9-cec7-42d1-8479-a33d22ab05e8")
    public static CompositeConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? IfThenConstraint.instantiate(obj) :
            LogicalConstraint.canInstantiate(obj) ? LogicalConstraint.instantiate(obj) : null;
    }

    @objid ("6be12310-0522-4e25-a61f-534b9fc89ce6")
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
    @objid ("24929339-150b-4264-9b1f-f13825a78c69")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("e0d05e7d-8471-4f79-9926-d2d2ad390060")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("fc6b8f0b-afbe-444a-8591-700fb0878b9d")
    protected CompositeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("16d6b202-8190-4fdc-ad51-7afb89d0af01")
    public static final class MdaTypes {
        @objid ("11073406-4049-42b0-a0a6-73e7c4ee8f5a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f38a145-b7c2-49a5-82dd-5df1e11753f4")
        private static Stereotype MDAASSOCDEP;

        @objid ("c30ea902-0965-4bc1-93c1-2e579dcdd484")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2273918e-4d51-43f3-96f6-526eb31995f0")
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
