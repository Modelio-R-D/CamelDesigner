/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << MeasurableAttribute_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("f7605dc5-004d-4e28-b490-e312ea63cee2")
public class MeasurableAttributeClass extends QualityAttributeClass {
    @objid ("127de0fe-ca2a-4a95-a828-e19cc8b0a42b")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Class";

    /**
     * Tells whether a {@link MeasurableAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MeasurableAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("6db97d32-3d86-495f-936b-7bd174b4059e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MeasurableAttribute_Class >> then instantiate a {@link MeasurableAttributeClass} proxy.
     * 
     * @return a {@link MeasurableAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("1c1764ea-51bf-49eb-a1c3-260face0bd4d")
    public static MeasurableAttributeClass create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeClass.STEREOTYPE_NAME);
        return MeasurableAttributeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeClass} proxy from a {@link Class} stereotyped << MeasurableAttribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link MeasurableAttributeClass} proxy or <i>null</i>.
     */
    @objid ("aca233c4-2f8d-4b31-b021-18d94b717bbf")
    public static MeasurableAttributeClass instantiate(final Class obj) {
        return MeasurableAttributeClass.canInstantiate(obj) ? new MeasurableAttributeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeClass} proxy from a {@link Class} stereotyped << MeasurableAttribute_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link MeasurableAttributeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("953a8f35-9a6d-4baf-bdaf-984a177da90d")
    public static MeasurableAttributeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (MeasurableAttributeClass.canInstantiate(obj))
        	return new MeasurableAttributeClass(obj);
        else
        	throw new IllegalArgumentException("MeasurableAttributeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("88b2f5ea-b215-4401-a0b0-2c723e4c1356")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeClass.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("7e56d51d-aedf-4ed8-9937-89b704f42563")
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
        MeasurableAttributeClass other = (MeasurableAttributeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("4b0baffa-3b34-4a36-9efb-d2483f9b5c1a")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("53274c1e-f289-4a31-b626-42a1d2280adc")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "sensors")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("93ea6526-955f-4ab9-8155-f8da04c7539d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("f9e6cc29-0bcf-48cc-aab7-cd812d593153")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE), "sensors")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("c1d2e5dd-dd39-431d-bbd8-3ad3b381798d")
    protected MeasurableAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("f5778737-9189-4851-90e5-4c429752bc4a")
    public static final class MdaTypes {
        @objid ("677cc925-0858-46df-82c3-a2c90a53c0cc")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("012082e8-5d89-453f-a293-eea78e074d15")
        private static Stereotype MDAASSOCDEP;

        @objid ("58a12526-17fb-4ad5-b18f-b7d1594870eb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("994e0274-d976-401f-94d6-9bc1a911f734")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "41f442d8-cf5f-4e6c-a842-47675cf36361");
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
