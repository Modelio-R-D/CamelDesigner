/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
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
    @objid ("0fd98c20-195a-43cc-876d-8d2bdf86e0db")
    public static final String STEREOTYPE_NAME = "CloudCredentials";

    @objid ("57a806da-c079-486a-92d7-5f6f58a16c72")
    public static final String CLOUDPROVIDERNAME_TAGTYPE = "cloudProviderName";

    @objid ("7cf24c2d-c5c5-4ab0-892a-9deed06fdf56")
    public static final String PASSWORD_TAGTYPE = "password";

    @objid ("9b58ff10-cec0-48da-8439-2f133b7b4f5e")
    public static final String PRIVATESSHKEY_TAGTYPE = "privateSSHKey";

    @objid ("79432d77-6b3a-4739-bdab-a7ef1bef16c9")
    public static final String PUBLICSSHKEY_TAGTYPE = "publicSSHKey";

    @objid ("b29c87d1-8333-4233-878d-9bad885beb3c")
    public static final String SECURITYGROUP_TAGTYPE = "securityGroup";

    @objid ("59b6c822-ade7-49ab-b61b-475349d71df3")
    public static final String USERNAME_TAGTYPE = "username";

    /**
     * Tells whether a {@link CloudCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("c816f9c6-49da-493d-8b45-1cb1f8744977")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudCredentials >> then instantiate a {@link CloudCredentials} proxy.
     * 
     * @return a {@link CloudCredentials} proxy on the created {@link Class}.
     */
    @objid ("a6b8b8c9-dc54-4fce-b12e-dcde859b51bd")
    public static CloudCredentials create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME);
        return CloudCredentials.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link CloudCredentials} proxy from a {@link Class} stereotyped << CloudCredentials >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link CloudCredentials} proxy or <i>null</i>.
     */
    @objid ("56151ca3-c5a2-431f-b69c-a6574c9131db")
    public static CloudCredentials instantiate(final Class obj) {
        return CloudCredentials.canInstantiate(obj) ? new CloudCredentials(obj) : null;
    }

    /**
     * Tries to instantiate a {@link CloudCredentials} proxy from a {@link Class} stereotyped << CloudCredentials >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link CloudCredentials} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("84062046-bff8-4177-804d-e711dc92bb14")
    public static CloudCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudCredentials.canInstantiate(obj))
            return new CloudCredentials(obj);
        else
            throw new IllegalArgumentException("CloudCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("776b8fac-7263-41d8-b726-5c8d52a2bde6")
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
    @objid ("a125a8ad-25ff-4bb0-ad4e-dd8f6b71a557")
    public String getCloudProviderName() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e7b75ccf-7abd-4300-9e27-5699c7f34935")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4f7add74-e9ea-4a34-82d5-99c4cba61e89")
    public String getPassword() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d614ef70-9fe1-463d-93b4-f355641ada29")
    public String getPrivateSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d65ab02-59a1-4849-8aac-6ab2a9cc4c98")
    public String getPublicSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4f1381b0-bbe8-4fb4-9854-5ff673b613b7")
    public String getSecurityGroup() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("06d376d0-5084-4ed4-a601-768845a0fbfb")
    public String getUsername() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT);
    }

    @objid ("074f58ba-8faa-4cc9-9f4c-724e785f5cfc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudProviderName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8668df95-b1ee-46a2-a96a-a71fff162d99")
    public void setCloudProviderName(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("58713d6c-097b-4ce6-a1cb-93fe31275a3a")
    public void setPassword(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5322929f-6eb9-4632-8802-6b1ac23c2481")
    public void setPrivateSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("491a3a16-9b91-489d-a1fb-18daf907c45c")
    public void setPublicSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("651efbb2-e570-4fbf-bd59-8b6548b9d508")
    public void setSecurityGroup(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0ef31c01-a8f7-497c-b6d3-35a0c4b2ca35")
    public void setUsername(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT, value);
    }

    @objid ("dcbf412f-a49b-4acb-bf69-722ae2ced5f8")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("4b67bb9e-6542-4d61-816f-207da1a70015")
    protected CloudCredentials(final Class elt) {
        super(elt);
    }

    @objid ("55def40b-2092-43e4-b2aa-463a47edd76b")
    public static final class MdaTypes {
        @objid ("6b53bf92-d41a-4512-8279-794b951222e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("7236ee0e-33a4-43b4-912a-3fdbd4bf6329")
        public static TagType CLOUDPROVIDERNAME_TAGTYPE_ELT;

        @objid ("143bafa5-16d1-461b-800c-fcf25c58d2b6")
        public static TagType SECURITYGROUP_TAGTYPE_ELT;

        @objid ("8d76455e-85fa-4212-a55e-25661dbd86ca")
        public static TagType PUBLICSSHKEY_TAGTYPE_ELT;

        @objid ("0e82800f-5bc4-43d4-ad1f-c0a7c7b0064e")
        public static TagType PRIVATESSHKEY_TAGTYPE_ELT;

        @objid ("6699c2bf-d348-40d3-9928-70a0943285e8")
        public static TagType USERNAME_TAGTYPE_ELT;

        @objid ("f5fb7594-3758-4688-8d27-b939f51260c5")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("44528194-ace9-48c5-9425-bc95aac8c5fc")
        private static Stereotype MDAASSOCDEP;

        @objid ("8c8e0923-4578-48a7-a345-d184ac24a331")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d68005f9-defc-4e04-b89a-9d523f48741c")
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
