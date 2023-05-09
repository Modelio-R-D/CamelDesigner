/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("8485ed77-7307-4666-8c1d-86ebf42a7fb3")
    public static final String STEREOTYPE_NAME = "Conditional";

    /**
     * Tells whether a {@link Conditional proxy} can be instantiated from a {@link MObject} checking it is a {@link Substitution} stereotyped << Conditional >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("729901fc-f282-4992-8e87-449fc2d81aab")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Substitution) && ((Substitution) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Conditional.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Substitution} stereotyped << Conditional >> then instantiate a {@link Conditional} proxy.
     * 
     * @return a {@link Conditional} proxy on the created {@link Substitution}.
     */
    @objid ("b64fcf16-d256-4517-b82c-c3699d62795b")
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
    @objid ("ccdb9f67-3295-473b-90ad-354c8341d32a")
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
    @objid ("fe91d0f4-e95e-4544-898e-6ac3269c12e3")
    public static Conditional safeInstantiate(final Substitution obj) throws IllegalArgumentException {
        if (Conditional.canInstantiate(obj))
        	return new Conditional(obj);
        else
        	throw new IllegalArgumentException("Conditional: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("414add21-aa74-4535-bbbc-b7469780ddda")
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
    @objid ("4e12a4f4-0ed6-4487-9a7f-82f97d7bfb7a")
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
    @objid ("7fd3e409-6ac1-420a-89be-a3684ab52be4")
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
    @objid ("3428c170-7198-439c-936f-ba62ddaaaf6a")
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
    @objid ("85c65837-cb48-48a9-80b0-6e441309fe82")
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

    @objid ("7877e8d7-ef05-40ea-b4a4-028720d8efad")
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
    @objid ("8cd637ee-0373-4307-9a3e-db3bc5fb8d1e")
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
    @objid ("1a863b2b-dcfd-43c6-b031-56ddbb91e897")
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
    @objid ("59377153-3251-47e7-b336-25cbf839395a")
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

    @objid ("0478e916-ceb1-4e4a-905b-ad2027c92ba4")
    protected Conditional(final Substitution elt) {
        super(elt);
    }

    @objid ("7706f5b3-6f8a-42b0-9058-a4df5486b4a4")
    public static final class MdaTypes {
        @objid ("545b8a7c-fcea-42c5-81dc-1902c0d313c3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cf5301aa-cf80-41e1-aa84-f47283a9b800")
        private static Stereotype MDAASSOCDEP;

        @objid ("c9346e5b-dbd9-47da-b71c-424a77eff107")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e76e3344-c366-490a-83e0-ea8a358cb042")
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
