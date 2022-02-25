/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.constraintmodel.standard.constraint.MetricVariableConstraint;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.Container;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.PaaS;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.VM;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.CompositeSecurityMetric;
import fr.softeam.cameldesigner.api.securitymodel.standard.class_.RawSecurityMetric;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << MetricVariable >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("7f8056db-66ca-4270-b581-2dad325c84aa")
public class MetricVariable extends Metric {
    @objid ("9cf4eeb9-2f22-47c2-a843-2379f66d3757")
    public static final String STEREOTYPE_NAME = "MetricVariable";

    @objid ("fb91f715-7c66-4c69-b4a3-284337214b5b")
    public static final String CURRENTCONFIGURATION_TAGTYPE = "currentConfiguration";

    @objid ("80ea3d60-5478-47e0-a385-5f799a4c0f12")
    public static final String FORMULA_TAGTYPE = "formula";

    @objid ("c8fd15ad-ed32-416e-8d6e-aae93bc4c86e")
    public static final String ONNODECANDIDATES_TAGTYPE = "onNodeCandidates";

    /**
     * Tells whether a {@link MetricVariable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricVariable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5ea0f959-7658-4868-9d59-8ae8fcdb9df0")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricVariable >> then instantiate a {@link MetricVariable} proxy.
     * 
     * @return a {@link MetricVariable} proxy on the created {@link Class}.
     */
    @objid ("90b283e0-96bb-455a-91a1-b18ee7077bb5")
    public static MetricVariable create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME);
        return MetricVariable.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MetricVariable} proxy from a {@link Class} stereotyped << MetricVariable >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MetricVariable} proxy or <i>null</i>.
     */
    @objid ("636fbb59-d8c6-4fb3-b627-d3cb66d562e5")
    public static MetricVariable instantiate(final Class obj) {
        return MetricVariable.canInstantiate(obj) ? new MetricVariable(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricVariable} proxy from a {@link Class} stereotyped << MetricVariable >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MetricVariable} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("ca256d9e-d066-486a-8fd1-1f95b955afe8")
    public static MetricVariable safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MetricVariable.canInstantiate(obj))
        	return new MetricVariable(obj);
        else
        	throw new IllegalArgumentException("MetricVariable: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("fb890e34-94a8-4422-8145-1a91b375db89")
    public void addComponentMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricVariable.MdaTypes.MDAASSOCDEP);
            d.setName("componentMetrics");
            d.putTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE, "componentMetrics");
        }
    }

    /**
     * Add a value to the 'metricVariableConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8b86e9f6-ca53-4b00-9696-4010f8d5e765")
    public void addMetricVariableConstraint(final MetricVariableConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("d158c1ea-29f1-41e8-a7b2-2011b39ca3d9")
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
        MetricVariable other = (MetricVariable) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d14a8658-b55d-4f58-b620-48e843cb6427")
    public CamelComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "component")){
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
              }
        }
        return null;
    }

    /**
     * Get the values of the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("0dc5ca56-2feb-4ff1-82e2-17780e730642")
    public List<Metric> getComponentMetrics() {
        List<Metric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "componentMetrics")){
              if (CompositeSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((CompositeSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
              if (CompositeMetric.canInstantiate(d.getDependsOn()))
                results.add((CompositeMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetric.MdaTypes.STEREOTYPE_ELT.getName()));
              if (MetricVariable.canInstantiate(d.getDependsOn()))
                results.add((MetricVariable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariable.MdaTypes.STEREOTYPE_ELT.getName()));
              if (RawSecurityMetric.canInstantiate(d.getDependsOn()))
                results.add((RawSecurityMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawSecurityMetric.MdaTypes.STEREOTYPE_ELT.getName()));
              if (RawMetric.canInstantiate(d.getDependsOn()))
                results.add((RawMetric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetric.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c22a5da6-a087-4d50-a330-6ab382b42221")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("846f0395-6aea-449b-b24e-a73267d8be24")
    public String getFormula() {
        return this.elt.getTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricVariableConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3dcc6417-97b9-437f-83ba-94a8d3e1ea65")
    public List<MetricVariableConstraint> getMetricVariableConstraint() {
        List<MetricVariableConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition()){
        	if (MetricVariableConstraint.canInstantiate(mObj))
        			results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricVariableConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("0a3bb8fe-ed01-4a37-aae4-b372ad9c7ed0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'currentConfiguration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a495a3de-ec59-4524-b853-b515a5d7cbbb")
    public boolean isCurrentConfiguration() {
        return this.elt.isTagged(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b9f6cf61-ea0d-4f57-a782-81e76db1aa29")
    public boolean isOnNodeCandidates() {
        return this.elt.isTagged(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a3016c49-4fef-477c-aa29-adcf0a0a65fe")
    public boolean removeComponentMetrics(final Metric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Remove a value from the 'metricVariableConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("4608488a-91ad-40c9-aa7e-c2b434772678")
    public boolean removeMetricVariableConstraint(final MetricVariableConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("dabc5bdc-d5be-4f93-a8c7-6eaefc529498")
    public void setComponent(final CamelComponent obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "component")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricVariable.MdaTypes.MDAASSOCDEP);
              dep.setName("component");      dep.putTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE, "component");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for boolean property 'currentConfiguration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6761a170-016d-41b6-96f5-370dae600357")
    public void setCurrentConfiguration(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3cc593a6-fc82-45f8-9e4d-ea7cee31ddb5")
    public void setFormula(final String value) {
        this.elt.putTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c2a2aee6-e5f5-4cc4-b05d-e826c1753b38")
    public void setOnNodeCandidates(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    @objid ("8a53e1e2-c685-4c02-8162-f4cf8784caa0")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("a5b1678e-a357-4094-a0e3-4b91029d2d02")
    protected MetricVariable(final Class elt) {
        super(elt);
    }

    @objid ("81037834-9acd-42d9-b1a5-2bc14d8ad956")
    public static final class MdaTypes {
        @objid ("2b7de255-3906-4439-be88-e94299f563a6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("33fd0e54-b82c-437b-b451-87424b578869")
        public static TagType CURRENTCONFIGURATION_TAGTYPE_ELT;

        @objid ("aa0847c4-b77d-4552-848c-45b9c4e802b3")
        public static TagType ONNODECANDIDATES_TAGTYPE_ELT;

        @objid ("074b542e-c1c3-4796-8e64-998921a9de96")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("4f1b945a-1507-4af0-92d2-22e5e33cff83")
        private static Stereotype MDAASSOCDEP;

        @objid ("27f432df-f19b-427c-a299-a84093ab2735")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b4cfe934-5117-478d-8ca4-e84c9a390b0c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "74fbbe90-c06f-4bc3-81a7-d13724b575a8");
            CURRENTCONFIGURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "c0614ae1-0ba0-4112-bdfd-d97d8b6faafa");
            ONNODECANDIDATES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0f9463fd-7b8b-4783-891a-4e8783894e9d");
            FORMULA_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9bfc3948-91d5-4ff4-b294-c2ef71d31b6a");
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
