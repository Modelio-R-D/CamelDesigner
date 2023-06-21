/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.profiler.standard.component.ProfilerComponent;
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
@objid ("75033cc4-f81e-42a7-9327-0f71721919aa")
public class Switch extends Feature {
    @objid ("32da4ce1-0ef0-4ed5-90b3-ed1856d50e2b")
    public static final String STEREOTYPE_NAME = "Switch";

    @objid ("50dec06d-fc7b-46db-a6e1-6e66329fbd07")
    public static final String VALUES_TAGTYPE = "values";

    /**
     * Tells whether a {@link Switch proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << Switch >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("301b9cb0-3d39-433c-bfcd-bec0ff5e2354")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Switch.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << Switch >> then instantiate a {@link Switch} proxy.
     * 
     * @return a {@link Switch} proxy on the created {@link Constraint}.
     */
    @objid ("3a19b31f-3869-4205-9c5c-77bb7e0e988b")
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
    @objid ("ef9ca3bc-540e-4452-8409-f345abcacfc8")
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
    @objid ("6b44dee2-3291-41a0-8558-87f6a35b6852")
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
    @objid ("c79b5308-acc4-45e1-a10f-6b898f5737ec")
    public void addComponents(final SoftwareComponent obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), Switch.MdaTypes.MDAASSOCDEP);
            d.setName("components");
            d.putTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE, "components");
        }
    }

    @objid ("8802f54d-88f9-46ff-90fe-f042d72e1216")
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
    @objid ("240f9a7d-793e-49f2-bc79-e17e9dc5f312")
    public List<SoftwareComponent> getComponents() {
        List<SoftwareComponent> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(Switch.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(Switch.MdaTypes.MDAASSOCDEP_ROLE), "components")){
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

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("5070b6d4-204d-48ae-9aaf-123c4e68b73e")
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
    @objid ("fa8eb2cb-6894-4a85-854d-eb76a0bfaaf4")
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
    @objid ("cd301661-a19d-40a3-8f89-78763cf2e372")
    public List<String> getValues() {
        return this.elt.getTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT);
    }

    @objid ("0ec45bf1-839e-4710-a46e-f63cef84bc1e")
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
    @objid ("7b4bc85d-94fc-411b-b83e-b34ab8810af6")
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
    @objid ("01cb9706-1ae4-4746-ac3e-d910766b03b4")
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
    @objid ("967fecbf-ced4-4db7-8f6e-92e89ef088d5")
    public void setValues(final List<String> values) {
        this.elt.putTagValues(Switch.MdaTypes.VALUES_TAGTYPE_ELT, values);
    }

    @objid ("022722f1-02be-421b-ab3b-181fbfd4d66a")
    protected Switch(final Constraint elt) {
        super(elt);
    }

    @objid ("cbd48a99-be89-44c6-bb4a-dab2e0aea6be")
    public static final class MdaTypes {
        @objid ("041ef50a-b624-4101-a028-16c626a220a2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7ca93d00-a303-4e05-93ea-ac5f3884d6eb")
        public static TagType VALUES_TAGTYPE_ELT;

        @objid ("fc08e9b1-9e0d-4f54-bc22-b781ea33e7b9")
        private static Stereotype MDAASSOCDEP;

        @objid ("0f16cd4d-0e98-43ec-8d06-859ed78a8967")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("46b08756-75f9-4dbc-b998-11fc05a5f0e6")
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
