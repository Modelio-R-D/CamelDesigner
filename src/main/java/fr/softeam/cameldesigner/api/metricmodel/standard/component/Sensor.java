/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
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
    @objid ("5e2e13cc-8175-47e2-b015-fa45aef90481")
    public static final String STEREOTYPE_NAME = "Sensor";

    @objid ("1b1b6c86-a53e-4bbc-b5ec-aac38094a453")
    public static final String CONFIGURATION_TAGTYPE = "configuration";

    @objid ("dd9af733-a092-4973-adfc-a16e24eaff45")
    public static final String ISPUSH_TAGTYPE = "isPush";

    /**
     * Tells whether a {@link Sensor proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Sensor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d33aded6-c2ac-4222-8ae2-09a9a4bd80d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Sensor >> then instantiate a {@link Sensor} proxy.
     * 
     * @return a {@link Sensor} proxy on the created {@link Component}.
     */
    @objid ("b04f22c2-bee3-47ac-80ff-5dd6a993b2b5")
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
    @objid ("4e5338e9-79e2-41fa-ae35-15166675edaf")
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
    @objid ("1059c002-451e-4b0f-aabd-55e6b036fb64")
    public static Sensor safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (Sensor.canInstantiate(obj))
        	return new Sensor(obj);
        else
        	throw new IllegalArgumentException("Sensor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("99f3aa7f-8d36-44cf-a767-353121dee320")
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
    @objid ("5ec076d9-fab7-422e-8a73-55c5252b9d66")
    public String getConfiguration() {
        return this.elt.getTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("83b33a0f-5b67-4c48-9b2b-4bbbc86a9db6")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("73420b5e-9aef-40ca-8649-ce00d44dae75")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c625e1c2-216b-4d9b-85ad-0ff69818ed50")
    public boolean isIsPush() {
        return this.elt.isTagged(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("65442aac-d05d-499b-a6fa-184a3b80dcaa")
    public void setConfiguration(final String value) {
        this.elt.putTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fd5a90db-2b61-43d7-8f15-f61cef4c80ec")
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

    @objid ("bfcee666-9cf1-44e8-b63e-86a0332c0269")
    protected Sensor(final Component elt) {
        super(elt);
    }

    @objid ("ab2c122d-31c1-421d-919a-92957fbd08bd")
    public static final class MdaTypes {
        @objid ("f8e2343b-e172-4d9f-8ae3-74e8e4362f2c")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c6f10046-7ad9-48f6-94df-b91cb2c4aa38")
        public static TagType CONFIGURATION_TAGTYPE_ELT;

        @objid ("240627bd-d1e3-4395-aa5b-b6542812e1ea")
        public static TagType ISPUSH_TAGTYPE_ELT;

        @objid ("ee5f0973-975a-4758-8c79-cd80ad42632b")
        private static Stereotype MDAASSOCDEP;

        @objid ("b053f0d9-cae5-4d49-9cda-62f06b619809")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("082340d8-a290-4ac2-929c-d5eb6dfc3ca9")
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
