/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("8ee1ee7d-b2ef-4b7a-b9c6-a25cc0a05874")
    public static final String STEREOTYPE_NAME = "Measurement";

    @objid ("696c0788-42d1-498c-ba90-f960aa53f6c4")
    public static final String MEASUREMENTTIME_TAGTYPE = "measurementTime";

    @objid ("85e61bcb-e428-4186-a782-7a15674403ee")
    public static final String VALUE_TAGTYPE = "value";

    /**
     * Tells whether a {@link Measurement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Measurement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b9af453b-78ad-4b8e-8fba-3d114d7e0d35")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Measurement.STEREOTYPE_NAME));
    }

    @objid ("169ef046-02f3-4e98-812d-b65079d5a00a")
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
    @objid ("5037a17b-ba8c-4888-959e-838da01b1540")
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
    @objid ("2f01067b-794f-4f42-ad37-e309cb5d1166")
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
    @objid ("33dec706-af41-4cbb-afc9-7a1ac155d24a")
    public String getMeasurementTime() {
        return this.elt.getTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT);
    }

    /**
     * Get the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("a3d348de-cabb-4e00-986a-6e500d1db74b")
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
    @objid ("3bef7dc3-322c-406c-abc1-afdc456044a8")
    public String getValue() {
        return this.elt.getTagValue(Measurement.MdaTypes.VALUE_TAGTYPE_ELT);
    }

    @objid ("6c2bde2d-53b5-4565-b602-d7f1d294ce1e")
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
    @objid ("914ca49f-e965-41f8-8cbb-98ef0a785ddf")
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
    @objid ("ea7aebe1-84e4-4e39-8eeb-4a43e0f42d46")
    public void setMeasurementTime(final String value) {
        this.elt.putTagValue(Measurement.MdaTypes.MEASUREMENTTIME_TAGTYPE_ELT, value);
    }

    /**
     * Set the value of the 'metricInstance' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("84682540-861d-4d40-b7a2-6d0feee393d4")
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
    @objid ("c19c6d44-6e62-4cdb-90ca-a91f83047c71")
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

    @objid ("c987769c-d522-4f74-a001-5399cd6cf1c7")
    protected Measurement(final Class elt) {
        super(elt);
    }

    @objid ("c5c12d99-af0a-463a-876e-c2847d9efbb0")
    public static final class MdaTypes {
        @objid ("472545b1-91e1-4c20-a8cc-3012d719018a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("df50f14b-a3d1-47e7-a020-5805a50307d4")
        public static TagType VALUE_TAGTYPE_ELT;

        @objid ("c164a754-aa03-472c-88f7-403d247ff73e")
        public static TagType MEASUREMENTTIME_TAGTYPE_ELT;

        @objid ("d25c54bd-1837-432d-9d40-571da9833172")
        private static Stereotype MDAASSOCDEP;

        @objid ("5a02edf7-0ffe-4954-8fac-7daa66b893d8")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f1bb1ba2-8d80-4b41-a74f-f916e9fb8891")
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
