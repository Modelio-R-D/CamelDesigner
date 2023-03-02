/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 2/7/23 11:59 AM by Modelio Studio.
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
    @objid ("b2f73ece-c2af-4bf6-8dcc-94ca601213ec")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9915d782-cf6c-4f78-a906-c31a0f10e4ad")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("932d62fd-c82d-4753-864e-ae924736fa4b")
    public static IfThenConstraint create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME);
        return IfThenConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link IfThenConstraint} proxy from a {@link Constraint} stereotyped << IfThenConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Constraint
     * @return a {@link IfThenConstraint} proxy or <i>null</i>.
     */
    @objid ("ff4aa163-c2b1-4e98-a6a0-a2cd2fd1c7e3")
    public static IfThenConstraint instantiate(final Constraint obj) {
        return IfThenConstraint.canInstantiate(obj) ? new IfThenConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link IfThenConstraint} proxy from a {@link Constraint} stereotyped << IfThenConstraint >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Constraint}
     * @return a {@link IfThenConstraint} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("534815c7-b69b-4e42-a5db-a51f4e9c9321")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
            return new IfThenConstraint(obj);
        else
            throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e93e9aa3-b732-4f85-b23c-921b3af25f54")
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
     * 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("e7e53c93-f89f-496e-86e8-12c95d3920b3")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("eeadec30-ad0c-4dc4-bc7e-d1fba0c9594b")
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
     * Get the value of the 'else' role.<p>
     * Role description:
     * null
     */
    @objid ("642f20e6-2fdb-4fcf-8996-b93742405e0f")
    public CamelConstraint getElse() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "elseConstraint")
              && CamelConstraint.canInstantiate(d.getImpacted())) {
                  return (CamelConstraint)CamelDesignerProxyFactory.instantiate(d.getImpacted(), CamelConstraint.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the value of the 'if' role.<p>
     * Role description:
     * null
     */
    @objid ("fc510d2c-61b4-418b-bf9e-3a47b660aff0")
    public CamelConstraint getIf() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "ifConstraint")
              && CamelConstraint.canInstantiate(d.getImpacted())) {
                  return (CamelConstraint)CamelDesignerProxyFactory.instantiate(d.getImpacted(), CamelConstraint.MdaTypes.STEREOTYPE_ELT.getName());
          }
        }
        return null;
    }

    /**
     * Get the value of the 'then' role.<p>
     * Role description:
     * null
     */
    @objid ("3305c973-87a8-48d6-9a40-aab252a6a3ff")
    public CamelConstraint getThen() {
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "thenConstraint")
              && CamelConstraint.canInstantiate(d.getImpacted())) {
                  return (CamelConstraint)CamelDesignerProxyFactory.instantiate(d.getImpacted(), CamelConstraint.MdaTypes.STEREOTYPE_ELT.getName());
          }
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
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "elseConstraint")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, IfThenConstraint.MdaTypes.MDAASSOCDEP);
              dep.setName("elseConstraint");
              dep.putTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE, "elseConstraint");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    /**
     * Set the value of the 'if' role.<p>
     * Role description:
     * null
     */
    @objid ("aa8d6c66-9c41-4636-ae80-94360d28be36")
    public void setIf(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "ifConstraint")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, IfThenConstraint.MdaTypes.MDAASSOCDEP);
              dep.setName("ifConstraint");
              dep.putTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE, "ifConstraint");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    /**
     * Set the value of the 'then' role.<p>
     * Role description:
     * null
     */
    @objid ("0e4b96d3-2c9c-416b-a751-76c52884ab4e")
    public void setThen(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getImpactedDependency())
          if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "thenConstraint")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if (dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(obj.getElement(), this.elt, IfThenConstraint.MdaTypes.MDAASSOCDEP);
              dep.setName("thenConstraint");
              dep.putTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE, "thenConstraint");
          }
          dep.setImpacted(obj.getElement());
        }
    }

    @objid ("6b45d084-6850-47af-909a-94e5f9a08051")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("844b15bb-7cac-4f75-8ad0-8e12e723df78")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0b321766-3527-4f72-8e97-0920350cbd10")
        private static Stereotype MDAASSOCDEP;

        @objid ("8ff42078-6804-4e2d-83a4-31fbc8b5da14")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("87fe15e1-968f-496c-bcc3-ff9268210174")
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
