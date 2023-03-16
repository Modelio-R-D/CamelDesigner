/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
@objid ("2cf05ec1-353b-44b5-92fc-db3ca6558f81")
public class Conditional extends Feature {
    @objid ("b33d5c29-3307-43a6-a4dd-54236ce098be")
    public static final String STEREOTYPE_NAME = "Conditional";

    /**
     * Tells whether a {@link Conditional proxy} can be instantiated from a {@link MObject} checking it is a {@link Substitution} stereotyped << Conditional >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9a09f810-610e-4424-8737-865deccde9b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Substitution) && ((Substitution) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Conditional.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Substitution} stereotyped << Conditional >> then instantiate a {@link Conditional} proxy.
     * 
     * @return a {@link Conditional} proxy on the created {@link Substitution}.
     */
    @objid ("d62d0e15-a152-4fcc-903e-da7df2e9bc89")
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
    @objid ("9ba386d7-d947-4183-b583-b559f3ce22ef")
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
    @objid ("24039628-e41a-4054-9d97-8a8b9c0f868f")
    public static Conditional safeInstantiate(final Substitution obj) throws IllegalArgumentException {
        if (Conditional.canInstantiate(obj))
        	return new Conditional(obj);
        else
        	throw new IllegalArgumentException("Conditional: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("32d78ad3-b278-4376-8a69-a86b1c5234ee")
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
    @objid ("168377d2-7170-4818-9ace-1320dd0895cd")
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
    @objid ("ac6af798-7d36-44a4-bc1f-ccb6fbbc874e")
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
    @objid ("64469ca6-cab4-450b-82df-d6787a1f3667")
    public SoftwareComponent getFirstComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "firstComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
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
    @objid ("41085fed-5265-4ae9-b71b-8fccd3ba3429")
    public SoftwareComponent getSecondComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "secondComponent")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("2c8fe545-0656-4c8f-a068-4f7554aff556")
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
    @objid ("9f2b46c9-b05b-4b0d-9dcd-130472d2b8ec")
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
    @objid ("5205420b-49ac-4e7a-bc7f-669ee5bf647a")
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
    @objid ("bc1be119-8e21-4e90-a0bb-9acaa3bbccb8")
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

    @objid ("2a96bbc7-193a-4dd0-a0fe-ce957357fe0b")
    protected Conditional(final Substitution elt) {
        super(elt);
    }

    @objid ("7706f5b3-6f8a-42b0-9058-a4df5486b4a4")
    public static final class MdaTypes {
        @objid ("8848a2db-ea6b-43fd-adbb-d198905caa8b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c82a4d22-bb44-4704-b34b-77c13a9541ab")
        private static Stereotype MDAASSOCDEP;

        @objid ("98b02f75-9f65-4d62-8506-92232c96ce31")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("3b3c66d8-b8e7-47b5-bfa5-da231258bc26")
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
