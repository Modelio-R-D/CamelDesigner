/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("43453058-86d0-4218-9991-ae6477978d6d")
    public static final String STEREOTYPE_NAME = "Sensor";

    @objid ("b2319a0f-945c-440c-b9e2-b1fca090f19a")
    public static final String CONFIGURATION_TAGTYPE = "configuration";

    @objid ("b1ee1cb0-2335-43ab-8aae-3ed3af8d2098")
    public static final String ISPUSH_TAGTYPE = "isPush";

    /**
     * Tells whether a {@link Sensor proxy} can be instantiated from a {@link MObject} checking it is a {@link Component} stereotyped << Sensor >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c7492944-54bf-4adc-abd8-64d89486c325")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Component) && ((Component) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Component} stereotyped << Sensor >> then instantiate a {@link Sensor} proxy.
     * 
     * @return a {@link Sensor} proxy on the created {@link Component}.
     */
    @objid ("62bd2308-f3c1-42b6-98d8-0061caf3b38d")
    public static Sensor create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Component");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Sensor.STEREOTYPE_NAME);
        return Sensor.instantiate((Component)e);
    }

    /**
     * Tries to instantiate a {@link Sensor} proxy from a {@link Component} stereotyped << Sensor >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Component
     * @return a {@link Sensor} proxy or <i>null</i>.
     */
    @objid ("16aad77f-d076-445d-9be6-38b741e834cb")
    public static Sensor instantiate(final Component obj) {
        return Sensor.canInstantiate(obj) ? new Sensor(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Sensor} proxy from a {@link Component} stereotyped << Sensor >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Component}
     * @return a {@link Sensor} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("18403c83-d032-4ed4-8913-ab76231e82c9")
    public static Sensor safeInstantiate(final Component obj) throws IllegalArgumentException {
        if (Sensor.canInstantiate(obj))
            return new Sensor(obj);
        else
            throw new IllegalArgumentException("Sensor: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("96fec0a9-e31f-44ed-ae20-e840d5cf9642")
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
    @objid ("42a1f665-5469-4c17-8d67-759ff8f9a9f2")
    public String getConfiguration() {
        return this.elt.getTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Component}.
     * 
     * @return the Component represented by this proxy, never null.
     */
    @objid ("b2ae3b11-a69b-4917-94a5-875ab2c5ee99")
    @Override
    public Component getElement() {
        return (Component)super.getElement();
    }

    @objid ("489cb682-1763-4002-8f3f-8373b697c548")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15f91a36-b096-4e15-a7a5-328d0ad4e28b")
    public boolean isIsPush() {
        return this.elt.isTagged(Sensor.MdaTypes.ISPUSH_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'configuration'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ed09d4db-f1d2-452f-bf25-6a69a961a0db")
    public void setConfiguration(final String value) {
        this.elt.putTagValue(Sensor.MdaTypes.CONFIGURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'isPush'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c976f24-9f24-4bae-aff9-b67f2971f397")
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

    @objid ("65960c1f-f9b3-4ad3-b4b6-0101851770da")
    protected Sensor(final Component elt) {
        super(elt);
    }

    @objid ("ab2c122d-31c1-421d-919a-92957fbd08bd")
    public static final class MdaTypes {
        @objid ("4c3bf2a9-c874-428b-a6e4-950e7f2665a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("795e95c8-5dbc-4175-8879-7d83ce181e99")
        public static TagType CONFIGURATION_TAGTYPE_ELT;

        @objid ("cfa018a9-3856-41f6-9af7-8fb51d1d1020")
        public static TagType ISPUSH_TAGTYPE_ELT;

        @objid ("f25d1922-20fa-4039-9588-91b673a1ec86")
        private static Stereotype MDAASSOCDEP;

        @objid ("1190934d-b114-42ee-b986-c61a30afa242")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5bf86a7-32f2-4376-8f03-7460dfdf2081")
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
