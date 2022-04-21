/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("10570c38-8928-43ca-99e2-478c918efc84")
    public static final String STEREOTYPE_NAME = "MetricVariable";

    @objid ("fe327bab-b63d-4cee-8446-717d2739a381")
    public static final String CURRENTCONFIGURATION_TAGTYPE = "currentConfiguration";

    @objid ("f1eb9b63-7732-464a-aba8-a6fb7a4aa7da")
    public static final String FORMULA_TAGTYPE = "formula";

    @objid ("a5578998-49bb-450e-bcfd-2cd81a266b51")
    public static final String ONNODECANDIDATES_TAGTYPE = "onNodeCandidates";

    /**
     * Tells whether a {@link MetricVariable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricVariable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0bf95342-0906-4252-acf4-d4025235ec3c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricVariable >> then instantiate a {@link MetricVariable} proxy.
     * 
     * @return a {@link MetricVariable} proxy on the created {@link Class}.
     */
    @objid ("937b2090-b7a6-4759-8af3-56507dc6435f")
    public static MetricVariable create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME);
        return MetricVariable.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MetricVariable} proxy from a {@link Class} stereotyped << MetricVariable >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link MetricVariable} proxy or <i>null</i>.
     */
    @objid ("587b8f31-58de-4511-a9a8-a96cde5df761")
    public static MetricVariable instantiate(final Class obj) {
        return MetricVariable.canInstantiate(obj) ? new MetricVariable(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricVariable} proxy from a {@link Class} stereotyped << MetricVariable >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link MetricVariable} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("61e7c56b-eb46-491b-ae3c-ddbff49b533d")
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
     */
    @objid ("5cfe8356-a002-4c6e-b1a9-dae6542ce6ce")
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
     */
    @objid ("1509d73c-5d1d-46d5-8463-8442f4ce147e")
    public void addMetricVariableConstraint(final MetricVariableConstraint obj) {
        if (obj!=null)
          ((Class) this.elt).getConstraintDefinition().add(obj.getElement());
    }

    @objid ("784ddf99-d8d4-4922-b4f1-ea12ea9af3ab")
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
     */
    @objid ("21864f26-df09-40f6-a10d-f9b68332a607")
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
     */
    @objid ("3a2a63e2-3671-4b11-b087-76cdac4dccd4")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("bc08723c-beec-4a1b-8eae-eff2135d2e25")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2d33233b-7573-4ac5-ae31-c2e74b5fb6d2")
    public String getFormula() {
        return this.elt.getTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    /**
     * Get the values of the 'metricVariableConstraint' role.<p>
     * Role description:
     * null
     */
    @objid ("dbb340e1-024f-4afb-bfc7-33b751ee1c98")
    public List<MetricVariableConstraint> getMetricVariableConstraint() {
        List<MetricVariableConstraint> results = new ArrayList<>();
        for (Constraint mObj : ((Class) this.elt).getConstraintDefinition()){
            if (MetricVariableConstraint.canInstantiate(mObj))
                    results.add((MetricVariableConstraint)CamelDesignerProxyFactory.instantiate(mObj, MetricVariableConstraint.STEREOTYPE_NAME));
            }
        return Collections.unmodifiableList(results);
    }

    @objid ("44570601-d278-49f6-909a-a1abe9d42130")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'currentConfiguration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f6f3f3cf-b17c-4dce-a3c5-33627a28f5e3")
    public boolean isCurrentConfiguration() {
        return this.elt.isTagged(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b09f89b-75d2-472d-a7ae-63128c4f8fb0")
    public boolean isOnNodeCandidates() {
        return this.elt.isTagged(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'componentMetrics' role.<p>
     * Role description:
     * null
     */
    @objid ("00af3bdb-0448-4195-9afe-b222f7db96c2")
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
     */
    @objid ("57ac4731-adc1-44d6-b956-8343ef45a8ec")
    public boolean removeMetricVariableConstraint(final MetricVariableConstraint obj) {
        return (obj!=null)? ((Class) this.elt).getConstraintDefinition().remove(obj.getElement()) : false;
    }

    /**
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     */
    @objid ("ff8982b0-c635-4dd0-8f6e-dc1b6891c865")
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
    @objid ("a6d1ba9f-ae04-4eed-bbd9-9027e82e823e")
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
    @objid ("1545f2c0-2ff9-4446-b016-e12c5ab22c16")
    public void setFormula(final String value) {
        this.elt.putTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5e22d536-5dbe-4cf2-aa1f-bc93669bd024")
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

    @objid ("40356e17-439c-4e14-b8da-fec7a62596d8")
    protected MetricVariable(final Class elt) {
        super(elt);
    }

    @objid ("81037834-9acd-42d9-b1a5-2bc14d8ad956")
    public static final class MdaTypes {
        @objid ("a7cb7b8c-8cd6-46ee-a588-6a044a3e872b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c2b3774a-1806-46ff-abdc-e5c9b8513c9b")
        public static TagType CURRENTCONFIGURATION_TAGTYPE_ELT;

        @objid ("53a41b7e-92d0-41ff-a69c-7c9e12b64bfd")
        public static TagType ONNODECANDIDATES_TAGTYPE_ELT;

        @objid ("58890b3a-01cd-403b-9777-85269da6baad")
        public static TagType FORMULA_TAGTYPE_ELT;

        @objid ("d3d8a256-cac0-4d6d-88be-f56e7c5de8ec")
        private static Stereotype MDAASSOCDEP;

        @objid ("721c99ac-0672-40b6-bf08-0399f44522af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3da9627-7d96-41a6-9952-cda4dcf356c8")
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
