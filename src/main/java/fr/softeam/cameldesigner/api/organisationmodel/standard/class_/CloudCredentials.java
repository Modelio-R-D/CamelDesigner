/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.09

 * This file was generated on 4/20/22 10:37 AM by Modelio Studio.
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
    @objid ("158b2358-c5e9-4a45-a7df-66048d5293f3")
    public static final String STEREOTYPE_NAME = "CloudCredentials";

    @objid ("6e8208eb-1298-4454-9be9-0c594e2a885a")
    public static final String CLOUDPROVIDERNAME_TAGTYPE = "cloudProviderName";

    @objid ("f8ce9aee-844e-47fa-959d-056de14c0dde")
    public static final String PASSWORD_TAGTYPE = "password";

    @objid ("33ff06e6-cacf-4346-aea7-cd3f6206804a")
    public static final String PRIVATESSHKEY_TAGTYPE = "privateSSHKey";

    @objid ("e95a1b24-9734-4856-898b-dcb6e1881317")
    public static final String PUBLICSSHKEY_TAGTYPE = "publicSSHKey";

    @objid ("760479a6-0444-4eb0-802a-1ddac5c62442")
    public static final String SECURITYGROUP_TAGTYPE = "securityGroup";

    @objid ("427b41c2-0005-4cc0-9edc-2cc0163d3b1f")
    public static final String USERNAME_TAGTYPE = "username";

    /**
     * Tells whether a {@link CloudCredentials proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << CloudCredentials >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("e0d87e96-c8c3-4cf8-a363-0d79a6cb126b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, CloudCredentials.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << CloudCredentials >> then instantiate a {@link CloudCredentials} proxy.
     * 
     * @return a {@link CloudCredentials} proxy on the created {@link Class}.
     */
    @objid ("8326446e-8a12-41e1-b4f1-94e751120a54")
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
    @objid ("5331d19b-6390-4a78-a72c-6d15c2a14f3c")
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
    @objid ("9dc45ad8-0e5b-4c1b-89b0-0a4b3ab7e4d3")
    public static CloudCredentials safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (CloudCredentials.canInstantiate(obj))
            return new CloudCredentials(obj);
        else
            throw new IllegalArgumentException("CloudCredentials: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9b474f25-d060-4b53-a7c0-505efe8256e6")
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
    @objid ("62db7e05-890f-45de-bd73-f2c7205715c3")
    public String getCloudProviderName() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("e9bac268-47cd-444e-832e-5f5288aa17f1")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b68270a8-9cef-4887-a6e3-a604267e8f08")
    public String getPassword() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b5ca934e-8554-4c93-a413-bb17dbcc10d1")
    public String getPrivateSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("483933ca-affd-420f-a9b4-32bd0e8f8ba3")
    public String getPublicSSHKey() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d10fb444-4796-4a1c-870e-90e184595287")
    public String getSecurityGroup() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("46d2aa1d-3458-44c7-92a9-d1158a1619c7")
    public String getUsername() {
        return this.elt.getTagValue(CloudCredentials.MdaTypes.USERNAME_TAGTYPE_ELT);
    }

    @objid ("7fda4067-120a-4a2a-a4c8-634be9524010")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'cloudProviderName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b749baa3-ab7c-4b7a-9919-8f67c93b8f94")
    public void setCloudProviderName(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.CLOUDPROVIDERNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'password'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a602221-30e6-4f13-b1e9-78ceadc943c9")
    public void setPassword(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'privateSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b672fd48-5fa8-4bcf-aeef-0f5e9a4b91ac")
    public void setPrivateSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PRIVATESSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'publicSSHKey'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("87a9d733-252b-4ae8-a62e-81e7ea41bf2c")
    public void setPublicSSHKey(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.PUBLICSSHKEY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityGroup'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72a62603-199c-4f3c-881f-fac4fd728093")
    public void setSecurityGroup(final String value) {
        this.elt.putTagValue(CloudCredentials.MdaTypes.SECURITYGROUP_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'username'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("98374f58-2bca-4ec0-821f-4750bbefae99")
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

    @objid ("7bbe07a8-b084-45a8-8e27-333523280cdf")
    protected CloudCredentials(final Class elt) {
        super(elt);
    }

    @objid ("55def40b-2092-43e4-b2aa-463a47edd76b")
    public static final class MdaTypes {
        @objid ("4bdbdef9-06aa-4f5f-9d50-51a326d5c685")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f0e9e490-1ffa-4446-b697-a9b861d1bdbf")
        public static TagType CLOUDPROVIDERNAME_TAGTYPE_ELT;

        @objid ("728a4a39-9d12-4fb5-bf4f-e2a243676f11")
        public static TagType SECURITYGROUP_TAGTYPE_ELT;

        @objid ("da4e0988-c4a6-4378-a876-d08ac60d37aa")
        public static TagType PUBLICSSHKEY_TAGTYPE_ELT;

        @objid ("0caec8e9-088c-44c1-92a5-49e585f1b69f")
        public static TagType PRIVATESSHKEY_TAGTYPE_ELT;

        @objid ("d990f40b-d577-43d8-9f0c-3fa419906aff")
        public static TagType USERNAME_TAGTYPE_ELT;

        @objid ("1a1ab3b4-aebc-4df2-a67d-badcafa21459")
        public static TagType PASSWORD_TAGTYPE_ELT;

        @objid ("a5868cd7-a430-4c00-af71-186258e48164")
        private static Stereotype MDAASSOCDEP;

        @objid ("2cfbc4fd-6352-4357-bc79-bb5530061f7f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("168152e0-3152-441c-9a4a-e6612070a41f")
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
