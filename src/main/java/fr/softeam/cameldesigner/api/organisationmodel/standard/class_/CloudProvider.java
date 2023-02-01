/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
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
 * Proxy class to handle a {@link Class} with << CloudProvider >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("fb9d9a88-d4a0-4e3f-a3de-0a99ce0662d5")
public class CloudProvider extends Organisation {
<<<<<<< HEAD
    @objid ("47c797fe-b3d9-4ba3-8b5b-c6ff461b1a0f")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("e7f76f6b-27e2-41b5-8a73-4b098739affc")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("be1f97f8-e11e-4bad-a94a-a3689ff9c66d")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("c3a17a0e-d9ab-4330-ba88-9415c4571dbb")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("e92f1e1e-f070-4d33-a7c2-33082a4e0598")
=======
    @objid ("33120d28-bbc7-403e-bcde-fd13674f2dae")
    public static final String STEREOTYPE_NAME = "CloudProvider";

    @objid ("866d201d-6c6b-4b46-a494-063c826ec729")
    public static final String IAAS_TAGTYPE = "IaaS";

    @objid ("1d7a38bb-ce04-4577-aac5-4122204c2b44")
    public static final String PAAS_TAGTYPE = "PaaS";

    @objid ("31d87747-86a6-4905-afa7-e67193720ca7")
    public static final String SAAS_TAGTYPE = "SaaS";

    @objid ("146ecdc2-6c85-4b4f-9213-31e627d19942")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String PUBLIC_TAGTYPE = "public";

    /**
     * Tells whether a {@link CloudProvider proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudProvider >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("799040e1-6638-44eb-8a72-aea89cd7d8cc")
=======
    @objid ("98fd70cc-3870-4172-af7d-c2b80d8cb00d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudProvider >> then instantiate a {@link CloudProvider} proxy.
     * 
     * @return a {@link CloudProvider} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("631807fb-c53d-478a-880e-4a27ecca081f")
=======
    @objid ("85f6df10-73f4-4465-95b6-856c8aa64cba")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudProvider create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudProvider.STEREOTYPE_NAME);
        return CloudProvider.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CloudProvider} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("5dd6ce2a-c4f7-4e50-9ba3-beee7b695352")
=======
    @objid ("c6cfb181-fe77-4c2c-9002-90821ba516c8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudProvider instantiate(final Class obj) {
        return CloudProvider.canInstantiate(obj) ? new CloudProvider(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudProvider} proxy from a {@link Class} stereotyped << CloudProvider >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CloudProvider} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ba9651a1-e8d5-433a-876a-da2972dd8c1e")
=======
    @objid ("f36007bb-fa12-4db5-adc2-1ea87e193d9d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudProvider safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudProvider.canInstantiate(obj))
        	return new CloudProvider(obj);
        else
        	throw new IllegalArgumentException("CloudProvider: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("c031b6cd-010e-4d2b-9bc7-37da6b219063")
=======
    @objid ("6314ddff-1939-432e-8e28-3fb5494b3623")
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
        CloudProvider other = (CloudProvider) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("208c59e9-280a-414c-bc0e-5f6384bc2dcd")
=======
    @objid ("26357cb9-5a2c-4f90-9aea-ceb0192022a5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

<<<<<<< HEAD
    @objid ("e53b3b8b-d12a-45b9-a8e3-bb4497915e3c")
=======
    @objid ("1ae072aa-4222-4397-8f66-2775fa501e8e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("38cbba2e-5a00-4c78-8b44-e4763e3b0b91")
=======
    @objid ("b9f3087c-fd33-4188-800f-ec3afa5c7e39")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("15fcf40d-125c-4910-9843-bf00fc9038ef")
=======
    @objid ("52bf1548-72eb-4655-b6a7-d3b671385287")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isPaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1913705e-9a7b-4c3b-834d-1ba0a1f98028")
=======
    @objid ("edcfc595-9c36-45f8-a6d8-c8763419b511")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isPublic() {
        return this.elt.isTagged(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("56f4b924-6eb2-47ea-85e4-c62eeb061a5e")
=======
    @objid ("5077f7a1-be80-46a4-bdbf-fb346c531ad1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isSaaS() {
        return this.elt.isTagged(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'IaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("197db62e-b266-4f83-851c-c38a660fc49f")
=======
    @objid ("7d1cae51-fcbd-4fd9-b4d3-ce90d107da46")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setIaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.IAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'PaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("5cc21068-d206-4d4f-a792-38d447c43971")
=======
    @objid ("0738f6aa-5b9f-4a7e-b031-3ef624c0bfcc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PAAS_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'public'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("53a20dd2-028c-49d4-a500-c853257e0353")
=======
    @objid ("1f362190-adc7-41da-8919-c8bbeb4433fc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPublic(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.PUBLIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'SaaS'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("a28166a3-3684-4a01-877f-b109d53514de")
=======
    @objid ("053ffa1c-f9c3-46ba-be17-f413b97bbd36")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSaaS(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(CloudProvider.MdaTypes.SAAS_TAGTYPE_ELT);
    }

    @objid ("88addc4b-73d6-4a23-8191-8ea1c4a030ce")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("4f60abc2-f600-48ac-a977-c49c88369ee5")
=======
    @objid ("c91151bc-35fd-4168-a88f-778ac9780743")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CloudProvider(final Class elt) {
        super(elt);
    }

    @objid ("3a9e1b7d-4edb-4361-aa5d-657d494731fb")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("b59b494a-fa20-4098-ad33-2dc06fe4e256")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9f2d8db1-4fb3-4638-8b73-2740d6935e03")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("740cb36f-a40e-417d-985d-a4349c4fb5a0")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("82d101d6-3a27-4e20-ab66-de659f062082")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("ed184b5a-890a-48fc-9b01-687d586a1ec8")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("bbc550ff-9e8e-4610-9257-ffd60e64e33e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9cca04a0-84c5-47b8-967f-2da0d5b77d8d")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("27fa6967-0214-4756-a184-34b82469bba8")
=======
        @objid ("04674f15-44fe-4dbf-80c4-4340dad4cb39")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5074b0d1-e121-4a8a-a553-8836e424356e")
        public static TagType PUBLIC_TAGTYPE_ELT;

        @objid ("68e0c8e0-cf88-499f-8ae0-8e5771383be9")
        public static TagType SAAS_TAGTYPE_ELT;

        @objid ("d7e26c31-8498-4b26-92fb-7b752a19bee9")
        public static TagType PAAS_TAGTYPE_ELT;

        @objid ("c096db2c-d584-4729-8b1b-54a97224746e")
        public static TagType IAAS_TAGTYPE_ELT;

        @objid ("b1de687c-941f-4b35-925a-6c5bc5126676")
        private static Stereotype MDAASSOCDEP;

        @objid ("c19b339d-9a4c-48a3-bc4b-304a4c825191")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("56e2a452-2fd7-42ed-8871-f5c657dd7d8d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "eb3e5683-72bd-4e46-8bda-1ea07af0c09e");
            PUBLIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a7b7a414-a54a-45b1-a53e-3126883211b8");
            SAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f42c6540-bd96-497b-9689-075610b04eda");
            PAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d89c42d7-ad3d-49e1-a24d-46b82e7965ac");
            IAAS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e33192b2-ce6c-499c-98c5-167d63c32690");
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
