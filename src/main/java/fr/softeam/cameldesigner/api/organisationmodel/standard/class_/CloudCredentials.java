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
 * Proxy class to handle a {@link Class} with << CloudCredentials >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("03b02447-2b3a-4311-86ad-5b5ef5314b71")
public class CloudCredentials extends Credentials {
<<<<<<< HEAD
    @objid ("ce5da22e-eb7e-498d-a1be-fe25b4259104")
    public static final String STEREOTYPE_NAME = "CloudCredentials";

    @objid ("2c04c8c4-e2cf-422c-b542-e2d675fcd075")
    public static final String CLOUDPROVIDERNAME_TAGTYPE = "cloudProviderName";

    @objid ("4a28c79b-ffe6-4697-aba8-3ed0a237d4f7")
    public static final String PASSWORD_TAGTYPE = "password";

    @objid ("f4d98085-735e-463e-917d-4426ce718622")
    public static final String PRIVATESSHKEY_TAGTYPE = "privateSSHKey";

    @objid ("639fbfa1-cd0d-4942-b834-9f6875596bbe")
    public static final String PUBLICSSHKEY_TAGTYPE = "publicSSHKey";

    @objid ("759312d4-8b56-4dd6-b2bd-d9507e59c080")
    public static final String SECURITYGROUP_TAGTYPE = "securityGroup";

    @objid ("45d0c150-6f24-4f08-998d-e48348bc7337")
=======
    @objid ("b693844a-252e-4180-846c-588a41b8d66b")
    public static final String STEREOTYPE_NAME = "CloudCredentials";

    @objid ("bafebb3b-3540-4d2b-887f-c6d3a7c774b0")
    public static final String CLOUDPROVIDERNAME_TAGTYPE = "cloudProviderName";

    @objid ("b034c526-b9ff-4367-9145-60ac39abd42d")
    public static final String PASSWORD_TAGTYPE = "password";

    @objid ("acb9c587-5e5f-46ee-b125-5e2d88466e91")
    public static final String PRIVATESSHKEY_TAGTYPE = "privateSSHKey";

    @objid ("cd168279-a52e-4cca-a3b1-44bf6fcf622b")
    public static final String PUBLICSSHKEY_TAGTYPE = "publicSSHKey";

    @objid ("8572a41d-2d02-4047-833c-5abd4fb59b00")
    public static final String SECURITYGROUP_TAGTYPE = "securityGroup";

