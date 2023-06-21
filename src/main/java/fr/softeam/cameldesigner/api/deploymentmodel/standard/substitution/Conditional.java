/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.substitution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.CamelConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Substitution} with << Conditional >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53478e31-0914-4970-9b62-cff4eacbe194")
public class Conditional extends Feature {
    @objid ("e14db0e0-49ac-4272-951f-7ec3334efc7f")
    public static final String STEREOTYPE_NAME = "Conditional";

    /**
     * Tells whether a {@link Conditional proxy} can be instantiated from a {@link MObject} checking it is a {@link Substitution} stereotyped << Conditional >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a648e89e-ae19-443a-a898-5aea5db179ac")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Substitution) && ((Substitution) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Conditional.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Substitution} stereotyped << Conditional >> then instantiate a {@link Conditional} proxy.
     * 
     * @return a {@link Conditional} proxy on the created {@link Substitution}.
     */
    @objid ("39078eb0-78e6-48fb-95e4-5212d6563e7d")
    public static Conditional create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Substitution");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Conditional.STEREOTYPE_NAME);
        return Conditional.instantiate((Substitution)e);
    }

    /**
     * Tries to instantiate a {@link Conditional} proxy from a {@link Substitution} stereotyped << Conditional >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Substitution
     * @return a {@link Conditional} proxy or <i>null</i>.
     */
    @objid ("7c926c81-e143-4832-9385-5a5aa665f02f")
    public static Conditional instantiate(final Substitution obj) {
        return Conditional.canInstantiate(obj) ? new Conditional(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Conditional} proxy from a {@link Substitution} stereotyped << Conditional >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Substitution}
     * @return a {@link Conditional} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9e8f27e4-0bdc-4c2e-bc46-24040eb46de9")
    public static Conditional safeInstantiate(final Substitution obj) throws IllegalArgumentException {
        if (Conditional.canInstantiate(obj))
        	return new Conditional(obj);
        else
        	throw new IllegalArgumentException("Conditional: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("479af7a2-3fba-4319-983c-66b88c318a5c")
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
        Conditional other = (Conditional) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'constraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4fe81b72-f76e-495c-b80e-3d113850c385")
    public CamelConstraint getConstraint() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "constraint")){
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeConstraint.canInstantiate(d.getDependsOn()))
                     return (AttributeConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeConstraint.MdaTypes.STEREOTYPE_ELT.getName());
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
     * Get the underlying {@link Substitution}. 
     * @return the Substitution represented by this proxy, never null.
     */
    @objid ("46bcb64a-3177-4725-bdb5-714bf2d74f89")
    @Override
    public Substitution getElement() {
        return (Substitution)super.getElement();
    }

    /**
     * Get the value of the 'firstComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fdf399d7-e039-4327-9354-5f4abb37d83c")
    public SoftwareComponent getFirstComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "firstComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ProfilerComponent.canInstantiate(d.getDependsOn()))
                     return (ProfilerComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'secondComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("25120cb2-31ee-4210-87d7-007acb55dfa4")
    public SoftwareComponent getSecondComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "secondComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ProfilerComponent.canInstantiate(d.getDependsOn()))
                     return (ProfilerComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("21bcaf5c-6e7a-45f3-a2a4-1bb776fe28a4")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'constraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("436645eb-b1b4-4df5-8937-eed29d2376ad")
    public void setConstraint(final CamelConstraint obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "constraint")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Conditional.MdaTypes.MDAASSOCDEP);
              dep.setName("constraint");      dep.putTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE, "constraint");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'firstComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d3329693-90c0-456c-ae76-6758dc37c177")
    public void setFirstComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "firstComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Conditional.MdaTypes.MDAASSOCDEP);
              dep.setName("firstComponent");      dep.putTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE, "firstComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'secondComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9601586f-7fcb-45b3-9bae-52ff7d6a95ea")
    public void setSecondComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "secondComponent")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Conditional.MdaTypes.MDAASSOCDEP);
              dep.setName("secondComponent");      dep.putTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE, "secondComponent");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("0c1843ca-7fed-42dc-b2f5-42202e4a4daf")
    protected Conditional(final Substitution elt) {
        super(elt);
    }

    @objid ("2b6f2dbf-9ee6-42dd-b73f-eaf39dcb7323")
    public static final class MdaTypes {
        @objid ("b8d04fc1-e673-4dbf-9d50-b4410c3fc4b4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("37350ae3-426e-497d-a892-f770133d17c8")
        private static Stereotype MDAASSOCDEP;

        @objid ("948d3164-87e2-4860-9f73-de50c0a1bdaf")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b04660b-06c4-459c-a978-1c5da22c82f7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a9789ea2-f51f-4aec-af7f-8aebf9cb152e");
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
