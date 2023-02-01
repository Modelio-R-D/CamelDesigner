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
<<<<<<< HEAD
    @objid ("64e0d4af-1f4e-44e3-83aa-33119d85ccfc")
=======
    @objid ("877eea29-21a6-4cca-9fe3-2ba9fc6b461f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "CompositeConstraint";

    /**
     * Tells whether a {@link CompositeConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << CompositeConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("01a92ef2-063b-441e-b388-6e05133cb0d1")
=======
    @objid ("7ecf58cf-6c6e-460e-895f-b9fdce2318f4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CompositeConstraint.STEREOTYPE_NAME));
    }

    @objid ("0c7f50b9-cec7-42d1-8479-a33d22ab05e8")
    public static CompositeConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? IfThenConstraint.instantiate(obj) :
            LogicalConstraint.canInstantiate(obj) ? LogicalConstraint.instantiate(obj) : null;
    }

<<<<<<< HEAD
    @objid ("95cda937-2434-468e-bc85-c04857d4347f")
=======
    @objid ("5d02d730-5bbd-49a9-9c6c-797c55496d48")
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
        CompositeConstraint other = (CompositeConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("44f95c97-e1ee-4ae7-ac13-d49e4b1caee3")
=======
    @objid ("12120731-cf08-4b0d-8efb-7337c47f5653")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

<<<<<<< HEAD
    @objid ("8c25df37-0b53-4c70-b305-0a6bde48af45")
=======
    @objid ("f04d2bae-9d1c-4152-9f01-210ac33986a6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

<<<<<<< HEAD
    @objid ("e0c567c6-fe13-423d-bb0b-6e9a9920864d")
=======
    @objid ("f6aeec38-6545-44b7-9204-21441092a980")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CompositeConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("16d6b202-8190-4fdc-ad51-7afb89d0af01")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("4995fa0f-5707-4331-af9b-deaeab0f4965")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9fb771fa-9819-4b74-87a1-c9b4e6536adc")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb377cac-0278-4afe-8913-f99bf7b4e452")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6adff5df-8289-4127-a26a-fb962337f591")
=======
        @objid ("0d6597fc-8be5-4598-9121-657afc826902")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a3b8065b-565b-4ce8-b88c-f086dda54bc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("06f5e30d-74d4-4806-a2da-36e44717e9c9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d215a6e7-2c5b-496c-89d7-d8d61b1f6d84")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
