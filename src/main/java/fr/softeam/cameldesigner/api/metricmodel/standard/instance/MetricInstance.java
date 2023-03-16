/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.instance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.instance.FeatureInstance;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.CompositeMetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricContext;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricObjectBinding;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.RawMetricContext;
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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MetricInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5336bcd3-259d-4b82-a7c1-f1ce23e0ed30")
public class MetricInstance extends FeatureInstance {
    @objid ("4979a462-de1f-4f4c-a798-ed7bdb6522e9")
    public static final String STEREOTYPE_NAME = "MetricInstance";

    /**
     * Tells whether a {@link MetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d64825a7-5e11-46de-9209-0207b1745e3e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MetricInstance >> then instantiate a {@link MetricInstance} proxy.
     * 
     * @return a {@link MetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("5ffea4e0-b58d-4014-aaab-764d35e6d320")
    public static MetricInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME);
        return MetricInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MetricInstance} proxy from a {@link Instance} stereotyped << MetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MetricInstance} proxy or <i>null</i>.
     */
    @objid ("e4a822ec-c000-4802-b912-1cd4859e5894")
    public static MetricInstance instantiate(final Instance obj) {
        return MetricInstance.canInstantiate(obj) ? new MetricInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MetricInstance} proxy from a {@link Instance} stereotyped << MetricInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MetricInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("748a8d9e-d05f-48fd-82e7-d08f29e73436")
    public static MetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MetricInstance.canInstantiate(obj))
        	return new MetricInstance(obj);
        else
        	throw new IllegalArgumentException("MetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'composingMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("9c3926b0-860b-408f-a632-c1def99ca226")
    public void addComposingMetricInstances(final MetricInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, MetricInstance.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("b060611c-64c5-4790-9ceb-a391def85342")
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
        MetricInstance other = (MetricInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'composingMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("176f341d-820a-4cee-b224-7781a2cf6752")
    public List<MetricInstance> getComposingMetricInstances() {
        List<MetricInstance> results = new ArrayList<>();
        for (Dependency d : this.elt.getImpactedDependency()) {
          if (d.isStereotyped(MetricInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE), "")
              && MetricInstance.canInstantiate(d.getImpacted())) {
                 results.add((MetricInstance)CamelDesignerProxyFactory.instantiate(d.getImpacted(), MetricInstance.STEREOTYPE_NAME));
          }
        }
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("56fa31f3-48c5-482c-b533-bcaed7c14ae6")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d1ad183f-43ed-4017-a706-b2ee5adad69c")
    public MetricContext getMetricContext() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")){
                  if (CompositeMetricContext.canInstantiate(d.getDependsOn()))
                     return (CompositeMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), CompositeMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
                  if (RawMetricContext.canInstantiate(d.getDependsOn()))
                     return (RawMetricContext)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), RawMetricContext.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Get the value of the 'objectBinding' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("57a8ef26-33d3-4b59-ab4d-22bbb230839c")
    public MetricObjectBinding getObjectBinding() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(MetricInstance.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE), "objectBinding")){
                  if (MetricObjectBinding.canInstantiate(d.getDependsOn()))
                     return (MetricObjectBinding)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricObjectBinding.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("e8ce104d-6fed-4ae6-ab8f-83fe1c4176f2")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'composingMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("116e529f-b965-491f-b7b2-f8bd29248a11")
    public boolean removeComposingMetricInstances(final MetricInstance obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getImpactedDependency())) {
            if (d.isStereotyped(MetricInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE), ""))
              if (Objects.equals(d.getImpacted(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    /**
     * Set the value of the 'metricContext' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a29442a7-068d-4d23-9af8-77a6b11fe2fc")
    public void setMetricContext(final MetricContext obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE), "metricContext")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("metricContext");      dep.putTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE, "metricContext");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Set the value of the 'objectBinding' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("de9a5e40-d459-416b-a848-1ae136e9b9f9")
    public void setObjectBinding(final MetricObjectBinding obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(MetricInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE), "objectBinding")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), MetricInstance.MdaTypes.MDAASSOCDEP);
              dep.setName("objectBinding");      dep.putTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE, "objectBinding");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("f9933d62-5596-46a0-b5cc-4d94e55a5d7f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("4be353cb-6088-4e57-a107-abb26c90863b")
    protected MetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("45ad6582-8f92-4a4c-8f72-6829ca4fe86b")
    public static final class MdaTypes {
        @objid ("93a12094-c2b6-495a-8dea-a1e934ecb4e3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("69ec7f02-4f0d-4a22-a9ac-3d307ea22919")
        private static Stereotype MDAASSOCDEP;

        @objid ("b1d6ad73-ab1d-4495-82c1-bfc0c797f716")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("37434b19-8c0b-4343-a2ab-b01226aef0cb")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "52b2d53f-cfda-455d-ae3d-dd97fed6fa84");
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
