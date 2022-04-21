/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("76bf61d2-186c-409a-8ca1-b4be14ec2a52")
    public static final String STEREOTYPE_NAME = "Metric";

    /**
     * Tells whether a {@link Metric proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Metric >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bc0254c2-8a6d-4d99-baad-cb04c916dd80")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Metric.STEREOTYPE_NAME));
    }

    @objid ("43bfa8b2-07f8-4a67-aff4-1c2da852a345")
    public static Metric instantiate(final Class obj) {
        return CompositeMetric.canInstantiate(obj) ?  CompositeMetric.instantiate(obj) :
            MetricVariable.canInstantiate(obj) ?  MetricVariable.instantiate(obj) :
                RawMetric.canInstantiate(obj) ?  RawMetric.instantiate(obj) : null;
    }

    @objid ("adafedee-953c-409f-99cb-47074b158f41")
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
    @objid ("e7e3d6c5-6a85-4d35-8c32-65fd342a7e0e")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("027ab602-8d68-4982-b2c4-920e9c0eeaef")
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

    @objid ("c87b8f81-6cec-47cb-b296-1f73665dbcdf")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'metricTemplate' role.<p>
     * Role description:
     * null
     */
    @objid ("0a7aafa8-1722-47e9-a837-12f31cca1b97")
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

    @objid ("2b584c45-5b91-4847-a94f-7bb38137f6f7")
    protected Metric(final Class elt) {
        super(elt);
    }

    @objid ("7453f2c0-0edc-453a-bbfc-bbc62bf7a06d")
    public static final class MdaTypes {
        @objid ("2926bc46-f79f-466d-b1a0-86dd5d9230b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("4ab156aa-ff76-46c9-9d11-5f89f8c50a54")
        private static Stereotype MDAASSOCDEP;

        @objid ("76e7dc3c-dd39-44e5-a462-7e496666d425")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d2f24c1f-5ad5-4ffa-97e7-15f3bffd4033")
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
