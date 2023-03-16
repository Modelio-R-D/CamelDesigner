/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("f86cf7d3-f793-4e69-9329-2735b61dba31")
    public static final String STEREOTYPE_NAME = "Precedes";

    /**
     * Tells whether a {@link Precedes proxy} can be instantiated from a {@link MObject} checking it is a {@link Substitution} stereotyped << Precedes >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8afd761a-c29c-4269-afd4-aabbaf90ae4f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Substitution) && ((Substitution) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Precedes.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Substitution} stereotyped << Precedes >> then instantiate a {@link Precedes} proxy.
     * 
     * @return a {@link Precedes} proxy on the created {@link Substitution}.
     */
    @objid ("e178d303-1a06-409e-b74d-262085535704")
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
    @objid ("0ca58fa8-b7fe-448d-842d-2e90e16920cf")
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
    @objid ("a7d83acb-d1b2-43db-ae6e-d9f449a528c3")
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
    @objid ("4c93aa2b-1309-46e3-ab29-42201eba3881")
    public void addPrecededComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Precedes.MdaTypes.MDAASSOCDEP);
            d.setName("precededComponents");
            d.putTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE, "precededComponents");
        }
    }

    @objid ("09ee4084-84b1-470a-b332-93b79e2c91a4")
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
    @objid ("0b5fd205-c76a-483f-9e04-3fad51cc5c88")
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
    @objid ("699a52c1-493a-44b2-94ed-75dd5b88bfa7")
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
    @objid ("43ac5d8b-ef99-442b-b6bc-33b01bc3d91c")
    public List<SoftwareComponent> getPrecededComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Precedes.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Precedes.MdaTypes.MDAASSOCDEP_ROLE), "precededComponents")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("85547d88-82c5-4e0d-81de-d1bac216d1e8")
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
    @objid ("f600c594-7110-4c78-aa60-bb92facebd35")
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
    @objid ("e6b9637e-5333-4b8c-8ffd-0ba9028414e7")
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

    @objid ("3d4bb6b5-969a-4f60-b2e7-a7a5fbfe9e71")
    protected Precedes(final Substitution elt) {
        super(elt);
    }

    @objid ("c57a9949-4899-4611-bf8e-9d12b19267bc")
    public static final class MdaTypes {
        @objid ("a341953e-e75a-4fe5-9bd0-435a7422591f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("94660952-575b-4ded-834f-62240f539df5")
        private static Stereotype MDAASSOCDEP;

        @objid ("8e4468fc-0623-4cca-91ad-04c25cd0e7b8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("48c97513-2198-4082-bf7f-0bdf53fa918d")
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
