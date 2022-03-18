/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("7a23f05d-50d3-426c-a029-2f38fde52feb")
    public static final String STEREOTYPE_NAME = "OptimisationRequirement";

    @objid ("b1f50441-6bff-4ae0-ab14-4d075739492a")
    public static final String MINIMISE_TAGTYPE = "minimise";

    /**
     * Tells whether a {@link OptimisationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OptimisationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("17cc43fa-41f0-4cee-9d9d-3c0a245e160a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OptimisationRequirement >> then instantiate a {@link OptimisationRequirement} proxy.
     * 
     * @return a {@link OptimisationRequirement} proxy on the created {@link Class}.
     */
    @objid ("8921f215-71a0-46cc-9a8f-c2f5dc1fa292")
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
    @objid ("6855fb63-49ac-4b2e-a390-4e58e68b148a")
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
    @objid ("03684206-d32a-41bc-bc49-d7f7e41a5610")
    public static OptimisationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OptimisationRequirement.canInstantiate(obj))
        	return new OptimisationRequirement(obj);
        else
        	throw new IllegalArgumentException("OptimisationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3144923d-f11d-43b6-8207-a7b67aaea84b")
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
    @objid ("afbcd07b-a5bb-4a38-a6f7-851ee7d13e90")
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
    @objid ("31a7a9c0-81b2-4a3f-bc96-88599650d80e")
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
    @objid ("064bace8-6e55-440a-af4d-fc0da5597307")
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

    @objid ("c849239b-8387-45b8-84bb-8518a6492376")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'minimise'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5f360fc9-01a8-436d-ac6c-308139e8177b")
    public boolean isMinimise() {
        return this.elt.isTagged(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("979c966d-2ec9-4aad-a960-73e27b27fcef")
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
    @objid ("1270c37d-6a97-4424-bb95-93fdf42b50b3")
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
    @objid ("c03c9a49-ad7a-4985-ace4-b5b3dc43bdb2")
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

    @objid ("b643ab51-caef-44c0-8107-10c68d8a4c30")
    protected OptimisationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("1977922d-e804-46aa-9701-85d9dc5c7714")
    public static final class MdaTypes {
        @objid ("7017e909-27a2-4e7b-a636-835adf5eed28")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a88f3eec-6b3f-4c51-a7f3-b4d685897784")
        public static TagType MINIMISE_TAGTYPE_ELT;

        @objid ("01dea57a-6155-4766-b444-020e83fec0a5")
        private static Stereotype MDAASSOCDEP;

        @objid ("221ee333-b86d-4d0d-a6a5-8e5c72be0698")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("61fe6a7b-71ad-441b-88fa-1f3d8d78189b")
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
