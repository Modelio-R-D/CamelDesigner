/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("2db68e53-4f1c-4970-809d-c00aaffaef3b")
=======
    @objid ("be3ea665-0234-4696-9c70-37621f36700e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String STEREOTYPE_NAME = "RawMetricContext";

    /**
     * Tells whether a {@link RawMetricContext proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << RawMetricContext >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("a7330dc7-1917-479f-9b23-bfa47157ed64")
=======
    @objid ("b1a522af-aebf-49aa-ad00-0c59f1225c84")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, RawMetricContext.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << RawMetricContext >> then instantiate a {@link RawMetricContext} proxy.
     * 
     * @return a {@link RawMetricContext} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("52ae318d-49cf-4d16-ae08-c08c21edfbfc")
=======
    @objid ("e18b7d66-35e0-4325-84d3-fa7ac82a1dfc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("994f07f9-39ef-42e9-82da-28cc03402a3d")
=======
    @objid ("fdb79eb0-46d4-4ea2-836e-08aeca405d6c")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("979fb592-966e-4ac4-8cde-4cab20c097f7")
=======
    @objid ("ffac79ac-b04e-4e5c-995c-8c151b2d637f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static RawMetricContext safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (RawMetricContext.canInstantiate(obj))
        	return new RawMetricContext(obj);
        else
        	throw new IllegalArgumentException("RawMetricContext: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("ce95ff79-6897-4133-a909-918f7d7621ca")
=======
    @objid ("7570add3-3c6f-444c-aeb9-1cb806202d35")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("04850135-5320-48a0-801b-05228c202bdd")
=======
    @objid ("4fd2df2c-8484-435d-a9bd-f9d77b3972c7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("108fbcce-ad67-47ff-815c-c05c691f329a")
=======
    @objid ("f8f38997-0b79-4aec-9fa1-4e686c014435")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("2637f2d5-e70e-4a0d-a801-bddd871415ac")
=======
    @objid ("58e95ae8-318a-400d-9ab8-d18ae85cd566")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b496e69d-1a73-4260-a750-86feaee8111f")
=======
    @objid ("61879855-af75-4eb1-ae73-5db1dd4a0902")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("e6f99482-95e6-44b3-85e2-a2562191b70e")
=======
    @objid ("f0f8879f-3a8c-45ae-be19-22faed5e4166")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected RawMetricContext(final Class elt) {
        super(elt);
    }

    @objid ("38465a8d-1a40-453e-9f7e-e6b706813cd4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("319a88b7-433e-4b71-b915-a7f5c19a89c8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2797420c-102d-4d02-b9b1-4dddb04298eb")
        private static Stereotype MDAASSOCDEP;

        @objid ("ffc3e6b5-f1e1-4182-96c3-f5b2ff9215d9")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("40ea9832-0b9c-441d-9b1d-80ddbd77a0f2")
=======
        @objid ("707bddf4-08cd-4e1e-9f27-b331e81a1f28")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8e05d3e9-fb13-49f1-8ae5-f8d3aa730142")
        private static Stereotype MDAASSOCDEP;

        @objid ("38932d15-2678-4225-b571-cf0a2ab4cf39")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5fa4608a-601c-4df4-9fd3-0ed809125418")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
