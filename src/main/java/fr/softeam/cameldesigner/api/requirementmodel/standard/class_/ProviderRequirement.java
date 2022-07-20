/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/20/22 3:44 PM by Modelio Studio.
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
    @objid ("1dcb6e10-2083-45b8-a4a8-9bb23e171a0d")
    public static final String STEREOTYPE_NAME = "ProviderRequirement";

    @objid ("ab72f498-8a69-457e-ab3b-52dc7dc8bc6e")
    public static final String CLOUDTYPE_TAGTYPE = "cloudType";

    @objid ("af29fa13-1b40-43d8-9af0-f425b9c8a0f5")
    public static final String PROVIDERNAMES_TAGTYPE = "providerNames";

    /**
     * Tells whether a {@link ProviderRequirement proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ProviderRequirement >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("bd72e90e-a160-4dc1-9a3c-bc3c806ee41a")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ProviderRequirement.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ProviderRequirement >> then instantiate a {@link ProviderRequirement} proxy.
     * 
     * @return a {@link ProviderRequirement} proxy on the created {@link Class}.
     */
    @objid ("f2750159-1d51-4c6c-8d3a-82482a0af7bd")
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
    @objid ("3bcfdc63-ee83-4964-8f27-8370512f3b9e")
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
    @objid ("4c120225-8f8f-4cfc-ad1c-3406461eae1f")
    public static ProviderRequirement safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ProviderRequirement.canInstantiate(obj))
        	return new ProviderRequirement(obj);
        else
        	throw new IllegalArgumentException("ProviderRequirement: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6e9381c2-e68e-481c-9242-0b0d65d61f9c")
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
    @objid ("74c2dd36-669f-4f5f-99ef-c2129f4119e3")
    public String getCloudType() {
        return this.elt.getTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("1ed25b6f-05f7-45a4-a0ea-e548229d75da")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for List<String> property 'providerNames'
     * <p>Property description:<br/>
     * <i>null</i></p>
     */
    @objid ("af649817-5e82-4f9f-8f90-2967f2d5036f")
    public List<String> getProviderNames() {
        return this.elt.getTagValues(ProviderRequirement.MdaTypes.PROVIDERNAMES_TAGTYPE_ELT);
    }

    @objid ("d5b04bb7-50a3-40eb-9dab-cc34c024b3d1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudType'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0c16c63b-11ac-436c-b410-3a8bc4c5e3c6")
    public void setCloudType(final String value) {
        this.elt.putTagValue(ProviderRequirement.MdaTypes.CLOUDTYPE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'providerNames'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("74decd76-e068-4e32-b3fe-1d323708f8bd")
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

    @objid ("51b5960f-bc68-46cd-aefd-2fa5b00e61af")
    protected ProviderRequirement(final Class elt) {
        super(elt);
    }

    @objid ("562f3532-fd37-4432-a9ac-219453fb6332")
    public static final class MdaTypes {
        @objid ("3aaff62f-e483-4e84-9ede-64673b1866a5")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("adfb5bbb-f193-43e4-96dc-d71bdf90b786")
        public static TagType PROVIDERNAMES_TAGTYPE_ELT;

        @objid ("846d7419-7fe6-402c-88f4-e3411d412c7d")
        public static TagType CLOUDTYPE_TAGTYPE_ELT;

        @objid ("789c2542-f325-426c-8fba-1008014bea45")
        private static Stereotype MDAASSOCDEP;

        @objid ("1be939da-9544-4e53-a59b-177b480f21b2")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("81b23add-3d94-471e-b385-f7314340b2ce")
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
