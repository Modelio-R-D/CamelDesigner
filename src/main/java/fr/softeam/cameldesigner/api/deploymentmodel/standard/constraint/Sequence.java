/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Constraint} with << Sequence >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d9a378e5-4189-4afa-b730-192dcefc8515")
public class Sequence extends Feature {
    @objid ("c6cc17d7-b964-4ddc-aa7c-d7794c2a018e")
    public static final String STEREOTYPE_NAME = "Sequence";

    /**
     * Tells whether a {@link Sequence proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Sequence >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("12d27cd8-b9f2-4899-aa55-503ff564a1e1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Sequence >> then instantiate a {@link Sequence} proxy.
     * 
     * @return a {@link Sequence} proxy on the created {@link Constraint}.
     */
    @objid ("34a89e5d-61b6-475d-8cf0-53b931696ffa")
    public static Sequence create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME);
        return Sequence.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link Sequence} proxy from a {@link Constraint} stereotyped << Sequence >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link Sequence} proxy or <i>null</i>.
     */
    @objid ("a11e5bb0-f3c5-4874-9981-b04fb0a30330")
    public static Sequence instantiate(final Constraint obj) {
        return Sequence.canInstantiate(obj) ? new Sequence(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Sequence} proxy from a {@link Constraint} stereotyped << Sequence >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link Sequence} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("09976dca-8237-4d47-b288-561bbdd738d0")
    public static Sequence safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (Sequence.canInstantiate(obj))
        	return new Sequence(obj);
        else
        	throw new IllegalArgumentException("Sequence: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47c2674f-ac4f-4519-9593-b9062846d475")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Sequence.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("52453bf9-a4de-484b-ab04-43cba283e7ae")
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
        Sequence other = (Sequence) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("294d7f24-838d-4738-980c-c61a1d0b8589")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Sequence.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE), "components")){
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
    @objid ("b315fc21-2936-48c3-af19-8758d8371e91")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    @objid ("fa41c0ef-3803-4aa4-b654-5bac05263607")
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
    @objid ("46a52b99-2dd9-40d1-8f3b-92dc4ebcde90")
    public boolean removeComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Sequence.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE), "components")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("7d2d54fd-13bf-4e69-b31e-aefde54bcb04")
    protected Sequence(final Constraint elt) {
        super(elt);
    }

    @objid ("6110076e-f449-4d1e-8f10-0279448e369b")
    public static final class MdaTypes {
        @objid ("f0448934-6797-4f6b-94b9-a639db890015")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("19e79adc-ae8a-42c3-ad4d-a4e9fdcbecc3")
        private static Stereotype MDAASSOCDEP;

        @objid ("21a5e26d-5f56-4203-88e0-9f59456e7769")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0ff77b5e-e7d5-4e96-9e70-8617b1410371")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ca145da8-ff7e-4edb-9b3c-d3bef9c006f2");
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
