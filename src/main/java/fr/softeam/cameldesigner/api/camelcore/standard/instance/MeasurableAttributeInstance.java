/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << MeasurableAttribute_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("2794691d-52e1-4349-b451-6571daab6bcf")
public class MeasurableAttributeInstance extends QualityAttributeInstance {
    @objid ("fbe9b09f-e39f-4723-8870-d259f605efca")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Instance";

    /**
     * Tells whether a {@link MeasurableAttributeInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << MeasurableAttribute_Instance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("90a6ca2e-002a-4c2e-a679-1f6416a2d66b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << MeasurableAttribute_Instance >> then instantiate a {@link MeasurableAttributeInstance} proxy.
     * 
     * @return a {@link MeasurableAttributeInstance} proxy on the created {@link Instance}.
     */
    @objid ("a9c5ea7f-2595-4383-845e-e7c71dc3837c")
    public static MeasurableAttributeInstance create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Instance");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeInstance.STEREOTYPE_NAME);
        return MeasurableAttributeInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeInstance} proxy from a {@link Instance} stereotyped << MeasurableAttribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link MeasurableAttributeInstance} proxy or <i>null</i>.
     */
    @objid ("82ee50ff-d7e5-493c-a396-a5278e216070")
    public static MeasurableAttributeInstance instantiate(final Instance obj) {
        return MeasurableAttributeInstance.canInstantiate(obj) ? new MeasurableAttributeInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeInstance} proxy from a {@link Instance} stereotyped << MeasurableAttribute_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link MeasurableAttributeInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e96e668c-e0a4-4f09-ba3c-db147009a794")
    public static MeasurableAttributeInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (MeasurableAttributeInstance.canInstantiate(obj))
        	return new MeasurableAttributeInstance(obj);
        else
        	throw new IllegalArgumentException("MeasurableAttributeInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("1430e370-5854-421b-9d31-99a5b8ca7d99")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("321aa6b6-7b17-442f-a558-4eebb252fec5")
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
        MeasurableAttributeInstance other = (MeasurableAttributeInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("428dfcb8-aa0f-4dd5-bfeb-4c4e555856cb")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("729b88d7-b4e7-42ef-bf1a-fbc7af9b873f")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE), "sensors")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0834e1b6-e4a6-4d40-9e93-70c867c8da16")
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
    @objid ("fdb9ce80-5250-4fa5-805b-32ee6d557256")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MeasurableAttributeInstance.MdaTypes.MDAASSOCDEP_ROLE), "sensors")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("2c4228e4-28f3-4377-a3af-c0959e3dfea5")
    protected MeasurableAttributeInstance(final Instance elt) {
        super(elt);
    }

    @objid ("9b87b896-0774-41c7-9ed8-14db2e722c5f")
    public static final class MdaTypes {
        @objid ("3f1c2d98-0299-49e5-bf01-1ef307a9e45c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("80fcbcfa-7ab5-4a50-a328-fd6f55fcca1f")
        private static Stereotype MDAASSOCDEP;

        @objid ("6ed22324-d744-4941-8994-2650be364c06")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d9de525b-7478-4dd5-b725-6bd0552a98d2")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d6b1b6f6-ccbb-486b-bf73-fc570fe504b9");
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
