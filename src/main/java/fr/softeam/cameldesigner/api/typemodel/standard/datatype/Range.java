/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/15/23 5:37 PM by Modelio Studio.
 */
package fr.softeam.cameldesigner.api.typemodel.standard.datatype;

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
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link DataType} with << Range >> stereotype.
 * <p>Stereotype description:
 * <br/><i>null</i></p>
 */
@objid ("b6624bb7-0982-4bff-af96-a190c5237803")
public class Range extends ValueType {
    @objid ("8e56361d-7519-4ea2-93cf-75d825a99b1c")
    public static final String STEREOTYPE_NAME = "Range";

    @objid ("2d081022-21c8-4720-a94e-94b1098739d7")
    public static final String ISLOWERLIMITINCLUDED_TAGTYPE = "isLowerLimitIncluded";

    @objid ("0518bd81-8103-49e5-8fac-45b4f0fdd2fd")
    public static final String ISUPPERLIMITINCLUDED_TAGTYPE = "isUpperLimitIncluded";

    @objid ("52663d79-5919-4dcc-bd8a-5677e5bcd3d6")
    public static final String LOWERLIMIT_TAGTYPE = "lowerLimit";

    @objid ("55635a68-a855-43a0-b50d-3872ffbd733e")
    public static final String UPPERLIMIT_TAGTYPE = "upperLimit";

    @objid ("f0ab5dd7-c3d5-48de-99ad-328253b24977")
    public static final String VALUELOWERLIMIT_TAGTYPE = "valueLowerLimit";

    @objid ("64da6ee4-790f-4588-a52f-6b2ac8aa796a")
    public static final String VALUEUPPERLIMIT_TAGTYPE = "valueUpperLimit";

    /**
     * Tells whether a {@link Range proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Range >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("5bb0a66e-8e71-4dbc-92e4-d3aa7e74c64b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Range >> then instantiate a {@link Range} proxy.
     * 
     * @return a {@link Range} proxy on the created {@link DataType}.
     */
    @objid ("4fe20a38-5318-461c-b14e-b58a33c3005f")
    public static Range create() {
        ModelElement e = (ModelElement)CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.DataType");
        e.addStereotype(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME);
        return Range.instantiate((DataType)e);
    }

    /**
     * Tries to instantiate a {@link Range} proxy from a {@link DataType} stereotyped << Range >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a DataType
     * @return a {@link Range} proxy or <i>null</i>.
     */
    @objid ("b784dfe0-4ff9-41d4-8744-878c9d6c4033")
    public static Range instantiate(final DataType obj) {
        return Range.canInstantiate(obj) ? new Range(obj) : null;
    }

    /**
     * Tries to instantiate a {@link Range} proxy from a {@link DataType} stereotyped << Range >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link DataType}
     * @return a {@link Range} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("e48ec8a2-d435-4033-ab2a-7c210f33714a")
    public static Range safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Range.canInstantiate(obj))
        	return new Range(obj);
        else
        	throw new IllegalArgumentException("Range: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ed485eb2-8fa6-4b26-8cf0-b3ca91e2f084")
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
        Range other = (Range) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
    @objid ("bdff0a75-b55c-41ac-a77d-a935e736baae")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bbe80e32-8157-4d0b-bd43-8b4d08388644")
    public String getLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("205584a7-9332-47a9-9ab1-e87e5b3f5cce")
    public String getUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f32d6fbb-42e6-4c43-af3e-df2248b93a48")
    public String getValueLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("812364b5-241a-462d-b248-8fef79a4f114")
    public String getValueUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUEUPPERLIMIT_TAGTYPE_ELT);
    }

    @objid ("a27aeada-04bd-4394-8bf7-fc8c8d91ca6d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("fdddd40a-8729-474c-ae73-6e53ebe75f22")
    public boolean isIsLowerLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'isUpperLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("2a3e2691-e505-49b2-bbf3-e0ed9060ae6d")
    public boolean isIsUpperLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3eaa2e69-d140-4172-b044-38d7f1bf0626")
    public void setIsLowerLimitIncluded(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isUpperLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("8ee645df-09b7-4cc5-85f1-40a31abd17dd")
    public void setIsUpperLimitIncluded(final boolean value) {
        if (value)
          CamelDesignerModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("54241147-851c-4d1b-b902-0b6bb0ba2515")
    public void setLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cd2a8494-9d8e-4b33-a3c0-17c0a69969c3")
    public void setUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("32c7b647-753a-4184-b7e4-837e6f866a83")
    public void setValueLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("f4f53bea-fbff-4f2e-8452-bf16be76bac1")
    public void setValueUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.VALUEUPPERLIMIT_TAGTYPE_ELT, value);
    }

    @objid ("61ff41d5-4aa8-49d0-bfe9-9825bf06ec39")
    @Override
    public List<CamelElement> getChilds() {
        List<CamelElement> result = new ArrayList<>();
        result.addAll(super.getChilds());
        return result;
    }

    @objid ("1f4c5fb4-2976-41a0-9e1b-d8f3e4c83588")
    protected Range(final DataType elt) {
        super(elt);
    }

    @objid ("f119cedf-8e67-4a07-b5a8-ffaf11158aa4")
    public static final class MdaTypes {
        @objid ("9c8d9607-d922-463f-8acb-db671e97155f")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c4cd6477-adf6-4a57-a1ca-30b8b1359a16")
        public static TagType LOWERLIMIT_TAGTYPE_ELT;

        @objid ("007454e4-1750-4789-abf7-f6dbed981427")
        public static TagType UPPERLIMIT_TAGTYPE_ELT;

        @objid ("1c1d027f-18f4-4557-ac10-5a34d31fcd53")
        public static TagType ISLOWERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("87aaadb3-f8ff-43bd-bf6f-998d91e0cd60")
        public static TagType VALUELOWERLIMIT_TAGTYPE_ELT;

        @objid ("4f1dcde6-1183-47bd-89bf-6114d84a4a21")
        public static TagType ISUPPERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("d4cb1920-a555-4251-8f6b-0a68921072e1")
        public static TagType VALUEUPPERLIMIT_TAGTYPE_ELT;

        @objid ("2f7c8343-ede7-4f4c-9461-600e99c676c3")
        private static Stereotype MDAASSOCDEP;

        @objid ("09d87faa-4bae-4c8a-bc42-05ad46e7a577")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("332ed90c-270e-4b37-a0e5-f83961060688")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "ea69f465-8f51-41c3-9c81-cc30270ea9cb");
            LOWERLIMIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f6f57467-6d1e-4bb7-9266-0e11d1e1c7dd");
            UPPERLIMIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8205fd1c-29b3-4558-954d-bd9f8cd79610");
            ISLOWERLIMITINCLUDED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "fa065213-ab3e-41d1-99aa-23ad310dd113");
            VALUELOWERLIMIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "1c8fb6a6-6fbc-4058-a9c9-55ab911e4dd7");
            ISUPPERLIMITINCLUDED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "d23c2bad-6b4d-4d68-835f-8ebf362b23ff");
            VALUEUPPERLIMIT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "f0b2fde4-925c-4491-8d36-6551c9dd7b7c");
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
