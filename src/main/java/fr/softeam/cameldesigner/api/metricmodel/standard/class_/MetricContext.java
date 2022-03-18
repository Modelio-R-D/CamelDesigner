/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("77b833c6-c915-44f0-9d7f-acea6455adeb")
    public static final String STEREOTYPE_NAME = "MetricContext";

    /**
     * Tells whether a {@link MetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9493d89f-3704-4e4a-a7cb-49fce43c16b0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d8032970-1a6a-4c81-9327-e9708e31c2aa")
    public void addMetricConstraint(final MetricConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("6c4ccd17-45f2-43f9-8ab3-a975649488f1")
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
    @objid ("9891e0fb-e10c-4c63-90e5-c18a935584b9")
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
    @objid ("7f02aaf0-6898-49f6-ae91-2c859720a7b5")
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
    @objid ("8e243b6b-e406-4ffe-bc9d-0a7640fa7235")
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
    @objid ("32e0ecfb-a7c6-4d78-9f7f-d66514809a5c")
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
    @objid ("5574bd3a-1439-406a-bdac-50ed7844ce70")
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
    @objid ("25845a2f-df20-4c0c-a5ec-0286714770e9")
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

    @objid ("c0675054-74fd-43a0-8c16-3b6a0a17cafb")
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
    @objid ("5a3a6343-897b-4381-90d9-6c81ca2d9e00")
    public boolean removeMetricConstraint(final MetricConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("655a0974-3f4c-474b-93c2-3bf082316232")
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
    @objid ("029ad3ae-6cbd-4604-a340-1bbd3d1fe52a")
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
    @objid ("76d6d843-daf0-4bee-865e-36fa488f42e9")
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
    @objid ("39d67278-212d-483b-b882-9430461e7618")
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

    @objid ("2da52cd3-1355-45fd-90f5-8e6c7d7319b2")
    protected MetricContext(final Class elt) {
        super(elt);
    }

    @objid ("3357aabf-9da8-4702-9625-397f3c7ea782")
    public static final class MdaTypes {
        @objid ("efcd3cc3-ac52-4fc8-8517-a4c7b89c44d6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d957cd52-3cb1-4d37-aaad-5b8f15188228")
        private static Stereotype MDAASSOCDEP;

        @objid ("604c5cff-d448-44e3-b6c9-fb50316a18f1")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9e992c01-f20a-45b4-81f6-ebe6a0d48283")
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
