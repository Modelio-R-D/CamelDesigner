/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.Feature;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.connector.FeatureConnector;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
import fr.softeam.cameldesigner.api.camelcore.standard.enumeration.FeatureEnumeration;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.api.datamodel.standard.bindableinstance.DataInstanceBindableInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.Data;
import fr.softeam.cameldesigner.api.datamodel.standard.class_.DataSource;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.instance.DataSourceInstance;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataInstanceModel;
import fr.softeam.cameldesigner.api.datamodel.standard.package_.DataTypeModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.CommunicationInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.connector.HostingInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.ContainerInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.PaaSInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.SoftwareComponentInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.instance.VMInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.package_.DeploymentInstanceModel;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.CommunicationPortInstance;
import fr.softeam.cameldesigner.api.deploymentinstancemodel.standard.port.HostingPortInstance;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Conditional;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Parallel;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Precedes;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Sequence;
import fr.softeam.cameldesigner.api.deploymentmodel.infrastructure.modelelement.Switch;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Communication;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.Hosting;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.connector.LocationCoupling;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.package_.DeploymentTypeModel;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.CommunicationPort;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.port.HostingPort;
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
import fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.standard.package_.MetaDataModel;
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
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricInstanceModel;
import fr.softeam.cameldesigner.api.metricmodel.standard.package_.MetricTypeModel;
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
import fr.softeam.cameldesigner.api.organisationmodel.standard.package_.OrganisationModel;
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
import fr.softeam.cameldesigner.api.requirementmodel.standard.package_.RequirementModel;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.BinaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.FunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.HorizontalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.NonFunctionalEvent;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.ScalabilityRule;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.Timer;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.UnaryEventPattern;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.class_.VerticalScalingAction;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.package_.ScalabilityModel;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Artifact} with << ContainerConfiguration >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a519dc9c-8511-467e-8f44-e3456ff54618")
public class ContainerConfiguration extends Configuration {
    @objid ("733b2096-7951-413f-a73a-e4183db5fa5a")
    public static final String STEREOTYPE_NAME = "ContainerConfiguration";

    @objid ("d70fba41-1a6d-4f0f-b45d-5ec0dc60a115")
    public static final String IMAGEID_TAGTYPE = "imageId";

    @objid ("031776f4-4777-45cf-a735-5040f85ff8d4")
    public static final String STARTCOMMAND_NOTETYPE = "startCommand";

    @objid ("86cdf3f4-7a9a-4c23-9d39-0af51677bc0a")
    public static final String UPDATECOMMAND_NOTETYPE = "updateCommand";

