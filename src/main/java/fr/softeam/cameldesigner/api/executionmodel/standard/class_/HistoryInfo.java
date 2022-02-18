/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/18/22 3:46 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.Annotation;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.dependency.PropertyDependency;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.artifact.FeatureArtifact;
import fr.softeam.cameldesigner.api.camelcore.standard.attribute.AttributeAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.Application;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.AttributeClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.MeasurableAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.QualityAttribute;
import fr.softeam.cameldesigner.api.camelcore.standard.connector.FeatureConnector;
import fr.softeam.cameldesigner.api.camelcore.standard.datatype.FeatureDataType;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.port.FeaturePort;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.CamelModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ConstraintModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataInstanceModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DataTypeModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentInstanceModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.DeploymentTypeModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ExecutionModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.LocationModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetadataModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricInstanceModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.MetricTypeModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.OrganisationModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.RequirementModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.ScalabilityModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.SecurityModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.TypeModelDiagram;
import fr.softeam.cameldesigner.api.cameldiagrams.standard.classdiagram.UnitModelDiagram;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.AttributeConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.IfThenConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.LogicalConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.api.constraintmodel.standard.package_.ConstraintModel;
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
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.BuildConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.ClusterConfiguration;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.artifact.EventConfiguration;
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
import fr.softeam.cameldesigner.api.executionmodel.standard.instance.ActionInstance;
import fr.softeam.cameldesigner.api.executionmodel.standard.package_.ExecutionModel;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.CloudLocation;
import fr.softeam.cameldesigner.api.locationmodel.standard.enumeration.GeographicalRegion;
import fr.softeam.cameldesigner.api.locationmodel.standard.package_.LocationModel;
import fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement.MmsObject;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.Certifiable;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityAttribute;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityControl;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecurityDomain;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.SecuritySLO;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
import fr.softeam.cameldesigner.api.securitymodel.standard.package_.SecurityModel;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.BooleanValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.Range;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.RangeUnion;
import fr.softeam.cameldesigner.api.typemodel.standard.datatype.StringValueType;
import fr.softeam.cameldesigner.api.typemodel.standard.package_.TypeModel;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.CompositeUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.Dimensionless;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.SingleUnit;
import fr.softeam.cameldesigner.api.unitmodel.standard.datatype.UnitDimension;
import fr.softeam.cameldesigner.api.unitmodel.standard.package_.UnitModel;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;

