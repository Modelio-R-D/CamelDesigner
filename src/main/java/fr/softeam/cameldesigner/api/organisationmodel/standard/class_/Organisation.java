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
import fr.softeam.cameldesigner.api.organisationmodel.standard.class_.CloudCredentials;
import fr.softeam.cameldesigner.impl.CamelDesignerModule;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << Organisation >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("eccd47db-19f1-4992-946f-1f943f3667d6")
public class Organisation extends Entity {
<<<<<<< HEAD
    @objid ("9d4e0b12-d0bc-4cb4-a453-2f8e8ff7616f")
    public static final String STEREOTYPE_NAME = "Organisation";

    @objid ("e3a79ee1-b3bb-44e5-bd27-77f9a883f071")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("7eda6f4e-6071-4e6f-a2d1-2a282560304b")
    public static final String POSTALADDRESS_TAGTYPE = "postalAddress";

    @objid ("d4362e07-3fa5-4f06-bf06-f669f793f1b8")
=======
    @objid ("396c1584-23c2-4ce6-801a-d31d8f239e85")
    public static final String STEREOTYPE_NAME = "Organisation";

    @objid ("2c10df8f-cc56-4b31-92e2-1216de9563cc")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("5cf261d9-aca8-4276-a9a9-802d00129680")
    public static final String POSTALADDRESS_TAGTYPE = "postalAddress";

