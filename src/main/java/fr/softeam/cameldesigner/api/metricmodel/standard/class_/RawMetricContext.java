/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/23/22 5:02 PM by Modelio Studio.
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
import fr.softeam.cameldesigner.api.metricmodel.standard.component.Sensor;
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
 * Proxy class to handle a {@link Class} with << RawMetricContext >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f6e35952-0df3-4920-a24c-8a8b737ff791")
public class RawMetricContext extends MetricContext {
    @objid ("0ba1d3d9-5144-4c38-8569-f11d4b9dd718")
    public static final String STEREOTYPE_NAME = "RawMetricContext";

    /**
     * Tells whether a {@link RawMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("91ea9f1d-c559-4b48-9e73-55ed3d8dcb10")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetricContext >> then instantiate a {@link RawMetricContext} proxy.
     * 
     * @return a {@link RawMetricContext} proxy on the created {@link Class}.
     */
    @objid ("056e6626-fb50-4e2a-a1b0-fcb3c4e49e10")
    public static RawMetricContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME);
        return RawMetricContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RawMetricContext} proxy from a {@link Class} stereotyped << RawMetricContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link RawMetricContext} proxy or <i>null</i>.
     */
    @objid ("15f3e7eb-b054-4f96-aaf3-29c8fa5c2bc2")
    public static RawMetricContext instantiate(final Class obj) {
        return RawMetricContext.canInstantiate(obj) ? new RawMetricContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RawMetricContext} proxy from a {@link Class} stereotyped << RawMetricContext >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link RawMetricContext} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("328069e7-6b1c-446d-981c-ad9f2b2ae877")
    public static RawMetricContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetricContext.canInstantiate(obj))
        	return new RawMetricContext(obj);
        else
        	throw new IllegalArgumentException("RawMetricContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("b82e2cbd-8041-4df4-8c8f-346ff9ef7049")
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
        RawMetricContext other = (RawMetricContext) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4d475570-60e3-41f7-96fc-5e50bf85611b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'sensor' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f89846af-521c-484d-88f2-39c28696322b")
    public Sensor getSensor() {
        for (Dependency d : this.elt.getDependsOnDependency()) {
              if (d.isStereotyped(RawMetricContext.MdaTypes.MDAASSOCDEP)
                  && Objects.equals(d.getTagValue(RawMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "sensor")){
                  if (Sensor.canInstantiate(d.getDependsOn()))
                     return (Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName());
              }
        }
        return null;
    }

    @objid ("7b883891-ffba-4c03-99b4-513404b70714")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'sensor' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("141497c7-b286-4039-b902-2b6f60c72542")
    public void setSensor(final Sensor obj) {
        Dependency dep = null;
        for (Dependency d : this.elt.getDependsOnDependency())
          if (d.isStereotyped(RawMetricContext.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(RawMetricContext.MdaTypes.MDAASSOCDEP_ROLE), "sensor")) {
             dep = d;
             break;
          }
        if (obj == null) {
           if(dep != null) dep.delete();
        } else {
          if (dep == null) {
              IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
              dep = session.getModel().createDependency(this.elt, obj.getElement(), RawMetricContext.MdaTypes.MDAASSOCDEP);
              dep.setName("sensor");      dep.putTagValue(RawMetricContext.MdaTypes.MDAASSOCDEP_ROLE, "sensor");
          }
          dep.setDependsOn(obj.getElement());
        }
    }

    @objid ("3dec74dd-de4a-464d-bbfc-be1393ae227f")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("c710e69b-e676-4daf-8f8b-ba98e6273863")
    protected RawMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("38465a8d-1a40-453e-9f7e-e6b706813cd4")
    public static final class MdaTypes {
        @objid ("de0dad4c-16e2-47d6-b4c7-44b8665aa8f0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("cadba914-52f0-47cd-87a0-8f7a16b767ac")
        private static Stereotype MDAASSOCDEP;

        @objid ("ef336f24-ed35-4a74-bb4d-8bf52ad1e571")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7f8ae6b5-7b5c-4283-aec8-7909b4f74d98")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e344a491-8e64-437e-81c2-ca5e85a6daf9");
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
