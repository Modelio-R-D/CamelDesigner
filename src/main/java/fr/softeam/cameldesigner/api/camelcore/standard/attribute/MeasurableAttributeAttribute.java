/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("876cd895-0220-4a2b-bfd2-73cc695539ee")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Attribute";

    /**
     * Tells whether a {@link MeasurableAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MeasurableAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("55c96b1e-515f-45f1-8d49-d234b5d19dfa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MeasurableAttribute_Attribute >> then instantiate a {@link MeasurableAttributeAttribute} proxy.
     * 
     * @return a {@link MeasurableAttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("e69e6d14-686a-4346-bc0b-09b14edc2c07")
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
    @objid ("14d1b58f-e6bb-4fb8-91a2-fcc9bf68249f")
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
    @objid ("b007d625-8c27-4074-9355-3f6267b2279e")
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
    @objid ("9d4e39a9-0bc1-4b2f-9ce9-a0918213095e")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("acf0591f-eb84-4264-83b1-95503b3ddbb2")
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
    @objid ("ab5b662f-12dc-4cbf-b77e-f9a31dcc11ba")
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
    @objid ("a5caf8d8-c366-4202-b375-8a545891c043")
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

    @objid ("5a7feea2-3095-49ef-a645-3ba369d5cbbe")
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
    @objid ("0610de60-7230-4540-8185-5db2f32b79bb")
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

    @objid ("fc1cffff-aeae-4a60-a541-8999cc474e44")
    protected MeasurableAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("dd33b21d-72fe-4210-844d-e9819ab9d4aa")
    public static final class MdaTypes {
        @objid ("120d3148-303d-4a85-ac88-145660da7ad0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("24e53855-e148-4c95-8a40-4e445d420981")
        private static Stereotype MDAASSOCDEP;

        @objid ("680cb878-f67a-4e1a-8979-41df2f9292a0")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("26b99cbb-ce60-4478-b9cf-340e119a6c7e")
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
