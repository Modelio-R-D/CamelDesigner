/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("a7b6b8a9-fc2a-454d-b205-cb9c715e79a4")
    public static final String STEREOTYPE_NAME = "OptimisationRequirement";

    @objid ("70d2f8e3-192a-4f8d-aa76-da9609bf64bb")
    public static final String MINIMISE_TAGTYPE = "minimise";

    /**
     * Tells whether a {@link OptimisationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OptimisationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("7c57707d-3271-412f-a03a-b04ba2f9527f")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OptimisationRequirement >> then instantiate a {@link OptimisationRequirement} proxy.
     * 
     * @return a {@link OptimisationRequirement} proxy on the created {@link Class}.
     */
    @objid ("b2beac2f-d7e4-4562-9846-35d018d8ed97")
    public static OptimisationRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME);
        return OptimisationRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link OptimisationRequirement} proxy from a {@link Class} stereotyped << OptimisationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link OptimisationRequirement} proxy or <i>null</i>.
     */
    @objid ("2ec6b2dc-8466-440a-87a3-cfb5130194dd")
    public static OptimisationRequirement instantiate(final Class obj) {
        return OptimisationRequirement.canInstantiate(obj) ? new OptimisationRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OptimisationRequirement} proxy from a {@link Class} stereotyped << OptimisationRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link OptimisationRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("309f0e70-4a5b-43cc-bcec-be56811d8b2b")
    public static OptimisationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OptimisationRequirement.canInstantiate(obj))
        	return new OptimisationRequirement(obj);
        else
        	throw new IllegalArgumentException("OptimisationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("92e6c8d7-16f7-4ac6-a62e-c5d5527dc457")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("85169143-94b6-470e-b51a-af01c7c985cd")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("8abb362c-a41f-4203-b632-3e849f882786")
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
     * 
     */
    @objid ("6323bd25-1a5e-4008-a281-df998e80fb79")
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

    @objid ("34e25dc9-3b37-459a-be67-fc24490e731e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'minimise'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e1f31dac-e98e-4f22-8989-71603e0618db")
    public boolean isMinimise() {
        return this.elt.isTagged(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("229680b5-4fed-4c5d-b042-f9d3213d208f")
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
     * 
     */
    @objid ("2890d51c-7ac5-4817-bd8e-654e7bb51fc8")
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
    @objid ("0bbdae6b-2a66-4789-ae38-ca2815f01230")
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

    @objid ("c72670a0-80bb-4241-b61b-c4bfa7d5734c")
    protected OptimisationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("1977922d-e804-46aa-9701-85d9dc5c7714")
    public static final class MdaTypes {
        @objid ("15a0b586-58a4-4d1a-8a5e-be41d711772a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("06dd8ae2-a203-4d3b-bdc0-8c74c8cb3033")
        public static TagType MINIMISE_TAGTYPE_ELT;

        @objid ("992b1e56-e2c1-47f2-9027-aedc287f4bd2")
        private static Stereotype MDAASSOCDEP;

        @objid ("35a38e57-f7a2-4715-bfa8-783d34a02fa5")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cbb52b82-a248-4c90-97b7-1ec988af136f")
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
