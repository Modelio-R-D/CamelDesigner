/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("71f7e33b-4f63-4999-80c2-641a4554a581")
    public static final String STEREOTYPE_NAME = "CloudCredentials";

    @objid ("0e2c4c9f-84ec-48be-9572-bf9d8c7439e5")
    public static final String CLOUDPROVIDERNAME_TAGTYPE = "cloudProviderName";

    @objid ("995c63f8-71cd-40ab-9f8e-a36d5f1fafc1")
    public static final String PASSWORD_TAGTYPE = "password";

    @objid ("9c44db74-315d-4528-b0f7-49ef2bbf576d")
    public static final String PRIVATESSHKEY_TAGTYPE = "privateSSHKey";

    @objid ("40170a9b-7dc4-41aa-80eb-254df2aefe1b")
    public static final String PUBLICSSHKEY_TAGTYPE = "publicSSHKey";

    @objid ("2d586a57-16d9-4743-8da2-7027407b3a2a")
    public static final String SECURITYGROUP_TAGTYPE = "securityGroup";

    @objid ("08ecb514-d40b-40bf-8a1f-c50fa0caff4e")
    public static final String USERNAME_TAGTYPE = "username";

    /**
     * Tells whether a {@link CloudCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b39259c5-8908-4a87-a997-3e266b6ef57e")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudCredentials >> then instantiate a {@link CloudCredentials} proxy.
     * 
     * @return a {@link CloudCredentials} proxy on the created {@link Class}.
     */
    @objid ("87cd4ea9-08e5-4b11-9ca5-594a8af8d073")
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
    @objid ("c79595bc-ee62-4895-99d0-46e39cb873cb")
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
    @objid ("2ec68c1a-17ca-4267-8e33-c10d020d71bf")
    public static CloudCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudCredentials.canInstantiate(obj))
        	return new CloudCredentials(obj);
        else
        	throw new IllegalArgumentException("CloudCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("79edaa79-59d5-47c0-8ac0-1d296ca9d236")
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
    @objid ("70629b41-5022-4d2e-9a3c-0807976f95c5")
    public String getCloudProviderName() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("3e802e30-cf2c-4913-bf80-e4ee76beee0d")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f331bba2-4894-4aab-9952-2c5abfac2abe")
    public String getPassword() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7d0aa677-6ce0-4aa4-8f8b-51144538cd70")
    public String getPrivateSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3379c574-3da0-4faf-b04b-5395d14b9da5")
    public String getPublicSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("436f5600-8681-4115-8373-b4efd3d9be87")
    public String getSecurityGroup() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1a8e325a-db30-4cee-8097-03bf5781402c")
    public String getUsername() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT);
    }

    @objid ("87c350ba-7e1f-47ca-9e28-87ab144ca312")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudProviderName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ac0701c7-62ef-498c-9998-ee9c3eb00810")
    public void setCloudProviderName(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bebe1a47-57ba-4e44-99d3-70dd42d6661e")
    public void setPassword(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5af1ce19-b919-4cc8-87bd-85d9cbdf4282")
    public void setPrivateSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a24ae8cc-cd71-48c1-ad15-8ea35d794cf4")
    public void setPublicSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ae68eab2-0b60-4ef4-9f92-431b06d7e828")
    public void setSecurityGroup(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("10cc4697-bd0c-4c88-bc84-b70ac15e1ca3")
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

    @objid ("1bc11e1a-be3e-49ac-8000-c1bbbb0fd014")
    protected CloudCredentials(final Class elt) {
        super(elt);
    }

    @objid ("55def40b-2092-43e4-b2aa-463a47edd76b")
    public static final class MdaTypes {
        @objid ("b2a9d1be-3464-4ab9-8eaf-461d6629ab41")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("87910bd9-7c69-4bae-b067-fcd9888a7665")
        public static TagType CLOUDPROVIDERNAME_TAGTYPE_ELT;

        @objid ("7851fa03-3ce8-4c2d-b4e4-dac11b30ae10")
        public static TagType SECURITYGROUP_TAGTYPE_ELT;

        @objid ("9e4d7508-987d-448d-af5f-6654f6099a2f")
        public static TagType PUBLICSSHKEY_TAGTYPE_ELT;

        @objid ("8ca9d5ee-2671-4bce-920d-437566684aaf")
        public static TagType PRIVATESSHKEY_TAGTYPE_ELT;

        @objid ("7ed29c6c-7f3a-401a-bc4b-0767338f6e15")
        public static TagType USERNAME_TAGTYPE_ELT;

        @objid ("cdfea1b4-2383-46e2-acc6-e0359ccdea08")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("3a38b168-684d-42af-b76c-c550cab6032e")
        private static Stereotype MDAASSOCDEP;

        @objid ("9fdf2953-3d89-4e8f-8f26-6900f7777231")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("755b00a0-593e-483c-8c23-e70c03306f45")
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
