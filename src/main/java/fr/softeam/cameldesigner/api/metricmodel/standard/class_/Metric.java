/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
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
    @objid ("aa71de43-043c-4c06-88dd-37408849d6ac")
    public static final String STEREOTYPE_NAME = "Metric";

    @objid ("43bfa8b2-07f8-4a67-aff4-1c2da852a345")
    public static Metric instantiate(final Class obj) {
        return CompositeMetric.canInstantiate(obj) ?  CompositeMetric.instantiate(obj) :
            MetricVariable.canInstantiate(obj) ?  MetricVariable.instantiate(obj) :
                RawMetric.canInstantiate(obj) ?  RawMetric.instantiate(obj) : null;
    }

    @objid ("8d9d5e2d-a94a-4955-b3e7-8bb30f002510")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("ee831ee6-1dd4-4cc2-babb-f8341e1a6710")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("471f3519-386f-4b34-8bb7-99cf8d69057f")
    public MetricTemplate getMetricTemplate() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Metric.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Metric.MdaTypes.MDAASSOCDEP_ROLE), "metricTemplate")
                  && MetricTemplate.canInstantiate(d.getDependsOn())) {
                     return (MetricTemplate)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricTemplate.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("a502a76f-9499-4504-8515-d1e773ac8944")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("e7695412-8164-40ce-9a77-feae2dca38fb")
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

    @objid ("535b4c2e-f9f0-4c18-aa4a-59f2454707db")
    protected Metric(final Class elt) {
        super(elt);
    }

    @objid ("7453f2c0-0edc-453a-bbfc-bbc62bf7a06d")
    public static final class MdaTypes {
        @objid ("d549286c-107a-45d9-bb4c-85f966d8f2bb")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b352cee9-4105-438e-9bdf-009bcfbc892d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c3a845b3-45a6-4cbc-8c4a-d9bd90498544")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ae928705-f773-43fa-aab0-25284b0a8f70")
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
