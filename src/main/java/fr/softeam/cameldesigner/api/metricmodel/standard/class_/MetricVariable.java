/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
=======
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.Metric;
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetric;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
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
<<<<<<< HEAD
    @objid ("2905b1e1-973e-4a80-ad9f-fd78f2f2ea1f")
    public static final String STEREOTYPE_NAME = "MetricVariable";

    @objid ("4ff7fc29-5b97-4b23-862d-22a29834f4fa")
    public static final String CURRENTCONFIGURATION_TAGTYPE = "currentConfiguration";

    @objid ("c854c569-69d3-46f6-af6b-b3537c7b5780")
    public static final String FORMULA_TAGTYPE = "formula";

    @objid ("fcc10a5b-2d1d-4528-aaf8-e09d36d8b404")
=======
    @objid ("956fceaa-c29b-422e-85eb-ff7667a9a11b")
    public static final String STEREOTYPE_NAME = "MetricVariable";

    @objid ("7308ae9f-6eaf-4b94-9c5e-6d206b63cda5")
    public static final String CURRENTCONFIGURATION_TAGTYPE = "currentConfiguration";

    @objid ("92ca5761-925e-4846-8fc1-2c8acaca3d55")
    public static final String FORMULA_TAGTYPE = "formula";

    @objid ("98285566-4493-40ac-99bd-f5187c4992fa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ONNODECANDIDATES_TAGTYPE = "onNodeCandidates";

    /**
     * Tells whether a {@link MetricVariable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricVariable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("03e78e5a-0d30-4b20-a4f7-0ee54e4badf3")
=======
    @objid ("4423ed35-d301-4534-8e74-812fd7517170")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricVariable >> then instantiate a {@link MetricVariable} proxy.
     * 
     * @return a {@link MetricVariable} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("e68cce59-b0ff-4173-9a62-562943eb537c")
=======
    @objid ("9483e99f-9d8a-4aeb-8e24-db7843ac24e4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ddf7010e-2d3b-4027-89d3-ce8a9dc13e0e")
=======
    @objid ("114fbebc-462f-4029-ad80-21614216c780")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2c6aebe3-9b0d-4733-a13b-ea424fad3416")
=======
    @objid ("c8f0cf6c-3dfa-4d30-9df7-1d2cbd604e68")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("7b5ba20e-c67f-400a-85ce-f51000a3edef")
=======
    @objid ("174ed5d9-2617-4fcd-b72a-7915043c4c7c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("3cddffe1-18f1-4172-8cc4-b3393a33e189")
=======
    @objid ("93d651d3-1eb6-4166-b4eb-e55a678770f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addMetricVariableConstraint(final MetricVariableConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("5487ce4b-2e62-418f-beb4-767d281c9563")
=======
    @objid ("5ff848bd-6348-462d-9484-664255c87032")
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
        MetricVariable other = (MetricVariable) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("3338864f-11ef-4f77-92f8-172fd878b0b4")
=======
    @objid ("9d58f65e-a52b-45e0-bab5-0928faadcce8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("c34adfbb-88b3-4fb6-890b-6a46a8011e21")
=======
    @objid ("2c1c6ea3-68fe-4f11-9fce-9125ac4ad4da")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ece2a6ac-700f-4e71-8282-f40803b3a902")
=======
    @objid ("da3e231f-01df-4e2c-9489-f3c5e8901950")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("0f90f6ff-922e-4dcd-8283-d50840e597e3")
=======
    @objid ("5a5624c4-388a-4cff-ae21-a0d98cb26ecb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getFormula() {
        return this.elt.getTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("ecc82917-f999-41fe-be2a-dd49b666e2e9")
    public MetricContext getMetricContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")){
                  if (CompositeMetricContext.canInstantiate(d.getDependsOn()))
                     return (CompositeMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetricContext.canInstantiate(d.getDependsOn()))
                     return (RawMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'metricVariableConstraint' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("b892958b-0899-4524-bd65-1811e4272ffc")
=======
    @objid ("8dcb10cc-136e-484e-8f9d-95f422095fca")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<MetricVariableConstraint> getMetricVariableConstraint() {
        List<MetricVariableConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition()){
        	if (MetricVariableConstraint.canInstantiate(mObj))
        			results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricVariableConstraint.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

<<<<<<< HEAD
    @objid ("3167d65e-c8a4-411c-ba2c-73097b956b33")
=======
    @objid ("6c790926-bf45-49aa-95c5-c41cabe4d5a1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'currentConfiguration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3ac1adce-4cbc-4f56-9302-2cec41c0404f")
=======
    @objid ("d6c8528f-c631-42e1-8268-0d899f430015")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isCurrentConfiguration() {
        return this.elt.isTagged(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("10ef37ca-cf6b-4512-b711-80a11c4f8b3c")
=======
    @objid ("7cac0ee8-ef19-4f20-97ce-2f0dbf36ef27")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isOnNodeCandidates() {
        return this.elt.isTagged(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'componentMetrics' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("21d1dc74-8978-459e-b739-e1d8b4d6207e")
=======
    @objid ("14a04bdf-8835-4db7-a2d2-fa5b72928b44")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("40a9b007-1161-4e2e-ada6-b96b510b281c")
=======
    @objid ("30b7f6cf-568a-40b7-9c92-39c52b247caa")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeMetricVariableConstraint(final MetricVariableConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bf32fbcb-64f9-48d5-a90c-056af1a5b16b")
=======
    @objid ("7713b5f2-cae3-4840-9a09-2067f2ef9c77")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("1987d076-3f5b-470f-850b-a40e24254651")
=======
    @objid ("bcc6cc68-fd03-4f1b-8cb3-f61fb9b2f43f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("be1cc8c7-b30f-45fc-9c8b-50fa9079e324")
=======
    @objid ("f581ec84-3a58-4289-857d-0c92d0c2cb2b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setFormula(final String value) {
        this.elt.putTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d555ed6e-5283-42e7-a3ca-69b126ac4301")
    public void setMetricContext(final MetricContext obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricVariable.MdaTypes.MDAASSOCDEP);
              dep.setName("metricContext");      dep.putTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE, "metricContext");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a8889271-e7d4-4398-9520-ba052a6c5e61")
=======
    @objid ("fe33c186-8f91-44a1-b1be-2edc1b2eca3b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("b6fa9ec4-b65c-436c-800c-13e6d1060bea")
=======
    @objid ("c6018720-2a45-4c6d-ba71-3e32c00db70b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected MetricVariable(final Class elt) {
        super(elt);
    }

    @objid ("81037834-9acd-42d9-b1a5-2bc14d8ad956")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e0c868ae-11fd-4f54-a351-3b481807c117")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3c53ca42-0104-4656-8bf5-c5ae1417ac91")
        public static TagType CURRENTCONFIGURATION_TAGTYPE_ELT;

        @objid ("f9d67bfb-b0c8-4306-ad9d-779097320ba8")
        public static TagType ONNODECANDIDATES_TAGTYPE_ELT;

        @objid ("f2b6c1f3-13f3-4653-9c29-6ecdfe652568")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("1fbb6ba7-b45a-4184-b420-b3c4ae5f5933")
        private static Stereotype MDAASSOCDEP;

        @objid ("7530da4b-bef0-4e2f-87c9-c2c235305e90")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("866e373f-69b8-4fa8-8607-dabc85964d86")
=======
        @objid ("73b8f908-10b4-42e1-8de3-bb47397273a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("55e3b464-0c61-4c65-8a24-fda6ca962ef9")
        public static TagType CURRENTCONFIGURATION_TAGTYPE_ELT;

        @objid ("07e09284-bcf3-462f-859f-3d8a5f9110a4")
        public static TagType ONNODECANDIDATES_TAGTYPE_ELT;

        @objid ("cfee9d5a-ec1d-4d51-9316-98e68865944d")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("97f633b8-6dab-4e8c-9627-353d7a04f9b6")
        private static Stereotype MDAASSOCDEP;

        @objid ("efd8f1a8-31d2-4e79-8633-c8ff2eb3abff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("31fcb965-a710-438f-b407-4347d3c15698")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
