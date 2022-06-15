/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.10

 * This file was generated on 4/27/22 11:51 AM by Modelio Studio.
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
    @objid ("29077d1d-f93e-49f3-ae17-96c9e38fadca")
    public static final String STEREOTYPE_NAME = "ModelResourceFilter";

    @objid ("358b5535-2ab1-4b08-832c-bf6845b147de")
    public static final String EVERYINFORMATIONRESOURCE_TAGTYPE = "everyInformationResource";

    @objid ("403f3c55-d1e3-4f92-8d73-e92ea0be717a")
    public static final String INFORMATIONRESOURCEPATH_TAGTYPE = "informationResourcePath";

    /**
     * Tells whether a {@link ModelResourceFilter proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ModelResourceFilter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d3177117-6acd-457b-984f-86914c6e7029")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ModelResourceFilter >> then instantiate a {@link ModelResourceFilter} proxy.
     * 
     * @return a {@link ModelResourceFilter} proxy on the created {@link Class}.
     */
    @objid ("39bfeb23-67de-477f-9445-be6d71cfde3f")
    public static ModelResourceFilter create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, ModelResourceFilter.STEREOTYPE_NAME);
        return ModelResourceFilter.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ModelResourceFilter} proxy from a {@link Class} stereotyped << ModelResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * 
     * @param obj a Class
     * @return a {@link ModelResourceFilter} proxy or <i>null</i>.
     */
    @objid ("70aa3045-daed-4758-ba7b-9c84fbfaed03")
    public static ModelResourceFilter instantiate(final Class obj) {
        return ModelResourceFilter.canInstantiate(obj) ? new ModelResourceFilter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ModelResourceFilter} proxy from a {@link Class} stereotyped << ModelResourceFilter >> checking its metaclass and its stereotype.
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * 
     * @param obj a {@link Class}
     * @return a {@link ModelResourceFilter} proxy.
     * @throws java.lang.IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("683d3fdb-81bb-435a-b302-b715e186f30e")
    public static ModelResourceFilter safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ModelResourceFilter.canInstantiate(obj))
            return new ModelResourceFilter(obj);
        else
            throw new IllegalArgumentException("ModelResourceFilter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("5a7d64f1-53de-4ade-ad84-84d79da1547a")
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
     * 
     * @return the Class represented by this proxy, never null.
     */
    @objid ("c9521f64-5cd7-4e1e-80f2-b555f2bbfc87")
    @Override
    public Class getElement() {
        return (Class)super.getElement();
    }

    /**
     * Getter for string property 'informationResourcePath'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("519a2921-008f-40af-a8ea-e9289858cca8")
    public String getInformationResourcePath() {
        return this.elt.getTagValue(ModelResourceFilter.MdaTypes.INFORMATIONRESOURCEPATH_TAGTYPE_ELT);
    }

    @objid ("3e99be49-3e01-40cb-bf20-813680355546")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("99e6962c-6939-4720-abe1-9f8c48328496")
    public boolean isEveryInformationResource() {
        return this.elt.isTagged(ModelResourceFilter.MdaTypes.EVERYINFORMATIONRESOURCE_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'everyInformationResource'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("452f23f1-fe43-49b7-8a6e-b20aa1910cfe")
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
    @objid ("d4b7b8d8-edab-49b3-9aff-ad485a65cb4c")
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

    @objid ("ae2541ab-015c-4df4-bbf4-7e912aceacba")
    protected ModelResourceFilter(final Class elt) {
        super(elt);
    }

    @objid ("bdba83c4-ef71-4797-8568-cbac9a6170f8")
    public static final class MdaTypes {
        @objid ("f5f6c0f0-686e-48a2-b04a-ddb2761e22ae")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("04ec8990-0fc8-460d-b375-2cf579ab1e3a")
        public static TagType INFORMATIONRESOURCEPATH_TAGTYPE_ELT;

        @objid ("4a7b0976-22da-4c7a-9f3d-e98c7ab2b570")
        public static TagType EVERYINFORMATIONRESOURCE_TAGTYPE_ELT;

        @objid ("4f213e25-370a-4b13-99a1-bea0f8e5e70c")
        private static Stereotype MDAASSOCDEP;

        @objid ("f36935c1-9d1a-4970-81fb-14a2de52029b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a7112f9d-7221-4cc2-b225-98a62821eb75")
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
