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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
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
 * Proxy class to handle a {@link ModelElement} with << Switch >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a3e93b35-d5bc-4f82-b5cf-4e2109bf44fb")
public class Switch extends Feature {
    @objid ("2ae6b00b-d28b-44b1-b9d8-b8630602e4cd")
    public static final String STEREOTYPE_NAME = "Switch";

    @objid ("dbba574b-d237-431b-9f22-000beb31facf")
    public static final String VALUES_TAGTYPE = "values";

    /**
     * Tells whether a {@link Switch proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << Switch >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4cebb040-3e26-494a-973d-29fcd10a3d47")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Switch.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link ModelElement} stereotyped << Switch >> then instantiate a {@link Switch} proxy.
     * 
     * @return a {@link Switch} proxy on the created {@link ModelElement}.
     */
    @objid ("2cd23cca-96a5-4eda-b09c-88be651e78f8")
    public static Switch create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.ModelElement");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Switch.STEREOTYPE_NAME);
        return Switch.instantiate((ModelElement)e);
    }

    /**
     * Tries to instantiate a {@link Switch} proxy from a {@link ModelElement} stereotyped << Switch >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a ModelElement
     * @return a {@link Switch} proxy or <i>null</i>.
     */
    @objid ("66807f2a-a19a-4211-9b34-340e90ef6913")
    public static Switch instantiate(final ModelElement obj) {
        return Switch.canInstantiate(obj) ? new Switch(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Switch} proxy from a {@link ModelElement} stereotyped << Switch >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link ModelElement}
     * @return a {@link Switch} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ee2f5e2-6f18-42f5-b053-259e59feb63c")
    public static Switch safeInstantiate(final ModelElement obj) throws IllegalArgumentException {
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
    @objid ("a2a00a19-9c28-4518-8fc4-db5c9fdae4dc")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Switch.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("0f06ff74-6fee-47be-bf27-78455adb70db")
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
    @objid ("e0b9952a-8f3a-4c54-8071-d2cef1f79c51")
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
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("bc25096e-8733-4be8-90aa-1478ea420735")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Get the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7fd2c146-a0f9-477d-aa32-ce50591462e0")
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
    @objid ("d2de0ab7-864b-4f2c-b08f-9dff45d96910")
    public List<String> getValues() {
        return this.elt.getTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT);
    }

    @objid ("e8d5e415-f1b9-4bad-b1b1-5345c73f035d")
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
    @objid ("3919f1bb-68de-45f0-b4a7-7a55bd4d73e8")
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
    @objid ("86255b71-ece6-4794-a502-f010037d8d29")
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
    @objid ("8986b81b-af1f-4ad7-869e-b6b58d896cd5")
    public void setValues(final List<String> values) {
        this.elt.putTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT, values);
    }

    @objid ("9ee6efd2-43cd-4d70-ad79-3affde9a55d6")
    protected Switch(final ModelElement elt) {
        super(elt);
    }

    @objid ("aa99b253-e0b8-4432-9e4c-4ee801b20e09")
    public static final class MdaTypes {
        @objid ("fc7c5153-e55d-4abd-bd15-5cfdd72f4251")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ad03de3d-83ad-471c-96bb-2bf995e5ec9f")
        public static TagType VALUES_TAGTYPE_ELT;

        @objid ("16337528-92eb-4e17-bf12-91b820bb9030")
        private static Stereotype MDAASSOCDEP;

        @objid ("e7fcc9d5-5f3c-4bb0-98d1-9040f18c4799")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94cf5c7d-319c-43e5-9e53-6e7f20e6943f")
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
