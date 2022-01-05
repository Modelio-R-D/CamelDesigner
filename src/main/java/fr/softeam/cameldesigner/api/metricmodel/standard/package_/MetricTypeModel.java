/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
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
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << MetricTypeModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("30ab5720-bd4b-4612-8c18-791b8446b14d")
public class MetricTypeModel extends MetricModel {
    @objid ("3bd157a7-a69a-48a0-94e2-86171314e6a9")
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("fec590fe-66ec-4e9c-b567-bb17f3f19c2b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    @objid ("db590d74-5c4b-408f-b543-27a589a62508")
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
    @objid ("12694028-e6e7-4aa5-94a0-aebd2ec0a766")
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
    @objid ("61f039bb-0cae-4363-833e-e2c9d22620b6")
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
    @objid ("4f76084d-3968-404b-9c17-afab29e11e10")
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
    @objid ("02040d0e-2cfa-44a1-915d-2a8f49af9d24")
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
    @objid ("3054d9b3-9800-4208-9c82-aca89420051a")
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
    @objid ("0c1bfd36-5b4b-47bd-9a39-17b7393f0f2e")
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
    @objid ("f5a863ac-1530-4fae-801a-8c03a6c9d242")
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
    @objid ("1eac985c-f3c0-4d55-9b87-a8c93531b3a1")
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
    @objid ("0f37a051-369a-418d-9fbb-1c4b67afc437")
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
    @objid ("e175447d-7269-4c5d-addb-f37022cd49fe")
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
    @objid ("ad1b1f52-e797-48a9-bbc4-8005c0dd16ec")
    public void addWindows(final Window obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricTypeModel.MdaTypes.MDAASSOCDEP);
            d.setName("windows");
            d.putTagValue(MetricTypeModel.MdaTypes.MDAASSOCDEP_ROLE, "windows");
        }
    }

    @objid ("cd54c14c-d030-4528-8fe0-3009d53b83c0")
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
    @objid ("7c7ae5b0-9a75-4556-b1eb-21bc95a9d334")
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
    @objid ("5dbfcf28-62b5-4aa3-9072-a9c6bb07a008")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'functions' role.<p>
     * Role description:
     * null
     */
    @objid ("5b28082e-0d3f-477b-914c-329e39283a0b")
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
    @objid ("576932c6-9893-4589-9d9d-4c883d88e7e6")
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
    @objid ("b6427310-190b-4da2-b4b8-c68c7a9d90ef")
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
    @objid ("0bb0625e-1a9a-4631-b2dc-b5a7b62746d2")
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
    @objid ("edde2ab4-5d53-41c4-994b-2922081d77d5")
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
    @objid ("1f01c9ee-84d7-49b4-a2d1-f9b38e98ba3f")
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
    @objid ("2f17479d-bf20-42f6-9ffc-92b7f6c78327")
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
    @objid ("c9aacdd1-91a0-476f-acbc-b85ef82da0bb")
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

    @objid ("33a89b7e-ed33-4552-bc1a-a75e1caea063")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("a80f8dd2-ec33-44cf-b455-b53a92ec4f01")
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
    @objid ("d9f2328b-93ed-4df5-9447-95b8b0537a17")
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
    @objid ("cdaea8ab-10f9-49c6-aeb1-9e8cf6926797")
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
    @objid ("e588090e-6301-467a-800d-6f91a3b57857")
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
    @objid ("0a9855ea-9da9-4152-b398-38917ca59bde")
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
    @objid ("409f6dc9-2a5e-4f31-905a-7ef9aab619e5")
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
    @objid ("f3621b6d-4f35-4bc8-bbe6-d236c87c9a37")
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
    @objid ("33f5a712-c8f0-42f2-b0ed-fb580606dbcc")
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
    @objid ("07f1e931-4f45-4412-b7fa-17cc2f85180b")
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

    @objid ("58af0a33-fac1-4888-ad82-73c94e9e9109")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(getMeasurableAttributes());
        result.addAll(getSensors());
        result.addAll(getRawMetrics());
        result.addAll(getMetricTemplates());
        result.addAll(getObjectContexts());
        result.addAll(getSchedules());
        result.addAll(getRawMetricContexts());
        result.addAll(getWindows());
        result.addAll(getCompositeMetrics());
        result.addAll(getCompositeMetricContexts());
        result.addAll(getMetricVariables());
        return result;
    }

    @objid ("45bbb405-5706-406d-a644-c02739b067ed")
    public Collection<CompositeMetricContext> getCompositeMetricContexts() {
        List<CompositeMetricContext> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (CompositeMetricContext.canInstantiate(mObj))
                results.add(CompositeMetricContext.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("7a5befe6-9cda-4a4f-88d0-eaf86c6e2a4b")
    public Collection<CompositeMetric> getCompositeMetrics() {
        List<CompositeMetric> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (CompositeMetric.canInstantiate(mObj))
                results.add(CompositeMetric.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("1da6503b-7f31-48fa-bba2-0618f55fd056")
    public Collection<MeasurableAttribute> getMeasurableAttributes() {
        List<MeasurableAttribute> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (MeasurableAttribute.canInstantiate(mObj))
                results.add(MeasurableAttribute.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("b8ba8837-0bc3-43e0-899d-28d1745963be")
    public Collection<MetricTemplate> getMetricTemplates() {
        List<MetricTemplate> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (MetricTemplate.canInstantiate(mObj))
                results.add(MetricTemplate.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("e79bc2be-20c8-467f-97fc-1b0efff8af62")
    public Collection<MetricVariable> getMetricVariables() {
        List<MetricVariable> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (MetricVariable.canInstantiate(mObj))
                results.add(MetricVariable.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("e93758fb-d80b-4de9-9217-bfb79190b794")
    public Collection<RawMetricContext> getRawMetricContexts() {
        List<RawMetricContext> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (RawMetricContext.canInstantiate(mObj))
                results.add(RawMetricContext.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("13db1276-e4fd-4ce5-a261-bebb80fe31d2")
    public Collection<RawMetric> getRawMetrics() {
        List<RawMetric> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (RawMetric.canInstantiate(mObj))
                results.add(RawMetric.safeInstantiate((Class) mObj));
        return Collections.unmodifiableList(results);
    }

    @objid ("6f5c126f-4b03-4cf1-893c-394c94842b23")
    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("b2e0d996-4162-4a1b-ad97-a59aa22661b6")
    public static final class MdaTypes {
        @objid ("4b599623-9117-4426-b430-287f3698ab9e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("16ad0080-8244-45e0-bc9e-90404102ac54")
        private static Stereotype MDAASSOCDEP;

        @objid ("485e117d-fa72-4d8f-ab84-dbda337ad631")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd797189-4084-4c7a-8249-0c85da246710")
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
