/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttributeClass;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram;
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
import org.modelio.metamodel.diagrams.AbstractDiagram;
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
    @objid ("91d18c5e-cdb0-4b03-b01e-5f3fd848db68")
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ad37c78f-8dbd-4d25-8809-e72ac345a598")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    @objid ("99774b31-d3ef-46b3-ac09-62a254c1e401")
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
    @objid ("f9567c23-7a64-48ee-841b-c77fffbf0d4f")
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
    @objid ("7c0a0ac2-c3a5-4f00-8fb6-72f3239813f0")
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
    @objid ("a019326a-448c-4346-b08d-6ae3f1b81ca7")
    public void addAttributContexts(final AttributeContext obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    /**
     * Add a value to the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5e2503c9-5ca4-4c3b-94df-c20667dfd3b7")
    public void addDiagrams(final MetricTypeModelDiagram obj) {
        if (obj!=null)
          ((Package) this.elt).getProduct().add(obj.getElement());
    }

    /**
     * Add a value to the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5cce702f-e1f0-410e-8efa-0fbe70cc853a")
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
    @objid ("0676880a-2b9b-43bd-996a-3673c1ea7aef")
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
    @objid ("72474a1b-0ddc-449a-82ef-9a0bc4504831")
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
    @objid ("ae02a854-c1a8-46f0-a1fa-f1c99d457ee6")
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
    @objid ("8bb47af5-5fed-43c2-a8c4-7500ad1064b4")
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
    @objid ("cc2df4a8-996d-4e68-902a-c9b348c3d9f0")
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
    @objid ("ec678a0d-4ce5-45af-a26d-4f181fb346ec")
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
    @objid ("fc049224-f1c7-406e-a1ba-eb5a8222d6f5")
    public void addWindows(final Window obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("8c777bfb-afc8-4ffa-bb1b-7a6183998a6a")
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
    @objid ("5ea4e61a-40b0-4be5-9ac5-9e90dc7f9869")
    public List<AttributeContext> getAttributContexts() {
        List<AttributeContext> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (AttributeContext.canInstantiate(mObj))
        			results.add((AttributeContext)CamelDesignerProxyFactory.instantiate(mObj, AttributeContext.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the values of the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fd0a13a4-3a6c-4f98-ae0e-7b88d5d8c802")
    public List<MetricTypeModelDiagram> getDiagrams() {
        List<MetricTypeModelDiagram> results = new ArrayList<>();
        for (AbstractDiagram mObj : ((Package) this.elt).getProduct()){
        	if (MetricTypeModelDiagram.canInstantiate(mObj))
        			results.add((MetricTypeModelDiagram)CamelDesignerProxyFactory.instantiate(mObj, MetricTypeModelDiagram.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Package}. 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("86875863-e9ee-4465-b361-d06c77a482a3")
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
    @objid ("cec3b697-f269-4317-9ed4-6c72d284df18")
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
    @objid ("41ff284b-ea20-49ff-801b-0ca220e53f83")
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
    @objid ("c5ede9d9-bd4e-4c60-8eeb-819790fd76e9")
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
    @objid ("dc94c3d4-6c67-4c48-a19f-353197d891ab")
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
    @objid ("50dfb943-8da6-4de3-9e56-90f3828b32d2")
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
    @objid ("278d74f5-830a-4254-9528-090c17590acc")
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
    @objid ("46625477-1d38-4f16-ae86-5019bdf86ac4")
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
    @objid ("34b0b09a-02ac-4af9-9abb-57ccffa3b2c5")
    public List<Window> getWindows() {
        List<Window> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Window.canInstantiate(mObj))
        			results.add((Window)CamelDesignerProxyFactory.instantiate(mObj, Window.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("1e386044-b318-4471-8436-b8e92575c054")
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
    @objid ("ef233f4e-bd68-47bb-9944-5ce6b4d65b14")
    public boolean removeAttributContexts(final AttributeContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("91c0fac6-17b4-49f9-822c-10c4cd78b51f")
    public boolean removeDiagrams(final MetricTypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d2ec1378-66f3-4037-bfa5-209797a5a799")
    public boolean removeFunctions(final Function obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7d096d90-8f48-4e7f-a832-3d0f4f4c0f56")
    public boolean removeMetricContexts(final MetricContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("953396ed-e0bc-4518-8c32-ef0dc2ed82ed")
    public boolean removeMetrics(final Metric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("01262279-0cea-4b68-bf3d-f4b8a87e795a")
    public boolean removeObjectContexts(final ObjectContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("c39a9fd9-4a04-4dd3-afa3-6f6ddf844a55")
    public boolean removeSchedules(final Schedule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8e824d00-0096-4e83-9afb-b184a21302e9")
    public boolean removeSensors(final Sensor obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("17261166-9bc3-417d-94e9-5218d8981b66")
    public boolean removeTemplates(final MetricTemplate obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5ac1e83e-b1fa-45d0-944f-8d3177b61b98")
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

    @objid ("5c2f1dea-259d-465d-8ea4-61c64352351f")
    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("b2e0d996-4162-4a1b-ad97-a59aa22661b6")
    public static final class MdaTypes {
        @objid ("ffd8819a-66e9-416f-9048-53a449d97efe")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a91bec26-52ce-4b16-8acd-f69dc14bc99b")
        private static Stereotype MDAASSOCDEP;

        @objid ("65034a4d-4250-4285-9506-f52cdb61010b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4b5104f5-4a7a-4a6c-aaff-3213551c7219")
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
