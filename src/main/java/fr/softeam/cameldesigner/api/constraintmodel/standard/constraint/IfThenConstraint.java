/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
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
    @objid ("7579815a-2d0e-4d06-ab94-255f5b8534a4")
    public static final String STEREOTYPE_NAME = "IfThenConstraint";

    /**
     * Tells whether a {@link IfThenConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << IfThenConstraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("f76268db-9c59-44ac-bb02-c3f516414100")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, IfThenConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << IfThenConstraint >> then instantiate a {@link IfThenConstraint} proxy.
     * 
     * @return a {@link IfThenConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("064a852b-cc27-4ab9-acc6-f0d38de3d52b")
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
    @objid ("f08c3577-3521-4ae7-a76c-532b35cf58db")
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
    @objid ("e897a49b-c55a-4d09-92d9-2b2bbce970fa")
    public static IfThenConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (IfThenConstraint.canInstantiate(obj))
        	return new IfThenConstraint(obj);
        else
        	throw new IllegalArgumentException("IfThenConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("10b610b2-24af-4778-82ec-d3529bb179ba")
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
    @objid ("2aa5926e-81a4-4662-8690-cf2608279baa")
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
    @objid ("adf4c8f5-084a-4255-aebe-7f0fb5756b8e")
    public CamelConstraint getElse() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "else")){
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                     return (IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                     return (LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName());
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
    @objid ("75298cf2-a90c-452e-890c-be5fdea7ef2f")
    public CamelConstraint getIf() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "if")){
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                     return (IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                     return (LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName());
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
    @objid ("8f7f7a0d-d8ed-40c2-948a-05fd9ee753b6")
    public CamelConstraint getThen() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(IfThenConstraint.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(IfThenConstraint.MdaTypes.MDAASSOCDEP_ROLE), "then")){
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                     return (IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                     return (LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("055a4e54-f9cd-4fcf-bf93-cc5fd0f41428")
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
    @objid ("79b6069e-a152-4627-a385-03014554984f")
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
    @objid ("86cd6c17-77f4-4fe5-a4b4-1fabb2427d59")
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
    @objid ("5537bcf4-61cf-40de-ad99-86c1e45f3592")
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

    @objid ("645ca936-eee6-41ba-b1be-6d65355622ee")
    protected IfThenConstraint(final Constraint elt) {
        super(elt);
    }

    @objid ("dbfb4897-53bf-4e5b-8030-02583cd948cf")
    public static final class MdaTypes {
        @objid ("e2ac6b6c-267b-4ffa-97c7-ecc1b6f06c25")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9840d1a7-debc-47e0-b5fd-3da8edfa4eb9")
        private static Stereotype MDAASSOCDEP;

        @objid ("413502cf-fd26-454a-b8f1-8b13751d1376")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2e35502f-6288-4425-8bb6-1efa9b465ceb")
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
