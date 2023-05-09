/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/16/23 3:21 PM by Modelio Studio.
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
    @objid ("5ce81fd7-c9cb-4e2a-a3a6-9225cbf58fe3")
    public static final String STEREOTYPE_NAME = "Range";

    @objid ("55f5db79-d0e7-4d2c-929d-8256204f807e")
    public static final String ISLOWERLIMITINCLUDED_TAGTYPE = "isLowerLimitIncluded";

    @objid ("9d749751-071a-4d16-af77-a2a382d776b8")
    public static final String ISUPPERLIMITINCLUDED_TAGTYPE = "isUpperLimitIncluded";

    @objid ("85d5dfc9-1626-4827-b371-2e813bb697f7")
    public static final String LOWERLIMIT_TAGTYPE = "lowerLimit";

    @objid ("aeccd016-1e8c-45e9-8d66-e78c70b4d49b")
    public static final String UPPERLIMIT_TAGTYPE = "upperLimit";

    @objid ("46a32e7c-fdfa-4991-a76c-02cfe7451c74")
    public static final String VALUELOWERLIMIT_TAGTYPE = "valueLowerLimit";

    @objid ("fe566134-b539-41e2-8dd1-5abc0b6eb9d7")
    public static final String VALUEUPPERLIMIT_TAGTYPE = "valueUpperLimit";

    /**
     * Tells whether a {@link Range proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Range >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("90202030-8b4f-456f-a552-672090f91deb")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Range >> then instantiate a {@link Range} proxy.
     * 
     * @return a {@link Range} proxy on the created {@link DataType}.
     */
    @objid ("8a3e06b4-62ce-4fcd-b47c-6742d5f4bb22")
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
    @objid ("d24cbadc-d52a-4ce4-8cf5-f85db3e5a844")
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
    @objid ("9e37e162-e96e-406a-8466-0810ea6fba95")
    public static Range safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Range.canInstantiate(obj))
        	return new Range(obj);
        else
        	throw new IllegalArgumentException("Range: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f8f1a856-8464-4066-ae34-733692f54e09")
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
    @objid ("2147e43e-2af1-4ff7-90c2-90ca2b687380")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1ec38b90-5da8-4948-a779-518f0be0f516")
    public String getLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("378cfb43-bf55-4489-ba35-13de89df757a")
    public String getUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c0814b32-4c17-495c-ae50-3582d3000e8c")
    public String getValueLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b8546b72-77e7-47c4-9568-ca4f58f9ea53")
    public String getValueUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUEUPPERLIMIT_TAGTYPE_ELT);
    }

    @objid ("3220cd31-2b39-49b9-8d2b-291f24b2ea4f")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("faa5944d-5a28-42e8-b11c-63f36bf32c56")
    public boolean isIsLowerLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'isUpperLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6ee9884a-bc8b-4f5e-99bd-3c0b36399d81")
    public boolean isIsUpperLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("51491dd9-ee71-45c4-b6c1-01998e68d72b")
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
    @objid ("2ccf8136-78d9-40a5-bec5-d04f6306b257")
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
    @objid ("1a6d9605-d52e-4b2e-a82e-43c02eda8724")
    public void setLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bcd82a2d-011d-4093-8a62-98073e43db79")
    public void setUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4d64b492-8169-471c-b19b-6f246140d89a")
    public void setValueLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("819fc983-42cd-4829-870b-076391fd7ab7")
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

    @objid ("d8cf7a2d-ae56-4fe6-af64-d7f8e8c01dc4")
    protected Range(final DataType elt) {
        super(elt);
    }

    @objid ("f119cedf-8e67-4a07-b5a8-ffaf11158aa4")
    public static final class MdaTypes {
        @objid ("4167af16-49e9-4072-a599-27b8aec3da10")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e3e8764e-635b-44a6-a9c0-1a1b38d3f041")
        public static TagType LOWERLIMIT_TAGTYPE_ELT;

        @objid ("5efb10e1-af13-42c9-a8b0-25a662d71adb")
        public static TagType UPPERLIMIT_TAGTYPE_ELT;

        @objid ("408e257e-d6eb-4c71-87b3-b0fb847b1e99")
        public static TagType ISLOWERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("460e5f1c-020a-4319-b61e-8f38dea01f3b")
        public static TagType VALUELOWERLIMIT_TAGTYPE_ELT;

        @objid ("55ccd0c9-7579-4f92-879a-5f3ad6c3e885")
        public static TagType ISUPPERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("6ce38afe-5ae0-4dc8-b66c-c2aa5f823400")
        public static TagType VALUEUPPERLIMIT_TAGTYPE_ELT;

        @objid ("85f9789a-e6f6-4fd7-b900-61a9fd20a9d6")
        private static Stereotype MDAASSOCDEP;

        @objid ("16335ed9-d1c3-4abd-a429-fa53806a8564")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a50dcda0-fb96-4439-8aa7-a09e64946423")
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
