/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement;

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
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << Precedes >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("53b9cb61-464b-46ce-b210-66c4ec16be2a")
public class Precedes extends Feature {
    @objid ("ae469480-b636-4ab8-9c48-6dee414877bf")
    public static final String STEREOTYPE_NAME = "Precedes";

    /**
     * Tells whether a {@link Precedes proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Precedes >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b566dbe4-05d2-481b-a6a4-fd7675d208a1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Precedes.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Precedes >> then instantiate a {@link Precedes} proxy.
     * 
     * @return a {@link Precedes} proxy on the created {@link ModelElement}.
     */
    @objid ("a659e729-0dbc-457b-8a26-20717400e3b6")
    public static Precedes create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Precedes.STEREOTYPE_NAME);
        return Precedes.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link Precedes} proxy from a {@link ModelElement} stereotyped << Precedes >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link Precedes} proxy or <i>null</i>.
     */
    @objid ("7202041e-2896-4112-870a-b761c12dcfeb")
    public static Precedes instantiate(final ModelElement obj) {
        return Precedes.canInstantiate(obj) ? new Precedes(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Precedes} proxy from a {@link ModelElement} stereotyped << Precedes >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link Precedes} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7cc6f833-7d76-4033-8959-1a36e0649f6e")
    public static Precedes safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
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
    @objid ("44a959aa-1870-416c-bd6a-1e47f3b24403")
    public void addPrecededComponents(final SoftwareComponentInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Precedes.MdaTypes.MDAASSOCDEP);
            d.setName("precededComponents");
            d.putTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE, "precededComponents");
        }
    }

    @objid ("fdb5e58e-151b-43ce-abb1-38d763e554ef")
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
    @objid ("b0d2598d-fc9c-4ca7-b5aa-550d8b4e5827")
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("ab7bb8dc-bd2d-4d61-b671-3068b6963e6b")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Get the values of the 'precededComponents' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4bbb6266-c016-4e06-b058-de979c2097a5")
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

    @objid ("dcead232-f169-4fdf-ab46-3a61556aa2ef")
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
    @objid ("d0fb3e6b-299a-4092-8424-ca65fa5dad2e")
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
    @objid ("c3877270-bcd4-4d6f-bc24-5d3b691fa5d2")
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

    @objid ("27a5b585-2879-4258-96bc-f9182ac34d28")
    protected Precedes(final ModelElement elt) {
        super(elt);
    }

    @objid ("c57a9949-4899-4611-bf8e-9d12b19267bc")
    public static final class MdaTypes {
        @objid ("945074b3-3501-4070-8a3e-c7ccbf106359")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8add5fec-d16a-4d35-b21a-b7801b9c2407")
        private static Stereotype MDAASSOCDEP;

        @objid ("fa449367-b7ba-4952-ad11-9890d44efd5e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("51b74ffd-e486-472d-b576-b8d766ae5677")
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
