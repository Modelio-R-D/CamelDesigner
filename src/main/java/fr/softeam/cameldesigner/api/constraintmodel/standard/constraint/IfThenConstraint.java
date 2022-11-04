/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("60ed5e7a-89d1-460c-a76f-4cd2a2cdb15c")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e6223161-4fa6-4d52-ab82-cb105d2bfc69")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("1c8427e8-3c47-446a-b6f0-301d8e00ccce")
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
    @objid ("8cda9102-53f6-4170-85ab-3240b4b77297")
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
    @objid ("858a9d7c-e955-4f7f-96b3-012cf069c1b7")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
        	return new IfThenConstraint(obj);
        else
        	throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("79742083-ce70-4549-82d2-8af68c3fa3c1")
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
    @objid ("da52a320-bba8-47a2-b274-2547cb3022c2")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("356401e7-9a03-4364-81b7-894c8be70da8")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("dc00018f-072a-4ed0-b1e6-a3218e3a4f4c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    /**
     * Get the value to the 'else' role.<p>
     * Role description:
     * null
     */
    @objid ("642f20e6-2fdb-4fcf-8996-b93742405e0f")
    public CamelConstraint getElse() {
        for (Constraint obj : ((Constraint) this.elt).getConstraintDefinition(Constraint.class)) {
         if (CamelConstraint.canInstantiate(obj))
           return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("fc510d2c-61b4-418b-bf9e-3a47b660aff0")
    public CamelConstraint getIf() {
        for (Constraint obj : ((Constraint) this.elt).getConstraintDefinition(Constraint.class)) {
         if (CamelConstraint.canInstantiate(obj))
           return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
        }
        return null;
    }

    @objid ("3305c973-87a8-48d6-9a40-aab252a6a3ff")
    public CamelConstraint getThen() {
        for (Constraint obj : ((Constraint) this.elt).getConstraintDefinition(Constraint.class)) {
         if (CamelConstraint.canInstantiate(obj))
           return (CamelConstraint)CamelDesignerProxyFactory.instantiate(obj, CamelConstraint.STEREOTYPE_NAME);
        }
        return null;
    }

    /**
     * Set the value of the 'else' role.<p>
     * Role description:
     * null
     */
    @objid ("7b80e99e-cd20-4629-81cd-7e3c8e8e1e64")
    public void setElse(final CamelConstraint obj) {
        // Remove existing CamelConstraints
        for (Constraint e : ((Constraint) this.elt).getConstraintDefinition(Constraint.class)) {
           if (CamelConstraint.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the CamelConstraint
        if (obj != null) {
            ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
        }
    }

    @objid ("aa8d6c66-9c41-4636-ae80-94360d28be36")
    public void setIf(final CamelConstraint obj) {
        // Remove existing CamelConstraints
        for (Constraint e : ((Constraint) this.elt).getConstraintDefinition(Constraint.class)) {
           if (CamelConstraint.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the CamelConstraint
        if (obj != null) {
            ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
        }
    }

    @objid ("0e4b96d3-2c9c-416b-a751-76c52884ab4e")
    public void setThen(final CamelConstraint obj) {
        // Remove existing CamelConstraints
        for (Constraint e : ((Constraint) this.elt).getConstraintDefinition(Constraint.class)) {
           if (CamelConstraint.canInstantiate(e)) {
               e.delete();
           }
        }
        // Set the CamelConstraint
        if (obj != null) {
            ((Constraint) this.elt).getConstraintDefinition().add(obj.getElement());
        }
    }

    @objid ("6d49258f-b77e-4700-a84d-71bb20fcd752")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("6601c5e8-8a38-48d5-9240-cd57b8ce77ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cd75eee7-f4bf-4d8a-b2c1-294ccfe7e84b")
        private static Stereotype MDAASSOCDEP;

        @objid ("aca3d6e1-cd15-49e5-b84a-1470adc20d47")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0fdb3713-1c26-4479-af4b-a06a9867324b")
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
