/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.substitution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
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
 * Proxy class to handle a {@link Substitution} with << Precedes >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53b9cb61-464b-46ce-b210-66c4ec16be2a")
public class Precedes extends Feature {
    @objid ("7c8f14c2-8320-4a73-b0fe-25f74c9c1ba6")
    public static final String STEREOTYPE_NAME = "Precedes";

    /**
     * Tells whether a {@link Precedes proxy} can be instantiated from a {@link MObject} checking it is a {@link Substitution} stereotyped << Precedes >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9f15e8f5-a2e2-46d0-a4c5-e367a5365ce3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Substitution) && ((Substitution) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Precedes.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Substitution} stereotyped << Precedes >> then instantiate a {@link Precedes} proxy.
     * 
     * @return a {@link Precedes} proxy on the created {@link Substitution}.
     */
    @objid ("d55f7fb0-873e-444b-a712-228c4a3f0c8a")
    public static Precedes create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Substitution");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Precedes.STEREOTYPE_NAME);
        return Precedes.instantiate((Substitution)e);
    }

    /**
     * Tries to instantiate a {@link Precedes} proxy from a {@link Substitution} stereotyped << Precedes >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Substitution
     * @return a {@link Precedes} proxy or <i>null</i>.
     */
    @objid ("b0da4d6d-a6b4-4d2f-a284-ef4238dfdb0a")
    public static Precedes instantiate(final Substitution obj) {
        return Precedes.canInstantiate(obj) ? new Precedes(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Precedes} proxy from a {@link Substitution} stereotyped << Precedes >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Substitution}
     * @return a {@link Precedes} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bfbb903c-9328-424f-82d3-60d4360c1668")
    public static Precedes safeInstantiate(final Substitution obj) throws IllegalArgumentException {
        if (Precedes.canInstantiate(obj))
        	return new Precedes(obj);
        else
        	throw new IllegalArgumentException("Precedes: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'precededComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("732c39bb-1df7-4a74-97e1-31c3c837482f")
    public void addPrecededComponents(final SoftwareComponentInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Precedes.MdaTypes.MDAASSOCDEP);
            d.setName("precededComponents");
            d.putTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE, "precededComponents");
        }
    }

    @objid ("64bc4495-15f3-45a9-8eb3-cc053ac1df30")
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
        Precedes other = (Precedes) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b37c2995-7acb-48bc-96d4-ae57078383e8")
    public SoftwareComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "component")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Substitution}. 
     * @return the Substitution represented by this proxy, never null.
     */
    @objid ("1f00aaa2-4aa8-4a56-b9a8-926e4e9cf650")
    @Override
    public Substitution getElement() {
        return (Substitution)super.getElement();
    }

    /**
     * Get the values of the 'precededComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4d9a78ae-94e8-4547-91b8-5c87e68d1fa0")
    public List<SoftwareComponentInstance> getPrecededComponents() {
        List<SoftwareComponentInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "precededComponents")){
              if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b4fa962b-56e8-4182-bda7-ea27502039cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'precededComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bcd44c15-1f82-4621-a742-b79ab54b8e2b")
    public boolean removePrecededComponents(final SoftwareComponentInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "precededComponents")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4914b31f-7001-4411-8504-18e5cd5eb35b")
    public void setComponent(final SoftwareComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "component")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Precedes.MdaTypes.MDAASSOCDEP);
              dep.setName("component");      dep.putTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE, "component");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("0fcd7d04-921a-4d4c-81d0-6b26fcb2fb43")
    protected Precedes(final Substitution elt) {
        super(elt);
    }

    @objid ("c57a9949-4899-4611-bf8e-9d12b19267bc")
    public static final class MdaTypes {
        @objid ("4b35d52f-875f-47b0-92f7-522b4135179f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("56a2f20b-b0b2-46d4-b360-7fda59c65b7c")
        private static Stereotype MDAASSOCDEP;

        @objid ("57956ec3-9cf6-43a9-a674-312b5b06d792")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9f16d38c-d7ff-47ae-abd7-e68aaaa497e1")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "4ec7a091-2d58-4b40-8d19-05e45baeacde");
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
