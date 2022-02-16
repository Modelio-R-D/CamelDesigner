/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("1a0a5b92-36d7-4b52-8e43-29cb98a3bea6")
    public static final String STEREOTYPE_NAME = "MetricInstance";

    /**
     * Tells whether a {@link MetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0aac0ccc-476f-4dc5-af74-87aa7200512a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MetricInstance >> then instantiate a {@link MetricInstance} proxy.
     * 
     * @return a {@link MetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("840372be-4800-49f3-bd46-2779251d39d3")
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
    @objid ("117ed41f-02b4-4cd2-8bf3-322256bb2d3b")
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
    @objid ("7cb4b3f2-0cda-4258-93a8-172f3baec843")
    public static MetricInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MetricInstance.canInstantiate(obj))
        	return new MetricInstance(obj);
        else
        	throw new IllegalArgumentException("MetricInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value of the 'compositngMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("57069040-fe65-4d72-8367-037ddf3b0403")
    public void addCompositngMetricInstances(final MetricInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, MetricInstance.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("3d433df0-4587-4efa-a1e1-4908298dbfec")
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
     * Get the values of the 'compositngMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("55b7d44b-7998-457e-959a-41a5dde6f1fd")
    public List<MetricInstance> getCompositngMetricInstances() {
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
    @objid ("0dcc7162-8f1d-48ea-a6fd-5f94332be1c5")
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
    @objid ("9cea08f8-2f72-43ad-b0c2-6cd79ab9cf69")
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
    @objid ("c59c0bba-7cfa-4099-abd1-ca6ca3fae35e")
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

    @objid ("0c59860c-bdba-44b2-b4fa-abf4ac0b76d6")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from 'compositngMetricInstances' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("767d4c52-c26e-4a07-8188-cb10597e1793")
    public boolean removeCompositngMetricInstances(final MetricInstance obj) {
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
    @objid ("06aa6a42-8308-42ed-8c59-e1e44d7fbd8b")
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
    @objid ("6955b402-af4c-4eda-ae65-ffe5243bac0f")
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

    @objid ("f6cc6ae8-6d36-4cc0-9182-a7de839088bb")
    protected MetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("45ad6582-8f92-4a4c-8f72-6829ca4fe86b")
    public static final class MdaTypes {
        @objid ("f06ae23a-fc44-490e-a46d-eab5dbd3f38c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("03841cc7-38ab-4930-9930-b55062a7d923")
        private static Stereotype MDAASSOCDEP;

        @objid ("4c2fd3e6-df36-4e89-b858-6d9babb481a2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("95b186f3-7d11-460f-9846-45237953151f")
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
