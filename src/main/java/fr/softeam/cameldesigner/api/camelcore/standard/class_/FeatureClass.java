/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ApplicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.Cause;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.CommunicationMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.ContainerMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.DataMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryInfo;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.HistoryRecord;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.PaaSMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.RuleTrigger;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SLOViolation;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.SoftwareComponentMeasurement;
import fr.softeam.cameldesigner.api.executionmodel.standard.class_.VMMeasurement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.AttributeContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Function;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.ObjectContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Schedule;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Window;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudProvider;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.DataResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Entity;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ExternalIdentifier;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ModelResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Organisation;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Permission;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.PlatformCredentials;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.Role;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.RoleAssignment;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.ServiceResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.SoftwareComponentResourceFilter;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.User;
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.UserGroup;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Feature_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("6a4c36bc-3125-4731-8439-e795625943d2")
public class FeatureClass extends Feature {
    @objid ("02b3c2a6-8415-44cb-9e87-8ab77688d845")
    public static final String STEREOTYPE_NAME = "Feature_Class";

    /**
     * Tells whether a {@link FeatureClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Feature_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("329cf5ce-75cd-44d5-80ca-9661a40036f0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Feature_Class >> then instantiate a {@link FeatureClass} proxy.
     * 
     * @return a {@link FeatureClass} proxy on the created {@link Class}.
     */
    @objid ("02f4129a-df98-4901-b56b-a0b98f7a11b5")
    public static FeatureClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, FeatureClass.STEREOTYPE_NAME);
        return FeatureClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link FeatureClass} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link FeatureClass} proxy or <i>null</i>.
     */
    @objid ("799416df-97da-4171-ae22-9608294f26fb")
    public static FeatureClass instantiate(final Class obj) {
        return FeatureClass.canInstantiate(obj) ? new FeatureClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FeatureClass} proxy from a {@link Class} stereotyped << Feature_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link FeatureClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a93823be-bf63-4d06-9358-7310e6e67d15")
    public static FeatureClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (FeatureClass.canInstantiate(obj))
        	return new FeatureClass(obj);
        else
        	throw new IllegalArgumentException("FeatureClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f13fd031-dfbc-4553-b8da-6bef1673b22e")
    public void addAttributes(final AttributeAttribute obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    /**
     * Add a value to the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3f3ef64e-b572-49b9-920e-f7350281bf36")
    public void addSubFeatures(final FeatureClass obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("1e569227-43f8-4821-b949-a696103c673b")
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
        FeatureClass other = (FeatureClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("56f567be-ec71-4945-a1ae-5370e88020dc")
    public List<AttributeAttribute> getAttributes() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Attribute mObj : ((Class) this.elt).getOwnedAttribute()){
        	if (AttributeAttribute.canInstantiate(mObj))
        			results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, AttributeAttribute.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("b54da1bd-3334-44d5-a405-e1d2eceedfc1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8175a9b2-db02-4f00-99be-c9a5fa3341f2")
    public FeatureClass getParent() {
        return (FeatureClass)CamelDesignerProxyFactory.instantiate(((Class) this.elt).getOwner(), FeatureClass.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("024f4476-8af3-4183-82ed-36f7b277c1c0")
    public List<FeatureClass> getSubFeatures() {
        List<FeatureClass> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
        	if (Application.canInstantiate(mObj))
        			results.add((Application)CamelDesignerProxyFactory.instantiate(mObj, Application.STEREOTYPE_NAME));
        	if (Data.canInstantiate(mObj))
        			results.add((Data)CamelDesignerProxyFactory.instantiate(mObj, Data.STEREOTYPE_NAME));
        	if (DataSource.canInstantiate(mObj))
        			results.add((DataSource)CamelDesignerProxyFactory.instantiate(mObj, DataSource.STEREOTYPE_NAME));
        	if (RequirementSet.canInstantiate(mObj))
        			results.add((RequirementSet)CamelDesignerProxyFactory.instantiate(mObj, RequirementSet.STEREOTYPE_NAME));
        	if (RuleTrigger.canInstantiate(mObj))
        			results.add((RuleTrigger)CamelDesignerProxyFactory.instantiate(mObj, RuleTrigger.STEREOTYPE_NAME));
        	if (SLOViolation.canInstantiate(mObj))
        			results.add((SLOViolation)CamelDesignerProxyFactory.instantiate(mObj, SLOViolation.STEREOTYPE_NAME));
        	if (Cause.canInstantiate(mObj))
        			results.add((Cause)CamelDesignerProxyFactory.instantiate(mObj, Cause.STEREOTYPE_NAME));
        	if (HistoryInfo.canInstantiate(mObj))
        			results.add((HistoryInfo)CamelDesignerProxyFactory.instantiate(mObj, HistoryInfo.STEREOTYPE_NAME));
        	if (HistoryRecord.canInstantiate(mObj))
        			results.add((HistoryRecord)CamelDesignerProxyFactory.instantiate(mObj, HistoryRecord.STEREOTYPE_NAME));
        	if (ApplicationMeasurement.canInstantiate(mObj))
        			results.add((ApplicationMeasurement)CamelDesignerProxyFactory.instantiate(mObj, ApplicationMeasurement.STEREOTYPE_NAME));
        	if (CommunicationMeasurement.canInstantiate(mObj))
        			results.add((CommunicationMeasurement)CamelDesignerProxyFactory.instantiate(mObj, CommunicationMeasurement.STEREOTYPE_NAME));
        	if (ContainerMeasurement.canInstantiate(mObj))
        			results.add((ContainerMeasurement)CamelDesignerProxyFactory.instantiate(mObj, ContainerMeasurement.STEREOTYPE_NAME));
        	if (DataMeasurement.canInstantiate(mObj))
        			results.add((DataMeasurement)CamelDesignerProxyFactory.instantiate(mObj, DataMeasurement.STEREOTYPE_NAME));
        	if (PaaSMeasurement.canInstantiate(mObj))
        			results.add((PaaSMeasurement)CamelDesignerProxyFactory.instantiate(mObj, PaaSMeasurement.STEREOTYPE_NAME));
        	if (SoftwareComponentMeasurement.canInstantiate(mObj))
        			results.add((SoftwareComponentMeasurement)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponentMeasurement.STEREOTYPE_NAME));
        	if (VMMeasurement.canInstantiate(mObj))
        			results.add((VMMeasurement)CamelDesignerProxyFactory.instantiate(mObj, VMMeasurement.STEREOTYPE_NAME));
        	if (AttributeContext.canInstantiate(mObj))
        			results.add((AttributeContext)CamelDesignerProxyFactory.instantiate(mObj, AttributeContext.STEREOTYPE_NAME));
        	if (Function.canInstantiate(mObj))
        			results.add((Function)CamelDesignerProxyFactory.instantiate(mObj, Function.STEREOTYPE_NAME));
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
        	if (CompositeMetricContext.canInstantiate(mObj))
        			results.add((CompositeMetricContext)CamelDesignerProxyFactory.instantiate(mObj, CompositeMetricContext.STEREOTYPE_NAME));
        	if (RawMetricContext.canInstantiate(mObj))
        			results.add((RawMetricContext)CamelDesignerProxyFactory.instantiate(mObj, RawMetricContext.STEREOTYPE_NAME));
        	if (MetricObjectBinding.canInstantiate(mObj))
        			results.add((MetricObjectBinding)CamelDesignerProxyFactory.instantiate(mObj, MetricObjectBinding.STEREOTYPE_NAME));
        	if (MetricTemplate.canInstantiate(mObj))
        			results.add((MetricTemplate)CamelDesignerProxyFactory.instantiate(mObj, MetricTemplate.STEREOTYPE_NAME));
        	if (ObjectContext.canInstantiate(mObj))
        			results.add((ObjectContext)CamelDesignerProxyFactory.instantiate(mObj, ObjectContext.STEREOTYPE_NAME));
        	if (Schedule.canInstantiate(mObj))
        			results.add((Schedule)CamelDesignerProxyFactory.instantiate(mObj, Schedule.STEREOTYPE_NAME));
        	if (Window.canInstantiate(mObj))
        			results.add((Window)CamelDesignerProxyFactory.instantiate(mObj, Window.STEREOTYPE_NAME));
        	if (CloudCredentials.canInstantiate(mObj))
        			results.add((CloudCredentials)CamelDesignerProxyFactory.instantiate(mObj, CloudCredentials.STEREOTYPE_NAME));
        	if (PlatformCredentials.canInstantiate(mObj))
        			results.add((PlatformCredentials)CamelDesignerProxyFactory.instantiate(mObj, PlatformCredentials.STEREOTYPE_NAME));
        	if (CloudProvider.canInstantiate(mObj))
        			results.add((CloudProvider)CamelDesignerProxyFactory.instantiate(mObj, CloudProvider.STEREOTYPE_NAME));
        	if (Organisation.canInstantiate(mObj))
        			results.add((Organisation)CamelDesignerProxyFactory.instantiate(mObj, Organisation.STEREOTYPE_NAME));
        	if (User.canInstantiate(mObj))
        			results.add((User)CamelDesignerProxyFactory.instantiate(mObj, User.STEREOTYPE_NAME));
        	if (Entity.canInstantiate(mObj))
        			results.add((Entity)CamelDesignerProxyFactory.instantiate(mObj, Entity.STEREOTYPE_NAME));
        	if (ExternalIdentifier.canInstantiate(mObj))
        			results.add((ExternalIdentifier)CamelDesignerProxyFactory.instantiate(mObj, ExternalIdentifier.STEREOTYPE_NAME));
        	if (Permission.canInstantiate(mObj))
        			results.add((Permission)CamelDesignerProxyFactory.instantiate(mObj, Permission.STEREOTYPE_NAME));
        	if (DataResourceFilter.canInstantiate(mObj))
        			results.add((DataResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, DataResourceFilter.STEREOTYPE_NAME));
        	if (ModelResourceFilter.canInstantiate(mObj))
        			results.add((ModelResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, ModelResourceFilter.STEREOTYPE_NAME));
        	if (ServiceResourceFilter.canInstantiate(mObj))
        			results.add((ServiceResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, ServiceResourceFilter.STEREOTYPE_NAME));
        	if (SoftwareComponentResourceFilter.canInstantiate(mObj))
        			results.add((SoftwareComponentResourceFilter)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponentResourceFilter.STEREOTYPE_NAME));
        	if (Role.canInstantiate(mObj))
        			results.add((Role)CamelDesignerProxyFactory.instantiate(mObj, Role.STEREOTYPE_NAME));
        	if (RoleAssignment.canInstantiate(mObj))
        			results.add((RoleAssignment)CamelDesignerProxyFactory.instantiate(mObj, RoleAssignment.STEREOTYPE_NAME));
        	if (UserGroup.canInstantiate(mObj))
        			results.add((UserGroup)CamelDesignerProxyFactory.instantiate(mObj, UserGroup.STEREOTYPE_NAME));
        	if (BinaryEventPattern.canInstantiate(mObj))
        			results.add((BinaryEventPattern)CamelDesignerProxyFactory.instantiate(mObj, BinaryEventPattern.STEREOTYPE_NAME));
        	if (UnaryEventPattern.canInstantiate(mObj))
        			results.add((UnaryEventPattern)CamelDesignerProxyFactory.instantiate(mObj, UnaryEventPattern.STEREOTYPE_NAME));
        	if (FunctionalEvent.canInstantiate(mObj))
        			results.add((FunctionalEvent)CamelDesignerProxyFactory.instantiate(mObj, FunctionalEvent.STEREOTYPE_NAME));
        	if (NonFunctionalEvent.canInstantiate(mObj))
        			results.add((NonFunctionalEvent)CamelDesignerProxyFactory.instantiate(mObj, NonFunctionalEvent.STEREOTYPE_NAME));
        	if (ScalabilityRule.canInstantiate(mObj))
        			results.add((ScalabilityRule)CamelDesignerProxyFactory.instantiate(mObj, ScalabilityRule.STEREOTYPE_NAME));
        	if (Timer.canInstantiate(mObj))
        			results.add((Timer)CamelDesignerProxyFactory.instantiate(mObj, Timer.STEREOTYPE_NAME));
        	if (SecurityControl.canInstantiate(mObj))
        			results.add((SecurityControl)CamelDesignerProxyFactory.instantiate(mObj, SecurityControl.STEREOTYPE_NAME));
        	if (SecurityDomain.canInstantiate(mObj))
        			results.add((SecurityDomain)CamelDesignerProxyFactory.instantiate(mObj, SecurityDomain.STEREOTYPE_NAME));
        	if (FeatureClass.canInstantiate(mObj))
        			results.add((FeatureClass)CamelDesignerProxyFactory.instantiate(mObj, FeatureClass.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("c0c24299-820c-447b-b620-9365b8b93f30")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9e54fbd1-e3db-4914-b3d8-a8dcb15b4b37")
    public boolean removeAttributes(final AttributeAttribute obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("884d5b15-b5b7-4cbe-aedd-46128cd45afe")
    public boolean removeSubFeatures(final FeatureClass obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3ff0090c-d0fd-4fdd-8a9f-da8985c001ff")
    public void setParent(final FeatureClass obj) {
        ((Class) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("6f2ed08a-f287-46db-9942-1543756215e1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("c661920c-02a1-4277-acc5-d1e099a765f4")
    protected FeatureClass(final Class elt) {
        super(elt);
    }

    @objid ("266313b7-34b2-4846-a164-b64005a3816f")
    public static final class MdaTypes {
        @objid ("f5721dc3-fc56-458e-96b8-408897e6a9db")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e89b2915-9eb9-4ece-8dc9-72f22ad3b912")
        private static Stereotype MDAASSOCDEP;

        @objid ("1cda1daf-583d-40a6-9381-c2319883286f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2f407c0b-b049-4a43-b566-c3c38cd15c88")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "babf8276-c4d4-4d86-b02b-d20c6636d937");
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
