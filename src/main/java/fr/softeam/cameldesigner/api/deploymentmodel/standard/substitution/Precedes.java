/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Substitution} with << Precedes >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53b9cb61-464b-46ce-b210-66c4ec16be2a")
public class Precedes extends Feature {
    @objid ("18c57fed-1999-457d-91ab-25e92c8c2886")
    public static final String STEREOTYPE_NAME = "Precedes";

    /**
     * Tells whether a {@link Precedes proxy} can be instantiated from a {@link MObject} checking it is a {@link Substitution} stereotyped << Precedes >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("58031ae0-74ef-4a38-9fb8-8aaa9eb913ec")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Substitution) && ((Substitution) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Precedes.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Substitution} stereotyped << Precedes >> then instantiate a {@link Precedes} proxy.
     * 
     * @return a {@link Precedes} proxy on the created {@link Substitution}.
     */
    @objid ("6d6fd030-bd6d-41bf-9c76-c711b6dd6a9b")
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
    @objid ("3440d5d0-8ea8-4502-a092-0dcb37dac5a3")
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
    @objid ("a463a42a-2695-4427-872c-376d7fe1cf5a")
    public static Precedes safeInstantiate(final Substitution obj) throws IllegalArgumentException {
        if (Precedes.canInstantiate(obj))
        	return new Precedes(obj);
        else
        	throw new IllegalArgumentException("Precedes: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'precededComponents' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("248a6973-f3de-4974-b3a6-b9ad317e1b11")
    public void addPrecededComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Precedes.MdaTypes.MDAASSOCDEP);
            d.setName("precededComponents");
            d.putTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE, "precededComponents");
        }
    }

    @objid ("e22c8762-d98f-4a8c-a6be-a3ce3a8c0565")
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
    @objid ("43353eee-f1b3-4516-8531-7135bf0441b7")
    public SoftwareComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "component")){
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
     * Get the underlying {@link Substitution}. 
     * @return the Substitution represented by this proxy, never null.
     */
    @objid ("26123cc1-988f-4840-a28c-ea575b5c288d")
    @Override
    public Substitution getElement() {
        return (Substitution)super.getElement();
    }

    /**
     * Get the values of the 'precededComponents' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("988b2be5-2b05-41e0-b7f3-0406e5697af9")
    public List<SoftwareComponent> getPrecededComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "precededComponents")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (ProfilerComponent.canInstantiate(d.getDependsOn()))
                results.add((ProfilerComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProfilerComponent.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("06bb8a63-be9d-4a66-99aa-ce6c2effba6b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'precededComponents' role.<p>
     * Role description:
     * <Enter note text here>
     * 
     */
    @objid ("ef83381e-6a6c-4497-93eb-03996e0da940")
    public boolean removePrecededComponents(final SoftwareComponent obj) {
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
    @objid ("5dacd782-5848-4cea-b7e1-1ead658e1f9a")
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

    @objid ("e0b05550-ced8-44d1-86b1-68e940f0577e")
    protected Precedes(final Substitution elt) {
        super(elt);
    }

    @objid ("c57a9949-4899-4611-bf8e-9d12b19267bc")
    public static final class MdaTypes {
        @objid ("66529c93-8c53-4263-a2a9-f2a87f926e7d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("26027900-3d03-4831-9de1-94146fb0cec1")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0f579fc-80e0-4198-9a81-3c2d7fcdb77d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("156defc4-8f38-4149-9b44-ca9a69dce083")
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