    @objid ("45710c5d-ee7f-4ad0-9974-6c1a197ffcbc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link Organisation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Organisation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("8aec6ac5-7161-4b9d-bed3-0c465c07be99")
=======
    @objid ("a2c44606-0527-43ea-9e87-e0aa76248567")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Organisation >> then instantiate a {@link Organisation} proxy.
     * 
     * @return a {@link Organisation} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("9ef0bccf-6e8d-4bde-9ab5-a5b7225f7985")
=======
    @objid ("389a87ba-d732-4d27-8c17-c3e00b3016fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Organisation create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME);
        return Organisation.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link Organisation} proxy from a {@link Class} stereotyped << Organisation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link Organisation} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("34a126cb-23d3-4050-890e-aa62393c60f8")
=======
    @objid ("b89bfefe-a5e8-408b-9bd5-77c61c2f6653")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Organisation instantiate(final Class obj) {
        return Organisation.canInstantiate(obj) ? new Organisation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Organisation} proxy from a {@link Class} stereotyped << Organisation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link Organisation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("11a560cc-2607-4a38-b028-1209f468cbb7")
=======
    @objid ("d51c38a9-0e6d-4131-a561-6d3cd0008681")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Organisation safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (Organisation.canInstantiate(obj))
        	return new Organisation(obj);
        else
        	throw new IllegalArgumentException("Organisation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    /**
     * Add a value to the 'cloudCredentials' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("bfd2ec73-e427-4571-9a3c-979f94e7c438")
=======
    @objid ("7ebfa945-66ca-4615-8cd9-6a1e33f355a0")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void addCloudCredentials(final CloudCredentials obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

<<<<<<< HEAD
    @objid ("3683996d-7bce-40ab-8bf3-a2e87d8f6bcd")
=======
    @objid ("733afcb7-b01d-4319-8504-302742308fea")
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
        Organisation other = (Organisation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the values of the 'cloudCredentials' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("06549ca6-0110-4753-8175-c251e9a9625d")
=======
    @objid ("97cd6afe-376c-4764-be3a-8234a7a7a5fe")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public List<CloudCredentials> getCloudCredentials() {
        List<CloudCredentials> results = new ArrayList<>();
        for (ModelTree mObj : ((Class) this.elt).getOwnedElement()){
        	if (CloudCredentials.canInstantiate(mObj))
        			results.add((CloudCredentials)CamelDesignerProxyFactory.instantiate(mObj, CloudCredentials.STEREOTYPE_NAME));
        	}
        return Collections.unmodifiableList(results);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("0505da71-b3f7-44bd-9893-d55e49801b1c")
=======
    @objid ("2b578a3c-734c-40e6-ada8-4bcb8b7c7658")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("3b57956a-7bea-4eb0-b8d7-c37f98ecdc52")
=======
    @objid ("d3121bc2-f609-4e22-bd17-f636c79c6be4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getEmail() {
        return this.elt.getTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ad42f116-7255-4a8d-bad3-d6cc67d86736")
=======
    @objid ("254fa49e-b9fa-48d4-ab72-97082bc5fb9a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getPostalAddress() {
        return this.elt.getTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("85f797fc-36e4-4181-a9cb-08475dcc740b")
=======
    @objid ("91c9dbb3-2ea8-4bd9-a1e0-dff1268e77a3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getWww() {
        return this.elt.getTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("f2ae9bc1-0d05-40ef-9d9b-720c44af9f38")
=======
    @objid ("ccc237f3-3835-40ab-9a1e-31156c51a691")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Remove a value from the 'cloudCredentials' role.<p>
     * Role description:
     * null
     * 
     */
<<<<<<< HEAD
    @objid ("f11569a8-4143-4dea-8a4c-2f754d94d887")
=======
    @objid ("9c3401f1-7d5f-4350-bcbc-b74fd730edfb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean removeCloudCredentials(final CloudCredentials obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("fd9c4584-2b1b-4fef-bf07-54e373f9da85")
=======
    @objid ("8654978f-6a32-444c-9965-91b91b7d71b7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEmail(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("cec5c5c4-30f3-42dd-b01e-1615bf1c8a88")
=======
    @objid ("fc6ead78-943d-4227-8ca2-867f8fc8bfc3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setPostalAddress(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ff8f1e10-bec8-4ad6-8f66-03b8916912b7")
=======
    @objid ("969c0a9a-1ae5-470f-929d-994830128d2e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setWww(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT, value);
    }

    @objid ("5bf2638f-9070-425f-8e8b-06a9a700ea08")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("c15d7fed-f00c-455b-b009-b8b0e4ef3d2d")
=======
    @objid ("68a1c8a2-cd14-4752-9d36-6bce6b022ee5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Organisation(final Class elt) {
        super(elt);
    }

    @objid ("09128454-19e1-48ce-821e-ed57aa740679")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("8ce71bde-3954-454a-a2d2-6917a55c0002")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("34257c19-d6a5-4d18-a13e-beeb07541da2")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("656f9cca-dfb3-4d56-b02e-697b7f09b400")
        public static TagType POSTALADDRESS_TAGTYPE_ELT;

        @objid ("16781a86-0e19-48c8-ac34-f45a327f50b1")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("365d64fb-e67d-4e79-83ef-0bdcd1d8f550")
        private static Stereotype MDAASSOCDEP;

        @objid ("5847f8ea-3622-45d3-9f9a-813db9c18340")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9cc095c8-00de-4df6-8249-81c97c0924be")
=======
        @objid ("1a908365-5112-468f-b91c-40ee19feb070")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("461cb6dc-f83a-4225-9c12-6a5cf6b7429d")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("3156d432-9041-4646-b287-76ff279240b5")
        public static TagType POSTALADDRESS_TAGTYPE_ELT;

        @objid ("05ae656c-bb47-409d-a12b-23b935592968")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("f0c08c7b-abc1-442f-ae4a-784ec5dbe092")
        private static Stereotype MDAASSOCDEP;

        @objid ("df04aec5-217f-4c81-93ca-04a5dd26fc6f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f667ec1b-e0ea-40d6-af30-ddbc2cab5a5f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fa6ac57f-ab05-4b55-81ec-f129e360b94d");
            WWW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "79c63438-ac0f-42ea-aead-1ff7c9210f58");
            POSTALADDRESS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cfbc93ca-abc2-46b7-954e-feedaadfd214");
            EMAIL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6cb9f211-07e7-4de9-b4b1-4da86857332f");
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
