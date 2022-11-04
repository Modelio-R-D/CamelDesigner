/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    @objid ("396c1584-23c2-4ce6-801a-d31d8f239e85")
    public static final String STEREOTYPE_NAME = "Organisation";

    @objid ("2c10df8f-cc56-4b31-92e2-1216de9563cc")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("5cf261d9-aca8-4276-a9a9-802d00129680")
    public static final String POSTALADDRESS_TAGTYPE = "postalAddress";

    @objid ("45710c5d-ee7f-4ad0-9974-6c1a197ffcbc")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link Organisation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Organisation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("a2c44606-0527-43ea-9e87-e0aa76248567")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Organisation >> then instantiate a {@link Organisation} proxy.
     * 
     * @return a {@link Organisation} proxy on the created {@link Class}.
     */
    @objid ("389a87ba-d732-4d27-8c17-c3e00b3016fe")
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
    @objid ("b89bfefe-a5e8-408b-9bd5-77c61c2f6653")
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
    @objid ("d51c38a9-0e6d-4131-a561-6d3cd0008681")
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
    @objid ("7ebfa945-66ca-4615-8cd9-6a1e33f355a0")
    public void addCloudCredentials(final CloudCredentials obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("733afcb7-b01d-4319-8504-302742308fea")
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
    @objid ("97cd6afe-376c-4764-be3a-8234a7a7a5fe")
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
    @objid ("2b578a3c-734c-40e6-ada8-4bcb8b7c7658")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d3121bc2-f609-4e22-bd17-f636c79c6be4")
    public String getEmail() {
        return this.elt.getTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("254fa49e-b9fa-48d4-ab72-97082bc5fb9a")
    public String getPostalAddress() {
        return this.elt.getTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("91c9dbb3-2ea8-4bd9-a1e0-dff1268e77a3")
    public String getWww() {
        return this.elt.getTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("ccc237f3-3835-40ab-9a1e-31156c51a691")
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
    @objid ("9c3401f1-7d5f-4350-bcbc-b74fd730edfb")
    public boolean removeCloudCredentials(final CloudCredentials obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8654978f-6a32-444c-9965-91b91b7d71b7")
    public void setEmail(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fc6ead78-943d-4227-8ca2-867f8fc8bfc3")
    public void setPostalAddress(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("969c0a9a-1ae5-470f-929d-994830128d2e")
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

    @objid ("68a1c8a2-cd14-4752-9d36-6bce6b022ee5")
    protected Organisation(final Class elt) {
        super(elt);
    }

    @objid ("09128454-19e1-48ce-821e-ed57aa740679")
    public static final class MdaTypes {
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
