/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("4531ee60-07e8-4b73-af2b-99e7b213056e")
    public static final String STEREOTYPE_NAME = "OptimisationRequirement";

    @objid ("b8cee8be-c01e-4d37-b772-e727a4fefcc1")
=======
    @objid ("d1623bae-2b08-4793-b3d4-6a40fbf9e699")
    public static final String STEREOTYPE_NAME = "OptimisationRequirement";

    @objid ("f4cec29b-29d5-4308-9a6d-6bf81cbed5f0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String MINIMISE_TAGTYPE = "minimise";

    /**
     * Tells whether a {@link OptimisationRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << OptimisationRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8d631877-dab4-4b7e-bcb6-d50ae30332fc")
=======
    @objid ("aa460fc8-138f-4ee8-bc1a-d8e9ed332645")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OptimisationRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << OptimisationRequirement >> then instantiate a {@link OptimisationRequirement} proxy.
     * 
     * @return a {@link OptimisationRequirement} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("a64d1726-7fea-476d-81a6-d001a0230828")
=======
    @objid ("20fc1cb7-216e-4e83-8622-df28687929c9")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b8d1ec3f-e8f3-4800-b3b1-e7fe75e59d5b")
=======
    @objid ("27b1ccf9-e367-43af-8652-4e5c7faa35cb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("a3a3269e-48fd-4d3a-bdcd-82f56bbb0d86")
=======
    @objid ("d7f8877b-96d6-4d01-9842-9159a7fc2ef6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static OptimisationRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (OptimisationRequirement.canInstantiate(obj))
        	return new OptimisationRequirement(obj);
        else
        	throw new IllegalArgumentException("OptimisationRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("d7ff62d7-11d6-49c5-8c49-4894b28c9bbc")
=======
    @objid ("b040f5d3-2009-4f51-8fc5-eae1b5689b5c")
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
        OptimisationRequirement other = (OptimisationRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("56553581-e788-4876-bd40-d3bd585d87c2")
=======
    @objid ("5921d18c-c40f-4132-8504-507b52192cf7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("6504f6ce-e179-4250-930e-59b3cf020ae7")
=======
    @objid ("613a8285-e36b-4eb6-8bc1-2296c459cb22")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("357d8600-3268-455b-a828-6f4d1dbdb01d")
=======
    @objid ("e3a53676-f5af-49d8-a91a-4585529b468a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("4ef22d6b-2e2b-4ec6-b990-d005dfdf58a5")
=======
    @objid ("b0797b12-82bb-4a71-8b97-1ad7c35b0625")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'minimise'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("7822eb86-26b3-4f32-8ae6-b90015760084")
=======
    @objid ("ac17733e-e075-49b5-b769-58fe1ee7a402")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isMinimise() {
        return this.elt.isTagged(OptimisationRequirement.MdaTypes.MINIMISE_TAGTYPE_ELT);
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("7d840ef7-4200-4395-b89d-87a4ac201bbb")
=======
    @objid ("cd8ceb72-12aa-417c-9ac1-e89b6681a9eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("afe06902-dbb4-4f74-a2de-39a583119db5")
=======
    @objid ("d0519492-92aa-4128-926f-375f63f35d40")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("966bc3fa-d098-4a41-92cc-349433b6716b")
=======
    @objid ("99964221-6aed-4506-8190-8535ae0bb30c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("ff461800-e376-4c49-abcc-b8d939e1624f")
=======
    @objid ("6b0d9455-90a2-4c03-b8bb-b456f06aed4b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected OptimisationRequirement(final Class elt) {
        super(elt);
    }

    @objid ("1977922d-e804-46aa-9701-85d9dc5c7714")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("17c45dc6-ddb4-4095-ab63-995003ca4969")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d8a47803-6682-4fb1-9438-6b999b4ebe28")
        public static TagType MINIMISE_TAGTYPE_ELT;

        @objid ("c2dfa62b-e87c-456b-879e-5b1d3541d411")
        private static Stereotype MDAASSOCDEP;

        @objid ("9064504c-601c-41a0-9957-803361bde2e0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("560607df-5cbd-4f2f-ace3-13218690eaac")
=======
        @objid ("a0b97dd3-0d3c-4ce1-949d-6f74f40f42e9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4a725a1-3f12-4787-a2ba-25424c533fc3")
        public static TagType MINIMISE_TAGTYPE_ELT;

        @objid ("4788f1fe-c842-4462-a7ed-e2aa514693c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("fdcf1dc9-d3a0-4d2b-9870-f7432de1f209")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fc158be8-1dec-4b9c-b4e5-856a75fe507c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
