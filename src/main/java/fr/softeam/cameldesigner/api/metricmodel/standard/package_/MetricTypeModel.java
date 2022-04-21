/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
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
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
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
    @objid ("ba36678e-35f5-4835-b954-7a8eb6b0e011")
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("983b6950-b403-4444-a9bf-534eaadeae54")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    @objid ("790923f6-befa-412a-9546-6e2c7b523d07")
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
    @objid ("845637c3-5dfb-4e1a-b80d-22b11620ae40")
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
    @objid ("0c98e9ec-1d9b-40d4-8b30-1c0de175c1b3")
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
    @objid ("dfb369a2-4db0-46d6-8959-991ea4243831")
    public void addAttributContexts(final AttributeContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'functions' role.<p>
     * Role description:
     * null
     */
    @objid ("60213d9c-88c7-4254-a1e3-5dd40d9e5ab6")
    public void addFunctions(final Function obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("c4affa41-b35c-4080-9ab8-0a81bd663050")
    public void addMetricContexts(final MetricContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metrics' role.<p>
     * Role description:
     * null
     */
    @objid ("c1409f82-280b-4b05-a900-c8fbe1fca0f7")
    public void addMetrics(final Metric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'objectContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("76ace2f6-280e-4837-be09-efd9e42652a8")
    public void addObjectContexts(final ObjectContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'schedules' role.<p>
     * Role description:
     * null
     */
    @objid ("58f6486f-88ff-49c3-ba9b-cd8bd79f6f77")
    public void addSchedules(final Schedule obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     */
    @objid ("e9775256-b9fb-4af3-8321-8d47e013c425")
    public void addSensors(final Sensor obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'templates' role.<p>
     * Role description:
     * null
     */
    @objid ("a60a53ff-f424-427d-9561-ae41b7589b2e")
    public void addTemplates(final MetricTemplate obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'windows' role.<p>
     * Role description:
     * null
     */
    @objid ("ce126d42-7441-4570-a838-476b3bc62576")
    public void addWindows(final Window obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("36aec1e2-ed53-4628-8b83-80bc21d47b77")
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
    @objid ("4ceeb12d-ecb8-4b60-8ad0-0c2ff18ffc34")
    public List<AttributeContext> getAttributContexts() {
        List<AttributeContext> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (AttributeContext.canInstantiate(mObj))
                    results.add((AttributeContext)CamelDesignerProxyFactory.instantiate(mObj, AttributeContext.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("11719dac-0c2b-4645-8c42-8cedef0aaba4")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'functions' role.<p>
     * Role description:
     * null
     */
    @objid ("2d4122ea-c30c-4f0b-bc1f-c3c9e9fbbf03")
    public List<Function> getFunctions() {
        List<Function> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Function.canInstantiate(mObj))
                    results.add((Function)CamelDesignerProxyFactory.instantiate(mObj, Function.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metricContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("3b36fb1f-3c1a-4256-bfcf-792858911ad0")
    public List<MetricContext> getMetricContexts() {
        List<MetricContext> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (CompositeMetricContext.canInstantiate(mObj))
                    results.add((CompositeMetricContext)CamelDesignerProxyFactory.instantiate(mObj, CompositeMetricContext.STEREOTYPE_NAME));
            if (RawMetricContext.canInstantiate(mObj))
                    results.add((RawMetricContext)CamelDesignerProxyFactory.instantiate(mObj, RawMetricContext.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'metrics' role.<p>
     * Role description:
     * null
     */
    @objid ("d6382d9a-69fb-47c2-9351-bcd3a9dc7fc4")
    public List<Metric> getMetrics() {
        List<Metric> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (CompositeSecurityMetric.canInstantiate(mObj))
                    results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, CompositeSecurityMetric.STEREOTYPE_NAME));
            if (CompositeMetric.canInstantiate(mObj))
                    results.add((CompositeMetric)CamelDesignerProxyFactory.instantiate(mObj, CompositeMetric.STEREOTYPE_NAME));
            if (MetricVariable.canInstantiate(mObj))
                    results.add((MetricVariable)CamelDesignerProxyFactory.instantiate(mObj, MetricVariable.STEREOTYPE_NAME));
            if (RawSecurityMetric.canInstantiate(mObj))
                    results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(mObj, RawSecurityMetric.STEREOTYPE_NAME));
            if (RawMetric.canInstantiate(mObj))
                    results.add((RawMetric)CamelDesignerProxyFactory.instantiate(mObj, RawMetric.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'objectContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("e34db0e4-f155-4aba-b333-e1ff659176ea")
    public List<ObjectContext> getObjectContexts() {
        List<ObjectContext> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (ObjectContext.canInstantiate(mObj))
                    results.add((ObjectContext)CamelDesignerProxyFactory.instantiate(mObj, ObjectContext.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'schedules' role.<p>
     * Role description:
     * null
     */
    @objid ("713172fd-dd32-48bc-b331-27bc6a09a812")
    public List<Schedule> getSchedules() {
        List<Schedule> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Schedule.canInstantiate(mObj))
                    results.add((Schedule)CamelDesignerProxyFactory.instantiate(mObj, Schedule.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     */
    @objid ("97f23691-63e2-4914-8eeb-11b8dbd9ea76")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Sensor.canInstantiate(mObj))
                    results.add((Sensor)CamelDesignerProxyFactory.instantiate(mObj, Sensor.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'templates' role.<p>
     * Role description:
     * null
     */
    @objid ("1b56c97e-895f-45a1-9483-e6c575ed867c")
    public List<MetricTemplate> getTemplates() {
        List<MetricTemplate> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (MetricTemplate.canInstantiate(mObj))
                    results.add((MetricTemplate)CamelDesignerProxyFactory.instantiate(mObj, MetricTemplate.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'windows' role.<p>
     * Role description:
     * null
     */
    @objid ("1099e3ab-5847-4dc2-8e3f-2e329395d52f")
    public List<Window> getWindows() {
        List<Window> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
            if (Window.canInstantiate(mObj))
                    results.add((Window)CamelDesignerProxyFactory.instantiate(mObj, Window.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("7281ede5-adbd-483d-89f0-dac827358ee1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("a2dcaefc-198e-46a6-9f30-a6ab2e1bc78c")
    public boolean removeAttributContexts(final AttributeContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'functions' role.<p>
     * Role description:
     * null
     */
    @objid ("5425676f-0212-482d-b2e1-06a371954c3d")
    public boolean removeFunctions(final Function obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("e729b19e-c210-4802-b42b-c8c5eb2aeda7")
    public boolean removeMetricContexts(final MetricContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metrics' role.<p>
     * Role description:
     * null
     */
    @objid ("75d6a420-b4d4-47b6-883c-6cf29c4de1bb")
    public boolean removeMetrics(final Metric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'objectContexts' role.<p>
     * Role description:
     * null
     */
    @objid ("d75dd0b3-b37a-4d27-b5f8-68eb2cb3d596")
    public boolean removeObjectContexts(final ObjectContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'schedules' role.<p>
     * Role description:
     * null
     */
    @objid ("baf2fb85-43e9-4696-85c2-3700cd605e0b")
    public boolean removeSchedules(final Schedule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     */
    @objid ("1fdcfe1b-9063-41b1-8158-b9e62219e86f")
    public boolean removeSensors(final Sensor obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'templates' role.<p>
     * Role description:
     * null
     */
    @objid ("2076569e-b92e-4682-bdc5-510a229c7efa")
    public boolean removeTemplates(final MetricTemplate obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'windows' role.<p>
     * Role description:
     * null
     */
    @objid ("a7da980f-3b83-4641-8030-500e7c9a612c")
    public boolean removeWindows(final Window obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    @objid ("ac03bb45-c699-4036-860b-01f5b89ff54a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getMetricContexts());
        result.addAll(getAttributContexts());
        result.addAll(getObjectContexts());
        result.addAll(getMetrics());
        result.addAll(getWindows());
        result.addAll(getSchedules());
        result.addAll(getSensors());
        result.addAll(getFunctions());
        result.addAll(getTemplates());
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
    public Collection<MeasurableAttributeClass> getMeasurableAttributes() {
        List<MeasurableAttributeClass> results = new ArrayList<>();
        for (ModelTree mObj : this.getElement().getOwnedElement())
            if (MeasurableAttributeClass.canInstantiate(mObj))
                results.add(MeasurableAttributeClass.safeInstantiate((Class) mObj));
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

    @objid ("a4a57000-23ae-473a-9996-ec10783cbfe1")
    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("b2e0d996-4162-4a1b-ad97-a59aa22661b6")
    public static final class MdaTypes {
        @objid ("8df96e88-8e19-4293-9519-1d0d8b2b5b49")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a21b4db-c19d-45eb-9d29-1b495555c55f")
        private static Stereotype MDAASSOCDEP;

        @objid ("28fcc25a-1bc4-4b53-b5d5-9de95d2b1780")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bb73638c-4d98-45a0-bdf3-b42d33b79261")
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