    @objid ("f580bb91-3007-453b-9930-85c03cc6de6b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String USERNAME_TAGTYPE = "username";

    /**
     * Tells whether a {@link CloudCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("c83e3f21-75ad-4369-880b-258990e0051c")
=======
    @objid ("e8f6d821-8be8-4e5d-a01d-5e641d1b05f1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudCredentials >> then instantiate a {@link CloudCredentials} proxy.
     * 
     * @return a {@link CloudCredentials} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("616595fa-a7d7-4b5b-a8ac-1cd3db8aa813")
=======
    @objid ("cb168064-ed2b-4ce9-8a87-71a44c69d5bd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudCredentials create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME);
        return CloudCredentials.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudCredentials} proxy from a {@link Class} stereotyped << CloudCredentials >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link CloudCredentials} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("9eaf686c-3860-4682-a996-d509e8428053")
=======
    @objid ("f7816b8e-ac95-4a8d-9e0c-78b3f059d9ec")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudCredentials instantiate(final Class obj) {
        return CloudCredentials.canInstantiate(obj) ? new CloudCredentials(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudCredentials} proxy from a {@link Class} stereotyped << CloudCredentials >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link CloudCredentials} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("ce5505f3-77db-460b-9c40-54efc69a4793")
=======
    @objid ("ec751171-9a3b-46f5-a72d-73674eb5de16")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static CloudCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudCredentials.canInstantiate(obj))
        	return new CloudCredentials(obj);
        else
        	throw new IllegalArgumentException("CloudCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("e7560775-55e7-41d1-8ea2-203aad3008b7")
=======
    @objid ("da4c5253-1dd6-4f6f-bc2c-f46e0f5bdbd3")
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
        CloudCredentials other = (CloudCredentials) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'cloudProviderName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("459d5421-7393-475f-a73a-c2516429fe1f")
=======
    @objid ("3bc7b2fa-54e7-4286-8532-a459dbfc704b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getCloudProviderName() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("e9412649-9352-4698-8a22-e8a11f24464f")
=======
    @objid ("69d20f44-ca6a-49ae-84e6-e48c773b97de")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("621e63ed-1fbf-40f7-86e1-297373e84ca2")
=======
    @objid ("6c543e9e-6ecd-4c76-9c48-04dc1faa0ae5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPassword() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6780ee9e-fb18-4057-936d-17916a7ee63d")
=======
    @objid ("53f3253e-296a-484c-a53f-c8ff6c7425e4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPrivateSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("211731ac-5746-4029-9028-9ae9a3e27121")
=======
    @objid ("401b28c9-fba0-44a8-badb-1c3af9aac853")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPublicSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ffd62cda-888b-44f6-8dee-6746c2fde8d6")
=======
    @objid ("ed1fa1fc-771a-4f9a-b934-4560b51dab20")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getSecurityGroup() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6a568fb0-f58b-4092-8383-83d345da32fe")
=======
    @objid ("7c7f2927-80b5-40b5-9515-992e43d963f6")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getUsername() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("1b953f84-6d3f-4a9a-94a2-117f66a8d5bf")
=======
    @objid ("543b9deb-c7b7-4fbd-9d2f-bd0af3f7da88")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudProviderName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ff39af3b-26e4-4deb-89f2-2295e371f7b9")
=======
    @objid ("0214e153-67ba-46f7-ad49-f10c522da1f8")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setCloudProviderName(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("8669c40f-99b0-40a5-af53-41c2239cac87")
=======
    @objid ("07ce7cc1-03a8-403b-abde-492d02561027")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPassword(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fc3d706d-6423-44af-959e-b836841b4927")
=======
    @objid ("f1430c8a-1a2a-4802-8764-f99f7e3d21df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPrivateSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1797e5c0-ff5e-42dd-aa52-8cccc16f758a")
=======
    @objid ("6be80550-387f-4f43-930f-6f6d00034838")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPublicSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("26540fc0-b4ca-41fe-b302-c74f49d4d2a6")
=======
    @objid ("03878086-87ef-4ca6-bfb4-3b41d9bebd7b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setSecurityGroup(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("63af5332-e401-4254-99b4-d0399156574b")
=======
    @objid ("a88db8ec-cd5c-42de-98f4-37a1925bf518")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setUsername(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT, value);
    }

    @objid ("15377870-620c-49b8-aeae-9685cfd6152a")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("f49aad44-5bd4-4cb7-99ea-0a24406237b6")
=======
    @objid ("58ed0cce-4e6c-4a33-98b0-bb23fc85b748")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected CloudCredentials(final Class elt) {
        super(elt);
    }

    @objid ("55def40b-2092-43e4-b2aa-463a47edd76b")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("a87a17e4-b30f-400e-bcfe-0260045b1818")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("10c4421f-e9da-4ce4-8e50-0043cb3fc51e")
        public static TagType CLOUDPROVIDERNAME_TAGTYPE_ELT;

        @objid ("29c81a17-ff3c-4020-b30a-2d8c90a9b755")
        public static TagType SECURITYGROUP_TAGTYPE_ELT;

        @objid ("ff639e2d-e14a-4cc0-b2f4-5d8e1d5134cc")
        public static TagType PUBLICSSHKEY_TAGTYPE_ELT;

        @objid ("b855a5f4-3022-487d-adbf-52ad2fc4879c")
        public static TagType PRIVATESSHKEY_TAGTYPE_ELT;

        @objid ("39d1977c-a14c-4f88-8dc4-3f042d081f93")
        public static TagType USERNAME_TAGTYPE_ELT;

        @objid ("2b228186-2daf-4478-b186-e94ed3f66e2c")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("36d2e21d-7629-4e6a-889c-822c53de6efd")
        private static Stereotype MDAASSOCDEP;

        @objid ("8272da39-990a-43e0-ae39-a31a440836fa")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("eb83b9f5-5338-4122-b78d-e1a8b45c7e79")
=======
        @objid ("b7dd8ed5-239b-4149-a15b-0af8386e8699")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("89f4f1a1-196a-47c6-8438-2b6a92571aca")
        public static TagType CLOUDPROVIDERNAME_TAGTYPE_ELT;

        @objid ("27d825b6-b4ae-4779-af8a-6f7df09bcd6f")
        public static TagType SECURITYGROUP_TAGTYPE_ELT;

        @objid ("7304c299-21e1-4e4b-aa6c-5a820c62142b")
        public static TagType PUBLICSSHKEY_TAGTYPE_ELT;

        @objid ("7eb56762-c619-49df-914b-733721636408")
        public static TagType PRIVATESSHKEY_TAGTYPE_ELT;

        @objid ("671ed076-adf9-45c4-ad02-fc6a9cee976a")
        public static TagType USERNAME_TAGTYPE_ELT;

        @objid ("3df5c0b4-8f5f-476b-afb1-181b2c71ba93")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("af6b7c26-c7ba-4408-ac53-b7493eff198d")
        private static Stereotype MDAASSOCDEP;

        @objid ("efbccca6-3a4b-4044-85d4-448a07155b3e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b3a55968-7fa3-4d40-983c-ab3f1cd3da21")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "1ac06bbb-e680-411d-9dd2-26838d4ec854");
            CLOUDPROVIDERNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d30c4942-657d-4e40-b794-bcad379adfe3");
            SECURITYGROUP_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f0d9b3a8-180f-4577-b22e-2aff1b401636");
            PUBLICSSHKEY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "467685e9-1975-4ab8-80f3-6f8a9e088e88");
            PRIVATESSHKEY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bc33f941-e476-464e-8924-377efbc04526");
            USERNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ee879df8-6973-4292-a98c-ce1d07b26d43");
            PASSWORD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "65bb8183-11c0-49de-84f2-e0c3eccbff14");
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
