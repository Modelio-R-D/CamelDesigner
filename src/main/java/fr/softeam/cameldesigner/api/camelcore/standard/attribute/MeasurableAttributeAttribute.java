/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
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
    @objid ("e36c9701-1147-4504-9c81-a4bcbd29ace4")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Attribute";

    /**
     * Tells whether a {@link MeasurableAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MeasurableAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("206b76e4-2f40-4dc2-9656-5516e52f7f4c")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MeasurableAttribute_Attribute >> then instantiate a {@link MeasurableAttributeAttribute} proxy.
     * 
     * @return a {@link MeasurableAttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("48196358-96b6-4324-9546-4a124dd8371d")
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
    @objid ("77629919-c14d-48c1-808d-e74a3ee517c3")
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
    @objid ("975e7a17-3725-4ede-8186-23a64cfe8eda")
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
    @objid ("aa23a380-1017-4243-a295-c444b815049f")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("d0da4b88-6e38-427c-b5d6-14d71f7a1d70")
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
    @objid ("6e0ca8c2-5f74-4c05-aa6c-c2525152f7ac")
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
    @objid ("5326c84e-615c-4f21-8f69-d321e3ee7713")
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

    @objid ("2cb08ba2-f3ee-47df-8942-6fd9817081a5")
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
    @objid ("f39cb060-85da-4fd9-a4ba-e0e48d3fab3f")
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

    @objid ("52f1b19f-a5bd-4852-9587-03f42269f05a")
    protected MeasurableAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("dd33b21d-72fe-4210-844d-e9819ab9d4aa")
    public static final class MdaTypes {
        @objid ("863f9f3c-64ed-4d0a-be87-8ddd52f62be1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9c11d451-b469-4a44-aff3-3cbc4fa9e7c5")
        private static Stereotype MDAASSOCDEP;

        @objid ("c7811308-0d49-4ff2-98db-2cf40ad9a1af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("08765519-eaab-48a6-a9e9-69085c4608c8")
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