/**
 * Proxy class to handle a {@link Class} with << HistoryInfo >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("32a73516-6547-4f5b-b3b1-4018a2466233")
public class HistoryInfo extends FeatureClass {
    @objid ("5047d288-9aea-4a06-b257-5022a2c2ae07")
    public static final String STEREOTYPE_NAME = "HistoryInfo";

    @objid ("95ef4b68-6289-454a-9a57-3312ddf78324")
    public static final String ENDTIME_TAGTYPE = "endTime";

    @objid ("1787f6fb-c9d2-47d0-a525-5c87f2d02469")
    public static final String OBJECT_TAGTYPE = "object";

    @objid ("3b1f89f4-16e6-482a-ae96-4e6c306c0978")
    public static final String STARTTIME_TAGTYPE = "startTime";

    /**
     * Tells whether a {@link HistoryInfo proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << HistoryInfo >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     *
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("1a43846c-7660-4503-8a79-3479b5667354")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << HistoryInfo >> then instantiate a {@link HistoryInfo} proxy.
     *
     * @return a {@link HistoryInfo} proxy on the created {@link Class}.
     */
    @objid ("536637f3-306c-4b4d-b587-a5102cb6fb70")
    public static HistoryInfo create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, HistoryInfo.STEREOTYPE_NAME);
        return HistoryInfo.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link HistoryInfo} proxy from a {@link Class} stereotyped << HistoryInfo >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link HistoryInfo} proxy or <i>null</i>.
     */
    @objid ("f5549f16-5d22-425b-a7f1-8196d20d3fe3")
    public static HistoryInfo instantiate(final Class obj) {
        return HistoryInfo.canInstantiate(obj) ? new HistoryInfo(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HistoryInfo} proxy from a {@link Class} stereotyped << HistoryInfo >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link HistoryInfo} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("d6607b3d-8e77-4316-a453-fd77fd57dfea")
    public static HistoryInfo safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (HistoryInfo.canInstantiate(obj))
        	return new HistoryInfo(obj);
        else
        	throw new IllegalArgumentException("HistoryInfo: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("1f6f6fea-66ef-42eb-8fac-44808ae26044")
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
        HistoryInfo other = (HistoryInfo) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'action' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("a28152f6-001e-4415-b16d-62c5253f625e")
    public MmsObject getAction() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "action")){
                  if (MmsConcept.canInstantiate(d.getDependsOn()))
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsConceptInstance.canInstantiate(d.getDependsOn()))
                     return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsProperty.canInstantiate(d.getDependsOn()))
                     return (MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                     return (MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the underlying {@link Class}.
     * @return the Class represented by this proxy, never null.
     */
    @objid ("139fce70-7001-4f41-bbf3-f245bb4973e9")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("81f28ff4-317d-4bfb-a35f-0aa1fdff4636")
    public String getEndTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd9c9923-4ec4-4a56-8c3c-4c5be7944b4a")
    public String getObject() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'objectRef' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("9ba496ee-9073-4363-b3f5-0b1b25de2518")
    public CamelElement getObjectRef() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "objectRef")){
                  if (Annotation.canInstantiate(d.getDependsOn()))
                     return (Annotation)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Annotation.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeAttribute.canInstantiate(d.getDependsOn()))
                     return (AttributeAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MeasurableAttribute.canInstantiate(d.getDependsOn()))
                     return (MeasurableAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MeasurableAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Certifiable.canInstantiate(d.getDependsOn()))
                     return (Certifiable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Certifiable.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityAttribute.canInstantiate(d.getDependsOn()))
                     return (SecurityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (QualityAttribute.canInstantiate(d.getDependsOn()))
                     return (QualityAttribute)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), QualityAttribute.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeClass.canInstantiate(d.getDependsOn()))
                     return (AttributeClass)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeClass.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CamelModel.canInstantiate(d.getDependsOn()))
                     return (CamelModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelModel.MdaTypes.STEREOTYPE_ELT.getName());
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
                  if (ConstraintModel.canInstantiate(d.getDependsOn()))
                     return (ConstraintModel)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ConstraintModel.MdaTypes.STEREOTYPE_ELT.getName());
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
                  if (OptimisationRequirement.canInstantiate(d.getDependsOn()))
                     return (OptimisationRequirement)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OptimisationRequirement.MdaTypes.STEREOTYPE_ELT.getName());
                  if (CamelModelDiagram.canInstantiate(d.getDependsOn()))
                     return (CamelModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ConstraintModelDiagram.canInstantiate(d.getDependsOn()))
                     return (ConstraintModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ConstraintModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataInstanceModelDiagram.canInstantiate(d.getDependsOn()))
                     return (DataInstanceModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataInstanceModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DataTypeModelDiagram.canInstantiate(d.getDependsOn()))
                     return (DataTypeModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DataTypeModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DeploymentInstanceModelDiagram.canInstantiate(d.getDependsOn()))
                     return (DeploymentInstanceModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentInstanceModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (DeploymentTypeModelDiagram.canInstantiate(d.getDependsOn()))
                     return (DeploymentTypeModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), DeploymentTypeModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ExecutionModelDiagram.canInstantiate(d.getDependsOn()))
                     return (ExecutionModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ExecutionModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LocationModelDiagram.canInstantiate(d.getDependsOn()))
                     return (LocationModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LocationModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetadataModelDiagram.canInstantiate(d.getDependsOn()))
                     return (MetadataModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetadataModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstanceModelDiagram.canInstantiate(d.getDependsOn()))
                     return (MetricInstanceModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstanceModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricTypeModelDiagram.canInstantiate(d.getDependsOn()))
                     return (MetricTypeModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTypeModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (OrganisationModelDiagram.canInstantiate(d.getDependsOn()))
                     return (OrganisationModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), OrganisationModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RequirementModelDiagram.canInstantiate(d.getDependsOn()))
                     return (RequirementModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RequirementModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (ScalabilityModelDiagram.canInstantiate(d.getDependsOn()))
                     return (ScalabilityModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), ScalabilityModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (SecurityModelDiagram.canInstantiate(d.getDependsOn()))
                     return (SecurityModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (TypeModelDiagram.canInstantiate(d.getDependsOn()))
                     return (TypeModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), TypeModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (UnitModelDiagram.canInstantiate(d.getDependsOn()))
                     return (UnitModelDiagram)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), UnitModelDiagram.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (AttributeConstraint.canInstantiate(d.getDependsOn()))
                     return (AttributeConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), AttributeConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricVariableConstraint.canInstantiate(d.getDependsOn()))
                     return (MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariableConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (IfThenConstraint.canInstantiate(d.getDependsOn()))
                     return (IfThenConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), IfThenConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (LogicalConstraint.canInstantiate(d.getDependsOn()))
                     return (LogicalConstraint)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), LogicalConstraint.MdaTypes.STEREOTYPE_ELT.getName());
                  if (fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.canInstantiate(d.getDependsOn()))
                     return (fr.softeam.cameldesigner.api.typemodel.standard.datatype.List)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), fr.softeam.cameldesigner.api.typemodel.standard.datatype.List.MdaTypes.STEREOTYPE_ELT.getName());
                  if (BooleanValueType.canInstantiate(d.getDependsOn()))
                     return (BooleanValueType)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), BooleanValueType.MdaTypes.STEREOTYPE_ELT.getName());
                  if (StringValueType.canInstantiate(d.getDependsOn()))
                     return (StringValueType)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), StringValueType.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RangeUnion.canInstantiate(d.getDependsOn()))
                     return (RangeUnion)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RangeUnion.MdaTypes.STEREOTYPE_ELT.getName());
                  if (Range.canInstantiate(d.getDependsOn()))
                     return (Range)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Range.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsConcept.canInstantiate(d.getDependsOn()))
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsConceptInstance.canInstantiate(d.getDependsOn()))
                     return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsProperty.canInstantiate(d.getDependsOn()))
                     return (MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                     return (MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (PropertyDependency.canInstantiate(d.getDependsOn()))
                     return (PropertyDependency)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), PropertyDependency.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3467ae82-8a39-4bd6-bba0-7123794c3d54")
    public String getStartTime() {
        return this.elt.getTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'subject' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("8f164c8c-83c5-421a-acd3-c79fb80e9094")
    public MmsObject getSubject() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "subject")){
                  if (MmsConcept.canInstantiate(d.getDependsOn()))
                     return (MmsConcept)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConcept.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsConceptInstance.canInstantiate(d.getDependsOn()))
                     return (MmsConceptInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsConceptInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsProperty.canInstantiate(d.getDependsOn()))
                     return (MmsProperty)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsProperty.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MmsPropertyInstance.canInstantiate(d.getDependsOn()))
                     return (MmsPropertyInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MmsPropertyInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("cfb5be45-d88f-45f9-8ccc-f321e52adf9b")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'action' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("c586b651-9718-45f9-b0e1-a468d365b7f8")
    public void setAction(final MmsObject obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "action")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryInfo.MdaTypes.MDAASSOCDEP);
              dep.setName("action");      dep.putTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE, "action");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'endTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5b2fbe9b-c9d7-4d83-b4fc-9c4769e1b34e")
    public void setEndTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.ENDTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'object'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4dd5a72f-c5df-4d22-b025-197342bde901")
    public void setObject(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.OBJECT_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'objectRef' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("192e50e1-5a76-44ef-95ce-34f71dc21d04")
    public void setObjectRef(final CamelElement obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "objectRef")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryInfo.MdaTypes.MDAASSOCDEP);
              dep.setName("objectRef");      dep.putTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE, "objectRef");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'startTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa81bdfb-53de-4869-8ad2-8145af5978da")
    public void setStartTime(final String value) {
        this.elt.putTagValue(HistoryInfo.MdaTypes.STARTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'subject' role.<p>
     * Role description:
     * null
     *
     */
    @objid ("dbf6497b-9518-4e01-adad-39d664737546")
    public void setSubject(final MmsObject obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(HistoryInfo.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE), "subject")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), HistoryInfo.MdaTypes.MDAASSOCDEP);
              dep.setName("subject");      dep.putTagValue(HistoryInfo.MdaTypes.MDAASSOCDEP_ROLE, "subject");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("195d9a69-6f24-486d-a407-0bb1d1c2ec27")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("338272ce-59f9-428b-817a-ba75eac5817e")
    protected HistoryInfo(final Class elt) {
        super(elt);
    }

    @objid ("3e1aab74-be0c-48b2-b316-e35870217b33")
    public static final class MdaTypes {
        @objid ("89a8e6a4-1b59-4a90-b877-d4533d8c2481")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("530cec1e-35c0-4418-bd9a-58bcc3150afe")
        public static TagType OBJECT_TAGTYPE_ELT;

        @objid ("40d97e5e-bc33-4de5-a020-a1615691a773")
        public static TagType STARTTIME_TAGTYPE_ELT;

        @objid ("b8ee0cfd-0a90-4396-b089-1b25e5fba052")
        public static TagType ENDTIME_TAGTYPE_ELT;

        @objid ("4a427e3a-2bb6-427c-bf28-2ea7dbff9c1e")
        private static Stereotype MDAASSOCDEP;

        @objid ("e372534c-62d0-4869-9996-5aaa93ab9a4b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93271268-f7fe-4cf1-bffc-fa7c1da0797a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "acef265d-7979-416d-8e8d-bc2a20331822");
            OBJECT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b459f0a0-04c3-4f41-ba76-aca6f5dc6dda");
            STARTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3888f8fe-984d-4fcb-a8f4-ed0071eb91c0");
            ENDTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e34ce3bc-ef22-4d6d-9c02-81f6bbd2268b");
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
