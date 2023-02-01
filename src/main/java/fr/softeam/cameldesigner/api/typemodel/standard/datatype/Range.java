/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

<<<<<<< HEAD
 * This file was generated on 1/25/23 3:26 PM by Modelio Studio.
=======
 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("8bbb02d7-fd05-4307-9978-ef517adce1af")
    public static final String STEREOTYPE_NAME = "Range";

    @objid ("c2c29320-ced3-4209-afd4-3a5a33ed8d12")
    public static final String ISLOWERLIMITINCLUDED_TAGTYPE = "isLowerLimitIncluded";

    @objid ("36395fe6-872c-44d3-900f-62b8f33a2105")
    public static final String ISUPPERLIMITINCLUDED_TAGTYPE = "isUpperLimitIncluded";

    @objid ("96f4662a-032b-4fd0-9456-9cbad73aa52f")
    public static final String LOWERLIMIT_TAGTYPE = "lowerLimit";

    @objid ("090e3d3e-2391-49d2-a038-529594f1da39")
    public static final String UPPERLIMIT_TAGTYPE = "upperLimit";

    @objid ("f7ba2564-3ad7-40bd-94bc-45f16f34561f")
    public static final String VALUELOWERLIMIT_TAGTYPE = "valueLowerLimit";

    @objid ("8ae468e2-57c9-4fca-9e65-537048599530")
=======
    @objid ("66ef4896-12f0-431e-989c-373561771daf")
    public static final String STEREOTYPE_NAME = "Range";

    @objid ("62fcbe33-e293-4df9-b5f5-6dd7cade56fc")
    public static final String ISLOWERLIMITINCLUDED_TAGTYPE = "isLowerLimitIncluded";

    @objid ("40476e5e-d1f4-49f9-9d36-078cb87e287b")
    public static final String ISUPPERLIMITINCLUDED_TAGTYPE = "isUpperLimitIncluded";

    @objid ("0e939877-ac3b-473b-89ba-4a22987e20e6")
    public static final String LOWERLIMIT_TAGTYPE = "lowerLimit";

    @objid ("d9d5f8b1-ca83-4ba5-a9ef-31b701439179")
    public static final String UPPERLIMIT_TAGTYPE = "upperLimit";

    @objid ("10a15251-e35e-430c-9fdf-68b7a621e551")
    public static final String VALUELOWERLIMIT_TAGTYPE = "valueLowerLimit";

    @objid ("29f3749f-5c48-460f-9dd4-b24c956daafb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static final String VALUEUPPERLIMIT_TAGTYPE = "valueUpperLimit";

    /**
     * Tells whether a {@link Range proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Range >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
<<<<<<< HEAD
    @objid ("3991a070-c06d-40cd-8425-ff6cc7da76b5")
=======
    @objid ("d578dbf0-bc1a-44fc-b886-fa85f2ea187d")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Range >> then instantiate a {@link Range} proxy.
     * 
     * @return a {@link Range} proxy on the created {@link DataType}.
     */
<<<<<<< HEAD
    @objid ("3027a655-a4cb-4638-b5e5-a4ad4a2c301a")
=======
    @objid ("b92f8c8f-b634-40f0-8675-47c876409089")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("ab2abf08-9a88-4785-8d58-a024ee3ec7cb")
=======
    @objid ("37f29664-0769-43ca-b894-6af3573c1eb3")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("37d7b9d5-5296-491f-99bd-642f4230198b")
=======
    @objid ("cf9be0fa-f514-4f83-8635-08abce03f7fc")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public static Range safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Range.canInstantiate(obj))
        	return new Range(obj);
        else
        	throw new IllegalArgumentException("Range: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

<<<<<<< HEAD
    @objid ("1711e4dd-b82e-47c3-82ef-22fd2f271853")
=======
    @objid ("10a2e562-f6a3-4575-8632-0cd159e06f7d")
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
        Range other = (Range) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link DataType}. 
     * @return the DataType represented by this proxy, never null.
     */
<<<<<<< HEAD
    @objid ("db65bbd4-4130-4cea-a8d2-071f04de28b9")
=======
    @objid ("fb22b114-ff62-4568-8ed0-4ad2b33af710")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("4fdd06f9-c757-4fb7-a522-bb8580460996")
=======
    @objid ("5f48b588-35d1-4b9e-8825-8f8a3f5fc653")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("dd6191ae-2ee4-4501-a4dc-06161e7b0244")
=======
    @objid ("885cd51d-ed5d-42ca-8279-542e5290ee93")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("696cf2d7-0816-436e-af08-b63812f1c6c4")
=======
    @objid ("bd76faba-15ee-4fa2-aae9-40cf2fa31b4f")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValueLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("da600981-444f-4c5e-b84d-f4c3b39351b8")
