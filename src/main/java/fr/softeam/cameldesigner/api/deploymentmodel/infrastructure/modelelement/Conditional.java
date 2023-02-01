/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
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
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << Conditional >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2cf05ec1-353b-44b5-92fc-db3ca6558f81")
public class Conditional extends Feature {
    @objid ("873649ee-b2f1-4409-9a27-fbaf094e2831")
    public static final String STEREOTYPE_NAME = "Conditional";

    /**
     * Tells whether a {@link Conditional proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Conditional >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cfa4bf0c-df09-4e6a-a43c-4f7cf36bf421")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Conditional.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Conditional >> then instantiate a {@link Conditional} proxy.
     * 
     * @return a {@link Conditional} proxy on the created {@link ModelElement}.
     */
    @objid ("e2afe408-26a9-4cbf-b3a7-f6f2f78178eb")
    public static Conditional create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Conditional.STEREOTYPE_NAME);
        return Conditional.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link Conditional} proxy from a {@link ModelElement} stereotyped << Conditional >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link Conditional} proxy or <i>null</i>.
     */
    @objid ("a24cf1dd-91a8-408c-a8b0-1f64f5af860d")
    public static Conditional instantiate(final ModelElement obj) {
        return Conditional.canInstantiate(obj) ? new Conditional(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Conditional} proxy from a {@link ModelElement} stereotyped << Conditional >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link Conditional} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("29e54a92-bf94-4a9e-baa4-a45602b105a5")
    public static Conditional safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
        if (Conditional.canInstantiate(obj))
        	return new Conditional(obj);
        else
        	throw new IllegalArgumentException("Conditional: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("481cccad-b72c-4731-8e6f-16c4f7744de3")
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
    @objid ("9d0c30f5-795b-4903-8d69-06b0cfe4f38c")
    public CamelConstraint getConstraint() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Conditional.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Conditional.MdaTypes.MDAASSOCDEP_ROLE), "constraint")){
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("cb4b143d-47df-4115-9445-8b61d2e22053")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Get the value of the 'firstComponent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("892d9d0d-f49c-4b07-baea-85629f5d4677")
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
    @objid ("2646018d-4934-4307-a888-4eb10b486c3d")
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

    @objid ("f0ec3c00-67ff-4bed-933b-64c674f24004")
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
    @objid ("7bb37319-2644-4dd4-ad1c-478c91b2c4cf")
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
    @objid ("4317d537-cf58-458a-aa2d-75601208e876")
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
    @objid ("96c2e61e-03f2-4916-9470-3eec28659118")
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

    @objid ("934bf1df-0aad-472b-ae43-f6688c89ee33")
    protected Conditional(final ModelElement elt) {
        super(elt);
    }

    @objid ("7706f5b3-6f8a-42b0-9058-a4df5486b4a4")
    public static final class MdaTypes {
        @objid ("f17ddda2-96b1-4fdd-ba2d-fcfd476ce237")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("05bb2da3-f6c2-4a56-9172-40a8353c8ece")
        private static Stereotype MDAASSOCDEP;

        @objid ("61ce8231-68ad-4940-af4d-50ba72c1944f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d09dba2c-39f8-4c85-b6ad-c4f56ca7c82a")
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
