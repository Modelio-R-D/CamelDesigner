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
    @objid ("25424f06-f250-4dd6-8f91-cac4dc386fb2")
    public static final String STEREOTYPE_NAME = "RawMetricContext";

    /**
     * Tells whether a {@link RawMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6638d9ca-f289-4996-9448-3c0f1237fdd5")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetricContext >> then instantiate a {@link RawMetricContext} proxy.
     * 
     * @return a {@link RawMetricContext} proxy on the created {@link Class}.
     */
    @objid ("60418ca9-142f-400a-be2f-2dede3565559")
    public static RawMetricContext create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME);
        return RawMetricContext.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link RawMetricContext} proxy from a {@link Class} stereotyped << RawMetricContext >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link RawMetricContext} proxy or <i>null</i>.
     */
    @objid ("3c3ba4af-3667-4c18-9bcd-d1efa1f3a2c5")
    public static RawMetricContext instantiate(final Class obj) {
        return RawMetricContext.canInstantiate(obj) ? new RawMetricContext(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RawMetricContext} proxy from a {@link Class} stereotyped << RawMetricContext >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link RawMetricContext} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3d6801bb-245d-44c1-9e5b-1da6081dd8be")
    public static RawMetricContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetricContext.canInstantiate(obj))
            return new RawMetricContext(obj);
        else
            throw new IllegalArgumentException("RawMetricContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7d674390-f595-4162-b099-d14aea34147e")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("8ae0b498-8099-4041-bb75-f00006ca574b")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the value of the 'sensor' role.<p>
     * Role description:
     * null
     */
    @objid ("788b7b2a-1029-4f6d-9460-e9040b936f39")
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

    @objid ("b2087874-9a43-4bde-bc8d-f8e3a2b76e01")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'sensor' role.<p>
     * Role description:
     * null
     */
    @objid ("4c5174e0-2686-4ccc-8925-9f5d8160be0e")
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

    @objid ("795c7a53-c54b-49bc-a154-273f42c2edb1")
    protected RawMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("38465a8d-1a40-453e-9f7e-e6b706813cd4")
    public static final class MdaTypes {
        @objid ("0805e87b-d6dd-4000-a23a-5da266d4de6a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("58b8e0b6-a250-4bd7-bce4-3bf3b3196997")
        private static Stereotype MDAASSOCDEP;

        @objid ("373e4a8a-0049-49d8-8f28-0dd341dc3089")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f43f2d0e-ce7d-4591-822d-7c51830b633e")
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
