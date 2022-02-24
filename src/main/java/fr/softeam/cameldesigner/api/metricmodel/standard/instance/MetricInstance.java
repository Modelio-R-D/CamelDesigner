/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
    @objid ("82dd887d-8af3-4aa5-a3a7-a5dcf4ec43b8")
    public static final String STEREOTYPE_NAME = "MetricInstance";

    /**
     * Tells whether a {@link MetricInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MetricInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8f03aeb1-a656-44fd-a7ea-86236bac0966")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MetricInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MetricInstance >> then instantiate a {@link MetricInstance} proxy.
     * 
     * @return a {@link MetricInstance} proxy on the created {@link Instance}.
     */
    @objid ("d92feaf1-c524-45b5-9c51-63c71358c987")
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
    @objid ("423ba621-2f4c-47fd-b5d7-54bab1925aae")
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
    @objid ("78af154c-3df7-4f8b-a54c-ac2a53cf4896")
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
    @objid ("51a80e86-c9be-4dee-9e9d-c7f2a6ff4b48")
    public void addCompositngMetricInstances(final MetricInstance obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(obj.getElement(), this.elt, MetricInstance.MdaTypes.MDAASSOCDEP);
            d.setName("");
            d.putTagValue(MetricInstance.MdaTypes.MDAASSOCDEP_ROLE, "");
        }
    }

    @objid ("45b9e3c2-86a8-42d3-86f7-f14fce4083e4")
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
    @objid ("2377222f-ccc1-4499-afa5-e7311b117102")
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
    @objid ("8c1dce40-5959-40f3-b10d-107818323844")
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
    @objid ("f0a56d80-1805-43cc-8c86-9d8824f760b4")
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
    @objid ("a381f0f2-c1fb-409a-bca4-18e68c8605df")
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

    @objid ("8dc89bb3-7b76-4e40-a2c7-fb059871e0e4")
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
    @objid ("982c9744-f6d3-4f24-9ed6-c117e1f5c57c")
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
    @objid ("7a798339-15d5-4781-b627-fe0e58071684")
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
    @objid ("1602058e-6fe1-4f79-9fdf-c855f58dc215")
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

    @objid ("2d84e94e-7cb2-49bc-bc7d-c8dcab9dbc19")
    protected MetricInstance(final Instance elt) {
        super(elt);
    }

    @objid ("45ad6582-8f92-4a4c-8f72-6829ca4fe86b")
    public static final class MdaTypes {
        @objid ("b0c613ef-d13c-4f4a-b120-d6969903eae8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d726c028-1359-46b2-a872-31b81dae7899")
        private static Stereotype MDAASSOCDEP;

        @objid ("11c71edf-82f3-4acb-84a2-62f66f3d97b7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1e8a273b-605f-459a-8cde-1e2fa84a55b2")
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
