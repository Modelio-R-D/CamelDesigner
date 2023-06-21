/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("46af1c20-0ebb-4e9a-9e88-1b632cb7145e")
    public static final String STEREOTYPE_NAME = "ModelResourceFilter";

    @objid ("6cff8ce7-4d7f-44a4-a59b-cf15a84b99f8")
    public static final String EVERYINFORMATIONRESOURCE_TAGTYPE = "everyInformationResource";

    @objid ("6e827249-3332-47e5-b17b-05960d390c9d")
    public static final String INFORMATIONRESOURCEPATH_TAGTYPE = "informationResourcePath";

    /**
     * Tells whether a {@link ModelResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ModelResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f943c9a-aa63-4f9b-8816-70dd1ab60b87")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ModelResourceFilter >> then instantiate a {@link ModelResourceFilter} proxy.
     * 
     * @return a {@link ModelResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("71e50699-47cb-430b-88a2-9e5fba90ece9")
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
    @objid ("4129535d-185a-4cc4-9161-76d3427ec88b")
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
    @objid ("883d683b-bf43-49da-85ef-991510df1010")
    public static ModelResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ModelResourceFilter.canInstantiate(obj))
        	return new ModelResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ModelResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4c0bbc38-a3cb-4ce9-9211-608402916b17")
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
    @objid ("a4ee3a06-2a11-4e24-8143-5ed10973ead0")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("72366c5e-425e-4b1a-9e38-a59a8bfc2978")
    public String getInformationResourcePath() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT);
    }

    @objid ("d040eeca-6bf2-47f2-87e9-406d6f82a8cc")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f1ecb646-18cd-4356-a227-cdfbfa3aa552")
    public boolean isEveryInformationResource() {
        return this.elt.isTagged(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bbb5fb9f-9b50-4151-9d47-13c9dffa1021")
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
    @objid ("1a711948-1350-4384-bcdd-fa7ab983d77d")
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

    @objid ("a1c1793b-60b6-4047-af64-48fcd38dcf33")
    protected ModelResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bdba83c4-ef71-4797-8568-cbac9a6170f8")
    public static final class MdaTypes {
        @objid ("51acc139-aafb-4b26-a3bc-10154dc68cd6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("52d6f50f-dd65-4389-b575-2816acbb9279")
        public static TagType INFORMATIONRESOURCEPATH_TAGTYPE_ELT;

        @objid ("474535b2-df85-4158-a489-90157d7cffca")
        public static TagType EVERYINFORMATIONRESOURCE_TAGTYPE_ELT;

        @objid ("dec53766-370b-4965-bef3-e1eae4beeb0e")
        private static Stereotype MDAASSOCDEP;

        @objid ("3ed73856-6824-48f6-b0a7-31a2396fc393")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a91fbee5-ae33-4b8c-9ffb-1d4e517a5655")
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
