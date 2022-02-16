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
 * Proxy class to handle a {@link Class} with << ModelResourceFilter >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("e21f0be0-3d22-47e8-a054-ec23ac4f1d3f")
public class ModelResourceFilter extends ResourceFilter {
    @objid ("d2479747-ec76-4d95-91b8-7e816d0c71f7")
    public static final String STEREOTYPE_NAME = "ModelResourceFilter";

    @objid ("b9368b6a-291c-4a28-bdc9-6db107cb4297")
    public static final String EVERYINFORMATIONRESOURCE_TAGTYPE = "everyInformationResource";

    @objid ("1ba56457-8d62-4bd5-b29d-0350278425cd")
    public static final String INFORMATIONRESOURCEPATH_TAGTYPE = "informationResourcePath";

    /**
     * Tells whether a {@link ModelResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ModelResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("2a8e0aae-cabe-40c0-a955-1301bd606427")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ModelResourceFilter >> then instantiate a {@link ModelResourceFilter} proxy.
     * 
     * @return a {@link ModelResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("2655c208-579d-47c0-ab57-184fad17e2ca")
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
    @objid ("46d722f0-c932-4f98-968b-023dc6312dd6")
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
    @objid ("4a7c85aa-ef4f-4dbe-a81c-9cecc93a7fbc")
    public static ModelResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ModelResourceFilter.canInstantiate(obj))
        	return new ModelResourceFilter(obj);
        else
        	throw new IllegalArgumentException("ModelResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("682669b0-801d-4465-bd91-31a565c1cbf8")
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
    @objid ("e8ceb44b-862a-4b88-b665-17c7abf4a2bc")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2d5cf310-7c37-46fc-925d-3d30745bb99d")
    public String getEveryInformationResource() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("a22a8a6b-6cb4-4904-91f5-cd4d2e22e75d")
    public String getInformationResourcePath() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT);
    }

    @objid ("a10cc9c2-8d63-49df-b548-3465943d832c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3b7714f3-6dcc-4162-94e3-964d854701d7")
    public void setEveryInformationResource(final String value) {
        this.elt.putTagValue(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("04fad254-e01e-4101-8d5b-128dbb574ccd")
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

    @objid ("d9d7b4eb-29d1-4710-bbe5-7ac65fe0d67e")
    protected ModelResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bdba83c4-ef71-4797-8568-cbac9a6170f8")
    public static final class MdaTypes {
        @objid ("2ed14ebd-9e63-415a-adc2-f0fc9d4e91de")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("63e590d9-299e-4eba-9325-07ba7bf4457b")
        public static TagType INFORMATIONRESOURCEPATH_TAGTYPE_ELT;

        @objid ("66aedb5c-c4fc-4ee5-8046-cfbbaf725f8f")
        public static TagType EVERYINFORMATIONRESOURCE_TAGTYPE_ELT;

        @objid ("1157b5dd-89ca-40a1-8207-36834bb0a470")
        private static Stereotype MDAASSOCDEP;

        @objid ("322eb57d-d15a-4704-ba82-fd1251ddf1af")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("0628bea7-1e04-4ea9-a60b-a30fc50a0ef2")
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
