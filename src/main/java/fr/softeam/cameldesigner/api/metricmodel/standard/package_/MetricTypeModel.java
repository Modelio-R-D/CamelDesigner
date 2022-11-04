/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("0783ce0e-c938-4dfc-82c0-635e2406424c")
    public static final String STEREOTYPE_NAME = "MetricTypeModel";

    /**
     * Tells whether a {@link MetricTypeModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << MetricTypeModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0603afe8-aa3a-45d6-9042-a6b718c75240")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricTypeModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << MetricTypeModel >> then instantiate a {@link MetricTypeModel} proxy.
     * 
     * @return a {@link MetricTypeModel} proxy on the created {@link Package}.
     */
    @objid ("c7ad80e8-80cd-4e1e-9543-8c927ddb6f08")
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
    @objid ("a37eb210-00b6-40e1-a09e-416aca82267b")
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
    @objid ("6826049d-31f9-44e4-906c-033ac613893b")
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
    @objid ("25859d65-650c-4d26-9a77-1f715d711f5c")
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
    @objid ("3f599e81-adb4-4b3d-8f8c-245b19b13c54")
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
    @objid ("214dc445-753e-4188-be8e-ade15d848681")
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
    @objid ("c309798c-253c-4919-a78d-5f9031fd9173")
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
    @objid ("5094df2d-f222-4e7c-8d57-6088809a319e")
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
    @objid ("a8980c07-e0e6-4fd3-90ea-fae588895716")
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
    @objid ("e976b2af-d88c-4375-8e6c-637b5810b076")
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
    @objid ("f146be42-ce98-4373-9fe0-2b0b6b62908a")
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
    @objid ("ed878292-84ba-432e-9cfb-0d199a60a6bb")
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
    @objid ("7064c2ae-b183-4aa9-b20e-9bdb00770f66")
    public void addWindows(final Window obj) {
        if (obj!=null)
          ((Package) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("17a30c19-7fc8-4310-ac10-20438c49462d")
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
    @objid ("1ef4b326-825e-48c2-a237-34b8d141edb3")
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
    @objid ("76abfa68-5d33-4a5f-abcc-aebf49b1ae5f")
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
    @objid ("d0521ce9-6eba-4416-a1d7-594766777da6")
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
    @objid ("cfb81acd-bbb0-496c-a1d3-063e889a70fe")
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
    @objid ("b7dfc83d-b55a-4db3-8261-4cb364f5da6a")
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
    @objid ("538742a8-daa1-41d6-904f-5ad9f67acc9c")
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
    @objid ("da49e383-cc86-4fc2-990a-3f65a762ae7c")
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
    @objid ("fb8295dd-c17c-41ae-85d8-a1acd59cd948")
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
    @objid ("771d2819-8299-432f-a64c-a096d72a14ae")
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
    @objid ("10672c1a-3f97-47c8-88a6-4d3fd0db2f87")
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
    @objid ("cc5a780f-1867-4618-9c72-7d8c2bcdaf93")
    public List<Window> getWindows() {
        List<Window> results = new ArrayList<>();
        for (ModelTree mObj : ((Package) this.elt).getOwnedElement()){
        	if (Window.canInstantiate(mObj))
        			results.add((Window)CamelDesignerProxyFactory.instantiate(mObj, Window.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("f58d08d6-2a81-4793-97c3-8b6bfc78e093")
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
    @objid ("6a247b32-caba-4e56-9125-260efc8f59c7")
    public boolean removeAttributContexts(final AttributeContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'Diagrams' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("b270bbe9-db2a-4d32-9066-cca822a968ea")
    public boolean removeDiagrams(final MetricTypeModelDiagram obj) {
        return (obj!=null)? ((Package) this.elt).getProduct().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'functions' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("5fa2ab1c-ce9f-45fd-9fa2-ae9f237ce53d")
    public boolean removeFunctions(final Function obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metricContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("e672aa4d-66b2-4ab8-b145-81662a6bd8ed")
    public boolean removeMetricContexts(final MetricContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'metrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("27d6e1e0-c24e-4ed3-8689-7ca5452e5e0b")
    public boolean removeMetrics(final Metric obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'objectContexts' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d4ff0f63-782e-4f35-af9a-1d76f9aa996c")
    public boolean removeObjectContexts(final ObjectContext obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'schedules' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a34b05fa-53af-4edf-842a-a44f74e6d3a7")
    public boolean removeSchedules(final Schedule obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d09e9eb3-46ae-41e0-8eaa-fe438c3989b4")
    public boolean removeSensors(final Sensor obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'templates' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("cae811fa-8e46-436f-b12c-6eba8d8f312c")
    public boolean removeTemplates(final MetricTemplate obj) {
        return (obj!=null)? ((Package) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'windows' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("bc7a39dd-d79f-4dc1-935f-bc581edcbee8")
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

    @objid ("45bd343e-b6db-4193-b977-44b658e452f5")
    protected MetricTypeModel(final Package elt) {
        super(elt);
    }

    @objid ("b2e0d996-4162-4a1b-ad97-a59aa22661b6")
    public static final class MdaTypes {
        @objid ("2c935785-35b5-4942-801d-5f12b29b8c0c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("77074e49-c86d-4af5-a23c-b05ddc38980b")
        private static Stereotype MDAASSOCDEP;

        @objid ("836def13-26c1-4a7a-8934-918c8e7b66b6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fdada46a-c67e-4c8e-ba38-891c4deb1a46")
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
