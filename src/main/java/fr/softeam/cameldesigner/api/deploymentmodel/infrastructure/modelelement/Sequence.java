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
 * Proxy class to handle a {@link ModelElement} with << Sequence >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("d9a378e5-4189-4afa-b730-192dcefc8515")
public class Sequence extends Feature {
    @objid ("e92791c7-69c1-4860-9892-64e5666515a5")
    public static final String STEREOTYPE_NAME = "Sequence";

    /**
     * Tells whether a {@link Sequence proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Sequence >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("13270b5c-bcec-45c8-8bed-f272a31369dd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Sequence >> then instantiate a {@link Sequence} proxy.
     * 
     * @return a {@link Sequence} proxy on the created {@link ModelElement}.
     */
    @objid ("2574d0b1-0940-4f01-a7b5-ff77c2d9cbe2")
    public static Sequence create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Sequence.STEREOTYPE_NAME);
        return Sequence.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link Sequence} proxy from a {@link ModelElement} stereotyped << Sequence >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link Sequence} proxy or <i>null</i>.
     */
    @objid ("e44da7d2-4f9d-4517-8261-97e08902d79b")
    public static Sequence instantiate(final ModelElement obj) {
        return Sequence.canInstantiate(obj) ? new Sequence(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Sequence} proxy from a {@link ModelElement} stereotyped << Sequence >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link Sequence} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e19dceea-12f9-41ef-922b-1e121ab9c95c")
    public static Sequence safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
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
    @objid ("ec38ca4d-9c5f-45e9-964f-6b3393c7ee6e")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Sequence.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Sequence.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("fe38f776-8c84-4f98-8332-64a22b0877f2")
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
    @objid ("0f519e39-377c-4d82-8bc3-117044028552")
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("106b5beb-aa07-4cf5-94b2-9fac200afea1")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    @objid ("27a61655-99b6-4fb3-8083-50415b81898c")
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
    @objid ("e2ce7c6a-cdb4-40bb-b030-84a212c8b44b")
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

    @objid ("1fad56ab-fd9e-4484-9315-c23368b3048e")
    protected Sequence(final ModelElement elt) {
        super(elt);
    }

    @objid ("6110076e-f449-4d1e-8f10-0279448e369b")
    public static final class MdaTypes {
        @objid ("c870ba5a-822b-4379-810f-7c54c4ea40ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f7d5e6c7-b8af-4e0c-962a-60916d08a4ae")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd426af4-9fd2-431a-98e0-b802130a306e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d9627da2-be0e-4cb2-b592-d8510167157d")
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
