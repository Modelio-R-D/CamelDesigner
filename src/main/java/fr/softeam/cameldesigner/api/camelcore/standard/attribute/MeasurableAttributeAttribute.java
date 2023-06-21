/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.camelcore.standard.attribute;

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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Attribute} with << MeasurableAttribute_Attribute >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("64d9c99b-c8af-4882-b63d-a30a40d1dd03")
public class MeasurableAttributeAttribute extends QualityAttributeAttribute {
    @objid ("e8845f15-f9fb-4683-bccb-e13a8b71d676")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Attribute";

    /**
     * Tells whether a {@link MeasurableAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MeasurableAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("34afb640-9d81-45ab-b1bc-3ffd4255e1b4")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MeasurableAttribute_Attribute >> then instantiate a {@link MeasurableAttributeAttribute} proxy.
     * 
     * @return a {@link MeasurableAttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("b8a8e8a3-d4c0-456b-8ed6-ffc1c54ecf62")
    public static MeasurableAttributeAttribute create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Attribute");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeAttribute.STEREOTYPE_NAME);
        return MeasurableAttributeAttribute.instantiate((Attribute)e);
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeAttribute} proxy from a {@link Attribute} stereotyped << MeasurableAttribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Attribute
     * @return a {@link MeasurableAttributeAttribute} proxy or <i>null</i>.
     */
    @objid ("faa9567e-9e11-4e27-8856-36da066515eb")
    public static MeasurableAttributeAttribute instantiate(final Attribute obj) {
        return MeasurableAttributeAttribute.canInstantiate(obj) ? new MeasurableAttributeAttribute(obj) : null;
    }

    /**
     * Tries to instantiate a {@link MeasurableAttributeAttribute} proxy from a {@link Attribute} stereotyped << MeasurableAttribute_Attribute >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Attribute}
     * @return a {@link MeasurableAttributeAttribute} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("266156b5-088e-4b5a-bc4e-6871263f30c9")
    public static MeasurableAttributeAttribute safeInstantiate(final Attribute obj) throws IllegalArgumentException {
        if (MeasurableAttributeAttribute.canInstantiate(obj))
        	return new MeasurableAttributeAttribute(obj);
        else
        	throw new IllegalArgumentException("MeasurableAttributeAttribute: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("231f0b0b-e41e-4221-b950-941cecb65c34")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("ae12e780-8b8b-4079-8853-4c1958dd87a4")
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
        MeasurableAttributeAttribute other = (MeasurableAttributeAttribute) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Attribute}. 
     * @return the Attribute represented by this proxy, never null.
     */
    @objid ("e47ca4c8-2fe0-4f7b-88a7-1a49ff29b9b1")
    @Override
    public Attribute getElement() {
        return (Attribute)super.getElement();
    }

    /**
     * Get the values of the 'sensors' role.<p>
     * Role description:
     * null
     * 
     */
    @objid ("97b91aaf-4e08-4f41-8508-157f4f4cac64")
    public List<Sensor> getSensors() {
        List<Sensor> results = new ArrayList<>();
        for (Dependency d : this.elt.getDependsOnDependency()) {
           if (d.isStereotyped(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP)
              && Objects.equals(d.getTagValue(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE), "sensors")){
              if (Sensor.canInstantiate(d.getDependsOn()))
                results.add((Sensor)CamelDesignerProxyFactory.instantiate(d.getDependsOn(), Sensor.MdaTypes.STEREOTYPE_ELT.getName()));
           }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b6efa013-2017-4abd-bfcd-608a2ecae3f7")
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
    @objid ("f9662d82-4e08-49f4-a33e-e5873d5ae5cb")
    public boolean removeSensors(final Sensor obj) {
        if (obj != null) {
          for (Dependency d : new ArrayList<>(this.elt.getDependsOnDependency())) {
            if (d.isStereotyped(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP) && Objects.equals(d.getTagValue(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE), "sensors")) 
              if (Objects.equals(d.getDependsOn(), obj.getElement())) {
                d.delete();
                return true;
              }
          }
        }
        return false;
    }

    @objid ("fccda640-c8ca-48d9-a7df-e855ed889022")
    protected MeasurableAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("dd33b21d-72fe-4210-844d-e9819ab9d4aa")
    public static final class MdaTypes {
        @objid ("1bfed9d1-6c4e-4654-b612-3d20e54de0f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d4375690-5f0f-425f-9f0d-025e1cb225a0")
        private static Stereotype MDAASSOCDEP;

        @objid ("3d1b1018-3347-4f7a-8ed6-8d427d147d36")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("fc00aadc-e8ac-4dc5-a4a3-52b2acdb6196")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0904c020-0de8-4170-8d49-131f2ce38022");
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
