/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.06

 * This file was generated on 2/25/22 11:13 AM by Modelio Studio.
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
    @objid ("67af0dc5-6c21-4071-b46e-4ce7286d674d")
    public static final String STEREOTYPE_NAME = "Organisation";

    @objid ("411de9a4-56b5-4403-bc8b-75f4b11a72a0")
    public static final String EMAIL_TAGTYPE = "email";

    @objid ("6ac6d046-12b2-441c-ab41-cd02e1601521")
    public static final String POSTALADDRESS_TAGTYPE = "postalAddress";

    @objid ("6bef9e66-a706-4789-b078-b0a0aea8f5b8")
    public static final String WWW_TAGTYPE = "www";

    /**
     * Tells whether a {@link Organisation proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << Organisation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d38875a3-1910-4839-ac25-ac44a02d0377")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Organisation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << Organisation >> then instantiate a {@link Organisation} proxy.
     * 
     * @return a {@link Organisation} proxy on the created {@link Class}.
     */
    @objid ("7de9675b-5802-4d27-bf8e-f201277031d9")
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
    @objid ("e0df5fa6-5731-401a-a407-1e0ee70056e3")
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
    @objid ("749ff532-0e1a-4ad5-8085-452a6436b242")
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
    @objid ("8be06362-756e-4def-85d7-69c3c67740aa")
    public void addCloudCredentials(final CloudCredentials obj) {
        if (obj!=null)
          ((Class) this.elt).getOwnedElement().add(obj.getElement());
    }

    @objid ("3c4ea773-d926-4e53-a6d3-b05d3595ec18")
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
    @objid ("21f7abe9-1737-4322-8433-20bff2919072")
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
    @objid ("6965d26f-c5b2-4034-a46d-75263cf0c5f7")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6d1e7fc1-0b9d-48ec-aa37-3e8fffc04a97")
    public String getEmail() {
        return this.elt.getTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d6126f15-ddf6-492a-a4b9-251df5b9b3fa")
    public String getPostalAddress() {
        return this.elt.getTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0b790af7-f605-4f4c-bc06-3ec9128f0574")
    public String getWww() {
        return this.elt.getTagValue(Organisation.MdaTypes.WWW_TAGTYPE_ELT);
    }

    @objid ("f21b20fa-0c1b-4271-a348-27734f0809b8")
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
    @objid ("efcd038a-b0a2-4c07-86ae-83069ea13e19")
    public boolean removeCloudCredentials(final CloudCredentials obj) {
        return (obj!=null)? ((Class) this.elt).getOwnedElement().remove(obj.getElement()) : false;
    }

    /**
     * Setter for string property 'email'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("930be787-4fa0-4e36-a65f-754112a0ff54")
    public void setEmail(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.EMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'postalAddress'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1f921613-ba66-4d52-b0e6-6725f837ddd5")
    public void setPostalAddress(final String value) {
        this.elt.putTagValue(Organisation.MdaTypes.POSTALADDRESS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'www'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0a55da71-873e-4408-90ea-d0bbfcf00fd9")
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

    @objid ("fc7da092-fbf8-4a5a-a07e-3cfcbe0d947d")
    protected Organisation(final Class elt) {
        super(elt);
    }

    @objid ("09128454-19e1-48ce-821e-ed57aa740679")
    public static final class MdaTypes {
        @objid ("a5d1dbcf-88f2-4dd1-ba0e-25a31d493770")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("541741c2-0aea-480d-8210-a4e0866ff1c1")
        public static TagType WWW_TAGTYPE_ELT;

        @objid ("a84e2eac-f72d-47d6-907b-a8d8762475b1")
        public static TagType POSTALADDRESS_TAGTYPE_ELT;

        @objid ("831a0b34-83f8-4941-b6a9-6e2d0eba8f21")
        public static TagType EMAIL_TAGTYPE_ELT;

        @objid ("fba31a87-b4bb-4c26-88c8-f3d663f724b7")
        private static Stereotype MDAASSOCDEP;

        @objid ("3fd4586a-60fd-4a0a-8faf-94c36a46e0b3")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("94f8bbdc-bf4c-4ae8-a213-29c16f174914")
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
