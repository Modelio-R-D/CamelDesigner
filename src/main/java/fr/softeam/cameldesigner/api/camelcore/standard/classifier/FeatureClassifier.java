/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.camelcore.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.MeasurableAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.QualityAttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
import fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ContainerConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ImageConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.PaaSConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ScriptConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ServerlessConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.class_.RequirementSet;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
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
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
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
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.WindowProcessing;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.CommunicationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.HorizontalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.LocationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.OptimisationRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.PaaSRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ProviderRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ResourceRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.SecurityRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.ServiceLevelObjective;
import fr.softeam.cameldesigner.api.requirementmodel.standard.class_.VerticalScaleRequirement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.enumeration.ImageRequirement;
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
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << Feature_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2d7f6e37-5b08-4a69-88e8-d8b0a19ca96a")
public abstract class FeatureClassifier extends Feature {
<<<<<<< HEAD
    @objid ("c1dc4d11-b9d4-4425-8891-0d2f7587b679")
=======
    @objid ("f685868a-cf87-4e29-beaf-d71f6b5f1271")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "Feature_Classifier";

    /**
     * Tells whether a {@link FeatureClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << Feature_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c307c06d-113c-464c-a54d-fcd9a476dd6d")
=======
    @objid ("3c9927a2-e498-496e-bb66-5c7924f1efba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, FeatureClassifier.STEREOTYPE_NAME));
    }

    /**
     * Add a value to the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("e5ea130e-198d-485b-aa71-a74e2d9e604e")
=======
    @objid ("2c849593-6178-4251-82e8-99f825f94d40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addAttributes(final AttributeAttribute obj) {
        if (obj!=null)
          ((Classifier) this.elt).getOwnedAttribute().add(obj.getElement());
    }

    /**
     * Add a value to the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fdff4ac4-ad40-456c-88af-b066734c8c69")
=======
    @objid ("8770c8f0-ad90-41d5-9799-d635e174f1c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addSubFeatures(final FeatureClassifier obj) {
        if (obj!=null)
          ((Classifier) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("b6a66fc5-c1e7-48a1-9dd2-96c042892b93")
=======
    @objid ("f6a02d0f-9460-4759-92a3-a4cae14f2f5a")
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
        FeatureClassifier other = (FeatureClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'attributes' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("daa03967-6034-48ae-b48d-6131922e5a23")
=======
    @objid ("42721cd8-b397-49d1-b568-82d5505735fd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<AttributeAttribute> getAttributes() {
        List<AttributeAttribute> results = new ArrayList<>();
        for (Attribute mObj : ((Classifier) this.elt).getOwnedAttribute()){
        	if (MeasurableAttributeAttribute.canInstantiate(mObj))
        			results.add((MeasurableAttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, MeasurableAttributeAttribute.STEREOTYPE_NAME));
        	if (QualityAttributeAttribute.canInstantiate(mObj))
        			results.add((QualityAttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, QualityAttributeAttribute.STEREOTYPE_NAME));
        	if (AttributeAttribute.canInstantiate(mObj))
        			results.add((AttributeAttribute)CamelDesignerProxyFactory.instantiate(mObj, AttributeAttribute.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("56d1a5e1-aaa1-4bc2-b962-ec17a26bc46c")
=======
    @objid ("32fab0c6-0269-4327-af1b-1073ae99bad2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Get the value to the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("139d07a8-30a0-4320-bcf9-2b9c2cfded8e")
=======
    @objid ("39087937-7043-4259-ba09-9231a584903c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public FeatureClassifier getParent() {
        return (FeatureClassifier)CamelDesignerProxyFactory.instantiate(((Classifier) this.elt).getOwner(), FeatureClassifier.STEREOTYPE_NAME);
    }

    /**
     * Get the values of the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("76c62dd3-641b-4e39-80ac-fa03656a697a")
=======
    @objid ("ff7a39b3-c2a4-4b94-a922-8afb8f822f01")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<FeatureClassifier> getSubFeatures() {
        List<FeatureClassifier> results = new ArrayList<>();
        for (ModelTree mObj : ((Classifier) this.elt).getOwnedElement()){
        	if (BuildConfiguration.canInstantiate(mObj))
        			results.add((BuildConfiguration)CamelDesignerProxyFactory.instantiate(mObj, BuildConfiguration.STEREOTYPE_NAME));
        	if (ClusterConfiguration.canInstantiate(mObj))
        			results.add((ClusterConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ClusterConfiguration.STEREOTYPE_NAME));
        	if (PaaSConfiguration.canInstantiate(mObj))
        			results.add((PaaSConfiguration)CamelDesignerProxyFactory.instantiate(mObj, PaaSConfiguration.STEREOTYPE_NAME));
        	if (ScriptConfiguration.canInstantiate(mObj))
        			results.add((ScriptConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ScriptConfiguration.STEREOTYPE_NAME));
        	if (ServerlessConfiguration.canInstantiate(mObj))
        			results.add((ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ServerlessConfiguration.STEREOTYPE_NAME));
<<<<<<< HEAD
        	if (ImageConfiguration.canInstantiate(mObj))
        			results.add((ImageConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ImageConfiguration.STEREOTYPE_NAME));
        	if (ContainerConfiguration.canInstantiate(mObj))
        			results.add((ContainerConfiguration)CamelDesignerProxyFactory.instantiate(mObj, ContainerConfiguration.STEREOTYPE_NAME));
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        	if (EventConfiguration.canInstantiate(mObj))
        			results.add((EventConfiguration)CamelDesignerProxyFactory.instantiate(mObj, EventConfiguration.STEREOTYPE_NAME));
        	if (FeatureArtifact.canInstantiate(mObj))
        			results.add((FeatureArtifact)CamelDesignerProxyFactory.instantiate(mObj, FeatureArtifact.STEREOTYPE_NAME));
        	if (Application.canInstantiate(mObj))
        			results.add((Application)CamelDesignerProxyFactory.instantiate(mObj, Application.STEREOTYPE_NAME));
        	if (Data.canInstantiate(mObj))
        			results.add((Data)CamelDesignerProxyFactory.instantiate(mObj, Data.STEREOTYPE_NAME));
        	if (DataSource.canInstantiate(mObj))
        			results.add((DataSource)CamelDesignerProxyFactory.instantiate(mObj, DataSource.STEREOTYPE_NAME));
        	if (Container.canInstantiate(mObj))
        			results.add((Container)CamelDesignerProxyFactory.instantiate(mObj, Container.STEREOTYPE_NAME));
        	if (PaaS.canInstantiate(mObj))
        			results.add((PaaS)CamelDesignerProxyFactory.instantiate(mObj, PaaS.STEREOTYPE_NAME));
        	if (Sensor.canInstantiate(mObj))
        			results.add((Sensor)CamelDesignerProxyFactory.instantiate(mObj, Sensor.STEREOTYPE_NAME));
        	if (SoftwareComponent.canInstantiate(mObj))
        			results.add((SoftwareComponent)CamelDesignerProxyFactory.instantiate(mObj, SoftwareComponent.STEREOTYPE_NAME));
        	if (VM.canInstantiate(mObj))
        			results.add((VM)CamelDesignerProxyFactory.instantiate(mObj, VM.STEREOTYPE_NAME));
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
<<<<<<< HEAD
        	if (WindowProcessing.canInstantiate(mObj))
        			results.add((WindowProcessing)CamelDesignerProxyFactory.instantiate(mObj, WindowProcessing.STEREOTYPE_NAME));
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
        	if (SingleUnit.canInstantiate(mObj))
        			results.add((SingleUnit)CamelDesignerProxyFactory.instantiate(mObj, SingleUnit.STEREOTYPE_NAME));
        	if (CompositeUnit.canInstantiate(mObj))
        			results.add((CompositeUnit)CamelDesignerProxyFactory.instantiate(mObj, CompositeUnit.STEREOTYPE_NAME));
        	if (Dimensionless.canInstantiate(mObj))
        			results.add((Dimensionless)CamelDesignerProxyFactory.instantiate(mObj, Dimensionless.STEREOTYPE_NAME));
        	if (UnitDimension.canInstantiate(mObj))
        			results.add((UnitDimension)CamelDesignerProxyFactory.instantiate(mObj, UnitDimension.STEREOTYPE_NAME));
        	if (FeatureDataType.canInstantiate(mObj))
        			results.add((FeatureDataType)CamelDesignerProxyFactory.instantiate(mObj, FeatureDataType.STEREOTYPE_NAME));
        	if (CloudLocation.canInstantiate(mObj))
        			results.add((CloudLocation)CamelDesignerProxyFactory.instantiate(mObj, CloudLocation.STEREOTYPE_NAME));
        	if (GeographicalRegion.canInstantiate(mObj))
        			results.add((GeographicalRegion)CamelDesignerProxyFactory.instantiate(mObj, GeographicalRegion.STEREOTYPE_NAME));
        	if (FeatureEnumeration.canInstantiate(mObj))
        			results.add((FeatureEnumeration)CamelDesignerProxyFactory.instantiate(mObj, FeatureEnumeration.STEREOTYPE_NAME));
        	if (ImageRequirement.canInstantiate(mObj))
        			results.add((ImageRequirement)CamelDesignerProxyFactory.instantiate(mObj, ImageRequirement.STEREOTYPE_NAME));
        	if (LocationRequirement.canInstantiate(mObj))
        			results.add((LocationRequirement)CamelDesignerProxyFactory.instantiate(mObj, LocationRequirement.STEREOTYPE_NAME));
        	if (OSRequirement.canInstantiate(mObj))
        			results.add((OSRequirement)CamelDesignerProxyFactory.instantiate(mObj, OSRequirement.STEREOTYPE_NAME));
        	if (PaaSRequirement.canInstantiate(mObj))
        			results.add((PaaSRequirement)CamelDesignerProxyFactory.instantiate(mObj, PaaSRequirement.STEREOTYPE_NAME));
        	if (ProviderRequirement.canInstantiate(mObj))
        			results.add((ProviderRequirement)CamelDesignerProxyFactory.instantiate(mObj, ProviderRequirement.STEREOTYPE_NAME));
        	if (ResourceRequirement.canInstantiate(mObj))
        			results.add((ResourceRequirement)CamelDesignerProxyFactory.instantiate(mObj, ResourceRequirement.STEREOTYPE_NAME));
        	if (HorizontalScaleRequirement.canInstantiate(mObj))
        			results.add((HorizontalScaleRequirement)CamelDesignerProxyFactory.instantiate(mObj, HorizontalScaleRequirement.STEREOTYPE_NAME));
        	if (VerticalScaleRequirement.canInstantiate(mObj))
        			results.add((VerticalScaleRequirement)CamelDesignerProxyFactory.instantiate(mObj, VerticalScaleRequirement.STEREOTYPE_NAME));
        	if (SecurityRequirement.canInstantiate(mObj))
        			results.add((SecurityRequirement)CamelDesignerProxyFactory.instantiate(mObj, SecurityRequirement.STEREOTYPE_NAME));
        	if (SecuritySLO.canInstantiate(mObj))
        			results.add((SecuritySLO)CamelDesignerProxyFactory.instantiate(mObj, SecuritySLO.STEREOTYPE_NAME));
        	if (ServiceLevelObjective.canInstantiate(mObj))
        			results.add((ServiceLevelObjective)CamelDesignerProxyFactory.instantiate(mObj, ServiceLevelObjective.STEREOTYPE_NAME));
<<<<<<< HEAD
        	if (CommunicationRequirement.canInstantiate(mObj))
        			results.add((CommunicationRequirement)CamelDesignerProxyFactory.instantiate(mObj, CommunicationRequirement.STEREOTYPE_NAME));
=======
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        	if (OptimisationRequirement.canInstantiate(mObj))
        			results.add((OptimisationRequirement)CamelDesignerProxyFactory.instantiate(mObj, OptimisationRequirement.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("7d0381bb-69eb-4deb-973d-4679e97541ab")
=======
    @objid ("c3516ec3-d035-4e38-8a07-95587991e3e2")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a6bd8305-012a-42ec-b3b6-430225795442")
=======
    @objid ("69855f40-2953-4afd-bec0-ab244c6d0573")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeAttributes(final AttributeAttribute obj) {
        return (obj!=null)? ((Classifier) this.elt).getOwnedAttribute().remove(obj.getElement()) : false;
    }

    /**
     * Remove a value from the 'subFeatures' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("84f5d931-3c1a-484c-9e6d-5450b6502e8c")
=======
    @objid ("460b1b99-34e6-4e5b-9499-91cb3fffd6c7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeSubFeatures(final FeatureClassifier obj) {
        return (obj!=null)? ((Classifier) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'parent' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("fe225cb4-d77a-4f6d-a18d-bb02f3216187")
=======
    @objid ("001a0167-d5c5-46fb-8eeb-79809efdff0c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setParent(final FeatureClassifier obj) {
        ((Classifier) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    @objid ("a53fcab5-822d-4017-bcb1-08ea6ff899d1")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        result.addAll(getSubFeatures());
        result.addAll(getAttributes());
        return result;
    }

<<<<<<< HEAD
    @objid ("09b57c5e-65c6-42d2-89a9-3de9b1793e1e")
=======
    @objid ("ba91187c-f224-4ae5-87c6-16e5cdfc27db")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected FeatureClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("625f1330-cd2e-4a07-af63-465f510059f1")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("a8c67c82-ab68-44a1-a5ac-b940e2297c89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a013e084-c8f7-429e-b757-e6b89afb66b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("be7165e6-0c84-4c89-9c38-4baf618d14d3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("15c647aa-8716-4090-8665-67ef749a407d")
=======
        @objid ("69be29d4-b32b-4c8c-9716-ab845a67835e")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("bd54e3d5-27ca-4738-a7a5-61d6b5edefbf")
        private static Stereotype MDAASSOCDEP;

        @objid ("33b5b651-5933-4b79-8d97-6ae5127f6dda")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("dc6fc9fb-8883-4571-88ff-989a5f132c93")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "7c5a3627-4282-427f-93a3-957cdca1adb7");
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
