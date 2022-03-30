/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
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
    @objid ("227e4356-92a8-4ad4-946e-773b8332608c")
    public static final String STEREOTYPE_NAME = "Sensor";

    @objid ("e13a45b0-8c65-4d2a-aab2-aed60fcd9bcd")
    public static final String CONFIGURATION_TAGTYPE = "configuration";

    @objid ("248694b0-17f2-43a2-8b92-43fa4df3235c")
    public static final String ISPUSH_TAGTYPE = "isPush";

    /**
     * Tells whether a {@link Sensor proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Sensor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c80c7cca-299f-4209-ad85-6b95e8a1ba81")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Sensor >> then instantiate a {@link Sensor} proxy.
     * 
     * @return a {@link Sensor} proxy on the created {@link Component}.
     */
    @objid ("ffcd165d-d12f-41ce-adfc-443f1a2e1995")
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
    @objid ("88194579-eaf8-41f0-b5ac-ca9a0a7c4f4e")
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
    @objid ("d9512dc9-3aad-41fb-9cd5-8f5a9bf26263")
    public static Sensor safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (Sensor.canInstantiate(obj))
        	return new Sensor(obj);
        else
        	throw new IllegalArgumentException("Sensor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("35d2b259-9ef7-4063-8b13-08846993a4d7")
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
    @objid ("361bbae2-2e1b-46e9-88f6-c3f913a744ec")
    public String getConfiguration() {
        return this.elt.getTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Component}. 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("802036b2-11cf-41f4-bfa8-cd47a6493413")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("9dfba853-8adc-4642-881b-7a72678ef1da")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("aa3167e2-d1fe-4cbc-b2b1-2efa2dbaa6e9")
    public boolean isIsPush() {
        return this.elt.isTagged(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a930e90-844b-46f7-92e0-d1ba552de301")
    public void setConfiguration(final String value) {
        this.elt.putTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a2bca4a5-99c0-4382-8a22-2b56248becfc")
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

    @objid ("c7dc3d40-a928-40f2-b7e5-2fb4f1df420b")
    protected Sensor(final Component elt) {
        super(elt);
    }

    @objid ("ab2c122d-31c1-421d-919a-92957fbd08bd")
    public static final class MdaTypes {
        @objid ("0644c4f6-112d-4881-a91c-2599fa06aa77")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b47460ae-4dbc-465e-a73d-36ec2e86d7e1")
        public static TagType CONFIGURATION_TAGTYPE_ELT;

        @objid ("11aa5b75-5b3d-44ca-a667-211fc8d065cf")
        public static TagType ISPUSH_TAGTYPE_ELT;

        @objid ("57ffef94-bdbd-44e3-bb5f-b2008cbce976")
        private static Stereotype MDAASSOCDEP;

        @objid ("1224c8c9-fc0c-40fb-acdd-8b6906414f47")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6de0226e-7b7d-42cb-b945-7924fb008402")
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
