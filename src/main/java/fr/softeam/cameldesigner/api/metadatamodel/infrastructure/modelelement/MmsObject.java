/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("c4830d21-81e3-4a51-87c1-beb3c334a2c7")
    public static final String STEREOTYPE_NAME = "MmsObject";

    @objid ("13373371-986f-4497-a3c3-4dd63a121770")
    public static final String ID_TAGTYPE = "id";

    @objid ("cdccc649-fbce-4da0-8dbd-bcd0d226185e")
    public static final String IMPLEMENTED_TAGTYPE = "implemented";

    @objid ("1716c3aa-acee-4629-bbd7-5800655b8b60")
    public static final String URI_TAGTYPE = "uri";

    /**
     * Tells whether a {@link MmsObject proxy} can be instantiated from a {@link MObject} checking it is a {@link ModelElement} stereotyped << MmsObject >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("71ef95cc-147e-48b5-b1fe-7b83c1d7f75b")
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

    @objid ("72808aa5-f816-4696-bc46-16becccf4a64")
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
    @objid ("7d397199-bd41-481e-9faf-05f9012c003c")
    @Override
    public ModelElement getElement() {
        return (ModelElement)super.getElement();
    }

    /**
     * Getter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("485fc8ab-1feb-46e0-be55-0ad0d674191e")
    public String getId() {
        return this.elt.getTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("0095600f-e4c3-4f6d-b5bc-9320386ff142")
    public String getUri() {
        return this.elt.getTagValue(MmsObject.MdaTypes.URI_TAGTYPE_ELT);
    }

    @objid ("24a2b56f-fe98-4710-9215-dbf2b3434c75")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'implemented'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8d01802d-4586-41ca-b2a9-750b0b3154a4")
    public boolean isImplemented() {
        return this.elt.isTagged(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'id'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("18775e90-1919-4663-b032-4bb57bcb89ba")
    public void setId(final String value) {
        this.elt.putTagValue(MmsObject.MdaTypes.ID_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'implemented'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f2ea37a7-4979-48b2-9abc-d3b866131b44")
    public void setImplemented(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(MmsObject.MdaTypes.IMPLEMENTED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'uri'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("19a85a7b-b3f5-4491-bf7a-bcf87bd59150")
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

    @objid ("7f11c9f1-c017-48d0-8837-ac564e28f4fb")
    protected MmsObject(final ModelElement elt) {
        super(elt);
    }

    @objid ("2f90ab01-c906-4902-9288-e931e22fb14d")
    public static final class MdaTypes {
        @objid ("a6aaf639-cc6b-4700-a718-bbc87b50e5f8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("120c3b23-71de-457b-82d9-cc18b3c86f71")
        public static TagType ID_TAGTYPE_ELT;

        @objid ("1780de27-aa76-4cb7-a936-d30734647f94")
        public static TagType URI_TAGTYPE_ELT;

        @objid ("670537cf-123f-435f-9cca-2d1b732fa990")
        public static TagType IMPLEMENTED_TAGTYPE_ELT;

        @objid ("6aa70748-12d3-438b-82aa-805467839858")
        private static Stereotype MDAASSOCDEP;

        @objid ("229876b3-f75c-42be-880f-0ef2ba8b1e23")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a206ade5-d2ab-4d91-af14-ea622fdc9828")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "907f72a5-eb52-4908-953e-7f9a66b9939d");
            ID_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a139c9cf-4b74-454a-b4cd-b0363a008c40");
            URI_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "5cff0fda-7e85-46ea-af8b-de500c800a21");
            IMPLEMENTED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "ab13b830-a142-4532-b79b-6d25b71242e0");
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
