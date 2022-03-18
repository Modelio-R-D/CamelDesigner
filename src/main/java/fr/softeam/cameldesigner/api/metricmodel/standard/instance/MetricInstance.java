/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 3/17/22 5:18 PM by Modelio Studio.
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
    @objid ("40ca7401-9683-4d88-8627-3272124d8e8b")
    public static final String STEREOTYPE_NAME = "MetricInstance";

    /**
     * Tells whether a {@link MetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b79a7626-031b-4af0-a812-aac7c3ff9048")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MetricInstance >> then instantiate a {@link MetricInstance} proxy.
     * 
     * @return a {@link MetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("befdef2a-b7bd-4ca3-846f-c12dbd630e6c")
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
    @objid ("f9799e2e-0c31-4980-a190-adb0d3d5b67a")
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
    @objid ("9b1292a5-4055-4b58-b84e-30b4722c817d")
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
    @objid ("744a334b-efb0-413f-8a5c-8ccd6732404c")
    public void addComposingMetricInstances(final MetricInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, MetricInstance.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("05c4b050-ed99-4945-b7a0-32c86dec6510")
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
    @objid ("1dbc97b5-082e-45d2-af59-0c64c0d11670")
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
    @objid ("e108591a-ce25-4c7d-b158-e62449d3209d")
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
    @objid ("f7b61fd3-916f-4cb5-84b9-c39d711e1903")
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
    @objid ("e4e8e19e-f746-4fc9-a913-e967843f899c")
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

    @objid ("08cd40fb-3c6c-4219-99d0-954329ba9931")
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
    @objid ("ae0183b6-e132-422e-9447-a95a688ece76")
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
    @objid ("5629abe3-0aac-46c0-88a2-a0f40b038802")
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
    @objid ("19884559-34a7-46bd-bec5-591c49411eea")
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

    @objid ("e0814cdd-02cf-4b93-bbda-55e44e59481a")
    protected MetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("45ad6582-8f92-4a4c-8f72-6829ca4fe86b")
    public static final class MdaTypes {
        @objid ("4fe58afa-981c-4ec0-9371-fbf934c3b104")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("da0b627d-0062-4bf0-ba3f-8c4f51cb19f0")
        private static Stereotype MDAASSOCDEP;

        @objid ("075ff1eb-8581-4004-a7fa-7090d12f4edb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bd1e011b-16d8-4eb9-909f-96c599810802")
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
