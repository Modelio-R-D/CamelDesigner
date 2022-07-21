/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("a27b320d-eb2b-4f23-b546-578db9db6b1e")
    public static final String STEREOTYPE_NAME = "RawMetricContext";

    /**
     * Tells whether a {@link RawMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("0c66049f-c118-4bb7-90b3-bcbbe9a17856")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetricContext >> then instantiate a {@link RawMetricContext} proxy.
     * 
     * @return a {@link RawMetricContext} proxy on the created {@link Class}.
     */
    @objid ("bf51d88b-49a4-44e1-b548-b681585445b3")
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
    @objid ("a28d6f9b-351f-4235-8293-6884fffd7ca3")
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
    @objid ("d41d8954-c272-4691-a067-3d4ac2f1881e")
    public static RawMetricContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetricContext.canInstantiate(obj))
        	return new RawMetricContext(obj);
        else
        	throw new IllegalArgumentException("RawMetricContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("86cf0111-0866-43f4-b9ca-7cc1b1dc38ae")
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
    @objid ("1d91ccd3-95cb-473f-b99f-9f0fc103e6c8")
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
    @objid ("23e7f20e-2a5d-4f24-b3dc-45c3e8d564a6")
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

    @objid ("ac92acb1-607f-48cf-b348-776c7386eab7")
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
    @objid ("5ce22ae8-89d2-434e-a480-296d7510e481")
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

    @objid ("407bc94f-78ed-4b6c-a96c-b19837e0abfb")
    protected RawMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("38465a8d-1a40-453e-9f7e-e6b706813cd4")
    public static final class MdaTypes {
        @objid ("29387644-5caa-40f5-aeb1-9d9607f2ab6c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c7424afb-626f-4617-954b-86f61e736bf2")
        private static Stereotype MDAASSOCDEP;

        @objid ("fb70bbe0-9a1f-48f9-abfc-dd49096d2e8b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("177904e4-1942-4f66-a337-0920038fe8c5")
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
