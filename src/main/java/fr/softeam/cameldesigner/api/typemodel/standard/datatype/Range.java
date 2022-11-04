/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.13

 * This file was generated on 10/19/22 4:24 PM by Modelio Studio.
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
    public static final String VALUEUPPERLIMIT_TAGTYPE = "valueUpperLimit";

    /**
     * Tells whether a {@link Range proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Range >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("d578dbf0-bc1a-44fc-b886-fa85f2ea187d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Range >> then instantiate a {@link Range} proxy.
     * 
     * @return a {@link Range} proxy on the created {@link DataType}.
     */
    @objid ("b92f8c8f-b634-40f0-8675-47c876409089")
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
    @objid ("37f29664-0769-43ca-b894-6af3573c1eb3")
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
    @objid ("cf9be0fa-f514-4f83-8635-08abce03f7fc")
    public static Range safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Range.canInstantiate(obj))
        	return new Range(obj);
        else
        	throw new IllegalArgumentException("Range: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("10a2e562-f6a3-4575-8632-0cd159e06f7d")
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
    @objid ("fb22b114-ff62-4568-8ed0-4ad2b33af710")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5f48b588-35d1-4b9e-8825-8f8a3f5fc653")
    public String getLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("885cd51d-ed5d-42ca-8279-542e5290ee93")
    public String getUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bd76faba-15ee-4fa2-aae9-40cf2fa31b4f")
    public String getValueLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("6029af55-f149-4bd3-a1c7-f7ba2834af2e")
    public String getValueUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUEUPPERLIMIT_TAGTYPE_ELT);
    }

    @objid ("c440eb95-34f5-453f-b209-2783f5511231")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3a1240c2-edd6-4a2c-96a7-e56506f583bd")
    public boolean isIsLowerLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'isUpperLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("5a4946cf-ed1e-4e3f-979c-019a2f7d61e1")
    public boolean isIsUpperLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("15dbb2d3-ac08-4598-b96b-b11c25a3a7d1")
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
    @objid ("97cc0866-a77f-4b0b-a8e6-87d7f48c97df")
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
    @objid ("238d9475-ecff-4306-ba33-bcad14a68ea7")
    public void setLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("668722ee-7a02-4084-8454-a6eefd09b39a")
    public void setUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("997f1d74-72aa-4c8c-9ca6-83f026dfd153")
    public void setValueLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("c8d39c9c-d202-464a-840e-5cc559fd2ce4")
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

    @objid ("d64bc82d-9421-4150-8209-2798eb7425eb")
    protected Range(final DataType elt) {
        super(elt);
    }

    @objid ("f119cedf-8e67-4a07-b5a8-ffaf11158aa4")
    public static final class MdaTypes {
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
