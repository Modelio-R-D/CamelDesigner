/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/16/22 10:46 AM by Modelio Studio.
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
    @objid ("1f450771-1006-4117-a9a7-18eb3a606921")
    public static final String STEREOTYPE_NAME = "CloudCredentials";

    @objid ("07131ab8-1d4c-4a90-9aff-5c30d0dc6fb0")
    public static final String CLOUDPROVIDERNAME_TAGTYPE = "cloudProviderName";

    @objid ("46239175-b5f8-43eb-b1c0-ce97d673b214")
    public static final String PASSWORD_TAGTYPE = "password";

    @objid ("565f0716-0201-4209-9ab5-467cd1a80140")
    public static final String PRIVATESSHKEY_TAGTYPE = "privateSSHKey";

    @objid ("ab1a7be2-0260-4742-b00b-c6d386397d20")
    public static final String PUBLICSSHKEY_TAGTYPE = "publicSSHKey";

    @objid ("f815074e-3fca-4f56-b37a-840372116e0b")
    public static final String SECURITYGROUP_TAGTYPE = "securityGroup";

    @objid ("92ff4874-abd3-4d4a-bd25-1d45c6622652")
    public static final String USERNAME_TAGTYPE = "username";

    /**
     * Tells whether a {@link CloudCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("98e6fdda-6cab-41b8-b146-d6ea49da7a60")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudCredentials >> then instantiate a {@link CloudCredentials} proxy.
     * 
     * @return a {@link CloudCredentials} proxy on the created {@link Class}.
     */
    @objid ("d264ea2f-e9f0-4c00-ab9a-b5355372b6e5")
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
    @objid ("e2fbf8b5-0349-455e-87b6-05e3d500ce90")
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
    @objid ("86ae48d9-2419-4216-909a-b2b4d090fdb8")
    public static CloudCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudCredentials.canInstantiate(obj))
        	return new CloudCredentials(obj);
        else
        	throw new IllegalArgumentException("CloudCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("e06fb52e-cfc3-432d-af3b-c3949c7ecb6e")
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
    @objid ("790137f7-6240-43cd-b5f9-b45683fd723c")
    public String getCloudProviderName() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("da058e6a-2c00-4db0-b297-f46b756c62bf")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("37cf1da3-8643-4ec3-b894-cd7e2553d5fe")
    public String getPassword() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cdd32e84-d44d-4d4f-8245-4e2b7d87fc0b")
    public String getPrivateSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d124fdcd-c606-4bc9-9c21-1d8b59876bb8")
    public String getPublicSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d8b76a1f-6609-4ac2-8a5a-ff70d3bff7e2")
    public String getSecurityGroup() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5c666965-5863-4527-a295-5a07797b9797")
    public String getUsername() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT);
    }

    @objid ("127d6e8d-fb0d-4890-a60e-09b04e41ac08")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudProviderName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b64b5242-48a5-4846-a15e-3aba2dead5f6")
    public void setCloudProviderName(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1f8807ec-98dd-4341-bad2-6ed5b6d3e187")
    public void setPassword(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6bb330ed-1564-4092-a299-2b59b7ea1bb8")
    public void setPrivateSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6efaae40-4a81-4f75-a223-64c03a0ab08a")
    public void setPublicSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ff6548c9-e843-47d0-89f5-947144d39079")
    public void setSecurityGroup(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("017965ef-0ac7-4d1d-8413-7bf5a7e4c45e")
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

    @objid ("ae1afecb-c468-42cb-9978-a32b49fa8283")
    protected CloudCredentials(final Class elt) {
        super(elt);
    }

    @objid ("55def40b-2092-43e4-b2aa-463a47edd76b")
    public static final class MdaTypes {
        @objid ("a4ff46e8-aa2a-4957-835b-4eea100fd094")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63a2f944-0af7-4b23-abba-414f3e0c9df0")
        public static TagType CLOUDPROVIDERNAME_TAGTYPE_ELT;

        @objid ("884d6474-1492-41d7-952e-fd2b8e7a4832")
        public static TagType SECURITYGROUP_TAGTYPE_ELT;

        @objid ("398c2967-51b6-4963-a4e4-a9eb2e27167b")
        public static TagType PUBLICSSHKEY_TAGTYPE_ELT;

        @objid ("e7b7df85-7d69-4e5d-88be-ef8906887d02")
        public static TagType PRIVATESSHKEY_TAGTYPE_ELT;

        @objid ("28d25961-e5e8-4e68-a492-6ac108e8e146")
        public static TagType USERNAME_TAGTYPE_ELT;

        @objid ("1ac97145-7441-4784-8450-a367d761fd3c")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("a3201d1a-883b-4d82-81fc-b03ca2bb9fff")
        private static Stereotype MDAASSOCDEP;

        @objid ("9c7c6080-8711-4fe5-920b-13be47c59567")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b901234a-4e5c-495b-bd3d-1d7d07afbc6c")
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
