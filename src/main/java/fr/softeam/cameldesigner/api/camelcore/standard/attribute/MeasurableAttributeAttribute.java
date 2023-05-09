/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("3cb64b15-07a5-4d55-96e2-f58d27ec5141")
    public static final String STEREOTYPE_NAME = "MeasurableAttribute_Attribute";

    /**
     * Tells whether a {@link MeasurableAttributeAttribute proxy} can be instantiated from a {@link MObject} checking it is a {@link Attribute} stereotyped << MeasurableAttribute_Attribute >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2f8c3b6d-82bd-4c57-aaa0-9bf93ec0f60e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Attribute) && ((Attribute) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MeasurableAttributeAttribute.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Attribute} stereotyped << MeasurableAttribute_Attribute >> then instantiate a {@link MeasurableAttributeAttribute} proxy.
     * 
     * @return a {@link MeasurableAttributeAttribute} proxy on the created {@link Attribute}.
     */
    @objid ("6683705b-8fea-48cd-aa9d-b6abd19506db")
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
    @objid ("b490384e-624b-406d-9da4-62f319e72b7b")
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
    @objid ("94bb621e-1352-42cf-8ee9-03ec3362f6c7")
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
    @objid ("6bdd3ba1-2e6d-48be-9caf-fe029db09378")
    public void addSensors(final Sensor obj) {
        if (obj != null) {
            IModelingSession session = CamelDesignerModule.getInstance().getModuleContext().getModelingSession();
            Dependency d = session.getModel().createDependency(this.elt, obj.getElement(), MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP);
            d.setName("sensors");
            d.putTagValue(MeasurableAttributeAttribute.MdaTypes.MDAASSOCDEP_ROLE, "sensors");
        }
    }

    @objid ("af719ea1-d7f9-4a48-8703-29a42ff80999")
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
    @objid ("925c3916-3bac-47bf-adb0-92b1ecbc2705")
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
    @objid ("e593e634-723e-4fc0-a60d-50a696616c32")
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

    @objid ("adf2e100-e301-4c20-bc25-7167b5559b97")
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
    @objid ("6cc11ade-8c32-4910-bd7f-7861a4cabae6")
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

    @objid ("2238e85e-eb36-4c07-a18e-ab9b053b1da7")
    protected MeasurableAttributeAttribute(final Attribute elt) {
        super(elt);
    }

    @objid ("dd33b21d-72fe-4210-844d-e9819ab9d4aa")
    public static final class MdaTypes {
        @objid ("7132a39f-e9c5-45c4-b558-218ba094f955")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("fee52d18-a92a-438f-aed2-ac506991e72e")
        private static Stereotype MDAASSOCDEP;

        @objid ("3b2a02ca-53c3-4140-bd9f-56a75bf5d343")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f2649825-d83e-4325-a965-83100ba78725")
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
