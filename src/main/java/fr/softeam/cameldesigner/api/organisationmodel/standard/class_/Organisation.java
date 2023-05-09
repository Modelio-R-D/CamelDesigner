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
    @objid ("9b400ab9-6c42-402e-bc89-bc919e28d2b2")
    public static final String STEREOTYPE_NAME = "Organisation";

    @objid ("0f7c6bab-9898-45ed-a2fe-dc8cc2b65576")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("cd9fb5dc-550c-4605-bdcf-2134fd3ccef1")
    public static final String POSTALADDRESS_TAGTYPE = "postalAddress";

    @objid ("76116e5c-5c16-400b-91be-156c5ec87f55")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link Organisation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Organisation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("48f4fa90-dedd-49b1-bfac-495ca4ea94b6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Organisation >> then instantiate a {@link Organisation} proxy.
     * 
     * @return a {@link Organisation} proxy on the created {@link Class}.
     */
    @objid ("cc20481e-46a8-4e38-9b8d-70a297085e97")
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
    @objid ("b8a99a53-ab8c-4798-910b-a5bf0d3e98fa")
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
    @objid ("1f1ed20b-95a8-41b4-a279-c109a9401eb3")
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
    @objid ("a714f3a0-fac8-4960-9c75-62e8ce0b312b")
    public void addCloudCredentials(final CloudCredentials obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("8cb49cdd-1c72-4e08-8277-7e63c8ab88ac")
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
    @objid ("264d7a6c-8889-4435-b0b2-217620b29630")
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
    @objid ("fa3d19df-c00b-4576-a5ce-099b13d06601")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cc0f6679-ccb4-43ce-a73b-b5b5c9d80920")
    public String getEmail() {
        return this.elt.getTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1d7af94c-0a4b-4aa6-8bb7-ef90abcdbc16")
    public String getPostalAddress() {
        return this.elt.getTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8a2f6223-b803-4aed-a546-b6ea2940b63a")
    public String getWww() {
        return this.elt.getTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("5f7aa3d0-7bb0-43de-a7ab-815dc045daa4")
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
    @objid ("659b9845-9b5f-4809-8062-dffddcfc1d34")
    public boolean removeCloudCredentials(final CloudCredentials obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0a59018d-1a33-46e0-9de5-b47f7797efed")
    public void setEmail(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("008a66bb-95eb-45c1-bbb0-bd42ee9033c7")
    public void setPostalAddress(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0a52b852-8255-451e-9a65-4ca362376a44")
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

    @objid ("9f897ca2-7ae4-4e51-b681-e008897d6fbc")
    protected Organisation(final Class elt) {
        super(elt);
    }

    @objid ("09128454-19e1-48ce-821e-ed57aa740679")
    public static final class MdaTypes {
        @objid ("070dd142-aeb5-4d82-aef7-79f20ec18e86")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("6ad9e356-3793-435b-b590-b607d76c9107")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("f4c60a6d-2516-4066-92c0-4edd7c278850")
        public static TagType POSTALADDRESS_TAGTYPE_ELT;

        @objid ("de882de8-bc41-492d-89c1-1e6df42ad746")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("c416881f-2e48-4b5c-a370-464024b0442d")
        private static Stereotype MDAASSOCDEP;

        @objid ("c66ad5ce-725d-4d1e-b6c2-33f4105e1934")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66ff3a15-997c-4fe5-a6f1-33d0f767010d")
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
