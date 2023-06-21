/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: CamelDesigner v1.0.16

 * This file was generated on 3/28/23 4:09 PM by Modelio Studio.
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
    @objid ("cf5f338f-4c2e-4265-9a70-7baaff0a74b8")
    public static final String STEREOTYPE_NAME = "Range";

    @objid ("efa34271-07d6-483d-82e2-dffd058526f8")
    public static final String ISLOWERLIMITINCLUDED_TAGTYPE = "isLowerLimitIncluded";

    @objid ("aa175d12-f6de-41d5-9c36-37b1880c9801")
    public static final String ISUPPERLIMITINCLUDED_TAGTYPE = "isUpperLimitIncluded";

    @objid ("4acfdd25-53bd-4f53-8140-632ae5e0aa15")
    public static final String LOWERLIMIT_TAGTYPE = "lowerLimit";

    @objid ("ad713e54-b4c9-45e7-9524-e9cdc37335b5")
    public static final String UPPERLIMIT_TAGTYPE = "upperLimit";

    @objid ("a61f2f61-40ef-40ea-a435-23e5eee03e2d")
    public static final String VALUELOWERLIMIT_TAGTYPE = "valueLowerLimit";

    @objid ("d32df90f-2392-4655-923f-a673d5808625")
    public static final String VALUEUPPERLIMIT_TAGTYPE = "valueUpperLimit";

    /**
     * Tells whether a {@link Range proxy} can be instantiated from a {@link MObject} checking it is a {@link DataType} stereotyped << Range >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("4f312012-9861-42b6-8550-0caa8d1abcb6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof DataType) && ((DataType) elt).isStereotyped(ICamelDesignerPeerModule.MODULE_NAME, Range.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link DataType} stereotyped << Range >> then instantiate a {@link Range} proxy.
     * 
     * @return a {@link Range} proxy on the created {@link DataType}.
     */
    @objid ("202a96ea-56a7-45b7-9748-612b57191480")
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
    @objid ("48dd1e0a-0192-40cd-ac05-dbdb701e0e9f")
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
    @objid ("860aa2fb-927b-4b1d-be17-ae23f86e3cf6")
    public static Range safeInstantiate(final DataType obj) throws IllegalArgumentException {
        if (Range.canInstantiate(obj))
        	return new Range(obj);
        else
        	throw new IllegalArgumentException("Range: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2b72b416-4299-41cc-8ed4-ba2ad00d7b05")
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
    @objid ("8d9401a0-5f4e-4bab-9d26-eb3a0f60ec72")
    @Override
    public DataType getElement() {
        return (DataType)super.getElement();
    }

    /**
     * Getter for string property 'lowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("37245e7d-eab3-4eeb-869e-243bbee3e199")
    public String getLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("bb54a8a6-e916-4b3f-b435-a2540a77b74b")
    public String getUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("76b4493b-02be-44f5-9dc0-a91698a23f98")
    public String getValueLowerLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("1db1d2fb-b5bc-4112-83ab-c71f91e8501a")
    public String getValueUpperLimit() {
        return this.elt.getTagValue(Range.MdaTypes.VALUEUPPERLIMIT_TAGTYPE_ELT);
    }

    @objid ("dc1e2388-a7a1-46e9-86ad-2c2b55fb7869")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("3d322aa9-1e30-4263-9a72-98bca42ffac3")
    public boolean isIsLowerLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISLOWERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'isUpperLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("cfd43fac-7883-4dfa-a2bb-afe21fa81c35")
    public boolean isIsUpperLimitIncluded() {
        return this.elt.isTagged(Range.MdaTypes.ISUPPERLIMITINCLUDED_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'isLowerLimitIncluded'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("ea1b6203-84bd-4c07-b7d4-d14fe94031cd")
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
    @objid ("a5d9c972-f5b0-4b84-9c45-816319d48590")
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
    @objid ("a47646d6-7eed-45d3-b974-d47d38cf00a1")
    public void setLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.LOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'upperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("4fb841c5-3e7b-4890-808d-bd21fba4eba6")
    public void setUpperLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.UPPERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueLowerLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("95630e23-7c12-4786-bd39-9f88674f50c7")
    public void setValueLowerLimit(final String value) {
        this.elt.putTagValue(Range.MdaTypes.VALUELOWERLIMIT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'valueUpperLimit'
     * <p>Property description:
     * <br/><i>null</i></p>
     */
    @objid ("b2a89f8f-9926-4193-8aa1-ac0bb1182bee")
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

    @objid ("31b3ee41-b431-4a4a-a15b-97d727bc00e2")
    protected Range(final DataType elt) {
        super(elt);
    }

    @objid ("f119cedf-8e67-4a07-b5a8-ffaf11158aa4")
    public static final class MdaTypes {
        @objid ("b071058d-cf72-47fb-87da-7cca6bb95df8")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e1c11969-11d1-4091-86fd-b75c07787eeb")
        public static TagType LOWERLIMIT_TAGTYPE_ELT;

        @objid ("d48174f9-3330-48dc-b8f3-76e53435d416")
        public static TagType UPPERLIMIT_TAGTYPE_ELT;

        @objid ("fd6814f2-e459-47d2-88f9-70c7fefe5519")
        public static TagType ISLOWERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("f0f175fc-b4bc-4dd5-8d5d-951b240fe21d")
        public static TagType VALUELOWERLIMIT_TAGTYPE_ELT;

        @objid ("0a0935e8-02bf-4e96-9d43-cea3ec729388")
        public static TagType ISUPPERLIMITINCLUDED_TAGTYPE_ELT;

        @objid ("4a71b452-0163-43e7-bb66-0901e3d673e5")
        public static TagType VALUEUPPERLIMIT_TAGTYPE_ELT;

        @objid ("043861b1-2eb2-4b5e-bdb5-31e4033d3497")
        private static Stereotype MDAASSOCDEP;

        @objid ("87a49a15-6b43-4c6a-9e25-c0a2001af913")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("1d5bff22-5ca9-4a17-89a8-e12c43586f16")
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
