/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.08

 * This file was generated on 3/30/22 3:18 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.requirementmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.requirementmodel.standard.generalclass.HardRequirement;
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
 * Proxy class to handle a {@link Class} with << ProviderRequirement >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("82acfd5d-6977-4081-8c3d-eddebe8238e8")
public class ProviderRequirement extends HardRequirement {
    @objid ("5532a529-fe99-41c8-b36d-2054cfa9d99d")
    public static final String STEREOTYPE_NAME = "ProviderRequirement";

    @objid ("bd7070b8-9f5c-4987-b1ce-1c3acc9282d9")
    public static final String CLOUDTYPE_TAGTYPE = "cloudType";

    @objid ("3cc5b533-6e70-41d5-b54d-45fbfc7bd46f")
    public static final String PROVIDERNAMES_TAGTYPE = "providerNames";

    /**
     * Tells whether a {@link ProviderRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProviderRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("502b9e9d-7cd7-405d-b7dc-222d8508a7d3")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProviderRequirement >> then instantiate a {@link ProviderRequirement} proxy.
     * 
     * @return a {@link ProviderRequirement} proxy on the created {@link Class}.
     */
    @objid ("bf41b5c5-9ecb-4a36-972c-ca8cd892be39")
    public static ProviderRequirement create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME);
        return ProviderRequirement.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ProviderRequirement} proxy from a {@link Class} stereotyped << ProviderRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ProviderRequirement} proxy or <i>null</i>.
     */
    @objid ("5d372fae-2b26-4e71-8f95-7bf10c7b05d5")
    public static ProviderRequirement instantiate(final Class obj) {
        return ProviderRequirement.canInstantiate(obj) ? new ProviderRequirement(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProviderRequirement} proxy from a {@link Class} stereotyped << ProviderRequirement >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ProviderRequirement} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bf5aa5c2-9628-4329-80c9-77db5c7f11fa")
    public static ProviderRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProviderRequirement.canInstantiate(obj))
        	return new ProviderRequirement(obj);
        else
        	throw new IllegalArgumentException("ProviderRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ee26f9a4-8b56-4bc3-a909-f41dd5d10189")
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
        ProviderRequirement other = (ProviderRequirement) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7abe4951-c776-4ad5-a1d2-418fb6517cf5")
    public String getCloudType() {
        return this.elt.getTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e4015c80-c7ab-485f-a982-fee20648cc50")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'providerNames'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("ff69d6a8-a14f-499e-94eb-a561daf34f23")
    public List<String> getProviderNames() {
        return this.elt.getTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT);
    }

    @objid ("4081aa2b-e411-4739-a100-064e100d924d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b5a6736e-6287-4599-8d3e-8411652c4d6c")
    public void setCloudType(final String value) {
        this.elt.putTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'providerNames'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bdf3dd22-e6f3-48c9-bacf-3926982d5694")
    public void setProviderNames(final List<String> values) {
        this.elt.putTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT, values);
    }

    @objid ("0b36709e-372e-403e-a829-3592c465122a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("4a338c77-6173-4750-bf70-84167a88a39e")
    protected ProviderRequirement(final Class elt) {
        super(elt);
    }

    @objid ("562f3532-fd37-4432-a9ac-219453fb6332")
    public static final class MdaTypes {
        @objid ("02e1f7e3-e6ba-451b-b514-c039215a1f78")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ee93c120-8cef-4bb8-ad83-bd78dd50962a")
        public static TagType PROVIDERNAMES_TAGTYPE_ELT;

        @objid ("f2894f20-d50c-4a46-a38b-fa6bf269ad54")
        public static TagType CLOUDTYPE_TAGTYPE_ELT;

        @objid ("b7862ffa-8d3f-43ce-86bf-dd2b83a3e3bd")
        private static Stereotype MDAASSOCDEP;

        @objid ("0d9fb2e0-d4e2-4db1-a44a-2a994c9bba52")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("17206caf-7bef-4ae0-b38e-3a4ededd62fa")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3889bd5f-decc-4b65-b4f4-e9f2db4b8446");
            PROVIDERNAMES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "3ba7ca0d-40ed-45d4-b49f-4c7abf286fd0");
            CLOUDTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4bc02bc5-50c2-4fee-9fcd-538e95fd8460");
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
