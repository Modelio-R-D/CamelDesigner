/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MetricContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7e09088f-c382-4e86-bf9f-279d86520d36")
public abstract class MetricContext extends FeatureClass {
    @objid ("6f10db73-1d3a-4962-afc9-e145f4845243")
    public static final String STEREOTYPE_NAME = "MetricContext";

    /**
     * Tells whether a {@link MetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("3ad0fa1f-53ba-4348-8cd0-97bf93abd7d8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("47da8b3d-385a-4c01-9db3-f081bf9b08da")
    public void addMetricConstraint(final MetricConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("2f66838a-064e-412c-b838-a49ce1e54d79")
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
        MetricContext other = (MetricContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3cda3fcf-f174-4b9d-b0a9-db0f6b4f6b11")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("af8ee6be-1eb3-4402-b120-26797c87daf3")
    public Metric getMetric() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "metric")){
                  if (CompositeSecurityMetric.canInstantiate(d.getDependsOn()))
                     return (CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeMetric.canInstantiate(d.getDependsOn()))
                     return (CompositeMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetric.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariable.canInstantiate(d.getDependsOn()))
                     return (MetricVariable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawSecurityMetric.canInstantiate(d.getDependsOn()))
                     return (RawSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetric.canInstantiate(d.getDependsOn()))
                     return (RawMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetric.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ec272c39-1d89-4ba3-9c24-e7ca9df30b7f")
    public List<MetricConstraint> getMetricConstraint() {
        List<MetricConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition()){
        	if (MetricConstraint.canInstantiate(mObj))
        			results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'objectContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("68dc73b2-abd7-4e6f-8ee9-4cab8f27cb4e")
    public ObjectContext getObjectContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "objectContext")){
                  if (ObjectContext.canInstantiate(d.getDependsOn()))
                     return (ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'schedule' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fec297f9-acd9-4ded-b1c5-dd37fdc8f72a")
    public Schedule getSchedule() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "schedule")){
                  if (Schedule.canInstantiate(d.getDependsOn()))
                     return (Schedule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Schedule.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("17f70119-8de3-4e21-b039-c42577ae7aa8")
    public Window getWindow() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "window")){
                  if (Window.canInstantiate(d.getDependsOn()))
                     return (Window)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Window.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("9bb2c995-0cf3-45b5-80be-173fce57380c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("052ae4d6-0a83-4061-92c9-5b4d7e58e899")
    public boolean removeMetricConstraint(final MetricConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("960f8a43-37e5-47a3-bfac-29cc767da58f")
    public void setMetric(final Metric obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "metric")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricContext.MdaTypes.MDAASSOCDEP);
              dep.setName("metric");      dep.putTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE, "metric");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'objectContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("eaa4adc0-ecba-40f7-8597-aba4da678248")
    public void setObjectContext(final ObjectContext obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "objectContext")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricContext.MdaTypes.MDAASSOCDEP);
              dep.setName("objectContext");      dep.putTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE, "objectContext");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'schedule' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("58daf425-1af7-4c8e-83b9-95f11c0a257e")
    public void setSchedule(final Schedule obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "schedule")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricContext.MdaTypes.MDAASSOCDEP);
              dep.setName("schedule");      dep.putTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE, "schedule");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("16dd5337-e97c-4594-b207-f41bf15cdc17")
    public void setWindow(final Window obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "window")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricContext.MdaTypes.MDAASSOCDEP);
              dep.setName("window");      dep.putTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE, "window");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("fa7be652-01af-4e2d-bb14-73bd2ba71759")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("d80110fa-bcdc-4169-8281-3e4a7b4a1764")
    protected MetricContext(final Class elt) {
        super(elt);
    }

    @objid ("3357aabf-9da8-4702-9625-397f3c7ea782")
    public static final class MdaTypes {
        @objid ("f2aeff15-0ef6-493f-94d0-fb0c27087f8f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f921bc8d-744b-4d33-ad2a-2706337915d9")
        private static Stereotype MDAASSOCDEP;

        @objid ("1bbe215e-10fd-4dbf-9e58-5f799bc41b82")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5a401247-469d-4406-9249-182d2b339722")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "488a751d-5081-4d44-bdb2-716e2a588fb4");
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
