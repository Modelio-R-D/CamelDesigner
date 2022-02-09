/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("87dfc63c-7841-4e08-bac9-546a421600ad")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a19f060f-5006-422b-820a-1704f36254a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("fb81f058-5fad-456e-8c5e-874b9e02363d")
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
    @objid ("9a29fb8b-9956-4b1b-a361-d340f3de10cd")
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
    @objid ("32450b8b-7b1d-4b56-a2e0-a99f6ca23670")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
        	return new IfThenConstraint(obj);
        else
        	throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8a09093c-8a0a-40fe-8b77-b7cff7a86eee")
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
    @objid ("7ee284ef-e90f-4b82-a3b0-1a3c6fd5e99b")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value of the 'else' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("abdfc80a-b555-49b1-bed2-17d56d8a8ef8")
    public CamelConstraint getElse() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "else")
                  && CamelConstraint.canInstantiate(d.getDependsOn())) {
                     return (CamelConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelConstraint.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'if' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("63bc2f51-378a-4a4c-bc46-2242e716f00c")
    public CamelConstraint getIf() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "if")
                  && CamelConstraint.canInstantiate(d.getDependsOn())) {
                     return (CamelConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelConstraint.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'then' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("aad689f7-1a69-4f1c-a8b5-87c559e0192a")
    public CamelConstraint getThen() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "then")
                  && CamelConstraint.canInstantiate(d.getDependsOn())) {
                     return (CamelConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelConstraint.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("0b22e753-262b-4851-b99d-5b9dad3b121a")
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
    @objid ("f8267563-80d3-4f4e-930f-4ba60a823f74")
    public void setElse(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "else")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), IfThenConstraint.MdaTypes.MDAASSOCDEP);
              dep.setName("else");      dep.putTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE, "else");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'if' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd69239b-6def-4fa1-a398-04fc978c6d8f")
    public void setIf(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "if")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), IfThenConstraint.MdaTypes.MDAASSOCDEP);
              dep.setName("if");      dep.putTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE, "if");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'then' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bff8948d-78a0-48e9-8f6a-f308b580574b")
    public void setThen(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "then")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), IfThenConstraint.MdaTypes.MDAASSOCDEP);
              dep.setName("then");      dep.putTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE, "then");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("dc00018f-072a-4ed0-b1e6-a3218e3a4f4c")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("73273636-3826-4e26-80e3-f1ce86b271f8")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("beb9f833-8331-4689-89c4-de5eeb986b6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2eca29f5-abc5-4981-a121-a4910272bfd1")
        private static Stereotype MDAASSOCDEP;

        @objid ("29e244a1-c94d-4ac8-bde7-0c954ce856d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4ba4661e-57a4-4805-8c44-2da39928a8af")
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
