/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("34941adc-ee73-4a8c-b3f5-528b5cd93bd9")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Class";

    /**
     * Tells whether a {@link MeasurableAttributeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << MeasurableAttribute_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("9c0a991f-5e69-419c-b1d7-0863f414760b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << MeasurableAttribute_Class >> then instantiate a {@link MeasurableAttributeClass} proxy.
     * 
     * @return a {@link MeasurableAttributeClass} proxy on the created {@link Class}.
     */
    @objid ("df36fe5b-98b3-435f-857a-8c418281fdfe")
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
    @objid ("7ac5e7ad-f8f3-4d3f-b532-9685bd3d1ae8")
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
    @objid ("189d7304-7507-40a9-a96b-b9fbe921ec01")
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
    @objid ("3797b566-b5f6-45a7-a431-5c5b39536096")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeClass.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeClass.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("0e7b1f8d-a7e0-412f-90da-7be7fa333d57")
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
    @objid ("29ad91ba-d589-44c7-bef7-36b413582f62")
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
    @objid ("f7c17f2c-49b1-4153-8277-cc1a7b36eaa4")
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

    @objid ("05e1f605-5540-4c35-a91f-ab01784474d0")
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
    @objid ("1902d9e9-e70d-4001-a72a-2e1a5c231c43")
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

    @objid ("cf566c66-5880-4b82-91b3-fb2d84f295a4")
    protected MeasurableAttributeClass(final Class elt) {
        super(elt);
    }

    @objid ("f5778737-9189-4851-90e5-4c429752bc4a")
    public static final class MdaTypes {
        @objid ("62538a9b-92a7-401a-90cc-000db8e626b5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("42008073-6412-4726-bd18-8edb5b38cb36")
        private static Stereotype MDAASSOCDEP;

        @objid ("ccf79aa2-e5d6-4862-9498-8c69aa4d53f2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("082be7c9-8fb1-43f4-bc00-768b3b921461")
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
