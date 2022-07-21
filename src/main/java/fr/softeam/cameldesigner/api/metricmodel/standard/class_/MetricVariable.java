/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("117a6eae-f617-4df2-a497-81bfd2fa22d0")
    public static final String STEREOTYPE_NAME = "MetricVariable";

    @objid ("f4f0ee24-5d08-40da-952b-ff0775abe446")
    public static final String CURRENTCONFIGURATION_TAGTYPE = "currentConfiguration";

    @objid ("f8b85f50-8327-432c-8362-c0d8742f92a1")
    public static final String FORMULA_TAGTYPE = "formula";

    @objid ("af1a4c6e-b545-484b-bc4c-bcd128be7ae7")
    public static final String ONNODECANDIDATES_TAGTYPE = "onNodeCandidates";

    /**
     * Tells whether a {@link MetricVariable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricVariable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7f81f623-2be7-4bec-a291-114a5b2b430d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricVariable >> then instantiate a {@link MetricVariable} proxy.
     * 
     * @return a {@link MetricVariable} proxy on the created {@link Class}.
     */
    @objid ("c5949b6e-a996-4a35-97d0-127d48475d63")
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
    @objid ("a42f1558-0a25-41b5-957a-080e8407a1f3")
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
    @objid ("ab5d6936-1d9b-40a6-86a3-68e87959ffb1")
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
    @objid ("2ccef831-182d-4bce-800f-448fb69b6775")
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
    @objid ("c2e486aa-da3c-428a-bda0-c017797c973e")
    public void addMetricVariableConstraint(final MetricVariableConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("1f2e8aad-c627-4ca3-b8b4-5db366697fe8")
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
    @objid ("b781018d-4d49-453e-8bf2-96d85fe96e2c")
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
    @objid ("5985cbfc-0aa4-4f34-aed1-5160129c5282")
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
    @objid ("188af284-1691-425b-995c-19c5829de1ca")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2e857da5-94c8-40f2-a659-a4ce8ca76c7d")
    public String getFormula() {
        return this.elt.getTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricVariableConstraint' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7481d2fe-9136-451f-8518-6546bab6e0ed")
    public List<MetricVariableConstraint> getMetricVariableConstraint() {
        List<MetricVariableConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition()){
        	if (MetricVariableConstraint.canInstantiate(mObj))
        			results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricVariableConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    @objid ("6e1925fd-0f19-4a8d-98be-93fb10923a30")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'currentConfiguration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("82c5be52-8388-4fb8-962d-3a370909be1a")
    public boolean isCurrentConfiguration() {
        return this.elt.isTagged(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("096f5bd2-5507-43e0-8ac8-8c13626fc5ec")
    public boolean isOnNodeCandidates() {
        return this.elt.isTagged(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("7a707322-ebde-4145-a74f-1ebec002f64b")
    public boolean removeComponentMetrics(final Metric obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "componentMetrics")) 
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
    @objid ("d74466c1-5bc9-42dc-a56d-a0ac05ab2641")
    public boolean removeMetricVariableConstraint(final MetricVariableConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3efeefe2-08e0-4dca-a0dd-39d7c2f04b21")
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
    @objid ("d70a66e0-4a2f-44e6-8a28-5afe58e4a65c")
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
    @objid ("7fdb75dd-e206-4c06-bac4-23b7457908cd")
    public void setFormula(final String value) {
        this.elt.putTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("09539fc5-c6f7-43a9-a7eb-cb80af9fc584")
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

    @objid ("36217f47-a13d-445b-b6f3-649587f9ca95")
    protected MetricVariable(final Class elt) {
        super(elt);
    }

    @objid ("81037834-9acd-42d9-b1a5-2bc14d8ad956")
    public static final class MdaTypes {
        @objid ("5dbfcaf0-ec9e-4118-82cc-70bb589141a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1266d799-e8a6-4be7-ad86-3c33e4b8a527")
        public static TagType CURRENTCONFIGURATION_TAGTYPE_ELT;

        @objid ("252cfcba-d567-403a-8c0a-11a9d07b3f32")
        public static TagType ONNODECANDIDATES_TAGTYPE_ELT;

        @objid ("940ae20f-e464-4e48-ac17-27ebc7e9e690")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("fc3dee80-da6f-4903-9f23-f032bd75bae2")
        private static Stereotype MDAASSOCDEP;

        @objid ("db658514-cbd9-47ae-a8f6-c2cc1806083b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bfe9786f-9ea7-4604-816a-23f32f0be88f")
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
