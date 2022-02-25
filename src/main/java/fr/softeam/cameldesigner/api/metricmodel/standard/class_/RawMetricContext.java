/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("5028e3df-863a-48e3-b3e5-d32ef8eb200e")
    public static final String STEREOTYPE_NAME = "RawMetricContext";

    /**
     * Tells whether a {@link RawMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("cc2d6bb1-aefe-48b4-b147-926d57696b46")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetricContext >> then instantiate a {@link RawMetricContext} proxy.
     * 
     * @return a {@link RawMetricContext} proxy on the created {@link Class}.
     */
    @objid ("4b1021f6-4f6b-4168-a550-b027f8808aed")
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
    @objid ("13eb66d0-a7ca-4fcc-a0ec-97d7ca7df37f")
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
    @objid ("e1db1a24-25f5-4b98-8110-2ec5a25711d0")
    public static RawMetricContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetricContext.canInstantiate(obj))
        	return new RawMetricContext(obj);
        else
        	throw new IllegalArgumentException("RawMetricContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("159f21c3-5b9f-455c-973c-42d7097c61d2")
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
    @objid ("1d64e893-646c-43af-8aea-08f0d34f2da0")
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
    @objid ("62e63658-92b2-4e26-998c-591deda703a0")
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

    @objid ("2b8e7942-448b-4a66-a855-aca0d242dfa2")
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
    @objid ("ed5ff5d7-6abb-42ec-a9ff-6567b75fd5f7")
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

    @objid ("b28a700f-855b-4233-ade2-68596cc10bd2")
    protected RawMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("38465a8d-1a40-453e-9f7e-e6b706813cd4")
    public static final class MdaTypes {
        @objid ("233d5027-92b1-400d-a752-dfb0bae305a9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1cd89649-e2ec-415c-bb2e-8bf287375c0b")
        private static Stereotype MDAASSOCDEP;

        @objid ("f36ac6d7-903d-4428-9e15-3134b36fe914")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88d02bec-ee29-4753-b53e-69d5d934c770")
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
