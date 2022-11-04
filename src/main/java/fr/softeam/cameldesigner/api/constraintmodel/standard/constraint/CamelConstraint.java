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
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.ExpendableElement;
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
public abstract class CamelConstraint extends ExpendableElement {
    @objid ("fc4ba228-993e-46e0-800e-8c7ee8ff0541")
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    /**
     * Tells whether a {@link CamelConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CamelConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d3161707-be3f-4772-b48c-7a70686de41a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelConstraint.STEREOTYPE_NAME));
    }

    @objid ("395afa24-a150-43ea-934e-0ca230c1dbec")
    public static CamelConstraint instantiate(final Constraint obj) {
        return UnaryConstraint.canInstantiate(obj) ? UnaryConstraint.instantiate(obj) :
            CompositeConstraint.canInstantiate(obj) ? CompositeConstraint.instantiate(obj) : null;
    }

    @objid ("1d082004-950c-4834-9ec2-45aabe059352")
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
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("c16732e2-2be2-475f-877d-5b47a8e606d7")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("40444cec-b0ea-433e-8e1d-9e25c66f803f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("199e4b3e-1f59-445b-b01b-1c9f4d18672f")
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
        @objid ("02be4f13-0957-4040-a48a-89088ecc4e7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("51a90bde-91a2-4aa6-bfc8-e1aeb55c9861")
        private static Stereotype MDAASSOCDEP;

        @objid ("33bf2c15-f2f3-493b-9834-d7e3b65d53cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f8f38a2-9913-4c59-b778-216ecdb5dc85")
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