=======
    @objid ("6029af55-f149-4bd3-a1c7-f7ba2834af2e")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public String getValueUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUEUPPERLIMIT_TAGTYPE_ELT);
    }

<<<<<<< HEAD
    @objid ("6c6fa8d4-de90-46e3-ba09-64508e5191fc")
=======
    @objid ("c440eb95-34f5-453f-b209-2783f5511231")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("f7c6b76d-3565-4ca6-a22b-ac5208d291a6")
=======
    @objid ("3a1240c2-edd6-4a2c-96a7-e56506f583bd")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIsLowerLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'isUpperLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("61dc6a2d-4748-477c-822c-fff867e6df38")
=======
    @objid ("5a4946cf-ed1e-4e3f-979c-019a2f7d61e1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public boolean isIsUpperLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("bf1041d0-14d4-49b2-a46c-aab723906db6")
=======
    @objid ("15dbb2d3-ac08-4598-b96b-b11c25a3a7d1")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("992ed72d-f467-4b6b-ad1b-b69a40565676")
=======
    @objid ("97cc0866-a77f-4b0b-a8e6-87d7f48c97df")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
<<<<<<< HEAD
    @objid ("b77b4749-466e-4c18-81e8-f9b4a99b7f14")
=======
    @objid ("238d9475-ecff-4306-ba33-bcad14a68ea7")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("07e0bc05-6b26-4a0e-b0a9-b4b28fee3267")
=======
    @objid ("668722ee-7a02-4084-8454-a6eefd09b39a")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("45478f39-4978-4dfb-8fa3-52af2e8195ec")
=======
    @objid ("997f1d74-72aa-4c8c-9ca6-83f026dfd153")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    public void setValueLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
<<<<<<< HEAD
    @objid ("1fccfb80-c0a6-4cfa-85a1-337689ce4b7f")
=======
    @objid ("c8d39c9c-d202-464a-840e-5cc559fd2ce4")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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

<<<<<<< HEAD
    @objid ("4551ae08-bc5a-4c8b-ae50-dd0f00f359a2")
=======
    @objid ("d64bc82d-9421-4150-8209-2798eb7425eb")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
    protected Range(final DataType elt) {
        super(elt);
    }

    @objid ("f119cedf-8e67-4a07-b5a8-ffaf11158aa4")
    public static final class MdaTypes {
<<<<<<< HEAD
        @objid ("030541f6-9c3d-43bc-85de-6bff6bf39c9a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f71f35ab-98aa-40f5-ac30-11bec2703c03")
        public static TagType LOWERLIMIT_TAGTYPE_ELT;

        @objid ("ed36350c-47fd-412e-adcd-1735abcdf044")
        public static TagType UPPERLIMIT_TAGTYPE_ELT;

        @objid ("be7bd8d1-6be8-413a-87e3-19f4bc677f0e")
        public static TagType ISLOWERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("5328613d-9842-4bc0-9f05-f177c0929a98")
        public static TagType VALUELOWERLIMIT_TAGTYPE_ELT;

        @objid ("c1f981dc-a5ef-4bc4-ada7-82f88cc96c3b")
        public static TagType ISUPPERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("5daff01e-d806-42cd-ab7e-4ad22c5b129c")
        public static TagType VALUEUPPERLIMIT_TAGTYPE_ELT;

        @objid ("4be0e1ea-7e3f-40d3-ae28-20b35a11a857")
        private static Stereotype MDAASSOCDEP;

        @objid ("263aaac0-5676-473f-8f60-501b91cb1446")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("5f5e60a1-6406-433a-81ef-8b6a870a2808")
=======
        @objid ("5729af44-f46b-4ab9-a53a-27527e691b95")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("d86ec1a7-9e53-4b71-863d-911882619db7")
        public static TagType LOWERLIMIT_TAGTYPE_ELT;

        @objid ("243058ed-72ab-43f0-a256-232d92c2316a")
        public static TagType UPPERLIMIT_TAGTYPE_ELT;

        @objid ("e096954c-a0b7-41cb-a410-cf422696a844")
        public static TagType ISLOWERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("d410d6c9-772d-4fe7-9f9e-6778d4c6aa35")
        public static TagType VALUELOWERLIMIT_TAGTYPE_ELT;

        @objid ("48c82f3e-f359-4f76-a9ab-41c33532581f")
        public static TagType ISUPPERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("994b5a5b-b4d9-4409-8898-fa973611f877")
        public static TagType VALUEUPPERLIMIT_TAGTYPE_ELT;

        @objid ("0d8b5dfa-c6a5-453d-88b4-33d6fff825fb")
        private static Stereotype MDAASSOCDEP;

        @objid ("f97b3be3-2048-45d6-aeb9-2215b4ea16d6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d6cb87cb-c592-465c-a5cc-fc17812411c5")
>>>>>>> 9c44adba44776142ee16d43febeb7dda124a6cb5
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
