/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricVariable;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.SoftRequirement;
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
 * Proxy class to handle a {@link Class} with << OptimisationRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("49b9e421-351d-46a3-bbb6-78228aca457c")
public class OptimisationRequirement extends SoftRequirement {
    @objid ("20b711c9-f52d-4f0d-bb7f-2357d6d19e96")
    public static final String STEREOTYPE_NAME = "OptimisationRequirement";

    @objid ("d440e116-2047-4046-8d8b-0fbbfd9b9241")
    public static final String MINIMISE_TAGTYPE = "minimise";

    /**
     * Tells whether a {@link OptimisationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OptimisationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("02764716-c318-408a-8306-14bf8fccf154")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OptimisationRequirement >> then instantiate a {@link OptimisationRequirement} proxy.
     * 
     * @return a {@link OptimisationRequirement} proxy on the created {@link Class}.
     */
    @objid ("c31eab3e-a728-4055-9e76-7546667ecd4d")
    public static OptimisationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME);
        return OptimisationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OptimisationRequirement} proxy from a {@link Class} stereotyped << OptimisationRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link OptimisationRequirement} proxy or <i>null</i>.
     */
    @objid ("287f9a62-a7e5-4e90-a338-e7c8c84e500d")
    public static OptimisationRequirement instantiate(final Class obj) {
        return OptimisationRequirement.canInstantiate(obj) ? new OptimisationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptimisationRequirement} proxy from a {@link Class} stereotyped << OptimisationRequirement >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link OptimisationRequirement} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("6f75422f-fd0d-4d2b-a7ea-0982847acd5f")
    public static OptimisationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OptimisationRequirement.canInstantiate(obj))
            return new OptimisationRequirement(obj);
        else
            throw new IllegalArgumentException("OptimisationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("51945e9e-9f87-419b-8e6c-6f49be96e110")
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
        OptimisationRequirement other = (OptimisationRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ec74b14f-04a1-4dd7-a3be-144f82ef0598")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricContext' role.<p>
     * Role description:
     * null
     */
    @objid ("0d3ef2a4-22e9-481c-8cff-a0a99f3e8835")
    public MetricContext getMetricContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(OptimisationRequirement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(OptimisationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")){
                  if (CompositeMetricContext.canInstantiate(d.getDependsOn()))
                     return (CompositeMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetricContext.canInstantiate(d.getDependsOn()))
                     return (RawMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("f2028fc8-8cc7-4490-9bb1-75f0810541dc")
    public MetricVariable getMetricVariable() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(OptimisationRequirement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(OptimisationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "metricVariable")){
                  if (MetricVariable.canInstantiate(d.getDependsOn()))
                     return (MetricVariable)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricVariable.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("40214647-29ff-49d2-a4bd-edc92a83d614")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'minimise'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8acedf73-e728-40e5-941f-8fc81b02faa0")
    public boolean isMinimise() {
        return this.elt.isTagged(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     */
    @objid ("eb734306-0fa1-4d39-bf50-54975b63056c")
    public void setMetricContext(final MetricContext obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(OptimisationRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(OptimisationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), OptimisationRequirement.MdaTypes.MDAASSOCDEP);
              dep.setName("metricContext");      dep.putTagValue(OptimisationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "metricContext");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'metricVariable' role.<p>
     * Role description:
     * null
     */
    @objid ("41d27050-236c-4804-9267-2ba7dcbc3200")
    public void setMetricVariable(final MetricVariable obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(OptimisationRequirement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(OptimisationRequirement.MdaTypes.MDAASSOCDEP_ROLE), "metricVariable")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), OptimisationRequirement.MdaTypes.MDAASSOCDEP);
              dep.setName("metricVariable");      dep.putTagValue(OptimisationRequirement.MdaTypes.MDAASSOCDEP_ROLE, "metricVariable");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for boolean property 'minimise'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a3db7744-632d-460b-a3de-e89ae81a806a")
    public void setMinimise(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT);
    }

    @objid ("f870ad2b-87df-476f-a629-bb2d84173db6")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("8fa577bb-9025-47a5-9755-76b7525c8f42")
    protected OptimisationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("1977922d-e804-46aa-9701-85d9dc5c7714")
    public static final class MdaTypes {
        @objid ("119760a9-cc7d-44d5-9786-bf75724e1ab9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9a1cce4d-b36d-4eab-8c42-3e1879617fb0")
        public static TagType MINIMISE_TAGTYPE_ELT;

        @objid ("24e37bc8-6e10-4396-9d01-f28d808c2daa")
        private static Stereotype MDAASSOCDEP;

        @objid ("59f043eb-13df-4699-9f36-83831154dd1d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fe422f34-7f58-4464-ab6c-9bf561f99cdd")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5032b63e-764b-4afb-8636-29fe5cee73f0");
            MINIMISE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bc674ab8-644b-456a-875e-c51eb68d068f");
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
