/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.class_.MetricTemplate;
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
 * Proxy class to handle a {@link Class} with << Metric >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b0754957-bc68-473c-a808-aac4f2fd0421")
public abstract class Metric extends FeatureClass {
    @objid ("2ae9da2d-30b4-4314-9ac1-26c156409cfc")
    public static final String STEREOTYPE_NAME = "Metric";

    /**
     * Tells whether a {@link Metric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Metric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("05f0492f-f047-4d26-b472-6c9a13475d7b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME));
    }

    @objid ("43bfa8b2-07f8-4a67-aff4-1c2da852a345")
    public static Metric instantiate(final Class obj) {
        return CompositeMetric.canInstantiate(obj) ?  CompositeMetric.instantiate(obj) :
            MetricVariable.canInstantiate(obj) ?  MetricVariable.instantiate(obj) :
                RawMetric.canInstantiate(obj) ?  RawMetric.instantiate(obj) : null;
    }

    @objid ("8c0e8bb2-438e-46d8-88d8-14fff11c56bf")
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
        Metric other = (Metric) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8b58f400-0a08-446e-b818-da9c50655419")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("507a940a-ec3d-4ae3-b74a-10ad318618cd")
    public MetricTemplate getMetricTemplate() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")){
                  if (MetricTemplate.canInstantiate(d.getDependsOn()))
                     return (MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("b71cec66-2978-4948-852f-3f831776ff16")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("3c24b036-4ba7-460c-b3bb-eaa4e8ee6514")
    public void setMetricTemplate(final MetricTemplate obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Metric.MdaTypes.MDAASSOCDEP);
              dep.setName("metricTemplate");      dep.putTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE, "metricTemplate");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("65b7b6c9-5383-4b1f-ba59-053dd76cfb95")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("9d80c11b-2836-4515-a3f4-8bf1d68ca6eb")
    protected Metric(final Class elt) {
        super(elt);
    }

    @objid ("7453f2c0-0edc-453a-bbfc-bbc62bf7a06d")
    public static final class MdaTypes {
        @objid ("205535fc-3131-4c55-990d-b8a9d29d9f24")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f567a239-1cbd-46ff-88d1-f866cf8b22e7")
        private static Stereotype MDAASSOCDEP;

        @objid ("1a50e06e-56e9-4b15-b4a9-ac30f92c4801")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac9f37d2-25bb-4d8d-91a8-6f07782552da")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1603af9c-7b21-4da2-96b7-6607aa8066cc");
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
