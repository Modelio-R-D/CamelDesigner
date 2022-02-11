/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/8/22 11:47 AM by Modelio Studio.
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
    @objid ("75b3f07f-c56f-4e1e-83b1-980bf8b8fa1a")
    public static final String STEREOTYPE_NAME = "MetricContext";

    /**
     * Tells whether a {@link MetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("99d0ca75-d4c4-4cd8-9b2e-c809f0d23895")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'metricConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("3e8b531b-b444-43ad-a0b0-e8edb99ffc92")
    public void addMetricConstraint(final MetricConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("d478ac87-7452-461b-84bb-c2e6082dd662")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7a8f0bf2-eda7-452f-92ed-07d45eac4f16")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metric' role.<p>
     * Role description:
     * null
     */
    @objid ("a166b021-b95a-4e01-80dc-86417c107d10")
    public Metric getMetric() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "metric")
                  && Metric.canInstantiate(d.getDependsOn())) {
                     return (Metric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Metric.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'metricConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("344b514b-d244-49e6-ae48-d12f985c2769")
    public List<MetricConstraint> getMetricConstraint() {
        List<MetricConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition())
            if (MetricConstraint.canInstantiate(mObj))
                    results.add((MetricConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricConstraint.STEREOTYPE_NAME));
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the value of the 'objectContext' role.<p>
     * Role description:
     * null
     */
    @objid ("07755534-c1e3-4825-a2ee-9eb875b0686b")
    public ObjectContext getObjectContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "objectContext")
                  && ObjectContext.canInstantiate(d.getDependsOn())) {
                     return (ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'schedule' role.<p>
     * Role description:
     * null
     */
    @objid ("9dda55b5-fa4e-4e3d-a740-c037d1509e43")
    public Schedule getSchedule() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "schedule")
                  && Schedule.canInstantiate(d.getDependsOn())) {
                     return (Schedule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Schedule.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'window' role.<p>
     * Role description:
     * null
     */
    @objid ("196ddd30-8004-4a52-9f23-ee724b6bfc86")
    public Window getWindow() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricContext.MdaTypes.MDAASSOCDEP_ROLE), "window")
                  && Window.canInstantiate(d.getDependsOn())) {
                     return (Window)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Window.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("f954b793-4076-4e4f-be42-df2a746a0f23")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'metricConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("38222b5e-79cb-4161-b49e-415dedee2da2")
    public boolean removeMetricConstraint(final MetricConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     */
    @objid ("a033450f-ffbd-4381-9567-bbaa14a9fd92")
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
     */
    @objid ("02abee21-9eda-41b4-b8ed-d5da1f50935c")
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
     */
    @objid ("1f60b86c-5ab1-432b-9a82-11ac240725f8")
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
     */
    @objid ("8b502c64-0d77-483c-a625-25a2c1e43eee")
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

    @objid ("ae737eba-5045-4651-9d57-5525e4b9d4f8")
    protected MetricContext(final Class elt) {
        super(elt);
    }

    @objid ("fa7be652-01af-4e2d-bb14-73bd2ba71759")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("3357aabf-9da8-4702-9625-397f3c7ea782")
    public static final class MdaTypes {
        @objid ("696acbe0-d95a-4b47-8c2f-85b9d8f92049")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4483c401-7e8e-491f-b520-bf6e24e62f65")
        private static Stereotype MDAASSOCDEP;

        @objid ("b03f265b-311c-46b7-ab3e-953c9ff44a01")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bb92b9b0-7f68-4d74-8fb8-2bca91268eb1")
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
