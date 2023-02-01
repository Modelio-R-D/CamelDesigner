/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
=======
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("531f5ac3-b9d1-4792-9b0a-4b49942ff064")
=======
    @objid ("eb167e20-4f8a-4239-ab57-7cb5b89eacbc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "MetricContext";

    /**
     * Tells whether a {@link MetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("7abf7fd2-1b3c-4116-b936-6f9344bf2942")
=======
    @objid ("d3df0b35-2143-4f3c-b90d-127148aa0e2a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricContext.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'metricConstraint' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("1c29a8a7-4b1f-4875-9658-ef6977b7dbfe")
=======
    @objid ("db448472-c1c4-4788-95c7-7ad8881f94d8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addMetricConstraint(final MetricConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("a2902b32-2894-41c5-b838-0c831c01eb93")
=======
    @objid ("886190ef-9340-4638-a97d-c75d213142c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("511f11ab-1dc3-4390-a3c8-a968544748a9")
=======
    @objid ("6b756ed1-875f-41f6-a5bd-f103b2c84f76")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1740d31f-cf31-4f3b-b236-ab818c6622e0")
=======
    @objid ("24f13a63-450c-4b1c-9d41-f8b86128b93b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("60181558-e926-4330-bd7c-61fffa1bc873")
=======
    @objid ("d944850d-3287-4597-af56-8889c6db30c6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("f512c14a-a4fc-474c-b16d-64c8a037d795")
=======
    @objid ("da29b8ba-9e4c-49ff-aa90-94750b041ece")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("fe778d01-dee6-4f57-a9a4-296b578ffdae")
=======
    @objid ("a095bc78-75b2-49f7-a404-f73e91ecfc53")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("c18a959e-900a-4556-85a7-66781a372919")
=======
    /**
     * Get the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("23bbd90e-f474-4f6b-9b5d-fffd45f96aad")
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

    @objid ("bf716158-d4df-413c-8f29-f89eab882edb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("d6a1a509-6336-4058-b924-1c78cd74dfa9")
=======
    @objid ("2d2b7499-4007-4799-b5a0-79b84209ab75")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMetricConstraint(final MetricConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'metric' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f42ddc29-060f-4693-ad7a-f8c1351893f7")
=======
    @objid ("e616f8ce-55fe-4e6d-9b0a-16c05895a6fd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("0ea85d04-ed63-4a5d-996d-2c44ad9d7941")
=======
    @objid ("b12eea27-80fc-4cc0-88d1-821cd8e8a29a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("94ee0e7c-0b69-44c6-a926-ebc7f62969f5")
=======
    @objid ("16e2659b-2c1c-4802-a82c-1fb47ba0f2fd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
=======
    /**
     * Set the value of the 'window' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("12694954-0675-42b0-aad0-f31f5653f81c")
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

>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @objid ("fa7be652-01af-4e2d-bb14-73bd2ba71759")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("00f3c340-471d-4fbf-aceb-faaac82adec6")
=======
    @objid ("ddbe6f66-6f47-4a5c-a993-88e28b17eb14")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricContext(final Class elt) {
        super(elt);
    }

    @objid ("3357aabf-9da8-4702-9625-397f3c7ea782")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("846883ab-5949-49da-81bb-54846bebc039")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d239902c-6592-442a-b185-d02df3e62d86")
        private static Stereotype MDAASSOCDEP;

        @objid ("c4283f1b-6caa-44a7-a789-1674d324aba0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4683160b-24cb-4e48-8df0-fa8d78a11353")
=======
        @objid ("62f2ac06-aa9d-4a1b-af81-c8fdb9e1a656")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("084a4bb9-2b99-483a-94b0-cb031869acdb")
        private static Stereotype MDAASSOCDEP;

        @objid ("10f28c64-1d45-4b48-8ef0-807d48447ad2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("75b5030d-aa53-421c-8229-21a2f80bfcae")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
