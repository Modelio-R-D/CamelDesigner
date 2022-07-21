/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("d210f2c0-1e11-49ab-8bb1-491b0270f9ca")
    public static final String STEREOTYPE_NAME = "OptimisationRequirement";

    @objid ("e518999f-2829-4122-8399-8da112bfef30")
    public static final String MINIMISE_TAGTYPE = "minimise";

    /**
     * Tells whether a {@link OptimisationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OptimisationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("ea538cc1-40be-4536-ae70-28d99b982a03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OptimisationRequirement >> then instantiate a {@link OptimisationRequirement} proxy.
     * 
     * @return a {@link OptimisationRequirement} proxy on the created {@link Class}.
     */
    @objid ("f38a6091-8112-4f37-9e13-e28d7b0d36a2")
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
    @objid ("1db04738-7551-4dbf-ba84-d32588781fa3")
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
    @objid ("3ce82a54-6026-4c8e-af73-9905be28f2e1")
    public static OptimisationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OptimisationRequirement.canInstantiate(obj))
        	return new OptimisationRequirement(obj);
        else
        	throw new IllegalArgumentException("OptimisationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d8e6f167-5a7e-4b68-8b39-26bbdffa4825")
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
    @objid ("bd1c49da-2932-4f1e-bfe1-b1a87311b67e")
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
    @objid ("5a81f16c-92e0-46a2-9328-1675259d85c5")
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
    @objid ("90588bec-9cc5-4c43-b148-094bee5392ce")
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

    @objid ("6dfc3942-5811-48aa-911a-ec5049aaff6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'minimise'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2fdf3ae7-6e0d-4019-a5d4-2c667245e9d7")
    public boolean isMinimise() {
        return this.elt.isTagged(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("109c85bf-def2-4f8c-b827-a322fb1b9bc5")
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
    @objid ("0f2472b8-a0bb-4ecf-9a52-aac031034ea5")
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
    @objid ("8e639ba7-02c1-4a00-9261-ac1a43d699f1")
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

    @objid ("94d4c354-aba6-4417-8d81-553508325ea6")
    protected OptimisationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("1977922d-e804-46aa-9701-85d9dc5c7714")
    public static final class MdaTypes {
        @objid ("5a5c725b-d60a-4d5f-9958-ca22cb0683c2")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c53a006f-d99b-4bc3-a184-bfdaf75fca48")
        public static TagType MINIMISE_TAGTYPE_ELT;

        @objid ("c68506b1-08dc-495b-a37e-2b29b65935e4")
        private static Stereotype MDAASSOCDEP;

        @objid ("ed9d6c7f-0ef8-4f5b-891d-80fd521f4d57")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e7fbe064-fc23-465e-98a9-53d4b0c8c5ea")
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
