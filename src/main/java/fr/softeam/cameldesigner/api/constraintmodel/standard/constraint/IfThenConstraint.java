/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.constraintmodel.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
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
 * Proxy class to handle a {@link Constraint} with << IfThenConstraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("66fa54e1-453d-44ab-9ee6-b00c38c52da5")
public class IfThenConstraint extends CompositeConstraint {
    @objid ("ba5427b9-0779-4d7c-b330-72a7b61d4086")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7b2e0ec8-519e-47a5-b4e7-1b00d6b17590")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("15895e06-5a3a-4377-b900-29f3dc25cb72")
    public static IfThenConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME);
        return IfThenConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link IfThenConstraint} proxy from a {@link Constraint} stereotyped << IfThenConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link IfThenConstraint} proxy or <i>null</i>.
     */
    @objid ("518b0e7e-68a2-4fdf-b6e2-dc0451d7e6e5")
    public static IfThenConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? new IfThenConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IfThenConstraint} proxy from a {@link Constraint} stereotyped << IfThenConstraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link IfThenConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("95fa5076-11f3-4d6f-8394-e122189b0f47")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
        	return new IfThenConstraint(obj);
        else
        	throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("07fbe300-e863-4f64-a066-34d7d2edf896")
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
        IfThenConstraint other = (IfThenConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("1e6b79af-9822-4a09-8c5a-50febe3318e3")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value to the 'else' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0fca66e3-d6d6-4915-90f0-cb1e14fffa3a")
    public CamelConstraint getElse() {
          for (Constraint obj : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(obj))
             return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Get the value to the 'if' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f30712fa-203b-4eef-bea6-153349caa95c")
    public CamelConstraint getIf() {
          for (Constraint obj : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(obj))
             return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
          }
          return null;
    }

    /**
     * Get the value to the 'then' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5ff64e53-848a-4615-a368-20f89899dd3d")
    public CamelConstraint getThen() {
          for (Constraint obj : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(obj))
             return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("46f668e4-6c29-42b2-87ad-b82ead1184f7")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'else' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3c9ea588-4d01-44be-9c27-2281a7b6c38e")
    public void setElse(final CamelConstraint obj) {
        // Remove existing CamelConstraints
        for (Constraint e : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the CamelConstraint
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    /**
     * Set the value of the 'if' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("38679a49-dafb-440e-8e72-635e75a39b76")
    public void setIf(final CamelConstraint obj) {
        // Remove existing CamelConstraints
        for (Constraint e : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the CamelConstraint
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    /**
     * Set the value of the 'then' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b3d0fdcc-3ff1-400e-bcb4-d372ca0f344e")
    public void setThen(final CamelConstraint obj) {
        // Remove existing CamelConstraints
        for (Constraint e : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(e)) {
               ((Constraint) this.elt).getConstrainedElement().remove(e);
           }
        }
        // Set the CamelConstraint
        if (obj != null) {
            ((Constraint) this.elt).getConstrainedElement().add(obj.getElement());
        }
    }

    @objid ("dc00018f-072a-4ed0-b1e6-a3218e3a4f4c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("804256f4-1e40-468f-a2e1-41fd90f62d93")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("0d1453b8-78c2-4b0e-a662-2b80386c9189")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0c2e6199-15a6-426b-8919-0ee5805df369")
        private static Stereotype MDAASSOCDEP;

        @objid ("48099f05-3ecb-4a52-a99d-0b4d809f83c4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bc941039-3798-4221-ab00-5382f5d398c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "da516708-1c56-443a-addc-f474b2e61c28");
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
