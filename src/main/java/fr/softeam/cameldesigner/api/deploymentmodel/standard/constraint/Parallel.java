/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.constraint;

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
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Constraint} with << Parallel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("4c244d09-57a9-4a83-bf17-30176a65e25c")
public class Parallel extends Feature {
    @objid ("7ce2c94f-1e46-444a-9c5a-cc3f043458ed")
    public static final String STEREOTYPE_NAME = "Parallel";

    /**
     * Tells whether a {@link Parallel proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Parallel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8b8587c6-808d-4b9e-9d4f-5159228087a0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Parallel >> then instantiate a {@link Parallel} proxy.
     * 
     * @return a {@link Parallel} proxy on the created {@link Constraint}.
     */
    @objid ("6ac68d96-b1ff-48f1-8359-092327aae749")
    public static Parallel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Parallel.STEREOTYPE_NAME);
        return Parallel.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link Parallel} proxy from a {@link Constraint} stereotyped << Parallel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link Parallel} proxy or <i>null</i>.
     */
    @objid ("366bbd2e-9c61-462e-84f9-e6db885c20ad")
    public static Parallel instantiate(final Constraint obj) {
        return Parallel.canInstantiate(obj) ? new Parallel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Parallel} proxy from a {@link Constraint} stereotyped << Parallel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link Parallel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("f5c55d1e-8267-41e5-b3a5-9b60449dcd97")
    public static Parallel safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (Parallel.canInstantiate(obj))
        	return new Parallel(obj);
        else
        	throw new IllegalArgumentException("Parallel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a052b7df-9106-4fa2-989c-03480e91ce4d")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Parallel.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("99630329-3dea-4460-ab02-1cc655323136")
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
        Parallel other = (Parallel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("254ef71f-ed9f-4ec6-9bc0-f1f48d300e55")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Parallel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE), "components")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
              if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("2a64ab20-ad4a-4cf1-82c4-421f33e975dc")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("88dbac85-a4a8-4ef3-8772-fa22e2098e53")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9131b067-236d-4668-9eff-f4c764aa13f6")
    public boolean removeComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Parallel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Parallel.MdaTypes.MDAASSOCDEP_ROLE), "components")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("814eba4f-df82-4e87-94af-4c1f9617a3dc")
    protected Parallel(final Constraint elt) {
        super(elt);
    }

    @objid ("0e0eaff4-fbfa-4eff-bde8-1b82a6b4da65")
    public static final class MdaTypes {
        @objid ("3473c29e-c109-441f-a441-3ac039cb06ca")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("99fde3c5-1d85-4196-9e38-e8ef446d94c1")
        private static Stereotype MDAASSOCDEP;

        @objid ("b5ead744-5c51-43d5-8a94-9cc486a5234c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8e937a29-d59c-4857-bc55-612426edabcd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d9ae85a6-7add-441a-90e4-b7487a23979d");
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
