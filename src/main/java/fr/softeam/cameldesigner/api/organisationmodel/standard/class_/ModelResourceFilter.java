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
 * Proxy class to handle a {@link Class} with << ModelResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e21f0be0-3d22-47e8-a054-ec23ac4f1d3f")
public class ModelResourceFilter extends ResourceFilter {
<<<<<<< HEAD
    @objid ("87186378-731f-4414-a9f3-9b517f7b0744")
    public static final String STEREOTYPE_NAME = "ModelResourceFilter";

    @objid ("f295bc22-69ee-4506-98a5-ae6b7d487ae0")
    public static final String EVERYINFORMATIONRESOURCE_TAGTYPE = "everyInformationResource";

    @objid ("536f0203-454e-4427-a469-1653e3245606")
=======
    @objid ("d5745ac8-52e7-47d4-b16e-67a855f811bc")
    public static final String STEREOTYPE_NAME = "ModelResourceFilter";

    @objid ("1e13f914-720e-453f-a85d-25d87c6bfde4")
    public static final String EVERYINFORMATIONRESOURCE_TAGTYPE = "everyInformationResource";

    @objid ("8e734753-a74c-4a45-bac2-ff29a6ba82cf")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String INFORMATIONRESOURCEPATH_TAGTYPE = "informationResourcePath";

    /**
     * Tells whether a {@link ModelResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ModelResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("3f1968a4-6219-4847-9c0b-b0db2caef951")
=======
    @objid ("5c9edeed-9a87-4d08-9b29-adab140cd524")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ModelResourceFilter >> then instantiate a {@link ModelResourceFilter} proxy.
     * 
     * @return a {@link ModelResourceFilter} proxy on the created {@link Class}.
     */
<<<<<<< HEAD
    @objid ("7b2afc62-5787-42bd-ab46-54197c3c5fce")
=======
    @objid ("7ac2f5bb-4bb7-4764-bfe0-b6cc5c713388")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ModelResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME);
        return ModelResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ModelResourceFilter} proxy from a {@link Class} stereotyped << ModelResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ModelResourceFilter} proxy or <i>null</i>.
     */
<<<<<<< HEAD
    @objid ("564b3387-f27d-43b5-acac-69508b9edcd9")
=======
    @objid ("b7ec06e6-36f6-4ccf-b523-1cc5a0824644")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ModelResourceFilter instantiate(final Class obj) {
        return ModelResourceFilter.canInstantiate(obj) ? new ModelResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModelResourceFilter} proxy from a {@link Class} stereotyped << ModelResourceFilter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ModelResourceFilter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
<<<<<<< HEAD
    @objid ("86da0b26-9e7c-4cae-84b7-e930ffa69bf0")
=======
    @objid ("d3db9646-2658-4bc1-9a3b-a0ad87457d17")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static ModelResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ModelResourceFilter.canInstantiate(obj))
        	return new ModelResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ModelResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("31b0a040-3e44-4a33-973c-e61cf4cca15d")
=======
    @objid ("0ab26df4-e949-411a-abac-8fc7568782fd")
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
        ModelResourceFilter other = (ModelResourceFilter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("36d92471-e78d-4ffa-ab27-6f5b1560a712")
=======
    @objid ("9cf02f2b-3ff5-4310-a9cf-601201c2693d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("ecae814c-6fc1-4fa4-9604-10699ed668a0")
=======
    @objid ("fbfef254-fb58-4f92-ba62-e54c005ce792")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getInformationResourcePath() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("770c9374-46b3-4bb3-afe0-18d81d8a25d9")
=======
    @objid ("3011d6d4-94a9-4bf5-9738-a3a8ddf90c52")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("c1151dbe-6327-4a7a-9c18-581438fa134d")
=======
    @objid ("f1d71b6a-1e1c-4db7-aa9f-3d9f6c7b10b1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isEveryInformationResource() {
        return this.elt.isTagged(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("06511125-6734-4dfb-b434-20e581b352a8")
=======
    @objid ("b0b8669b-d3b7-4233-b98c-18d69dc40260")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setEveryInformationResource(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("6bf62a85-d7a0-4e8f-9d7c-0ba4c7c7a5b2")
=======
    @objid ("9d19ae06-d282-4dec-a7c8-714957625527")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setInformationResourcePath(final String value) {
        this.elt.putTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT, value);
    }

    @objid ("45f9d500-e3a4-4b22-ac9d-76b69f8e7132")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

<<<<<<< HEAD
    @objid ("3eca8f3d-c3c6-4bc0-81f2-84c642e61a61")
=======
    @objid ("1e7cdf7d-e48b-409f-8aca-8e6755f75f54")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected ModelResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bdba83c4-ef71-4797-8568-cbac9a6170f8")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("e5b0e91d-f03d-4d02-b9e2-6f535f0a01e4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("15d552ff-970a-4430-9080-0545bb6c3ea2")
        public static TagType INFORMATIONRESOURCEPATH_TAGTYPE_ELT;

        @objid ("09ccc4d5-b0e5-4be0-9e08-1d183001e3cd")
        public static TagType EVERYINFORMATIONRESOURCE_TAGTYPE_ELT;

        @objid ("6096ac6d-82d3-4357-bd04-f6f861bb791f")
        private static Stereotype MDAASSOCDEP;

        @objid ("4f485e37-d6ef-48e6-91fa-f5e05e8b0e26")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a7659197-d47e-4106-b53f-98940ebcd0d1")
=======
        @objid ("68773e27-00cf-49c3-a482-10bb21710671")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("649e16b3-b575-4ff8-ad25-e2fe555175ff")
        public static TagType INFORMATIONRESOURCEPATH_TAGTYPE_ELT;

        @objid ("7b311760-b97c-4bc9-895e-e35b6e592692")
        public static TagType EVERYINFORMATIONRESOURCE_TAGTYPE_ELT;

        @objid ("12bbfb8b-c534-4897-81b8-e3bc7ba433a1")
        private static Stereotype MDAASSOCDEP;

        @objid ("6cdb710f-09e3-4b04-968d-29975bfb2aa4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8e10f325-d953-428b-a77c-ca0cc1068e5b")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b2deaba4-8571-4400-b47d-f0a5b91b3149");
            INFORMATIONRESOURCEPATH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "cbea7d8d-42de-41a1-808c-4a3c6505d00f");
            EVERYINFORMATIONRESOURCE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bffb0548-bcf3-4966-9260-825f28edb4db");
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
