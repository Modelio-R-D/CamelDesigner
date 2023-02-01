/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.metricmodel.standard.component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.deploymentmodel.standard.component.SoftwareComponent;
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
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Component} with << Sensor >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("a0dafd4c-3a94-4343-86b0-316952020ebd")
public class Sensor extends SoftwareComponent {
<<<<<<< HEAD
    @objid ("3d0fb7bf-aa84-4ca6-9506-9a9bd483b35a")
    public static final String STEREOTYPE_NAME = "Sensor";

    @objid ("c296ee66-e923-4af8-b331-486e7fc7e5da")
    public static final String CONFIGURATION_TAGTYPE = "configuration";

    @objid ("84f57be2-0004-46be-b042-c66bfb916b47")
=======
    @objid ("510dfbe0-f63c-449d-aae0-a2ed0a49a500")
    public static final String STEREOTYPE_NAME = "Sensor";

    @objid ("91018419-233e-438b-97ec-7dd9f82acd10")
    public static final String CONFIGURATION_TAGTYPE = "configuration";

    @objid ("b0335262-afe1-45b1-9cf0-46090076c91a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String ISPUSH_TAGTYPE = "isPush";

    /**
     * Tells whether a {@link Sensor proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Sensor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("534b1c5e-b912-4382-8676-0bd161292f0c")
=======
    @objid ("d51fdb2b-18d3-410e-a5ed-00b21d2c9ab3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Sensor >> then instantiate a {@link Sensor} proxy.
     * 
     * @return a {@link Sensor} proxy on the created {@link Component}.
     */
<<<<<<< HEAD
    @objid ("b992fdb5-29ee-436e-a77a-e98c6817e878")
=======
    @objid ("b60c7650-abe5-409a-9cc8-32ccaecb0b63")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Sensor create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME);
        return Sensor.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link Sensor} proxy from a {@link Component} stereotyped << Sensor >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Component
     * @return a {@link Sensor} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("57050841-9ae8-4fff-a9e3-548a2edde44e")
=======
    @objid ("7d156e1c-7f77-419f-aef9-da7c17745f69")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Sensor instantiate(final Component obj) {
        return Sensor.canInstantiate(obj) ? new Sensor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Sensor} proxy from a {@link Component} stereotyped << Sensor >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Component}
     * @return a {@link Sensor} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("07ae382e-4520-4c81-aef5-8b5e5bdfe14e")
=======
    @objid ("ec53091f-7f22-43d4-b8ad-9de6a6ee06b5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Sensor safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (Sensor.canInstantiate(obj))
        	return new Sensor(obj);
        else
        	throw new IllegalArgumentException("Sensor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("71c24aba-5049-4fce-83ad-de53945237a1")
=======
    @objid ("cec28b54-fb57-41aa-87a5-f4f0dc0ea6bd")
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
        Sensor other = (Sensor) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8e1faac4-adee-434d-a036-75fd3dd29530")
=======
    @objid ("ef997b29-dd91-4ee5-bf5d-39ed20450b3f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getConfiguration() {
        return this.elt.getTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("b11cee76-7ac5-43e7-b976-2444c2fd8be2")
=======
    @objid ("993a60aa-5dd8-4bcc-873b-44fa1fc0023f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

<<<<<<< HEAD
    @objid ("631cfd77-5a7f-4383-908a-e9eb7dab45d1")
=======
    @objid ("14af7afc-9b0c-446d-ba3b-611357cebfc6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("e638c53d-46b3-42e7-bc56-ebf240376ec5")
=======
    @objid ("d05b3496-a5be-43b5-a270-457eb99340e7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIsPush() {
        return this.elt.isTagged(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("710bd39b-dc65-4fc3-aa70-5508aad68792")
=======
    @objid ("df10289b-c6b0-4c30-af9a-ecfc1d35520d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setConfiguration(final String value) {
        this.elt.putTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8510eb7e-4d96-4432-9fa0-7216739a49bc")
=======
    @objid ("bff7f9c3-f62a-40f3-b4c2-31d5c48bac45")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setIsPush(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT);
    }

    @objid ("f0aab173-a14e-48a0-9e86-d7347e9dc9bb")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("55a705c2-3e7c-4c8b-a83a-84753f31b2cb")
=======
    @objid ("93323245-26a9-4426-9227-49fcd4c4b5e0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Sensor(final Component elt) {
        super(elt);
    }

    @objid ("ab2c122d-31c1-421d-919a-92957fbd08bd")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("9a79ae2d-3079-4665-b6ba-2aef49ddac97")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("85c1a1ac-3ee8-4f03-be5d-33d4b4b6a8e9")
        public static TagType CONFIGURATION_TAGTYPE_ELT;

        @objid ("0834d42d-a51c-48b2-8f14-0c88f6073d4b")
        public static TagType ISPUSH_TAGTYPE_ELT;

        @objid ("a770d86f-4c73-4599-9680-124577321b12")
        private static Stereotype MDAASSOCDEP;

        @objid ("08ab6610-7b8b-4f81-bef5-ca09860d4fa3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e474e0ef-0ac4-4055-8dee-bfbed379e4c3")
=======
        @objid ("9a85cce2-e5ba-4dd7-aeb7-7bda9030399f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8af79a3a-5321-4dc1-ad89-91f5f0934c4f")
        public static TagType CONFIGURATION_TAGTYPE_ELT;

        @objid ("5b40ec99-0dde-4040-a3a6-a42d69def35f")
        public static TagType ISPUSH_TAGTYPE_ELT;

        @objid ("83c7dcb2-0b63-4026-9fe2-bce535d7ce6d")
        private static Stereotype MDAASSOCDEP;

        @objid ("d0ebf219-a00e-4fdb-9f7f-4900fe7d5bff")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("348fcf04-8736-4def-bac5-90e4ba2d6b82")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "d130006b-ebe5-4a5f-818a-abc63742cf56");
            CONFIGURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "326b1fa3-0a38-48be-aace-c126d5979004");
            ISPUSH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "13acdee9-96c7-4ae3-82b9-99cd12effc27");
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