    /**
     * Tells whether a {@link ContainerConfiguration proxy} can be instantiated from a {@link MObject} checking it is a {@link Artifact} stereotyped << ContainerConfiguration >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1c9df758-4371-4afe-a931-732db4e0c9b3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Artifact) && ((Artifact) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ContainerConfiguration.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Artifact} stereotyped << ContainerConfiguration >> then instantiate a {@link ContainerConfiguration} proxy.
     * 
     * @return a {@link ContainerConfiguration} proxy on the created {@link Artifact}.
     */
    @objid ("74c25a1f-ca21-48d6-aa4a-eaed73ad1d0b")
    public static ContainerConfiguration create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Artifact");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ContainerConfiguration.STEREOTYPE_NAME);
        return ContainerConfiguration.instantiate((Artifact)e);
    }

    /**
     * Tries to instantiate a {@link ContainerConfiguration} proxy from a {@link Artifact} stereotyped << ContainerConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Artifact
     * @return a {@link ContainerConfiguration} proxy or <i>null</i>.
     */
    @objid ("29c60522-e879-4449-9676-aca5cdf2eaa1")
    public static ContainerConfiguration instantiate(final Artifact obj) {
        return ContainerConfiguration.canInstantiate(obj) ? new ContainerConfiguration(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ContainerConfiguration} proxy from a {@link Artifact} stereotyped << ContainerConfiguration >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Artifact}
     * @return a {@link ContainerConfiguration} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("733dae7e-6674-41bc-b124-66cca801a5e0")
    public static ContainerConfiguration safeInstantiate(final Artifact obj) throws IllegalArgumentException {
        if (ContainerConfiguration.canInstantiate(obj))
        	return new ContainerConfiguration(obj);
        else
        	throw new IllegalArgumentException("ContainerConfiguration: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bc27d5ca-1930-4087-a48d-2aafba4924d8")
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
        ContainerConfiguration other = (ContainerConfiguration) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Artifact}. 
     * @return the Artifact represented by this proxy, never null.
     */
    @objid ("3a14f69c-39ea-44d6-b2d7-abccf964a68f")
    @Override
    public Artifact getElement() {
        return (Artifact)super.getElement();
    }

    /**
     * Get the value of the 'environment' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("52e45c1c-afc7-477b-b223-41b2714676a2")
    public Feature getEnvironment() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(ContainerConfiguration.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(ContainerConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "environment")){
                  if (HorizontalScalingAction.canInstantiate(d.getDependsOn()))
                     return (HorizontalScalingAction)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HorizontalScalingAction.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VerticalScalingAction.canInstantiate(d.getDependsOn()))
                     return (VerticalScalingAction)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VerticalScalingAction.MdaTypes.STEREOTYPE_ELT.getName());
                  if (BuildConfiguration.canInstantiate(d.getDependsOn()))
                     return (BuildConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BuildConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ClusterConfiguration.canInstantiate(d.getDependsOn()))
                     return (ClusterConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ClusterConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSConfiguration.canInstantiate(d.getDependsOn()))
                     return (PaaSConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ScriptConfiguration.canInstantiate(d.getDependsOn()))
                     return (ScriptConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScriptConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServerlessConfiguration.canInstantiate(d.getDependsOn()))
                     return (ServerlessConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServerlessConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ImageConfiguration.canInstantiate(d.getDependsOn()))
                     return (ImageConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ContainerConfiguration.canInstantiate(d.getDependsOn()))
                     return (ContainerConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (EventConfiguration.canInstantiate(d.getDependsOn()))
                     return (EventConfiguration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), EventConfiguration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeatureArtifact.canInstantiate(d.getDependsOn()))
                     return (FeatureArtifact)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureArtifact.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Application.canInstantiate(d.getDependsOn()))
                     return (Application)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Application.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Data.canInstantiate(d.getDependsOn()))
                     return (Data)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Data.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataSource.canInstantiate(d.getDependsOn()))
                     return (DataSource)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSource.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Container.canInstantiate(d.getDependsOn()))
                     return (Container)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Container.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaS.canInstantiate(d.getDependsOn()))
                     return (PaaS)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaS.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponent.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VM.canInstantiate(d.getDependsOn()))
                     return (VM)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VM.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RequirementSet.canInstantiate(d.getDependsOn()))
                     return (RequirementSet)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementSet.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RuleTrigger.canInstantiate(d.getDependsOn()))
                     return (RuleTrigger)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RuleTrigger.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SLOViolation.canInstantiate(d.getDependsOn()))
                     return (SLOViolation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SLOViolation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Cause.canInstantiate(d.getDependsOn()))
                     return (Cause)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Cause.MdaTypes.STEREOTYPE_ELT.getName());
                  if (HistoryInfo.canInstantiate(d.getDependsOn()))
                     return (HistoryInfo)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HistoryInfo.MdaTypes.STEREOTYPE_ELT.getName());
                  if (HistoryRecord.canInstantiate(d.getDependsOn()))
                     return (HistoryRecord)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HistoryRecord.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ApplicationMeasurement.canInstantiate(d.getDependsOn()))
                     return (ApplicationMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ApplicationMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationMeasurement.canInstantiate(d.getDependsOn()))
                     return (CommunicationMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ContainerMeasurement.canInstantiate(d.getDependsOn()))
                     return (ContainerMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataMeasurement.canInstantiate(d.getDependsOn()))
                     return (DataMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSMeasurement.canInstantiate(d.getDependsOn()))
                     return (PaaSMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentMeasurement.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VMMeasurement.canInstantiate(d.getDependsOn()))
                     return (VMMeasurement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMMeasurement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeContext.canInstantiate(d.getDependsOn()))
                     return (AttributeContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Function.canInstantiate(d.getDependsOn()))
                     return (Function)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Function.MdaTypes.STEREOTYPE_ELT.getName());
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
                  if (CompositeMetricContext.canInstantiate(d.getDependsOn()))
                     return (CompositeMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetricContext.canInstantiate(d.getDependsOn()))
                     return (RawMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricObjectBinding.canInstantiate(d.getDependsOn()))
                     return (MetricObjectBinding)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricObjectBinding.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricTemplate.canInstantiate(d.getDependsOn()))
                     return (MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ObjectContext.canInstantiate(d.getDependsOn()))
                     return (ObjectContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ObjectContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Schedule.canInstantiate(d.getDependsOn()))
                     return (Schedule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Schedule.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Window.canInstantiate(d.getDependsOn()))
                     return (Window)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Window.MdaTypes.STEREOTYPE_ELT.getName());
                  if (WindowProcessing.canInstantiate(d.getDependsOn()))
                     return (WindowProcessing)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), WindowProcessing.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CloudCredentials.canInstantiate(d.getDependsOn()))
                     return (CloudCredentials)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudCredentials.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PlatformCredentials.canInstantiate(d.getDependsOn()))
                     return (PlatformCredentials)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PlatformCredentials.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CloudProvider.canInstantiate(d.getDependsOn()))
                     return (CloudProvider)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudProvider.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Organisation.canInstantiate(d.getDependsOn()))
                     return (Organisation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Organisation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (User.canInstantiate(d.getDependsOn()))
                     return (User)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), User.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Entity.canInstantiate(d.getDependsOn()))
                     return (Entity)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Entity.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ExternalIdentifier.canInstantiate(d.getDependsOn()))
                     return (ExternalIdentifier)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ExternalIdentifier.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Permission.canInstantiate(d.getDependsOn()))
                     return (Permission)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Permission.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataResourceFilter.canInstantiate(d.getDependsOn()))
                     return (DataResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ModelResourceFilter.canInstantiate(d.getDependsOn()))
                     return (ModelResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ModelResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServiceResourceFilter.canInstantiate(d.getDependsOn()))
                     return (ServiceResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServiceResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentResourceFilter.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentResourceFilter)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentResourceFilter.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Role.canInstantiate(d.getDependsOn()))
                     return (Role)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Role.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RoleAssignment.canInstantiate(d.getDependsOn()))
                     return (RoleAssignment)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RoleAssignment.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UserGroup.canInstantiate(d.getDependsOn()))
                     return (UserGroup)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UserGroup.MdaTypes.STEREOTYPE_ELT.getName());
                  if (BinaryEventPattern.canInstantiate(d.getDependsOn()))
                     return (BinaryEventPattern)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BinaryEventPattern.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UnaryEventPattern.canInstantiate(d.getDependsOn()))
                     return (UnaryEventPattern)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnaryEventPattern.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FunctionalEvent.canInstantiate(d.getDependsOn()))
                     return (FunctionalEvent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FunctionalEvent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (NonFunctionalEvent.canInstantiate(d.getDependsOn()))
                     return (NonFunctionalEvent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), NonFunctionalEvent.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ScalabilityRule.canInstantiate(d.getDependsOn()))
                     return (ScalabilityRule)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScalabilityRule.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Timer.canInstantiate(d.getDependsOn()))
                     return (Timer)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Timer.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityControl.canInstantiate(d.getDependsOn()))
                     return (SecurityControl)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityControl.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityDomain.canInstantiate(d.getDependsOn()))
                     return (SecurityDomain)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityDomain.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeatureClass.canInstantiate(d.getDependsOn()))
                     return (FeatureClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SingleUnit.canInstantiate(d.getDependsOn()))
                     return (SingleUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SingleUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CompositeUnit.canInstantiate(d.getDependsOn()))
                     return (CompositeUnit)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeUnit.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Dimensionless.canInstantiate(d.getDependsOn()))
                     return (Dimensionless)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Dimensionless.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UnitDimension.canInstantiate(d.getDependsOn()))
                     return (UnitDimension)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitDimension.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeatureDataType.canInstantiate(d.getDependsOn()))
                     return (FeatureDataType)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureDataType.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CloudLocation.canInstantiate(d.getDependsOn()))
                     return (CloudLocation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CloudLocation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (GeographicalRegion.canInstantiate(d.getDependsOn()))
                     return (GeographicalRegion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), GeographicalRegion.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeatureEnumeration.canInstantiate(d.getDependsOn()))
                     return (FeatureEnumeration)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureEnumeration.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ImageRequirement.canInstantiate(d.getDependsOn()))
                     return (ImageRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ImageRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LocationRequirement.canInstantiate(d.getDependsOn()))
                     return (LocationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (OSRequirement.canInstantiate(d.getDependsOn()))
                     return (OSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSRequirement.canInstantiate(d.getDependsOn()))
                     return (PaaSRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ProviderRequirement.canInstantiate(d.getDependsOn()))
                     return (ProviderRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ProviderRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ResourceRequirement.canInstantiate(d.getDependsOn()))
                     return (ResourceRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ResourceRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (HorizontalScaleRequirement.canInstantiate(d.getDependsOn()))
                     return (HorizontalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HorizontalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VerticalScaleRequirement.canInstantiate(d.getDependsOn()))
                     return (VerticalScaleRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VerticalScaleRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityRequirement.canInstantiate(d.getDependsOn()))
                     return (SecurityRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecuritySLO.canInstantiate(d.getDependsOn()))
                     return (SecuritySLO)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecuritySLO.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ServiceLevelObjective.canInstantiate(d.getDependsOn()))
                     return (ServiceLevelObjective)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ServiceLevelObjective.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationRequirement.canInstantiate(d.getDependsOn()))
                     return (CommunicationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (OptimisationRequirement.canInstantiate(d.getDependsOn()))
                     return (OptimisationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OptimisationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationInstance.canInstantiate(d.getDependsOn()))
                     return (CommunicationInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (HostingInstance.canInstantiate(d.getDependsOn()))
                     return (HostingInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Communication.canInstantiate(d.getDependsOn()))
                     return (Communication)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Communication.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Hosting.canInstantiate(d.getDependsOn()))
                     return (Hosting)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Hosting.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LocationCoupling.canInstantiate(d.getDependsOn()))
                     return (LocationCoupling)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationCoupling.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeatureConnector.canInstantiate(d.getDependsOn()))
                     return (FeatureConnector)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureConnector.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationPortInstance.canInstantiate(d.getDependsOn()))
                     return (CommunicationPortInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPortInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (HostingPortInstance.canInstantiate(d.getDependsOn()))
                     return (HostingPortInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPortInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CommunicationPort.canInstantiate(d.getDependsOn()))
                     return (CommunicationPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CommunicationPort.MdaTypes.STEREOTYPE_ELT.getName());
                  if (HostingPort.canInstantiate(d.getDependsOn()))
                     return (HostingPort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), HostingPort.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeaturePort.canInstantiate(d.getDependsOn()))
                     return (FeaturePort)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeaturePort.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataInstanceBindableInstance.canInstantiate(d.getDependsOn()))
                     return (DataInstanceBindableInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceBindableInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataInstance.canInstantiate(d.getDependsOn()))
                     return (DataInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataSourceInstance.canInstantiate(d.getDependsOn()))
                     return (DataSourceInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataSourceInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ContainerInstance.canInstantiate(d.getDependsOn()))
                     return (ContainerInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ContainerInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PaaSInstance.canInstantiate(d.getDependsOn()))
                     return (PaaSInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PaaSInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SoftwareComponentInstance.canInstantiate(d.getDependsOn()))
                     return (SoftwareComponentInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SoftwareComponentInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (VMInstance.canInstantiate(d.getDependsOn()))
                     return (VMInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), VMInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ActionInstance.canInstantiate(d.getDependsOn()))
                     return (ActionInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ActionInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityMetricInstance.canInstantiate(d.getDependsOn()))
                     return (SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityMetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstance.canInstantiate(d.getDependsOn()))
                     return (MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FunctionalEventInstance.canInstantiate(d.getDependsOn()))
                     return (FunctionalEventInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (NonFunctionalEventInstance.canInstantiate(d.getDependsOn()))
                     return (NonFunctionalEventInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), NonFunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (FeatureInstance.canInstantiate(d.getDependsOn()))
                     return (FeatureInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FeatureInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CamelModel.canInstantiate(d.getDependsOn()))
                     return (CamelModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataTypeModel.canInstantiate(d.getDependsOn()))
                     return (DataTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DataInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DeploymentInstanceModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DeploymentTypeModel.canInstantiate(d.getDependsOn()))
                     return (DeploymentTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ExecutionModel.canInstantiate(d.getDependsOn()))
                     return (ExecutionModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ExecutionModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LocationModel.canInstantiate(d.getDependsOn()))
                     return (LocationModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetaDataModel.canInstantiate(d.getDependsOn()))
                     return (MetaDataModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetaDataModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstanceModel.canInstantiate(d.getDependsOn()))
                     return (MetricInstanceModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstanceModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricTypeModel.canInstantiate(d.getDependsOn()))
                     return (MetricTypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTypeModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (OrganisationModel.canInstantiate(d.getDependsOn()))
                     return (OrganisationModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OrganisationModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RequirementModel.canInstantiate(d.getDependsOn()))
                     return (RequirementModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ScalabilityModel.canInstantiate(d.getDependsOn()))
                     return (ScalabilityModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScalabilityModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityModel.canInstantiate(d.getDependsOn()))
                     return (SecurityModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (TypeModel.canInstantiate(d.getDependsOn()))
                     return (TypeModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), TypeModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UnitModel.canInstantiate(d.getDependsOn()))
                     return (UnitModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitModel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Precedes.canInstantiate(d.getDependsOn()))
                     return (Precedes)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Precedes.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Parallel.canInstantiate(d.getDependsOn()))
                     return (Parallel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Parallel.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Sequence.canInstantiate(d.getDependsOn()))
                     return (Sequence)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sequence.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Conditional.canInstantiate(d.getDependsOn()))
                     return (Conditional)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Conditional.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Switch.canInstantiate(d.getDependsOn()))
                     return (Switch)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Switch.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3c1a51ee-b513-4e8d-a454-10577ebf9534")
    public String getImageId() {
        return this.elt.getTagValue(ContainerConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT);
    }

    /**
     * Getter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("4ccc3d89-b0b8-4b8c-b7f5-872304dd4c91")
    public String getStartCommandNote() {
        return this.elt.getNoteContent(ContainerConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT);
    }

    /**
     * Getter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("56bce016-7c8a-4201-990b-1751e6dd6d65")
    public String getUpdateCommandNote() {
        return this.elt.getNoteContent(ContainerConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT);
    }

    @objid ("b4615d71-92bc-415c-b247-63f1dd04ed06")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'environment' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d509e966-360a-4f7a-81bc-b7b47d323aac")
    public void setEnvironment(final Feature obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(ContainerConfiguration.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(ContainerConfiguration.MdaTypes.MDAASSOCDEP_ROLE), "environment")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), ContainerConfiguration.MdaTypes.MDAASSOCDEP);
              dep.setName("environment");      dep.putTagValue(ContainerConfiguration.MdaTypes.MDAASSOCDEP_ROLE, "environment");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'imageId'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bfaf06d4-da66-4218-bb41-7ebccd6ee483")
    public void setImageId(final String value) {
        this.elt.putTagValue(ContainerConfiguration.MdaTypes.IMAGEID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for note 'startCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("2e9efbd7-997b-4441-8bba-903e08c679b9")
    public void setStartCommandNote(final String value) {
        this.elt.putNoteContent(ContainerConfiguration.MdaTypes.STARTCOMMAND_NOTETYPE_ELT, value);
    }

    /**
     * Setter for note 'updateCommand'
     * <p>Note description:
     * <br/><i>null</i></p>
     */
    @objid ("09b9a447-dc71-4837-a310-0c472fabebeb")
    public void setUpdateCommandNote(final String value) {
        this.elt.putNoteContent(ContainerConfiguration.MdaTypes.UPDATECOMMAND_NOTETYPE_ELT, value);
    }

    @objid ("1a4c106a-510a-426c-abd6-621e1c1fc262")
    protected ContainerConfiguration(final Artifact elt) {
        super(elt);
    }

    @objid ("4a5c856d-f4b0-4d7b-89fe-fa3fcb6c8aeb")
    public static final class MdaTypes {
        @objid ("1a2a63b0-8c92-4a34-a5b7-da7d3e42b49b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("db9a5bbd-f08f-41ed-b964-e4f284086a05")
        public static TagType IMAGEID_TAGTYPE_ELT;

        @objid ("8dc68354-d60c-4c01-8f3a-281a0805ef36")
        public static NoteType STARTCOMMAND_NOTETYPE_ELT;

        @objid ("e006b640-4010-49a4-8f00-084c6b984ec2")
        public static NoteType UPDATECOMMAND_NOTETYPE_ELT;

        @objid ("85b786d6-c206-4fca-8e1c-06e6ba090b05")
        private static Stereotype MDAASSOCDEP;

        @objid ("fc11f352-1ddd-48e0-b19c-1c82017cb25d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e276a6d5-d961-41d3-8ecb-c0dab01a0686")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "20c23411-2764-477e-bda1-1fea947d0e02");
            IMAGEID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "703ce2ad-9323-48f3-a8f7-b1d983bbf5a1");
            STARTCOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "07aec09c-3d2e-464b-ad0d-dfdd4eb845f7");
            UPDATECOMMAND_NOTETYPE_ELT = ctx.getModelingSession().findElementById(NoteType.class, "a1499b9c-3b44-4c0b-8954-086bb74ad30d");
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
