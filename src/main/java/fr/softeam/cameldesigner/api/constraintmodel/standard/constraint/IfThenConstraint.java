/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("d55aa9ee-f549-4cad-88eb-e533bd6d220c")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9bf529b1-801e-46c8-9094-8639a287f397")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("0cc0ce4a-3885-4c71-b957-934bdcc1591c")
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
    @objid ("07e03d91-37c2-44fa-bc39-b2a1d1326595")
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
    @objid ("08613cca-79e4-40e3-befc-14ce9df4bfdb")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
        	return new IfThenConstraint(obj);
        else
        	throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a5c561a7-bb47-44ea-b486-9ee2f3c1beb3")
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
    @objid ("e2693a8e-e51f-4277-a7a4-2ce807ae1a49")
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
    @objid ("0eb61553-5bac-475b-b128-b1bd2dcd5962")
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
    @objid ("3fdffdb2-0f30-4160-aa53-6ddda079aab1")
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
    @objid ("f4bf91f7-2045-4db9-894b-b4529d72d741")
    public CamelConstraint getThen() {
          for (Constraint obj : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(obj))
             return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("31da48d3-551c-47ea-9f6e-f413b68da3e0")
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
    @objid ("39770e00-1415-4a31-ab0d-18e16ce6635a")
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
    @objid ("05cac7be-d98f-4b6f-9437-06a6b7b527be")
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
    @objid ("42f9108e-945a-42af-910c-3e23e870347b")
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

    @objid ("7e9aa94e-d863-4fe5-8736-e39aa83a0464")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("6cb683c3-a977-4d29-810d-afef15468c1b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3e0473b9-b0c4-4bff-b0a4-76a4cd8edb4f")
        private static Stereotype MDAASSOCDEP;

        @objid ("5607550f-138a-4844-9fcb-2dabba2173d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e46ab858-4069-443c-adf4-12d969cfac82")
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
