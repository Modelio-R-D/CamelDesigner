/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetricTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
public class MetricTypeModel extends MetricModel {
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    public static MetricTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME);
        return MetricTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetricTypeModel} proxy from a {@link Package} stereotyped << MetricTypeModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link MetricTypeModel} proxy or <i>null</i>.
     */
    public static MetricTypeModel instantiate(final Package obj) {
        return MetricTypeModel.canInstantiate(obj) ? new MetricTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricTypeModel} proxy from a {@link Package} stereotyped << MetricTypeModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link MetricTypeModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static MetricTypeModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (MetricTypeModel.canInstantiate(obj))
            return new MetricTypeModel(obj);
        else
            throw new IllegalArgumentException("MetricTypeModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'attributContexts' role.<p>
     * Role description:
     * null
     */
    public void addAttributContexts(final AttributeContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("attributContexts");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "attributContexts");
        }
    }

    /**
     * Add a value to the 'functions' role.<p>
     * Role description:
     * null
     */
    public void addFunctions(final Function obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("functions");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "functions");
        }
    }

    /**
     * Add a value to the 'metricContexts' role.<p>
     * Role description:
     * null
     */
    public void addMetricContexts(final MetricContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("metricContexts");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "metricContexts");
        }
    }

    /**
     * Add a value to the 'metrics' role.<p>
     * Role description:
     * null
     */
    public void addMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("metrics");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "metrics");
        }
    }

    /**
     * Add a value to the 'objectContexts' role.<p>
     * Role description:
     * null
     */
    public void addObjectContexts(final ObjectContext obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("objectContexts");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "objectContexts");
        }
    }

    /**
     * Add a value to the 'schedules' role.<p>
     * Role description:
     * null
     */
    public void addSchedules(final Schedule obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("schedules");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "schedules");
        }
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     */
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    /**
     * Add a value to the 'templates' role.<p>
     * Role description:
     * null
     */
    public void addTemplates(final MetricTemplate obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("templates");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "templates");
        }
    }

    /**
     * Add a value to the 'windows' role.<p>
     * Role description:
     * null
     */
    public void addWindows(final Window obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("windows");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "windows");
        }
    }

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
        MetricTypeModel other = (MetricTypeModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributContexts' role.<p>
     * Role description:
     * null
     */
    public List<AttributeContext> getAttributContexts() {
        List<AttributeContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "attributContexts")
              && AttributeContext.canInstantiate(d.getDependsOn()))
                results.add((AttributeContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeContext.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'functions' role.<p>
     * Role description:
     * null
     */
    public List<Function> getFunctions() {
        List<Function> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "functions")
              && Function.canInstantiate(d.getDependsOn()))
                results.add((Function)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Function.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metricContexts' role.<p>
     * Role description:
     * null
     */
    public List<MetricContext> getMetricContexts() {
        List<MetricContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "metricContexts")
              && MetricContext.canInstantiate(d.getDependsOn()))
                results.add((MetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricContext.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metrics' role.<p>
     * Role description:
     * null
     */
    public List<Metric> getMetrics() {
        List<Metric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "metrics")
              && Metric.canInstantiate(d.getDependsOn()))
                results.add((Metric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Metric.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'objectContexts' role.<p>
     * Role description:
     * null
     */
    public List<ObjectContext> getObjectContexts() {
        List<ObjectContext> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "objectContexts")
              && ObjectContext.canInstantiate(d.getDependsOn()))
                results.add((ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'schedules' role.<p>
     * Role description:
     * null
     */
    public List<Schedule> getSchedules() {
        List<Schedule> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "schedules")
              && Schedule.canInstantiate(d.getDependsOn()))
                results.add((Schedule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Schedule.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     */
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "sensors")
              && Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'templates' role.<p>
     * Role description:
     * null
     */
    public List<MetricTemplate> getTemplates() {
        List<MetricTemplate> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "templates")
              && MetricTemplate.canInstantiate(d.getDependsOn()))
                results.add((MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'windows' role.<p>
     * Role description:
     * null
     */
    public List<Window> getWindows() {
        List<Window> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "windows")
              && Window.canInstantiate(d.getDependsOn()))
                results.add((Window)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Window.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributContexts' role.<p>
     * Role description:
     * null
     */
    public boolean removeAttributContexts(final AttributeContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'functions' role.<p>
     * Role description:
     * null
     */
    public boolean removeFunctions(final Function obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metricContexts' role.<p>
     * Role description:
     * null
     */
    public boolean removeMetricContexts(final MetricContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metrics' role.<p>
     * Role description:
     * null
     */
    public boolean removeMetrics(final Metric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'objectContexts' role.<p>
     * Role description:
     * null
     */
    public boolean removeObjectContexts(final ObjectContext obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'schedules' role.<p>
     * Role description:
     * null
     */
    public boolean removeSchedules(final Schedule obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     */
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'templates' role.<p>
     * Role description:
     * null
     */
    public boolean removeTemplates(final MetricTemplate obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'windows' role.<p>
     * Role description:
     * null
     */
    public boolean removeWindows(final Window obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricTypeModel.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "76545176-b1ff-442f-8629-bc2c4845dbdb");
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
