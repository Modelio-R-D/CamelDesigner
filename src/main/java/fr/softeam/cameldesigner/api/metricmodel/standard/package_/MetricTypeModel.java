/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
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
    @objid ("3378f626-5689-41ee-95ff-fca62154a6ee")
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("aefe8c29-8166-453f-9212-9b072b32abf5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    @objid ("324c7e2d-bb37-401b-9636-4273e038e66e")
    public static MetricTypeModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME);
        return MetricTypeModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link MetricTypeModel} proxy from a {@link Package} stereotyped << MetricTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Package
     * @return a {@link MetricTypeModel} proxy or <i>null</i>.
     */
    @objid ("90079412-e55a-4f91-88be-b6e9ef707191")
    public static MetricTypeModel instantiate(final Package obj) {
        return MetricTypeModel.canInstantiate(obj) ? new MetricTypeModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricTypeModel} proxy from a {@link Package} stereotyped << MetricTypeModel >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Package}
     * @return a {@link MetricTypeModel} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4b28e594-bd45-4745-ace8-7bbf5c4432e7")
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
     * 
     */
    @objid ("3c64524d-b499-48a8-b63d-400f6f3b241c")
    public void addAttributContexts(final AttributeContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9560848e-c89f-47fc-a28d-65fceb10c0cd")
    public void addFunctions(final Function obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("acd01177-e95d-4bf3-9f70-24a4692d7ca7")
    public void addMetricContexts(final MetricContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0f4a463a-8cf8-4c3a-8325-14e59d7d0b6e")
    public void addMetrics(final Metric obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a86a30ab-f64d-47d5-8bf4-a9f23c2057a4")
    public void addObjectContexts(final ObjectContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("42f7bd5a-b5c4-4785-a961-14523eeb10a9")
    public void addSchedules(final Schedule obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8659eb63-f726-4000-bbc5-fcbf0a51c99f")
    public void addSensors(final Sensor obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3c05def2-49f2-471f-8bbe-a1fb84c2a581")
    public void addTemplates(final MetricTemplate obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3aaa2856-8b26-43d0-82e3-35950e187aba")
    public void addWindows(final Window obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("ab489687-201f-406f-adf5-f534a37a1c56")
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
     * 
     */
    @objid ("b9876306-78ee-472c-b062-006c8758b9b6")
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
     * @return the Package represented by this proxy, never null.
     */
    @objid ("93331392-987d-4216-9a34-e284491be0f8")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Get the values of the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91b50869-01e9-443c-ac02-073c5ea13281")
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
     * 
     */
    @objid ("1cdedd68-c3da-4631-8c54-c1a56ba37b3f")
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
     * 
     */
    @objid ("f74f2b02-ea6f-4ab1-9a97-5caa3a95f77b")
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
     * 
     */
    @objid ("e6b0ca10-9a3a-40a6-88ce-cdf956345fd7")
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
     * 
     */
    @objid ("0aa4a2cf-7649-4c8c-98bb-ff4bb040c66d")
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
     * 
     */
    @objid ("67708181-2cd1-4c77-8393-2978965bd925")
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
     * 
     */
    @objid ("b4a17ca6-a6a4-4b35-90ae-0e9caefdd4be")
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
     * 
     */
    @objid ("2f5eb434-13fe-4eec-a2cd-ec72e49f400a")
    public List<Window> getWindows() {
        List<Window> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Window.canInstantiate(mObj))
        			results.add((Window)CamelDesignerProxyFactory.instantiate(mObj, Window.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("7361b217-32ab-4e8e-bfca-993b6368bbfa")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ce916938-1b92-4100-98df-6a4bc2d6c172")
    public boolean removeAttributContexts(final AttributeContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("da0242a3-3334-4949-a455-fb63f092d3bf")
    public boolean removeFunctions(final Function obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("53026905-6ef1-48fa-aa99-afb96502a16c")
    public boolean removeMetricContexts(final MetricContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c633705e-e0b4-4d41-bbce-907b35ebeca1")
    public boolean removeMetrics(final Metric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a4715299-eab4-4c6c-9cd5-138020941018")
    public boolean removeObjectContexts(final ObjectContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0ee60c6d-f587-4007-86ed-bfb7e7f46236")
    public boolean removeSchedules(final Schedule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a8ebed44-9215-4aea-aa3e-100b16f313d6")
    public boolean removeSensors(final Sensor obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("df2134fb-89f5-4cd7-954d-750e6d470513")
    public boolean removeTemplates(final MetricTemplate obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("647873b9-f8d3-4af2-a949-a089661b2852")
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

    @objid ("9c3c1606-bb19-4d8e-9e4f-23da41c85261")
    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("b2e0d996-4162-4a1b-ad97-a59aa22661b6")
    public static final class MdaTypes {
        @objid ("1b400086-9291-4679-98e2-3635e9073fd7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d26f9360-81d2-4929-972c-13accf815f8f")
        private static Stereotype MDAASSOCDEP;

        @objid ("adbf1c53-25da-41bb-9275-5ac9e36a03c3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("68d5c6a3-c444-44a8-a8fb-200f07ed5a4b")
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
