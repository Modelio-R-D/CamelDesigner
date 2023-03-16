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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
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
 * Proxy class to handle a {@link Constraint} with << Switch >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a3e93b35-d5bc-4f82-b5cf-4e2109bf44fb")
public class Switch extends Feature {
    @objid ("1ed5a5dc-704e-4fd8-9914-16664c763c76")
    public static final String STEREOTYPE_NAME = "Switch";

    @objid ("8962bd44-b089-4db8-8822-b51b3cc68ac2")
    public static final String VALUES_TAGTYPE = "values";

    /**
     * Tells whether a {@link Switch proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Switch >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d71d472b-9f91-46c7-a38a-45e23878d16e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Switch.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Switch >> then instantiate a {@link Switch} proxy.
     * 
     * @return a {@link Switch} proxy on the created {@link Constraint}.
     */
    @objid ("17ea8b56-2e8c-412c-85dc-77d80ee17465")
    public static Switch create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Switch.STEREOTYPE_NAME);
        return Switch.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link Switch} proxy from a {@link Constraint} stereotyped << Switch >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link Switch} proxy or <i>null</i>.
     */
    @objid ("7a5bff39-204d-4c65-9b34-432d6b1e81ec")
    public static Switch instantiate(final Constraint obj) {
        return Switch.canInstantiate(obj) ? new Switch(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Switch} proxy from a {@link Constraint} stereotyped << Switch >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link Switch} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("00522b77-c67d-4aef-8804-3ed0b5d55714")
    public static Switch safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (Switch.canInstantiate(obj))
        	return new Switch(obj);
        else
        	throw new IllegalArgumentException("Switch: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3988b87e-2b68-4511-bf19-135c083e5a66")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Switch.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("86d14489-77d5-4b7c-b73d-b8e23a887664")
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
        Switch other = (Switch) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'components' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ddd9aed1-19b1-46f3-9e11-3ceee37995a5")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Switch.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE), "components")){
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
    @objid ("21928760-ae44-4771-8bf2-e4ca29009ac5")
    @Override
    public Constraint getElement() {
        return (Constraint)super.getElement();
    }

    /**
     * Get the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c2964d62-f911-4dbc-a8b9-27440f366e4f")
    public MetricContext getMetricContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Switch.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")){
                  if (CompositeMetricContext.canInstantiate(d.getDependsOn()))
                     return (CompositeMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetricContext.canInstantiate(d.getDependsOn()))
                     return (RawMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for List<String> property 'values'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("8bae49eb-5e91-473f-b0e4-ee75e915ec9f")
    public List<String> getValues() {
        return this.elt.getTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT);
    }

    @objid ("cffe8cc0-2ddf-4b7e-91bc-38c0ce6b3f3b")
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
    @objid ("64616f0a-eef5-4fc1-a7b9-5d67dc3bea83")
    public boolean removeComponents(final SoftwareComponent obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(Switch.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE), "components")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b989a1a7-fa8f-43a2-b94e-ef13a236d624")
    public void setMetricContext(final MetricContext obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Switch.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Switch.MdaTypes.MDAASSOCDEP);
              dep.setName("metricContext");      dep.putTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE, "metricContext");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for List<String> property 'values'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4086c10e-ddf5-4078-a88c-3539f2ac593a")
    public void setValues(final List<String> values) {
        this.elt.putTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT, values);
    }

    @objid ("24a4a478-22fd-4ff4-93be-a692310bc8cc")
    protected Switch(final Constraint elt) {
        super(elt);
    }

    @objid ("aa99b253-e0b8-4432-9e4c-4ee801b20e09")
    public static final class MdaTypes {
        @objid ("c711a084-971c-460d-a2ef-c1a9ee0ca94c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8fdfd7ff-f625-4189-b5da-3e8775c0bcb0")
        public static TagType VALUES_TAGTYPE_ELT;

        @objid ("c8495a1a-2104-4e30-a446-b4ca0014693c")
        private static Stereotype MDAASSOCDEP;

        @objid ("24ff6f5a-79c7-4763-85a4-61073e51fde5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6023d13-b21c-458b-a661-f04720418289")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "58186976-c426-4fa2-bc5c-50c3175a707c");
            VALUES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "744ae373-9518-4481-9be3-b9b7fcb11d66");
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
