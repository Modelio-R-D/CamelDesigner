/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("6e721d07-5415-4c67-af61-db5e53d6dcbe")
    public static final String STEREOTYPE_NAME = "MetricContext";

    /**
     * Tells whether a {@link MetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8a06db6b-af7c-4be3-89fd-5fe16b8c0080")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME));
    }

    @objid ("7514dd52-e42d-42c8-aa0b-89565f13f7d1")
    public static MetricContext instantiate(final Class obj) {
        return CompositeMetricContext.canInstantiate(obj) ? new CompositeMetricContext(obj) :  RawMetricContext.canInstantiate(obj) ? new RawMetricContext(obj) : null;
    }

    /**
     * Add a value to the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("459bfc9f-df86-4694-8e0d-a94159b5b6a6")
    public void addMetricConstraint(final MetricConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("d168e69e-739a-4ea8-8fb3-e32dee89a7af")
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
    @objid ("e34c94a5-2538-41c7-8699-f9f6ace5b44c")
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
    @objid ("74013dbf-99b8-46fe-8d6b-fe88eb058791")
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
    @objid ("33c0c15d-e587-449a-9f38-8548db66ef08")
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
    @objid ("110b6667-7c4e-4e91-afce-7c8d8768eaf6")
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
    @objid ("f0f7ffd2-b09b-49b5-8648-fa0b8115d5b4")
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

    @objid ("d77f6b79-c349-4a34-b097-ecc3060642e9")
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
    @objid ("8e4fc7da-bdf7-4d67-9bec-3b096cedf0ad")
    public boolean removeMetricConstraint(final MetricConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bf4c06f1-f573-43cc-9259-a20d140cd34a")
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
    @objid ("9e1123d8-2e80-4846-9474-7936eaefbbf6")
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
    @objid ("c063c29f-07a7-48a9-b8b5-4497b3c3adf9")
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

    @objid ("fa7be652-01af-4e2d-bb14-73bd2ba71759")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getMetricConstraint());
        return result;
    }

    @objid ("70822eab-efde-4f14-b4c1-ca5e13e3652e")
    protected MetricContext(final Class elt) {
        super(elt);
    }

    @objid ("3357aabf-9da8-4702-9625-397f3c7ea782")
    public static final class MdaTypes {
        @objid ("717d84b8-b443-4ebf-9cd5-7db55e77f3ce")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("003389af-027d-47e4-804e-0ca73f3354f5")
        private static Stereotype MDAASSOCDEP;

        @objid ("bb580cdf-6ea1-464f-be37-2ac3aae66c00")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e200e150-0c67-4ec0-a830-c90e7b31c815")
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
