/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
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
 * Proxy class to handle a {@link Class} with << User >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("27994015-90c9-40c1-8a60-3c9bc12fff11")
public class User extends Entity {
    @objid ("315cd8ad-897d-4822-8202-aaa5e8ffcbd5")
    public static final String STEREOTYPE_NAME = "User";

    @objid ("bc38dfe3-7e5c-4fad-9ac3-4759b45f8f44")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("d1d559b0-a36e-4d9a-9160-e9586c0cfd46")
    public static final String FIRSTNAME_TAGTYPE = "firstName";

    @objid ("324141be-693a-4e7d-a92e-325fb749fbe0")
    public static final String LASTNAME_TAGTYPE = "lastName";

    @objid ("74c22cfa-37eb-491b-9149-2f45ab762ccd")
    public static final String PLATFORMCREDENTIALNAME_TAGTYPE = "platformCredentialName";

    @objid ("c4475597-f067-4471-8848-b43c0e3414eb")
    public static final String PLATFORMCREDENTIALPASSWORD_TAGTYPE = "platformCredentialPassword";

    @objid ("ac09f90c-c19e-4dab-b3fb-03fb69b6f336")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link User proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << User >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("37723515-bdf5-4774-98a0-9b500d8e5106")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << User >> then instantiate a {@link User} proxy.
     * 
     * @return a {@link User} proxy on the created {@link Class}.
     */
    @objid ("0502bc02-6903-48a5-8671-30955bba1344")
    public static User create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, User.STEREOTYPE_NAME);
        return User.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link User} proxy from a {@link Class} stereotyped << User >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link User} proxy or <i>null</i>.
     */
    @objid ("cd83c07c-595e-47e3-b810-44fa8b8d0342")
    public static User instantiate(final Class obj) {
        return User.canInstantiate(obj) ? new User(obj) : null;
    }

    /**
     * Tries to instantiate a {@link User} proxy from a {@link Class} stereotyped << User >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link User} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("809939ec-55bc-47f6-a4b6-c83a445dd756")
    public static User safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (User.canInstantiate(obj))
            return new User(obj);
        else
            throw new IllegalArgumentException("User: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("78be9c96-0feb-47d4-ac2e-701739816371")
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
        User other = (User) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}.
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("9213b8c2-37d0-412a-af38-cb505149bff4")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9c93529a-dafa-41f9-8e4d-0a8f796e3a0b")
    public String getEmail() {
        return this.elt.getTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("75712a88-939a-4c69-ae47-bc715d7e405d")
    public String getFirstName() {
        return this.elt.getTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ddeb837-e545-4037-b4a5-779f3b65395e")
    public String getLastName() {
        return this.elt.getTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d4375a6b-0ce7-46ec-8202-b7e4b88ceba0")
    public String getPlatformCredentialName() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4e8becb-21af-4f4e-8e8d-80f080c38bc9")
    public String getPlatformCredentialPassword() {
        return this.elt.getTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d1e4b706-e5fa-47f5-a519-16a2d385b46a")
    public String getWww() {
        return this.elt.getTagValue(User.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("719ac4f3-bf9c-4ba6-b031-14bb4b233b29")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b6392e9-1b63-48e9-acdc-95d45c884cca")
    public void setEmail(final String value) {
        this.elt.putTagValue(User.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'firstName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("23759eb9-8798-42f5-b85c-cff79bd46d94")
    public void setFirstName(final String value) {
        this.elt.putTagValue(User.MdaTypes.FIRSTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'lastName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("28382bef-cc7c-481c-9714-16de60f0c29a")
    public void setLastName(final String value) {
        this.elt.putTagValue(User.MdaTypes.LASTNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e10791f1-228a-4ca7-8d70-5234f8955c6b")
    public void setPlatformCredentialName(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'platformCredentialPassword'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("9edf269f-a3d6-4cd9-bd86-a38e0206516e")
    public void setPlatformCredentialPassword(final String value) {
        this.elt.putTagValue(User.MdaTypes.PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3537692f-eb9b-4732-8504-aa6e916b9ac9")
    public void setWww(final String value) {
        this.elt.putTagValue(User.MdaTypes.WWW_TAGTYPE_ELT, value);
    }

    @objid ("0042fd5c-c57a-4067-a8a0-e6ac39a71c54")
    protected User(final Class elt) {
        super(elt);
    }

    @objid ("e7a907de-dc21-4d17-9104-6dae192d680b")
    public static final class MdaTypes {
        @objid ("8012bede-72b0-409f-873c-20dc50cc4cf7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("64df2e2e-8c28-4c95-a2a1-14651b308e4b")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("a21c1858-7f15-468e-8120-e93152141306")
        public static TagType FIRSTNAME_TAGTYPE_ELT;

        @objid ("2437d3c5-4ea2-4ca5-8683-2a1774a9fe60")
        public static TagType LASTNAME_TAGTYPE_ELT;

        @objid ("95b504fc-7d5c-445f-bd3e-a48fcbb961b1")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("6e515973-0493-45e4-84a5-5825385b8675")
        public static TagType PLATFORMCREDENTIALNAME_TAGTYPE_ELT;

        @objid ("2b7e8da3-7c5a-46f5-89bc-7afb550cd5c0")
        public static TagType PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT;

        @objid ("9babf282-7ef2-44bd-8b99-1e8b8c000b41")
        private static Stereotype MDAASSOCDEP;

        @objid ("bd79bcc7-7e79-472f-80c4-9dc78626b8c7")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ec989db5-2b56-498b-bc83-29235b22b430")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "a36b6005-fc91-4d36-bf4a-4b39194d892b");
            EMAIL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "23c8cc8c-ec83-45ef-aa8c-3089186d0437");
            FIRSTNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a293b940-1081-4a06-8e26-c2a71f692b11");
            LASTNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b5e360b5-9a54-4f3a-982f-305bc0bb0ffa");
            WWW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ab04f702-4373-4755-964c-4af996f0b47a");
            PLATFORMCREDENTIALNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "02fe1cbf-75ac-419d-b683-7e0076fde173");
            PLATFORMCREDENTIALPASSWORD_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fde2e502-b458-4bd0-a9f4-2617c9bada0a");
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
