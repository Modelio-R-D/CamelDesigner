/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.12

 * This file was generated on 7/21/22 2:51 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.metadatamodel.infrastructure.modelelement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import fr.softeam.cameldesigner.api.CamelDesignerProxyFactory;
import fr.softeam.cameldesigner.api.ICamelDesignerPeerModule;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.CamelElement;
import fr.softeam.cameldesigner.api.camelcore.infrastructure.modelelement.NamedElement;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attribute.MmsProperty;
import fr.softeam.cameldesigner.api.metadatamodel.standard.attributelink.MmsPropertyInstance;
import fr.softeam.cameldesigner.api.metadatamodel.standard.class_.MmsConcept;
import fr.softeam.cameldesigner.api.metadatamodel.standard.instance.MmsConceptInstance;
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
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link ModelElement} with << MmsObject >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("5b8e0066-83d4-4b26-bada-7dcae35d5e7d")
public abstract class MmsObject extends NamedElement {
    @objid ("f325a849-1c2d-4385-b588-98fa24c26fdf")
    public static final String STEREOTYPE_NAME = "MmsObject";

    @objid ("4325809d-0b14-40c0-ac1d-3a0886e62b77")
    public static final String ID_TAGTYPE = "id";

    @objid ("313bbcff-668b-4c8b-9925-5968988e8b6b")
    public static final String URI_TAGTYPE = "uri";

    /**
     * Tells whether a {@link MmsObject proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MmsObject >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("512d4d76-866f-4bf8-b29a-01b03dc2eb03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof ModelElement) && ((ModelElement) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, MmsObject.STEREOTYPE_NAME));
    }

    @objid ("279386c6-8a35-498a-9c8a-980cd5eb2e29")
    public static MmsObject instantiate(final ModelElement obj) {
        return MmsProperty.canInstantiate(obj) ?  MmsProperty.instantiate((Attribute)obj) :
            MmsConcept.canInstantiate(obj) ?  MmsConcept.instantiate((Class)obj) :
                MmsConceptInstance.canInstantiate(obj) ?  MmsConceptInstance.instantiate((Instance)obj) :
                    MmsPropertyInstance.canInstantiate(obj) ?  MmsPropertyInstance.instantiate((AttributeLink)obj) : null;
    }

    @objid ("7e3e3a3b-6f30-4089-9ce2-2f7c829c01de")
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
        MmsObject other = (MmsObject) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link ModelElement}. 
     * @return the ModelElement represented by this proxy, never null.
     */
    @objid ("345aff07-566f-4330-91ca-2383eee667e2")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c83b33dd-ed11-474a-8607-3a849b564efd")
    public String getId() {
        return this.elt.getTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2f50d93e-be42-432d-9e5d-965ba296382e")
    public String getUri() {
        return this.elt.getTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT);
    }

    @objid ("afaf1b8c-3a26-4176-b994-e8301c9a0a26")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("d78e226f-7da9-490b-b9e9-15b965ef2bb8")
    public void setId(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("190a6dd1-8ddd-4ea9-a4de-e67f4ca81322")
    public void setUri(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT, value);
    }

    @objid ("eba83ee7-f370-4b14-8163-eb080b29b872")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("fea31251-fcab-4723-8502-683066011e5e")
    protected MmsObject(final ModelElement elt) {
        super(elt);
    }

    @objid ("2f90ab01-c906-4902-9288-e931e22fb14d")
    public static final class MdaTypes {
        @objid ("00c986d3-4b22-4411-ba15-4e909e4cd2d7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e7927111-2e55-4542-a541-c188e52f5355")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("e755fe01-7505-4bfa-a6a5-662fc2453de1")
        public static TagType URI_TAGTYPE_ELT;

        @objid ("a73fb793-b6de-4709-96aa-b8a52d84927d")
        private static Stereotype MDAASSOCDEP;

        @objid ("49ea0ff3-3e9e-452c-9042-fcdcbda6914f")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("7b1e6d8a-b1df-4b76-8bd3-95c0f7fe1a6e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "907f72a5-eb52-4908-953e-7f9a66b9939d");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a139c9cf-4b74-454a-b4cd-b0363a008c40");
            URI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5cff0fda-7e85-46ea-af8b-de500c800a21");
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
