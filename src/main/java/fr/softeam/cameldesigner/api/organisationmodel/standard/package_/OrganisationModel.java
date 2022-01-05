/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.05

 * This file was generated on 11/24/21 6:53 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.organisationmodel.standard.package_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.CamelModel;
import fr.softeam.cameldesigner.api.camelcore.standard.package_.SubModel;
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
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Package} with << OrganisationModel >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("810daecb-641e-4da1-a7ce-19926a94c42e")
public class OrganisationModel extends SubModel {
    @objid ("586b1af3-4708-4922-9199-aa7e1e5bccc9")
    public static final String STEREOTYPE_NAME = "OrganisationModel";

    @objid ("75aa825e-7a75-4d2d-8d11-3c5c81535e6c")
    public static final String ORGANISATIONEMAIL_TAGTYPE = "organisationEmail";

    @objid ("9ec9b4c9-f113-410e-a70c-06faabf812f1")
    public static final String ORGANISATIONNAME_TAGTYPE = "organisationName";

    @objid ("cf10fd71-d19c-43cf-a853-dd1b769377fa")
    public static final String ORGANISATIONWEBSITE_TAGTYPE = "organisationWebsite";

    @objid ("0d27b45c-37f7-4715-90fe-4a090b0078c2")
    public static final String SECURITYLEVEL_TAGTYPE = "securityLevel";

    /**
     * Tells whether a {@link OrganisationModel proxy} can be instantiated from a {@link MObject} checking it is a {@link Package} stereotyped << OrganisationModel >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("58faa8f7-f344-453c-a11b-d7ec73f81571")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Package) && ((Package) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Package} stereotyped << OrganisationModel >> then instantiate a {@link OrganisationModel} proxy.
     * 
     * @return a {@link OrganisationModel} proxy on the created {@link Package}.
     */
    @objid ("1760958e-0fc8-4eaf-a83f-f2560edd795d")
    public static OrganisationModel create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Package");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, OrganisationModel.STEREOTYPE_NAME);
        return OrganisationModel.instantiate((Package)e);
    }

    /**
     * Tries to instantiate a {@link OrganisationModel} proxy from a {@link Package} stereotyped << OrganisationModel >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Package
     * @return a {@link OrganisationModel} proxy or <i>null</i>.
     */
    @objid ("019a8517-6655-4838-accd-b5a5db3fbcef")
    public static OrganisationModel instantiate(final Package obj) {
        return OrganisationModel.canInstantiate(obj) ? new OrganisationModel(obj) : null;
    }

    /**
     * Tries to instantiate a {@link OrganisationModel} proxy from a {@link Package} stereotyped << OrganisationModel >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Package}
     * @return a {@link OrganisationModel} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("3184ad98-e63c-478e-9517-ae9618b4ed6b")
    public static OrganisationModel safeInstantiate(final Package obj) throws IllegalArgumentException {
        if (OrganisationModel.canInstantiate(obj))
            return new OrganisationModel(obj);
        else
            throw new IllegalArgumentException("OrganisationModel: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("01cde8bd-b9ad-4780-b95a-9e3859530945")
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
        OrganisationModel other = (OrganisationModel) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the value to the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("ed96b43a-f873-49b7-b611-e490e953645c")
    public CamelModel getCamelModel() {
        return (CamelModel)CamelDesignerProxyFactory.instantiate(((Package) this.elt).getOwner(), CamelModel.STEREOTYPE_NAME);
    }

    /**
     * Get the underlying {@link Package}.
     * 
     * @return the Package represented by this proxy, never null.
     */
    @objid ("81555138-908a-4ad7-8025-d9295f83dc03")
    @Override
    public Package getElement() {
        return (Package)super.getElement();
    }

    /**
     * Getter for string property 'organisationEmail'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ad2b8696-2c25-4a84-8e09-b1c8b3b0f720")
    public String getOrganisationEmail() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f1c2922f-6e43-459a-9480-7a0e6aa3e2a3")
    public String getOrganisationName() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("43a76bc8-0aeb-456c-b1b4-1502ffc7a4f1")
    public String getOrganisationWebsite() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("e3cc3a7c-4df4-4738-9958-5fdae7492fbb")
    public String getSecurityLevel() {
        return this.elt.getTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT);
    }

    @objid ("a611dc9e-4b70-40bc-8e68-41cba1a62887")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Set the value of the 'camelModel' role.<p>
     * Role description:
     * null
     */
    @objid ("866f38e9-6f5a-44aa-9ab4-0115c6d1d98f")
    public void setCamelModel(final CamelModel obj) {
        ((Package) this.elt).setOwner((obj != null) ? obj.getElement() : null);
    }

    /**
     * Setter for string property 'organisationEmail'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("891f5c38-985f-4473-b536-68f6b1e501ab")
    public void setOrganisationEmail(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONEMAIL_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationName'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("127eb96c-333f-43ba-ab0a-cc938114c9bb")
    public void setOrganisationName(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONNAME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'organisationWebsite'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("7acb3ee7-b145-4d66-96ca-c64e8f88097e")
    public void setOrganisationWebsite(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.ORGANISATIONWEBSITE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'securityLevel'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("42312ae9-1df0-43a4-b4e7-21e35806e6be")
    public void setSecurityLevel(final String value) {
        this.elt.putTagValue(OrganisationModel.MdaTypes.SECURITYLEVEL_TAGTYPE_ELT, value);
    }

    @objid ("3ca63a5c-c2e4-47c0-9250-43c9da2f4e15")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        return result;
    }

    @objid ("d8bf1c57-921c-40d8-8726-dd923463c53a")
    protected OrganisationModel(final Package elt) {
        super(elt);
    }

    @objid ("eb1c285b-2873-4f8e-af1e-f7afc841bfe9")
    public static final class MdaTypes {
        @objid ("0a420b47-097e-4c17-b595-670a5f6c0a2a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("ef55f74a-2710-4a18-8af2-af5e22e59231")
        public static TagType ORGANISATIONNAME_TAGTYPE_ELT;

        @objid ("e0b7c7e0-948c-4752-9df8-23122ae62dfc")
        public static TagType ORGANISATIONEMAIL_TAGTYPE_ELT;

        @objid ("5902b33f-827a-40e0-8e52-0006a08f98ac")
        public static TagType ORGANISATIONWEBSITE_TAGTYPE_ELT;

        @objid ("bfa4e5c4-a91c-4142-8e65-07e85595f769")
        public static TagType SECURITYLEVEL_TAGTYPE_ELT;

        @objid ("db7b7315-c5d3-4aa6-9c88-edad9811b570")
        private static Stereotype MDAASSOCDEP;

        @objid ("f75a641d-67a0-4130-8bb4-6d8b37908008")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("2b6c2793-b244-49d7-b235-45ffe421415b")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "e44c4759-0924-40bc-95d9-3cf51944eccf");
            ORGANISATIONNAME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f8f457b3-49af-40e8-8af6-d2a7c8a961ae");
            ORGANISATIONEMAIL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9449c6de-b56a-409f-ad60-bb01d80d128e");
            ORGANISATIONWEBSITE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cd62f8b6-56da-4e63-b459-3bace5101527");
            SECURITYLEVEL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "faa375ab-b4ac-4c59-95c5-592a98011b70");
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
