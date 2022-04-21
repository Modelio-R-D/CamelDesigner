/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.executionmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.class_.FeatureClass;
import fr.softeam.cameldesigner.api.metricmodel.standard.instance.MetricInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.EventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.FunctionalEventInstance;
import fr.softeam.cameldesigner.api.scalabilitymodel.standard.instance.NonFunctionalEventInstance;
import fr.softeam.cameldesigner.api.securitymodel.standard.instance.SecurityMetricInstance;
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
 * Proxy class to handle a {@link Class} with << Measurement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fd364a84-8a23-4f50-a661-f2ea77419f95")
public abstract class Measurement extends FeatureClass {
    @objid ("a056b4f8-3f68-44ac-9d9e-51d7dfab9ecf")
    public static final String STEREOTYPE_NAME = "Measurement";

    @objid ("a3ba7018-abf8-4f41-b4c8-bf23ad838b5b")
    public static final String MEASUREMENTTIME_TAGTYPE = "measurementTime";

    @objid ("a469044b-1e7c-4a86-ae76-d6a38d5083f9")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link Measurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Measurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("650cce93-9b65-4418-8346-a5bebf62769b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Measurement.STEREOTYPE_NAME));
    }

    @objid ("76239579-0172-47a5-a467-de7e693cd4d2")
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
        Measurement other = (Measurement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("7282f0ad-8718-48aa-a527-3bf3b06c544d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'eventInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("ac172c29-d420-4071-b028-b96eb358569b")
    public EventInstance getEventInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "eventInstance")){
                  if (FunctionalEventInstance.canInstantiate(d.getDependsOn()))
                     return (FunctionalEventInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), FunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (NonFunctionalEventInstance.canInstantiate(d.getDependsOn()))
                     return (NonFunctionalEventInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), NonFunctionalEventInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'measurementTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("055534a6-9e88-4b3d-946c-8c0b934af0c0")
    public String getMeasurementTime() {
        return this.elt.getTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("3b786ddc-d0bc-4c93-90aa-d1104e1d5a53")
    public MetricInstance getMetricInstance() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")){
                  if (SecurityMetricInstance.canInstantiate(d.getDependsOn()))
                     return (SecurityMetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), SecurityMetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
                  if (MetricInstance.canInstantiate(d.getDependsOn()))
                     return (MetricInstance)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), MetricInstance.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    /**
     * Getter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("de7d5665-c331-4452-b7ac-0942dd35d4a5")
    public String getValue() {
        return this.elt.getTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("30255a3e-f695-480d-a3c3-863c0a76273a")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'eventInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("d2938902-04bf-4b2c-85d0-9971f90cd0ae")
    public void setEventInstance(final EventInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "eventInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Measurement.MdaTypes.MDAASSOCDEP);
              dep.setName("eventInstance");      dep.putTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE, "eventInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'measurementTime'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9ebff87f-eb8a-4e3f-8540-79aa2d565bcb")
    public void setMeasurementTime(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     */
    @objid ("3f405254-5f9d-4f21-8e8e-7476d5471239")
    public void setMetricInstance(final MetricInstance obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(Measurement.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE), "metricInstance")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), Measurement.MdaTypes.MDAASSOCDEP);
              dep.setName("metricInstance");      dep.putTagValue(Measurement.MdaTypes.MDAASSOCDEP_ROLE, "metricInstance");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    /**
     * Setter for string property 'value'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6694e53c-3b62-4e18-b442-4cab14e27e75")
    public void setValue(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT, value);
    }

    @objid ("02510881-80fc-40cc-928e-76857fcf5dbd")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("b501c88c-264a-404a-8b5d-8ecdcb506542")
    protected Measurement(final Class elt) {
        super(elt);
    }

    @objid ("c5c12d99-af0a-463a-876e-c2847d9efbb0")
    public static final class MdaTypes {
        @objid ("2488f7a8-3f71-480d-bd0c-453eae55340d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("845c1390-627d-4769-a8a9-d86ab2686586")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("b9009db3-80ce-4482-b88b-23697fb86584")
        public static TagType MEASUREMENTTIME_TAGTYPE_ELT;

        @objid ("738c9b1f-56cf-4d93-8db6-aabe98584c05")
        private static Stereotype MDAASSOCDEP;

        @objid ("56927ca5-3a0d-480f-8b24-45e85a062500")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("24588970-2c4f-4417-ae82-53b372d1323b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "481e52bb-d5b3-4dcb-a365-8ca5d75d8ac2");
            VALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03f06745-0e69-475c-a468-9f73b761a5d0");
            MEASUREMENTTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "501b05dc-7f34-42e0-9da5-3a581c881e5c");
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
