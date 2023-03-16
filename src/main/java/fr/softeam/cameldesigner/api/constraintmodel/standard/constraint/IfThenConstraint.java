/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("840e15c2-318f-410f-bb9f-f381dc050b83")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f8ff3a41-cd9b-4a1a-bba9-57c41a11b168")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("5366af86-4bab-4127-829c-141edfef59cf")
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
    @objid ("78c63d15-b10a-45c8-9ab5-0edfca720272")
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
    @objid ("b8f14751-0a37-4d06-bf0c-cc45402fd83b")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
        	return new IfThenConstraint(obj);
        else
        	throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("99bb03bd-6cab-40b2-992e-ceae01d50799")
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
    @objid ("b69a43b9-efdc-46aa-a0ea-a148378584b5")
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
    @objid ("c97365eb-e5c6-4624-8b05-b380d6eda67f")
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
    @objid ("cbc96935-696e-46fd-829a-996292f6cfbd")
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
    @objid ("74345f0a-53cc-4cd4-ae41-ac658e353fe9")
    public CamelConstraint getThen() {
          for (Constraint obj : ((Constraint) this.elt).getConstrainedElement(Constraint.class)) {
           if (CamelConstraint.canInstantiate(obj))
             return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
          }
          return null;
    }

    @objid ("f26475b3-7512-4d3e-9d2d-2a79a2bb4b74")
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
    @objid ("3213a93f-2c4f-4339-81cc-a4731fff12e5")
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
    @objid ("a4f43713-1e8b-4ab8-a60d-ad1638da5092")
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
    @objid ("adba5d74-f44a-42d5-9183-6d06f0f4b6a5")
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

    @objid ("512ad842-9469-43e4-b213-32f7975a7f52")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("9966def1-5fb7-474a-913c-5884d698e4af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("272d35dd-b6f8-4185-ae80-8ab605d0f341")
        private static Stereotype MDAASSOCDEP;

        @objid ("dd2c4eb6-2376-4f26-9077-c59a4d74fbd9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("299c81ba-d70e-4c14-9ed9-895b59e395aa")
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
