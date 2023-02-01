/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f3aa71cf-5995-41d5-9fb3-6065813f98a1")
=======
    @objid ("fc4ba228-993e-46e0-800e-8c7ee8ff0541")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CamelConstraint";

    /**
     * Tells whether a {@link CamelConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CamelConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("133e006d-5554-4b04-8554-671af74761e7")
=======
    @objid ("d3161707-be3f-4772-b48c-7a70686de41a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CamelConstraint.STEREOTYPE_NAME));
    }

    @objid ("395afa24-a150-43ea-934e-0ca230c1dbec")
    public static CamelConstraint instantiate(final Constraint obj) {
        return UnaryConstraint.canInstantiate(obj) ? UnaryConstraint.instantiate(obj) :
            CompositeConstraint.canInstantiate(obj) ? CompositeConstraint.instantiate(obj) : null;
    }

<<<<<<< HEAD
    @objid ("e8e01e73-e99f-4367-8dad-02c768b9f245")
=======
    @objid ("1d082004-950c-4834-9ec2-45aabe059352")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("845f8dae-d7d9-414c-98ee-4667c0c2e514")
=======
    @objid ("c16732e2-2be2-475f-877d-5b47a8e606d7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

<<<<<<< HEAD
    @objid ("c0ebb2d7-a0dd-4a22-81fa-94454ce1aa4f")
=======
    @objid ("40444cec-b0ea-433e-8e1d-9e25c66f803f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("cfa31877-021f-4bce-a5d2-c88c2cacde4e")
=======
    @objid ("199e4b3e-1f59-445b-b01b-1c9f4d18672f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CamelConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("c2b5b585-3d59-484d-8c6a-ed96326a9e5e")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("01c0c9a4-a45b-4248-b34e-8703544b0237")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ce6adca0-9f4c-407c-b07c-2faad024f2c8")
        private static Stereotype MDAASSOCDEP;

        @objid ("bebecd2d-005f-4687-a62d-313ef5bbaf35")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1cc0d9f6-4141-4964-9a1a-ae31bb46af0f")
=======
        @objid ("02be4f13-0957-4040-a48a-89088ecc4e7c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("51a90bde-91a2-4aa6-bfc8-e1aeb55c9861")
        private static Stereotype MDAASSOCDEP;

        @objid ("33bf2c15-f2f3-493b-9834-d7e3b65d53cf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f8f38a2-9913-4c59-b778-216ecdb5dc85")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
