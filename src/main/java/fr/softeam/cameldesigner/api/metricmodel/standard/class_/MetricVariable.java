/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v0.1.06

 * This file was generated on 11/30/20 8:06 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.CamelComponent;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
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
public class MetricVariable extends Metric {
    public static final String STEREOTYPE_NAME = "MetricVariable";

    public static final String CURRENTCONFIGURATION_TAGTYPE = "currentConfiguration";

    public static final String FORMULA_TAGTYPE = "formula";

    public static final String ONNODECANDIDATES_TAGTYPE = "onNodeCandidates";

    /**
     * Tells whether a {@link MetricVariable proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MetricVariable >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricVariable.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MetricVariable >> then instantiate a {@link MetricVariable} proxy.
     * 
     * @return a {@link MetricVariable} proxy on the created {@link Class}.
     */
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
    public void addComponentMetrics(final Metric obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MetricVariable.MdaTypes.MDAASSOCDEP);
            d.setName("componentMetrics");
            d.putTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE, "componentMetrics");
        }
    }

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
    public CamelComponent getComponent() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "component")
                  && CamelComponent.canInstantiate(d.getDependsOn())) {
                     return (CamelComponent)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CamelComponent.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the values of the 'componentMetrics' role.<p>
     * Role description:
     * null
     */
    public List<Metric> getComponentMetrics() {
        List<Metric> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
          if (d.isStereotyped(MetricVariable.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricVariable.MdaTypes.MDAASSOCDEP_ROLE), "componentMetrics")
              && Metric.canInstantiate(d.getDependsOn()))
                results.add((Metric)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Metric.MdaTypes.STEREOTYPE_ELT.getName()));
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'formula'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public String getFormula() {
        return this.elt.getTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'currentConfiguration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public boolean isCurrentConfiguration() {
        return this.elt.isTagged(MetricVariable.MdaTypes.CURRENTCONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public boolean isOnNodeCandidates() {
        return this.elt.isTagged(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    /**
     * Remove a value from the 'componentMetrics' role.<p>
     * Role description:
     * null
     */
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
     * Set the value of the 'component' role.<p>
     * Role description:
     * null
     */
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
    public void setFormula(final String value) {
        this.elt.putTagValue(MetricVariable.MdaTypes.FORMULA_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'onNodeCandidates'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    public void setOnNodeCandidates(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MetricVariable.MdaTypes.ONNODECANDIDATES_TAGTYPE_ELT);
    }

    protected MetricVariable(final Class elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CURRENTCONFIGURATION_TAGTYPE_ELT;

        public static TagType ONNODECANDIDATES_TAGTYPE_ELT;

        public static TagType FORMULA_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

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
