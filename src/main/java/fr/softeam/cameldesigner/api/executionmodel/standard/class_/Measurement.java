/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("1659c3d3-bd85-4ef9-97a7-067fb2e87058")
    public static final String STEREOTYPE_NAME = "Measurement";

    @objid ("e3260074-b4a3-424f-93ec-d905c6f43a7e")
    public static final String MEASUREMENTTIME_TAGTYPE = "measurementTime";

    @objid ("62fb0461-ec2d-4849-92ef-09863548f628")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link Measurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Measurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("88e897e1-5c48-432e-b11e-45be4176abf3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Measurement.STEREOTYPE_NAME));
    }

    @objid ("50a705b7-42e8-4a3a-97f6-4d640a93ddb6")
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
     * @return the Class represented by this proxy, never null.
     */
    @objid ("d193bc8a-8789-4a97-ada5-ace9967093d3")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'eventInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("88014db2-5c0d-4b58-b7bd-0453ac09890f")
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
    @objid ("6786af9c-b3de-433e-931c-a1f06e0d11c0")
    public String getMeasurementTime() {
        return this.elt.getTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("94f1c6c6-2b9e-4f31-abfa-fedfbf89bc23")
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
    @objid ("426caea1-308e-4882-b94a-7e5787c249f4")
    public String getValue() {
        return this.elt.getTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("21b42d44-e62d-4e67-81b1-c6a378f8a767")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'eventInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("00aea6b4-af5b-443d-ac5e-7eb17125af3a")
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
    @objid ("602cb9c6-4b45-49bf-afc4-1fd68fdeacc8")
    public void setMeasurementTime(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("d741b5ef-6405-4ea2-9d1e-71b84ebefd6b")
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
    @objid ("c0738a84-0961-4df3-a4cb-65887a7b3c2c")
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

    @objid ("7541918e-8887-4aa5-8fbe-26da9bb839fa")
    protected Measurement(final Class elt) {
        super(elt);
    }

    @objid ("c5c12d99-af0a-463a-876e-c2847d9efbb0")
    public static final class MdaTypes {
        @objid ("6701bd39-0488-4760-a153-dbea4e6316a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d28e92f2-04a1-4ab8-90bd-ff17a5072ab5")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("1ae7c907-cdad-4674-ae3d-abd4a9e330e5")
        public static TagType MEASUREMENTTIME_TAGTYPE_ELT;

        @objid ("6dff411b-b4f0-4f5f-8823-a0e07315ab79")
        private static Stereotype MDAASSOCDEP;

        @objid ("479bf411-6d3a-4301-ace1-8ac06454ad5d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ac9484be-db22-4c71-a27c-a8ddc8a37c47")
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
