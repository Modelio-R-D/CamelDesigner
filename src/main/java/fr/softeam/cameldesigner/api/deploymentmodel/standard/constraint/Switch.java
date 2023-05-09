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
    @objid ("70be3b1b-b5e3-402e-acd2-74ebbf6463e4")
    public static final String STEREOTYPE_NAME = "Switch";

    @objid ("cc7e4e47-845e-44a7-90f2-a913211f2e14")
    public static final String VALUES_TAGTYPE = "values";

    /**
     * Tells whether a {@link Switch proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Switch >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7ed7f6d9-4268-4c2f-bd30-6a53fd978a72")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Switch.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Switch >> then instantiate a {@link Switch} proxy.
     * 
     * @return a {@link Switch} proxy on the created {@link Constraint}.
     */
    @objid ("57c43697-0e83-45db-9233-dc734cb18b3f")
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
    @objid ("ed711593-93a5-4b4b-be18-bbb6bc1b407e")
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
    @objid ("baaaab87-8870-4550-bb81-abf5cde931b1")
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
    @objid ("f688b274-87f3-4d14-8353-587edb2c353c")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Switch.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("7bdc11d6-08a2-4ce8-acd9-28c53b4482fe")
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
    @objid ("0d1b0dd3-ad60-4dfa-a3d2-eeca1b293c05")
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
    @objid ("895623c6-a96a-4c91-8964-7daff7d03671")
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
    @objid ("1a8f469b-c093-4125-9bd5-9b7859c7267c")
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
    @objid ("cdf0ff5e-910c-4ea1-b3d0-946cab8a7333")
    public List<String> getValues() {
        return this.elt.getTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT);
    }

    @objid ("05206ce8-cd07-43be-8a64-074d92a64ef3")
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
    @objid ("26d911c6-007a-4d8c-960f-fb545bde9c8b")
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
    @objid ("93cef11a-94eb-4529-a362-5454cb5c333e")
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
    @objid ("ea930e1c-086a-4962-9606-9fe40ed1a359")
    public void setValues(final List<String> values) {
        this.elt.putTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT, values);
    }

    @objid ("19e98324-1d67-47a0-b753-a03e275572fe")
    protected Switch(final Constraint elt) {
        super(elt);
    }

    @objid ("aa99b253-e0b8-4432-9e4c-4ee801b20e09")
    public static final class MdaTypes {
        @objid ("aebcd7d7-c2f7-44a3-9e7c-14b1fb9fc3ba")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5345664f-2493-4a9d-9b69-cdb7aa5ac8f6")
        public static TagType VALUES_TAGTYPE_ELT;

        @objid ("e648a412-3ae7-468b-913e-9efc18487f7e")
        private static Stereotype MDAASSOCDEP;

        @objid ("0db47d28-e19d-483e-8289-804dd059843c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f7e41adc-c8b7-4b6a-9695-8eab60042dde")
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
